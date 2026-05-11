// $ANTLR 3.5.2 CAP.g 2026-05-11 22:06:13

package org.tzi.use.examplePlugin.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CAPLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AT=4;
	public static final int ATTRIBUTES=5;
	public static final int BOOLEAN=6;
	public static final int CLASS=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int END=10;
	public static final int EQ=11;
	public static final int IDENT=12;
	public static final int LBRACE=13;
	public static final int LPAREN=14;
	public static final int NUMBER=15;
	public static final int QUALIFIED_IDENT=16;
	public static final int RBRACE=17;
	public static final int RPAREN=18;
	public static final int STRING=19;
	public static final int WS=20;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CAPLexer() {} 
	public CAPLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CAPLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "CAP.g"; }

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:175:12: ( 'class' )
			// CAP.g:175:14: 'class'
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
	// $ANTLR end "CLASS"

	// $ANTLR start "ATTRIBUTES"
	public final void mATTRIBUTES() throws RecognitionException {
		try {
			int _type = ATTRIBUTES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:176:12: ( 'attributes' )
			// CAP.g:176:14: 'attributes'
			{
			match("attributes"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATTRIBUTES"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:177:12: ( 'end' )
			// CAP.g:177:14: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:179:9: ( '@' )
			// CAP.g:179:11: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:180:9: ( '(' )
			// CAP.g:180:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:181:9: ( ')' )
			// CAP.g:181:11: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:182:9: ( '{' )
			// CAP.g:182:11: '{'
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
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:183:9: ( '}' )
			// CAP.g:183:11: '}'
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
	// $ANTLR end "RBRACE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:184:9: ( ',' )
			// CAP.g:184:11: ','
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
	// $ANTLR end "COMMA"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:185:9: ( '=' )
			// CAP.g:185:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:186:9: ( ':' )
			// CAP.g:186:11: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:189:5: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// CAP.g:189:7: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// CAP.g:190:7: 'false'
					{
					match("false"); 

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
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:194:5: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// CAP.g:194:7: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// CAP.g:194:7: ( '-' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='-') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// CAP.g:194:7: '-'
					{
					match('-'); 
					}
					break;

			}

			// CAP.g:194:12: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// CAP.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// CAP.g:194:24: ( '.' ( '0' .. '9' )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='.') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// CAP.g:194:25: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// CAP.g:194:29: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// CAP.g:
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
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "QUALIFIED_IDENT"
	public final void mQUALIFIED_IDENT() throws RecognitionException {
		try {
			int _type = QUALIFIED_IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:198:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* ( '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )+ )
			// CAP.g:198:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* ( '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// CAP.g:199:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='.'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// CAP.g:
					{
					if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop6;
				}
			}

			// CAP.g:200:7: ( '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==':') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// CAP.g:200:8: '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
					{
					match("::"); 

					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// CAP.g:202:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='.'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// CAP.g:
							{
							if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUALIFIED_IDENT"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:207:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )
			// CAP.g:207:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// CAP.g:208:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='.'||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// CAP.g:
					{
					if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop9;
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
	// $ANTLR end "IDENT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:212:5: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' . )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\'' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\"') ) {
				alt12=1;
			}
			else if ( (LA12_0=='\'') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// CAP.g:212:7: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' . )* '\"'
					{
					match('\"'); 
					// CAP.g:212:11: (~ ( '\"' | '\\\\' ) | '\\\\' . )*
					loop10:
					while (true) {
						int alt10=3;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}
						else if ( (LA10_0=='\\') ) {
							alt10=2;
						}

						switch (alt10) {
						case 1 :
							// CAP.g:212:13: ~ ( '\"' | '\\\\' )
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
						case 2 :
							// CAP.g:212:29: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}
							break;

						default :
							break loop10;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// CAP.g:213:7: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\''
					{
					match('\''); 
					// CAP.g:213:12: (~ ( '\\'' | '\\\\' ) | '\\\\' . )*
					loop11:
					while (true) {
						int alt11=3;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '\u0000' && LA11_0 <= '&')||(LA11_0 >= '(' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
							alt11=1;
						}
						else if ( (LA11_0=='\\') ) {
							alt11=2;
						}

						switch (alt11) {
						case 1 :
							// CAP.g:213:14: ~ ( '\\'' | '\\\\' )
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
						case 2 :
							// CAP.g:213:31: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}
							break;

						default :
							break loop11;
						}
					}

					match('\''); 
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
	// $ANTLR end "STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:217:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// CAP.g:217:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// CAP.g:217:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// CAP.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// CAP.g:1:8: ( CLASS | ATTRIBUTES | END | AT | LPAREN | RPAREN | LBRACE | RBRACE | COMMA | EQ | COLON | BOOLEAN | NUMBER | QUALIFIED_IDENT | IDENT | STRING | WS )
		int alt14=17;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// CAP.g:1:10: CLASS
				{
				mCLASS(); 

				}
				break;
			case 2 :
				// CAP.g:1:16: ATTRIBUTES
				{
				mATTRIBUTES(); 

				}
				break;
			case 3 :
				// CAP.g:1:27: END
				{
				mEND(); 

				}
				break;
			case 4 :
				// CAP.g:1:31: AT
				{
				mAT(); 

				}
				break;
			case 5 :
				// CAP.g:1:34: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 6 :
				// CAP.g:1:41: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 7 :
				// CAP.g:1:48: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 8 :
				// CAP.g:1:55: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 9 :
				// CAP.g:1:62: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 10 :
				// CAP.g:1:68: EQ
				{
				mEQ(); 

				}
				break;
			case 11 :
				// CAP.g:1:71: COLON
				{
				mCOLON(); 

				}
				break;
			case 12 :
				// CAP.g:1:77: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 13 :
				// CAP.g:1:85: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 14 :
				// CAP.g:1:92: QUALIFIED_IDENT
				{
				mQUALIFIED_IDENT(); 

				}
				break;
			case 15 :
				// CAP.g:1:108: IDENT
				{
				mIDENT(); 

				}
				break;
			case 16 :
				// CAP.g:1:114: STRING
				{
				mSTRING(); 

				}
				break;
			case 17 :
				// CAP.g:1:121: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\1\uffff\3\25\10\uffff\2\25\1\uffff\1\25\2\uffff\2\25\2\uffff\6\25\1\41"+
		"\4\25\1\uffff\1\46\1\25\1\50\1\25\1\uffff\1\46\1\uffff\4\25\1\56\1\uffff";
	static final String DFA14_eofS =
		"\57\uffff";
	static final String DFA14_minS =
		"\1\11\3\56\10\uffff\2\56\1\uffff\1\56\2\uffff\2\56\2\uffff\13\56\1\uffff"+
		"\4\56\1\uffff\1\56\1\uffff\5\56\1\uffff";
	static final String DFA14_maxS =
		"\1\175\3\172\10\uffff\2\172\1\uffff\1\172\2\uffff\2\172\2\uffff\13\172"+
		"\1\uffff\4\172\1\uffff\1\172\1\uffff\5\172\1\uffff";
	static final String DFA14_acceptS =
		"\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\15\1\uffff\1\20"+
		"\1\21\2\uffff\1\16\1\17\13\uffff\1\3\4\uffff\1\14\1\uffff\1\1\5\uffff"+
		"\1\2";
	static final String DFA14_specialS =
		"\57\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\1\uffff\1\20\4\uffff\1\20\1\5\1\6\2"+
			"\uffff\1\11\1\16\2\uffff\12\16\1\13\2\uffff\1\12\2\uffff\1\4\32\17\4"+
			"\uffff\1\17\1\uffff\1\2\1\17\1\1\1\17\1\3\1\15\15\17\1\14\6\17\1\7\1"+
			"\uffff\1\10",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\13\23\1"+
			"\22\16\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1"+
			"\26\6\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\15\23\1"+
			"\27\14\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1"+
			"\30\10\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\1\31\31"+
			"\23",
			"",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\1\32\31"+
			"\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1"+
			"\33\6\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\3\23\1\34"+
			"\26\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\24\23\1"+
			"\35\5\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\13\23\1"+
			"\36\16\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1"+
			"\37\7\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1"+
			"\40\10\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\42"+
			"\25\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1"+
			"\43\7\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1"+
			"\44\7\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1"+
			"\45\21\23",
			"",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\47"+
			"\25\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\1\23\1\51"+
			"\30\23",
			"",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\24\23\1"+
			"\52\5\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1"+
			"\53\6\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\54"+
			"\25\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1"+
			"\55\7\23",
			"\1\23\1\uffff\12\23\1\24\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CLASS | ATTRIBUTES | END | AT | LPAREN | RPAREN | LBRACE | RBRACE | COMMA | EQ | COLON | BOOLEAN | NUMBER | QUALIFIED_IDENT | IDENT | STRING | WS );";
		}
	}

}
