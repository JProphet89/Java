grammar clean_Lavanda;
thing:
	'Thing['(bag|client|item|laundry|quantity|type)* ']'
;


bag:	'Bag{'bagID 
	(',' '[' (bag_contains_item)* ']' )?'}'
;

bagID :
	 STRING
;
bag_contains_item:
	'{' 'contains' 'item' itemID'}';

client:	'Client{'clientID 
	(',' '[' (order)+
 ']' )?
	(',' '[' (client_owns_order)* ']' )?'}'
;

clientID :
	 STRING
;
client_owns_order:
	'{' 'owns' 'order' orderID'}';

order:	'Order{'orderID 
	(',' '[' (order_contains_bag)* ']' )?'}'
;

orderID :
	 STRING
;
order_contains_bag:
	'{' 'contains' 'bag' bagID'}';

item:	'Item{'itemID 
	(',' '[' (item_has_quantity)?(item_has_type)? ']' )?'}'
;

itemID :
	 STRING
;
item_has_quantity:
	'{' 'has' 'quantity' quantityID'}';
item_has_type:
	'{' 'has' 'type' typeID'}';

laundry:	'Laundry{'laundryID 
	(',' '[' (laundry_receives_order)* ']' )?'}'
;

laundryID :
	 STRING
;
laundry_receives_order:
	'{' 'receives' 'order' orderID'}';

quantity:	'Quantity{'quantityID '}'
;

quantityID :
	 STRING
;

type:	'Type{'typeID ('class' class)?('material' material)?('tinge' tinge)?'}'
;

typeID :
	 STRING
;
class:
	 STRING
;
material:
	 STRING
;
tinge:
	 STRING
;


ID  :	('a'..'z'|'A'..'Z'|'_'|'-') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;