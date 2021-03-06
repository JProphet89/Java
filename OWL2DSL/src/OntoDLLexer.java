// $ANTLR 3.5.1 /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g 2014-05-12 00:51:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OntoDLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
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
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int HEX_DIGIT=7;
	public static final int ID=8;
	public static final int INT=9;
	public static final int OCTAL_ESC=10;
	public static final int STRING=11;
	public static final int UNICODE_ESC=12;
	public static final int WS=13;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public OntoDLLexer() {} 
	public OntoDLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public OntoDLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:2:7: ( ')' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:2:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:3:7: ( ',' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:3:9: ','
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:4:7: ( ',Description(' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:4:9: ',Description('
			{
			match(",Description("); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:5:7: ( '>' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:5:9: '>'
			{
			match('>'); 
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:6:7: ( 'Attributes[' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:6:9: 'Attributes['
			{
			match("Attributes["); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:7:7: ( 'Concepts[' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:7:9: 'Concepts['
			{
			match("Concepts["); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:8:7: ( 'Description(' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:8:9: 'Description('
			{
			match("Description("); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:9:7: ( 'Hierarchies[' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:9:9: 'Hierarchies['
			{
			match("Hierarchies["); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:10:7: ( 'Links[' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:10:9: 'Links['
			{
			match("Links["); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:11:7: ( 'Ontology{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:11:9: 'Ontology{'
			{
			match("Ontology{"); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:12:7: ( 'Relations[' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:12:9: 'Relations['
			{
			match("Relations["); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:13:7: ( ']' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:13:9: ']'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:14:7: ( 'boolean' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:14:9: 'boolean'
			{
			match("boolean"); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:15:7: ( 'float' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:15:9: 'float'
			{
			match("float"); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:16:7: ( 'int' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:16:9: 'int'
			{
			match("int"); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:17:7: ( 'max' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:17:9: 'max'
			{
			match("max"); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:18:7: ( 'min' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:18:9: 'min'
			{
			match("min"); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:19:7: ( 'string' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:19:9: 'string'
			{
			match("string"); 

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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:20:7: ( '{' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:20:9: '{'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:21:7: ( '}' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:21:9: '}'
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
	// $ANTLR end "T__33"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:207:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:207:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:207:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:210:5: ( ( '0' .. '9' )+ )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:210:7: ( '0' .. '9' )+
			{
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:210:7: ( '0' .. '9' )+
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
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:214:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:214:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:214:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:
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

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:214:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:214:28: '\\r'
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
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:215:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:215:14: ( options {greedy=false; } : . )*
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
							// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:215:42: .
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:218:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:218:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:226:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:226:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:226:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\\') ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:226:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:226:24: ~ ( '\\\\' | '\"' )
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
					break loop7;
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:229:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:229:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:229:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\\') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:229:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:229:25: ~ ( '\\'' | '\\\\' )
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:234:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:238:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
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
					alt9=1;
					}
					break;
				case 'u':
					{
					alt9=2;
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
					alt9=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:238:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:239:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:240:9: OCTAL_ESC
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:245:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				int LA10_1 = input.LA(2);
				if ( ((LA10_1 >= '0' && LA10_1 <= '3')) ) {
					int LA10_2 = input.LA(3);
					if ( ((LA10_2 >= '0' && LA10_2 <= '7')) ) {
						int LA10_4 = input.LA(4);
						if ( ((LA10_4 >= '0' && LA10_4 <= '7')) ) {
							alt10=1;
						}

						else {
							alt10=2;
						}

					}

					else {
						alt10=3;
					}

				}
				else if ( ((LA10_1 >= '4' && LA10_1 <= '7')) ) {
					int LA10_3 = input.LA(3);
					if ( ((LA10_3 >= '0' && LA10_3 <= '7')) ) {
						alt10=2;
					}

					else {
						alt10=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:245:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:246:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:247:9: '\\\\' ( '0' .. '7' )
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
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:252:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:252:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | COMMENT | WS | STRING | CHAR )
		int alt11=26;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:16: T__15
				{
				mT__15(); 

				}
				break;
			case 3 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:22: T__16
				{
				mT__16(); 

				}
				break;
			case 4 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:28: T__17
				{
				mT__17(); 

				}
				break;
			case 5 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:34: T__18
				{
				mT__18(); 

				}
				break;
			case 6 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:40: T__19
				{
				mT__19(); 

				}
				break;
			case 7 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:46: T__20
				{
				mT__20(); 

				}
				break;
			case 8 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:52: T__21
				{
				mT__21(); 

				}
				break;
			case 9 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:58: T__22
				{
				mT__22(); 

				}
				break;
			case 10 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:64: T__23
				{
				mT__23(); 

				}
				break;
			case 11 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:70: T__24
				{
				mT__24(); 

				}
				break;
			case 12 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:76: T__25
				{
				mT__25(); 

				}
				break;
			case 13 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:82: T__26
				{
				mT__26(); 

				}
				break;
			case 14 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:88: T__27
				{
				mT__27(); 

				}
				break;
			case 15 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:94: T__28
				{
				mT__28(); 

				}
				break;
			case 16 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:100: T__29
				{
				mT__29(); 

				}
				break;
			case 17 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:106: T__30
				{
				mT__30(); 

				}
				break;
			case 18 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:112: T__31
				{
				mT__31(); 

				}
				break;
			case 19 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:118: T__32
				{
				mT__32(); 

				}
				break;
			case 20 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:124: T__33
				{
				mT__33(); 

				}
				break;
			case 21 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:130: ID
				{
				mID(); 

				}
				break;
			case 22 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:133: INT
				{
				mINT(); 

				}
				break;
			case 23 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:137: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 24 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:145: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:148: STRING
				{
				mSTRING(); 

				}
				break;
			case 26 :
				// /Users/jprophet89/masterthesisdoc/Owl2DSL/src/OntoDL.g:1:155: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\2\uffff\1\32\1\uffff\7\23\1\uffff\5\23\12\uffff\26\23\1\76\1\77\1\100"+
		"\12\23\3\uffff\11\23\1\124\5\23\1\uffff\3\23\1\uffff\1\135\6\23\1\144"+
		"\1\uffff\6\23\1\uffff\1\23\1\uffff\2\23\1\uffff\4\23\2\uffff\2\23\2\uffff";
	static final String DFA11_eofS =
		"\164\uffff";
	static final String DFA11_minS =
		"\1\11\1\uffff\1\104\1\uffff\1\164\1\157\1\145\2\151\1\156\1\145\1\uffff"+
		"\1\157\1\154\1\156\1\141\1\164\12\uffff\1\164\1\156\1\163\1\145\1\156"+
		"\1\164\1\154\2\157\1\164\1\170\1\156\2\162\2\143\1\162\1\153\1\157\1\141"+
		"\1\154\1\141\3\55\2\151\1\145\1\162\1\141\1\163\1\154\1\164\1\145\1\164"+
		"\3\uffff\1\156\1\142\1\160\1\151\1\162\1\133\1\157\1\151\1\141\1\55\1"+
		"\147\1\165\1\164\1\160\1\143\1\uffff\1\147\1\157\1\156\1\uffff\1\55\1"+
		"\164\1\163\1\164\1\150\1\171\1\156\1\55\1\uffff\1\145\1\133\2\151\1\173"+
		"\1\163\1\uffff\1\163\1\uffff\1\157\1\145\1\uffff\2\133\1\156\1\163\2\uffff"+
		"\1\50\1\133\2\uffff";
	static final String DFA11_maxS =
		"\1\175\1\uffff\1\104\1\uffff\1\164\1\157\1\145\2\151\1\156\1\145\1\uffff"+
		"\1\157\1\154\1\156\1\151\1\164\12\uffff\1\164\1\156\1\163\1\145\1\156"+
		"\1\164\1\154\2\157\1\164\1\170\1\156\2\162\2\143\1\162\1\153\1\157\1\141"+
		"\1\154\1\141\3\172\2\151\1\145\1\162\1\141\1\163\1\154\1\164\1\145\1\164"+
		"\3\uffff\1\156\1\142\1\160\1\151\1\162\1\133\1\157\1\151\1\141\1\172\1"+
		"\147\1\165\1\164\1\160\1\143\1\uffff\1\147\1\157\1\156\1\uffff\1\172\1"+
		"\164\1\163\1\164\1\150\1\171\1\156\1\172\1\uffff\1\145\1\133\2\151\1\173"+
		"\1\163\1\uffff\1\163\1\uffff\1\157\1\145\1\uffff\2\133\1\156\1\163\2\uffff"+
		"\1\50\1\133\2\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\7\uffff\1\14\5\uffff\1\23\1\24\1\25\1\26\1\27"+
		"\1\30\1\31\1\32\1\3\1\2\43\uffff\1\17\1\20\1\21\17\uffff\1\11\3\uffff"+
		"\1\16\10\uffff\1\22\6\uffff\1\15\1\uffff\1\6\2\uffff\1\12\4\uffff\1\13"+
		"\1\5\2\uffff\1\7\1\10";
	static final String DFA11_specialS =
		"\164\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\uffff\1\27\4\uffff\1\30\1\uffff\1"+
			"\1\2\uffff\1\2\1\23\1\uffff\1\25\12\24\4\uffff\1\3\2\uffff\1\4\1\23\1"+
			"\5\1\6\3\23\1\7\3\23\1\10\2\23\1\11\2\23\1\12\10\23\2\uffff\1\13\1\uffff"+
			"\1\23\1\uffff\1\23\1\14\3\23\1\15\2\23\1\16\3\23\1\17\5\23\1\20\7\23"+
			"\1\21\1\uffff\1\22",
			"",
			"\1\31",
			"",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45\7\uffff\1\46",
			"\1\47",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
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
			"\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"",
			"",
			"",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"",
			"\1\153",
			"",
			"\1\154",
			"\1\155",
			"",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"",
			"",
			"\1\162",
			"\1\163",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
