// $ANTLR 3.5.2 ShellCommand.g 2026-03-08 12:46:17

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 University of Bremen
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
 
 
package org.tzi.use.parser.shell;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class ShellCommandParser extends BaseParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", 
		"COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", 
		"GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", 
		"LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", 
		"NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", 
		"REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", 
		"WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", 
		"'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'assign'", "'begin'", 
		"'between'", "'byUseId'", "'create'", "'declare'", "'delete'", "'destroy'", 
		"'div'", "'do'", "'else'", "'end'", "'endif'", "'execute'", "'false'", 
		"'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", 
		"'iterate'", "'let'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", 
		"'oclInState'", "'oclIsInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", 
		"'openter'", "'opexit'", "'or'", "'pre'", "'selectByKind'", "'selectByType'", 
		"'set'", "'then'", "'true'", "'while'", "'xor'"
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


	public ShellCommandParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ShellCommandParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ShellCommandParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ShellCommand.g"; }



	// $ANTLR start "shellCommandOnly"
	// ShellCommand.g:86:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat );
	public final ASTStatement shellCommandOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;
		ParserRuleReturnScope l =null;

		try {
			// ShellCommand.g:87:3: ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SEMI) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==EOF) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==76) ) {
				int LA1_3 = input.LA(2);
				if ( (synpred1_ShellCommand()) ) {
					alt1=1;
				}
				else if ( (synpred2_ShellCommand()) ) {
					alt1=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==MINUS||LA1_0==PLUS||LA1_0==78) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==95) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==67) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==INT) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==REAL) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==STRING) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==HASH) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==IDENT) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==44||(LA1_0 >= 46 && LA1_0 <= 48)) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==81) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==45) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==86) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==50) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==79) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==49) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==STAR) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==AT) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==75) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==80||(LA1_0 >= 84 && LA1_0 <= 85)||(LA1_0 >= 91 && LA1_0 <= 92)) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( ((LA1_0 >= 82 && LA1_0 <= 83)) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==LPAREN) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==70) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==77) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==60) ) {
				int LA1_27 = input.LA(2);
				if ( (synpred1_ShellCommand()) ) {
					alt1=1;
				}
				else if ( (synpred2_ShellCommand()) ) {
					alt1=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 27, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==73) ) {
				int LA1_28 = input.LA(2);
				if ( (synpred1_ShellCommand()) ) {
					alt1=1;
				}
				else if ( (synpred2_ShellCommand()) ) {
					alt1=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 28, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==59) ) {
				int LA1_29 = input.LA(2);
				if ( (synpred1_ShellCommand()) ) {
					alt1=1;
				}
				else if ( (synpred2_ShellCommand()) ) {
					alt1=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 29, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==68) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==96) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==54) && (synpred1_ShellCommand())) {
				alt1=1;
			}
			else if ( (LA1_0==87) && (synpred2_ShellCommand())) {
				alt1=2;
			}
			else if ( (LA1_0==88) && (synpred2_ShellCommand())) {
				alt1=2;
			}
			else if ( (LA1_0==57) && (synpred2_ShellCommand())) {
				alt1=2;
			}
			else if ( (LA1_0==53) && (synpred2_ShellCommand())) {
				alt1=2;
			}
			else if ( (LA1_0==66) && (synpred2_ShellCommand())) {
				alt1=2;
			}
			else if ( (LA1_0==93) && (synpred2_ShellCommand())) {
				alt1=2;
			}

			switch (alt1) {
				case 1 :
					// ShellCommand.g:88:3: ( stat )=>s= stat
					{
					pushFollow(FOLLOW_stat_in_shellCommandOnly66);
					s=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s!=null?((ShellCommandParser.stat_return)s).n:null); }
					}
					break;
				case 2 :
					// ShellCommand.g:91:3: ( legacyStat )=>l= legacyStat
					{
					pushFollow(FOLLOW_legacyStat_in_shellCommandOnly87);
					l=legacyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (l!=null?((ShellCommandParser.legacyStat_return)l).n:null); }
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
	// ShellCommand.g:99:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF );
	public final ASTStatement shellCommand() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope l =null;
		ParserRuleReturnScope s =null;

		try {
			// ShellCommand.g:100:3: ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==87) && (synpred3_ShellCommand())) {
				alt2=1;
			}
			else if ( (LA2_0==88) && (synpred3_ShellCommand())) {
				alt2=1;
			}
			else if ( (LA2_0==57) && (synpred3_ShellCommand())) {
				alt2=1;
			}
			else if ( (LA2_0==53) && (synpred3_ShellCommand())) {
				alt2=1;
			}
			else if ( (LA2_0==76) ) {
				int LA2_5 = input.LA(2);
				if ( (synpred3_ShellCommand()) ) {
					alt2=1;
				}
				else if ( (synpred4_ShellCommand()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==66) && (synpred3_ShellCommand())) {
				alt2=1;
			}
			else if ( (LA2_0==60) ) {
				int LA2_7 = input.LA(2);
				if ( (synpred3_ShellCommand()) ) {
					alt2=1;
				}
				else if ( (synpred4_ShellCommand()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==93) && (synpred3_ShellCommand())) {
				alt2=1;
			}
			else if ( (LA2_0==73) ) {
				int LA2_9 = input.LA(2);
				if ( (synpred3_ShellCommand()) ) {
					alt2=1;
				}
				else if ( (synpred4_ShellCommand()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==59) ) {
				int LA2_10 = input.LA(2);
				if ( (synpred3_ShellCommand()) ) {
					alt2=1;
				}
				else if ( (synpred4_ShellCommand()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==SEMI) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==EOF) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==MINUS||LA2_0==PLUS||LA2_0==78) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==95) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==67) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==INT) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==REAL) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==STRING) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==HASH) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==IDENT) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 48)) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==81) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==45) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==86) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==50) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==79) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==49) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==STAR) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==AT) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==75) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==80||(LA2_0 >= 84 && LA2_0 <= 85)||(LA2_0 >= 91 && LA2_0 <= 92)) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( ((LA2_0 >= 82 && LA2_0 <= 83)) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==LPAREN) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==70) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==77) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==68) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==96) && (synpred4_ShellCommand())) {
				alt2=2;
			}
			else if ( (LA2_0==54) && (synpred4_ShellCommand())) {
				alt2=2;
			}

			switch (alt2) {
				case 1 :
					// ShellCommand.g:101:3: ( legacyStat )=>l= legacyStat EOF
					{
					pushFollow(FOLLOW_legacyStat_in_shellCommand119);
					l=legacyStat();
					state._fsp--;
					if (state.failed) return n;
					match(input,EOF,FOLLOW_EOF_in_shellCommand121); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (l!=null?((ShellCommandParser.legacyStat_return)l).n:null); }
					}
					break;
				case 2 :
					// ShellCommand.g:104:3: ( stat )=>s= stat EOF
					{
					pushFollow(FOLLOW_stat_in_shellCommand142);
					s=stat();
					state._fsp--;
					if (state.failed) return n;
					match(input,EOF,FOLLOW_EOF_in_shellCommand144); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s!=null?((ShellCommandParser.stat_return)s).n:null); }
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
	// ShellCommand.g:114:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
	public final ShellCommandParser.legacyStat_return legacyStat() throws RecognitionException {
		ShellCommandParser.legacyStat_return retval = new ShellCommandParser.legacyStat_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope loe =null;
		ParserRuleReturnScope lox =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// ShellCommand.g:118:3: (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt4=1;
				}
				break;
			case 88:
				{
				alt4=2;
				}
				break;
			case 53:
			case 57:
			case 59:
			case 60:
			case 66:
			case 73:
			case 76:
			case 93:
				{
				alt4=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// ShellCommand.g:119:3: loe= legacyOpEnter
					{
					pushFollow(FOLLOW_legacyOpEnter_in_legacyStat178);
					loe=legacyOpEnter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = (loe!=null?((ShellCommandParser.legacyOpEnter_return)loe).n:null);
					  }
					}
					break;
				case 2 :
					// ShellCommand.g:124:3: lox= legacyOpExit
					{
					pushFollow(FOLLOW_legacyOpExit_in_legacyStat194);
					lox=legacyOpExit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = (lox!=null?((ShellCommandParser.legacyOpExit_return)lox).n:null); 
					  }
					}
					break;
				case 3 :
					// ShellCommand.g:129:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
					{
					pushFollow(FOLLOW_nextLegacyStat_in_legacyStat207);
					nextLegacyStat(seq);
					state._fsp--;
					if (state.failed) return retval;
					// ShellCommand.g:130:3: ( nextLegacyStat[seq] )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==53||LA3_0==57||(LA3_0 >= 59 && LA3_0 <= 60)||LA3_0==66||LA3_0==73||LA3_0==76||LA3_0==93) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// ShellCommand.g:131:5: nextLegacyStat[seq]
							{
							pushFollow(FOLLOW_nextLegacyStat_in_legacyStat218);
							nextLegacyStat(seq);
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop3;
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
	// ShellCommand.g:143:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
	public final void nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
		ASTStatement s =null;

		try {
			// ShellCommand.g:144:3: (s= singleLegacyStat ( SEMI )? )
			// ShellCommand.g:145:3: s= singleLegacyStat ( SEMI )?
			{
			pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat252);
			s=singleLegacyStat();
			state._fsp--;
			if (state.failed) return;
			// ShellCommand.g:146:3: ( SEMI )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==SEMI) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// ShellCommand.g:146:3: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat256); if (state.failed) return;
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
	// ShellCommand.g:157:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat );
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
			// ShellCommand.g:158:5: (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat )
			int alt6=9;
			switch ( input.LA(1) ) {
			case 57:
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1==IDENT) ) {
					int LA6_9 = input.LA(3);
					if ( (LA6_9==COLON) ) {
						int LA6_10 = input.LA(4);
						if ( (LA6_10==IDENT) ) {
							int LA6_12 = input.LA(5);
							if ( (LA6_12==55) ) {
								alt6=3;
							}
							else if ( (LA6_12==EOF||LA6_12==SEMI||LA6_12==53||LA6_12==57||(LA6_12 >= 59 && LA6_12 <= 60)||LA6_12==66||LA6_12==73||LA6_12==76||LA6_12==93) ) {
								alt6=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return n;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 12, input);
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
									new NoViableAltException("", 6, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA6_9==COMMA) ) {
						alt6=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 9, input);
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
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 53:
				{
				alt6=2;
				}
				break;
			case 76:
				{
				alt6=4;
				}
				break;
			case 66:
				{
				alt6=5;
				}
				break;
			case 60:
				{
				alt6=6;
				}
				break;
			case 93:
				{
				alt6=7;
				}
				break;
			case 73:
				{
				alt6=8;
				}
				break;
			case 59:
				{
				alt6=9;
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
					// ShellCommand.g:159:5: lcr= legacyCreate
					{
					pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat289);
					lcr=legacyCreate();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lcr!=null?((ShellCommandParser.legacyCreate_return)lcr).n:null); }
					}
					break;
				case 2 :
					// ShellCommand.g:160:5: lca= legacyCreateAssign
					{
					pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat308);
					lca=legacyCreateAssign();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lca!=null?((ShellCommandParser.legacyCreateAssign_return)lca).n:null); }
					}
					break;
				case 3 :
					// ShellCommand.g:161:5: lci= legacyCreateInsert
					{
					pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat321);
					lci=legacyCreateInsert();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lci!=null?((ShellCommandParser.legacyCreateInsert_return)lci).n:null); }
					}
					break;
				case 4 :
					// ShellCommand.g:162:5: llt= legacyLet
					{
					pushFollow(FOLLOW_legacyLet_in_singleLegacyStat334);
					llt=legacyLet();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (llt!=null?((ShellCommandParser.legacyLet_return)llt).n:null); }
					}
					break;
				case 5 :
					// ShellCommand.g:165:5: lex= legacyExecute
					{
					pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat362);
					lex=legacyExecute();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = lex; }
					}
					break;
				case 6 :
					// ShellCommand.g:166:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat380);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((ShellCommandParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 7 :
					// ShellCommand.g:167:5: 'set' e= expression aas= attAssignStat[$e.n]
					{
					match(input,93,FOLLOW_93_in_singleLegacyStat393); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_singleLegacyStat397);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat403);
					aas=attAssignStat((e!=null?((ShellCommandParser.expression_return)e).n:null));
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = aas; }
					}
					break;
				case 8 :
					// ShellCommand.g:168:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat416);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((ShellCommandParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 9 :
					// ShellCommand.g:169:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat437);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((ShellCommandParser.lnkDelStat_return)lds).n:null); }
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
	// ShellCommand.g:182:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
	public final ShellCommandParser.legacyCreate_return legacyCreate() throws RecognitionException {
		ShellCommandParser.legacyCreate_return retval = new ShellCommandParser.legacyCreate_return();
		retval.start = input.LT(1);

		List<String> objNames =null;
		ASTSimpleType objType =null;

		try {
			// ShellCommand.g:183:3: ( 'create' objNames= identListMin1 COLON objType= simpleType )
			// ShellCommand.g:184:3: 'create' objNames= identListMin1 COLON objType= simpleType
			{
			match(input,57,FOLLOW_57_in_legacyCreate473); if (state.failed) return retval;
			pushFollow(FOLLOW_identListMin1_in_legacyCreate481);
			objNames=identListMin1();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_legacyCreate485); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_legacyCreate493);
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
	// ShellCommand.g:215:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
	public final ShellCommandParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
		ShellCommandParser.legacyCreateAssign_return retval = new ShellCommandParser.legacyCreateAssign_return();
		retval.start = input.LT(1);

		List<String> varNames =null;
		ASTSimpleType objType =null;

		try {
			// ShellCommand.g:216:3: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
			// ShellCommand.g:217:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
			{
			match(input,53,FOLLOW_53_in_legacyCreateAssign530); if (state.failed) return retval;
			pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign538);
			varNames=identListMin1();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign542); if (state.failed) return retval;
			match(input,57,FOLLOW_57_in_legacyCreateAssign546); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_legacyCreateAssign554);
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
	// ShellCommand.g:250:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
	public final ShellCommandParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
		ShellCommandParser.legacyCreateInsert_return retval = new ShellCommandParser.legacyCreateInsert_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTSimpleType asClassName =null;
		ParserRuleReturnScope participants =null;

		try {
			// ShellCommand.g:251:3: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
			// ShellCommand.g:252:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
			{
			match(input,57,FOLLOW_57_in_legacyCreateInsert588); if (state.failed) return retval;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert596); if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert600); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_legacyCreateInsert608);
			asClassName=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			match(input,55,FOLLOW_55_in_legacyCreateInsert612); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert616); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert626);
			participants=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert630); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			    ASTNewLinkObjectStatement nlo = 
			      new ASTNewLinkObjectStatement(
			        (retval.start),
			        asClassName, 
			        (participants!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)participants).participans:null),
			        (participants!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)participants).qualifiers:null),
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
	// ShellCommand.g:287:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
	public final ShellCommandParser.legacyLet_return legacyLet() throws RecognitionException {
		ShellCommandParser.legacyLet_return retval = new ShellCommandParser.legacyLet_return();
		retval.start = input.LT(1);

		Token varName=null;
		ASTType varType =null;
		ASTExpression e =null;

		try {
			// ShellCommand.g:288:3: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
			// ShellCommand.g:289:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
			{
			match(input,76,FOLLOW_76_in_legacyLet663); if (state.failed) return retval;
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet671); if (state.failed) return retval;
			// ShellCommand.g:291:3: ( COLON varType= type )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COLON) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ShellCommand.g:292:5: COLON varType= type
					{
					match(input,COLON,FOLLOW_COLON_in_legacyLet681); if (state.failed) return retval;
					pushFollow(FOLLOW_type_in_legacyLet691);
					varType=type();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet700); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_legacyLet708);
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
	// ShellCommand.g:313:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
	public final ShellCommandParser.legacyOpEnter_return legacyOpEnter() throws RecognitionException {
		ShellCommandParser.legacyOpEnter_return retval = new ShellCommandParser.legacyOpEnter_return();
		retval.start = input.LT(1);

		Token op=null;
		ASTExpression obj =null;
		List<ASTExpression> args =null;

		try {
			// ShellCommand.g:314:3: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
			// ShellCommand.g:315:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
			{
			match(input,87,FOLLOW_87_in_legacyOpEnter741); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter749);
			obj=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter757); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter761); if (state.failed) return retval;
			pushFollow(FOLLOW_exprList_in_legacyOpEnter771);
			args=exprList();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter775); if (state.failed) return retval;
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
	// ShellCommand.g:338:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
	public final ShellCommandParser.legacyOpExit_return legacyOpExit() throws RecognitionException {
		ShellCommandParser.legacyOpExit_return retval = new ShellCommandParser.legacyOpExit_return();
		retval.start = input.LT(1);

		ASTExpression retVal =null;

		try {
			// ShellCommand.g:339:3: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
			// ShellCommand.g:340:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
			{
			match(input,88,FOLLOW_88_in_legacyOpExit810); if (state.failed) return retval;
			// ShellCommand.g:340:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==76) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==MINUS||LA8_0==PLUS||LA8_0==78) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==95) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==67) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==INT) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==REAL) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==STRING) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==HASH) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==IDENT) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==44||(LA8_0 >= 46 && LA8_0 <= 48)) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==81) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==45) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==86) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==50) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==79) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==49) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==STAR) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==AT) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==75) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==80||(LA8_0 >= 84 && LA8_0 <= 85)||(LA8_0 >= 91 && LA8_0 <= 92)) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( ((LA8_0 >= 82 && LA8_0 <= 83)) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==LPAREN) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==70) && (synpred5_ShellCommand())) {
				alt8=1;
			}
			else if ( (LA8_0==EOF) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// ShellCommand.g:340:13: ( inSoilExpression )=>retVal= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit822);
					retVal=inSoilExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// ShellCommand.g:340:62: nothing
					{
					pushFollow(FOLLOW_nothing_in_legacyOpExit826);
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
	// ShellCommand.g:355:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
	public final ASTStatement legacyExecute() throws RecognitionException {
		ASTStatement n = null;


		try {
			// ShellCommand.g:356:3: ( 'execute' expression )
			// ShellCommand.g:357:3: 'execute' expression
			{
			match(input,66,FOLLOW_66_in_legacyExecute859); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_legacyExecute863);
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



	// $ANTLR start "expressionOnly"
	// ShellCommand.g:393:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
	public final ASTExpression expressionOnly() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope nExp =null;

		try {
			// ShellCommand.g:394:5: (nExp= expression EOF )
			// ShellCommand.g:395:5: nExp= expression EOF
			{
			pushFollow(FOLLOW_expression_in_expressionOnly898);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_expressionOnly900); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = (nExp!=null?((ShellCommandParser.expression_return)nExp).n:null);}
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
	// ShellCommand.g:402:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
	public final ShellCommandParser.expression_return expression() throws RecognitionException {
		ShellCommandParser.expression_return retval = new ShellCommandParser.expression_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e1 =null;
		ASTExpression nCndImplies =null;

		 
		  ASTLetExpression prevLet = null, firstLet = null;
		  ASTExpression e2;
		  Token tok = null;

		try {
			// ShellCommand.g:408:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
			// ShellCommand.g:409:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }
			// ShellCommand.g:410:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==76) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ShellCommand.g:411:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
					{
					match(input,76,FOLLOW_76_in_expression948); if (state.failed) return retval;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression959); if (state.failed) return retval;
					// ShellCommand.g:412:18: ( COLON t= type )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==COLON) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// ShellCommand.g:412:20: COLON t= type
							{
							match(input,COLON,FOLLOW_COLON_in_expression963); if (state.failed) return retval;
							pushFollow(FOLLOW_type_in_expression967);
							t=type();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_expression972); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression976);
					e1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((ShellCommandParser.expression_return)e1).n:null));
					         if ( firstLet == null ) 
					             firstLet = nextLet;
					         if ( prevLet != null ) 
					             prevLet.setInExpr(nextLet);
					         prevLet = nextLet;
					      }
					// ShellCommand.g:422:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==COMMA) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// ShellCommand.g:423:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_expression1014); if (state.failed) return retval;
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1026); if (state.failed) return retval;
							// ShellCommand.g:424:20: ( COLON t= type )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==COLON) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// ShellCommand.g:424:22: COLON t= type
									{
									match(input,COLON,FOLLOW_COLON_in_expression1030); if (state.failed) return retval;
									pushFollow(FOLLOW_type_in_expression1034);
									t=type();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							match(input,EQUAL,FOLLOW_EQUAL_in_expression1039); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_expression1043);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((ShellCommandParser.expression_return)e1).n:null));
							           if ( firstLet == null ) 
							               firstLet = nextLet;
							           if ( prevLet != null ) 
							               prevLet.setInExpr(nextLet);
							           prevLet = nextLet;
							        }
							}
							break;

						default :
							break loop11;
						}
					}

					match(input,72,FOLLOW_72_in_expression1084); if (state.failed) return retval;
					}
					break;

				default :
					break loop12;
				}
			}

			pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1100);
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
	// ShellCommand.g:456:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
	public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
		List<ASTVariableDeclaration> paramList = null;


		ASTVariableDeclaration v =null;

		 paramList = new ArrayList<ASTVariableDeclaration>(); 
		try {
			// ShellCommand.g:458:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
			// ShellCommand.g:459:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_paramList1133); if (state.failed) return paramList;
			// ShellCommand.g:460:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==IDENT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ShellCommand.g:461:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_paramList1150);
					v=variableDeclaration();
					state._fsp--;
					if (state.failed) return paramList;
					if ( state.backtracking==0 ) { paramList.add(v); }
					// ShellCommand.g:462:7: ( COMMA v= variableDeclaration )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==COMMA) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// ShellCommand.g:462:9: COMMA v= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramList1162); if (state.failed) return paramList;
							pushFollow(FOLLOW_variableDeclaration_in_paramList1166);
							v=variableDeclaration();
							state._fsp--;
							if (state.failed) return paramList;
							if ( state.backtracking==0 ) { paramList.add(v); }
							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_paramList1186); if (state.failed) return paramList;
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
	// ShellCommand.g:470:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
	public final List idList() throws RecognitionException {
		List idList = null;


		Token id0=null;
		Token idn=null;

		 idList = new ArrayList(); 
		try {
			// ShellCommand.g:472:5: (id0= IDENT ( COMMA idn= IDENT )* )
			// ShellCommand.g:473:5: id0= IDENT ( COMMA idn= IDENT )*
			{
			id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1215); if (state.failed) return idList;
			if ( state.backtracking==0 ) { idList.add(id0); }
			// ShellCommand.g:474:5: ( COMMA idn= IDENT )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ShellCommand.g:474:7: COMMA idn= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_idList1225); if (state.failed) return idList;
					idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1229); if (state.failed) return idList;
					if ( state.backtracking==0 ) { idList.add(idn); }
					}
					break;

				default :
					break loop15;
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
	// ShellCommand.g:482:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
	public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
		ASTVariableDeclaration n = null;


		Token name=null;
		ASTType t =null;

		try {
			// ShellCommand.g:483:5: (name= IDENT COLON t= type )
			// ShellCommand.g:484:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1260); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableDeclaration1262); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration1266);
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
	// ShellCommand.g:492:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
	public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndOrExp =null;
		ASTExpression n1 =null;

		try {
			// ShellCommand.g:493:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
			// ShellCommand.g:494:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1302);
			nCndOrExp=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndOrExp;}
			// ShellCommand.g:495:5: (op= 'implies' n1= conditionalOrExpression )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==71) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ShellCommand.g:495:7: op= 'implies' n1= conditionalOrExpression
					{
					op=(Token)match(input,71,FOLLOW_71_in_conditionalImpliesExpression1315); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1319);
					n1=conditionalOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop16;
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
	// ShellCommand.g:504:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
	public final ASTExpression conditionalOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndXorExp =null;
		ASTExpression n1 =null;

		try {
			// ShellCommand.g:505:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
			// ShellCommand.g:506:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
			{
			pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1364);
			nCndXorExp=conditionalXOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndXorExp;}
			// ShellCommand.g:507:5: (op= 'or' n1= conditionalXOrExpression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==89) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ShellCommand.g:507:7: op= 'or' n1= conditionalXOrExpression
					{
					op=(Token)match(input,89,FOLLOW_89_in_conditionalOrExpression1377); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1381);
					n1=conditionalXOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop17;
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
	// ShellCommand.g:516:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
	public final ASTExpression conditionalXOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndAndExp =null;
		ASTExpression n1 =null;

		try {
			// ShellCommand.g:517:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
			// ShellCommand.g:518:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1425);
			nCndAndExp=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndAndExp;}
			// ShellCommand.g:519:5: (op= 'xor' n1= conditionalAndExpression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==97) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ShellCommand.g:519:7: op= 'xor' n1= conditionalAndExpression
					{
					op=(Token)match(input,97,FOLLOW_97_in_conditionalXOrExpression1438); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1442);
					n1=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
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
		return n;
	}
	// $ANTLR end "conditionalXOrExpression"



	// $ANTLR start "conditionalAndExpression"
	// ShellCommand.g:528:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
	public final ASTExpression conditionalAndExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nEqExp =null;
		ASTExpression n1 =null;

		try {
			// ShellCommand.g:529:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
			// ShellCommand.g:530:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1486);
			nEqExp=equalityExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nEqExp;}
			// ShellCommand.g:531:5: (op= 'and' n1= equalityExpression )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==52) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// ShellCommand.g:531:7: op= 'and' n1= equalityExpression
					{
					op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression1499); if (state.failed) return n;
					pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1503);
					n1=equalityExpression();
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
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "equalityExpression"
	// ShellCommand.g:540:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
	public final ASTExpression equalityExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nRelExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// ShellCommand.g:542:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
			// ShellCommand.g:543:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression1551);
			nRelExp=relationalExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nRelExp;}
			// ShellCommand.g:544:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==EQUAL||LA20_0==NOT_EQUAL) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// ShellCommand.g:544:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression1580);
					n1=relationalExpression();
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
	// $ANTLR end "equalityExpression"



	// $ANTLR start "relationalExpression"
	// ShellCommand.g:554:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
	public final ASTExpression relationalExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nAddiExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// ShellCommand.g:556:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
			// ShellCommand.g:557:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression1629);
			nAddiExp=additiveExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nAddiExp;}
			// ShellCommand.g:558:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= GREATER && LA21_0 <= GREATER_EQUAL)||(LA21_0 >= LESS && LA21_0 <= LESS_EQUAL)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ShellCommand.g:558:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression1665);
					n1=additiveExpression();
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
	// $ANTLR end "relationalExpression"



	// $ANTLR start "additiveExpression"
	// ShellCommand.g:568:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
	public final ASTExpression additiveExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nMulExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// ShellCommand.g:570:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
			// ShellCommand.g:571:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1715);
			nMulExp=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nMulExp;}
			// ShellCommand.g:572:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// ShellCommand.g:572:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1743);
					n1=multiplicativeExpression();
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
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// ShellCommand.g:583:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
	public final ASTExpression multiplicativeExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// ShellCommand.g:585:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
			// ShellCommand.g:586:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1793);
			nUnExp=unaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nUnExp;}
			// ShellCommand.g:587:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==SLASH||LA23_0==STAR||LA23_0==61) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ShellCommand.g:587:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==61 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1825);
					n1=unaryExpression();
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
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// ShellCommand.g:599:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
	public final ASTExpression unaryExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression nPosExp =null;

		 Token op = null; 
		try {
			// ShellCommand.g:601:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==MINUS||LA24_0==PLUS||LA24_0==78) ) {
				alt24=1;
			}
			else if ( (LA24_0==AT||LA24_0==HASH||(LA24_0 >= IDENT && LA24_0 <= INT)||LA24_0==LPAREN||LA24_0==REAL||(LA24_0 >= STAR && LA24_0 <= STRING)||(LA24_0 >= 44 && LA24_0 <= 50)||LA24_0==67||LA24_0==70||LA24_0==75||(LA24_0 >= 79 && LA24_0 <= 86)||(LA24_0 >= 91 && LA24_0 <= 92)||LA24_0==95) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// ShellCommand.g:602:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					{
					// ShellCommand.g:602:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					// ShellCommand.g:602:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==78 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression1911);
					nUnExp=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }
					}

					}
					break;
				case 2 :
					// ShellCommand.g:606:7: nPosExp= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression1931);
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
	// ShellCommand.g:614:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
	public final ASTExpression postfixExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nPrimExp =null;
		ASTExpression nPc =null;

		 boolean arrow = false; 
		try {
			// ShellCommand.g:616:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
			// ShellCommand.g:617:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression1964);
			nPrimExp=primaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nPrimExp; }
			// ShellCommand.g:618:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==DOT) ) {
					int LA26_2 = input.LA(2);
					if ( (LA26_2==IDENT) ) {
						int LA26_4 = input.LA(3);
						if ( (LA26_4==EOF||(LA26_4 >= ARROW && LA26_4 <= BAR)||(LA26_4 >= COMMA && LA26_4 <= EQUAL)||(LA26_4 >= GREATER && LA26_4 <= GREATER_EQUAL)||LA26_4==IDENT||(LA26_4 >= LBRACE && LA26_4 <= MINUS)||(LA26_4 >= NOT_EQUAL && LA26_4 <= PLUS)||(LA26_4 >= RBRACE && LA26_4 <= RBRACK)||(LA26_4 >= RPAREN && LA26_4 <= SLASH)||LA26_4==STAR||(LA26_4 >= 52 && LA26_4 <= 53)||LA26_4==57||(LA26_4 >= 59 && LA26_4 <= 66)||(LA26_4 >= 71 && LA26_4 <= 73)||LA26_4==76||LA26_4==89||(LA26_4 >= 93 && LA26_4 <= 94)||LA26_4==97) ) {
							alt26=1;
						}

					}
					else if ( (LA26_2==75||LA26_2==80||(LA26_2 >= 82 && LA26_2 <= 85)||(LA26_2 >= 91 && LA26_2 <= 92)) ) {
						alt26=1;
					}

				}
				else if ( (LA26_0==ARROW) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// ShellCommand.g:619:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
					{
					// ShellCommand.g:619:6: ( ARROW | DOT )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ARROW) ) {
						alt25=1;
					}
					else if ( (LA25_0==DOT) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// ShellCommand.g:619:8: ARROW
							{
							match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1982); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = true; }
							}
							break;
						case 2 :
							// ShellCommand.g:619:34: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_postfixExpression1988); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = false; }
							}
							break;

					}

					pushFollow(FOLLOW_propertyCall_in_postfixExpression1999);
					nPc=propertyCall(n, arrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
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
	// $ANTLR end "postfixExpression"



	// $ANTLR start "primaryExpression"
	// ShellCommand.g:635:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
			// ShellCommand.g:636:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
			int alt30=7;
			switch ( input.LA(1) ) {
			case HASH:
			case INT:
			case REAL:
			case STAR:
			case STRING:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
			case 67:
			case 79:
			case 81:
			case 86:
			case 95:
				{
				alt30=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case COLON_COLON:
					{
					alt30=1;
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
				case 52:
				case 53:
				case 57:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 71:
				case 72:
				case 73:
				case 76:
				case 89:
				case 93:
				case 94:
				case 97:
					{
					alt30=3;
					}
					break;
				case DOT:
					{
					switch ( input.LA(3) ) {
					case 51:
						{
						alt30=6;
						}
						break;
					case 56:
						{
						alt30=7;
						}
						break;
					case IDENT:
					case 75:
					case 80:
					case 82:
					case 83:
					case 84:
					case 85:
					case 91:
					case 92:
						{
						alt30=3;
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
								new NoViableAltException("", 30, 7, input);
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
							new NoViableAltException("", 30, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case AT:
				{
				alt30=2;
				}
				break;
			case 75:
			case 80:
			case 82:
			case 83:
			case 84:
			case 85:
			case 91:
			case 92:
				{
				alt30=3;
				}
				break;
			case LPAREN:
				{
				alt30=4;
				}
				break;
			case 70:
				{
				alt30=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// ShellCommand.g:637:7: nLit= literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression2039);
					nLit=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nLit; }
					}
					break;
				case 2 :
					// ShellCommand.g:638:7: nOr= objectReference
					{
					pushFollow(FOLLOW_objectReference_in_primaryExpression2053);
					nOr=objectReference();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nOr; }
					}
					break;
				case 3 :
					// ShellCommand.g:639:7: nPc= propertyCall[null, false]
					{
					pushFollow(FOLLOW_propertyCall_in_primaryExpression2065);
					nPc=propertyCall(null, false);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;
				case 4 :
					// ShellCommand.g:640:7: LPAREN nExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2076); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression2080);
					nExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2082); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExp!=null?((ShellCommandParser.expression_return)nExp).n:null); }
					}
					break;
				case 5 :
					// ShellCommand.g:641:7: nIfExp= ifExpression
					{
					pushFollow(FOLLOW_ifExpression_in_primaryExpression2094);
					nIfExp=ifExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nIfExp; }
					}
					break;
				case 6 :
					// ShellCommand.g:642:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
					{
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2106); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression2108); if (state.failed) return n;
					match(input,51,FOLLOW_51_in_primaryExpression2110); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }
					// ShellCommand.g:644:9: ( AT 'pre' )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==AT) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// ShellCommand.g:644:11: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression2133); if (state.failed) return n;
							match(input,90,FOLLOW_90_in_primaryExpression2135); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					// ShellCommand.g:645:9: ( LPAREN RPAREN )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LPAREN) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// ShellCommand.g:645:11: LPAREN RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2153); if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2155); if (state.failed) return n;
							}
							break;

					}

					}
					break;
				case 7 :
					// ShellCommand.g:646:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
					{
					id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2168); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression2170); if (state.failed) return n;
					match(input,56,FOLLOW_56_in_primaryExpression2172); if (state.failed) return n;
					// ShellCommand.g:646:31: ( LPAREN idExp= expression RPAREN )
					// ShellCommand.g:646:33: LPAREN idExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2176); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression2180);
					idExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2182); if (state.failed) return n;
					}

					if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?((ShellCommandParser.expression_return)idExp).n:null)); }
					// ShellCommand.g:648:7: ( AT 'pre' )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==AT) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// ShellCommand.g:648:9: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression2202); if (state.failed) return n;
							match(input,90,FOLLOW_90_in_primaryExpression2204); if (state.failed) return n;
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
	// ShellCommand.g:652:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
	public final ASTExpression objectReference() throws RecognitionException {
		ASTExpression n = null;


		Token objectName=null;

		try {
			// ShellCommand.g:653:3: ( AT objectName= IDENT )
			// ShellCommand.g:654:3: AT objectName= IDENT
			{
			match(input,AT,FOLLOW_AT_in_objectReference2230); if (state.failed) return n;
			objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2238); if (state.failed) return n;
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
	// ShellCommand.g:668:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
	public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExpQuery =null;
		ASTExpression nExpIterate =null;
		ParserRuleReturnScope nExpOperation =null;
		ASTTypeArgExpression nExpType =null;
		ASTInStateExpression nExpInState =null;

		try {
			// ShellCommand.g:669:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
			int alt31=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA31_1 = input.LA(2);
				if ( ((( input.LA(2) == LPAREN )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=3;
				}

				}
				break;
			case 75:
				{
				alt31=2;
				}
				break;
			case 80:
			case 84:
			case 85:
			case 91:
			case 92:
				{
				alt31=4;
				}
				break;
			case 82:
			case 83:
				{
				alt31=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// ShellCommand.g:673:7: {...}?{...}?nExpQuery= queryExpression[source]
					{
					if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
					}
					if ( !(( input.LA(2) == LPAREN )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
					}
					pushFollow(FOLLOW_queryExpression_in_propertyCall2303);
					nExpQuery=queryExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpQuery; }
					}
					break;
				case 2 :
					// ShellCommand.g:676:7: nExpIterate= iterateExpression[source]
					{
					pushFollow(FOLLOW_iterateExpression_in_propertyCall2316);
					nExpIterate=iterateExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpIterate; }
					}
					break;
				case 3 :
					// ShellCommand.g:677:7: nExpOperation= operationExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_operationExpression_in_propertyCall2329);
					nExpOperation=operationExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExpOperation!=null?((ShellCommandParser.operationExpression_return)nExpOperation).n:null); }
					}
					break;
				case 4 :
					// ShellCommand.g:678:7: nExpType= typeExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_typeExpression_in_propertyCall2342);
					nExpType=typeExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpType; }
					}
					break;
				case 5 :
					// ShellCommand.g:679:7: nExpInState= inStateExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_inStateExpression_in_propertyCall2355);
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
	// ShellCommand.g:688:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
	public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTElemVarsDeclaration decls =null;
		ParserRuleReturnScope nExp =null;

		ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
		try {
			// ShellCommand.g:689:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
			// ShellCommand.g:690:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
			{
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2390); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2397); if (state.failed) return n;
			// ShellCommand.g:692:5: (decls= elemVarsDeclaration BAR )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==IDENT) ) {
				int LA32_1 = input.LA(2);
				if ( ((LA32_1 >= BAR && LA32_1 <= COLON)||LA32_1==COMMA) ) {
					alt32=1;
				}
			}
			switch (alt32) {
				case 1 :
					// ShellCommand.g:692:7: decls= elemVarsDeclaration BAR
					{
					pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2408);
					decls=elemVarsDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {decl = decls;}
					match(input,BAR,FOLLOW_BAR_in_queryExpression2412); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_queryExpression2423);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2429); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?((ShellCommandParser.expression_return)nExp).n:null)); }
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
	// ShellCommand.g:706:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
	public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTElemVarsDeclaration decls =null;
		ASTVariableInitialization init =null;
		ParserRuleReturnScope nExp =null;

		try {
			// ShellCommand.g:706:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
			// ShellCommand.g:707:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
			{
			i=(Token)match(input,75,FOLLOW_75_in_iterateExpression2461); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2467); if (state.failed) return n;
			pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2475);
			decls=elemVarsDeclaration();
			state._fsp--;
			if (state.failed) return n;
			match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2477); if (state.failed) return n;
			pushFollow(FOLLOW_variableInitialization_in_iterateExpression2485);
			init=variableInitialization();
			state._fsp--;
			if (state.failed) return n;
			match(input,BAR,FOLLOW_BAR_in_iterateExpression2487); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_iterateExpression2495);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2501); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?((ShellCommandParser.expression_return)nExp).n:null)); }
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
	// ShellCommand.g:728:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
	public final ShellCommandParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ShellCommandParser.operationExpression_return retval = new ShellCommandParser.operationExpression_return();
		retval.start = input.LT(1);

		Token name=null;
		ParserRuleReturnScope rolename =null;
		ParserRuleReturnScope e =null;

		try {
			// ShellCommand.g:730:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
			// ShellCommand.g:731:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2545); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }
			// ShellCommand.g:737:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==LBRACK) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// ShellCommand.g:737:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2567); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operationExpression2580);
					rolename=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((ShellCommandParser.expression_return)rolename).n:null)); }
					// ShellCommand.g:739:9: ( COMMA rolename= expression )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==COMMA) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// ShellCommand.g:739:10: COMMA rolename= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_operationExpression2593); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression2597);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((ShellCommandParser.expression_return)rolename).n:null)); }
							}
							break;

						default :
							break loop33;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2609); if (state.failed) return retval;
					// ShellCommand.g:742:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==LBRACK) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// ShellCommand.g:742:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2626); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression2641);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((ShellCommandParser.expression_return)rolename).n:null)); }
							// ShellCommand.g:744:11: ( COMMA rolename= expression )*
							loop34:
							while (true) {
								int alt34=2;
								int LA34_0 = input.LA(1);
								if ( (LA34_0==COMMA) ) {
									alt34=1;
								}

								switch (alt34) {
								case 1 :
									// ShellCommand.g:744:12: COMMA rolename= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression2656); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression2660);
									rolename=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((ShellCommandParser.expression_return)rolename).n:null)); }
									}
									break;

								default :
									break loop34;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2674); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			// ShellCommand.g:749:5: ( AT 'pre' )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==AT) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// ShellCommand.g:749:7: AT 'pre'
					{
					match(input,AT,FOLLOW_AT_in_operationExpression2699); if (state.failed) return retval;
					match(input,90,FOLLOW_90_in_operationExpression2701); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.setIsPre(); }
					}
					break;

			}

			// ShellCommand.g:751:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==LPAREN) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// ShellCommand.g:752:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2726); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.hasParentheses(); }
					// ShellCommand.g:753:7: (e= expression ( COMMA e= expression )* )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==AT||LA39_0==HASH||(LA39_0 >= IDENT && LA39_0 <= INT)||(LA39_0 >= LPAREN && LA39_0 <= MINUS)||LA39_0==PLUS||LA39_0==REAL||(LA39_0 >= STAR && LA39_0 <= STRING)||(LA39_0 >= 44 && LA39_0 <= 50)||LA39_0==67||LA39_0==70||(LA39_0 >= 75 && LA39_0 <= 76)||(LA39_0 >= 78 && LA39_0 <= 86)||(LA39_0 >= 91 && LA39_0 <= 92)||LA39_0==95) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// ShellCommand.g:754:7: e= expression ( COMMA e= expression )*
							{
							pushFollow(FOLLOW_expression_in_operationExpression2747);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((ShellCommandParser.expression_return)e).n:null)); }
							// ShellCommand.g:755:7: ( COMMA e= expression )*
							loop38:
							while (true) {
								int alt38=2;
								int LA38_0 = input.LA(1);
								if ( (LA38_0==COMMA) ) {
									alt38=1;
								}

								switch (alt38) {
								case 1 :
									// ShellCommand.g:755:9: COMMA e= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression2759); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression2763);
									e=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((ShellCommandParser.expression_return)e).n:null)); }
									}
									break;

								default :
									break loop38;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2783); if (state.failed) return retval;
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
	// ShellCommand.g:762:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN ;
	public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTInStateExpression n = null;


		Token s=null;

		 Token opToken = null; 
		try {
			// ShellCommand.g:765:4: ( ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN )
			// ShellCommand.g:766:4: ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( (input.LA(1) >= 82 && input.LA(1) <= 83) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2844); if (state.failed) return n;
			s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2853); if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2858); if (state.failed) return n;
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
	// ShellCommand.g:779:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
	public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTTypeArgExpression n = null;


		ASTType t =null;

		 Token opToken = null; 
		try {
			// ShellCommand.g:782:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
			// ShellCommand.g:783:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( input.LA(1)==80||(input.LA(1) >= 84 && input.LA(1) <= 85)||(input.LA(1) >= 91 && input.LA(1) <= 92) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2918); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_typeExpression2922);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2924); if (state.failed) return n;
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
	// ShellCommand.g:794:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
	public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
		ASTElemVarsDeclaration n = null;


		Token var1=null;
		Token varN=null;
		ASTType t =null;
		ASTType tN =null;

		try {
			// ShellCommand.g:795:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
			// ShellCommand.g:796:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
			{
			if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }
			var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2962); if (state.failed) return n;
			// ShellCommand.g:797:17: ( COLON t= type )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==COLON) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// ShellCommand.g:797:18: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2965); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_elemVarsDeclaration2969);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}
			// ShellCommand.g:798:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==COMMA) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// ShellCommand.g:798:5: COMMA varN= IDENT ( COLON tN= type )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2979); if (state.failed) return n;
					varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2985); if (state.failed) return n;
					// ShellCommand.g:798:24: ( COLON tN= type )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==COLON) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// ShellCommand.g:798:25: COLON tN= type
							{
							match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2988); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_elemVarsDeclaration2994);
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
					break loop43;
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
	// ShellCommand.g:806:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
	public final ASTVariableInitialization variableInitialization() throws RecognitionException {
		ASTVariableInitialization n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// ShellCommand.g:807:5: (name= IDENT COLON t= type EQUAL e= expression )
			// ShellCommand.g:808:5: name= IDENT COLON t= type EQUAL e= expression
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3022); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableInitialization3024); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableInitialization3028);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3030); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_variableInitialization3034);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?((ShellCommandParser.expression_return)e).n:null)); }
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
	// ShellCommand.g:817:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
	public final ASTExpression ifExpression() throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;

		try {
			// ShellCommand.g:818:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
			// ShellCommand.g:819:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
			{
			i=(Token)match(input,70,FOLLOW_70_in_ifExpression3066); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression3070);
			cond=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,94,FOLLOW_94_in_ifExpression3072); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression3076);
			t=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,63,FOLLOW_63_in_ifExpression3078); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression3082);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,65,FOLLOW_65_in_ifExpression3084); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?((ShellCommandParser.expression_return)cond).n:null), (t!=null?((ShellCommandParser.expression_return)t).n:null), (e!=null?((ShellCommandParser.expression_return)e).n:null)); }
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
	// ShellCommand.g:838:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
			// ShellCommand.g:839:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
			int alt44=12;
			switch ( input.LA(1) ) {
			case 95:
				{
				alt44=1;
				}
				break;
			case 67:
				{
				alt44=2;
				}
				break;
			case INT:
				{
				alt44=3;
				}
				break;
			case REAL:
				{
				alt44=4;
				}
				break;
			case STRING:
				{
				alt44=5;
				}
				break;
			case HASH:
				{
				alt44=6;
				}
				break;
			case IDENT:
				{
				alt44=7;
				}
				break;
			case 44:
			case 46:
			case 47:
			case 48:
				{
				int LA44_8 = input.LA(2);
				if ( (LA44_8==LPAREN) ) {
					alt44=9;
				}
				else if ( (LA44_8==LBRACE) ) {
					alt44=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 45:
			case 81:
				{
				alt44=9;
				}
				break;
			case 50:
			case 79:
			case 86:
				{
				alt44=10;
				}
				break;
			case 49:
				{
				alt44=11;
				}
				break;
			case STAR:
				{
				alt44=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// ShellCommand.g:840:7: t= 'true'
					{
					t=(Token)match(input,95,FOLLOW_95_in_literal3123); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }
					}
					break;
				case 2 :
					// ShellCommand.g:841:7: f= 'false'
					{
					f=(Token)match(input,67,FOLLOW_67_in_literal3137); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }
					}
					break;
				case 3 :
					// ShellCommand.g:842:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_literal3150); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }
					}
					break;
				case 4 :
					// ShellCommand.g:843:7: r= REAL
					{
					r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3165); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }
					}
					break;
				case 5 :
					// ShellCommand.g:844:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_literal3179); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }
					}
					break;
				case 6 :
					// ShellCommand.g:845:7: HASH enumLit= IDENT
					{
					match(input,HASH,FOLLOW_HASH_in_literal3189); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3193); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}
					}
					break;
				case 7 :
					// ShellCommand.g:846:7: enumName= IDENT '::' enumLit= IDENT
					{
					enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3205); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal3207); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3211); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }
					}
					break;
				case 8 :
					// ShellCommand.g:847:7: nColIt= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_literal3223);
					nColIt=collectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nColIt; }
					}
					break;
				case 9 :
					// ShellCommand.g:848:7: nEColIt= emptyCollectionLiteral
					{
					pushFollow(FOLLOW_emptyCollectionLiteral_in_literal3235);
					nEColIt=emptyCollectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nEColIt; }
					}
					break;
				case 10 :
					// ShellCommand.g:849:7: nUndLit= undefinedLiteral
					{
					pushFollow(FOLLOW_undefinedLiteral_in_literal3247);
					nUndLit=undefinedLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nUndLit; }
					}
					break;
				case 11 :
					// ShellCommand.g:850:7: nTupleLit= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_literal3259);
					nTupleLit=tupleLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nTupleLit; }
					}
					break;
				case 12 :
					// ShellCommand.g:851:7: un= STAR
					{
					un=(Token)match(input,STAR,FOLLOW_STAR_in_literal3271); if (state.failed) return n;
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
	// ShellCommand.g:859:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
	public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
		ASTCollectionLiteral n = null;


		ASTCollectionItem ci =null;

		 Token op = null; 
		try {
			// ShellCommand.g:861:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
			// ShellCommand.g:862:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
			{
			if ( state.backtracking==0 ) { op = input.LT(1); }
			if ( input.LA(1)==44||(input.LA(1) >= 46 && input.LA(1) <= 48) ) {
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
			match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3338); if (state.failed) return n;
			// ShellCommand.g:866:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==AT||LA46_0==HASH||(LA46_0 >= IDENT && LA46_0 <= INT)||(LA46_0 >= LPAREN && LA46_0 <= MINUS)||LA46_0==PLUS||LA46_0==REAL||(LA46_0 >= STAR && LA46_0 <= STRING)||(LA46_0 >= 44 && LA46_0 <= 50)||LA46_0==67||LA46_0==70||(LA46_0 >= 75 && LA46_0 <= 76)||(LA46_0 >= 78 && LA46_0 <= 86)||(LA46_0 >= 91 && LA46_0 <= 92)||LA46_0==95) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// ShellCommand.g:867:7: ci= collectionItem ( COMMA ci= collectionItem )*
					{
					pushFollow(FOLLOW_collectionItem_in_collectionLiteral3355);
					ci=collectionItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addItem(ci); }
					// ShellCommand.g:868:7: ( COMMA ci= collectionItem )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==COMMA) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// ShellCommand.g:868:9: COMMA ci= collectionItem
							{
							match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3368); if (state.failed) return n;
							pushFollow(FOLLOW_collectionItem_in_collectionLiteral3372);
							ci=collectionItem();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addItem(ci); }
							}
							break;

						default :
							break loop45;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3391); if (state.failed) return n;
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
	// ShellCommand.g:877:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
	public final ASTCollectionItem collectionItem() throws RecognitionException {
		ASTCollectionItem n = null;


		ParserRuleReturnScope e =null;

		 n = new ASTCollectionItem(); 
		try {
			// ShellCommand.g:879:5: (e= expression ( DOTDOT e= expression )? )
			// ShellCommand.g:880:5: e= expression ( DOTDOT e= expression )?
			{
			pushFollow(FOLLOW_expression_in_collectionItem3420);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setFirst((e!=null?((ShellCommandParser.expression_return)e).n:null)); }
			// ShellCommand.g:881:5: ( DOTDOT e= expression )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==DOTDOT) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// ShellCommand.g:881:7: DOTDOT e= expression
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3431); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_collectionItem3435);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setSecond((e!=null?((ShellCommandParser.expression_return)e).n:null)); }
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
	// ShellCommand.g:891:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
	public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
		ASTEmptyCollectionLiteral n = null;


		ASTCollectionType t =null;

		try {
			// ShellCommand.g:892:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==81) ) {
				alt48=1;
			}
			else if ( ((LA48_0 >= 44 && LA48_0 <= 48)) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// ShellCommand.g:893:5: 'oclEmpty' LPAREN t= collectionType RPAREN
					{
					match(input,81,FOLLOW_81_in_emptyCollectionLiteral3464); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3466); if (state.failed) return n;
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3470);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3472); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;
				case 2 :
					// ShellCommand.g:896:5: t= collectionType LBRACE RBRACE
					{
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3488);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3490); if (state.failed) return n;
					match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3492); if (state.failed) return n;
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
	// ShellCommand.g:907:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
	public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
		ASTUndefinedLiteral n = null;


		ASTType t =null;

		try {
			// ShellCommand.g:908:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
			int alt49=4;
			switch ( input.LA(1) ) {
			case 86:
				{
				alt49=1;
				}
				break;
			case 50:
				{
				alt49=2;
				}
				break;
			case 79:
				{
				int LA49_3 = input.LA(2);
				if ( (LA49_3==LPAREN) ) {
					alt49=3;
				}
				else if ( (LA49_3==EOF||LA49_3==ARROW||LA49_3==BAR||(LA49_3 >= COMMA && LA49_3 <= EQUAL)||(LA49_3 >= GREATER && LA49_3 <= GREATER_EQUAL)||LA49_3==IDENT||LA49_3==LBRACE||(LA49_3 >= LESS && LA49_3 <= LESS_EQUAL)||LA49_3==MINUS||(LA49_3 >= NOT_EQUAL && LA49_3 <= PLUS)||(LA49_3 >= RBRACE && LA49_3 <= RBRACK)||(LA49_3 >= RPAREN && LA49_3 <= SLASH)||LA49_3==STAR||(LA49_3 >= 52 && LA49_3 <= 53)||LA49_3==57||(LA49_3 >= 59 && LA49_3 <= 66)||(LA49_3 >= 71 && LA49_3 <= 73)||LA49_3==76||LA49_3==89||(LA49_3 >= 93 && LA49_3 <= 94)||LA49_3==97) ) {
					alt49=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 3, input);
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
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// ShellCommand.g:909:5: 'oclUndefined' LPAREN t= type RPAREN
					{
					match(input,86,FOLLOW_86_in_undefinedLiteral3522); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3524); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral3528);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3530); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 2 :
					// ShellCommand.g:912:5: 'Undefined'
					{
					match(input,50,FOLLOW_50_in_undefinedLiteral3544); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;
				case 3 :
					// ShellCommand.g:915:5: 'null' LPAREN t= type RPAREN
					{
					match(input,79,FOLLOW_79_in_undefinedLiteral3558); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3560); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral3564);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3566); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 4 :
					// ShellCommand.g:918:5: 'null'
					{
					match(input,79,FOLLOW_79_in_undefinedLiteral3580); if (state.failed) return n;
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
	// ShellCommand.g:928:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
	public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
		ASTTupleLiteral n = null;


		ASTTupleItem ti =null;

		 List tiList = new ArrayList(); 
		try {
			// ShellCommand.g:930:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
			// ShellCommand.g:931:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
			{
			match(input,49,FOLLOW_49_in_tupleLiteral3619); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3625); if (state.failed) return n;
			pushFollow(FOLLOW_tupleItem_in_tupleLiteral3633);
			ti=tupleItem();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tiList.add(ti); }
			// ShellCommand.g:934:5: ( COMMA ti= tupleItem )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==COMMA) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// ShellCommand.g:934:7: COMMA ti= tupleItem
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3644); if (state.failed) return n;
					pushFollow(FOLLOW_tupleItem_in_tupleLiteral3648);
					ti=tupleItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tiList.add(ti); }
					}
					break;

				default :
					break loop50;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3659); if (state.failed) return n;
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
	// ShellCommand.g:942:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
	public final ASTTupleItem tupleItem() throws RecognitionException {
		ASTTupleItem n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// ShellCommand.g:943:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
			// ShellCommand.g:944:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3690); if (state.failed) return n;
			// ShellCommand.g:945:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==COLON) ) {
				int LA51_1 = input.LA(2);
				if ( (synpred6_ShellCommand()) ) {
					alt51=1;
				}
				else if ( (true) ) {
					alt51=2;
				}

			}
			else if ( (LA51_0==EQUAL) ) {
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
					// ShellCommand.g:948:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
					{
					match(input,COLON,FOLLOW_COLON_in_tupleItem3729); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_tupleItem3733);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3735); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_tupleItem3739);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?((ShellCommandParser.expression_return)e).n:null)); }
					}
					break;
				case 2 :
					// ShellCommand.g:951:7: ( COLON | EQUAL ) e= expression
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
					pushFollow(FOLLOW_expression_in_tupleItem3771);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?((ShellCommandParser.expression_return)e).n:null)); }
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
	// ShellCommand.g:962:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
	public final ASTType type() throws RecognitionException {
		ASTType n = null;


		ASTSimpleType nTSimple =null;
		ASTCollectionType nTCollection =null;
		ASTTupleType nTTuple =null;

		 Token tok = null; 
		try {
			// ShellCommand.g:964:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
			// ShellCommand.g:965:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }
			// ShellCommand.g:966:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			int alt52=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt52=1;
				}
				break;
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
				{
				alt52=2;
				}
				break;
			case 49:
				{
				alt52=3;
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
					// ShellCommand.g:967:7: nTSimple= simpleType
					{
					pushFollow(FOLLOW_simpleType_in_type3837);
					nTSimple=simpleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 2 :
					// ShellCommand.g:968:7: nTCollection= collectionType
					{
					pushFollow(FOLLOW_collectionType_in_type3849);
					nTCollection=collectionType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 3 :
					// ShellCommand.g:969:7: nTTuple= tupleType
					{
					pushFollow(FOLLOW_tupleType_in_type3861);
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
	// ShellCommand.g:974:1: typeOnly returns [ASTType n] : nT= type EOF ;
	public final ASTType typeOnly() throws RecognitionException {
		ASTType n = null;


		ASTType nT =null;

		try {
			// ShellCommand.g:975:5: (nT= type EOF )
			// ShellCommand.g:976:5: nT= type EOF
			{
			pushFollow(FOLLOW_type_in_typeOnly3893);
			nT=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_typeOnly3895); if (state.failed) return n;
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
	// ShellCommand.g:986:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
	public final ASTSimpleType simpleType() throws RecognitionException {
		ASTSimpleType n = null;


		Token name=null;

		try {
			// ShellCommand.g:987:5: (name= IDENT )
			// ShellCommand.g:988:5: name= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3923); if (state.failed) return n;
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
	// ShellCommand.g:996:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
	public final ASTCollectionType collectionType() throws RecognitionException {
		ASTCollectionType n = null;


		ASTType elemType =null;

		 Token op = null; 
		try {
			// ShellCommand.g:998:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
			// ShellCommand.g:999:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
			{
			if ( state.backtracking==0 ) { op = input.LT(1); }
			if ( (input.LA(1) >= 44 && input.LA(1) <= 48) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3988); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_collectionType3992);
			elemType=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3994); if (state.failed) return n;
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
	// ShellCommand.g:1009:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
	public final ASTTupleType tupleType() throws RecognitionException {
		ASTTupleType n = null;


		ASTTuplePart tp =null;

		 List tpList = new ArrayList(); 
		try {
			// ShellCommand.g:1011:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
			// ShellCommand.g:1012:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
			{
			match(input,49,FOLLOW_49_in_tupleType4028); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4030); if (state.failed) return n;
			pushFollow(FOLLOW_tuplePart_in_tupleType4039);
			tp=tuplePart();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tpList.add(tp); }
			// ShellCommand.g:1014:5: ( COMMA tp= tuplePart )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==COMMA) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// ShellCommand.g:1014:7: COMMA tp= tuplePart
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleType4050); if (state.failed) return n;
					pushFollow(FOLLOW_tuplePart_in_tupleType4054);
					tp=tuplePart();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tpList.add(tp); }
					}
					break;

				default :
					break loop53;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4066); if (state.failed) return n;
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
	// ShellCommand.g:1023:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
	public final ASTTuplePart tuplePart() throws RecognitionException {
		ASTTuplePart n = null;


		Token name=null;
		ASTType t =null;

		try {
			// ShellCommand.g:1024:5: (name= IDENT COLON t= type )
			// ShellCommand.g:1025:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4098); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_tuplePart4100); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_tuplePart4104);
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



	// $ANTLR start "statOnly"
	// ShellCommand.g:1064:1: statOnly returns [ASTStatement n] : s= stat EOF ;
	public final ASTStatement statOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;

		try {
			// ShellCommand.g:1065:3: (s= stat EOF )
			// ShellCommand.g:1066:3: s= stat EOF
			{
			pushFollow(FOLLOW_stat_in_statOnly4153);
			s=stat();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_statOnly4157); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = (s!=null?((ShellCommandParser.stat_return)s).n:null); }
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
	// ShellCommand.g:1076:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
	public final ShellCommandParser.stat_return stat() throws RecognitionException {
		ShellCommandParser.stat_return retval = new ShellCommandParser.stat_return();
		retval.start = input.LT(1);

		ASTStatement s =null;
		ASTStatement s2 =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// ShellCommand.g:1080:3: (s= singleStat ( SEMI s2= singleStat )* )
			// ShellCommand.g:1081:3: s= singleStat ( SEMI s2= singleStat )*
			{
			pushFollow(FOLLOW_singleStat_in_stat4192);
			s=singleStat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {seq.addStatement(s);}
			// ShellCommand.g:1082:3: ( SEMI s2= singleStat )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==SEMI) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// ShellCommand.g:1083:5: SEMI s2= singleStat
					{
					match(input,SEMI,FOLLOW_SEMI_in_stat4204); if (state.failed) return retval;
					pushFollow(FOLLOW_singleStat_in_stat4214);
					s2=singleStat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {seq.addStatement(s2); }
					}
					break;

				default :
					break loop54;
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
	// ShellCommand.g:1095:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
			// ShellCommand.g:1096:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
			int alt55=11;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==EOF||LA55_0==SEMI||(LA55_0 >= 63 && LA55_0 <= 64)) ) {
				alt55=1;
			}
			else if ( (LA55_0==76) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==MINUS||LA55_0==PLUS||LA55_0==78) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==95) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==67) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==INT) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==REAL) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==STRING) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==HASH) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==IDENT) ) {
				int LA55_13 = input.LA(2);
				if ( (synpred7_ShellCommand()) ) {
					alt55=2;
				}
				else if ( (true) ) {
					alt55=3;
				}

			}
			else if ( (LA55_0==44||(LA55_0 >= 46 && LA55_0 <= 48)) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==81) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==45) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==86) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==50) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==79) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==49) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==STAR) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==AT) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==75) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==80||(LA55_0 >= 84 && LA55_0 <= 85)||(LA55_0 >= 91 && LA55_0 <= 92)) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( ((LA55_0 >= 82 && LA55_0 <= 83)) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==LPAREN) && (synpred7_ShellCommand())) {
				alt55=2;
			}
			else if ( (LA55_0==70) ) {
				int LA55_27 = input.LA(2);
				if ( (synpred7_ShellCommand()) ) {
					alt55=2;
				}
				else if ( (true) ) {
					alt55=8;
				}

			}
			else if ( (LA55_0==77) ) {
				alt55=4;
			}
			else if ( (LA55_0==60) ) {
				alt55=5;
			}
			else if ( (LA55_0==73) ) {
				alt55=6;
			}
			else if ( (LA55_0==59) ) {
				alt55=7;
			}
			else if ( (LA55_0==68) ) {
				alt55=9;
			}
			else if ( (LA55_0==96) ) {
				alt55=10;
			}
			else if ( (LA55_0==54) ) {
				alt55=11;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// ShellCommand.g:1097:5: emp= emptyStat
					{
					pushFollow(FOLLOW_emptyStat_in_singleStat4254);
					emp=emptyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = emp; }
					}
					break;
				case 2 :
					// ShellCommand.g:1099:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
					{
					pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4280);
					sse=statStartingWithExpr();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (sse!=null?((ShellCommandParser.statStartingWithExpr_return)sse).n:null); }
					}
					break;
				case 3 :
					// ShellCommand.g:1100:5: vas= varAssignStat
					{
					pushFollow(FOLLOW_varAssignStat_in_singleStat4292);
					vas=varAssignStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = vas; }
					}
					break;
				case 4 :
					// ShellCommand.g:1101:5: ocs= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_singleStat4306);
					ocs=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ocs!=null?((ShellCommandParser.objCreateStat_return)ocs).n:null); }
					}
					break;
				case 5 :
					// ShellCommand.g:1102:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleStat4320);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((ShellCommandParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 6 :
					// ShellCommand.g:1103:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleStat4333);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((ShellCommandParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 7 :
					// ShellCommand.g:1104:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleStat4350);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((ShellCommandParser.lnkDelStat_return)lds).n:null); }
					}
					break;
				case 8 :
					// ShellCommand.g:1105:5: ces= condExStat
					{
					pushFollow(FOLLOW_condExStat_in_singleStat4367);
					ces=condExStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ces!=null?((ShellCommandParser.condExStat_return)ces).n:null); }
					}
					break;
				case 9 :
					// ShellCommand.g:1106:5: its= iterStat
					{
					pushFollow(FOLLOW_iterStat_in_singleStat4384);
					its=iterStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (its!=null?((ShellCommandParser.iterStat_return)its).n:null); }
					}
					break;
				case 10 :
					// ShellCommand.g:1108:5: whs= whileStat
					{
					pushFollow(FOLLOW_whileStat_in_singleStat4406);
					whs=whileStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (whs!=null?((ShellCommandParser.whileStat_return)whs).n:null); }
					}
					break;
				case 11 :
					// ShellCommand.g:1109:5: blk= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_singleStat4424);
					blk=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (blk!=null?((ShellCommandParser.blockStat_return)blk).n:null); }
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
	// ShellCommand.g:1116:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
	public final ASTEmptyStatement emptyStat() throws RecognitionException {
		ASTEmptyStatement n = null;


		try {
			// ShellCommand.g:1117:3: ( nothing )
			// ShellCommand.g:1118:3: nothing
			{
			pushFollow(FOLLOW_nothing_in_emptyStat4451);
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
	// ShellCommand.g:1123:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
	public final ShellCommandParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
		ShellCommandParser.statStartingWithExpr_return retval = new ShellCommandParser.statStartingWithExpr_return();
		retval.start = input.LT(1);

		ASTExpression expr =null;
		ASTAttributeAssignmentStatement aas =null;

		try {
			// ShellCommand.g:1124:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
			// ShellCommand.g:1125:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
			{
			pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4477);
			expr=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			// ShellCommand.g:1126:3: (aas= attAssignStat[$expr.n] )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==DOT) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// ShellCommand.g:1127:5: aas= attAssignStat[$expr.n]
					{
					pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4491);
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
	// ShellCommand.g:1139:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
	public final ASTStatement varAssignStat() throws RecognitionException {
		ASTStatement n = null;


		Token varName=null;
		ASTRValue rVal =null;

		try {
			// ShellCommand.g:1140:3: (varName= IDENT COLON_EQUAL rVal= rValue )
			// ShellCommand.g:1141:3: varName= IDENT COLON_EQUAL rVal= rValue
			{
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4529); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4533); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_varAssignStat4541);
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
	// ShellCommand.g:1153:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
	public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
		ASTAttributeAssignmentStatement n = null;


		Token attName=null;
		ASTRValue r =null;

		try {
			// ShellCommand.g:1154:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
			// ShellCommand.g:1155:3: DOT attName= IDENT COLON_EQUAL r= rValue
			{
			match(input,DOT,FOLLOW_DOT_in_attAssignStat4565); if (state.failed) return n;
			attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat4574); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat4578); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_attAssignStat4586);
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
	// ShellCommand.g:1167:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
	public final ShellCommandParser.objCreateStat_return objCreateStat() throws RecognitionException {
		ShellCommandParser.objCreateStat_return retval = new ShellCommandParser.objCreateStat_return();
		retval.start = input.LT(1);

		ASTSimpleType ident =null;
		ASTExpression objName =null;
		ParserRuleReturnScope p =null;

		try {
			// ShellCommand.g:1168:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
			// ShellCommand.g:1169:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			{
			match(input,77,FOLLOW_77_in_objCreateStat4612); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_objCreateStat4620);
			ident=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			// ShellCommand.g:1171:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==LPAREN) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// ShellCommand.g:1172:5: LPAREN (objName= inSoilExpression )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4630); if (state.failed) return retval;
					// ShellCommand.g:1173:7: (objName= inSoilExpression )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==AT||LA57_0==HASH||(LA57_0 >= IDENT && LA57_0 <= INT)||(LA57_0 >= LPAREN && LA57_0 <= MINUS)||LA57_0==PLUS||LA57_0==REAL||(LA57_0 >= STAR && LA57_0 <= STRING)||(LA57_0 >= 44 && LA57_0 <= 50)||LA57_0==67||LA57_0==70||(LA57_0 >= 75 && LA57_0 <= 76)||(LA57_0 >= 78 && LA57_0 <= 86)||(LA57_0 >= 91 && LA57_0 <= 92)||LA57_0==95) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// ShellCommand.g:1173:8: objName= inSoilExpression
							{
							pushFollow(FOLLOW_inSoilExpression_in_objCreateStat4643);
							objName=inSoilExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4651); if (state.failed) return retval;
					}
					break;

			}

			// ShellCommand.g:1177:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==55) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// ShellCommand.g:1178:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
					{
					match(input,55,FOLLOW_55_in_objCreateStat4669); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4677); if (state.failed) return retval;
					pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4691);
					p=rValListMin2WithOptionalQualifiers();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4699); if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = new ASTNewLinkObjectStatement((retval.start), ident, (p!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null), objName);
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
	// ShellCommand.g:1197:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
	public final ShellCommandParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
		ShellCommandParser.objDestroyStat_return retval = new ShellCommandParser.objDestroyStat_return();
		retval.start = input.LT(1);

		List<ASTExpression> el =null;

		try {
			// ShellCommand.g:1198:3: ( 'destroy' el= exprListMin1 )
			// ShellCommand.g:1199:3: 'destroy' el= exprListMin1
			{
			match(input,60,FOLLOW_60_in_objDestroyStat4735); if (state.failed) return retval;
			pushFollow(FOLLOW_exprListMin1_in_objDestroyStat4743);
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
	// ShellCommand.g:1218:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
	public final ShellCommandParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
		ShellCommandParser.lnkInsStat_return retval = new ShellCommandParser.lnkInsStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// ShellCommand.g:1219:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
			// ShellCommand.g:1220:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
			{
			match(input,73,FOLLOW_73_in_lnkInsStat4769); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat4773); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4783);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat4787); if (state.failed) return retval;
			match(input,74,FOLLOW_74_in_lnkInsStat4791); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat4799); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkInsertionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// ShellCommand.g:1230:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
	public final ShellCommandParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
		ShellCommandParser.rValListMin2WithOptionalQualifiers_return retval = new ShellCommandParser.rValListMin2WithOptionalQualifiers_return();
		retval.start = input.LT(1);

		ASTRValue r =null;
		List<ASTRValue> qualifierValues =null;


		  retval.participans = new ArrayList<ASTRValue>();
		  retval.qualifiers = new ArrayList<List<ASTRValue>>();
		  List<ASTRValue> currentQualifiers = Collections.emptyList();

		try {
			// ShellCommand.g:1236:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
			// ShellCommand.g:1237:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4828);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// ShellCommand.g:1238:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==LBRACE) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// ShellCommand.g:1239:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4839); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4848);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4855); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4871); if (state.failed) return retval;
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4882);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// ShellCommand.g:1251:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==LBRACE) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// ShellCommand.g:1252:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4893); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4902);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4909); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			// ShellCommand.g:1261:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==COMMA) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// ShellCommand.g:1262:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4931); if (state.failed) return retval;
					pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4946);
					r=rValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.participans.add(r); }
					// ShellCommand.g:1266:5: ( LBRACE qualifierValues= rValList RBRACE )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==LBRACE) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// ShellCommand.g:1267:6: LBRACE qualifierValues= rValList RBRACE
							{
							match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4966); if (state.failed) return retval;
							pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4977);
							qualifierValues=rValList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
							match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4986); if (state.failed) return retval;
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
					break loop63;
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
	// ShellCommand.g:1282:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
	public final ShellCommandParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
		ShellCommandParser.lnkDelStat_return retval = new ShellCommandParser.lnkDelStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// ShellCommand.g:1283:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
			// ShellCommand.g:1284:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
			{
			match(input,59,FOLLOW_59_in_lnkDelStat5027); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat5031); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5041);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat5045); if (state.failed) return retval;
			match(input,69,FOLLOW_69_in_lnkDelStat5049); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat5058); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkDeletionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((ShellCommandParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// ShellCommand.g:1298:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
	public final ShellCommandParser.condExStat_return condExStat() throws RecognitionException {
		ShellCommandParser.condExStat_return retval = new ShellCommandParser.condExStat_return();
		retval.start = input.LT(1);

		ASTExpression con =null;
		ASTStatement ts =null;
		ASTStatement es =null;


		  ASTStatement elseStat = new ASTEmptyStatement();

		try {
			// ShellCommand.g:1302:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
			// ShellCommand.g:1303:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
			{
			match(input,70,FOLLOW_70_in_condExStat5089); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_condExStat5098);
			con=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,94,FOLLOW_94_in_condExStat5102); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5111);
			ts=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			// ShellCommand.g:1307:3: ( 'else' es= statOrImplicitBlock )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==63) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// ShellCommand.g:1308:5: 'else' es= statOrImplicitBlock
					{
					match(input,63,FOLLOW_63_in_condExStat5122); if (state.failed) return retval;
					pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5134);
					es=statOrImplicitBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { elseStat = es; }
					}
					break;

			}

			match(input,64,FOLLOW_64_in_condExStat5146); if (state.failed) return retval;
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
	// ShellCommand.g:1319:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final ShellCommandParser.iterStat_return iterStat() throws RecognitionException {
		ShellCommandParser.iterStat_return retval = new ShellCommandParser.iterStat_return();
		retval.start = input.LT(1);

		Token var=null;
		ASTExpression set =null;
		ASTStatement s =null;

		try {
			// ShellCommand.g:1320:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// ShellCommand.g:1321:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,68,FOLLOW_68_in_iterStat5171); if (state.failed) return retval;
			var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat5179); if (state.failed) return retval;
			match(input,72,FOLLOW_72_in_iterStat5183); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_iterStat5191);
			set=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,62,FOLLOW_62_in_iterStat5195); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat5203);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,64,FOLLOW_64_in_iterStat5208); if (state.failed) return retval;
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
	// ShellCommand.g:1336:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final ShellCommandParser.whileStat_return whileStat() throws RecognitionException {
		ShellCommandParser.whileStat_return retval = new ShellCommandParser.whileStat_return();
		retval.start = input.LT(1);

		ASTExpression cond =null;
		ASTStatement s =null;

		try {
			// ShellCommand.g:1337:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// ShellCommand.g:1338:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,96,FOLLOW_96_in_whileStat5234); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_whileStat5242);
			cond=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,62,FOLLOW_62_in_whileStat5246); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat5254);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,64,FOLLOW_64_in_whileStat5259); if (state.failed) return retval;
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
	// ShellCommand.g:1350:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
	public final ShellCommandParser.blockStat_return blockStat() throws RecognitionException {
		ShellCommandParser.blockStat_return retval = new ShellCommandParser.blockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

		try {
			// ShellCommand.g:1354:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
			// ShellCommand.g:1355:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
			{
			match(input,54,FOLLOW_54_in_blockStat5289); if (state.failed) return retval;
			// ShellCommand.g:1356:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==58) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// ShellCommand.g:1356:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
					{
					match(input,58,FOLLOW_58_in_blockStat5294); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_blockStat5300);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
					// ShellCommand.g:1356:73: ( COMMA vd1= variableDeclaration )*
					loop65:
					while (true) {
						int alt65=2;
						int LA65_0 = input.LA(1);
						if ( (LA65_0==COMMA) ) {
							alt65=1;
						}

						switch (alt65) {
						case 1 :
							// ShellCommand.g:1356:75: COMMA vd1= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_blockStat5306); if (state.failed) return retval;
							pushFollow(FOLLOW_variableDeclaration_in_blockStat5312);
							vd1=variableDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
							}
							break;

						default :
							break loop65;
						}
					}

					match(input,SEMI,FOLLOW_SEMI_in_blockStat5319); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_stat_in_blockStat5329);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((ShellCommandParser.stat_return)s).n:null)); }
			match(input,64,FOLLOW_64_in_blockStat5334); if (state.failed) return retval;
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
	// ShellCommand.g:1365:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
	public final ShellCommandParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
		ShellCommandParser.implicitBlockStat_return retval = new ShellCommandParser.implicitBlockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), false);

		try {
			// ShellCommand.g:1369:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
			// ShellCommand.g:1370:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
			{
			match(input,58,FOLLOW_58_in_implicitBlockStat5360); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5366);
			vd=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
			// ShellCommand.g:1370:72: ( COMMA vd1= variableDeclaration )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==COMMA) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// ShellCommand.g:1370:74: COMMA vd1= variableDeclaration
					{
					match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat5372); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5378);
					vd1=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
					}
					break;

				default :
					break loop67;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat5385); if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_implicitBlockStat5393);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((ShellCommandParser.stat_return)s).n:null)); }
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
	// ShellCommand.g:1374:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
	public final ASTStatement statOrImplicitBlock() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;

		try {
			// ShellCommand.g:1375:3: ( (s1= stat |s2= implicitBlockStat ) )
			// ShellCommand.g:1376:3: (s1= stat |s2= implicitBlockStat )
			{
			// ShellCommand.g:1376:3: (s1= stat |s2= implicitBlockStat )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==AT||LA68_0==HASH||(LA68_0 >= IDENT && LA68_0 <= INT)||(LA68_0 >= LPAREN && LA68_0 <= MINUS)||LA68_0==PLUS||LA68_0==REAL||LA68_0==SEMI||(LA68_0 >= STAR && LA68_0 <= STRING)||(LA68_0 >= 44 && LA68_0 <= 50)||LA68_0==54||(LA68_0 >= 59 && LA68_0 <= 60)||(LA68_0 >= 63 && LA68_0 <= 64)||(LA68_0 >= 67 && LA68_0 <= 68)||LA68_0==70||LA68_0==73||(LA68_0 >= 75 && LA68_0 <= 86)||(LA68_0 >= 91 && LA68_0 <= 92)||(LA68_0 >= 95 && LA68_0 <= 96)) ) {
				alt68=1;
			}
			else if ( (LA68_0==58) ) {
				alt68=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// ShellCommand.g:1376:4: s1= stat
					{
					pushFollow(FOLLOW_stat_in_statOrImplicitBlock5416);
					s1=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s1!=null?((ShellCommandParser.stat_return)s1).n:null); }
					}
					break;
				case 2 :
					// ShellCommand.g:1376:31: s2= implicitBlockStat
					{
					pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock5426);
					s2=implicitBlockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s2!=null?((ShellCommandParser.implicitBlockStat_return)s2).n:null); }
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
	// ShellCommand.g:1390:1: nothing :;
	public final void nothing() throws RecognitionException {
		try {
			// ShellCommand.g:1391:1: ()
			// ShellCommand.g:1392:1: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nothing"



	// $ANTLR start "rValue"
	// ShellCommand.g:1398:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
	public final ASTRValue rValue() throws RecognitionException {
		ASTRValue n = null;


		ASTExpression e =null;
		ParserRuleReturnScope oc =null;

		try {
			// ShellCommand.g:1399:5: (e= inSoilExpression |oc= objCreateStat )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==AT||LA69_0==HASH||(LA69_0 >= IDENT && LA69_0 <= INT)||(LA69_0 >= LPAREN && LA69_0 <= MINUS)||LA69_0==PLUS||LA69_0==REAL||(LA69_0 >= STAR && LA69_0 <= STRING)||(LA69_0 >= 44 && LA69_0 <= 50)||LA69_0==67||LA69_0==70||(LA69_0 >= 75 && LA69_0 <= 76)||(LA69_0 >= 78 && LA69_0 <= 86)||(LA69_0 >= 91 && LA69_0 <= 92)||LA69_0==95) ) {
				alt69=1;
			}
			else if ( (LA69_0==77) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// ShellCommand.g:1400:5: e= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_rValue5472);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }
					}
					break;
				case 2 :
					// ShellCommand.g:1401:5: oc= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_rValue5484);
					oc=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { 
					    if ((oc!=null?((ShellCommandParser.objCreateStat_return)oc).n:null) instanceof ASTNewLinkObjectStatement)
					    	n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)(oc!=null?((ShellCommandParser.objCreateStat_return)oc).n:null));
					    else
					    	n = new ASTRValueNewObject((ASTNewObjectStatement)(oc!=null?((ShellCommandParser.objCreateStat_return)oc).n:null));
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
	// ShellCommand.g:1414:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
	public final List<ASTRValue> rValList() throws RecognitionException {
		List<ASTRValue> n = null;


		List<ASTRValue> rl =null;

		try {
			// ShellCommand.g:1415:3: ( nothing |rl= rValListMin1 )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==RBRACE) ) {
				alt70=1;
			}
			else if ( (LA70_0==AT||LA70_0==HASH||(LA70_0 >= IDENT && LA70_0 <= INT)||(LA70_0 >= LPAREN && LA70_0 <= MINUS)||LA70_0==PLUS||LA70_0==REAL||(LA70_0 >= STAR && LA70_0 <= STRING)||(LA70_0 >= 44 && LA70_0 <= 50)||LA70_0==67||LA70_0==70||(LA70_0 >= 75 && LA70_0 <= 86)||(LA70_0 >= 91 && LA70_0 <= 92)||LA70_0==95) ) {
				alt70=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// ShellCommand.g:1416:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_rValList5507);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }
					}
					break;
				case 2 :
					// ShellCommand.g:1419:3: rl= rValListMin1
					{
					pushFollow(FOLLOW_rValListMin1_in_rValList5534);
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
	// ShellCommand.g:1427:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin1() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// ShellCommand.g:1431:3: (r= rValue ( COMMA r= rValue )* )
			// ShellCommand.g:1432:3: r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin15567);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// ShellCommand.g:1434:3: ( COMMA r= rValue )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==COMMA) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// ShellCommand.g:1435:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin15581); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin15591);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop71;
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
	// ShellCommand.g:1445:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin2() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// ShellCommand.g:1449:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
			// ShellCommand.g:1450:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin25630);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin25638); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_rValListMin25646);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// ShellCommand.g:1455:3: ( COMMA r= rValue )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==COMMA) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// ShellCommand.g:1456:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin25660); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin25670);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop72;
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
	// ShellCommand.g:1466:1: inSoilExpression returns [ASTExpression n] : e= expression ;
	public final ASTExpression inSoilExpression() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope e =null;

		try {
			// ShellCommand.g:1467:3: (e= expression )
			// ShellCommand.g:1468:3: e= expression
			{
			pushFollow(FOLLOW_expression_in_inSoilExpression5704);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if ((e!=null?((ShellCommandParser.expression_return)e).n:null) != null) (e!=null?((ShellCommandParser.expression_return)e).n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }
			if ( state.backtracking==0 ) { n = (e!=null?((ShellCommandParser.expression_return)e).n:null); }
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
	// ShellCommand.g:1477:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
	public final List<ASTExpression> exprList() throws RecognitionException {
		List<ASTExpression> n = null;


		List<ASTExpression> el =null;

		try {
			// ShellCommand.g:1478:3: ( nothing |el= exprListMin1 )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==RPAREN) ) {
				alt73=1;
			}
			else if ( (LA73_0==AT||LA73_0==HASH||(LA73_0 >= IDENT && LA73_0 <= INT)||(LA73_0 >= LPAREN && LA73_0 <= MINUS)||LA73_0==PLUS||LA73_0==REAL||(LA73_0 >= STAR && LA73_0 <= STRING)||(LA73_0 >= 44 && LA73_0 <= 50)||LA73_0==67||LA73_0==70||(LA73_0 >= 75 && LA73_0 <= 76)||(LA73_0 >= 78 && LA73_0 <= 86)||(LA73_0 >= 91 && LA73_0 <= 92)||LA73_0==95) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// ShellCommand.g:1479:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_exprList5733);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }
					}
					break;
				case 2 :
					// ShellCommand.g:1482:3: el= exprListMin1
					{
					pushFollow(FOLLOW_exprListMin1_in_exprList5751);
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
	// ShellCommand.g:1490:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin1() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// ShellCommand.g:1494:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// ShellCommand.g:1495:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin15784);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// ShellCommand.g:1497:3: ( COMMA e= inSoilExpression )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==COMMA) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// ShellCommand.g:1498:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin15799); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin15809);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop74;
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
	// ShellCommand.g:1508:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin2() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// ShellCommand.g:1512:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// ShellCommand.g:1513:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin25849);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			match(input,COMMA,FOLLOW_COMMA_in_exprListMin25857); if (state.failed) return n;
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin25865);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// ShellCommand.g:1518:3: ( COMMA e= inSoilExpression )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==COMMA) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// ShellCommand.g:1519:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin25879); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin25889);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop75;
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
	// ShellCommand.g:1529:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
	public final List<String> identList() throws RecognitionException {
		List<String> n = null;


		List<String> il =null;

		try {
			// ShellCommand.g:1530:3: ( nothing |il= identListMin1 )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==EOF||LA76_0==RBRACE||(LA76_0 >= RPAREN && LA76_0 <= SEMI)||(LA76_0 >= 63 && LA76_0 <= 64)) ) {
				alt76=1;
			}
			else if ( (LA76_0==IDENT) ) {
				alt76=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// ShellCommand.g:1531:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_identList5919);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<String>(); }
					}
					break;
				case 2 :
					// ShellCommand.g:1534:3: il= identListMin1
					{
					pushFollow(FOLLOW_identListMin1_in_identList5936);
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
	// ShellCommand.g:1542:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
	public final List<String> identListMin1() throws RecognitionException {
		List<String> n = null;


		Token id=null;


		  n = new ArrayList<String>();

		try {
			// ShellCommand.g:1546:3: (id= IDENT ( COMMA id= IDENT )* )
			// ShellCommand.g:1547:3: id= IDENT ( COMMA id= IDENT )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15970); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }
			// ShellCommand.g:1549:3: ( COMMA id= IDENT )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==COMMA) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// ShellCommand.g:1550:5: COMMA id= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_identListMin15984); if (state.failed) return n;
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15994); if (state.failed) return n;
					if ( state.backtracking==0 ) {
					    n.add((id!=null?id.getText():null)); }
					}
					break;

				default :
					break loop77;
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

	// $ANTLR start synpred1_ShellCommand
	public final void synpred1_ShellCommand_fragment() throws RecognitionException {
		// ShellCommand.g:88:3: ( stat )
		// ShellCommand.g:88:4: stat
		{
		pushFollow(FOLLOW_stat_in_synpred1_ShellCommand58);
		stat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_ShellCommand

	// $ANTLR start synpred2_ShellCommand
	public final void synpred2_ShellCommand_fragment() throws RecognitionException {
		// ShellCommand.g:91:3: ( legacyStat )
		// ShellCommand.g:91:4: legacyStat
		{
		pushFollow(FOLLOW_legacyStat_in_synpred2_ShellCommand79);
		legacyStat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_ShellCommand

	// $ANTLR start synpred3_ShellCommand
	public final void synpred3_ShellCommand_fragment() throws RecognitionException {
		// ShellCommand.g:101:3: ( legacyStat )
		// ShellCommand.g:101:4: legacyStat
		{
		pushFollow(FOLLOW_legacyStat_in_synpred3_ShellCommand111);
		legacyStat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_ShellCommand

	// $ANTLR start synpred4_ShellCommand
	public final void synpred4_ShellCommand_fragment() throws RecognitionException {
		// ShellCommand.g:104:3: ( stat )
		// ShellCommand.g:104:4: stat
		{
		pushFollow(FOLLOW_stat_in_synpred4_ShellCommand134);
		stat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_ShellCommand

	// $ANTLR start synpred5_ShellCommand
	public final void synpred5_ShellCommand_fragment() throws RecognitionException {
		// ShellCommand.g:340:13: ( inSoilExpression )
		// ShellCommand.g:340:14: inSoilExpression
		{
		pushFollow(FOLLOW_inSoilExpression_in_synpred5_ShellCommand814);
		inSoilExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_ShellCommand

	// $ANTLR start synpred6_ShellCommand
	public final void synpred6_ShellCommand_fragment() throws RecognitionException {
		// ShellCommand.g:948:7: ( COLON type EQUAL )
		// ShellCommand.g:948:8: COLON type EQUAL
		{
		match(input,COLON,FOLLOW_COLON_in_synpred6_ShellCommand3720); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred6_ShellCommand3722);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,EQUAL,FOLLOW_EQUAL_in_synpred6_ShellCommand3724); if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_ShellCommand

	// $ANTLR start synpred7_ShellCommand
	public final void synpred7_ShellCommand_fragment() throws RecognitionException {
		// ShellCommand.g:1099:5: ( statStartingWithExpr )
		// ShellCommand.g:1099:6: statStartingWithExpr
		{
		pushFollow(FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4272);
		statStartingWithExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_ShellCommand

	// Delegated rules

	public final boolean synpred4_ShellCommand() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_ShellCommand_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_ShellCommand() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_ShellCommand_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_ShellCommand() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_ShellCommand_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_ShellCommand() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_ShellCommand_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_ShellCommand() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_ShellCommand_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_ShellCommand() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_ShellCommand_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_ShellCommand() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_ShellCommand_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_stat_in_shellCommandOnly66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_shellCommand119 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_shellCommand121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_shellCommand142 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_shellCommand144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyOpExit_in_legacyStat194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat207 = new BitSet(new long[]{0x1A20000000000002L,0x0000000020001204L});
	public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat218 = new BitSet(new long[]{0x1A20000000000002L,0x0000000020001204L});
	public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat252 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_SEMI_in_nextLegacyStat256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_singleLegacyStat393 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_singleLegacyStat397 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_legacyCreate473 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identListMin1_in_legacyCreate481 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_legacyCreate485 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_legacyCreate493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_legacyCreateAssign530 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign538 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign542 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_legacyCreateAssign546 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_legacyCreateInsert588 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert596 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_legacyCreateInsert600 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert608 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_legacyCreateInsert612 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert616 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert626 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_legacyLet663 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_legacyLet671 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_legacyLet681 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_legacyLet691 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_legacyLet700 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_legacyLet708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_legacyOpEnter741 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter749 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_legacyOpEnter757 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter761 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_exprList_in_legacyOpEnter771 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_legacyOpExit810 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_legacyOpExit826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_legacyExecute859 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_legacyExecute863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOnly898 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expressionOnly900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_expression948 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression959 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression963 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_expression967 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression972 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_expression976 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_expression1014 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression1026 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression1030 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_expression1034 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression1039 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_expression1043 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_expression1084 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramList1133 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList1150 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_paramList1162 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList1166 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_paramList1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idList1215 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_idList1225 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_idList1229 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration1260 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration1262 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_conditionalImpliesExpression1315 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1364 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_conditionalOrExpression1377 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1381 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1425 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_conditionalXOrExpression1438 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1442 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1486 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_52_in_conditionalAndExpression1499 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1503 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1551 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_set_in_equalityExpression1570 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1580 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1629 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_set_in_relationalExpression1647 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1665 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1715 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression1733 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1743 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1793 = new BitSet(new long[]{0x2000014000000002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression1811 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1825 = new BitSet(new long[]{0x2000014000000002L});
	public static final BitSet FOLLOW_set_in_unaryExpression1887 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FC848L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1964 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_ARROW_in_postfixExpression1982 = new BitSet(new long[]{0x0000000000080000L,0x00000000183D0800L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression1988 = new BitSet(new long[]{0x0000000000080000L,0x00000000183D0800L});
	public static final BitSet FOLLOW_propertyCall_in_postfixExpression1999 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_literal_in_primaryExpression2039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectReference_in_primaryExpression2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyCall_in_primaryExpression2065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression2076 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_primaryExpression2080 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression2082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_primaryExpression2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression2106 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression2108 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_primaryExpression2110 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_primaryExpression2135 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression2153 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression2155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression2168 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression2170 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_primaryExpression2172 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression2176 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_primaryExpression2180 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression2182 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_primaryExpression2204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_objectReference2230 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_objectReference2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryExpression_in_propertyCall2303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterateExpression_in_propertyCall2316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationExpression_in_propertyCall2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeExpression_in_propertyCall2342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inStateExpression_in_propertyCall2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_queryExpression2390 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_queryExpression2397 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2408 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_queryExpression2412 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_queryExpression2423 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_queryExpression2429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_iterateExpression2461 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_iterateExpression2467 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2475 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterateExpression2477 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2485 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_iterateExpression2487 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_iterateExpression2495 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterateExpression2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_operationExpression2545 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression2567 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_operationExpression2580 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression2593 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_operationExpression2597 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression2609 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression2626 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_operationExpression2641 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression2656 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_operationExpression2660 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression2674 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_operationExpression2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_operationExpression2701 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_operationExpression2726 = new BitSet(new long[]{0x0007F318861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_operationExpression2747 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression2759 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_operationExpression2763 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_operationExpression2783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inStateExpression2831 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_inStateExpression2844 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_inStateExpression2853 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_inStateExpression2858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeExpression2894 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_typeExpression2918 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_typeExpression2922 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_typeExpression2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2962 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2965 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration2969 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2979 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2985 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2988 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration2994 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableInitialization3022 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableInitialization3024 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_variableInitialization3028 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_variableInitialization3030 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_variableInitialization3034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ifExpression3066 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_ifExpression3070 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_ifExpression3072 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_ifExpression3076 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_ifExpression3078 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_ifExpression3082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_ifExpression3084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_literal3123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_literal3137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal3150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_literal3165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal3179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_literal3189 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal3193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_literal3205 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_literal3207 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal3211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_literal3223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal3235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_undefinedLiteral_in_literal3247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_literal3259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_literal3271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionLiteral3309 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3338 = new BitSet(new long[]{0x0007F30A861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3355 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_collectionLiteral3368 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3372 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_collectionItem3420 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_collectionItem3431 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_collectionItem3435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_emptyCollectionLiteral3464 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3466 = new BitSet(new long[]{0x0001F00000000000L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3470 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3488 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3490 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_undefinedLiteral3522 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3524 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral3528 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_undefinedLiteral3544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_undefinedLiteral3558 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3560 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral3564 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_undefinedLiteral3580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_tupleLiteral3619 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3625 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3633 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleLiteral3644 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3648 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tupleItem3690 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_tupleItem3729 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_tupleItem3733 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_tupleItem3735 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_tupleItem3739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_tupleItem3761 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_expression_in_tupleItem3771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_type3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleType_in_type3861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOnly3893 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_typeOnly3895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simpleType3923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionType3961 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_collectionType3988 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_collectionType3992 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_collectionType3994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_tupleType4028 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_tupleType4030 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType4039 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleType4050 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType4054 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_tupleType4066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tuplePart4098 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_tuplePart4100 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_tuplePart4104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOnly4153 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statOnly4157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleStat_in_stat4192 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_SEMI_in_stat4204 = new BitSet(new long[]{0x1847F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_singleStat_in_stat4214 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_emptyStat_in_singleStat4254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAssignStat_in_singleStat4292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_singleStat4306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleStat4320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleStat4333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleStat4350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExStat_in_singleStat4367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterStat_in_singleStat4384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_singleStat4406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStat_in_singleStat4424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_emptyStat4451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4477 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_varAssignStat4529 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4533 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValue_in_varAssignStat4541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_attAssignStat4565 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_attAssignStat4574 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat4578 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValue_in_attAssignStat4586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_objCreateStat4612 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_objCreateStat4620 = new BitSet(new long[]{0x0080000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat4630 = new BitSet(new long[]{0x0007F318861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat4643 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat4651 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_objCreateStat4669 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat4677 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4691 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat4699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_objDestroyStat4735 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat4743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_lnkInsStat4769 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkInsStat4773 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4783 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkInsStat4787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_lnkInsStat4791 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_lnkInsStat4799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4828 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4839 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4848 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4855 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4871 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4882 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4893 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4902 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4909 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4931 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4946 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4966 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4977 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4986 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_59_in_lnkDelStat5027 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkDelStat5031 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5041 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkDelStat5045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_lnkDelStat5049 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_lnkDelStat5058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_condExStat5089 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_condExStat5098 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_condExStat5102 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5111 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_63_in_condExStat5122 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_condExStat5146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_iterStat5171 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_iterStat5179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iterStat5183 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_iterStat5191 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_iterStat5195 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat5203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_iterStat5208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_whileStat5234 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_whileStat5242 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_whileStat5246 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat5254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_whileStat5259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_blockStat5289 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_58_in_blockStat5294 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat5300 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_blockStat5306 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat5312 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_SEMI_in_blockStat5319 = new BitSet(new long[]{0x1847F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_stat_in_blockStat5329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_blockStat5334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_implicitBlockStat5360 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5366 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_implicitBlockStat5372 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5378 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_SEMI_in_implicitBlockStat5385 = new BitSet(new long[]{0x1847F308861A0020L,0x00000001987FFA58L});
	public static final BitSet FOLLOW_stat_in_implicitBlockStat5393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOrImplicitBlock5416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock5426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_rValue5472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_rValue5484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_rValList5507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValListMin1_in_rValList5534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin15567 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin15581 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValue_in_rValListMin15591 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_rValue_in_rValListMin25630 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin25638 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValue_in_rValListMin25646 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin25660 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FF848L});
	public static final BitSet FOLLOW_rValue_in_rValListMin25670 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expression_in_inSoilExpression5704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_exprList5733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprListMin1_in_exprList5751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15784 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin15799 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15809 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25849 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin25857 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25865 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin25879 = new BitSet(new long[]{0x0007F308861A0020L,0x00000000987FD848L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25889 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_nothing_in_identList5919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identListMin1_in_identList5936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identListMin15970 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_identListMin15984 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_identListMin15994 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_stat_in_synpred1_ShellCommand58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_synpred2_ShellCommand79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_legacyStat_in_synpred3_ShellCommand111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_synpred4_ShellCommand134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_synpred5_ShellCommand814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_synpred6_ShellCommand3720 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_synpred6_ShellCommand3722 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred6_ShellCommand3724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4272 = new BitSet(new long[]{0x0000000000000002L});
}
