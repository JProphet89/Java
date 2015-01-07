grammar Lavanda;

@option{ 
	language=Java;
}
@header{
import java.util.ArrayList;import Lavanda.*;
}
@parser::members{
 public ArrayList<Instances> instances=new ArrayList<>(); 
}
thing returns[Thing struct,ArrayList<Instances> insta]
@init{
$thing.struct=new Thing();
instances=new ArrayList<>();
$thing.insta=new ArrayList<>();
}
@after{$thing.insta.addAll(instances);}:

	'Thing['(p00=bag {$thing.struct.bags.add($p00.struct);}
	| p01=client {$thing.struct.clients.add($p01.struct);}
	| p02=item {$thing.struct.items.add($p02.struct);}
	| p03=laundry {$thing.struct.laundrys.add($p03.struct);}
	| p04=quantity {$thing.struct.quantitys.add($p04.struct);}
	| p05=type {$thing.struct.types.add($p05.struct);})* ']'
;


bag returns[Bag struct]
@init{	$bag.struct=new Bag();
Instances i=new Instances();
i.type="Bag";
}
@after{
instances.add(i);
}:
	'Bag{'bagID{$bag.struct.bagID=$bagID.value;i.name=$bagID.value.replaceAll(" ","_");}
	(',' '[' (item1=bag_contains_item{$bag.struct.item_contains.add($item1.value);i.objectproperties.add(new Objectproperties($item1.value.replaceAll(" ","_"),"contains"));})* ']' )?'}'
;

bagID returns[String value]:
	 STRING{$bagID.value=$STRING.text;}
;
bag_contains_item returns[String value]:
	'{' 'contains' 'item' itemID{$bag_contains_item.value=$itemID.value;} '}';

client returns[Client struct]
@init{	$client.struct=new Client();
Instances i=new Instances();
i.type="Client";
}
@after{
instances.add(i);
}:
	'Client{'clientID{$client.struct.clientID=$clientID.value;i.name=$clientID.value.replaceAll(" ","_");}
	(',' '[' (hi1_0=order {$client.struct.order.add($hi1_0.struct);})+
 ']' )?
	(',' '[' (order1=client_owns_order{$client.struct.order_owns.add($order1.value);i.objectproperties.add(new Objectproperties($order1.value.replaceAll(" ","_"),"owns"));})* ']' )?'}'
;

clientID returns[String value]:
	 STRING{$clientID.value=$STRING.text;}
;
client_owns_order returns[String value]:
	'{' 'owns' 'order' orderID{$client_owns_order.value=$orderID.value;} '}';

order returns[Order struct]
@init{	$order.struct=new Order();
Instances i=new Instances();
i.type="Order";
}
@after{
instances.add(i);
}:
	'Order{'orderID{$order.struct.orderID=$orderID.value;i.name=$orderID.value.replaceAll(" ","_");}
	(',' '[' (bag1=order_contains_bag{$order.struct.bag_contains.add($bag1.value);i.objectproperties.add(new Objectproperties($bag1.value.replaceAll(" ","_"),"contains"));})* ']' )?'}'
;

orderID returns[String value]:
	 STRING{$orderID.value=$STRING.text;}
;
order_contains_bag returns[String value]:
	'{' 'contains' 'bag' bagID{$order_contains_bag.value=$bagID.value;} '}';

item returns[Item struct]
@init{	$item.struct=new Item();
Instances i=new Instances();
i.type="Item";
}
@after{
instances.add(i);
}:
	'Item{'itemID{$item.struct.itemID=$itemID.value;i.name=$itemID.value.replaceAll(" ","_");}
	(',' '[' (item_has_quantity{$item.struct.quantity_has.add($has_quantity.value);i.objectproperties.add(new Objectproperties($has_quantity.value.replaceAll(" ","_"),"has"));})?(item_has_type{$item.struct.type_has.add($has_type.value);i.objectproperties.add(new Objectproperties($has_type.value.replaceAll(" ","_"),"has"));})? ']' )?'}'
;

itemID returns[String value]:
	 STRING{$itemID.value=$STRING.text;}
;
item_has_quantity returns[String value]:
	'{' 'has' 'quantity' quantityID{$item_has_quantity.value=$quantityID.value;} '}';
item_has_type returns[String value]:
	'{' 'has' 'type' typeID{$item_has_type.value=$typeID.value;} '}';

laundry returns[Laundry struct]
@init{	$laundry.struct=new Laundry();
Instances i=new Instances();
i.type="Laundry";
}
@after{
instances.add(i);
}:
	'Laundry{'laundryID{$laundry.struct.laundryID=$laundryID.value;i.name=$laundryID.value.replaceAll(" ","_");}
	(',' '[' (order1=laundry_receives_order{$laundry.struct.order_receives.add($order1.value);i.objectproperties.add(new Objectproperties($order1.value.replaceAll(" ","_"),"receives"));})* ']' )?'}'
;

laundryID returns[String value]:
	 STRING{$laundryID.value=$STRING.text;}
;
laundry_receives_order returns[String value]:
	'{' 'receives' 'order' orderID{$laundry_receives_order.value=$orderID.value;} '}';

quantity returns[Quantity struct]
@init{	$quantity.struct=new Quantity();
Instances i=new Instances();
i.type="Quantity";
}
@after{
instances.add(i);
}:
	'Quantity{'quantityID{$quantity.struct.quantityID=$quantityID.value;i.name=$quantityID.value.replaceAll(" ","_");}'}'
;

quantityID returns[String value]:
	 STRING{$quantityID.value=$STRING.text;}
;

type returns[Type struct]
@init{	$type.struct=new Type();
Instances i=new Instances();
i.type="Type";
}
@after{
instances.add(i);
}:
	'Type{'typeID{$type.struct.typeID=$typeID.value;i.name=$typeID.value.replaceAll(" ","_");}('class' class{$type.struct.class=$class.value;i.dataproperties.add(new Dataproperties($class.value,"class"));})?('material' material{$type.struct.material=$material.value;i.dataproperties.add(new Dataproperties($material.value,"material"));})?('tinge' tinge{$type.struct.tinge=$tinge.value;i.dataproperties.add(new Dataproperties($tinge.value,"tinge"));})?'}'
;

typeID returns[String value]:
	 STRING{$typeID.value=$STRING.text;}
;
class returns[String value]:
	 STRING{$class.value=$STRING.text;}
;
material returns[String value]:
	 STRING{$material.value=$STRING.text;}
;
tinge returns[String value]:
	 STRING{$tinge.value=$STRING.text;}
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