// $ANTLR 3.5.2 CAP.g 2026-03-07 20:44:13

package org.tzi.use.examplePlugin.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CAPLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AT=4;
	public static final int COMMA=5;
	public static final int EQ=6;
	public static final int IDENT=7;
	public static final int LBRACE=8;
	public static final int LPAREN=9;
	public static final int NUMBER=10;
	public static final int QUALIFIED_IDENT=11;
	public static final int RBRACE=12;
	public static final int RPAREN=13;
	public static final int STRING=14;
	public static final int WS=15;

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

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:111:9: ( '@' )
			// CAP.g:111:11: '@'
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
			// CAP.g:112:9: ( '(' )
			// CAP.g:112:11: '('
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
			// CAP.g:113:9: ( ')' )
			// CAP.g:113:11: ')'
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
			// CAP.g:114:9: ( '{' )
			// CAP.g:114:11: '{'
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
			// CAP.g:115:9: ( '}' )
			// CAP.g:115:11: '}'
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
			// CAP.g:116:9: ( ',' )
			// CAP.g:116:11: ','
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
			// CAP.g:117:9: ( '=' )
			// CAP.g:117:11: '='
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

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:120:5: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// CAP.g:120:7: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// CAP.g:120:7: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// CAP.g:120:7: '-'
					{
					match('-'); 
					}
					break;

			}

			// CAP.g:120:12: ( '0' .. '9' )+
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// CAP.g:120:24: ( '.' ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// CAP.g:120:25: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// CAP.g:120:29: ( '0' .. '9' )+
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
			// CAP.g:124:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* ( '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )+ )
			// CAP.g:124:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* ( '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// CAP.g:125:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='.'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
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
					break loop5;
				}
			}

			// CAP.g:126:7: ( '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==':') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// CAP.g:126:8: '::' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
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
					// CAP.g:128:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
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

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
			// CAP.g:133:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )
			// CAP.g:133:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// CAP.g:134:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='.'||(LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
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
					break loop8;
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
			// CAP.g:138:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\'' )
			// CAP.g:138:7: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\''
			{
			match('\''); 
			// CAP.g:138:12: (~ ( '\\'' | '\\\\' ) | '\\\\' . )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '&')||(LA9_0 >= '(' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}
				else if ( (LA9_0=='\\') ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// CAP.g:138:14: ~ ( '\\'' | '\\\\' )
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
					// CAP.g:138:31: '\\\\' .
					{
					match('\\'); 
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
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
	// $ANTLR end "STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CAP.g:142:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// CAP.g:142:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// CAP.g:142:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
					alt10=1;
				}

				switch (alt10) {
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
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
		// CAP.g:1:8: ( AT | LPAREN | RPAREN | LBRACE | RBRACE | COMMA | EQ | NUMBER | QUALIFIED_IDENT | IDENT | STRING | WS )
		int alt11=12;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// CAP.g:1:10: AT
				{
				mAT(); 

				}
				break;
			case 2 :
				// CAP.g:1:13: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 3 :
				// CAP.g:1:20: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 4 :
				// CAP.g:1:27: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 5 :
				// CAP.g:1:34: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 6 :
				// CAP.g:1:41: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// CAP.g:1:47: EQ
				{
				mEQ(); 

				}
				break;
			case 8 :
				// CAP.g:1:50: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 9 :
				// CAP.g:1:57: QUALIFIED_IDENT
				{
				mQUALIFIED_IDENT(); 

				}
				break;
			case 10 :
				// CAP.g:1:73: IDENT
				{
				mIDENT(); 

				}
				break;
			case 11 :
				// CAP.g:1:79: STRING
				{
				mSTRING(); 

				}
				break;
			case 12 :
				// CAP.g:1:86: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\11\uffff\1\16\2\uffff\1\16\2\uffff";
	static final String DFA11_eofS =
		"\17\uffff";
	static final String DFA11_minS =
		"\1\11\10\uffff\1\56\2\uffff\1\56\2\uffff";
	static final String DFA11_maxS =
		"\1\175\10\uffff\1\172\2\uffff\1\172\2\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\uffff\1"+
		"\11\1\12";
	static final String DFA11_specialS =
		"\17\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\6\uffff\1\12\1\2\1\3\2\uffff\1\6\1\10"+
			"\2\uffff\12\10\3\uffff\1\7\2\uffff\1\1\32\11\4\uffff\1\11\1\uffff\32"+
			"\11\1\4\1\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\14\1\uffff\12\14\1\15\6\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"",
			"",
			"\1\14\1\uffff\12\14\1\15\6\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
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
			return "1:1: Tokens : ( AT | LPAREN | RPAREN | LBRACE | RBRACE | COMMA | EQ | NUMBER | QUALIFIED_IDENT | IDENT | STRING | WS );";
		}
	}

}
