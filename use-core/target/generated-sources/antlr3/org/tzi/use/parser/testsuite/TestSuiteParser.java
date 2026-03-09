// $ANTLR 3.5.2 TestSuite.g 2026-03-09 07:40:48
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
package org.tzi.use.parser.testsuite;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.soil.*;
import org.tzi.use.parser.soil.ast.*;
import org.tzi.use.parser.ocl.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class TestSuiteParser extends BaseParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", 
		"COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", 
		"GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", 
		"LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", 
		"NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", 
		"REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", 
		"WS", "'!'", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", 
		"'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'assert'", "'assign'", 
		"'begin'", "'beginVariation'", "'between'", "'byUseId'", "'create'", "'declare'", 
		"'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endVariation'", 
		"'endif'", "'execute'", "'false'", "'for'", "'from'", "'if'", "'implies'", 
		"'in'", "'insert'", "'into'", "'inv'", "'invalid'", "'invs'", "'iterate'", 
		"'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", 
		"'oclInState'", "'oclIsInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", 
		"'openter'", "'opexit'", "'or'", "'post'", "'pre'", "'selectByKind'", 
		"'selectByType'", "'set'", "'setup'", "'testcase'", "'testsuite'", "'then'", 
		"'true'", "'valid'", "'while'", "'xor'"
	};
	public static final int EOF=-1;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int ARROW=4;
	public static final int AT=5;
	public static final int BAR=6;
	public static final int COLON=7;
	public static final int COLON_COLON=8;
	public static final int COLON_EQUAL=9;
	public static final int COMMA=10;
	public static final int DOT=11;
	public static final int DOTDOT=12;
	public static final int EQUAL=13;
	public static final int ESC=14;
	public static final int GREATER=15;
	public static final int GREATER_EQUAL=16;
	public static final int HASH=17;
	public static final int HEX_DIGIT=18;
	public static final int IDENT=19;
	public static final int INT=20;
	public static final int LBRACE=21;
	public static final int LBRACK=22;
	public static final int LESS=23;
	public static final int LESS_EQUAL=24;
	public static final int LPAREN=25;
	public static final int MINUS=26;
	public static final int ML_COMMENT=27;
	public static final int NEWLINE=28;
	public static final int NON_OCL_STRING=29;
	public static final int NOT_EQUAL=30;
	public static final int PLUS=31;
	public static final int RANGE_OR_INT=32;
	public static final int RBRACE=33;
	public static final int RBRACK=34;
	public static final int REAL=35;
	public static final int RPAREN=36;
	public static final int SEMI=37;
	public static final int SLASH=38;
	public static final int SL_COMMENT=39;
	public static final int STAR=40;
	public static final int STRING=41;
	public static final int VOCAB=42;
	public static final int WS=43;

	// delegates
	public BaseParser[] getDelegates() {
		return new BaseParser[] {};
	}

	// delegators


	public TestSuiteParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TestSuiteParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TestSuiteParser.tokenNames; }
	@Override public String getGrammarFileName() { return "TestSuite.g"; }



	// $ANTLR start "testSuite"
	// TestSuite.g:89:1: testSuite returns [ASTTestSuite suite] : 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF ;
	public final ASTTestSuite testSuite() throws RecognitionException {
		ASTTestSuite suite = null;


		Token suiteName=null;
		String modelFile =null;
		ASTStatement c =null;
		List tests =null;


		  List setupStatements = new ArrayList();

		try {
			// TestSuite.g:93:3: ( 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF )
			// TestSuite.g:94:3: 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF
			{
			match(input,105,FOLLOW_105_in_testSuite61); if (state.failed) return suite;
			suiteName=(Token)match(input,IDENT,FOLLOW_IDENT_in_testSuite71); if (state.failed) return suite;
			if ( state.backtracking==0 ) { suite = new ASTTestSuite(suiteName); }
			match(input,72,FOLLOW_72_in_testSuite82); if (state.failed) return suite;
			match(input,84,FOLLOW_84_in_testSuite84); if (state.failed) return suite;
			pushFollow(FOLLOW_filename_in_testSuite93);
			modelFile=filename();
			state._fsp--;
			if (state.failed) return suite;
			if ( state.backtracking==0 ) { suite.setModelFile(suiteName); }
			// TestSuite.g:100:3: ( 'setup' ( '!' c= shellCommandOnly )* 'end' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==103) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// TestSuite.g:100:4: 'setup' ( '!' c= shellCommandOnly )* 'end'
					{
					match(input,103,FOLLOW_103_in_testSuite105); if (state.failed) return suite;
					// TestSuite.g:101:4: ( '!' c= shellCommandOnly )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==44) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// TestSuite.g:101:5: '!' c= shellCommandOnly
							{
							match(input,44,FOLLOW_44_in_testSuite112); if (state.failed) return suite;
							pushFollow(FOLLOW_shellCommandOnly_in_testSuite118);
							c=shellCommandOnly();
							state._fsp--;
							if (state.failed) return suite;
							if ( state.backtracking==0 ) { setupStatements.add(c); }
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,67,FOLLOW_67_in_testSuite124); if (state.failed) return suite;
					if ( state.backtracking==0 ) { suite.setSetupStatements(setupStatements); }
					}
					break;

			}

			pushFollow(FOLLOW_testCases_in_testSuite145);
			tests=testCases();
			state._fsp--;
			if (state.failed) return suite;
			if ( state.backtracking==0 ) { suite.setTestCases(tests); }
			match(input,EOF,FOLLOW_EOF_in_testSuite154); if (state.failed) return suite;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return suite;
	}
	// $ANTLR end "testSuite"



	// $ANTLR start "filename"
	// TestSuite.g:109:1: filename returns [String filename] : name= IDENT '.' suffix= IDENT ;
	public final String filename() throws RecognitionException {
		String filename = null;


		Token name=null;
		Token suffix=null;

		try {
			// TestSuite.g:110:4: (name= IDENT '.' suffix= IDENT )
			// TestSuite.g:111:4: name= IDENT '.' suffix= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename172); if (state.failed) return filename;
			match(input,DOT,FOLLOW_DOT_in_filename174); if (state.failed) return filename;
			suffix=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename178); if (state.failed) return filename;
			if ( state.backtracking==0 ) {filename = (name!=null?name.getText():null) + "." + (suffix!=null?suffix.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filename;
	}
	// $ANTLR end "filename"



	// $ANTLR start "testCases"
	// TestSuite.g:114:1: testCases returns [List testCases] : (test= testCase )+ ;
	public final List testCases() throws RecognitionException {
		List testCases = null;


		ASTTestCase test =null;

		 testCases = new ArrayList(); 
		try {
			// TestSuite.g:116:3: ( (test= testCase )+ )
			// TestSuite.g:117:3: (test= testCase )+
			{
			// TestSuite.g:117:3: (test= testCase )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==104) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// TestSuite.g:117:4: test= testCase
					{
					pushFollow(FOLLOW_testCase_in_testCases205);
					test=testCase();
					state._fsp--;
					if (state.failed) return testCases;
					if ( state.backtracking==0 ) { testCases.add(test); }
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return testCases;}
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return testCases;
	}
	// $ANTLR end "testCases"



	// $ANTLR start "testCase"
	// TestSuite.g:120:1: testCase returns [ASTTestCase n] : 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end' ;
	public final ASTTestCase testCase() throws RecognitionException {
		ASTTestCase n = null;


		Token name=null;
		Token b=null;
		Token e=null;
		ASTStatement c =null;
		ASTAssert a =null;

		try {
			// TestSuite.g:121:3: ( 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end' )
			// TestSuite.g:122:3: 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end'
			{
			match(input,104,FOLLOW_104_in_testCase224); if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_testCase228); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTestCase(name); }
			// TestSuite.g:123:3: ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )*
			loop4:
			while (true) {
				int alt4=5;
				switch ( input.LA(1) ) {
				case 44:
					{
					alt4=1;
					}
					break;
				case 54:
					{
					alt4=2;
					}
					break;
				case 57:
					{
					alt4=3;
					}
					break;
				case 68:
					{
					alt4=4;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// TestSuite.g:124:7: '!' c= shellCommandOnly
					{
					match(input,44,FOLLOW_44_in_testCase242); if (state.failed) return n;
					pushFollow(FOLLOW_shellCommandOnly_in_testCase248);
					c=shellCommandOnly();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addStatement(c); }
					}
					break;
				case 2 :
					// TestSuite.g:126:7: a= assertStatement
					{
					pushFollow(FOLLOW_assertStatement_in_testCase267);
					a=assertStatement();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addStatement(a); }
					}
					break;
				case 3 :
					// TestSuite.g:128:7: b= 'beginVariation'
					{
					b=(Token)match(input,57,FOLLOW_57_in_testCase285); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addStatement(new ASTVariationStart(b)); }
					}
					break;
				case 4 :
					// TestSuite.g:130:7: e= 'endVariation'
					{
					e=(Token)match(input,68,FOLLOW_68_in_testCase303); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addStatement(new ASTVariationEnd(e)); }
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,67,FOLLOW_67_in_testCase315); if (state.failed) return n;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "testCase"



	// $ANTLR start "assertStatement"
	// TestSuite.g:135:1: assertStatement returns [ASTAssert n] : s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? ;
	public final ASTAssert assertStatement() throws RecognitionException {
		ASTAssert n = null;


		Token s=null;
		Token classname=null;
		Token invname=null;
		Token msg=null;
		ParserRuleReturnScope exp =null;
		ASTAssertPre pre =null;
		ASTAssertPost post =null;

		 boolean valid = true; 
		try {
			// TestSuite.g:137:3: (s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? )
			// TestSuite.g:138:3: s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )?
			{
			s=(Token)match(input,54,FOLLOW_54_in_assertStatement336); if (state.failed) return n;
			// TestSuite.g:139:3: ( 'valid' | 'invalid' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==108) ) {
				alt5=1;
			}
			else if ( (LA5_0==80) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// TestSuite.g:139:4: 'valid'
					{
					match(input,108,FOLLOW_108_in_assertStatement341); if (state.failed) return n;
					if ( state.backtracking==0 ) { valid = true; }
					}
					break;
				case 2 :
					// TestSuite.g:139:32: 'invalid'
					{
					match(input,80,FOLLOW_80_in_assertStatement347); if (state.failed) return n;
					if ( state.backtracking==0 ) {valid = false; }
					}
					break;

			}

			// TestSuite.g:140:3: (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] )
			int alt6=6;
			switch ( input.LA(1) ) {
			case AT:
			case HASH:
			case IDENT:
			case INT:
			case LPAREN:
			case MINUS:
			case PLUS:
			case REAL:
			case STAR:
			case STRING:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
			case 51:
			case 71:
			case 74:
			case 82:
			case 83:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 91:
			case 92:
			case 93:
			case 94:
			case 100:
			case 101:
			case 107:
				{
				alt6=1;
				}
				break;
			case 81:
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2==IDENT) ) {
					alt6=3;
				}
				else if ( (LA6_2==COMMA||LA6_2==44||LA6_2==54||LA6_2==57||(LA6_2 >= 67 && LA6_2 <= 68)) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 79:
				{
				alt6=4;
				}
				break;
			case 99:
				{
				alt6=5;
				}
				break;
			case 98:
				{
				alt6=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// TestSuite.g:141:7: exp= expression
					{
					pushFollow(FOLLOW_expression_in_assertStatement366);
					exp=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAssertOclExpression((exp!=null?((TestSuiteParser.expression_return)exp).n:null).getStartToken(), input.LT(-1), valid, (exp!=null?((TestSuiteParser.expression_return)exp).n:null)); }
					}
					break;
				case 2 :
					// TestSuite.g:143:7: 'invs'
					{
					match(input,81,FOLLOW_81_in_assertStatement382); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAssertGlobalInvariants(s, input.LT(-1), valid); }
					}
					break;
				case 3 :
					// TestSuite.g:145:7: 'invs' classname= IDENT
					{
					match(input,81,FOLLOW_81_in_assertStatement398); if (state.failed) return n;
					classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement402); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAssertClassInvariants(s, input.LT(-1), valid, classname); }
					}
					break;
				case 4 :
					// TestSuite.g:147:7: 'inv' classname= IDENT COLON_COLON invname= IDENT
					{
					match(input,79,FOLLOW_79_in_assertStatement418); if (state.failed) return n;
					classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement422); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertStatement424); if (state.failed) return n;
					invname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement428); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAssertSingleInvariant(s, input.LT(-1), valid, classname, invname); }
					}
					break;
				case 5 :
					// TestSuite.g:149:7: pre= assertionStatementPre[s=$s, valid=valid]
					{
					pushFollow(FOLLOW_assertionStatementPre_in_assertStatement448);
					pre=assertionStatementPre(s=s, valid=valid);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = pre; }
					}
					break;
				case 6 :
					// TestSuite.g:151:7: post= assertionStatementPost[s=$s, valid=valid]
					{
					pushFollow(FOLLOW_assertionStatementPost_in_assertStatement469);
					post=assertionStatementPost(s=s, valid=valid);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = post; }
					}
					break;

			}

			// TestSuite.g:153:3: ( COMMA msg= STRING )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COMMA) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// TestSuite.g:154:5: COMMA msg= STRING
					{
					match(input,COMMA,FOLLOW_COMMA_in_assertStatement486); if (state.failed) return n;
					msg=(Token)match(input,STRING,FOLLOW_STRING_in_assertStatement490); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setMessage(msg); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "assertStatement"



	// $ANTLR start "assertionStatementPre"
	// TestSuite.g:158:1: assertionStatementPre[Token s, boolean valid] returns [ASTAssertPre n] : 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? ;
	public final ASTAssertPre assertionStatementPre(Token s, boolean valid) throws RecognitionException {
		ASTAssertPre n = null;


		Token opName=null;
		Token name=null;
		ParserRuleReturnScope objExp =null;
		ParserRuleReturnScope e =null;

		try {
			// TestSuite.g:159:3: ( 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? )
			// TestSuite.g:160:3: 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )?
			{
			match(input,99,FOLLOW_99_in_assertionStatementPre513); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_assertionStatementPre517);
			objExp=expression();
			state._fsp--;
			if (state.failed) return n;
			opName=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre521); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssertPre(s, null, valid, (objExp!=null?((TestSuiteParser.expression_return)objExp).n:null), opName); }
			match(input,LPAREN,FOLLOW_LPAREN_in_assertionStatementPre527); if (state.failed) return n;
			// TestSuite.g:162:5: (e= expression ( COMMA e= expression )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==AT||LA9_0==HASH||(LA9_0 >= IDENT && LA9_0 <= INT)||(LA9_0 >= LPAREN && LA9_0 <= MINUS)||LA9_0==PLUS||LA9_0==REAL||(LA9_0 >= STAR && LA9_0 <= STRING)||(LA9_0 >= 45 && LA9_0 <= 51)||LA9_0==71||LA9_0==74||(LA9_0 >= 82 && LA9_0 <= 83)||(LA9_0 >= 86 && LA9_0 <= 94)||(LA9_0 >= 100 && LA9_0 <= 101)||LA9_0==107) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// TestSuite.g:162:7: e= expression ( COMMA e= expression )*
					{
					pushFollow(FOLLOW_expression_in_assertionStatementPre537);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addArg((e!=null?((TestSuiteParser.expression_return)e).n:null)); }
					// TestSuite.g:162:41: ( COMMA e= expression )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMA) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// TestSuite.g:162:43: COMMA e= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_assertionStatementPre543); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_assertionStatementPre547);
							e=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addArg((e!=null?((TestSuiteParser.expression_return)e).n:null)); }
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_assertionStatementPre559); if (state.failed) return n;
			// TestSuite.g:163:10: ( COLON_COLON name= IDENT )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==COLON_COLON) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// TestSuite.g:163:11: COLON_COLON name= IDENT
					{
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertionStatementPre562); if (state.failed) return n;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre566); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setConditionName(name); }
					}
					break;

			}

			if ( state.backtracking==0 ) { n.setEnd(input.LT(-1)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "assertionStatementPre"



	// $ANTLR start "assertionStatementPost"
	// TestSuite.g:167:1: assertionStatementPost[Token s, boolean valid] returns [ASTAssertPost n] : 'post' (name= IDENT )? ;
	public final ASTAssertPost assertionStatementPost(Token s, boolean valid) throws RecognitionException {
		ASTAssertPost n = null;


		Token name=null;

		try {
			// TestSuite.g:168:3: ( 'post' (name= IDENT )? )
			// TestSuite.g:169:3: 'post' (name= IDENT )?
			{
			match(input,98,FOLLOW_98_in_assertionStatementPost591); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssertPost(s, null, valid); }
			// TestSuite.g:170:3: (name= IDENT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IDENT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// TestSuite.g:170:4: name= IDENT
					{
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPost600); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setConditionName(name); }
					}
					break;

			}

			if ( state.backtracking==0 ) { n.setEnd(input.LT(-1)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "assertionStatementPost"



	// $ANTLR start "expressionOnly"
	// TestSuite.g:201:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
	public final ASTExpression expressionOnly() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope nExp =null;

		try {
			// TestSuite.g:202:5: (nExp= expression EOF )
			// TestSuite.g:203:5: nExp= expression EOF
			{
			pushFollow(FOLLOW_expression_in_expressionOnly637);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_expressionOnly639); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = (nExp!=null?((TestSuiteParser.expression_return)nExp).n:null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "expressionOnly"


	public static class expression_return extends ParserRuleReturnScope {
		public ASTExpression n;
	};


	// $ANTLR start "expression"
	// TestSuite.g:210:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
	public final TestSuiteParser.expression_return expression() throws RecognitionException {
		TestSuiteParser.expression_return retval = new TestSuiteParser.expression_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e1 =null;
		ASTExpression nCndImplies =null;

		 
		  ASTLetExpression prevLet = null, firstLet = null;
		  ASTExpression e2;
		  Token tok = null;

		try {
			// TestSuite.g:216:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
			// TestSuite.g:217:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }
			// TestSuite.g:218:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==83) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// TestSuite.g:219:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
					{
					match(input,83,FOLLOW_83_in_expression687); if (state.failed) return retval;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression698); if (state.failed) return retval;
					// TestSuite.g:220:18: ( COLON t= type )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==COLON) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// TestSuite.g:220:20: COLON t= type
							{
							match(input,COLON,FOLLOW_COLON_in_expression702); if (state.failed) return retval;
							pushFollow(FOLLOW_type_in_expression706);
							t=type();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_expression711); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression715);
					e1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((TestSuiteParser.expression_return)e1).n:null));
					         if ( firstLet == null ) 
					             firstLet = nextLet;
					         if ( prevLet != null ) 
					             prevLet.setInExpr(nextLet);
					         prevLet = nextLet;
					      }
					// TestSuite.g:230:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==COMMA) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// TestSuite.g:231:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_expression753); if (state.failed) return retval;
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression765); if (state.failed) return retval;
							// TestSuite.g:232:20: ( COLON t= type )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==COLON) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// TestSuite.g:232:22: COLON t= type
									{
									match(input,COLON,FOLLOW_COLON_in_expression769); if (state.failed) return retval;
									pushFollow(FOLLOW_type_in_expression773);
									t=type();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							match(input,EQUAL,FOLLOW_EQUAL_in_expression778); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_expression782);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((TestSuiteParser.expression_return)e1).n:null));
							           if ( firstLet == null ) 
							               firstLet = nextLet;
							           if ( prevLet != null ) 
							               prevLet.setInExpr(nextLet);
							           prevLet = nextLet;
							        }
							}
							break;

						default :
							break loop14;
						}
					}

					match(input,76,FOLLOW_76_in_expression823); if (state.failed) return retval;
					}
					break;

				default :
					break loop15;
				}
			}

			pushFollow(FOLLOW_conditionalImpliesExpression_in_expression839);
			nCndImplies=conditionalImpliesExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { if ( nCndImplies != null ) {
			    	 retval.n = nCndImplies;
			         retval.n.setStartToken(tok);
			      }
			      
			      if ( prevLet != null ) { 
			         prevLet.setInExpr(retval.n);
			         retval.n = firstLet;
			         retval.n.setStartToken(tok);
			      }
			    }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "expression"



	// $ANTLR start "paramList"
	// TestSuite.g:264:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
	public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
		List<ASTVariableDeclaration> paramList = null;


		ASTVariableDeclaration v =null;

		 paramList = new ArrayList<ASTVariableDeclaration>(); 
		try {
			// TestSuite.g:266:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
			// TestSuite.g:267:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_paramList872); if (state.failed) return paramList;
			// TestSuite.g:268:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==IDENT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// TestSuite.g:269:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_paramList889);
					v=variableDeclaration();
					state._fsp--;
					if (state.failed) return paramList;
					if ( state.backtracking==0 ) { paramList.add(v); }
					// TestSuite.g:270:7: ( COMMA v= variableDeclaration )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// TestSuite.g:270:9: COMMA v= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramList901); if (state.failed) return paramList;
							pushFollow(FOLLOW_variableDeclaration_in_paramList905);
							v=variableDeclaration();
							state._fsp--;
							if (state.failed) return paramList;
							if ( state.backtracking==0 ) { paramList.add(v); }
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_paramList925); if (state.failed) return paramList;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return paramList;
	}
	// $ANTLR end "paramList"



	// $ANTLR start "idList"
	// TestSuite.g:278:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
	public final List idList() throws RecognitionException {
		List idList = null;


		Token id0=null;
		Token idn=null;

		 idList = new ArrayList(); 
		try {
			// TestSuite.g:280:5: (id0= IDENT ( COMMA idn= IDENT )* )
			// TestSuite.g:281:5: id0= IDENT ( COMMA idn= IDENT )*
			{
			id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList954); if (state.failed) return idList;
			if ( state.backtracking==0 ) { idList.add(id0); }
			// TestSuite.g:282:5: ( COMMA idn= IDENT )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// TestSuite.g:282:7: COMMA idn= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_idList964); if (state.failed) return idList;
					idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList968); if (state.failed) return idList;
					if ( state.backtracking==0 ) { idList.add(idn); }
					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return idList;
	}
	// $ANTLR end "idList"



	// $ANTLR start "variableDeclaration"
	// TestSuite.g:290:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
	public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
		ASTVariableDeclaration n = null;


		Token name=null;
		ASTType t =null;

		try {
			// TestSuite.g:291:5: (name= IDENT COLON t= type )
			// TestSuite.g:292:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration999); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableDeclaration1001); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration1005);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTVariableDeclaration(name, t); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "variableDeclaration"



	// $ANTLR start "conditionalImpliesExpression"
	// TestSuite.g:300:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
	public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndOrExp =null;
		ASTExpression n1 =null;

		try {
			// TestSuite.g:301:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
			// TestSuite.g:302:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1041);
			nCndOrExp=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndOrExp;}
			// TestSuite.g:303:5: (op= 'implies' n1= conditionalOrExpression )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==75) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// TestSuite.g:303:7: op= 'implies' n1= conditionalOrExpression
					{
					op=(Token)match(input,75,FOLLOW_75_in_conditionalImpliesExpression1054); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1058);
					n1=conditionalOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "conditionalImpliesExpression"



	// $ANTLR start "conditionalOrExpression"
	// TestSuite.g:312:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
	public final ASTExpression conditionalOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndXorExp =null;
		ASTExpression n1 =null;

		try {
			// TestSuite.g:313:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
			// TestSuite.g:314:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
			{
			pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1103);
			nCndXorExp=conditionalXOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndXorExp;}
			// TestSuite.g:315:5: (op= 'or' n1= conditionalXOrExpression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==97) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// TestSuite.g:315:7: op= 'or' n1= conditionalXOrExpression
					{
					op=(Token)match(input,97,FOLLOW_97_in_conditionalOrExpression1116); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1120);
					n1=conditionalXOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "conditionalOrExpression"



	// $ANTLR start "conditionalXOrExpression"
	// TestSuite.g:324:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
	public final ASTExpression conditionalXOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndAndExp =null;
		ASTExpression n1 =null;

		try {
			// TestSuite.g:325:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
			// TestSuite.g:326:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1164);
			nCndAndExp=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndAndExp;}
			// TestSuite.g:327:5: (op= 'xor' n1= conditionalAndExpression )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==110) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// TestSuite.g:327:7: op= 'xor' n1= conditionalAndExpression
					{
					op=(Token)match(input,110,FOLLOW_110_in_conditionalXOrExpression1177); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1181);
					n1=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop21;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "conditionalXOrExpression"



	// $ANTLR start "conditionalAndExpression"
	// TestSuite.g:336:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
	public final ASTExpression conditionalAndExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nEqExp =null;
		ASTExpression n1 =null;

		try {
			// TestSuite.g:337:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
			// TestSuite.g:338:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1225);
			nEqExp=equalityExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nEqExp;}
			// TestSuite.g:339:5: (op= 'and' n1= equalityExpression )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==53) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// TestSuite.g:339:7: op= 'and' n1= equalityExpression
					{
					op=(Token)match(input,53,FOLLOW_53_in_conditionalAndExpression1238); if (state.failed) return n;
					pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1242);
					n1=equalityExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "equalityExpression"
	// TestSuite.g:348:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
	public final ASTExpression equalityExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nRelExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// TestSuite.g:350:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
			// TestSuite.g:351:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression1290);
			nRelExp=relationalExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nRelExp;}
			// TestSuite.g:352:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==EQUAL||LA23_0==NOT_EQUAL) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// TestSuite.g:352:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression1319);
					n1=relationalExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop23;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "relationalExpression"
	// TestSuite.g:362:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
	public final ASTExpression relationalExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nAddiExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// TestSuite.g:364:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
			// TestSuite.g:365:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression1368);
			nAddiExp=additiveExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nAddiExp;}
			// TestSuite.g:366:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= GREATER && LA24_0 <= GREATER_EQUAL)||(LA24_0 >= LESS && LA24_0 <= LESS_EQUAL)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// TestSuite.g:366:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_EQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESS_EQUAL) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression1404);
					n1=additiveExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop24;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "relationalExpression"



	// $ANTLR start "additiveExpression"
	// TestSuite.g:376:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
	public final ASTExpression additiveExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nMulExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// TestSuite.g:378:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
			// TestSuite.g:379:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1454);
			nMulExp=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nMulExp;}
			// TestSuite.g:380:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==MINUS||LA25_0==PLUS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// TestSuite.g:380:7: ( PLUS | MINUS ) n1= multiplicativeExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1482);
					n1=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop25;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// TestSuite.g:391:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
	public final ASTExpression multiplicativeExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// TestSuite.g:393:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
			// TestSuite.g:394:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1532);
			nUnExp=unaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nUnExp;}
			// TestSuite.g:395:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==SLASH||LA26_0==STAR||LA26_0==64) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// TestSuite.g:395:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==64 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1564);
					n1=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop26;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// TestSuite.g:407:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
	public final ASTExpression unaryExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression nPosExp =null;

		 Token op = null; 
		try {
			// TestSuite.g:409:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==MINUS||LA27_0==PLUS||LA27_0==86) ) {
				alt27=1;
			}
			else if ( (LA27_0==AT||LA27_0==HASH||(LA27_0 >= IDENT && LA27_0 <= INT)||LA27_0==LPAREN||LA27_0==REAL||(LA27_0 >= STAR && LA27_0 <= STRING)||(LA27_0 >= 45 && LA27_0 <= 51)||LA27_0==71||LA27_0==74||LA27_0==82||(LA27_0 >= 87 && LA27_0 <= 94)||(LA27_0 >= 100 && LA27_0 <= 101)||LA27_0==107) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// TestSuite.g:410:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					{
					// TestSuite.g:410:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					// TestSuite.g:410:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==86 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression1650);
					nUnExp=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }
					}

					}
					break;
				case 2 :
					// TestSuite.g:414:7: nPosExp= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression1670);
					nPosExp=postfixExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPosExp; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "unaryExpression"



	// $ANTLR start "postfixExpression"
	// TestSuite.g:422:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
	public final ASTExpression postfixExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nPrimExp =null;
		ASTExpression nPc =null;

		 boolean arrow = false; 
		try {
			// TestSuite.g:424:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
			// TestSuite.g:425:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression1703);
			nPrimExp=primaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nPrimExp; }
			// TestSuite.g:426:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==DOT) ) {
					int LA29_2 = input.LA(2);
					if ( (LA29_2==IDENT) ) {
						int LA29_4 = input.LA(3);
						if ( (LA29_4==EOF||(LA29_4 >= ARROW && LA29_4 <= BAR)||(LA29_4 >= COMMA && LA29_4 <= EQUAL)||(LA29_4 >= GREATER && LA29_4 <= GREATER_EQUAL)||LA29_4==IDENT||(LA29_4 >= LBRACE && LA29_4 <= MINUS)||(LA29_4 >= NOT_EQUAL && LA29_4 <= PLUS)||(LA29_4 >= RBRACE && LA29_4 <= RBRACK)||(LA29_4 >= RPAREN && LA29_4 <= SLASH)||LA29_4==STAR||LA29_4==44||(LA29_4 >= 53 && LA29_4 <= 55)||LA29_4==57||LA29_4==60||(LA29_4 >= 62 && LA29_4 <= 70)||(LA29_4 >= 75 && LA29_4 <= 77)||LA29_4==83||LA29_4==97||LA29_4==102||LA29_4==106||LA29_4==110) ) {
							alt29=1;
						}

					}
					else if ( (LA29_2==82||LA29_2==88||(LA29_2 >= 90 && LA29_2 <= 93)||(LA29_2 >= 100 && LA29_2 <= 101)) ) {
						alt29=1;
					}

				}
				else if ( (LA29_0==ARROW) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// TestSuite.g:427:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
					{
					// TestSuite.g:427:6: ( ARROW | DOT )
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ARROW) ) {
						alt28=1;
					}
					else if ( (LA28_0==DOT) ) {
						alt28=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// TestSuite.g:427:8: ARROW
							{
							match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1721); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = true; }
							}
							break;
						case 2 :
							// TestSuite.g:427:34: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_postfixExpression1727); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = false; }
							}
							break;

					}

					pushFollow(FOLLOW_propertyCall_in_postfixExpression1738);
					nPc=propertyCall(n, arrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;

				default :
					break loop29;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "postfixExpression"



	// $ANTLR start "primaryExpression"
	// TestSuite.g:443:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
	public final ASTExpression primaryExpression() throws RecognitionException {
		ASTExpression n = null;


		Token id1=null;
		Token id2=null;
		ASTExpression nLit =null;
		ASTExpression nOr =null;
		ASTExpression nPc =null;
		ParserRuleReturnScope nExp =null;
		ASTExpression nIfExp =null;
		ParserRuleReturnScope idExp =null;

		try {
			// TestSuite.g:444:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
			int alt33=7;
			switch ( input.LA(1) ) {
			case HASH:
			case INT:
			case REAL:
			case STAR:
			case STRING:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
			case 51:
			case 71:
			case 87:
			case 89:
			case 94:
			case 107:
				{
				alt33=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case COLON_COLON:
					{
					alt33=1;
					}
					break;
				case EOF:
				case ARROW:
				case AT:
				case BAR:
				case COMMA:
				case DOTDOT:
				case EQUAL:
				case GREATER:
				case GREATER_EQUAL:
				case IDENT:
				case LBRACE:
				case LBRACK:
				case LESS:
				case LESS_EQUAL:
				case LPAREN:
				case MINUS:
				case NOT_EQUAL:
				case PLUS:
				case RBRACE:
				case RBRACK:
				case RPAREN:
				case SEMI:
				case SLASH:
				case STAR:
				case 44:
				case 53:
				case 54:
				case 55:
				case 57:
				case 60:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 75:
				case 76:
				case 77:
				case 83:
				case 97:
				case 102:
				case 106:
				case 110:
					{
					alt33=3;
					}
					break;
				case DOT:
					{
					switch ( input.LA(3) ) {
					case 52:
						{
						alt33=6;
						}
						break;
					case 59:
						{
						alt33=7;
						}
						break;
					case IDENT:
					case 82:
					case 88:
					case 90:
					case 91:
					case 92:
					case 93:
					case 100:
					case 101:
						{
						alt33=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return n;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 33, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case AT:
				{
				alt33=2;
				}
				break;
			case 82:
			case 88:
			case 90:
			case 91:
			case 92:
			case 93:
			case 100:
			case 101:
				{
				alt33=3;
				}
				break;
			case LPAREN:
				{
				alt33=4;
				}
				break;
			case 74:
				{
				alt33=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// TestSuite.g:445:7: nLit= literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression1778);
					nLit=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nLit; }
					}
					break;
				case 2 :
					// TestSuite.g:446:7: nOr= objectReference
					{
					pushFollow(FOLLOW_objectReference_in_primaryExpression1792);
					nOr=objectReference();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nOr; }
					}
					break;
				case 3 :
					// TestSuite.g:447:7: nPc= propertyCall[null, false]
					{
					pushFollow(FOLLOW_propertyCall_in_primaryExpression1804);
					nPc=propertyCall(null, false);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;
				case 4 :
					// TestSuite.g:448:7: LPAREN nExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1815); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression1819);
					nExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1821); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExp!=null?((TestSuiteParser.expression_return)nExp).n:null); }
					}
					break;
				case 5 :
					// TestSuite.g:449:7: nIfExp= ifExpression
					{
					pushFollow(FOLLOW_ifExpression_in_primaryExpression1833);
					nIfExp=ifExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nIfExp; }
					}
					break;
				case 6 :
					// TestSuite.g:450:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
					{
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1845); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression1847); if (state.failed) return n;
					match(input,52,FOLLOW_52_in_primaryExpression1849); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }
					// TestSuite.g:452:9: ( AT 'pre' )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==AT) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// TestSuite.g:452:11: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression1872); if (state.failed) return n;
							match(input,99,FOLLOW_99_in_primaryExpression1874); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					// TestSuite.g:453:9: ( LPAREN RPAREN )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==LPAREN) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// TestSuite.g:453:11: LPAREN RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1892); if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1894); if (state.failed) return n;
							}
							break;

					}

					}
					break;
				case 7 :
					// TestSuite.g:454:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
					{
					id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1907); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression1909); if (state.failed) return n;
					match(input,59,FOLLOW_59_in_primaryExpression1911); if (state.failed) return n;
					// TestSuite.g:454:31: ( LPAREN idExp= expression RPAREN )
					// TestSuite.g:454:33: LPAREN idExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1915); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression1919);
					idExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1921); if (state.failed) return n;
					}

					if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?((TestSuiteParser.expression_return)idExp).n:null)); }
					// TestSuite.g:456:7: ( AT 'pre' )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==AT) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// TestSuite.g:456:9: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression1941); if (state.failed) return n;
							match(input,99,FOLLOW_99_in_primaryExpression1943); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "primaryExpression"



	// $ANTLR start "objectReference"
	// TestSuite.g:460:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
	public final ASTExpression objectReference() throws RecognitionException {
		ASTExpression n = null;


		Token objectName=null;

		try {
			// TestSuite.g:461:3: ( AT objectName= IDENT )
			// TestSuite.g:462:3: AT objectName= IDENT
			{
			match(input,AT,FOLLOW_AT_in_objectReference1969); if (state.failed) return n;
			objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1977); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTObjectReferenceExpression(objectName); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "objectReference"



	// $ANTLR start "propertyCall"
	// TestSuite.g:476:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
	public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExpQuery =null;
		ASTExpression nExpIterate =null;
		ParserRuleReturnScope nExpOperation =null;
		ASTTypeArgExpression nExpType =null;
		ASTInStateExpression nExpInState =null;

		try {
			// TestSuite.g:477:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
			int alt34=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA34_1 = input.LA(2);
				if ( ((( input.LA(2) == LPAREN )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
					alt34=1;
				}
				else if ( (true) ) {
					alt34=3;
				}

				}
				break;
			case 82:
				{
				alt34=2;
				}
				break;
			case 88:
			case 92:
			case 93:
			case 100:
			case 101:
				{
				alt34=4;
				}
				break;
			case 90:
			case 91:
				{
				alt34=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// TestSuite.g:481:7: {...}?{...}?nExpQuery= queryExpression[source]
					{
					if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
					}
					if ( !(( input.LA(2) == LPAREN )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
					}
					pushFollow(FOLLOW_queryExpression_in_propertyCall2042);
					nExpQuery=queryExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpQuery; }
					}
					break;
				case 2 :
					// TestSuite.g:484:7: nExpIterate= iterateExpression[source]
					{
					pushFollow(FOLLOW_iterateExpression_in_propertyCall2055);
					nExpIterate=iterateExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpIterate; }
					}
					break;
				case 3 :
					// TestSuite.g:485:7: nExpOperation= operationExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_operationExpression_in_propertyCall2068);
					nExpOperation=operationExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExpOperation!=null?((TestSuiteParser.operationExpression_return)nExpOperation).n:null); }
					}
					break;
				case 4 :
					// TestSuite.g:486:7: nExpType= typeExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_typeExpression_in_propertyCall2081);
					nExpType=typeExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpType; }
					}
					break;
				case 5 :
					// TestSuite.g:487:7: nExpInState= inStateExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_inStateExpression_in_propertyCall2094);
					nExpInState=inStateExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpInState; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "propertyCall"



	// $ANTLR start "queryExpression"
	// TestSuite.g:496:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
	public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTElemVarsDeclaration decls =null;
		ParserRuleReturnScope nExp =null;

		ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
		try {
			// TestSuite.g:497:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
			// TestSuite.g:498:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
			{
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2129); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2136); if (state.failed) return n;
			// TestSuite.g:500:5: (decls= elemVarsDeclaration BAR )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==IDENT) ) {
				int LA35_1 = input.LA(2);
				if ( ((LA35_1 >= BAR && LA35_1 <= COLON)||LA35_1==COMMA) ) {
					alt35=1;
				}
			}
			switch (alt35) {
				case 1 :
					// TestSuite.g:500:7: decls= elemVarsDeclaration BAR
					{
					pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2147);
					decls=elemVarsDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {decl = decls;}
					match(input,BAR,FOLLOW_BAR_in_queryExpression2151); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_queryExpression2162);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2168); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?((TestSuiteParser.expression_return)nExp).n:null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "queryExpression"



	// $ANTLR start "iterateExpression"
	// TestSuite.g:514:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
	public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTElemVarsDeclaration decls =null;
		ASTVariableInitialization init =null;
		ParserRuleReturnScope nExp =null;

		try {
			// TestSuite.g:514:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
			// TestSuite.g:515:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
			{
			i=(Token)match(input,82,FOLLOW_82_in_iterateExpression2200); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2206); if (state.failed) return n;
			pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2214);
			decls=elemVarsDeclaration();
			state._fsp--;
			if (state.failed) return n;
			match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2216); if (state.failed) return n;
			pushFollow(FOLLOW_variableInitialization_in_iterateExpression2224);
			init=variableInitialization();
			state._fsp--;
			if (state.failed) return n;
			match(input,BAR,FOLLOW_BAR_in_iterateExpression2226); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_iterateExpression2234);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2240); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?((TestSuiteParser.expression_return)nExp).n:null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "iterateExpression"


	public static class operationExpression_return extends ParserRuleReturnScope {
		public ASTOperationExpression n;
	};


	// $ANTLR start "operationExpression"
	// TestSuite.g:536:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
	public final TestSuiteParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		TestSuiteParser.operationExpression_return retval = new TestSuiteParser.operationExpression_return();
		retval.start = input.LT(1);

		Token name=null;
		ParserRuleReturnScope rolename =null;
		ParserRuleReturnScope e =null;

		try {
			// TestSuite.g:538:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
			// TestSuite.g:539:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2284); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }
			// TestSuite.g:545:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LBRACK) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// TestSuite.g:545:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2306); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operationExpression2319);
					rolename=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((TestSuiteParser.expression_return)rolename).n:null)); }
					// TestSuite.g:547:9: ( COMMA rolename= expression )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==COMMA) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// TestSuite.g:547:10: COMMA rolename= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_operationExpression2332); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression2336);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((TestSuiteParser.expression_return)rolename).n:null)); }
							}
							break;

						default :
							break loop36;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2348); if (state.failed) return retval;
					// TestSuite.g:550:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==LBRACK) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// TestSuite.g:550:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2365); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression2380);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((TestSuiteParser.expression_return)rolename).n:null)); }
							// TestSuite.g:552:11: ( COMMA rolename= expression )*
							loop37:
							while (true) {
								int alt37=2;
								int LA37_0 = input.LA(1);
								if ( (LA37_0==COMMA) ) {
									alt37=1;
								}

								switch (alt37) {
								case 1 :
									// TestSuite.g:552:12: COMMA rolename= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression2395); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression2399);
									rolename=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((TestSuiteParser.expression_return)rolename).n:null)); }
									}
									break;

								default :
									break loop37;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2413); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			// TestSuite.g:557:5: ( AT 'pre' )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==AT) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// TestSuite.g:557:7: AT 'pre'
					{
					match(input,AT,FOLLOW_AT_in_operationExpression2438); if (state.failed) return retval;
					match(input,99,FOLLOW_99_in_operationExpression2440); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.setIsPre(); }
					}
					break;

			}

			// TestSuite.g:559:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==LPAREN) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// TestSuite.g:560:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2465); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.hasParentheses(); }
					// TestSuite.g:561:7: (e= expression ( COMMA e= expression )* )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==AT||LA42_0==HASH||(LA42_0 >= IDENT && LA42_0 <= INT)||(LA42_0 >= LPAREN && LA42_0 <= MINUS)||LA42_0==PLUS||LA42_0==REAL||(LA42_0 >= STAR && LA42_0 <= STRING)||(LA42_0 >= 45 && LA42_0 <= 51)||LA42_0==71||LA42_0==74||(LA42_0 >= 82 && LA42_0 <= 83)||(LA42_0 >= 86 && LA42_0 <= 94)||(LA42_0 >= 100 && LA42_0 <= 101)||LA42_0==107) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// TestSuite.g:562:7: e= expression ( COMMA e= expression )*
							{
							pushFollow(FOLLOW_expression_in_operationExpression2486);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((TestSuiteParser.expression_return)e).n:null)); }
							// TestSuite.g:563:7: ( COMMA e= expression )*
							loop41:
							while (true) {
								int alt41=2;
								int LA41_0 = input.LA(1);
								if ( (LA41_0==COMMA) ) {
									alt41=1;
								}

								switch (alt41) {
								case 1 :
									// TestSuite.g:563:9: COMMA e= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression2498); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression2502);
									e=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((TestSuiteParser.expression_return)e).n:null)); }
									}
									break;

								default :
									break loop41;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2522); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) { retval.n.setStartToken((retval.start)); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "operationExpression"



	// $ANTLR start "inStateExpression"
	// TestSuite.g:570:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN ;
	public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTInStateExpression n = null;


		Token s=null;

		 Token opToken = null; 
		try {
			// TestSuite.g:573:4: ( ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN )
			// TestSuite.g:574:4: ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( (input.LA(1) >= 90 && input.LA(1) <= 91) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2583); if (state.failed) return n;
			s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2592); if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2597); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTInStateExpression(opToken, source, s, followsArrow); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "inStateExpression"



	// $ANTLR start "typeExpression"
	// TestSuite.g:587:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
	public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTTypeArgExpression n = null;


		ASTType t =null;

		 Token opToken = null; 
		try {
			// TestSuite.g:590:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
			// TestSuite.g:591:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( input.LA(1)==88||(input.LA(1) >= 92 && input.LA(1) <= 93)||(input.LA(1) >= 100 && input.LA(1) <= 101) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2657); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_typeExpression2661);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2663); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTypeArgExpression(opToken, source, t, followsArrow); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "typeExpression"



	// $ANTLR start "elemVarsDeclaration"
	// TestSuite.g:602:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
	public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
		ASTElemVarsDeclaration n = null;


		Token var1=null;
		Token varN=null;
		ASTType t =null;
		ASTType tN =null;

		try {
			// TestSuite.g:603:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
			// TestSuite.g:604:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
			{
			if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }
			var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2701); if (state.failed) return n;
			// TestSuite.g:605:17: ( COLON t= type )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==COLON) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// TestSuite.g:605:18: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2704); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_elemVarsDeclaration2708);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}
			// TestSuite.g:606:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==COMMA) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// TestSuite.g:606:5: COMMA varN= IDENT ( COLON tN= type )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2718); if (state.failed) return n;
					varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2724); if (state.failed) return n;
					// TestSuite.g:606:24: ( COLON tN= type )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==COLON) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// TestSuite.g:606:25: COLON tN= type
							{
							match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2727); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_elemVarsDeclaration2733);
							tN=type();
							state._fsp--;
							if (state.failed) return n;
							}
							break;

					}

					if ( state.backtracking==0 ) {n.addDeclaration(varN, tN); }
					}
					break;

				default :
					break loop46;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "elemVarsDeclaration"



	// $ANTLR start "variableInitialization"
	// TestSuite.g:614:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
	public final ASTVariableInitialization variableInitialization() throws RecognitionException {
		ASTVariableInitialization n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// TestSuite.g:615:5: (name= IDENT COLON t= type EQUAL e= expression )
			// TestSuite.g:616:5: name= IDENT COLON t= type EQUAL e= expression
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2761); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableInitialization2763); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableInitialization2767);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2769); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_variableInitialization2773);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?((TestSuiteParser.expression_return)e).n:null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "variableInitialization"



	// $ANTLR start "ifExpression"
	// TestSuite.g:625:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
	public final ASTExpression ifExpression() throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;

		try {
			// TestSuite.g:626:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
			// TestSuite.g:627:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
			{
			i=(Token)match(input,74,FOLLOW_74_in_ifExpression2805); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression2809);
			cond=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,106,FOLLOW_106_in_ifExpression2811); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression2815);
			t=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,66,FOLLOW_66_in_ifExpression2817); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression2821);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,69,FOLLOW_69_in_ifExpression2823); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?((TestSuiteParser.expression_return)cond).n:null), (t!=null?((TestSuiteParser.expression_return)t).n:null), (e!=null?((TestSuiteParser.expression_return)e).n:null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "ifExpression"



	// $ANTLR start "literal"
	// TestSuite.g:646:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
	public final ASTExpression literal() throws RecognitionException {
		ASTExpression n = null;


		Token t=null;
		Token f=null;
		Token i=null;
		Token r=null;
		Token s=null;
		Token enumLit=null;
		Token enumName=null;
		Token un=null;
		ASTCollectionLiteral nColIt =null;
		ASTEmptyCollectionLiteral nEColIt =null;
		ASTUndefinedLiteral nUndLit =null;
		ASTTupleLiteral nTupleLit =null;

		try {
			// TestSuite.g:647:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
			int alt47=12;
			switch ( input.LA(1) ) {
			case 107:
				{
				alt47=1;
				}
				break;
			case 71:
				{
				alt47=2;
				}
				break;
			case INT:
				{
				alt47=3;
				}
				break;
			case REAL:
				{
				alt47=4;
				}
				break;
			case STRING:
				{
				alt47=5;
				}
				break;
			case HASH:
				{
				alt47=6;
				}
				break;
			case IDENT:
				{
				alt47=7;
				}
				break;
			case 45:
			case 47:
			case 48:
			case 49:
				{
				int LA47_8 = input.LA(2);
				if ( (LA47_8==LPAREN) ) {
					alt47=9;
				}
				else if ( (LA47_8==LBRACE) ) {
					alt47=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 46:
			case 89:
				{
				alt47=9;
				}
				break;
			case 51:
			case 87:
			case 94:
				{
				alt47=10;
				}
				break;
			case 50:
				{
				alt47=11;
				}
				break;
			case STAR:
				{
				alt47=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// TestSuite.g:648:7: t= 'true'
					{
					t=(Token)match(input,107,FOLLOW_107_in_literal2862); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }
					}
					break;
				case 2 :
					// TestSuite.g:649:7: f= 'false'
					{
					f=(Token)match(input,71,FOLLOW_71_in_literal2876); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }
					}
					break;
				case 3 :
					// TestSuite.g:650:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_literal2889); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }
					}
					break;
				case 4 :
					// TestSuite.g:651:7: r= REAL
					{
					r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2904); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }
					}
					break;
				case 5 :
					// TestSuite.g:652:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2918); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }
					}
					break;
				case 6 :
					// TestSuite.g:653:7: HASH enumLit= IDENT
					{
					match(input,HASH,FOLLOW_HASH_in_literal2928); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2932); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}
					}
					break;
				case 7 :
					// TestSuite.g:654:7: enumName= IDENT '::' enumLit= IDENT
					{
					enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2944); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2946); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2950); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }
					}
					break;
				case 8 :
					// TestSuite.g:655:7: nColIt= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_literal2962);
					nColIt=collectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nColIt; }
					}
					break;
				case 9 :
					// TestSuite.g:656:7: nEColIt= emptyCollectionLiteral
					{
					pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2974);
					nEColIt=emptyCollectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nEColIt; }
					}
					break;
				case 10 :
					// TestSuite.g:657:7: nUndLit= undefinedLiteral
					{
					pushFollow(FOLLOW_undefinedLiteral_in_literal2986);
					nUndLit=undefinedLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nUndLit; }
					}
					break;
				case 11 :
					// TestSuite.g:658:7: nTupleLit= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_literal2998);
					nTupleLit=tupleLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nTupleLit; }
					}
					break;
				case 12 :
					// TestSuite.g:659:7: un= STAR
					{
					un=(Token)match(input,STAR,FOLLOW_STAR_in_literal3010); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnlimitedNaturalLiteral(un); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "literal"



	// $ANTLR start "collectionLiteral"
	// TestSuite.g:667:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
	public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
		ASTCollectionLiteral n = null;


		ASTCollectionItem ci =null;

		 Token op = null; 
		try {
			// TestSuite.g:669:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
			// TestSuite.g:670:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
			{
			if ( state.backtracking==0 ) { op = input.LT(1); }
			if ( input.LA(1)==45||(input.LA(1) >= 47 && input.LA(1) <= 49) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { n = new ASTCollectionLiteral(op); }
			match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3077); if (state.failed) return n;
			// TestSuite.g:674:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==AT||LA49_0==HASH||(LA49_0 >= IDENT && LA49_0 <= INT)||(LA49_0 >= LPAREN && LA49_0 <= MINUS)||LA49_0==PLUS||LA49_0==REAL||(LA49_0 >= STAR && LA49_0 <= STRING)||(LA49_0 >= 45 && LA49_0 <= 51)||LA49_0==71||LA49_0==74||(LA49_0 >= 82 && LA49_0 <= 83)||(LA49_0 >= 86 && LA49_0 <= 94)||(LA49_0 >= 100 && LA49_0 <= 101)||LA49_0==107) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// TestSuite.g:675:7: ci= collectionItem ( COMMA ci= collectionItem )*
					{
					pushFollow(FOLLOW_collectionItem_in_collectionLiteral3094);
					ci=collectionItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addItem(ci); }
					// TestSuite.g:676:7: ( COMMA ci= collectionItem )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==COMMA) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// TestSuite.g:676:9: COMMA ci= collectionItem
							{
							match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3107); if (state.failed) return n;
							pushFollow(FOLLOW_collectionItem_in_collectionLiteral3111);
							ci=collectionItem();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addItem(ci); }
							}
							break;

						default :
							break loop48;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3130); if (state.failed) return n;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "collectionItem"
	// TestSuite.g:685:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
	public final ASTCollectionItem collectionItem() throws RecognitionException {
		ASTCollectionItem n = null;


		ParserRuleReturnScope e =null;

		 n = new ASTCollectionItem(); 
		try {
			// TestSuite.g:687:5: (e= expression ( DOTDOT e= expression )? )
			// TestSuite.g:688:5: e= expression ( DOTDOT e= expression )?
			{
			pushFollow(FOLLOW_expression_in_collectionItem3159);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setFirst((e!=null?((TestSuiteParser.expression_return)e).n:null)); }
			// TestSuite.g:689:5: ( DOTDOT e= expression )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==DOTDOT) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// TestSuite.g:689:7: DOTDOT e= expression
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3170); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_collectionItem3174);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setSecond((e!=null?((TestSuiteParser.expression_return)e).n:null)); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "collectionItem"



	// $ANTLR start "emptyCollectionLiteral"
	// TestSuite.g:699:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
	public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
		ASTEmptyCollectionLiteral n = null;


		ASTCollectionType t =null;

		try {
			// TestSuite.g:700:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==89) ) {
				alt51=1;
			}
			else if ( ((LA51_0 >= 45 && LA51_0 <= 49)) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// TestSuite.g:701:5: 'oclEmpty' LPAREN t= collectionType RPAREN
					{
					match(input,89,FOLLOW_89_in_emptyCollectionLiteral3203); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3205); if (state.failed) return n;
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3209);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3211); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;
				case 2 :
					// TestSuite.g:704:5: t= collectionType LBRACE RBRACE
					{
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3227);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3229); if (state.failed) return n;
					match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3231); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "emptyCollectionLiteral"



	// $ANTLR start "undefinedLiteral"
	// TestSuite.g:715:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
	public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
		ASTUndefinedLiteral n = null;


		ASTType t =null;

		try {
			// TestSuite.g:716:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
			int alt52=4;
			switch ( input.LA(1) ) {
			case 94:
				{
				alt52=1;
				}
				break;
			case 51:
				{
				alt52=2;
				}
				break;
			case 87:
				{
				int LA52_3 = input.LA(2);
				if ( (LA52_3==LPAREN) ) {
					alt52=3;
				}
				else if ( (LA52_3==EOF||LA52_3==ARROW||LA52_3==BAR||(LA52_3 >= COMMA && LA52_3 <= EQUAL)||(LA52_3 >= GREATER && LA52_3 <= GREATER_EQUAL)||LA52_3==IDENT||LA52_3==LBRACE||(LA52_3 >= LESS && LA52_3 <= LESS_EQUAL)||LA52_3==MINUS||(LA52_3 >= NOT_EQUAL && LA52_3 <= PLUS)||(LA52_3 >= RBRACE && LA52_3 <= RBRACK)||(LA52_3 >= RPAREN && LA52_3 <= SLASH)||LA52_3==STAR||LA52_3==44||(LA52_3 >= 53 && LA52_3 <= 55)||LA52_3==57||LA52_3==60||(LA52_3 >= 62 && LA52_3 <= 70)||(LA52_3 >= 75 && LA52_3 <= 77)||LA52_3==83||LA52_3==97||LA52_3==102||LA52_3==106||LA52_3==110) ) {
					alt52=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// TestSuite.g:717:5: 'oclUndefined' LPAREN t= type RPAREN
					{
					match(input,94,FOLLOW_94_in_undefinedLiteral3261); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3263); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral3267);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3269); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 2 :
					// TestSuite.g:720:5: 'Undefined'
					{
					match(input,51,FOLLOW_51_in_undefinedLiteral3283); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;
				case 3 :
					// TestSuite.g:723:5: 'null' LPAREN t= type RPAREN
					{
					match(input,87,FOLLOW_87_in_undefinedLiteral3297); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3299); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral3303);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3305); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 4 :
					// TestSuite.g:726:5: 'null'
					{
					match(input,87,FOLLOW_87_in_undefinedLiteral3319); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "undefinedLiteral"



	// $ANTLR start "tupleLiteral"
	// TestSuite.g:736:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
	public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
		ASTTupleLiteral n = null;


		ASTTupleItem ti =null;

		 List tiList = new ArrayList(); 
		try {
			// TestSuite.g:738:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
			// TestSuite.g:739:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
			{
			match(input,50,FOLLOW_50_in_tupleLiteral3358); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3364); if (state.failed) return n;
			pushFollow(FOLLOW_tupleItem_in_tupleLiteral3372);
			ti=tupleItem();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tiList.add(ti); }
			// TestSuite.g:742:5: ( COMMA ti= tupleItem )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==COMMA) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// TestSuite.g:742:7: COMMA ti= tupleItem
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3383); if (state.failed) return n;
					pushFollow(FOLLOW_tupleItem_in_tupleLiteral3387);
					ti=tupleItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tiList.add(ti); }
					}
					break;

				default :
					break loop53;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3398); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTupleLiteral(tiList); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "tupleItem"
	// TestSuite.g:750:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
	public final ASTTupleItem tupleItem() throws RecognitionException {
		ASTTupleItem n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// TestSuite.g:751:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
			// TestSuite.g:752:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3429); if (state.failed) return n;
			// TestSuite.g:753:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==COLON) ) {
				int LA54_1 = input.LA(2);
				if ( (synpred1_TestSuite()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

			}
			else if ( (LA54_0==EQUAL) ) {
				alt54=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// TestSuite.g:756:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
					{
					match(input,COLON,FOLLOW_COLON_in_tupleItem3468); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_tupleItem3472);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3474); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_tupleItem3478);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?((TestSuiteParser.expression_return)e).n:null)); }
					}
					break;
				case 2 :
					// TestSuite.g:759:7: ( COLON | EQUAL ) e= expression
					{
					if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expression_in_tupleItem3510);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?((TestSuiteParser.expression_return)e).n:null)); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "tupleItem"



	// $ANTLR start "type"
	// TestSuite.g:770:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
	public final ASTType type() throws RecognitionException {
		ASTType n = null;


		ASTSimpleType nTSimple =null;
		ASTCollectionType nTCollection =null;
		ASTTupleType nTTuple =null;

		 Token tok = null; 
		try {
			// TestSuite.g:772:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
			// TestSuite.g:773:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }
			// TestSuite.g:774:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			int alt55=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt55=1;
				}
				break;
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
				{
				alt55=2;
				}
				break;
			case 50:
				{
				alt55=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// TestSuite.g:775:7: nTSimple= simpleType
					{
					pushFollow(FOLLOW_simpleType_in_type3576);
					nTSimple=simpleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 2 :
					// TestSuite.g:776:7: nTCollection= collectionType
					{
					pushFollow(FOLLOW_collectionType_in_type3588);
					nTCollection=collectionType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 3 :
					// TestSuite.g:777:7: nTTuple= tupleType
					{
					pushFollow(FOLLOW_tupleType_in_type3600);
					nTTuple=tupleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTTuple; if (n != null) n.setStartToken(tok); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "type"



	// $ANTLR start "typeOnly"
	// TestSuite.g:782:1: typeOnly returns [ASTType n] : nT= type EOF ;
	public final ASTType typeOnly() throws RecognitionException {
		ASTType n = null;


		ASTType nT =null;

		try {
			// TestSuite.g:783:5: (nT= type EOF )
			// TestSuite.g:784:5: nT= type EOF
			{
			pushFollow(FOLLOW_type_in_typeOnly3632);
			nT=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_typeOnly3634); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nT; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "typeOnly"



	// $ANTLR start "simpleType"
	// TestSuite.g:794:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
	public final ASTSimpleType simpleType() throws RecognitionException {
		ASTSimpleType n = null;


		Token name=null;

		try {
			// TestSuite.g:795:5: (name= IDENT )
			// TestSuite.g:796:5: name= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3662); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTSimpleType(name); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "simpleType"



	// $ANTLR start "collectionType"
	// TestSuite.g:804:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
	public final ASTCollectionType collectionType() throws RecognitionException {
		ASTCollectionType n = null;


		ASTType elemType =null;

		 Token op = null; 
		try {
			// TestSuite.g:806:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
			// TestSuite.g:807:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
			{
			if ( state.backtracking==0 ) { op = input.LT(1); }
			if ( (input.LA(1) >= 45 && input.LA(1) <= 49) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3727); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_collectionType3731);
			elemType=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3733); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTCollectionType(op, elemType); n.setStartToken(op);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "collectionType"



	// $ANTLR start "tupleType"
	// TestSuite.g:817:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
	public final ASTTupleType tupleType() throws RecognitionException {
		ASTTupleType n = null;


		ASTTuplePart tp =null;

		 List tpList = new ArrayList(); 
		try {
			// TestSuite.g:819:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
			// TestSuite.g:820:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
			{
			match(input,50,FOLLOW_50_in_tupleType3767); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3769); if (state.failed) return n;
			pushFollow(FOLLOW_tuplePart_in_tupleType3778);
			tp=tuplePart();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tpList.add(tp); }
			// TestSuite.g:822:5: ( COMMA tp= tuplePart )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==COMMA) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// TestSuite.g:822:7: COMMA tp= tuplePart
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleType3789); if (state.failed) return n;
					pushFollow(FOLLOW_tuplePart_in_tupleType3793);
					tp=tuplePart();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tpList.add(tp); }
					}
					break;

				default :
					break loop56;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3805); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTupleType(tpList); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "tupleType"



	// $ANTLR start "tuplePart"
	// TestSuite.g:831:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
	public final ASTTuplePart tuplePart() throws RecognitionException {
		ASTTuplePart n = null;


		Token name=null;
		ASTType t =null;

		try {
			// TestSuite.g:832:5: (name= IDENT COLON t= type )
			// TestSuite.g:833:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3837); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_tuplePart3839); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_tuplePart3843);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTuplePart(name, t); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "tuplePart"



	// $ANTLR start "shellCommandOnly"
	// TestSuite.g:840:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat );
	public final ASTStatement shellCommandOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;
		ParserRuleReturnScope l =null;

		try {
			// TestSuite.g:841:3: ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==SEMI) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==67) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==44) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==54) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==57) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==68) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==83) ) {
				int LA57_7 = input.LA(2);
				if ( (synpred2_TestSuite()) ) {
					alt57=1;
				}
				else if ( (synpred3_TestSuite()) ) {
					alt57=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA57_0==MINUS||LA57_0==PLUS||LA57_0==86) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==107) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==71) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==INT) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==REAL) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==STRING) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==HASH) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==IDENT) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==45||(LA57_0 >= 47 && LA57_0 <= 49)) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==89) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==46) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==94) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==51) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==87) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==50) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==STAR) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==AT) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==82) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==88||(LA57_0 >= 92 && LA57_0 <= 93)||(LA57_0 >= 100 && LA57_0 <= 101)) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( ((LA57_0 >= 90 && LA57_0 <= 91)) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==LPAREN) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==74) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==85) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==63) ) {
				int LA57_31 = input.LA(2);
				if ( (synpred2_TestSuite()) ) {
					alt57=1;
				}
				else if ( (synpred3_TestSuite()) ) {
					alt57=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 31, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA57_0==77) ) {
				int LA57_32 = input.LA(2);
				if ( (synpred2_TestSuite()) ) {
					alt57=1;
				}
				else if ( (synpred3_TestSuite()) ) {
					alt57=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 32, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA57_0==62) ) {
				int LA57_33 = input.LA(2);
				if ( (synpred2_TestSuite()) ) {
					alt57=1;
				}
				else if ( (synpred3_TestSuite()) ) {
					alt57=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 33, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA57_0==72) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==109) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==56) && (synpred2_TestSuite())) {
				alt57=1;
			}
			else if ( (LA57_0==95) && (synpred3_TestSuite())) {
				alt57=2;
			}
			else if ( (LA57_0==96) && (synpred3_TestSuite())) {
				alt57=2;
			}
			else if ( (LA57_0==60) && (synpred3_TestSuite())) {
				alt57=2;
			}
			else if ( (LA57_0==55) && (synpred3_TestSuite())) {
				alt57=2;
			}
			else if ( (LA57_0==70) && (synpred3_TestSuite())) {
				alt57=2;
			}
			else if ( (LA57_0==102) && (synpred3_TestSuite())) {
				alt57=2;
			}

			switch (alt57) {
				case 1 :
					// TestSuite.g:842:3: ( stat )=>s= stat
					{
					pushFollow(FOLLOW_stat_in_shellCommandOnly3880);
					s=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s!=null?((TestSuiteParser.stat_return)s).n:null); }
					}
					break;
				case 2 :
					// TestSuite.g:845:3: ( legacyStat )=>l= legacyStat
					{
					pushFollow(FOLLOW_legacyStat_in_shellCommandOnly3901);
					l=legacyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (l!=null?((TestSuiteParser.legacyStat_return)l).n:null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "shellCommandOnly"



	// $ANTLR start "shellCommand"
	// TestSuite.g:853:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF );
	public final ASTStatement shellCommand() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope l =null;
		ParserRuleReturnScope s =null;

		try {
			// TestSuite.g:854:3: ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==95) && (synpred4_TestSuite())) {
				alt58=1;
			}
			else if ( (LA58_0==96) && (synpred4_TestSuite())) {
				alt58=1;
			}
			else if ( (LA58_0==60) && (synpred4_TestSuite())) {
				alt58=1;
			}
			else if ( (LA58_0==55) && (synpred4_TestSuite())) {
				alt58=1;
			}
			else if ( (LA58_0==83) ) {
				int LA58_5 = input.LA(2);
				if ( (synpred4_TestSuite()) ) {
					alt58=1;
				}
				else if ( (synpred5_TestSuite()) ) {
					alt58=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA58_0==70) && (synpred4_TestSuite())) {
				alt58=1;
			}
			else if ( (LA58_0==63) ) {
				int LA58_7 = input.LA(2);
				if ( (synpred4_TestSuite()) ) {
					alt58=1;
				}
				else if ( (synpred5_TestSuite()) ) {
					alt58=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA58_0==102) && (synpred4_TestSuite())) {
				alt58=1;
			}
			else if ( (LA58_0==77) ) {
				int LA58_9 = input.LA(2);
				if ( (synpred4_TestSuite()) ) {
					alt58=1;
				}
				else if ( (synpred5_TestSuite()) ) {
					alt58=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA58_0==62) ) {
				int LA58_10 = input.LA(2);
				if ( (synpred4_TestSuite()) ) {
					alt58=1;
				}
				else if ( (synpred5_TestSuite()) ) {
					alt58=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA58_0==SEMI) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==EOF) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==MINUS||LA58_0==PLUS||LA58_0==86) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==107) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==71) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==INT) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==REAL) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==STRING) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==HASH) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==IDENT) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==45||(LA58_0 >= 47 && LA58_0 <= 49)) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==89) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==46) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==94) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==51) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==87) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==50) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==STAR) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==AT) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==82) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==88||(LA58_0 >= 92 && LA58_0 <= 93)||(LA58_0 >= 100 && LA58_0 <= 101)) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( ((LA58_0 >= 90 && LA58_0 <= 91)) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==LPAREN) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==74) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==85) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==72) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==109) && (synpred5_TestSuite())) {
				alt58=2;
			}
			else if ( (LA58_0==56) && (synpred5_TestSuite())) {
				alt58=2;
			}

			switch (alt58) {
				case 1 :
					// TestSuite.g:855:3: ( legacyStat )=>l= legacyStat EOF
					{
					pushFollow(FOLLOW_legacyStat_in_shellCommand3933);
					l=legacyStat();
					state._fsp--;
					if (state.failed) return n;
					match(input,EOF,FOLLOW_EOF_in_shellCommand3935); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (l!=null?((TestSuiteParser.legacyStat_return)l).n:null); }
					}
					break;
				case 2 :
					// TestSuite.g:858:3: ( stat )=>s= stat EOF
					{
					pushFollow(FOLLOW_stat_in_shellCommand3956);
					s=stat();
					state._fsp--;
					if (state.failed) return n;
					match(input,EOF,FOLLOW_EOF_in_shellCommand3958); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s!=null?((TestSuiteParser.stat_return)s).n:null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "shellCommand"


	public static class legacyStat_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "legacyStat"
	// TestSuite.g:868:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
	public final TestSuiteParser.legacyStat_return legacyStat() throws RecognitionException {
		TestSuiteParser.legacyStat_return retval = new TestSuiteParser.legacyStat_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope loe =null;
		ParserRuleReturnScope lox =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// TestSuite.g:872:3: (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
			int alt60=3;
			switch ( input.LA(1) ) {
			case 95:
				{
				alt60=1;
				}
				break;
			case 96:
				{
				alt60=2;
				}
				break;
			case 55:
			case 60:
			case 62:
			case 63:
			case 70:
			case 77:
			case 83:
			case 102:
				{
				alt60=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// TestSuite.g:873:3: loe= legacyOpEnter
					{
					pushFollow(FOLLOW_legacyOpEnter_in_legacyStat3992);
					loe=legacyOpEnter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = (loe!=null?((TestSuiteParser.legacyOpEnter_return)loe).n:null);
					  }
					}
					break;
				case 2 :
					// TestSuite.g:878:3: lox= legacyOpExit
					{
					pushFollow(FOLLOW_legacyOpExit_in_legacyStat4008);
					lox=legacyOpExit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = (lox!=null?((TestSuiteParser.legacyOpExit_return)lox).n:null); 
					  }
					}
					break;
				case 3 :
					// TestSuite.g:883:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
					{
					pushFollow(FOLLOW_nextLegacyStat_in_legacyStat4021);
					nextLegacyStat(seq);
					state._fsp--;
					if (state.failed) return retval;
					// TestSuite.g:884:3: ( nextLegacyStat[seq] )*
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==55||LA59_0==60||(LA59_0 >= 62 && LA59_0 <= 63)||LA59_0==70||LA59_0==77||LA59_0==83||LA59_0==102) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// TestSuite.g:885:5: nextLegacyStat[seq]
							{
							pushFollow(FOLLOW_nextLegacyStat_in_legacyStat4032);
							nextLegacyStat(seq);
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop59;
						}
					}

					if ( state.backtracking==0 ) { 
					    retval.n = seq.simplify();
					  }
					}
					break;

			}
			retval.stop = input.LT(-1);

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
	// $ANTLR end "legacyStat"



	// $ANTLR start "nextLegacyStat"
	// TestSuite.g:897:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
	public final void nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
		ASTStatement s =null;

		try {
			// TestSuite.g:898:3: (s= singleLegacyStat ( SEMI )? )
			// TestSuite.g:899:3: s= singleLegacyStat ( SEMI )?
			{
			pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat4066);
			s=singleLegacyStat();
			state._fsp--;
			if (state.failed) return;
			// TestSuite.g:900:3: ( SEMI )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==SEMI) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// TestSuite.g:900:3: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat4070); if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			     seq.addStatement(s);
			  }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nextLegacyStat"



	// $ANTLR start "singleLegacyStat"
	// TestSuite.g:911:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat );
	public final ASTStatement singleLegacyStat() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope lcr =null;
		ParserRuleReturnScope lca =null;
		ParserRuleReturnScope lci =null;
		ParserRuleReturnScope llt =null;
		ASTStatement lex =null;
		ParserRuleReturnScope ods =null;
		ParserRuleReturnScope e =null;
		ASTAttributeAssignmentStatement aas =null;
		ParserRuleReturnScope lis =null;
		ParserRuleReturnScope lds =null;

		try {
			// TestSuite.g:912:5: (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat )
			int alt62=9;
			switch ( input.LA(1) ) {
			case 60:
				{
				int LA62_1 = input.LA(2);
				if ( (LA62_1==IDENT) ) {
					int LA62_9 = input.LA(3);
					if ( (LA62_9==COLON) ) {
						int LA62_10 = input.LA(4);
						if ( (LA62_10==IDENT) ) {
							int LA62_12 = input.LA(5);
							if ( (LA62_12==58) ) {
								alt62=3;
							}
							else if ( (LA62_12==EOF||LA62_12==SEMI||LA62_12==44||(LA62_12 >= 54 && LA62_12 <= 55)||LA62_12==57||LA62_12==60||(LA62_12 >= 62 && LA62_12 <= 63)||(LA62_12 >= 67 && LA62_12 <= 68)||LA62_12==70||LA62_12==77||LA62_12==83||LA62_12==102) ) {
								alt62=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return n;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 62, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 62, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA62_9==COMMA) ) {
						alt62=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 62, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 55:
				{
				alt62=2;
				}
				break;
			case 83:
				{
				alt62=4;
				}
				break;
			case 70:
				{
				alt62=5;
				}
				break;
			case 63:
				{
				alt62=6;
				}
				break;
			case 102:
				{
				alt62=7;
				}
				break;
			case 77:
				{
				alt62=8;
				}
				break;
			case 62:
				{
				alt62=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// TestSuite.g:913:5: lcr= legacyCreate
					{
					pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat4103);
					lcr=legacyCreate();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lcr!=null?((TestSuiteParser.legacyCreate_return)lcr).n:null); }
					}
					break;
				case 2 :
					// TestSuite.g:914:5: lca= legacyCreateAssign
					{
					pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat4122);
					lca=legacyCreateAssign();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lca!=null?((TestSuiteParser.legacyCreateAssign_return)lca).n:null); }
					}
					break;
				case 3 :
					// TestSuite.g:915:5: lci= legacyCreateInsert
					{
					pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat4135);
					lci=legacyCreateInsert();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lci!=null?((TestSuiteParser.legacyCreateInsert_return)lci).n:null); }
					}
					break;
				case 4 :
					// TestSuite.g:916:5: llt= legacyLet
					{
					pushFollow(FOLLOW_legacyLet_in_singleLegacyStat4148);
					llt=legacyLet();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (llt!=null?((TestSuiteParser.legacyLet_return)llt).n:null); }
					}
					break;
				case 5 :
					// TestSuite.g:919:5: lex= legacyExecute
					{
					pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat4176);
					lex=legacyExecute();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = lex; }
					}
					break;
				case 6 :
					// TestSuite.g:920:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat4194);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((TestSuiteParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 7 :
					// TestSuite.g:921:5: 'set' e= expression aas= attAssignStat[$e.n]
					{
					match(input,102,FOLLOW_102_in_singleLegacyStat4207); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_singleLegacyStat4211);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat4217);
					aas=attAssignStat((e!=null?((TestSuiteParser.expression_return)e).n:null));
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = aas; }
					}
					break;
				case 8 :
					// TestSuite.g:922:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat4230);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((TestSuiteParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 9 :
					// TestSuite.g:923:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat4251);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((TestSuiteParser.lnkDelStat_return)lds).n:null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "singleLegacyStat"


	public static class legacyCreate_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "legacyCreate"
	// TestSuite.g:936:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
	public final TestSuiteParser.legacyCreate_return legacyCreate() throws RecognitionException {
		TestSuiteParser.legacyCreate_return retval = new TestSuiteParser.legacyCreate_return();
		retval.start = input.LT(1);

		List<String> objNames =null;
		ASTSimpleType objType =null;

		try {
			// TestSuite.g:937:3: ( 'create' objNames= identListMin1 COLON objType= simpleType )
			// TestSuite.g:938:3: 'create' objNames= identListMin1 COLON objType= simpleType
			{
			match(input,60,FOLLOW_60_in_legacyCreate4287); if (state.failed) return retval;
			pushFollow(FOLLOW_identListMin1_in_legacyCreate4295);
			objNames=identListMin1();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_legacyCreate4299); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_legacyCreate4307);
			objType=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { 
			    ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));
			    
			    for (String objName : objNames) {
			      seq.addStatement(
			        new ASTNewObjectStatement(
			          (retval.start),
			          objType, 
			          new ASTStringLiteral(objName)));
			    }
			    
			    retval.n = seq.simplify();
			  }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "legacyCreate"


	public static class legacyCreateAssign_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "legacyCreateAssign"
	// TestSuite.g:969:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
	public final TestSuiteParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
		TestSuiteParser.legacyCreateAssign_return retval = new TestSuiteParser.legacyCreateAssign_return();
		retval.start = input.LT(1);

		List<String> varNames =null;
		ASTSimpleType objType =null;

		try {
			// TestSuite.g:970:3: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
			// TestSuite.g:971:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
			{
			match(input,55,FOLLOW_55_in_legacyCreateAssign4344); if (state.failed) return retval;
			pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign4352);
			varNames=identListMin1();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign4356); if (state.failed) return retval;
			match(input,60,FOLLOW_60_in_legacyCreateAssign4360); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_legacyCreateAssign4368);
			objType=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			    ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));
			    
			    for (String varName : varNames) {
			      seq.addStatement(
			        new ASTVariableAssignmentStatement(
			          (retval.start),
			          varName, 
			          new ASTRValueNewObject((retval.start), objType)));
			    }
			    
			    retval.n = seq.simplify();
			  }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "legacyCreateAssign"


	public static class legacyCreateInsert_return extends ParserRuleReturnScope {
		public ASTVariableAssignmentStatement n;
	};


	// $ANTLR start "legacyCreateInsert"
	// TestSuite.g:1004:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
	public final TestSuiteParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
		TestSuiteParser.legacyCreateInsert_return retval = new TestSuiteParser.legacyCreateInsert_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTSimpleType asClassName =null;
		ParserRuleReturnScope participants =null;

		try {
			// TestSuite.g:1005:3: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
			// TestSuite.g:1006:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
			{
			match(input,60,FOLLOW_60_in_legacyCreateInsert4402); if (state.failed) return retval;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert4410); if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert4414); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_legacyCreateInsert4422);
			asClassName=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			match(input,58,FOLLOW_58_in_legacyCreateInsert4426); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert4430); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4440);
			participants=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert4444); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			    ASTNewLinkObjectStatement nlo = 
			      new ASTNewLinkObjectStatement(
			        (retval.start),
			        asClassName, 
			        (participants!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)participants).participans:null),
			        (participants!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)participants).qualifiers:null),
			        new ASTStringLiteral(name));
			  
			    retval.n = new ASTVariableAssignmentStatement((retval.start),
			      (name!=null?name.getText():null),
			      new ASTRValueNewLinkObject(nlo));
			  }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "legacyCreateInsert"


	public static class legacyLet_return extends ParserRuleReturnScope {
		public ASTVariableAssignmentStatement n;
	};


	// $ANTLR start "legacyLet"
	// TestSuite.g:1041:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
	public final TestSuiteParser.legacyLet_return legacyLet() throws RecognitionException {
		TestSuiteParser.legacyLet_return retval = new TestSuiteParser.legacyLet_return();
		retval.start = input.LT(1);

		Token varName=null;
		ASTType varType =null;
		ASTExpression e =null;

		try {
			// TestSuite.g:1042:3: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
			// TestSuite.g:1043:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
			{
			match(input,83,FOLLOW_83_in_legacyLet4477); if (state.failed) return retval;
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet4485); if (state.failed) return retval;
			// TestSuite.g:1045:3: ( COLON varType= type )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==COLON) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// TestSuite.g:1046:5: COLON varType= type
					{
					match(input,COLON,FOLLOW_COLON_in_legacyLet4495); if (state.failed) return retval;
					pushFollow(FOLLOW_type_in_legacyLet4505);
					varType=type();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet4514); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_legacyLet4522);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTVariableAssignmentStatement((retval.start), (varName!=null?varName.getText():null), e, varType); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "legacyLet"


	public static class legacyOpEnter_return extends ParserRuleReturnScope {
		public ASTEnterOperationStatement n;
	};


	// $ANTLR start "legacyOpEnter"
	// TestSuite.g:1067:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
	public final TestSuiteParser.legacyOpEnter_return legacyOpEnter() throws RecognitionException {
		TestSuiteParser.legacyOpEnter_return retval = new TestSuiteParser.legacyOpEnter_return();
		retval.start = input.LT(1);

		Token op=null;
		ASTExpression obj =null;
		List<ASTExpression> args =null;

		try {
			// TestSuite.g:1068:3: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
			// TestSuite.g:1069:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
			{
			match(input,95,FOLLOW_95_in_legacyOpEnter4555); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter4563);
			obj=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter4571); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter4575); if (state.failed) return retval;
			pushFollow(FOLLOW_exprList_in_legacyOpEnter4585);
			args=exprList();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter4589); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTEnterOperationStatement((retval.start), obj, (op!=null?op.getText():null), args); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "legacyOpEnter"


	public static class legacyOpExit_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "legacyOpExit"
	// TestSuite.g:1092:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
	public final TestSuiteParser.legacyOpExit_return legacyOpExit() throws RecognitionException {
		TestSuiteParser.legacyOpExit_return retval = new TestSuiteParser.legacyOpExit_return();
		retval.start = input.LT(1);

		ASTExpression retVal =null;

		try {
			// TestSuite.g:1093:3: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
			// TestSuite.g:1094:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
			{
			match(input,96,FOLLOW_96_in_legacyOpExit4624); if (state.failed) return retval;
			// TestSuite.g:1094:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==83) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==MINUS||LA64_0==PLUS||LA64_0==86) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==107) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==71) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==INT) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==REAL) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==STRING) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==HASH) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==IDENT) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==45||(LA64_0 >= 47 && LA64_0 <= 49)) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==89) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==46) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==94) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==51) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==87) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==50) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==STAR) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==AT) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==82) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==88||(LA64_0 >= 92 && LA64_0 <= 93)||(LA64_0 >= 100 && LA64_0 <= 101)) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( ((LA64_0 >= 90 && LA64_0 <= 91)) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==LPAREN) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==74) && (synpred6_TestSuite())) {
				alt64=1;
			}
			else if ( (LA64_0==EOF||LA64_0==44||LA64_0==54||LA64_0==57||(LA64_0 >= 67 && LA64_0 <= 68)) ) {
				alt64=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// TestSuite.g:1094:13: ( inSoilExpression )=>retVal= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit4636);
					retVal=inSoilExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// TestSuite.g:1094:62: nothing
					{
					pushFollow(FOLLOW_nothing_in_legacyOpExit4640);
					nothing();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) { retval.n = new ASTExitOperationStatement((retval.start), retVal); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "legacyOpExit"



	// $ANTLR start "legacyExecute"
	// TestSuite.g:1109:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
	public final ASTStatement legacyExecute() throws RecognitionException {
		ASTStatement n = null;


		try {
			// TestSuite.g:1110:3: ( 'execute' expression )
			// TestSuite.g:1111:3: 'execute' expression
			{
			match(input,70,FOLLOW_70_in_legacyExecute4673); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_legacyExecute4677);
			expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { 
			    reportWarning("the execute command is not supported in this version"); 
			    n = new ASTEmptyStatement();
			  }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "legacyExecute"



	// $ANTLR start "statOnly"
	// TestSuite.g:1155:1: statOnly returns [ASTStatement n] : s= stat EOF ;
	public final ASTStatement statOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;

		try {
			// TestSuite.g:1156:3: (s= stat EOF )
			// TestSuite.g:1157:3: s= stat EOF
			{
			pushFollow(FOLLOW_stat_in_statOnly4723);
			s=stat();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_statOnly4727); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = (s!=null?((TestSuiteParser.stat_return)s).n:null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "statOnly"


	public static class stat_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "stat"
	// TestSuite.g:1167:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
	public final TestSuiteParser.stat_return stat() throws RecognitionException {
		TestSuiteParser.stat_return retval = new TestSuiteParser.stat_return();
		retval.start = input.LT(1);

		ASTStatement s =null;
		ASTStatement s2 =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// TestSuite.g:1171:3: (s= singleStat ( SEMI s2= singleStat )* )
			// TestSuite.g:1172:3: s= singleStat ( SEMI s2= singleStat )*
			{
			pushFollow(FOLLOW_singleStat_in_stat4762);
			s=singleStat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {seq.addStatement(s);}
			// TestSuite.g:1173:3: ( SEMI s2= singleStat )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==SEMI) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// TestSuite.g:1174:5: SEMI s2= singleStat
					{
					match(input,SEMI,FOLLOW_SEMI_in_stat4774); if (state.failed) return retval;
					pushFollow(FOLLOW_singleStat_in_stat4784);
					s2=singleStat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {seq.addStatement(s2); }
					}
					break;

				default :
					break loop65;
				}
			}

			if ( state.backtracking==0 ) { 
			    retval.n = seq.simplify();
			  }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "stat"



	// $ANTLR start "singleStat"
	// TestSuite.g:1186:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
	public final ASTStatement singleStat() throws RecognitionException {
		ASTStatement n = null;


		ASTEmptyStatement emp =null;
		ParserRuleReturnScope sse =null;
		ASTStatement vas =null;
		ParserRuleReturnScope ocs =null;
		ParserRuleReturnScope ods =null;
		ParserRuleReturnScope lis =null;
		ParserRuleReturnScope lds =null;
		ParserRuleReturnScope ces =null;
		ParserRuleReturnScope its =null;
		ParserRuleReturnScope whs =null;
		ParserRuleReturnScope blk =null;

		try {
			// TestSuite.g:1187:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
			int alt66=11;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==EOF||LA66_0==SEMI||LA66_0==44||LA66_0==54||LA66_0==57||(LA66_0 >= 66 && LA66_0 <= 68)) ) {
				alt66=1;
			}
			else if ( (LA66_0==83) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==MINUS||LA66_0==PLUS||LA66_0==86) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==107) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==71) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==INT) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==REAL) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==STRING) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==HASH) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==IDENT) ) {
				int LA66_17 = input.LA(2);
				if ( (synpred7_TestSuite()) ) {
					alt66=2;
				}
				else if ( (true) ) {
					alt66=3;
				}

			}
			else if ( (LA66_0==45||(LA66_0 >= 47 && LA66_0 <= 49)) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==89) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==46) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==94) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==51) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==87) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==50) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==STAR) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==AT) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==82) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==88||(LA66_0 >= 92 && LA66_0 <= 93)||(LA66_0 >= 100 && LA66_0 <= 101)) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( ((LA66_0 >= 90 && LA66_0 <= 91)) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==LPAREN) && (synpred7_TestSuite())) {
				alt66=2;
			}
			else if ( (LA66_0==74) ) {
				int LA66_31 = input.LA(2);
				if ( (synpred7_TestSuite()) ) {
					alt66=2;
				}
				else if ( (true) ) {
					alt66=8;
				}

			}
			else if ( (LA66_0==85) ) {
				alt66=4;
			}
			else if ( (LA66_0==63) ) {
				alt66=5;
			}
			else if ( (LA66_0==77) ) {
				alt66=6;
			}
			else if ( (LA66_0==62) ) {
				alt66=7;
			}
			else if ( (LA66_0==72) ) {
				alt66=9;
			}
			else if ( (LA66_0==109) ) {
				alt66=10;
			}
			else if ( (LA66_0==56) ) {
				alt66=11;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// TestSuite.g:1188:5: emp= emptyStat
					{
					pushFollow(FOLLOW_emptyStat_in_singleStat4824);
					emp=emptyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = emp; }
					}
					break;
				case 2 :
					// TestSuite.g:1190:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
					{
					pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4850);
					sse=statStartingWithExpr();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (sse!=null?((TestSuiteParser.statStartingWithExpr_return)sse).n:null); }
					}
					break;
				case 3 :
					// TestSuite.g:1191:5: vas= varAssignStat
					{
					pushFollow(FOLLOW_varAssignStat_in_singleStat4862);
					vas=varAssignStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = vas; }
					}
					break;
				case 4 :
					// TestSuite.g:1192:5: ocs= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_singleStat4876);
					ocs=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ocs!=null?((TestSuiteParser.objCreateStat_return)ocs).n:null); }
					}
					break;
				case 5 :
					// TestSuite.g:1193:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleStat4890);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((TestSuiteParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 6 :
					// TestSuite.g:1194:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleStat4903);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((TestSuiteParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 7 :
					// TestSuite.g:1195:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleStat4920);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((TestSuiteParser.lnkDelStat_return)lds).n:null); }
					}
					break;
				case 8 :
					// TestSuite.g:1196:5: ces= condExStat
					{
					pushFollow(FOLLOW_condExStat_in_singleStat4937);
					ces=condExStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ces!=null?((TestSuiteParser.condExStat_return)ces).n:null); }
					}
					break;
				case 9 :
					// TestSuite.g:1197:5: its= iterStat
					{
					pushFollow(FOLLOW_iterStat_in_singleStat4954);
					its=iterStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (its!=null?((TestSuiteParser.iterStat_return)its).n:null); }
					}
					break;
				case 10 :
					// TestSuite.g:1199:5: whs= whileStat
					{
					pushFollow(FOLLOW_whileStat_in_singleStat4976);
					whs=whileStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (whs!=null?((TestSuiteParser.whileStat_return)whs).n:null); }
					}
					break;
				case 11 :
					// TestSuite.g:1200:5: blk= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_singleStat4994);
					blk=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (blk!=null?((TestSuiteParser.blockStat_return)blk).n:null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "singleStat"



	// $ANTLR start "emptyStat"
	// TestSuite.g:1207:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
	public final ASTEmptyStatement emptyStat() throws RecognitionException {
		ASTEmptyStatement n = null;


		try {
			// TestSuite.g:1208:3: ( nothing )
			// TestSuite.g:1209:3: nothing
			{
			pushFollow(FOLLOW_nothing_in_emptyStat5021);
			nothing();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTEmptyStatement(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "emptyStat"


	public static class statStartingWithExpr_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "statStartingWithExpr"
	// TestSuite.g:1214:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
	public final TestSuiteParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
		TestSuiteParser.statStartingWithExpr_return retval = new TestSuiteParser.statStartingWithExpr_return();
		retval.start = input.LT(1);

		ASTExpression expr =null;
		ASTAttributeAssignmentStatement aas =null;

		try {
			// TestSuite.g:1215:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
			// TestSuite.g:1216:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
			{
			pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr5047);
			expr=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			// TestSuite.g:1217:3: (aas= attAssignStat[$expr.n] )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==DOT) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// TestSuite.g:1218:5: aas= attAssignStat[$expr.n]
					{
					pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr5061);
					aas=attAssignStat(expr);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n = aas; }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    if (aas == null) {
			      retval.n = new ASTOperationCallStatement((retval.start), expr); 
			    }
			  }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "statStartingWithExpr"



	// $ANTLR start "varAssignStat"
	// TestSuite.g:1230:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
	public final ASTStatement varAssignStat() throws RecognitionException {
		ASTStatement n = null;


		Token varName=null;
		ASTRValue rVal =null;

		try {
			// TestSuite.g:1231:3: (varName= IDENT COLON_EQUAL rVal= rValue )
			// TestSuite.g:1232:3: varName= IDENT COLON_EQUAL rVal= rValue
			{
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat5099); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat5103); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_varAssignStat5111);
			rVal=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {
			    n = new ASTVariableAssignmentStatement(varName, (varName!=null?varName.getText():null), rVal);
			  }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "varAssignStat"



	// $ANTLR start "attAssignStat"
	// TestSuite.g:1244:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
	public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
		ASTAttributeAssignmentStatement n = null;


		Token attName=null;
		ASTRValue r =null;

		try {
			// TestSuite.g:1245:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
			// TestSuite.g:1246:3: DOT attName= IDENT COLON_EQUAL r= rValue
			{
			match(input,DOT,FOLLOW_DOT_in_attAssignStat5135); if (state.failed) return n;
			attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat5144); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat5148); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_attAssignStat5156);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAttributeAssignmentStatement(attName, exp, (attName!=null?attName.getText():null), r); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "attAssignStat"


	public static class objCreateStat_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "objCreateStat"
	// TestSuite.g:1258:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
	public final TestSuiteParser.objCreateStat_return objCreateStat() throws RecognitionException {
		TestSuiteParser.objCreateStat_return retval = new TestSuiteParser.objCreateStat_return();
		retval.start = input.LT(1);

		ASTSimpleType ident =null;
		ASTExpression objName =null;
		ParserRuleReturnScope p =null;

		try {
			// TestSuite.g:1259:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
			// TestSuite.g:1260:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			{
			match(input,85,FOLLOW_85_in_objCreateStat5182); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_objCreateStat5190);
			ident=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			// TestSuite.g:1262:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==LPAREN) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// TestSuite.g:1263:5: LPAREN (objName= inSoilExpression )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5200); if (state.failed) return retval;
					// TestSuite.g:1264:7: (objName= inSoilExpression )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==AT||LA68_0==HASH||(LA68_0 >= IDENT && LA68_0 <= INT)||(LA68_0 >= LPAREN && LA68_0 <= MINUS)||LA68_0==PLUS||LA68_0==REAL||(LA68_0 >= STAR && LA68_0 <= STRING)||(LA68_0 >= 45 && LA68_0 <= 51)||LA68_0==71||LA68_0==74||(LA68_0 >= 82 && LA68_0 <= 83)||(LA68_0 >= 86 && LA68_0 <= 94)||(LA68_0 >= 100 && LA68_0 <= 101)||LA68_0==107) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// TestSuite.g:1264:8: objName= inSoilExpression
							{
							pushFollow(FOLLOW_inSoilExpression_in_objCreateStat5213);
							objName=inSoilExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5221); if (state.failed) return retval;
					}
					break;

			}

			// TestSuite.g:1268:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==58) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// TestSuite.g:1269:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
					{
					match(input,58,FOLLOW_58_in_objCreateStat5239); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5247); if (state.failed) return retval;
					pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5261);
					p=rValListMin2WithOptionalQualifiers();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5269); if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = new ASTNewLinkObjectStatement((retval.start), ident, (p!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null), objName);
					    }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    if (retval.n == null) {
			      retval.n = new ASTNewObjectStatement((retval.start), ident, objName);
			    }
			  }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "objCreateStat"


	public static class objDestroyStat_return extends ParserRuleReturnScope {
		public ASTStatement n;
	};


	// $ANTLR start "objDestroyStat"
	// TestSuite.g:1288:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
	public final TestSuiteParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
		TestSuiteParser.objDestroyStat_return retval = new TestSuiteParser.objDestroyStat_return();
		retval.start = input.LT(1);

		List<ASTExpression> el =null;

		try {
			// TestSuite.g:1289:3: ( 'destroy' el= exprListMin1 )
			// TestSuite.g:1290:3: 'destroy' el= exprListMin1
			{
			match(input,63,FOLLOW_63_in_objDestroyStat5305); if (state.failed) return retval;
			pushFollow(FOLLOW_exprListMin1_in_objDestroyStat5313);
			el=exprListMin1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			    ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));
			    
			    for (ASTExpression expression : el) {
			      seq.addStatement(
			        new ASTObjectDestructionStatement((retval.start), expression));
			    }
			    
			    retval.n = seq.simplify();
			  }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "objDestroyStat"


	public static class lnkInsStat_return extends ParserRuleReturnScope {
		public ASTLinkInsertionStatement n;
	};


	// $ANTLR start "lnkInsStat"
	// TestSuite.g:1309:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
	public final TestSuiteParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
		TestSuiteParser.lnkInsStat_return retval = new TestSuiteParser.lnkInsStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// TestSuite.g:1310:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
			// TestSuite.g:1311:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
			{
			match(input,77,FOLLOW_77_in_lnkInsStat5339); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat5343); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5353);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat5357); if (state.failed) return retval;
			match(input,78,FOLLOW_78_in_lnkInsStat5361); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat5369); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkInsertionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "lnkInsStat"


	public static class rValListMin2WithOptionalQualifiers_return extends ParserRuleReturnScope {
		public List<ASTRValue> participans;
		public List<List<ASTRValue>> qualifiers;
	};


	// $ANTLR start "rValListMin2WithOptionalQualifiers"
	// TestSuite.g:1321:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
	public final TestSuiteParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
		TestSuiteParser.rValListMin2WithOptionalQualifiers_return retval = new TestSuiteParser.rValListMin2WithOptionalQualifiers_return();
		retval.start = input.LT(1);

		ASTRValue r =null;
		List<ASTRValue> qualifierValues =null;


		  retval.participans = new ArrayList<ASTRValue>();
		  retval.qualifiers = new ArrayList<List<ASTRValue>>();
		  List<ASTRValue> currentQualifiers = Collections.emptyList();

		try {
			// TestSuite.g:1327:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
			// TestSuite.g:1328:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5398);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// TestSuite.g:1329:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==LBRACE) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// TestSuite.g:1330:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5409); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5418);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5425); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5441); if (state.failed) return retval;
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5452);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// TestSuite.g:1342:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==LBRACE) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// TestSuite.g:1343:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5463); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5472);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5479); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			// TestSuite.g:1352:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==COMMA) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// TestSuite.g:1353:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5501); if (state.failed) return retval;
					pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5516);
					r=rValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.participans.add(r); }
					// TestSuite.g:1357:5: ( LBRACE qualifierValues= rValList RBRACE )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==LBRACE) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// TestSuite.g:1358:6: LBRACE qualifierValues= rValList RBRACE
							{
							match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5536); if (state.failed) return retval;
							pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5547);
							qualifierValues=rValList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
							match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5556); if (state.failed) return retval;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					      retval.qualifiers.add(currentQualifiers);
					      currentQualifiers = Collections.emptyList();
					    }
					}
					break;

				default :
					break loop74;
				}
			}

			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "rValListMin2WithOptionalQualifiers"


	public static class lnkDelStat_return extends ParserRuleReturnScope {
		public ASTLinkDeletionStatement n;
	};


	// $ANTLR start "lnkDelStat"
	// TestSuite.g:1373:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
	public final TestSuiteParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
		TestSuiteParser.lnkDelStat_return retval = new TestSuiteParser.lnkDelStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// TestSuite.g:1374:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
			// TestSuite.g:1375:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
			{
			match(input,62,FOLLOW_62_in_lnkDelStat5597); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat5601); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5611);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat5615); if (state.failed) return retval;
			match(input,73,FOLLOW_73_in_lnkDelStat5619); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat5628); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkDeletionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((TestSuiteParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "lnkDelStat"


	public static class condExStat_return extends ParserRuleReturnScope {
		public ASTConditionalExecutionStatement n;
	};


	// $ANTLR start "condExStat"
	// TestSuite.g:1389:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
	public final TestSuiteParser.condExStat_return condExStat() throws RecognitionException {
		TestSuiteParser.condExStat_return retval = new TestSuiteParser.condExStat_return();
		retval.start = input.LT(1);

		ASTExpression con =null;
		ASTStatement ts =null;
		ASTStatement es =null;


		  ASTStatement elseStat = new ASTEmptyStatement();

		try {
			// TestSuite.g:1393:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
			// TestSuite.g:1394:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
			{
			match(input,74,FOLLOW_74_in_condExStat5659); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_condExStat5668);
			con=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,106,FOLLOW_106_in_condExStat5672); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5681);
			ts=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			// TestSuite.g:1398:3: ( 'else' es= statOrImplicitBlock )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==66) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// TestSuite.g:1399:5: 'else' es= statOrImplicitBlock
					{
					match(input,66,FOLLOW_66_in_condExStat5692); if (state.failed) return retval;
					pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5704);
					es=statOrImplicitBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { elseStat = es; }
					}
					break;

			}

			match(input,67,FOLLOW_67_in_condExStat5716); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTConditionalExecutionStatement((retval.start), con, ts, elseStat); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "condExStat"


	public static class iterStat_return extends ParserRuleReturnScope {
		public ASTIterationStatement n;
	};


	// $ANTLR start "iterStat"
	// TestSuite.g:1410:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final TestSuiteParser.iterStat_return iterStat() throws RecognitionException {
		TestSuiteParser.iterStat_return retval = new TestSuiteParser.iterStat_return();
		retval.start = input.LT(1);

		Token var=null;
		ASTExpression set =null;
		ASTStatement s =null;

		try {
			// TestSuite.g:1411:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// TestSuite.g:1412:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,72,FOLLOW_72_in_iterStat5741); if (state.failed) return retval;
			var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat5749); if (state.failed) return retval;
			match(input,76,FOLLOW_76_in_iterStat5753); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_iterStat5761);
			set=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,65,FOLLOW_65_in_iterStat5765); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat5773);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,67,FOLLOW_67_in_iterStat5778); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTIterationStatement((retval.start), (var!=null?var.getText():null), set, s); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "iterStat"


	public static class whileStat_return extends ParserRuleReturnScope {
		public ASTWhileStatement n;
	};


	// $ANTLR start "whileStat"
	// TestSuite.g:1427:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final TestSuiteParser.whileStat_return whileStat() throws RecognitionException {
		TestSuiteParser.whileStat_return retval = new TestSuiteParser.whileStat_return();
		retval.start = input.LT(1);

		ASTExpression cond =null;
		ASTStatement s =null;

		try {
			// TestSuite.g:1428:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// TestSuite.g:1429:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,109,FOLLOW_109_in_whileStat5804); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_whileStat5812);
			cond=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,65,FOLLOW_65_in_whileStat5816); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat5824);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,67,FOLLOW_67_in_whileStat5829); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTWhileStatement((retval.start), cond, s); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "whileStat"


	public static class blockStat_return extends ParserRuleReturnScope {
		public ASTBlockStatement n;
	};


	// $ANTLR start "blockStat"
	// TestSuite.g:1441:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
	public final TestSuiteParser.blockStat_return blockStat() throws RecognitionException {
		TestSuiteParser.blockStat_return retval = new TestSuiteParser.blockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

		try {
			// TestSuite.g:1445:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
			// TestSuite.g:1446:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
			{
			match(input,56,FOLLOW_56_in_blockStat5859); if (state.failed) return retval;
			// TestSuite.g:1447:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==61) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// TestSuite.g:1447:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
					{
					match(input,61,FOLLOW_61_in_blockStat5864); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_blockStat5870);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
					// TestSuite.g:1447:73: ( COMMA vd1= variableDeclaration )*
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==COMMA) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// TestSuite.g:1447:75: COMMA vd1= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_blockStat5876); if (state.failed) return retval;
							pushFollow(FOLLOW_variableDeclaration_in_blockStat5882);
							vd1=variableDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
							}
							break;

						default :
							break loop76;
						}
					}

					match(input,SEMI,FOLLOW_SEMI_in_blockStat5889); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_stat_in_blockStat5899);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((TestSuiteParser.stat_return)s).n:null)); }
			match(input,67,FOLLOW_67_in_blockStat5904); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "blockStat"


	public static class implicitBlockStat_return extends ParserRuleReturnScope {
		public ASTBlockStatement n;
	};


	// $ANTLR start "implicitBlockStat"
	// TestSuite.g:1456:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
	public final TestSuiteParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
		TestSuiteParser.implicitBlockStat_return retval = new TestSuiteParser.implicitBlockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), false);

		try {
			// TestSuite.g:1460:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
			// TestSuite.g:1461:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
			{
			match(input,61,FOLLOW_61_in_implicitBlockStat5930); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5936);
			vd=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
			// TestSuite.g:1461:72: ( COMMA vd1= variableDeclaration )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==COMMA) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// TestSuite.g:1461:74: COMMA vd1= variableDeclaration
					{
					match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat5942); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5948);
					vd1=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
					}
					break;

				default :
					break loop78;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat5955); if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_implicitBlockStat5963);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((TestSuiteParser.stat_return)s).n:null)); }
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "implicitBlockStat"



	// $ANTLR start "statOrImplicitBlock"
	// TestSuite.g:1465:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
	public final ASTStatement statOrImplicitBlock() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;

		try {
			// TestSuite.g:1466:3: ( (s1= stat |s2= implicitBlockStat ) )
			// TestSuite.g:1467:3: (s1= stat |s2= implicitBlockStat )
			{
			// TestSuite.g:1467:3: (s1= stat |s2= implicitBlockStat )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==AT||LA79_0==HASH||(LA79_0 >= IDENT && LA79_0 <= INT)||(LA79_0 >= LPAREN && LA79_0 <= MINUS)||LA79_0==PLUS||LA79_0==REAL||LA79_0==SEMI||(LA79_0 >= STAR && LA79_0 <= STRING)||(LA79_0 >= 45 && LA79_0 <= 51)||LA79_0==56||(LA79_0 >= 62 && LA79_0 <= 63)||(LA79_0 >= 66 && LA79_0 <= 67)||(LA79_0 >= 71 && LA79_0 <= 72)||LA79_0==74||LA79_0==77||(LA79_0 >= 82 && LA79_0 <= 83)||(LA79_0 >= 85 && LA79_0 <= 94)||(LA79_0 >= 100 && LA79_0 <= 101)||LA79_0==107||LA79_0==109) ) {
				alt79=1;
			}
			else if ( (LA79_0==61) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// TestSuite.g:1467:4: s1= stat
					{
					pushFollow(FOLLOW_stat_in_statOrImplicitBlock5986);
					s1=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s1!=null?((TestSuiteParser.stat_return)s1).n:null); }
					}
					break;
				case 2 :
					// TestSuite.g:1467:31: s2= implicitBlockStat
					{
					pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock5996);
					s2=implicitBlockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s2!=null?((TestSuiteParser.implicitBlockStat_return)s2).n:null); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "statOrImplicitBlock"



	// $ANTLR start "nothing"
	// TestSuite.g:1481:1: nothing :;
	public final void nothing() throws RecognitionException {
		try {
			// TestSuite.g:1482:1: ()
			// TestSuite.g:1483:1: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nothing"



	// $ANTLR start "rValue"
	// TestSuite.g:1489:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
	public final ASTRValue rValue() throws RecognitionException {
		ASTRValue n = null;


		ASTExpression e =null;
		ParserRuleReturnScope oc =null;

		try {
			// TestSuite.g:1490:5: (e= inSoilExpression |oc= objCreateStat )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==AT||LA80_0==HASH||(LA80_0 >= IDENT && LA80_0 <= INT)||(LA80_0 >= LPAREN && LA80_0 <= MINUS)||LA80_0==PLUS||LA80_0==REAL||(LA80_0 >= STAR && LA80_0 <= STRING)||(LA80_0 >= 45 && LA80_0 <= 51)||LA80_0==71||LA80_0==74||(LA80_0 >= 82 && LA80_0 <= 83)||(LA80_0 >= 86 && LA80_0 <= 94)||(LA80_0 >= 100 && LA80_0 <= 101)||LA80_0==107) ) {
				alt80=1;
			}
			else if ( (LA80_0==85) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// TestSuite.g:1491:5: e= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_rValue6042);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }
					}
					break;
				case 2 :
					// TestSuite.g:1492:5: oc= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_rValue6054);
					oc=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { 
					    if ((oc!=null?((TestSuiteParser.objCreateStat_return)oc).n:null) instanceof ASTNewLinkObjectStatement)
					    	n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)(oc!=null?((TestSuiteParser.objCreateStat_return)oc).n:null));
					    else
					    	n = new ASTRValueNewObject((ASTNewObjectStatement)(oc!=null?((TestSuiteParser.objCreateStat_return)oc).n:null));
					  }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "rValue"



	// $ANTLR start "rValList"
	// TestSuite.g:1505:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
	public final List<ASTRValue> rValList() throws RecognitionException {
		List<ASTRValue> n = null;


		List<ASTRValue> rl =null;

		try {
			// TestSuite.g:1506:3: ( nothing |rl= rValListMin1 )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==RBRACE) ) {
				alt81=1;
			}
			else if ( (LA81_0==AT||LA81_0==HASH||(LA81_0 >= IDENT && LA81_0 <= INT)||(LA81_0 >= LPAREN && LA81_0 <= MINUS)||LA81_0==PLUS||LA81_0==REAL||(LA81_0 >= STAR && LA81_0 <= STRING)||(LA81_0 >= 45 && LA81_0 <= 51)||LA81_0==71||LA81_0==74||(LA81_0 >= 82 && LA81_0 <= 83)||(LA81_0 >= 85 && LA81_0 <= 94)||(LA81_0 >= 100 && LA81_0 <= 101)||LA81_0==107) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// TestSuite.g:1507:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_rValList6077);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }
					}
					break;
				case 2 :
					// TestSuite.g:1510:3: rl= rValListMin1
					{
					pushFollow(FOLLOW_rValListMin1_in_rValList6104);
					rl=rValListMin1();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = rl; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "rValList"



	// $ANTLR start "rValListMin1"
	// TestSuite.g:1518:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin1() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// TestSuite.g:1522:3: (r= rValue ( COMMA r= rValue )* )
			// TestSuite.g:1523:3: r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin16137);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// TestSuite.g:1525:3: ( COMMA r= rValue )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==COMMA) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// TestSuite.g:1526:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin16151); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin16161);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop82;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "rValListMin1"



	// $ANTLR start "rValListMin2"
	// TestSuite.g:1536:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin2() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// TestSuite.g:1540:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
			// TestSuite.g:1541:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin26200);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin26208); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_rValListMin26216);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// TestSuite.g:1546:3: ( COMMA r= rValue )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==COMMA) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// TestSuite.g:1547:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin26230); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin26240);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop83;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "rValListMin2"



	// $ANTLR start "inSoilExpression"
	// TestSuite.g:1557:1: inSoilExpression returns [ASTExpression n] : e= expression ;
	public final ASTExpression inSoilExpression() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope e =null;

		try {
			// TestSuite.g:1558:3: (e= expression )
			// TestSuite.g:1559:3: e= expression
			{
			pushFollow(FOLLOW_expression_in_inSoilExpression6274);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if ((e!=null?((TestSuiteParser.expression_return)e).n:null) != null) (e!=null?((TestSuiteParser.expression_return)e).n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }
			if ( state.backtracking==0 ) { n = (e!=null?((TestSuiteParser.expression_return)e).n:null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "inSoilExpression"



	// $ANTLR start "exprList"
	// TestSuite.g:1568:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
	public final List<ASTExpression> exprList() throws RecognitionException {
		List<ASTExpression> n = null;


		List<ASTExpression> el =null;

		try {
			// TestSuite.g:1569:3: ( nothing |el= exprListMin1 )
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==RPAREN) ) {
				alt84=1;
			}
			else if ( (LA84_0==AT||LA84_0==HASH||(LA84_0 >= IDENT && LA84_0 <= INT)||(LA84_0 >= LPAREN && LA84_0 <= MINUS)||LA84_0==PLUS||LA84_0==REAL||(LA84_0 >= STAR && LA84_0 <= STRING)||(LA84_0 >= 45 && LA84_0 <= 51)||LA84_0==71||LA84_0==74||(LA84_0 >= 82 && LA84_0 <= 83)||(LA84_0 >= 86 && LA84_0 <= 94)||(LA84_0 >= 100 && LA84_0 <= 101)||LA84_0==107) ) {
				alt84=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// TestSuite.g:1570:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_exprList6303);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }
					}
					break;
				case 2 :
					// TestSuite.g:1573:3: el= exprListMin1
					{
					pushFollow(FOLLOW_exprListMin1_in_exprList6321);
					el=exprListMin1();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = el; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "exprListMin1"
	// TestSuite.g:1581:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin1() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// TestSuite.g:1585:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// TestSuite.g:1586:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin16354);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// TestSuite.g:1588:3: ( COMMA e= inSoilExpression )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==COMMA) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// TestSuite.g:1589:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin16369); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin16379);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop85;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "exprListMin1"



	// $ANTLR start "exprListMin2"
	// TestSuite.g:1599:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin2() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// TestSuite.g:1603:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// TestSuite.g:1604:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin26419);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			match(input,COMMA,FOLLOW_COMMA_in_exprListMin26427); if (state.failed) return n;
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin26435);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// TestSuite.g:1609:3: ( COMMA e= inSoilExpression )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==COMMA) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// TestSuite.g:1610:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin26449); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin26459);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop86;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "exprListMin2"



	// $ANTLR start "identList"
	// TestSuite.g:1620:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
	public final List<String> identList() throws RecognitionException {
		List<String> n = null;


		List<String> il =null;

		try {
			// TestSuite.g:1621:3: ( nothing |il= identListMin1 )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==EOF||LA87_0==RBRACE||(LA87_0 >= RPAREN && LA87_0 <= SEMI)||LA87_0==44||LA87_0==54||LA87_0==57||(LA87_0 >= 66 && LA87_0 <= 68)) ) {
				alt87=1;
			}
			else if ( (LA87_0==IDENT) ) {
				alt87=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// TestSuite.g:1622:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_identList6489);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<String>(); }
					}
					break;
				case 2 :
					// TestSuite.g:1625:3: il= identListMin1
					{
					pushFollow(FOLLOW_identListMin1_in_identList6506);
					il=identListMin1();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = il; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "identList"



	// $ANTLR start "identListMin1"
	// TestSuite.g:1633:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
	public final List<String> identListMin1() throws RecognitionException {
		List<String> n = null;


		Token id=null;


		  n = new ArrayList<String>();

		try {
			// TestSuite.g:1637:3: (id= IDENT ( COMMA id= IDENT )* )
			// TestSuite.g:1638:3: id= IDENT ( COMMA id= IDENT )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16540); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }
			// TestSuite.g:1640:3: ( COMMA id= IDENT )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==COMMA) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// TestSuite.g:1641:5: COMMA id= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_identListMin16554); if (state.failed) return n;
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16564); if (state.failed) return n;
					if ( state.backtracking==0 ) {
					    n.add((id!=null?id.getText():null)); }
					}
					break;

				default :
					break loop88;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "identListMin1"

	// $ANTLR start synpred1_TestSuite
	public final void synpred1_TestSuite_fragment() throws RecognitionException {
		// TestSuite.g:756:7: ( COLON type EQUAL )
		// TestSuite.g:756:8: COLON type EQUAL
		{
		match(input,COLON,FOLLOW_COLON_in_synpred1_TestSuite3459); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred1_TestSuite3461);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_TestSuite3463); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_TestSuite

	// $ANTLR start synpred2_TestSuite
	public final void synpred2_TestSuite_fragment() throws RecognitionException {
		// TestSuite.g:842:3: ( stat )
		// TestSuite.g:842:4: stat
		{
		pushFollow(FOLLOW_stat_in_synpred2_TestSuite3872);
		stat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_TestSuite

	// $ANTLR start synpred3_TestSuite
	public final void synpred3_TestSuite_fragment() throws RecognitionException {
		// TestSuite.g:845:3: ( legacyStat )
		// TestSuite.g:845:4: legacyStat
		{
		pushFollow(FOLLOW_legacyStat_in_synpred3_TestSuite3893);
		legacyStat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_TestSuite

	// $ANTLR start synpred4_TestSuite
	public final void synpred4_TestSuite_fragment() throws RecognitionException {
		// TestSuite.g:855:3: ( legacyStat )
		// TestSuite.g:855:4: legacyStat
		{
		pushFollow(FOLLOW_legacyStat_in_synpred4_TestSuite3925);
		legacyStat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_TestSuite

	// $ANTLR start synpred5_TestSuite
	public final void synpred5_TestSuite_fragment() throws RecognitionException {
		// TestSuite.g:858:3: ( stat )
		// TestSuite.g:858:4: stat
		{
		pushFollow(FOLLOW_stat_in_synpred5_TestSuite3948);
		stat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_TestSuite

	// $ANTLR start synpred6_TestSuite
	public final void synpred6_TestSuite_fragment() throws RecognitionException {
		// TestSuite.g:1094:13: ( inSoilExpression )
		// TestSuite.g:1094:14: inSoilExpression
		{
		pushFollow(FOLLOW_inSoilExpression_in_synpred6_TestSuite4628);
		inSoilExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_TestSuite

	// $ANTLR start synpred7_TestSuite
	public final void synpred7_TestSuite_fragment() throws RecognitionException {
		// TestSuite.g:1190:5: ( statStartingWithExpr )
		// TestSuite.g:1190:6: statStartingWithExpr
		{
		pushFollow(FOLLOW_statStartingWithExpr_in_synpred7_TestSuite4842);
		statStartingWithExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_TestSuite

	// Delegated rules

	public final boolean synpred2_TestSuite() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_TestSuite_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_TestSuite() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_TestSuite_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_TestSuite() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_TestSuite_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_TestSuite() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_TestSuite_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_TestSuite() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_TestSuite_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_TestSuite() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_TestSuite_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_TestSuite() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_TestSuite_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_105_in_testSuite61 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_testSuite71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_testSuite82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_testSuite84 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_filename_in_testSuite93 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
	public static final BitSet FOLLOW_103_in_testSuite105 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_44_in_testSuite112 = new BitSet(new long[]{0xD18FE308861A0020L,0x00002871FFEC25C0L});
	public static final BitSet FOLLOW_shellCommandOnly_in_testSuite118 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_testSuite124 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_testCases_in_testSuite145 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_testSuite154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_filename172 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_filename174 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_filename178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_testCase_in_testCases205 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_testCase224 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_testCase228 = new BitSet(new long[]{0x0240100000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_44_in_testCase242 = new BitSet(new long[]{0xD18FE308861A0020L,0x00002871FFEC25C0L});
	public static final BitSet FOLLOW_shellCommandOnly_in_testCase248 = new BitSet(new long[]{0x0240100000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_assertStatement_in_testCase267 = new BitSet(new long[]{0x0240100000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_57_in_testCase285 = new BitSet(new long[]{0x0240100000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_testCase303 = new BitSet(new long[]{0x0240100000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_67_in_testCase315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_assertStatement336 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L});
	public static final BitSet FOLLOW_108_in_assertStatement341 = new BitSet(new long[]{0x000FE308861A0020L,0x0000083C7FCE8480L});
	public static final BitSet FOLLOW_80_in_assertStatement347 = new BitSet(new long[]{0x000FE308861A0020L,0x0000083C7FCE8480L});
	public static final BitSet FOLLOW_expression_in_assertStatement366 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_81_in_assertStatement382 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_81_in_assertStatement398 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_assertStatement402 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_79_in_assertStatement418 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_assertStatement422 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_assertStatement424 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_assertStatement428 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_assertionStatementPre_in_assertStatement448 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_assertionStatementPost_in_assertStatement469 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_assertStatement486 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_STRING_in_assertStatement490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_assertionStatementPre513 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_assertionStatementPre517 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_assertionStatementPre521 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_assertionStatementPre527 = new BitSet(new long[]{0x000FE318861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_assertionStatementPre537 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_assertionStatementPre543 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_assertionStatementPre547 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_assertionStatementPre559 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COLON_COLON_in_assertionStatementPre562 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_assertionStatementPre566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_assertionStatementPost591 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_IDENT_in_assertionStatementPost600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOnly637 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expressionOnly639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_expression687 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression698 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression702 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_expression706 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression711 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_expression715 = new BitSet(new long[]{0x0000000000000400L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_expression753 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression765 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression769 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_expression773 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression778 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_expression782 = new BitSet(new long[]{0x0000000000000400L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_expression823 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramList872 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList889 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_paramList901 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList905 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_paramList925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idList954 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_idList964 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_idList968 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration999 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration1001 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_conditionalImpliesExpression1054 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1103 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_conditionalOrExpression1116 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1120 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1164 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_conditionalXOrExpression1177 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1181 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1225 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_conditionalAndExpression1238 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1242 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1290 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_set_in_equalityExpression1309 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1319 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1368 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_set_in_relationalExpression1386 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1404 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1454 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression1472 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1482 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1532 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression1550 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1564 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_unaryExpression1626 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FC40480L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1703 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_ARROW_in_postfixExpression1721 = new BitSet(new long[]{0x0000000000080000L,0x000000303D040000L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression1727 = new BitSet(new long[]{0x0000000000080000L,0x000000303D040000L});
	public static final BitSet FOLLOW_propertyCall_in_postfixExpression1738 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_literal_in_primaryExpression1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectReference_in_primaryExpression1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyCall_in_primaryExpression1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression1815 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_primaryExpression1819 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_primaryExpression1833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression1845 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression1847 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_primaryExpression1849 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_primaryExpression1874 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression1892 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression1907 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression1909 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_primaryExpression1911 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression1915 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_primaryExpression1919 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression1921 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression1941 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_primaryExpression1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_objectReference1969 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_objectReference1977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryExpression_in_propertyCall2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterateExpression_in_propertyCall2055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationExpression_in_propertyCall2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeExpression_in_propertyCall2081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inStateExpression_in_propertyCall2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_queryExpression2129 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_queryExpression2136 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2147 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_queryExpression2151 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_queryExpression2162 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_queryExpression2168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_iterateExpression2200 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_iterateExpression2206 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2214 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterateExpression2216 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2224 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_iterateExpression2226 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_iterateExpression2234 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterateExpression2240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_operationExpression2284 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression2306 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_operationExpression2319 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression2332 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_operationExpression2336 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression2348 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression2365 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_operationExpression2380 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression2395 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_operationExpression2399 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression2413 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_operationExpression2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_operationExpression2440 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_operationExpression2465 = new BitSet(new long[]{0x000FE318861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_operationExpression2486 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression2498 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_operationExpression2502 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_operationExpression2522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inStateExpression2570 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_inStateExpression2583 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_inStateExpression2592 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_inStateExpression2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeExpression2633 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_typeExpression2657 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_typeExpression2661 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_typeExpression2663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2701 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2704 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration2708 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2718 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2724 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2727 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration2733 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableInitialization2761 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableInitialization2763 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_variableInitialization2767 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_variableInitialization2769 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_variableInitialization2773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_ifExpression2805 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_ifExpression2809 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_ifExpression2811 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_ifExpression2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_ifExpression2817 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_ifExpression2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_ifExpression2823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_literal2862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_literal2876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal2889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_literal2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal2918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_literal2928 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal2932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_literal2944 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_literal2946 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal2950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_literal2962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_undefinedLiteral_in_literal2986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_literal2998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_literal3010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionLiteral3048 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3077 = new BitSet(new long[]{0x000FE30A861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3094 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_collectionLiteral3107 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3111 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_collectionItem3159 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_collectionItem3170 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_collectionItem3174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_emptyCollectionLiteral3203 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3205 = new BitSet(new long[]{0x0003E00000000000L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3209 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3227 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3229 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_undefinedLiteral3261 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3263 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral3267 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_undefinedLiteral3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_undefinedLiteral3297 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3299 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral3303 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_undefinedLiteral3319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_tupleLiteral3358 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3364 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3372 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleLiteral3383 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3387 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tupleItem3429 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_tupleItem3468 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_tupleItem3472 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_tupleItem3474 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_tupleItem3478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_tupleItem3500 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_tupleItem3510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type3576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_type3588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleType_in_type3600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOnly3632 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_typeOnly3634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simpleType3662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionType3700 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_collectionType3727 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_collectionType3731 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_collectionType3733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_tupleType3767 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_tupleType3769 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType3778 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleType3789 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType3793 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_tupleType3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tuplePart3837 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_tuplePart3839 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_tuplePart3843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_shellCommandOnly3880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly3901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_shellCommand3933 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_shellCommand3935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_shellCommand3956 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_shellCommand3958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat3992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyOpExit_in_legacyStat4008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat4021 = new BitSet(new long[]{0xD080000000000002L,0x0000004000082040L});
	public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat4032 = new BitSet(new long[]{0xD080000000000002L,0x0000004000082040L});
	public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat4066 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_SEMI_in_nextLegacyStat4070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat4103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat4122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat4135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat4148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat4176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat4194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_singleLegacyStat4207 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_singleLegacyStat4211 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat4217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat4230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat4251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_legacyCreate4287 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identListMin1_in_legacyCreate4295 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_legacyCreate4299 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_legacyCreate4307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_legacyCreateAssign4344 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign4352 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign4356 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_legacyCreateAssign4360 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign4368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_legacyCreateInsert4402 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert4410 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_legacyCreateInsert4414 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert4422 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_legacyCreateInsert4426 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert4430 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4440 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert4444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_legacyLet4477 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_legacyLet4485 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_legacyLet4495 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_legacyLet4505 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_legacyLet4514 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_legacyLet4522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_legacyOpEnter4555 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter4563 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_legacyOpEnter4571 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter4575 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_exprList_in_legacyOpEnter4585 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter4589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_legacyOpExit4624 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit4636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_legacyOpExit4640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_legacyExecute4673 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_expression_in_legacyExecute4677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOnly4723 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statOnly4727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleStat_in_stat4762 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_SEMI_in_stat4774 = new BitSet(new long[]{0xC10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_singleStat_in_stat4784 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_emptyStat_in_singleStat4824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAssignStat_in_singleStat4862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_singleStat4876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleStat4890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleStat4903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleStat4920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExStat_in_singleStat4937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterStat_in_singleStat4954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_singleStat4976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStat_in_singleStat4994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_emptyStat5021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr5047 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr5061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_varAssignStat5099 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat5103 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValue_in_varAssignStat5111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_attAssignStat5135 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_attAssignStat5144 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat5148 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValue_in_attAssignStat5156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_objCreateStat5182 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_objCreateStat5190 = new BitSet(new long[]{0x0400000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat5200 = new BitSet(new long[]{0x000FE318861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat5213 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat5221 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_objCreateStat5239 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat5247 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5261 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat5269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_objDestroyStat5305 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat5313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_lnkInsStat5339 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkInsStat5343 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5353 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkInsStat5357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_lnkInsStat5361 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_lnkInsStat5369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5398 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5409 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5418 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5425 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5441 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5452 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5463 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5472 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5479 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5501 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5516 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5536 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5547 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5556 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_62_in_lnkDelStat5597 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkDelStat5601 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5611 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkDelStat5615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_lnkDelStat5619 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_lnkDelStat5628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_condExStat5659 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_condExStat5668 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_condExStat5672 = new BitSet(new long[]{0xE10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5681 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_66_in_condExStat5692 = new BitSet(new long[]{0xE10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_condExStat5716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_iterStat5741 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_iterStat5749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_iterStat5753 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_iterStat5761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_iterStat5765 = new BitSet(new long[]{0xE10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat5773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_iterStat5778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_whileStat5804 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_whileStat5812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_whileStat5816 = new BitSet(new long[]{0xE10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat5824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_whileStat5829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_blockStat5859 = new BitSet(new long[]{0xE10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_61_in_blockStat5864 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat5870 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_blockStat5876 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat5882 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_SEMI_in_blockStat5889 = new BitSet(new long[]{0xC10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_stat_in_blockStat5899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_blockStat5904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_implicitBlockStat5930 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5936 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_implicitBlockStat5942 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5948 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_SEMI_in_implicitBlockStat5955 = new BitSet(new long[]{0xC10FE308861A0020L,0x000028307FEC2580L});
	public static final BitSet FOLLOW_stat_in_implicitBlockStat5963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOrImplicitBlock5986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock5996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_rValue6042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_rValue6054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_rValList6077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValListMin1_in_rValList6104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin16137 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin16151 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValue_in_rValListMin16161 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_rValue_in_rValListMin26200 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin26208 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValue_in_rValListMin26216 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin26230 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FEC0480L});
	public static final BitSet FOLLOW_rValue_in_rValListMin26240 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expression_in_inSoilExpression6274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_exprList6303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprListMin1_in_exprList6321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16354 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin16369 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16379 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26419 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin26427 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26435 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin26449 = new BitSet(new long[]{0x000FE308861A0020L,0x000008307FCC0480L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26459 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_nothing_in_identList6489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identListMin1_in_identList6506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identListMin16540 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_identListMin16554 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_identListMin16564 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COLON_in_synpred1_TestSuite3459 = new BitSet(new long[]{0x0007E00000080000L});
	public static final BitSet FOLLOW_type_in_synpred1_TestSuite3461 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred1_TestSuite3463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_synpred2_TestSuite3872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_synpred3_TestSuite3893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_synpred4_TestSuite3925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_synpred5_TestSuite3948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_synpred6_TestSuite4628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_synpred7_TestSuite4842 = new BitSet(new long[]{0x0000000000000002L});
}
