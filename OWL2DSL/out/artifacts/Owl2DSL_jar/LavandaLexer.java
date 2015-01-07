// $ANTLR 3.5.1 /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g 2014-07-02 00:11:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LavandaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LavandaLexer() {} 
	public LavandaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LavandaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:2:7: ( ',' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:2:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:3:7: ( 'Bag{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:3:9: 'Bag{'
			{
			match("Bag{"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:4:7: ( 'Client{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:4:9: 'Client{'
			{
			match("Client{"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:5:7: ( 'Item{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:5:9: 'Item{'
			{
			match("Item{"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:6:7: ( 'Laundry{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:6:9: 'Laundry{'
			{
			match("Laundry{"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:7:7: ( 'Order{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:7:9: 'Order{'
			{
			match("Order{"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:8:7: ( 'Quantity{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:8:9: 'Quantity{'
			{
			match("Quantity{"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:9:7: ( 'Thing[' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:9:9: 'Thing['
			{
			match("Thing["); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:10:7: ( 'Type{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:10:9: 'Type{'
			{
			match("Type{"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:11:7: ( '[' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:11:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:12:7: ( ']' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:12:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:13:7: ( 'bag' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:13:9: 'bag'
			{
			match("bag"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:14:7: ( 'class' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:14:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:15:7: ( 'contains' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:15:9: 'contains'
			{
			match("contains"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:16:7: ( 'has' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:16:9: 'has'
			{
			match("has"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:17:7: ( 'item' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:17:9: 'item'
			{
			match("item"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:18:7: ( 'material' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:18:9: 'material'
			{
			match("material"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:19:7: ( 'order' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:19:9: 'order'
			{
			match("order"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:20:7: ( 'owns' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:20:9: 'owns'
			{
			match("owns"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:21:7: ( 'quantity' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:21:9: 'quantity'
			{
			match("quantity"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:22:7: ( 'receives' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:22:9: 'receives'
			{
			match("receives"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:23:7: ( 'tinge' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:23:9: 'tinge'
			{
			match("tinge"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:24:7: ( 'type' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:24:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:25:7: ( '{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:25:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:26:7: ( '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:26:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:163:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:163:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:163:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:166:5: ( ( '0' .. '9' )+ )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:166:7: ( '0' .. '9' )+
			{
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:166:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:170:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:170:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:170:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:170:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:170:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:171:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:171:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:171:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:174:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:174:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:182:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt13=3;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:182:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:182:9: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match('.'); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:182:25: ( '0' .. '9' )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop8;
						}
					}

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:182:37: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:182:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:183:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:183:13: ( '0' .. '9' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:183:25: ( EXPONENT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:183:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:184:9: ( '0' .. '9' )+ EXPONENT
					{
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:184:9: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:189:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:189:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:189:22: ( '+' | '-' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+'||LA14_0=='-') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:189:33: ( '0' .. '9' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:190:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:190:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:190:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\\') ) {
					alt16=1;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:190:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:190:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:193:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:193:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:193:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:193:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:193:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:198:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:202:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt18=1;
					}
					break;
				case 'u':
					{
					alt18=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt18=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:202:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:203:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:204:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:209:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
					int LA19_2 = input.LA(3);
					if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
						int LA19_4 = input.LA(4);
						if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						alt19=3;
					}

				}
				else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
					int LA19_3 = input.LA(3);
					if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
						alt19=2;
					}

					else {
						alt19=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:209:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:210:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:211:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:216:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:216:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | ID | INT | COMMENT | WS | FLOAT | STRING | CHAR )
		int alt20=32;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:70: T__26
				{
				mT__26(); 

				}
				break;
			case 12 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:76: T__27
				{
				mT__27(); 

				}
				break;
			case 13 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:82: T__28
				{
				mT__28(); 

				}
				break;
			case 14 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:88: T__29
				{
				mT__29(); 

				}
				break;
			case 15 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:94: T__30
				{
				mT__30(); 

				}
				break;
			case 16 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:100: T__31
				{
				mT__31(); 

				}
				break;
			case 17 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:106: T__32
				{
				mT__32(); 

				}
				break;
			case 18 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:112: T__33
				{
				mT__33(); 

				}
				break;
			case 19 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:118: T__34
				{
				mT__34(); 

				}
				break;
			case 20 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:124: T__35
				{
				mT__35(); 

				}
				break;
			case 21 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:130: T__36
				{
				mT__36(); 

				}
				break;
			case 22 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:136: T__37
				{
				mT__37(); 

				}
				break;
			case 23 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:142: T__38
				{
				mT__38(); 

				}
				break;
			case 24 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:148: T__39
				{
				mT__39(); 

				}
				break;
			case 25 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:154: T__40
				{
				mT__40(); 

				}
				break;
			case 26 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:160: ID
				{
				mID(); 

				}
				break;
			case 27 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:163: INT
				{
				mINT(); 

				}
				break;
			case 28 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:167: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 29 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:175: WS
				{
				mWS(); 

				}
				break;
			case 30 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:178: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 31 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:184: STRING
				{
				mSTRING(); 

				}
				break;
			case 32 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/out/artifacts/Owl2DSL_jar/Lavanda.g:1:191: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\2\56\3\uffff";
	static final String DFA13_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA13_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "181:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\2\uffff\7\26\2\uffff\11\26\3\uffff\1\61\5\uffff\24\26\1\uffff\10\26\1"+
		"\116\2\26\1\121\10\26\1\uffff\7\26\1\uffff\2\26\1\uffff\1\143\2\26\1\146"+
		"\3\26\1\152\1\26\1\uffff\4\26\1\uffff\1\160\1\26\1\uffff\1\26\1\163\1"+
		"\uffff\2\26\1\166\1\uffff\2\26\1\uffff\1\26\2\uffff\2\26\1\uffff\2\26"+
		"\2\uffff\6\26\1\uffff\1\26\1\u0085\1\u0086\1\u0087\1\u0088\5\uffff";
	static final String DFA20_eofS =
		"\u0089\uffff";
	static final String DFA20_minS =
		"\1\11\1\uffff\1\141\1\154\1\164\1\141\1\162\1\165\1\150\2\uffff\1\141"+
		"\1\154\1\141\1\164\1\141\1\162\1\165\1\145\1\151\3\uffff\1\56\5\uffff"+
		"\1\147\1\151\1\145\1\165\1\144\1\141\1\151\1\160\1\147\1\141\1\156\1\163"+
		"\1\145\1\164\1\144\1\156\1\141\1\143\1\156\1\160\1\uffff\1\173\1\145\1"+
		"\155\1\156\1\145\2\156\1\145\1\55\1\163\1\164\1\55\1\155\2\145\1\163\1"+
		"\156\1\145\1\147\1\145\1\uffff\1\156\1\173\1\144\1\162\1\164\1\147\1\173"+
		"\1\uffff\1\163\1\141\1\uffff\1\55\2\162\1\55\1\164\1\151\1\145\1\55\1"+
		"\164\1\uffff\1\162\1\173\1\151\1\133\1\uffff\1\55\1\151\1\uffff\1\151"+
		"\1\55\1\uffff\1\151\1\166\1\55\1\uffff\1\173\1\171\1\uffff\1\164\2\uffff"+
		"\1\156\1\141\1\uffff\1\164\1\145\2\uffff\1\173\1\171\1\163\1\154\1\171"+
		"\1\163\1\uffff\1\173\4\55\5\uffff";
	static final String DFA20_maxS =
		"\1\175\1\uffff\1\141\1\154\1\164\1\141\1\162\1\165\1\171\2\uffff\1\141"+
		"\1\157\1\141\1\164\1\141\1\167\1\165\1\145\1\171\3\uffff\1\145\5\uffff"+
		"\1\147\1\151\1\145\1\165\1\144\1\141\1\151\1\160\1\147\1\141\1\156\1\163"+
		"\1\145\1\164\1\144\1\156\1\141\1\143\1\156\1\160\1\uffff\1\173\1\145\1"+
		"\155\1\156\1\145\2\156\1\145\1\172\1\163\1\164\1\172\1\155\2\145\1\163"+
		"\1\156\1\145\1\147\1\145\1\uffff\1\156\1\173\1\144\1\162\1\164\1\147\1"+
		"\173\1\uffff\1\163\1\141\1\uffff\1\172\2\162\1\172\1\164\1\151\1\145\1"+
		"\172\1\164\1\uffff\1\162\1\173\1\151\1\133\1\uffff\1\172\1\151\1\uffff"+
		"\1\151\1\172\1\uffff\1\151\1\166\1\172\1\uffff\1\173\1\171\1\uffff\1\164"+
		"\2\uffff\1\156\1\141\1\uffff\1\164\1\145\2\uffff\1\173\1\171\1\163\1\154"+
		"\1\171\1\163\1\uffff\1\173\4\172\5\uffff";
	static final String DFA20_acceptS =
		"\1\uffff\1\1\7\uffff\1\12\1\13\11\uffff\1\30\1\31\1\32\1\uffff\1\34\1"+
		"\35\1\36\1\37\1\40\24\uffff\1\33\24\uffff\1\2\7\uffff\1\14\2\uffff\1\17"+
		"\11\uffff\1\4\4\uffff\1\11\2\uffff\1\20\2\uffff\1\23\3\uffff\1\27\2\uffff"+
		"\1\6\1\uffff\1\10\1\15\2\uffff\1\22\2\uffff\1\26\1\3\6\uffff\1\5\5\uffff"+
		"\1\7\1\16\1\21\1\24\1\25";
	static final String DFA20_specialS =
		"\u0089\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\33\4\uffff\1\34\4\uffff\1"+
			"\1\1\26\1\32\1\30\12\27\7\uffff\1\26\1\2\1\3\5\26\1\4\2\26\1\5\2\26\1"+
			"\6\1\26\1\7\2\26\1\10\6\26\1\11\1\uffff\1\12\1\uffff\1\26\1\uffff\1\26"+
			"\1\13\1\14\4\26\1\15\1\16\3\26\1\17\1\26\1\20\1\26\1\21\1\22\1\26\1\23"+
			"\6\26\1\24\1\uffff\1\25",
			"",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43\20\uffff\1\44",
			"",
			"",
			"\1\45",
			"\1\46\2\uffff\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53\4\uffff\1\54",
			"\1\55",
			"\1\56",
			"\1\57\17\uffff\1\60",
			"",
			"",
			"",
			"\1\32\1\uffff\12\27\13\uffff\1\32\37\uffff\1\32",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\117",
			"\1\120",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"",
			"\1\141",
			"\1\142",
			"",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\144",
			"\1\145",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\153",
			"",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\161",
			"",
			"\1\162",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\1\164",
			"\1\165",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\1\167",
			"\1\170",
			"",
			"\1\171",
			"",
			"",
			"\1\172",
			"\1\173",
			"",
			"\1\174",
			"\1\175",
			"",
			"",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\u0084",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | ID | INT | COMMENT | WS | FLOAT | STRING | CHAR );";
		}
	}

}
