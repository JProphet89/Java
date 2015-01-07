// $ANTLR 3.5.1 /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g 2014-07-02 00:11:53

import java.util.ArrayList;import Lavanda.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LavandaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "','", "'Bag{'", "'Client{'", "'Item{'", "'Laundry{'", 
		"'Order{'", "'Quantity{'", "'Thing['", "'Type{'", "'['", "']'", "'bag'", 
		"'class'", "'contains'", "'has'", "'item'", "'material'", "'order'", "'owns'", 
		"'quantity'", "'receives'", "'tinge'", "'type'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int HEX_DIGIT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int OCTAL_ESC=12;
	public static final int STRING=13;
	public static final int UNICODE_ESC=14;
	public static final int WS=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LavandaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LavandaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LavandaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g"; }


	 public ArrayList<Instances> instances=new ArrayList<>(); 


	public static class thing_return extends ParserRuleReturnScope {
		public Thing struct;
		public ArrayList<Instances> insta;
	};


	// $ANTLR start "thing"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:12:1: thing returns [Thing struct,ArrayList<Instances> insta] : 'Thing[' (p00= bag |p01= client |p02= item |p03= laundry |p04= quantity |p05= type )* ']' ;
	public final LavandaParser.thing_return thing() throws RecognitionException {
		LavandaParser.thing_return retval = new LavandaParser.thing_return();
		retval.start = input.LT(1);

		Bag p00 =null;
		Client p01 =null;
		Item p02 =null;
		Laundry p03 =null;
		Quantity p04 =null;
		Type p05 =null;


		retval.struct =new Thing();
		instances=new ArrayList<>();
		retval.insta =new ArrayList<>();

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:18:40: ( 'Thing[' (p00= bag |p01= client |p02= item |p03= laundry |p04= quantity |p05= type )* ']' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:20:2: 'Thing[' (p00= bag |p01= client |p02= item |p03= laundry |p04= quantity |p05= type )* ']'
			{
			match(input,23,FOLLOW_23_in_thing37); 
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:20:10: (p00= bag |p01= client |p02= item |p03= laundry |p04= quantity |p05= type )*
			loop1:
			while (true) {
				int alt1=7;
				switch ( input.LA(1) ) {
				case 17:
					{
					alt1=1;
					}
					break;
				case 18:
					{
					alt1=2;
					}
					break;
				case 19:
					{
					alt1=3;
					}
					break;
				case 20:
					{
					alt1=4;
					}
					break;
				case 22:
					{
					alt1=5;
					}
					break;
				case 24:
					{
					alt1=6;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:20:11: p00= bag
					{
					pushFollow(FOLLOW_bag_in_thing41);
					p00=bag();
					state._fsp--;

					retval.struct.bags.add(p00);
					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:21:4: p01= client
					{
					pushFollow(FOLLOW_client_in_thing50);
					p01=client();
					state._fsp--;

					retval.struct.clients.add(p01);
					}
					break;
				case 3 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:22:4: p02= item
					{
					pushFollow(FOLLOW_item_in_thing59);
					p02=item();
					state._fsp--;

					retval.struct.items.add(p02);
					}
					break;
				case 4 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:23:4: p03= laundry
					{
					pushFollow(FOLLOW_laundry_in_thing68);
					p03=laundry();
					state._fsp--;

					retval.struct.laundrys.add(p03);
					}
					break;
				case 5 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:24:4: p04= quantity
					{
					pushFollow(FOLLOW_quantity_in_thing77);
					p04=quantity();
					state._fsp--;

					retval.struct.quantitys.add(p04);
					}
					break;
				case 6 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:25:4: p05= type
					{
					pushFollow(FOLLOW_type_in_thing86);
					p05=type();
					state._fsp--;

					retval.struct.types.add(p05);
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,26,FOLLOW_26_in_thing92); 
			}

			retval.stop = input.LT(-1);

			retval.insta.addAll(instances);
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "thing"



	// $ANTLR start "bag"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:29:1: bag returns [Bag struct] : 'Bag{' bagID ( ',' '[' (item1= bag_contains_item )* ']' )? '}' ;
	public final Bag bag() throws RecognitionException {
		Bag struct = null;


		String item1 =null;
		String bagID1 =null;

			struct =new Bag();
		Instances i=new Instances();
		i.type="Bag";

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:36:2: ( 'Bag{' bagID ( ',' '[' (item1= bag_contains_item )* ']' )? '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:37:2: 'Bag{' bagID ( ',' '[' (item1= bag_contains_item )* ']' )? '}'
			{
			match(input,17,FOLLOW_17_in_bag113); 
			pushFollow(FOLLOW_bagID_in_bag114);
			bagID1=bagID();
			state._fsp--;

			struct.bagID=bagID1;i.name=bagID1.replaceAll(" ","_");
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:38:2: ( ',' '[' (item1= bag_contains_item )* ']' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==16) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:38:3: ',' '[' (item1= bag_contains_item )* ']'
					{
					match(input,16,FOLLOW_16_in_bag119); 
					match(input,25,FOLLOW_25_in_bag121); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:38:11: (item1= bag_contains_item )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==39) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:38:12: item1= bag_contains_item
							{
							pushFollow(FOLLOW_bag_contains_item_in_bag126);
							item1=bag_contains_item();
							state._fsp--;

							struct.item_contains.add(item1);i.objectproperties.add(new Objectproperties(item1.replaceAll(" ","_"),"contains"));
							}
							break;

						default :
							break loop2;
						}
					}

					match(input,26,FOLLOW_26_in_bag131); 
					}
					break;

			}

			match(input,40,FOLLOW_40_in_bag135); 
			}


			instances.add(i);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return struct;
	}
	// $ANTLR end "bag"



	// $ANTLR start "bagID"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:41:1: bagID returns [String value] : STRING ;
	public final String bagID() throws RecognitionException {
		String value = null;


		Token STRING2=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:41:28: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:42:3: STRING
			{
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_bagID148); 
			value =(STRING2!=null?STRING2.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "bagID"



	// $ANTLR start "bag_contains_item"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:44:1: bag_contains_item returns [String value] : '{' 'contains' 'item' itemID '}' ;
	public final String bag_contains_item() throws RecognitionException {
		String value = null;


		String itemID3 =null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:44:40: ( '{' 'contains' 'item' itemID '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:45:2: '{' 'contains' 'item' itemID '}'
			{
			match(input,39,FOLLOW_39_in_bag_contains_item160); 
			match(input,29,FOLLOW_29_in_bag_contains_item162); 
			match(input,31,FOLLOW_31_in_bag_contains_item164); 
			pushFollow(FOLLOW_itemID_in_bag_contains_item166);
			itemID3=itemID();
			state._fsp--;

			value =itemID3;
			match(input,40,FOLLOW_40_in_bag_contains_item169); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "bag_contains_item"



	// $ANTLR start "client"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:47:1: client returns [Client struct] : 'Client{' clientID ( ',' '[' (hi1_0= order )+ ']' )? ( ',' '[' (order1= client_owns_order )* ']' )? '}' ;
	public final Client client() throws RecognitionException {
		Client struct = null;


		Order hi1_0 =null;
		String order1 =null;
		String clientID4 =null;

			struct =new Client();
		Instances i=new Instances();
		i.type="Client";

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:54:2: ( 'Client{' clientID ( ',' '[' (hi1_0= order )+ ']' )? ( ',' '[' (order1= client_owns_order )* ']' )? '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:55:2: 'Client{' clientID ( ',' '[' (hi1_0= order )+ ']' )? ( ',' '[' (order1= client_owns_order )* ']' )? '}'
			{
			match(input,18,FOLLOW_18_in_client188); 
			pushFollow(FOLLOW_clientID_in_client189);
			clientID4=clientID();
			state._fsp--;

			struct.clientID=clientID4;i.name=clientID4.replaceAll(" ","_");
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:56:2: ( ',' '[' (hi1_0= order )+ ']' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==16) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==25) ) {
					int LA5_3 = input.LA(3);
					if ( (LA5_3==21) ) {
						alt5=1;
					}
				}
			}
			switch (alt5) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:56:3: ',' '[' (hi1_0= order )+ ']'
					{
					match(input,16,FOLLOW_16_in_client194); 
					match(input,25,FOLLOW_25_in_client196); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:56:11: (hi1_0= order )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==21) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:56:12: hi1_0= order
							{
							pushFollow(FOLLOW_order_in_client201);
							hi1_0=order();
							state._fsp--;

							struct.order.add(hi1_0);
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input,26,FOLLOW_26_in_client208); 
					}
					break;

			}

			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:58:2: ( ',' '[' (order1= client_owns_order )* ']' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==16) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:58:3: ',' '[' (order1= client_owns_order )* ']'
					{
					match(input,16,FOLLOW_16_in_client215); 
					match(input,25,FOLLOW_25_in_client217); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:58:11: (order1= client_owns_order )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==39) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:58:12: order1= client_owns_order
							{
							pushFollow(FOLLOW_client_owns_order_in_client222);
							order1=client_owns_order();
							state._fsp--;

							struct.order_owns.add(order1);i.objectproperties.add(new Objectproperties(order1.replaceAll(" ","_"),"owns"));
							}
							break;

						default :
							break loop6;
						}
					}

					match(input,26,FOLLOW_26_in_client227); 
					}
					break;

			}

			match(input,40,FOLLOW_40_in_client231); 
			}


			instances.add(i);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return struct;
	}
	// $ANTLR end "client"



	// $ANTLR start "clientID"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:61:1: clientID returns [String value] : STRING ;
	public final String clientID() throws RecognitionException {
		String value = null;


		Token STRING5=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:61:31: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:62:3: STRING
			{
			STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_clientID244); 
			value =(STRING5!=null?STRING5.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "clientID"



	// $ANTLR start "client_owns_order"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:64:1: client_owns_order returns [String value] : '{' 'owns' 'order' orderID '}' ;
	public final String client_owns_order() throws RecognitionException {
		String value = null;


		String orderID6 =null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:64:40: ( '{' 'owns' 'order' orderID '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:65:2: '{' 'owns' 'order' orderID '}'
			{
			match(input,39,FOLLOW_39_in_client_owns_order256); 
			match(input,34,FOLLOW_34_in_client_owns_order258); 
			match(input,33,FOLLOW_33_in_client_owns_order260); 
			pushFollow(FOLLOW_orderID_in_client_owns_order262);
			orderID6=orderID();
			state._fsp--;

			value =orderID6;
			match(input,40,FOLLOW_40_in_client_owns_order265); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "client_owns_order"



	// $ANTLR start "order"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:67:1: order returns [Order struct] : 'Order{' orderID ( ',' '[' (bag1= order_contains_bag )* ']' )? '}' ;
	public final Order order() throws RecognitionException {
		Order struct = null;


		String bag1 =null;
		String orderID7 =null;

			struct =new Order();
		Instances i=new Instances();
		i.type="Order";

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:74:2: ( 'Order{' orderID ( ',' '[' (bag1= order_contains_bag )* ']' )? '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:75:2: 'Order{' orderID ( ',' '[' (bag1= order_contains_bag )* ']' )? '}'
			{
			match(input,21,FOLLOW_21_in_order284); 
			pushFollow(FOLLOW_orderID_in_order285);
			orderID7=orderID();
			state._fsp--;

			struct.orderID=orderID7;i.name=orderID7.replaceAll(" ","_");
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:76:2: ( ',' '[' (bag1= order_contains_bag )* ']' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==16) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:76:3: ',' '[' (bag1= order_contains_bag )* ']'
					{
					match(input,16,FOLLOW_16_in_order290); 
					match(input,25,FOLLOW_25_in_order292); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:76:11: (bag1= order_contains_bag )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==39) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:76:12: bag1= order_contains_bag
							{
							pushFollow(FOLLOW_order_contains_bag_in_order297);
							bag1=order_contains_bag();
							state._fsp--;

							struct.bag_contains.add(bag1);i.objectproperties.add(new Objectproperties(bag1.replaceAll(" ","_"),"contains"));
							}
							break;

						default :
							break loop8;
						}
					}

					match(input,26,FOLLOW_26_in_order302); 
					}
					break;

			}

			match(input,40,FOLLOW_40_in_order306); 
			}


			instances.add(i);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return struct;
	}
	// $ANTLR end "order"



	// $ANTLR start "orderID"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:79:1: orderID returns [String value] : STRING ;
	public final String orderID() throws RecognitionException {
		String value = null;


		Token STRING8=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:79:30: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:80:3: STRING
			{
			STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_orderID319); 
			value =(STRING8!=null?STRING8.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "orderID"



	// $ANTLR start "order_contains_bag"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:82:1: order_contains_bag returns [String value] : '{' 'contains' 'bag' bagID '}' ;
	public final String order_contains_bag() throws RecognitionException {
		String value = null;


		String bagID9 =null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:82:41: ( '{' 'contains' 'bag' bagID '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:83:2: '{' 'contains' 'bag' bagID '}'
			{
			match(input,39,FOLLOW_39_in_order_contains_bag331); 
			match(input,29,FOLLOW_29_in_order_contains_bag333); 
			match(input,27,FOLLOW_27_in_order_contains_bag335); 
			pushFollow(FOLLOW_bagID_in_order_contains_bag337);
			bagID9=bagID();
			state._fsp--;

			value =bagID9;
			match(input,40,FOLLOW_40_in_order_contains_bag340); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "order_contains_bag"



	// $ANTLR start "item"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:85:1: item returns [Item struct] : 'Item{' itemID ( ',' '[' ( item_has_quantity )? ( item_has_type )? ']' )? '}' ;
	public final Item item() throws RecognitionException {
		Item struct = null;


		String itemID10 =null;

			struct =new Item();
		Instances i=new Instances();
		i.type="Item";

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:92:2: ( 'Item{' itemID ( ',' '[' ( item_has_quantity )? ( item_has_type )? ']' )? '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:93:2: 'Item{' itemID ( ',' '[' ( item_has_quantity )? ( item_has_type )? ']' )? '}'
			{
			match(input,19,FOLLOW_19_in_item359); 
			pushFollow(FOLLOW_itemID_in_item360);
			itemID10=itemID();
			state._fsp--;

			struct.itemID=itemID10;i.name=itemID10.replaceAll(" ","_");
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:94:2: ( ',' '[' ( item_has_quantity )? ( item_has_type )? ']' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==16) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:94:3: ',' '[' ( item_has_quantity )? ( item_has_type )? ']'
					{
					match(input,16,FOLLOW_16_in_item365); 
					match(input,25,FOLLOW_25_in_item367); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:94:11: ( item_has_quantity )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==39) ) {
						int LA10_1 = input.LA(2);
						if ( (LA10_1==30) ) {
							int LA10_3 = input.LA(3);
							if ( (LA10_3==35) ) {
								alt10=1;
							}
						}
					}
					switch (alt10) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:94:12: item_has_quantity
							{
							pushFollow(FOLLOW_item_has_quantity_in_item370);
							item_has_quantity();
							state._fsp--;

							struct.quantity_has.add($has_quantity.value);i.objectproperties.add(new Objectproperties($has_quantity.value.replaceAll(" ","_"),"has"));
							}
							break;

					}

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:94:176: ( item_has_type )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==39) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:94:177: item_has_type
							{
							pushFollow(FOLLOW_item_has_type_in_item375);
							item_has_type();
							state._fsp--;

							struct.type_has.add($has_type.value);i.objectproperties.add(new Objectproperties($has_type.value.replaceAll(" ","_"),"has"));
							}
							break;

					}

					match(input,26,FOLLOW_26_in_item380); 
					}
					break;

			}

			match(input,40,FOLLOW_40_in_item384); 
			}


			instances.add(i);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return struct;
	}
	// $ANTLR end "item"



	// $ANTLR start "itemID"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:97:1: itemID returns [String value] : STRING ;
	public final String itemID() throws RecognitionException {
		String value = null;


		Token STRING11=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:97:29: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:98:3: STRING
			{
			STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_itemID397); 
			value =(STRING11!=null?STRING11.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "itemID"



	// $ANTLR start "item_has_quantity"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:100:1: item_has_quantity returns [String value] : '{' 'has' 'quantity' quantityID '}' ;
	public final String item_has_quantity() throws RecognitionException {
		String value = null;


		String quantityID12 =null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:100:40: ( '{' 'has' 'quantity' quantityID '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:101:2: '{' 'has' 'quantity' quantityID '}'
			{
			match(input,39,FOLLOW_39_in_item_has_quantity409); 
			match(input,30,FOLLOW_30_in_item_has_quantity411); 
			match(input,35,FOLLOW_35_in_item_has_quantity413); 
			pushFollow(FOLLOW_quantityID_in_item_has_quantity415);
			quantityID12=quantityID();
			state._fsp--;

			value =quantityID12;
			match(input,40,FOLLOW_40_in_item_has_quantity418); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "item_has_quantity"



	// $ANTLR start "item_has_type"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:102:1: item_has_type returns [String value] : '{' 'has' 'type' typeID '}' ;
	public final String item_has_type() throws RecognitionException {
		String value = null;


		String typeID13 =null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:102:36: ( '{' 'has' 'type' typeID '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:103:2: '{' 'has' 'type' typeID '}'
			{
			match(input,39,FOLLOW_39_in_item_has_type428); 
			match(input,30,FOLLOW_30_in_item_has_type430); 
			match(input,38,FOLLOW_38_in_item_has_type432); 
			pushFollow(FOLLOW_typeID_in_item_has_type434);
			typeID13=typeID();
			state._fsp--;

			value =typeID13;
			match(input,40,FOLLOW_40_in_item_has_type437); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "item_has_type"



	// $ANTLR start "laundry"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:105:1: laundry returns [Laundry struct] : 'Laundry{' laundryID ( ',' '[' (order1= laundry_receives_order )* ']' )? '}' ;
	public final Laundry laundry() throws RecognitionException {
		Laundry struct = null;


		String order1 =null;
		String laundryID14 =null;

			struct =new Laundry();
		Instances i=new Instances();
		i.type="Laundry";

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:112:2: ( 'Laundry{' laundryID ( ',' '[' (order1= laundry_receives_order )* ']' )? '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:113:2: 'Laundry{' laundryID ( ',' '[' (order1= laundry_receives_order )* ']' )? '}'
			{
			match(input,20,FOLLOW_20_in_laundry456); 
			pushFollow(FOLLOW_laundryID_in_laundry457);
			laundryID14=laundryID();
			state._fsp--;

			struct.laundryID=laundryID14;i.name=laundryID14.replaceAll(" ","_");
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:114:2: ( ',' '[' (order1= laundry_receives_order )* ']' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==16) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:114:3: ',' '[' (order1= laundry_receives_order )* ']'
					{
					match(input,16,FOLLOW_16_in_laundry462); 
					match(input,25,FOLLOW_25_in_laundry464); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:114:11: (order1= laundry_receives_order )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==39) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:114:12: order1= laundry_receives_order
							{
							pushFollow(FOLLOW_laundry_receives_order_in_laundry469);
							order1=laundry_receives_order();
							state._fsp--;

							struct.order_receives.add(order1);i.objectproperties.add(new Objectproperties(order1.replaceAll(" ","_"),"receives"));
							}
							break;

						default :
							break loop13;
						}
					}

					match(input,26,FOLLOW_26_in_laundry474); 
					}
					break;

			}

			match(input,40,FOLLOW_40_in_laundry478); 
			}


			instances.add(i);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return struct;
	}
	// $ANTLR end "laundry"



	// $ANTLR start "laundryID"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:117:1: laundryID returns [String value] : STRING ;
	public final String laundryID() throws RecognitionException {
		String value = null;


		Token STRING15=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:117:32: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:118:3: STRING
			{
			STRING15=(Token)match(input,STRING,FOLLOW_STRING_in_laundryID491); 
			value =(STRING15!=null?STRING15.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "laundryID"



	// $ANTLR start "laundry_receives_order"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:120:1: laundry_receives_order returns [String value] : '{' 'receives' 'order' orderID '}' ;
	public final String laundry_receives_order() throws RecognitionException {
		String value = null;


		String orderID16 =null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:120:45: ( '{' 'receives' 'order' orderID '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:121:2: '{' 'receives' 'order' orderID '}'
			{
			match(input,39,FOLLOW_39_in_laundry_receives_order503); 
			match(input,36,FOLLOW_36_in_laundry_receives_order505); 
			match(input,33,FOLLOW_33_in_laundry_receives_order507); 
			pushFollow(FOLLOW_orderID_in_laundry_receives_order509);
			orderID16=orderID();
			state._fsp--;

			value =orderID16;
			match(input,40,FOLLOW_40_in_laundry_receives_order512); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "laundry_receives_order"



	// $ANTLR start "quantity"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:123:1: quantity returns [Quantity struct] : 'Quantity{' quantityID '}' ;
	public final Quantity quantity() throws RecognitionException {
		Quantity struct = null;


		String quantityID17 =null;

			struct =new Quantity();
		Instances i=new Instances();
		i.type="Quantity";

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:130:2: ( 'Quantity{' quantityID '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:131:2: 'Quantity{' quantityID '}'
			{
			match(input,22,FOLLOW_22_in_quantity531); 
			pushFollow(FOLLOW_quantityID_in_quantity532);
			quantityID17=quantityID();
			state._fsp--;

			struct.quantityID=quantityID17;i.name=quantityID17.replaceAll(" ","_");
			match(input,40,FOLLOW_40_in_quantity534); 
			}


			instances.add(i);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return struct;
	}
	// $ANTLR end "quantity"



	// $ANTLR start "quantityID"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:134:1: quantityID returns [String value] : STRING ;
	public final String quantityID() throws RecognitionException {
		String value = null;


		Token STRING18=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:134:33: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:135:3: STRING
			{
			STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_quantityID547); 
			value =(STRING18!=null?STRING18.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "quantityID"



	// $ANTLR start "type"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:138:1: type returns [Type struct] : 'Type{' typeID ( 'class' class )? ( 'material' material )? ( 'tinge' tinge )? '}' ;
	public final Type type() throws RecognitionException {
		Type struct = null;


		String typeID19 =null;
		String class20 =null;
		String material21 =null;
		String tinge22 =null;

			struct =new Type();
		Instances i=new Instances();
		i.type="Type";

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:145:2: ( 'Type{' typeID ( 'class' class )? ( 'material' material )? ( 'tinge' tinge )? '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:146:2: 'Type{' typeID ( 'class' class )? ( 'material' material )? ( 'tinge' tinge )? '}'
			{
			match(input,24,FOLLOW_24_in_type568); 
			pushFollow(FOLLOW_typeID_in_type569);
			typeID19=typeID();
			state._fsp--;

			struct.typeID=typeID19;i.name=typeID19.replaceAll(" ","_");
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:146:92: ( 'class' class )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==28) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:146:93: 'class' class
					{
					match(input,28,FOLLOW_28_in_type572); 
					pushFollow(FOLLOW_class_in_type574);
					class20=class();
					state._fsp--;

					struct.class=class20;i.dataproperties.add(new Dataproperties(class20,"class"));
					}
					break;

			}

			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:146:205: ( 'material' material )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==32) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:146:206: 'material' material
					{
					match(input,32,FOLLOW_32_in_type579); 
					pushFollow(FOLLOW_material_in_type581);
					material21=material();
					state._fsp--;

					struct.material=material21;i.dataproperties.add(new Dataproperties(material21,"material"));
					}
					break;

			}

			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:146:336: ( 'tinge' tinge )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==37) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:146:337: 'tinge' tinge
					{
					match(input,37,FOLLOW_37_in_type586); 
					pushFollow(FOLLOW_tinge_in_type588);
					tinge22=tinge();
					state._fsp--;

					struct.tinge=tinge22;i.dataproperties.add(new Dataproperties(tinge22,"tinge"));
					}
					break;

			}

			match(input,40,FOLLOW_40_in_type592); 
			}


			instances.add(i);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return struct;
	}
	// $ANTLR end "type"



	// $ANTLR start "typeID"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:149:1: typeID returns [String value] : STRING ;
	public final String typeID() throws RecognitionException {
		String value = null;


		Token STRING23=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:149:29: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:150:3: STRING
			{
			STRING23=(Token)match(input,STRING,FOLLOW_STRING_in_typeID605); 
			value =(STRING23!=null?STRING23.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "typeID"



	// $ANTLR start "class"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:152:1: class returns [String value] : STRING ;
	public final String class() throws RecognitionException {
		String value = null;


		Token STRING24=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:152:28: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:153:3: STRING
			{
			STRING24=(Token)match(input,STRING,FOLLOW_STRING_in_class618); 
			value =(STRING24!=null?STRING24.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "class"



	// $ANTLR start "material"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:155:1: material returns [String value] : STRING ;
	public final String material() throws RecognitionException {
		String value = null;


		Token STRING25=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:155:31: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:156:3: STRING
			{
			STRING25=(Token)match(input,STRING,FOLLOW_STRING_in_material631); 
			value =(STRING25!=null?STRING25.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "material"



	// $ANTLR start "tinge"
	// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:158:1: tinge returns [String value] : STRING ;
	public final String tinge() throws RecognitionException {
		String value = null;


		Token STRING26=null;

		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:158:28: ( STRING )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:159:3: STRING
			{
			STRING26=(Token)match(input,STRING,FOLLOW_STRING_in_tinge644); 
			value =(STRING26!=null?STRING26.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "tinge"

	// Delegated rules



	public static final BitSet FOLLOW_23_in_thing37 = new BitSet(new long[]{0x00000000055E0000L});
	public static final BitSet FOLLOW_bag_in_thing41 = new BitSet(new long[]{0x00000000055E0000L});
	public static final BitSet FOLLOW_client_in_thing50 = new BitSet(new long[]{0x00000000055E0000L});
	public static final BitSet FOLLOW_item_in_thing59 = new BitSet(new long[]{0x00000000055E0000L});
	public static final BitSet FOLLOW_laundry_in_thing68 = new BitSet(new long[]{0x00000000055E0000L});
	public static final BitSet FOLLOW_quantity_in_thing77 = new BitSet(new long[]{0x00000000055E0000L});
	public static final BitSet FOLLOW_type_in_thing86 = new BitSet(new long[]{0x00000000055E0000L});
	public static final BitSet FOLLOW_26_in_thing92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_bag113 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_bagID_in_bag114 = new BitSet(new long[]{0x0000010000010000L});
	public static final BitSet FOLLOW_16_in_bag119 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_bag121 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_bag_contains_item_in_bag126 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_26_in_bag131 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_bag135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_bagID148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_bag_contains_item160 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_bag_contains_item162 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_bag_contains_item164 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_itemID_in_bag_contains_item166 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_bag_contains_item169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_client188 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_clientID_in_client189 = new BitSet(new long[]{0x0000010000010000L});
	public static final BitSet FOLLOW_16_in_client194 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_client196 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_order_in_client201 = new BitSet(new long[]{0x0000000004200000L});
	public static final BitSet FOLLOW_26_in_client208 = new BitSet(new long[]{0x0000010000010000L});
	public static final BitSet FOLLOW_16_in_client215 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_client217 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_client_owns_order_in_client222 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_26_in_client227 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_client231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_clientID244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_client_owns_order256 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_client_owns_order258 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_client_owns_order260 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_orderID_in_client_owns_order262 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_client_owns_order265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_order284 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_orderID_in_order285 = new BitSet(new long[]{0x0000010000010000L});
	public static final BitSet FOLLOW_16_in_order290 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_order292 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_order_contains_bag_in_order297 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_26_in_order302 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_order306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_orderID319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_order_contains_bag331 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_order_contains_bag333 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_order_contains_bag335 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_bagID_in_order_contains_bag337 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_order_contains_bag340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_item359 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_itemID_in_item360 = new BitSet(new long[]{0x0000010000010000L});
	public static final BitSet FOLLOW_16_in_item365 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_item367 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_item_has_quantity_in_item370 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_item_has_type_in_item375 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_item380 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_item384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_itemID397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_item_has_quantity409 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_item_has_quantity411 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_item_has_quantity413 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_quantityID_in_item_has_quantity415 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_item_has_quantity418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_item_has_type428 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_item_has_type430 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_item_has_type432 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_typeID_in_item_has_type434 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_item_has_type437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_laundry456 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_laundryID_in_laundry457 = new BitSet(new long[]{0x0000010000010000L});
	public static final BitSet FOLLOW_16_in_laundry462 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_laundry464 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_laundry_receives_order_in_laundry469 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_26_in_laundry474 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_laundry478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_laundryID491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_laundry_receives_order503 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_laundry_receives_order505 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_laundry_receives_order507 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_orderID_in_laundry_receives_order509 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_laundry_receives_order512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_quantity531 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_quantityID_in_quantity532 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_quantity534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_quantityID547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_type568 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_typeID_in_type569 = new BitSet(new long[]{0x0000012110000000L});
	public static final BitSet FOLLOW_28_in_type572 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_class_in_type574 = new BitSet(new long[]{0x0000012100000000L});
	public static final BitSet FOLLOW_32_in_type579 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_material_in_type581 = new BitSet(new long[]{0x0000012000000000L});
	public static final BitSet FOLLOW_37_in_type586 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_tinge_in_type588 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_type592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_typeID605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_class618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_material631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_tinge644 = new BitSet(new long[]{0x0000000000000002L});
}
