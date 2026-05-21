// $ANTLR 3.5.2 Soil.g 2026-05-21 21:41:31

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
 
package org.tzi.use.parser.soil;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;

import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class SoilParser extends BaseParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", 
		"COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", 
		"GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", 
		"LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", 
		"NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", 
		"REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", 
		"WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", 
		"'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'begin'", "'between'", 
		"'byUseId'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", 
		"'end'", "'endif'", "'false'", "'for'", "'from'", "'if'", "'implies'", 
		"'in'", "'insert'", "'into'", "'iterate'", "'let'", "'new'", "'not'", 
		"'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsInState'", 
		"'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'or'", "'pre'", "'selectByKind'", 
		"'selectByType'", "'then'", "'true'", "'while'", "'xor'"
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


	public SoilParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SoilParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SoilParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Soil.g"; }



	// $ANTLR start "statOnly"
	// Soil.g:117:1: statOnly returns [ASTStatement n] : s= stat EOF ;
	public final ASTStatement statOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;

		try {
			// Soil.g:118:3: (s= stat EOF )
			// Soil.g:119:3: s= stat EOF
			{
			pushFollow(FOLLOW_stat_in_statOnly77);
			s=stat();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_statOnly81); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = (s!=null?((SoilParser.stat_return)s).n:null); }
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
	// Soil.g:129:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
	public final SoilParser.stat_return stat() throws RecognitionException {
		SoilParser.stat_return retval = new SoilParser.stat_return();
		retval.start = input.LT(1);

		ASTStatement s =null;
		ASTStatement s2 =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// Soil.g:133:3: (s= singleStat ( SEMI s2= singleStat )* )
			// Soil.g:134:3: s= singleStat ( SEMI s2= singleStat )*
			{
			pushFollow(FOLLOW_singleStat_in_stat116);
			s=singleStat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {seq.addStatement(s);}
			// Soil.g:135:3: ( SEMI s2= singleStat )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SEMI) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Soil.g:136:5: SEMI s2= singleStat
					{
					match(input,SEMI,FOLLOW_SEMI_in_stat128); if (state.failed) return retval;
					pushFollow(FOLLOW_singleStat_in_stat138);
					s2=singleStat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {seq.addStatement(s2); }
					}
					break;

				default :
					break loop1;
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
	// Soil.g:148:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
			// Soil.g:149:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
			int alt2=11;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==EOF||LA2_0==SEMI||(LA2_0 >= 61 && LA2_0 <= 62)) ) {
				alt2=1;
			}
			else if ( (LA2_0==73) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==MINUS||LA2_0==PLUS||LA2_0==75) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==89) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==64) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==INT) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==REAL) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==STRING) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==HASH) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==IDENT) ) {
				int LA2_13 = input.LA(2);
				if ( (synpred1_Soil()) ) {
					alt2=2;
				}
				else if ( (true) ) {
					alt2=3;
				}

			}
			else if ( (LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 48)) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==78) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==45) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==83) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==50) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==76) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==49) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==STAR) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==AT) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==72) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==77||(LA2_0 >= 81 && LA2_0 <= 82)||(LA2_0 >= 86 && LA2_0 <= 87)) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( ((LA2_0 >= 79 && LA2_0 <= 80)) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==LPAREN) && (synpred1_Soil())) {
				alt2=2;
			}
			else if ( (LA2_0==67) ) {
				int LA2_27 = input.LA(2);
				if ( (synpred1_Soil()) ) {
					alt2=2;
				}
				else if ( (true) ) {
					alt2=8;
				}

			}
			else if ( (LA2_0==74) ) {
				alt2=4;
			}
			else if ( (LA2_0==58) ) {
				alt2=5;
			}
			else if ( (LA2_0==70) ) {
				alt2=6;
			}
			else if ( (LA2_0==57) ) {
				alt2=7;
			}
			else if ( (LA2_0==65) ) {
				alt2=9;
			}
			else if ( (LA2_0==90) ) {
				alt2=10;
			}
			else if ( (LA2_0==53) ) {
				alt2=11;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Soil.g:150:5: emp= emptyStat
					{
					pushFollow(FOLLOW_emptyStat_in_singleStat178);
					emp=emptyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = emp; }
					}
					break;
				case 2 :
					// Soil.g:152:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
					{
					pushFollow(FOLLOW_statStartingWithExpr_in_singleStat204);
					sse=statStartingWithExpr();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (sse!=null?((SoilParser.statStartingWithExpr_return)sse).n:null); }
					}
					break;
				case 3 :
					// Soil.g:153:5: vas= varAssignStat
					{
					pushFollow(FOLLOW_varAssignStat_in_singleStat216);
					vas=varAssignStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = vas; }
					}
					break;
				case 4 :
					// Soil.g:154:5: ocs= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_singleStat230);
					ocs=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ocs!=null?((SoilParser.objCreateStat_return)ocs).n:null); }
					}
					break;
				case 5 :
					// Soil.g:155:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleStat244);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((SoilParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 6 :
					// Soil.g:156:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleStat257);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((SoilParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 7 :
					// Soil.g:157:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleStat274);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((SoilParser.lnkDelStat_return)lds).n:null); }
					}
					break;
				case 8 :
					// Soil.g:158:5: ces= condExStat
					{
					pushFollow(FOLLOW_condExStat_in_singleStat291);
					ces=condExStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ces!=null?((SoilParser.condExStat_return)ces).n:null); }
					}
					break;
				case 9 :
					// Soil.g:159:5: its= iterStat
					{
					pushFollow(FOLLOW_iterStat_in_singleStat308);
					its=iterStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (its!=null?((SoilParser.iterStat_return)its).n:null); }
					}
					break;
				case 10 :
					// Soil.g:161:5: whs= whileStat
					{
					pushFollow(FOLLOW_whileStat_in_singleStat330);
					whs=whileStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (whs!=null?((SoilParser.whileStat_return)whs).n:null); }
					}
					break;
				case 11 :
					// Soil.g:162:5: blk= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_singleStat348);
					blk=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (blk!=null?((SoilParser.blockStat_return)blk).n:null); }
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
	// Soil.g:169:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
	public final ASTEmptyStatement emptyStat() throws RecognitionException {
		ASTEmptyStatement n = null;


		try {
			// Soil.g:170:3: ( nothing )
			// Soil.g:171:3: nothing
			{
			pushFollow(FOLLOW_nothing_in_emptyStat375);
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
	// Soil.g:176:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
	public final SoilParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
		SoilParser.statStartingWithExpr_return retval = new SoilParser.statStartingWithExpr_return();
		retval.start = input.LT(1);

		ASTExpression expr =null;
		ASTAttributeAssignmentStatement aas =null;

		try {
			// Soil.g:177:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
			// Soil.g:178:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
			{
			pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr401);
			expr=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			// Soil.g:179:3: (aas= attAssignStat[$expr.n] )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DOT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Soil.g:180:5: aas= attAssignStat[$expr.n]
					{
					pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr415);
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
	// Soil.g:192:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
	public final ASTStatement varAssignStat() throws RecognitionException {
		ASTStatement n = null;


		Token varName=null;
		ASTRValue rVal =null;

		try {
			// Soil.g:193:3: (varName= IDENT COLON_EQUAL rVal= rValue )
			// Soil.g:194:3: varName= IDENT COLON_EQUAL rVal= rValue
			{
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat453); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat457); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_varAssignStat465);
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
	// Soil.g:206:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
	public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
		ASTAttributeAssignmentStatement n = null;


		Token attName=null;
		ASTRValue r =null;

		try {
			// Soil.g:207:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
			// Soil.g:208:3: DOT attName= IDENT COLON_EQUAL r= rValue
			{
			match(input,DOT,FOLLOW_DOT_in_attAssignStat489); if (state.failed) return n;
			attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat498); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat502); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_attAssignStat510);
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
	// Soil.g:220:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
	public final SoilParser.objCreateStat_return objCreateStat() throws RecognitionException {
		SoilParser.objCreateStat_return retval = new SoilParser.objCreateStat_return();
		retval.start = input.LT(1);

		ASTSimpleType ident =null;
		ASTExpression objName =null;
		ParserRuleReturnScope p =null;

		try {
			// Soil.g:221:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
			// Soil.g:222:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			{
			match(input,74,FOLLOW_74_in_objCreateStat536); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_objCreateStat544);
			ident=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			// Soil.g:224:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LPAREN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Soil.g:225:5: LPAREN (objName= inSoilExpression )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat554); if (state.failed) return retval;
					// Soil.g:226:7: (objName= inSoilExpression )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==AT||LA4_0==HASH||(LA4_0 >= IDENT && LA4_0 <= INT)||(LA4_0 >= LPAREN && LA4_0 <= MINUS)||LA4_0==PLUS||LA4_0==REAL||(LA4_0 >= STAR && LA4_0 <= STRING)||(LA4_0 >= 44 && LA4_0 <= 50)||LA4_0==64||LA4_0==67||(LA4_0 >= 72 && LA4_0 <= 73)||(LA4_0 >= 75 && LA4_0 <= 83)||(LA4_0 >= 86 && LA4_0 <= 87)||LA4_0==89) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// Soil.g:226:8: objName= inSoilExpression
							{
							pushFollow(FOLLOW_inSoilExpression_in_objCreateStat567);
							objName=inSoilExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat575); if (state.failed) return retval;
					}
					break;

			}

			// Soil.g:230:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==54) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Soil.g:231:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
					{
					match(input,54,FOLLOW_54_in_objCreateStat593); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat601); if (state.failed) return retval;
					pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat615);
					p=rValListMin2WithOptionalQualifiers();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat623); if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = new ASTNewLinkObjectStatement((retval.start), ident, (p!=null?((SoilParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((SoilParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null), objName);
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
	// Soil.g:250:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
	public final SoilParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
		SoilParser.objDestroyStat_return retval = new SoilParser.objDestroyStat_return();
		retval.start = input.LT(1);

		List<ASTExpression> el =null;

		try {
			// Soil.g:251:3: ( 'destroy' el= exprListMin1 )
			// Soil.g:252:3: 'destroy' el= exprListMin1
			{
			match(input,58,FOLLOW_58_in_objDestroyStat659); if (state.failed) return retval;
			pushFollow(FOLLOW_exprListMin1_in_objDestroyStat667);
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
	// Soil.g:271:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
	public final SoilParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
		SoilParser.lnkInsStat_return retval = new SoilParser.lnkInsStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// Soil.g:272:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
			// Soil.g:273:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
			{
			match(input,70,FOLLOW_70_in_lnkInsStat693); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat697); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat707);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat711); if (state.failed) return retval;
			match(input,71,FOLLOW_71_in_lnkInsStat715); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat723); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkInsertionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((SoilParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((SoilParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// Soil.g:283:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
	public final SoilParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
		SoilParser.rValListMin2WithOptionalQualifiers_return retval = new SoilParser.rValListMin2WithOptionalQualifiers_return();
		retval.start = input.LT(1);

		ASTRValue r =null;
		List<ASTRValue> qualifierValues =null;


		  retval.participans = new ArrayList<ASTRValue>();
		  retval.qualifiers = new ArrayList<List<ASTRValue>>();
		  List<ASTRValue> currentQualifiers = Collections.emptyList();

		try {
			// Soil.g:289:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
			// Soil.g:290:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers752);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// Soil.g:291:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LBRACE) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Soil.g:292:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers763); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers772);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers779); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers795); if (state.failed) return retval;
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers806);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// Soil.g:304:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LBRACE) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Soil.g:305:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers817); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers826);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers833); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			// Soil.g:314:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Soil.g:315:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers855); if (state.failed) return retval;
					pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers870);
					r=rValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.participans.add(r); }
					// Soil.g:319:5: ( LBRACE qualifierValues= rValList RBRACE )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==LBRACE) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// Soil.g:320:6: LBRACE qualifierValues= rValList RBRACE
							{
							match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers890); if (state.failed) return retval;
							pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers901);
							qualifierValues=rValList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
							match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers910); if (state.failed) return retval;
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
					break loop10;
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
	// Soil.g:335:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
	public final SoilParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
		SoilParser.lnkDelStat_return retval = new SoilParser.lnkDelStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// Soil.g:336:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
			// Soil.g:337:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
			{
			match(input,57,FOLLOW_57_in_lnkDelStat951); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat955); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat965);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat969); if (state.failed) return retval;
			match(input,66,FOLLOW_66_in_lnkDelStat973); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat982); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkDeletionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((SoilParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((SoilParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// Soil.g:351:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
	public final SoilParser.condExStat_return condExStat() throws RecognitionException {
		SoilParser.condExStat_return retval = new SoilParser.condExStat_return();
		retval.start = input.LT(1);

		ASTExpression con =null;
		ASTStatement ts =null;
		ASTStatement es =null;


		  ASTStatement elseStat = new ASTEmptyStatement();

		try {
			// Soil.g:355:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
			// Soil.g:356:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
			{
			match(input,67,FOLLOW_67_in_condExStat1013); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_condExStat1022);
			con=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,88,FOLLOW_88_in_condExStat1026); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat1035);
			ts=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			// Soil.g:360:3: ( 'else' es= statOrImplicitBlock )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==61) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Soil.g:361:5: 'else' es= statOrImplicitBlock
					{
					match(input,61,FOLLOW_61_in_condExStat1046); if (state.failed) return retval;
					pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat1058);
					es=statOrImplicitBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { elseStat = es; }
					}
					break;

			}

			match(input,62,FOLLOW_62_in_condExStat1070); if (state.failed) return retval;
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
	// Soil.g:372:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final SoilParser.iterStat_return iterStat() throws RecognitionException {
		SoilParser.iterStat_return retval = new SoilParser.iterStat_return();
		retval.start = input.LT(1);

		Token var=null;
		ASTExpression set =null;
		ASTStatement s =null;

		try {
			// Soil.g:373:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// Soil.g:374:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,65,FOLLOW_65_in_iterStat1095); if (state.failed) return retval;
			var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat1103); if (state.failed) return retval;
			match(input,69,FOLLOW_69_in_iterStat1107); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_iterStat1115);
			set=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,60,FOLLOW_60_in_iterStat1119); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat1127);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,62,FOLLOW_62_in_iterStat1132); if (state.failed) return retval;
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
	// Soil.g:389:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final SoilParser.whileStat_return whileStat() throws RecognitionException {
		SoilParser.whileStat_return retval = new SoilParser.whileStat_return();
		retval.start = input.LT(1);

		ASTExpression cond =null;
		ASTStatement s =null;

		try {
			// Soil.g:390:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// Soil.g:391:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,90,FOLLOW_90_in_whileStat1158); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_whileStat1166);
			cond=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,60,FOLLOW_60_in_whileStat1170); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat1178);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,62,FOLLOW_62_in_whileStat1183); if (state.failed) return retval;
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
	// Soil.g:403:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
	public final SoilParser.blockStat_return blockStat() throws RecognitionException {
		SoilParser.blockStat_return retval = new SoilParser.blockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

		try {
			// Soil.g:407:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
			// Soil.g:408:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
			{
			match(input,53,FOLLOW_53_in_blockStat1213); if (state.failed) return retval;
			// Soil.g:409:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==56) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// Soil.g:409:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
					{
					match(input,56,FOLLOW_56_in_blockStat1218); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_blockStat1224);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
					// Soil.g:409:73: ( COMMA vd1= variableDeclaration )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Soil.g:409:75: COMMA vd1= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_blockStat1230); if (state.failed) return retval;
							pushFollow(FOLLOW_variableDeclaration_in_blockStat1236);
							vd1=variableDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
							}
							break;

						default :
							break loop12;
						}
					}

					match(input,SEMI,FOLLOW_SEMI_in_blockStat1243); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_stat_in_blockStat1253);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((SoilParser.stat_return)s).n:null)); }
			match(input,62,FOLLOW_62_in_blockStat1258); if (state.failed) return retval;
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
	// Soil.g:418:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
	public final SoilParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
		SoilParser.implicitBlockStat_return retval = new SoilParser.implicitBlockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), false);

		try {
			// Soil.g:422:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
			// Soil.g:423:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
			{
			match(input,56,FOLLOW_56_in_implicitBlockStat1284); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat1290);
			vd=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
			// Soil.g:423:72: ( COMMA vd1= variableDeclaration )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Soil.g:423:74: COMMA vd1= variableDeclaration
					{
					match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat1296); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat1302);
					vd1=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat1309); if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_implicitBlockStat1317);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((SoilParser.stat_return)s).n:null)); }
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
	// Soil.g:427:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
	public final ASTStatement statOrImplicitBlock() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;

		try {
			// Soil.g:428:3: ( (s1= stat |s2= implicitBlockStat ) )
			// Soil.g:429:3: (s1= stat |s2= implicitBlockStat )
			{
			// Soil.g:429:3: (s1= stat |s2= implicitBlockStat )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==AT||LA15_0==HASH||(LA15_0 >= IDENT && LA15_0 <= INT)||(LA15_0 >= LPAREN && LA15_0 <= MINUS)||LA15_0==PLUS||LA15_0==REAL||LA15_0==SEMI||(LA15_0 >= STAR && LA15_0 <= STRING)||(LA15_0 >= 44 && LA15_0 <= 50)||LA15_0==53||(LA15_0 >= 57 && LA15_0 <= 58)||(LA15_0 >= 61 && LA15_0 <= 62)||(LA15_0 >= 64 && LA15_0 <= 65)||LA15_0==67||LA15_0==70||(LA15_0 >= 72 && LA15_0 <= 83)||(LA15_0 >= 86 && LA15_0 <= 87)||(LA15_0 >= 89 && LA15_0 <= 90)) ) {
				alt15=1;
			}
			else if ( (LA15_0==56) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Soil.g:429:4: s1= stat
					{
					pushFollow(FOLLOW_stat_in_statOrImplicitBlock1340);
					s1=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s1!=null?((SoilParser.stat_return)s1).n:null); }
					}
					break;
				case 2 :
					// Soil.g:429:31: s2= implicitBlockStat
					{
					pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock1350);
					s2=implicitBlockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s2!=null?((SoilParser.implicitBlockStat_return)s2).n:null); }
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
	// Soil.g:443:1: nothing :;
	public final void nothing() throws RecognitionException {
		try {
			// Soil.g:444:1: ()
			// Soil.g:445:1: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nothing"



	// $ANTLR start "rValue"
	// Soil.g:451:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
	public final ASTRValue rValue() throws RecognitionException {
		ASTRValue n = null;


		ASTExpression e =null;
		ParserRuleReturnScope oc =null;

		try {
			// Soil.g:452:5: (e= inSoilExpression |oc= objCreateStat )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==AT||LA16_0==HASH||(LA16_0 >= IDENT && LA16_0 <= INT)||(LA16_0 >= LPAREN && LA16_0 <= MINUS)||LA16_0==PLUS||LA16_0==REAL||(LA16_0 >= STAR && LA16_0 <= STRING)||(LA16_0 >= 44 && LA16_0 <= 50)||LA16_0==64||LA16_0==67||(LA16_0 >= 72 && LA16_0 <= 73)||(LA16_0 >= 75 && LA16_0 <= 83)||(LA16_0 >= 86 && LA16_0 <= 87)||LA16_0==89) ) {
				alt16=1;
			}
			else if ( (LA16_0==74) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Soil.g:453:5: e= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_rValue1396);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }
					}
					break;
				case 2 :
					// Soil.g:454:5: oc= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_rValue1408);
					oc=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { 
					    if ((oc!=null?((SoilParser.objCreateStat_return)oc).n:null) instanceof ASTNewLinkObjectStatement)
					    	n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)(oc!=null?((SoilParser.objCreateStat_return)oc).n:null));
					    else
					    	n = new ASTRValueNewObject((ASTNewObjectStatement)(oc!=null?((SoilParser.objCreateStat_return)oc).n:null));
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
	// Soil.g:467:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
	public final List<ASTRValue> rValList() throws RecognitionException {
		List<ASTRValue> n = null;


		List<ASTRValue> rl =null;

		try {
			// Soil.g:468:3: ( nothing |rl= rValListMin1 )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==RBRACE) ) {
				alt17=1;
			}
			else if ( (LA17_0==AT||LA17_0==HASH||(LA17_0 >= IDENT && LA17_0 <= INT)||(LA17_0 >= LPAREN && LA17_0 <= MINUS)||LA17_0==PLUS||LA17_0==REAL||(LA17_0 >= STAR && LA17_0 <= STRING)||(LA17_0 >= 44 && LA17_0 <= 50)||LA17_0==64||LA17_0==67||(LA17_0 >= 72 && LA17_0 <= 83)||(LA17_0 >= 86 && LA17_0 <= 87)||LA17_0==89) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// Soil.g:469:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_rValList1431);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }
					}
					break;
				case 2 :
					// Soil.g:472:3: rl= rValListMin1
					{
					pushFollow(FOLLOW_rValListMin1_in_rValList1458);
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
	// Soil.g:480:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin1() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// Soil.g:484:3: (r= rValue ( COMMA r= rValue )* )
			// Soil.g:485:3: r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin11491);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// Soil.g:487:3: ( COMMA r= rValue )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Soil.g:488:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin11505); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin11515);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
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
	// $ANTLR end "rValListMin1"



	// $ANTLR start "rValListMin2"
	// Soil.g:498:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin2() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// Soil.g:502:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
			// Soil.g:503:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin21554);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin21562); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_rValListMin21570);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// Soil.g:508:3: ( COMMA r= rValue )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Soil.g:509:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin21584); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin21594);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
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
	// $ANTLR end "rValListMin2"



	// $ANTLR start "inSoilExpression"
	// Soil.g:519:1: inSoilExpression returns [ASTExpression n] : e= expression ;
	public final ASTExpression inSoilExpression() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope e =null;

		try {
			// Soil.g:520:3: (e= expression )
			// Soil.g:521:3: e= expression
			{
			pushFollow(FOLLOW_expression_in_inSoilExpression1628);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if ((e!=null?((SoilParser.expression_return)e).n:null) != null) (e!=null?((SoilParser.expression_return)e).n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }
			if ( state.backtracking==0 ) { n = (e!=null?((SoilParser.expression_return)e).n:null); }
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
	// Soil.g:530:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
	public final List<ASTExpression> exprList() throws RecognitionException {
		List<ASTExpression> n = null;


		List<ASTExpression> el =null;

		try {
			// Soil.g:531:3: ( nothing |el= exprListMin1 )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==EOF) ) {
				alt20=1;
			}
			else if ( (LA20_0==AT||LA20_0==HASH||(LA20_0 >= IDENT && LA20_0 <= INT)||(LA20_0 >= LPAREN && LA20_0 <= MINUS)||LA20_0==PLUS||LA20_0==REAL||(LA20_0 >= STAR && LA20_0 <= STRING)||(LA20_0 >= 44 && LA20_0 <= 50)||LA20_0==64||LA20_0==67||(LA20_0 >= 72 && LA20_0 <= 73)||(LA20_0 >= 75 && LA20_0 <= 83)||(LA20_0 >= 86 && LA20_0 <= 87)||LA20_0==89) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// Soil.g:532:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_exprList1657);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }
					}
					break;
				case 2 :
					// Soil.g:535:3: el= exprListMin1
					{
					pushFollow(FOLLOW_exprListMin1_in_exprList1675);
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
	// Soil.g:543:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin1() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// Soil.g:547:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// Soil.g:548:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin11708);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// Soil.g:550:3: ( COMMA e= inSoilExpression )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Soil.g:551:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin11723); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin11733);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
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
	// $ANTLR end "exprListMin1"



	// $ANTLR start "exprListMin2"
	// Soil.g:561:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin2() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// Soil.g:565:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// Soil.g:566:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin21773);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			match(input,COMMA,FOLLOW_COMMA_in_exprListMin21781); if (state.failed) return n;
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin21789);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// Soil.g:571:3: ( COMMA e= inSoilExpression )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Soil.g:572:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin21803); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin21813);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
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
	// $ANTLR end "exprListMin2"



	// $ANTLR start "identList"
	// Soil.g:582:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
	public final List<String> identList() throws RecognitionException {
		List<String> n = null;


		List<String> il =null;

		try {
			// Soil.g:583:3: ( nothing |il= identListMin1 )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EOF||LA23_0==RBRACE||LA23_0==SEMI||(LA23_0 >= 61 && LA23_0 <= 62)) ) {
				alt23=1;
			}
			else if ( (LA23_0==IDENT) ) {
				alt23=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// Soil.g:584:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_identList1843);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<String>(); }
					}
					break;
				case 2 :
					// Soil.g:587:3: il= identListMin1
					{
					pushFollow(FOLLOW_identListMin1_in_identList1860);
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
	// Soil.g:595:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
	public final List<String> identListMin1() throws RecognitionException {
		List<String> n = null;


		Token id=null;


		  n = new ArrayList<String>();

		try {
			// Soil.g:599:3: (id= IDENT ( COMMA id= IDENT )* )
			// Soil.g:600:3: id= IDENT ( COMMA id= IDENT )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11894); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }
			// Soil.g:602:3: ( COMMA id= IDENT )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// Soil.g:603:5: COMMA id= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_identListMin11908); if (state.failed) return n;
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11918); if (state.failed) return n;
					if ( state.backtracking==0 ) {
					    n.add((id!=null?id.getText():null)); }
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
	// $ANTLR end "identListMin1"



	// $ANTLR start "expressionOnly"
	// Soil.g:640:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
	public final ASTExpression expressionOnly() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope nExp =null;

		try {
			// Soil.g:641:5: (nExp= expression EOF )
			// Soil.g:642:5: nExp= expression EOF
			{
			pushFollow(FOLLOW_expression_in_expressionOnly1958);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_expressionOnly1960); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = (nExp!=null?((SoilParser.expression_return)nExp).n:null);}
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
	// Soil.g:649:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
	public final SoilParser.expression_return expression() throws RecognitionException {
		SoilParser.expression_return retval = new SoilParser.expression_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e1 =null;
		ASTExpression nCndImplies =null;

		 
		  ASTLetExpression prevLet = null, firstLet = null;
		  ASTExpression e2;
		  Token tok = null;

		try {
			// Soil.g:655:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
			// Soil.g:656:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }
			// Soil.g:657:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==73) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Soil.g:658:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
					{
					match(input,73,FOLLOW_73_in_expression2008); if (state.failed) return retval;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2019); if (state.failed) return retval;
					// Soil.g:659:18: ( COLON t= type )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==COLON) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// Soil.g:659:20: COLON t= type
							{
							match(input,COLON,FOLLOW_COLON_in_expression2023); if (state.failed) return retval;
							pushFollow(FOLLOW_type_in_expression2027);
							t=type();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_expression2032); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2036);
					e1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((SoilParser.expression_return)e1).n:null));
					         if ( firstLet == null ) 
					             firstLet = nextLet;
					         if ( prevLet != null ) 
					             prevLet.setInExpr(nextLet);
					         prevLet = nextLet;
					      }
					// Soil.g:669:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==COMMA) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// Soil.g:670:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_expression2074); if (state.failed) return retval;
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2086); if (state.failed) return retval;
							// Soil.g:671:20: ( COLON t= type )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==COLON) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// Soil.g:671:22: COLON t= type
									{
									match(input,COLON,FOLLOW_COLON_in_expression2090); if (state.failed) return retval;
									pushFollow(FOLLOW_type_in_expression2094);
									t=type();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							match(input,EQUAL,FOLLOW_EQUAL_in_expression2099); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_expression2103);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((SoilParser.expression_return)e1).n:null));
							           if ( firstLet == null ) 
							               firstLet = nextLet;
							           if ( prevLet != null ) 
							               prevLet.setInExpr(nextLet);
							           prevLet = nextLet;
							        }
							}
							break;

						default :
							break loop27;
						}
					}

					match(input,69,FOLLOW_69_in_expression2144); if (state.failed) return retval;
					}
					break;

				default :
					break loop28;
				}
			}

			pushFollow(FOLLOW_conditionalImpliesExpression_in_expression2160);
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
	// Soil.g:703:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
	public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
		List<ASTVariableDeclaration> paramList = null;


		ASTVariableDeclaration v =null;

		 paramList = new ArrayList<ASTVariableDeclaration>(); 
		try {
			// Soil.g:705:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
			// Soil.g:706:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_paramList2193); if (state.failed) return paramList;
			// Soil.g:707:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==IDENT) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Soil.g:708:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_paramList2210);
					v=variableDeclaration();
					state._fsp--;
					if (state.failed) return paramList;
					if ( state.backtracking==0 ) { paramList.add(v); }
					// Soil.g:709:7: ( COMMA v= variableDeclaration )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==COMMA) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// Soil.g:709:9: COMMA v= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramList2222); if (state.failed) return paramList;
							pushFollow(FOLLOW_variableDeclaration_in_paramList2226);
							v=variableDeclaration();
							state._fsp--;
							if (state.failed) return paramList;
							if ( state.backtracking==0 ) { paramList.add(v); }
							}
							break;

						default :
							break loop29;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_paramList2246); if (state.failed) return paramList;
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
	// Soil.g:717:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
	public final List idList() throws RecognitionException {
		List idList = null;


		Token id0=null;
		Token idn=null;

		 idList = new ArrayList(); 
		try {
			// Soil.g:719:5: (id0= IDENT ( COMMA idn= IDENT )* )
			// Soil.g:720:5: id0= IDENT ( COMMA idn= IDENT )*
			{
			id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2275); if (state.failed) return idList;
			if ( state.backtracking==0 ) { idList.add(id0); }
			// Soil.g:721:5: ( COMMA idn= IDENT )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==COMMA) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// Soil.g:721:7: COMMA idn= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_idList2285); if (state.failed) return idList;
					idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2289); if (state.failed) return idList;
					if ( state.backtracking==0 ) { idList.add(idn); }
					}
					break;

				default :
					break loop31;
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
	// Soil.g:729:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
	public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
		ASTVariableDeclaration n = null;


		Token name=null;
		ASTType t =null;

		try {
			// Soil.g:730:5: (name= IDENT COLON t= type )
			// Soil.g:731:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration2320); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableDeclaration2322); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration2326);
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
	// Soil.g:739:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
	public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndOrExp =null;
		ASTExpression n1 =null;

		try {
			// Soil.g:740:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
			// Soil.g:741:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2362);
			nCndOrExp=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndOrExp;}
			// Soil.g:742:5: (op= 'implies' n1= conditionalOrExpression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==68) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// Soil.g:742:7: op= 'implies' n1= conditionalOrExpression
					{
					op=(Token)match(input,68,FOLLOW_68_in_conditionalImpliesExpression2375); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2379);
					n1=conditionalOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop32;
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
	// Soil.g:751:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
	public final ASTExpression conditionalOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndXorExp =null;
		ASTExpression n1 =null;

		try {
			// Soil.g:752:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
			// Soil.g:753:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
			{
			pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2424);
			nCndXorExp=conditionalXOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndXorExp;}
			// Soil.g:754:5: (op= 'or' n1= conditionalXOrExpression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==84) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// Soil.g:754:7: op= 'or' n1= conditionalXOrExpression
					{
					op=(Token)match(input,84,FOLLOW_84_in_conditionalOrExpression2437); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2441);
					n1=conditionalXOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop33;
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
	// Soil.g:763:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
	public final ASTExpression conditionalXOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndAndExp =null;
		ASTExpression n1 =null;

		try {
			// Soil.g:764:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
			// Soil.g:765:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2485);
			nCndAndExp=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndAndExp;}
			// Soil.g:766:5: (op= 'xor' n1= conditionalAndExpression )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==91) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Soil.g:766:7: op= 'xor' n1= conditionalAndExpression
					{
					op=(Token)match(input,91,FOLLOW_91_in_conditionalXOrExpression2498); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2502);
					n1=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop34;
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
	// Soil.g:775:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
	public final ASTExpression conditionalAndExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nEqExp =null;
		ASTExpression n1 =null;

		try {
			// Soil.g:776:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
			// Soil.g:777:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2546);
			nEqExp=equalityExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nEqExp;}
			// Soil.g:778:5: (op= 'and' n1= equalityExpression )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==52) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Soil.g:778:7: op= 'and' n1= equalityExpression
					{
					op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression2559); if (state.failed) return n;
					pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2563);
					n1=equalityExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop35;
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
	// Soil.g:787:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
	public final ASTExpression equalityExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nRelExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Soil.g:789:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
			// Soil.g:790:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression2611);
			nRelExp=relationalExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nRelExp;}
			// Soil.g:791:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==EQUAL||LA36_0==NOT_EQUAL) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Soil.g:791:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression2640);
					n1=relationalExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop36;
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
	// Soil.g:801:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
	public final ASTExpression relationalExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nAddiExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Soil.g:803:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
			// Soil.g:804:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression2689);
			nAddiExp=additiveExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nAddiExp;}
			// Soil.g:805:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( ((LA37_0 >= GREATER && LA37_0 <= GREATER_EQUAL)||(LA37_0 >= LESS && LA37_0 <= LESS_EQUAL)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// Soil.g:805:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression2725);
					n1=additiveExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop37;
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
	// Soil.g:815:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
	public final ASTExpression additiveExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nMulExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Soil.g:817:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
			// Soil.g:818:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2775);
			nMulExp=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nMulExp;}
			// Soil.g:819:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==MINUS||LA38_0==PLUS) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// Soil.g:819:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2803);
					n1=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop38;
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
	// Soil.g:830:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
	public final ASTExpression multiplicativeExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Soil.g:832:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
			// Soil.g:833:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2853);
			nUnExp=unaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nUnExp;}
			// Soil.g:834:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==SLASH||LA39_0==STAR||LA39_0==59) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// Soil.g:834:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==59 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2885);
					n1=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop39;
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
	// Soil.g:846:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
	public final ASTExpression unaryExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression nPosExp =null;

		 Token op = null; 
		try {
			// Soil.g:848:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==MINUS||LA40_0==PLUS||LA40_0==75) ) {
				alt40=1;
			}
			else if ( (LA40_0==AT||LA40_0==HASH||(LA40_0 >= IDENT && LA40_0 <= INT)||LA40_0==LPAREN||LA40_0==REAL||(LA40_0 >= STAR && LA40_0 <= STRING)||(LA40_0 >= 44 && LA40_0 <= 50)||LA40_0==64||LA40_0==67||LA40_0==72||(LA40_0 >= 76 && LA40_0 <= 83)||(LA40_0 >= 86 && LA40_0 <= 87)||LA40_0==89) ) {
				alt40=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// Soil.g:849:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					{
					// Soil.g:849:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					// Soil.g:849:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==75 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression2971);
					nUnExp=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }
					}

					}
					break;
				case 2 :
					// Soil.g:853:7: nPosExp= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression2991);
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
	// Soil.g:861:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
	public final ASTExpression postfixExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nPrimExp =null;
		ASTExpression nPc =null;

		 boolean arrow = false; 
		try {
			// Soil.g:863:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
			// Soil.g:864:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression3024);
			nPrimExp=primaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nPrimExp; }
			// Soil.g:865:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==DOT) ) {
					int LA42_2 = input.LA(2);
					if ( (LA42_2==IDENT) ) {
						int LA42_4 = input.LA(3);
						if ( (LA42_4==EOF||(LA42_4 >= ARROW && LA42_4 <= BAR)||(LA42_4 >= COMMA && LA42_4 <= EQUAL)||(LA42_4 >= GREATER && LA42_4 <= GREATER_EQUAL)||(LA42_4 >= LBRACE && LA42_4 <= MINUS)||(LA42_4 >= NOT_EQUAL && LA42_4 <= PLUS)||(LA42_4 >= RBRACE && LA42_4 <= RBRACK)||(LA42_4 >= RPAREN && LA42_4 <= SLASH)||LA42_4==STAR||LA42_4==52||(LA42_4 >= 59 && LA42_4 <= 63)||(LA42_4 >= 68 && LA42_4 <= 69)||LA42_4==84||LA42_4==88||LA42_4==91) ) {
							alt42=1;
						}

					}
					else if ( (LA42_2==72||LA42_2==77||(LA42_2 >= 79 && LA42_2 <= 82)||(LA42_2 >= 86 && LA42_2 <= 87)) ) {
						alt42=1;
					}

				}
				else if ( (LA42_0==ARROW) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// Soil.g:866:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
					{
					// Soil.g:866:6: ( ARROW | DOT )
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==ARROW) ) {
						alt41=1;
					}
					else if ( (LA41_0==DOT) ) {
						alt41=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}

					switch (alt41) {
						case 1 :
							// Soil.g:866:8: ARROW
							{
							match(input,ARROW,FOLLOW_ARROW_in_postfixExpression3042); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = true; }
							}
							break;
						case 2 :
							// Soil.g:866:34: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_postfixExpression3048); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = false; }
							}
							break;

					}

					pushFollow(FOLLOW_propertyCall_in_postfixExpression3059);
					nPc=propertyCall(n, arrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;

				default :
					break loop42;
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
	// Soil.g:882:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
			// Soil.g:883:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
			int alt46=7;
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
			case 64:
			case 76:
			case 78:
			case 83:
			case 89:
				{
				alt46=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case COLON_COLON:
					{
					alt46=1;
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
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 68:
				case 69:
				case 84:
				case 88:
				case 91:
					{
					alt46=3;
					}
					break;
				case DOT:
					{
					switch ( input.LA(3) ) {
					case 51:
						{
						alt46=6;
						}
						break;
					case 55:
						{
						alt46=7;
						}
						break;
					case IDENT:
					case 72:
					case 77:
					case 79:
					case 80:
					case 81:
					case 82:
					case 86:
					case 87:
						{
						alt46=3;
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
								new NoViableAltException("", 46, 7, input);
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
							new NoViableAltException("", 46, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case AT:
				{
				alt46=2;
				}
				break;
			case 72:
			case 77:
			case 79:
			case 80:
			case 81:
			case 82:
			case 86:
			case 87:
				{
				alt46=3;
				}
				break;
			case LPAREN:
				{
				alt46=4;
				}
				break;
			case 67:
				{
				alt46=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// Soil.g:884:7: nLit= literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression3099);
					nLit=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nLit; }
					}
					break;
				case 2 :
					// Soil.g:885:7: nOr= objectReference
					{
					pushFollow(FOLLOW_objectReference_in_primaryExpression3113);
					nOr=objectReference();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nOr; }
					}
					break;
				case 3 :
					// Soil.g:886:7: nPc= propertyCall[null, false]
					{
					pushFollow(FOLLOW_propertyCall_in_primaryExpression3125);
					nPc=propertyCall(null, false);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;
				case 4 :
					// Soil.g:887:7: LPAREN nExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3136); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression3140);
					nExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3142); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExp!=null?((SoilParser.expression_return)nExp).n:null); }
					}
					break;
				case 5 :
					// Soil.g:888:7: nIfExp= ifExpression
					{
					pushFollow(FOLLOW_ifExpression_in_primaryExpression3154);
					nIfExp=ifExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nIfExp; }
					}
					break;
				case 6 :
					// Soil.g:889:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
					{
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3166); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression3168); if (state.failed) return n;
					match(input,51,FOLLOW_51_in_primaryExpression3170); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }
					// Soil.g:891:9: ( AT 'pre' )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==AT) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// Soil.g:891:11: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression3193); if (state.failed) return n;
							match(input,85,FOLLOW_85_in_primaryExpression3195); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					// Soil.g:892:9: ( LPAREN RPAREN )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==LPAREN) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// Soil.g:892:11: LPAREN RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3213); if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3215); if (state.failed) return n;
							}
							break;

					}

					}
					break;
				case 7 :
					// Soil.g:893:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
					{
					id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3228); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression3230); if (state.failed) return n;
					match(input,55,FOLLOW_55_in_primaryExpression3232); if (state.failed) return n;
					// Soil.g:893:31: ( LPAREN idExp= expression RPAREN )
					// Soil.g:893:33: LPAREN idExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3236); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression3240);
					idExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3242); if (state.failed) return n;
					}

					if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?((SoilParser.expression_return)idExp).n:null)); }
					// Soil.g:895:7: ( AT 'pre' )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==AT) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// Soil.g:895:9: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression3262); if (state.failed) return n;
							match(input,85,FOLLOW_85_in_primaryExpression3264); if (state.failed) return n;
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
	// Soil.g:899:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
	public final ASTExpression objectReference() throws RecognitionException {
		ASTExpression n = null;


		Token objectName=null;

		try {
			// Soil.g:900:3: ( AT objectName= IDENT )
			// Soil.g:901:3: AT objectName= IDENT
			{
			match(input,AT,FOLLOW_AT_in_objectReference3290); if (state.failed) return n;
			objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference3298); if (state.failed) return n;
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
	// Soil.g:915:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
	public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExpQuery =null;
		ASTExpression nExpIterate =null;
		ParserRuleReturnScope nExpOperation =null;
		ASTTypeArgExpression nExpType =null;
		ASTInStateExpression nExpInState =null;

		try {
			// Soil.g:916:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
			int alt47=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA47_1 = input.LA(2);
				if ( ((( input.LA(2) == LPAREN )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
					alt47=1;
				}
				else if ( (true) ) {
					alt47=3;
				}

				}
				break;
			case 72:
				{
				alt47=2;
				}
				break;
			case 77:
			case 81:
			case 82:
			case 86:
			case 87:
				{
				alt47=4;
				}
				break;
			case 79:
			case 80:
				{
				alt47=5;
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
					// Soil.g:920:7: {...}?{...}?nExpQuery= queryExpression[source]
					{
					if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
					}
					if ( !(( input.LA(2) == LPAREN )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
					}
					pushFollow(FOLLOW_queryExpression_in_propertyCall3363);
					nExpQuery=queryExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpQuery; }
					}
					break;
				case 2 :
					// Soil.g:923:7: nExpIterate= iterateExpression[source]
					{
					pushFollow(FOLLOW_iterateExpression_in_propertyCall3376);
					nExpIterate=iterateExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpIterate; }
					}
					break;
				case 3 :
					// Soil.g:924:7: nExpOperation= operationExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_operationExpression_in_propertyCall3389);
					nExpOperation=operationExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExpOperation!=null?((SoilParser.operationExpression_return)nExpOperation).n:null); }
					}
					break;
				case 4 :
					// Soil.g:925:7: nExpType= typeExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_typeExpression_in_propertyCall3402);
					nExpType=typeExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpType; }
					}
					break;
				case 5 :
					// Soil.g:926:7: nExpInState= inStateExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_inStateExpression_in_propertyCall3415);
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
	// Soil.g:935:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
	public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTElemVarsDeclaration decls =null;
		ParserRuleReturnScope nExp =null;

		ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
		try {
			// Soil.g:936:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
			// Soil.g:937:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
			{
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression3450); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression3457); if (state.failed) return n;
			// Soil.g:939:5: (decls= elemVarsDeclaration BAR )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==IDENT) ) {
				int LA48_1 = input.LA(2);
				if ( ((LA48_1 >= BAR && LA48_1 <= COLON)||LA48_1==COMMA) ) {
					alt48=1;
				}
			}
			switch (alt48) {
				case 1 :
					// Soil.g:939:7: decls= elemVarsDeclaration BAR
					{
					pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression3468);
					decls=elemVarsDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {decl = decls;}
					match(input,BAR,FOLLOW_BAR_in_queryExpression3472); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_queryExpression3483);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression3489); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?((SoilParser.expression_return)nExp).n:null)); }
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
	// Soil.g:953:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
	public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTElemVarsDeclaration decls =null;
		ASTVariableInitialization init =null;
		ParserRuleReturnScope nExp =null;

		try {
			// Soil.g:953:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
			// Soil.g:954:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
			{
			i=(Token)match(input,72,FOLLOW_72_in_iterateExpression3521); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression3527); if (state.failed) return n;
			pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression3535);
			decls=elemVarsDeclaration();
			state._fsp--;
			if (state.failed) return n;
			match(input,SEMI,FOLLOW_SEMI_in_iterateExpression3537); if (state.failed) return n;
			pushFollow(FOLLOW_variableInitialization_in_iterateExpression3545);
			init=variableInitialization();
			state._fsp--;
			if (state.failed) return n;
			match(input,BAR,FOLLOW_BAR_in_iterateExpression3547); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_iterateExpression3555);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression3561); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?((SoilParser.expression_return)nExp).n:null)); }
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
	// Soil.g:975:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
	public final SoilParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		SoilParser.operationExpression_return retval = new SoilParser.operationExpression_return();
		retval.start = input.LT(1);

		Token name=null;
		ParserRuleReturnScope rolename =null;
		ParserRuleReturnScope e =null;

		try {
			// Soil.g:977:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
			// Soil.g:978:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression3605); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }
			// Soil.g:984:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==LBRACK) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// Soil.g:984:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3627); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operationExpression3640);
					rolename=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((SoilParser.expression_return)rolename).n:null)); }
					// Soil.g:986:9: ( COMMA rolename= expression )*
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==COMMA) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// Soil.g:986:10: COMMA rolename= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_operationExpression3653); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression3657);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((SoilParser.expression_return)rolename).n:null)); }
							}
							break;

						default :
							break loop49;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3669); if (state.failed) return retval;
					// Soil.g:989:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==LBRACK) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// Soil.g:989:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3686); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression3701);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((SoilParser.expression_return)rolename).n:null)); }
							// Soil.g:991:11: ( COMMA rolename= expression )*
							loop50:
							while (true) {
								int alt50=2;
								int LA50_0 = input.LA(1);
								if ( (LA50_0==COMMA) ) {
									alt50=1;
								}

								switch (alt50) {
								case 1 :
									// Soil.g:991:12: COMMA rolename= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression3716); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression3720);
									rolename=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((SoilParser.expression_return)rolename).n:null)); }
									}
									break;

								default :
									break loop50;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3734); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			// Soil.g:996:5: ( AT 'pre' )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==AT) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// Soil.g:996:7: AT 'pre'
					{
					match(input,AT,FOLLOW_AT_in_operationExpression3759); if (state.failed) return retval;
					match(input,85,FOLLOW_85_in_operationExpression3761); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.setIsPre(); }
					}
					break;

			}

			// Soil.g:998:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==LPAREN) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Soil.g:999:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression3786); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.hasParentheses(); }
					// Soil.g:1000:7: (e= expression ( COMMA e= expression )* )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==AT||LA55_0==HASH||(LA55_0 >= IDENT && LA55_0 <= INT)||(LA55_0 >= LPAREN && LA55_0 <= MINUS)||LA55_0==PLUS||LA55_0==REAL||(LA55_0 >= STAR && LA55_0 <= STRING)||(LA55_0 >= 44 && LA55_0 <= 50)||LA55_0==64||LA55_0==67||(LA55_0 >= 72 && LA55_0 <= 73)||(LA55_0 >= 75 && LA55_0 <= 83)||(LA55_0 >= 86 && LA55_0 <= 87)||LA55_0==89) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// Soil.g:1001:7: e= expression ( COMMA e= expression )*
							{
							pushFollow(FOLLOW_expression_in_operationExpression3807);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((SoilParser.expression_return)e).n:null)); }
							// Soil.g:1002:7: ( COMMA e= expression )*
							loop54:
							while (true) {
								int alt54=2;
								int LA54_0 = input.LA(1);
								if ( (LA54_0==COMMA) ) {
									alt54=1;
								}

								switch (alt54) {
								case 1 :
									// Soil.g:1002:9: COMMA e= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression3819); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression3823);
									e=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((SoilParser.expression_return)e).n:null)); }
									}
									break;

								default :
									break loop54;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression3843); if (state.failed) return retval;
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
	// Soil.g:1009:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN ;
	public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTInStateExpression n = null;


		Token s=null;

		 Token opToken = null; 
		try {
			// Soil.g:1012:4: ( ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN )
			// Soil.g:1013:4: ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( (input.LA(1) >= 79 && input.LA(1) <= 80) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression3904); if (state.failed) return n;
			s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression3913); if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression3918); if (state.failed) return n;
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
	// Soil.g:1026:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
	public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTTypeArgExpression n = null;


		ASTType t =null;

		 Token opToken = null; 
		try {
			// Soil.g:1029:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
			// Soil.g:1030:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( input.LA(1)==77||(input.LA(1) >= 81 && input.LA(1) <= 82)||(input.LA(1) >= 86 && input.LA(1) <= 87) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression3978); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_typeExpression3982);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression3984); if (state.failed) return n;
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
	// Soil.g:1041:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
	public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
		ASTElemVarsDeclaration n = null;


		Token var1=null;
		Token varN=null;
		ASTType t =null;
		ASTType tN =null;

		try {
			// Soil.g:1042:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
			// Soil.g:1043:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
			{
			if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }
			var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration4022); if (state.failed) return n;
			// Soil.g:1044:17: ( COLON t= type )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==COLON) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Soil.g:1044:18: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration4025); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_elemVarsDeclaration4029);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}
			// Soil.g:1045:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==COMMA) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// Soil.g:1045:5: COMMA varN= IDENT ( COLON tN= type )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration4039); if (state.failed) return n;
					varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration4045); if (state.failed) return n;
					// Soil.g:1045:24: ( COLON tN= type )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==COLON) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// Soil.g:1045:25: COLON tN= type
							{
							match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration4048); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_elemVarsDeclaration4054);
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
					break loop59;
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
	// Soil.g:1053:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
	public final ASTVariableInitialization variableInitialization() throws RecognitionException {
		ASTVariableInitialization n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// Soil.g:1054:5: (name= IDENT COLON t= type EQUAL e= expression )
			// Soil.g:1055:5: name= IDENT COLON t= type EQUAL e= expression
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization4082); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableInitialization4084); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableInitialization4088);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization4090); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_variableInitialization4094);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?((SoilParser.expression_return)e).n:null)); }
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
	// Soil.g:1064:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
	public final ASTExpression ifExpression() throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;

		try {
			// Soil.g:1065:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
			// Soil.g:1066:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
			{
			i=(Token)match(input,67,FOLLOW_67_in_ifExpression4126); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression4130);
			cond=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,88,FOLLOW_88_in_ifExpression4132); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression4136);
			t=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,61,FOLLOW_61_in_ifExpression4138); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression4142);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,63,FOLLOW_63_in_ifExpression4144); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?((SoilParser.expression_return)cond).n:null), (t!=null?((SoilParser.expression_return)t).n:null), (e!=null?((SoilParser.expression_return)e).n:null)); }
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
	// Soil.g:1085:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
			// Soil.g:1086:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
			int alt60=12;
			switch ( input.LA(1) ) {
			case 89:
				{
				alt60=1;
				}
				break;
			case 64:
				{
				alt60=2;
				}
				break;
			case INT:
				{
				alt60=3;
				}
				break;
			case REAL:
				{
				alt60=4;
				}
				break;
			case STRING:
				{
				alt60=5;
				}
				break;
			case HASH:
				{
				alt60=6;
				}
				break;
			case IDENT:
				{
				alt60=7;
				}
				break;
			case 44:
			case 46:
			case 47:
			case 48:
				{
				int LA60_8 = input.LA(2);
				if ( (LA60_8==LPAREN) ) {
					alt60=9;
				}
				else if ( (LA60_8==LBRACE) ) {
					alt60=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 45:
			case 78:
				{
				alt60=9;
				}
				break;
			case 50:
			case 76:
			case 83:
				{
				alt60=10;
				}
				break;
			case 49:
				{
				alt60=11;
				}
				break;
			case STAR:
				{
				alt60=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// Soil.g:1087:7: t= 'true'
					{
					t=(Token)match(input,89,FOLLOW_89_in_literal4183); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }
					}
					break;
				case 2 :
					// Soil.g:1088:7: f= 'false'
					{
					f=(Token)match(input,64,FOLLOW_64_in_literal4197); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }
					}
					break;
				case 3 :
					// Soil.g:1089:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_literal4210); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }
					}
					break;
				case 4 :
					// Soil.g:1090:7: r= REAL
					{
					r=(Token)match(input,REAL,FOLLOW_REAL_in_literal4225); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }
					}
					break;
				case 5 :
					// Soil.g:1091:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_literal4239); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }
					}
					break;
				case 6 :
					// Soil.g:1092:7: HASH enumLit= IDENT
					{
					match(input,HASH,FOLLOW_HASH_in_literal4249); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4253); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}
					}
					break;
				case 7 :
					// Soil.g:1093:7: enumName= IDENT '::' enumLit= IDENT
					{
					enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4265); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal4267); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4271); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }
					}
					break;
				case 8 :
					// Soil.g:1094:7: nColIt= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_literal4283);
					nColIt=collectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nColIt; }
					}
					break;
				case 9 :
					// Soil.g:1095:7: nEColIt= emptyCollectionLiteral
					{
					pushFollow(FOLLOW_emptyCollectionLiteral_in_literal4295);
					nEColIt=emptyCollectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nEColIt; }
					}
					break;
				case 10 :
					// Soil.g:1096:7: nUndLit= undefinedLiteral
					{
					pushFollow(FOLLOW_undefinedLiteral_in_literal4307);
					nUndLit=undefinedLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nUndLit; }
					}
					break;
				case 11 :
					// Soil.g:1097:7: nTupleLit= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_literal4319);
					nTupleLit=tupleLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nTupleLit; }
					}
					break;
				case 12 :
					// Soil.g:1098:7: un= STAR
					{
					un=(Token)match(input,STAR,FOLLOW_STAR_in_literal4331); if (state.failed) return n;
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
	// Soil.g:1106:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
	public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
		ASTCollectionLiteral n = null;


		ASTCollectionItem ci =null;

		 Token op = null; 
		try {
			// Soil.g:1108:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
			// Soil.g:1109:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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
			match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral4398); if (state.failed) return n;
			// Soil.g:1113:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==AT||LA62_0==HASH||(LA62_0 >= IDENT && LA62_0 <= INT)||(LA62_0 >= LPAREN && LA62_0 <= MINUS)||LA62_0==PLUS||LA62_0==REAL||(LA62_0 >= STAR && LA62_0 <= STRING)||(LA62_0 >= 44 && LA62_0 <= 50)||LA62_0==64||LA62_0==67||(LA62_0 >= 72 && LA62_0 <= 73)||(LA62_0 >= 75 && LA62_0 <= 83)||(LA62_0 >= 86 && LA62_0 <= 87)||LA62_0==89) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// Soil.g:1114:7: ci= collectionItem ( COMMA ci= collectionItem )*
					{
					pushFollow(FOLLOW_collectionItem_in_collectionLiteral4415);
					ci=collectionItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addItem(ci); }
					// Soil.g:1115:7: ( COMMA ci= collectionItem )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==COMMA) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// Soil.g:1115:9: COMMA ci= collectionItem
							{
							match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral4428); if (state.failed) return n;
							pushFollow(FOLLOW_collectionItem_in_collectionLiteral4432);
							ci=collectionItem();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addItem(ci); }
							}
							break;

						default :
							break loop61;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral4451); if (state.failed) return n;
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
	// Soil.g:1124:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
	public final ASTCollectionItem collectionItem() throws RecognitionException {
		ASTCollectionItem n = null;


		ParserRuleReturnScope e =null;

		 n = new ASTCollectionItem(); 
		try {
			// Soil.g:1126:5: (e= expression ( DOTDOT e= expression )? )
			// Soil.g:1127:5: e= expression ( DOTDOT e= expression )?
			{
			pushFollow(FOLLOW_expression_in_collectionItem4480);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setFirst((e!=null?((SoilParser.expression_return)e).n:null)); }
			// Soil.g:1128:5: ( DOTDOT e= expression )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==DOTDOT) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Soil.g:1128:7: DOTDOT e= expression
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem4491); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_collectionItem4495);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setSecond((e!=null?((SoilParser.expression_return)e).n:null)); }
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
	// Soil.g:1138:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
	public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
		ASTEmptyCollectionLiteral n = null;


		ASTCollectionType t =null;

		try {
			// Soil.g:1139:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==78) ) {
				alt64=1;
			}
			else if ( ((LA64_0 >= 44 && LA64_0 <= 48)) ) {
				alt64=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// Soil.g:1140:5: 'oclEmpty' LPAREN t= collectionType RPAREN
					{
					match(input,78,FOLLOW_78_in_emptyCollectionLiteral4524); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral4526); if (state.failed) return n;
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4530);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral4532); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;
				case 2 :
					// Soil.g:1143:5: t= collectionType LBRACE RBRACE
					{
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4548);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral4550); if (state.failed) return n;
					match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral4552); if (state.failed) return n;
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
	// Soil.g:1154:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
	public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
		ASTUndefinedLiteral n = null;


		ASTType t =null;

		try {
			// Soil.g:1155:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
			int alt65=4;
			switch ( input.LA(1) ) {
			case 83:
				{
				alt65=1;
				}
				break;
			case 50:
				{
				alt65=2;
				}
				break;
			case 76:
				{
				int LA65_3 = input.LA(2);
				if ( (LA65_3==LPAREN) ) {
					alt65=3;
				}
				else if ( (LA65_3==EOF||LA65_3==ARROW||LA65_3==BAR||(LA65_3 >= COMMA && LA65_3 <= EQUAL)||(LA65_3 >= GREATER && LA65_3 <= GREATER_EQUAL)||LA65_3==LBRACE||(LA65_3 >= LESS && LA65_3 <= LESS_EQUAL)||LA65_3==MINUS||(LA65_3 >= NOT_EQUAL && LA65_3 <= PLUS)||(LA65_3 >= RBRACE && LA65_3 <= RBRACK)||(LA65_3 >= RPAREN && LA65_3 <= SLASH)||LA65_3==STAR||LA65_3==52||(LA65_3 >= 59 && LA65_3 <= 63)||(LA65_3 >= 68 && LA65_3 <= 69)||LA65_3==84||LA65_3==88||LA65_3==91) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 3, input);
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
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// Soil.g:1156:5: 'oclUndefined' LPAREN t= type RPAREN
					{
					match(input,83,FOLLOW_83_in_undefinedLiteral4582); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4584); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral4588);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4590); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 2 :
					// Soil.g:1159:5: 'Undefined'
					{
					match(input,50,FOLLOW_50_in_undefinedLiteral4604); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;
				case 3 :
					// Soil.g:1162:5: 'null' LPAREN t= type RPAREN
					{
					match(input,76,FOLLOW_76_in_undefinedLiteral4618); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4620); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral4624);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4626); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 4 :
					// Soil.g:1165:5: 'null'
					{
					match(input,76,FOLLOW_76_in_undefinedLiteral4640); if (state.failed) return n;
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
	// Soil.g:1175:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
	public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
		ASTTupleLiteral n = null;


		ASTTupleItem ti =null;

		 List tiList = new ArrayList(); 
		try {
			// Soil.g:1177:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
			// Soil.g:1178:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
			{
			match(input,49,FOLLOW_49_in_tupleLiteral4679); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral4685); if (state.failed) return n;
			pushFollow(FOLLOW_tupleItem_in_tupleLiteral4693);
			ti=tupleItem();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tiList.add(ti); }
			// Soil.g:1181:5: ( COMMA ti= tupleItem )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==COMMA) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// Soil.g:1181:7: COMMA ti= tupleItem
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral4704); if (state.failed) return n;
					pushFollow(FOLLOW_tupleItem_in_tupleLiteral4708);
					ti=tupleItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tiList.add(ti); }
					}
					break;

				default :
					break loop66;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral4719); if (state.failed) return n;
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
	// Soil.g:1189:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
	public final ASTTupleItem tupleItem() throws RecognitionException {
		ASTTupleItem n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// Soil.g:1190:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
			// Soil.g:1191:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem4750); if (state.failed) return n;
			// Soil.g:1192:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==COLON) ) {
				int LA67_1 = input.LA(2);
				if ( (synpred2_Soil()) ) {
					alt67=1;
				}
				else if ( (true) ) {
					alt67=2;
				}

			}
			else if ( (LA67_0==EQUAL) ) {
				alt67=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// Soil.g:1195:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
					{
					match(input,COLON,FOLLOW_COLON_in_tupleItem4789); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_tupleItem4793);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem4795); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_tupleItem4799);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?((SoilParser.expression_return)e).n:null)); }
					}
					break;
				case 2 :
					// Soil.g:1198:7: ( COLON | EQUAL ) e= expression
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
					pushFollow(FOLLOW_expression_in_tupleItem4831);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?((SoilParser.expression_return)e).n:null)); }
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
	// Soil.g:1209:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
	public final ASTType type() throws RecognitionException {
		ASTType n = null;


		ASTSimpleType nTSimple =null;
		ASTCollectionType nTCollection =null;
		ASTTupleType nTTuple =null;

		 Token tok = null; 
		try {
			// Soil.g:1211:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
			// Soil.g:1212:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }
			// Soil.g:1213:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			int alt68=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt68=1;
				}
				break;
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
				{
				alt68=2;
				}
				break;
			case 49:
				{
				alt68=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// Soil.g:1214:7: nTSimple= simpleType
					{
					pushFollow(FOLLOW_simpleType_in_type4897);
					nTSimple=simpleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 2 :
					// Soil.g:1215:7: nTCollection= collectionType
					{
					pushFollow(FOLLOW_collectionType_in_type4909);
					nTCollection=collectionType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 3 :
					// Soil.g:1216:7: nTTuple= tupleType
					{
					pushFollow(FOLLOW_tupleType_in_type4921);
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
	// Soil.g:1221:1: typeOnly returns [ASTType n] : nT= type EOF ;
	public final ASTType typeOnly() throws RecognitionException {
		ASTType n = null;


		ASTType nT =null;

		try {
			// Soil.g:1222:5: (nT= type EOF )
			// Soil.g:1223:5: nT= type EOF
			{
			pushFollow(FOLLOW_type_in_typeOnly4953);
			nT=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_typeOnly4955); if (state.failed) return n;
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
	// Soil.g:1233:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
	public final ASTSimpleType simpleType() throws RecognitionException {
		ASTSimpleType n = null;


		Token name=null;

		try {
			// Soil.g:1234:5: (name= IDENT )
			// Soil.g:1235:5: name= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType4983); if (state.failed) return n;
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
	// Soil.g:1243:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
	public final ASTCollectionType collectionType() throws RecognitionException {
		ASTCollectionType n = null;


		ASTType elemType =null;

		 Token op = null; 
		try {
			// Soil.g:1245:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
			// Soil.g:1246:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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
			match(input,LPAREN,FOLLOW_LPAREN_in_collectionType5048); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_collectionType5052);
			elemType=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_collectionType5054); if (state.failed) return n;
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
	// Soil.g:1256:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
	public final ASTTupleType tupleType() throws RecognitionException {
		ASTTupleType n = null;


		ASTTuplePart tp =null;

		 List tpList = new ArrayList(); 
		try {
			// Soil.g:1258:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
			// Soil.g:1259:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
			{
			match(input,49,FOLLOW_49_in_tupleType5088); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_tupleType5090); if (state.failed) return n;
			pushFollow(FOLLOW_tuplePart_in_tupleType5099);
			tp=tuplePart();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tpList.add(tp); }
			// Soil.g:1261:5: ( COMMA tp= tuplePart )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==COMMA) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// Soil.g:1261:7: COMMA tp= tuplePart
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleType5110); if (state.failed) return n;
					pushFollow(FOLLOW_tuplePart_in_tupleType5114);
					tp=tuplePart();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tpList.add(tp); }
					}
					break;

				default :
					break loop69;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_tupleType5126); if (state.failed) return n;
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
	// Soil.g:1270:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
	public final ASTTuplePart tuplePart() throws RecognitionException {
		ASTTuplePart n = null;


		Token name=null;
		ASTType t =null;

		try {
			// Soil.g:1271:5: (name= IDENT COLON t= type )
			// Soil.g:1272:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart5158); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_tuplePart5160); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_tuplePart5164);
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

	// $ANTLR start synpred1_Soil
	public final void synpred1_Soil_fragment() throws RecognitionException {
		// Soil.g:152:5: ( statStartingWithExpr )
		// Soil.g:152:6: statStartingWithExpr
		{
		pushFollow(FOLLOW_statStartingWithExpr_in_synpred1_Soil196);
		statStartingWithExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Soil

	// $ANTLR start synpred2_Soil
	public final void synpred2_Soil_fragment() throws RecognitionException {
		// Soil.g:1195:7: ( COLON type EQUAL )
		// Soil.g:1195:8: COLON type EQUAL
		{
		match(input,COLON,FOLLOW_COLON_in_synpred2_Soil4780); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred2_Soil4782);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,EQUAL,FOLLOW_EQUAL_in_synpred2_Soil4784); if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Soil

	// Delegated rules

	public final boolean synpred2_Soil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Soil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Soil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Soil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_stat_in_statOnly77 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statOnly81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleStat_in_stat116 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_SEMI_in_stat128 = new BitSet(new long[]{0x0627F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_singleStat_in_stat138 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_emptyStat_in_singleStat178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAssignStat_in_singleStat216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_singleStat230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleStat244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleStat257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleStat274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExStat_in_singleStat291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterStat_in_singleStat308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_singleStat330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStat_in_singleStat348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_emptyStat375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr401 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_varAssignStat453 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat457 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValue_in_varAssignStat465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_attAssignStat489 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_attAssignStat498 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat502 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValue_in_attAssignStat510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_objCreateStat536 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_simpleType_in_objCreateStat544 = new BitSet(new long[]{0x0040000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat554 = new BitSet(new long[]{0x0007F318861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat567 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat575 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_objCreateStat593 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat601 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat615 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_objDestroyStat659 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_lnkInsStat693 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkInsStat697 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat707 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkInsStat711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_lnkInsStat715 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_lnkInsStat723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers752 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers763 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers772 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers779 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers795 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers806 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers817 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers826 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers833 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers855 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers870 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers890 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers901 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers910 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_57_in_lnkDelStat951 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkDelStat955 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat965 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkDelStat969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_lnkDelStat973 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_lnkDelStat982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_condExStat1013 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_inSoilExpression_in_condExStat1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_condExStat1026 = new BitSet(new long[]{0x0727F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat1035 = new BitSet(new long[]{0x6000000000000000L});
	public static final BitSet FOLLOW_61_in_condExStat1046 = new BitSet(new long[]{0x0727F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat1058 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_condExStat1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_iterStat1095 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_iterStat1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_iterStat1107 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_inSoilExpression_in_iterStat1115 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_iterStat1119 = new BitSet(new long[]{0x0727F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat1127 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_iterStat1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_whileStat1158 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_inSoilExpression_in_whileStat1166 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_whileStat1170 = new BitSet(new long[]{0x0727F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat1178 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_whileStat1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_blockStat1213 = new BitSet(new long[]{0x0727F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_56_in_blockStat1218 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat1224 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_blockStat1230 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat1236 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_SEMI_in_blockStat1243 = new BitSet(new long[]{0x0627F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_stat_in_blockStat1253 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_blockStat1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_implicitBlockStat1284 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat1290 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_implicitBlockStat1296 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat1302 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_SEMI_in_implicitBlockStat1309 = new BitSet(new long[]{0x0627F308861A0020L,0x0000000006CFFF4BL});
	public static final BitSet FOLLOW_stat_in_implicitBlockStat1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOrImplicitBlock1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_rValue1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_rValue1408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_rValList1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValListMin1_in_rValList1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin11491 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin11505 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValue_in_rValListMin11515 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_rValue_in_rValListMin21554 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin21562 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValue_in_rValListMin21570 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin21584 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFF09L});
	public static final BitSet FOLLOW_rValue_in_rValListMin21594 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expression_in_inSoilExpression1628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_exprList1657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprListMin1_in_exprList1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11708 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin11723 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11733 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21773 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin21781 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21789 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin21803 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21813 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_nothing_in_identList1843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identListMin1_in_identList1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identListMin11894 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_identListMin11908 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_identListMin11918 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expression_in_expressionOnly1958 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expressionOnly1960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_expression2008 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression2019 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression2023 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_expression2027 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression2032 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_expression2036 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_expression2074 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression2086 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression2090 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_expression2094 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression2099 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_expression2103 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_expression2144 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression2160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramList2193 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList2210 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_paramList2222 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList2226 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_paramList2246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idList2275 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_idList2285 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_idList2289 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration2320 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration2322 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration2326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conditionalImpliesExpression2375 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_conditionalOrExpression2437 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2485 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_conditionalXOrExpression2498 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2502 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2546 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_52_in_conditionalAndExpression2559 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2563 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2611 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_set_in_equalityExpression2630 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2640 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2689 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_set_in_relationalExpression2707 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2725 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2775 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression2793 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2803 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2853 = new BitSet(new long[]{0x0800014000000002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression2871 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2885 = new BitSet(new long[]{0x0800014000000002L});
	public static final BitSet FOLLOW_set_in_unaryExpression2947 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFF909L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression3024 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_ARROW_in_postfixExpression3042 = new BitSet(new long[]{0x0000000000080000L,0x0000000000C7A100L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression3048 = new BitSet(new long[]{0x0000000000080000L,0x0000000000C7A100L});
	public static final BitSet FOLLOW_propertyCall_in_postfixExpression3059 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_literal_in_primaryExpression3099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectReference_in_primaryExpression3113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyCall_in_primaryExpression3125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression3136 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_primaryExpression3140 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression3142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_primaryExpression3154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression3166 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression3168 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_primaryExpression3170 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression3193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_primaryExpression3195 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression3213 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression3215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression3228 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression3230 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_primaryExpression3232 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression3236 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_primaryExpression3240 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression3242 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression3262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_primaryExpression3264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_objectReference3290 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_objectReference3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryExpression_in_propertyCall3363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterateExpression_in_propertyCall3376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationExpression_in_propertyCall3389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeExpression_in_propertyCall3402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inStateExpression_in_propertyCall3415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_queryExpression3450 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_queryExpression3457 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression3468 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_queryExpression3472 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_queryExpression3483 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_queryExpression3489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_iterateExpression3521 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_iterateExpression3527 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression3535 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterateExpression3537 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableInitialization_in_iterateExpression3545 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_iterateExpression3547 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_iterateExpression3555 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterateExpression3561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_operationExpression3605 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression3627 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_operationExpression3640 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression3653 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_operationExpression3657 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression3669 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression3686 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_operationExpression3701 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression3716 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_operationExpression3720 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression3734 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_operationExpression3759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_operationExpression3761 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_operationExpression3786 = new BitSet(new long[]{0x0007F318861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_operationExpression3807 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression3819 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_operationExpression3823 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_operationExpression3843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inStateExpression3891 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_inStateExpression3904 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_inStateExpression3913 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_inStateExpression3918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeExpression3954 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_typeExpression3978 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_typeExpression3982 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_typeExpression3984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration4022 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration4025 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration4029 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration4039 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration4045 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration4048 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration4054 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableInitialization4082 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableInitialization4084 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_variableInitialization4088 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_variableInitialization4090 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_variableInitialization4094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ifExpression4126 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_ifExpression4130 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_ifExpression4132 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_ifExpression4136 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_ifExpression4138 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_ifExpression4142 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_ifExpression4144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_literal4183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_literal4197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal4210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_literal4225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal4239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_literal4249 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal4253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_literal4265 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_literal4267 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal4271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_literal4283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal4295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_undefinedLiteral_in_literal4307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_literal4319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_literal4331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionLiteral4369 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_collectionLiteral4398 = new BitSet(new long[]{0x0007F30A861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4415 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_collectionLiteral4428 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4432 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_collectionLiteral4451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_collectionItem4480 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_collectionItem4491 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_collectionItem4495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_emptyCollectionLiteral4524 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral4526 = new BitSet(new long[]{0x0001F00000000000L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4530 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral4532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4548 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral4550 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral4552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_undefinedLiteral4582 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4584 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral4588 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_undefinedLiteral4604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_undefinedLiteral4618 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4620 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral4624 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_undefinedLiteral4640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_tupleLiteral4679 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_tupleLiteral4685 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4693 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleLiteral4704 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4708 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_tupleLiteral4719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tupleItem4750 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_tupleItem4789 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_tupleItem4793 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_tupleItem4795 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_tupleItem4799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_tupleItem4821 = new BitSet(new long[]{0x0007F308861A0020L,0x0000000002CFFB09L});
	public static final BitSet FOLLOW_expression_in_tupleItem4831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type4897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_type4909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleType_in_type4921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOnly4953 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_typeOnly4955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simpleType4983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionType5021 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_collectionType5048 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_collectionType5052 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_collectionType5054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_tupleType5088 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_tupleType5090 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType5099 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleType5110 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType5114 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_tupleType5126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tuplePart5158 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_tuplePart5160 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_tuplePart5164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_synpred1_Soil196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_synpred2_Soil4780 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_synpred2_Soil4782 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred2_Soil4784 = new BitSet(new long[]{0x0000000000000002L});
}
