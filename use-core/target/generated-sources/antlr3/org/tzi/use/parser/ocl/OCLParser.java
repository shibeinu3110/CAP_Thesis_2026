// $ANTLR 3.5.2 OCL.g 2026-05-01 21:22:06
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
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

package org.tzi.use.parser.ocl; 

// ------------------------------------
//  USE OCL parser
// ------------------------------------
import org.tzi.use.parser.base.BaseParser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class OCLParser extends BaseParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", 
		"COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", 
		"GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", 
		"LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", 
		"NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", 
		"REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", 
		"WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", 
		"'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'byUseId'", "'div'", 
		"'else'", "'endif'", "'false'", "'if'", "'implies'", "'in'", "'iterate'", 
		"'let'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", 
		"'oclIsInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", 
		"'or'", "'pre'", "'selectByKind'", "'selectByType'", "'then'", "'true'", 
		"'xor'"
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


	public OCLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public OCLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return OCLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "OCL.g"; }



	// $ANTLR start "expressionOnly"
	// OCL.g:95:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
	public final ASTExpression expressionOnly() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExp =null;

		try {
			// OCL.g:96:5: (nExp= expression EOF )
			// OCL.g:97:5: nExp= expression EOF
			{
			pushFollow(FOLLOW_expression_in_expressionOnly67);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_expressionOnly69); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nExp;}
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



	// $ANTLR start "expression"
	// OCL.g:104:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
	public final ASTExpression expression() throws RecognitionException {
		ASTExpression n = null;


		Token name=null;
		ASTType t =null;
		ASTExpression e1 =null;
		ASTExpression nCndImplies =null;

		 
		  ASTLetExpression prevLet = null, firstLet = null;
		  ASTExpression e2;
		  Token tok = null;

		try {
			// OCL.g:110:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
			// OCL.g:111:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }
			// OCL.g:112:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==62) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// OCL.g:113:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
					{
					match(input,62,FOLLOW_62_in_expression117); if (state.failed) return n;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression128); if (state.failed) return n;
					// OCL.g:114:18: ( COLON t= type )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==COLON) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// OCL.g:114:20: COLON t= type
							{
							match(input,COLON,FOLLOW_COLON_in_expression132); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_expression136);
							t=type();
							state._fsp--;
							if (state.failed) return n;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_expression141); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression145);
					e1=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, e1);
					         if ( firstLet == null ) 
					             firstLet = nextLet;
					         if ( prevLet != null ) 
					             prevLet.setInExpr(nextLet);
					         prevLet = nextLet;
					      }
					// OCL.g:124:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==COMMA) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// OCL.g:125:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_expression183); if (state.failed) return n;
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression195); if (state.failed) return n;
							// OCL.g:126:20: ( COLON t= type )?
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==COLON) ) {
								alt2=1;
							}
							switch (alt2) {
								case 1 :
									// OCL.g:126:22: COLON t= type
									{
									match(input,COLON,FOLLOW_COLON_in_expression199); if (state.failed) return n;
									pushFollow(FOLLOW_type_in_expression203);
									t=type();
									state._fsp--;
									if (state.failed) return n;
									}
									break;

							}

							match(input,EQUAL,FOLLOW_EQUAL_in_expression208); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_expression212);
							e1=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, e1);
							           if ( firstLet == null ) 
							               firstLet = nextLet;
							           if ( prevLet != null ) 
							               prevLet.setInExpr(nextLet);
							           prevLet = nextLet;
							        }
							}
							break;

						default :
							break loop3;
						}
					}

					match(input,60,FOLLOW_60_in_expression253); if (state.failed) return n;
					}
					break;

				default :
					break loop4;
				}
			}

			pushFollow(FOLLOW_conditionalImpliesExpression_in_expression269);
			nCndImplies=conditionalImpliesExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if ( nCndImplies != null ) {
			    	 n = nCndImplies;
			         n.setStartToken(tok);
			      }
			      
			      if ( prevLet != null ) { 
			         prevLet.setInExpr(n);
			         n = firstLet;
			         n.setStartToken(tok);
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
	// $ANTLR end "expression"



	// $ANTLR start "paramList"
	// OCL.g:158:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
	public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
		List<ASTVariableDeclaration> paramList = null;


		ASTVariableDeclaration v =null;

		 paramList = new ArrayList<ASTVariableDeclaration>(); 
		try {
			// OCL.g:160:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
			// OCL.g:161:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_paramList302); if (state.failed) return paramList;
			// OCL.g:162:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// OCL.g:163:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_paramList319);
					v=variableDeclaration();
					state._fsp--;
					if (state.failed) return paramList;
					if ( state.backtracking==0 ) { paramList.add(v); }
					// OCL.g:164:7: ( COMMA v= variableDeclaration )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// OCL.g:164:9: COMMA v= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramList331); if (state.failed) return paramList;
							pushFollow(FOLLOW_variableDeclaration_in_paramList335);
							v=variableDeclaration();
							state._fsp--;
							if (state.failed) return paramList;
							if ( state.backtracking==0 ) { paramList.add(v); }
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_paramList355); if (state.failed) return paramList;
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
	// OCL.g:172:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
	public final List idList() throws RecognitionException {
		List idList = null;


		Token id0=null;
		Token idn=null;

		 idList = new ArrayList(); 
		try {
			// OCL.g:174:5: (id0= IDENT ( COMMA idn= IDENT )* )
			// OCL.g:175:5: id0= IDENT ( COMMA idn= IDENT )*
			{
			id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList384); if (state.failed) return idList;
			if ( state.backtracking==0 ) { idList.add(id0); }
			// OCL.g:176:5: ( COMMA idn= IDENT )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// OCL.g:176:7: COMMA idn= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_idList394); if (state.failed) return idList;
					idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList398); if (state.failed) return idList;
					if ( state.backtracking==0 ) { idList.add(idn); }
					}
					break;

				default :
					break loop7;
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
	// OCL.g:184:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
	public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
		ASTVariableDeclaration n = null;


		Token name=null;
		ASTType t =null;

		try {
			// OCL.g:185:5: (name= IDENT COLON t= type )
			// OCL.g:186:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration429); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableDeclaration431); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration435);
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
	// OCL.g:194:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
	public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndOrExp =null;
		ASTExpression n1 =null;

		try {
			// OCL.g:195:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
			// OCL.g:196:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression471);
			nCndOrExp=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndOrExp;}
			// OCL.g:197:5: (op= 'implies' n1= conditionalOrExpression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==59) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// OCL.g:197:7: op= 'implies' n1= conditionalOrExpression
					{
					op=(Token)match(input,59,FOLLOW_59_in_conditionalImpliesExpression484); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression488);
					n1=conditionalOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop8;
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
	// OCL.g:206:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
	public final ASTExpression conditionalOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndXorExp =null;
		ASTExpression n1 =null;

		try {
			// OCL.g:207:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
			// OCL.g:208:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
			{
			pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression533);
			nCndXorExp=conditionalXOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndXorExp;}
			// OCL.g:209:5: (op= 'or' n1= conditionalXOrExpression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==72) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// OCL.g:209:7: op= 'or' n1= conditionalXOrExpression
					{
					op=(Token)match(input,72,FOLLOW_72_in_conditionalOrExpression546); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression550);
					n1=conditionalXOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop9;
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
	// OCL.g:218:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
	public final ASTExpression conditionalXOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndAndExp =null;
		ASTExpression n1 =null;

		try {
			// OCL.g:219:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
			// OCL.g:220:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression594);
			nCndAndExp=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndAndExp;}
			// OCL.g:221:5: (op= 'xor' n1= conditionalAndExpression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==78) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// OCL.g:221:7: op= 'xor' n1= conditionalAndExpression
					{
					op=(Token)match(input,78,FOLLOW_78_in_conditionalXOrExpression607); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression611);
					n1=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop10;
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
	// OCL.g:230:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
	public final ASTExpression conditionalAndExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nEqExp =null;
		ASTExpression n1 =null;

		try {
			// OCL.g:231:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
			// OCL.g:232:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression655);
			nEqExp=equalityExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nEqExp;}
			// OCL.g:233:5: (op= 'and' n1= equalityExpression )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==52) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// OCL.g:233:7: op= 'and' n1= equalityExpression
					{
					op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression668); if (state.failed) return n;
					pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression672);
					n1=equalityExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop11;
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
	// OCL.g:242:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
	public final ASTExpression equalityExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nRelExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// OCL.g:244:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
			// OCL.g:245:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression720);
			nRelExp=relationalExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nRelExp;}
			// OCL.g:246:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQUAL||LA12_0==NOT_EQUAL) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// OCL.g:246:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression749);
					n1=relationalExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop12;
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
	// OCL.g:256:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
	public final ASTExpression relationalExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nAddiExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// OCL.g:258:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
			// OCL.g:259:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression798);
			nAddiExp=additiveExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nAddiExp;}
			// OCL.g:260:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= GREATER && LA13_0 <= GREATER_EQUAL)||(LA13_0 >= LESS && LA13_0 <= LESS_EQUAL)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// OCL.g:260:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression834);
					n1=additiveExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop13;
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
	// OCL.g:270:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
	public final ASTExpression additiveExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nMulExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// OCL.g:272:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
			// OCL.g:273:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression884);
			nMulExp=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nMulExp;}
			// OCL.g:274:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// OCL.g:274:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression912);
					n1=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop14;
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
	// OCL.g:285:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
	public final ASTExpression multiplicativeExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// OCL.g:287:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
			// OCL.g:288:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression962);
			nUnExp=unaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nUnExp;}
			// OCL.g:289:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==SLASH||LA15_0==STAR||LA15_0==54) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// OCL.g:289:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==54 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression994);
					n1=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
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
		return n;
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// OCL.g:301:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
	public final ASTExpression unaryExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression nPosExp =null;

		 Token op = null; 
		try {
			// OCL.g:303:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==MINUS||LA16_0==PLUS||LA16_0==63) ) {
				alt16=1;
			}
			else if ( (LA16_0==AT||LA16_0==HASH||(LA16_0 >= IDENT && LA16_0 <= INT)||LA16_0==LPAREN||LA16_0==REAL||(LA16_0 >= STAR && LA16_0 <= STRING)||(LA16_0 >= 44 && LA16_0 <= 50)||(LA16_0 >= 57 && LA16_0 <= 58)||LA16_0==61||(LA16_0 >= 64 && LA16_0 <= 71)||(LA16_0 >= 74 && LA16_0 <= 75)||LA16_0==77) ) {
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
					// OCL.g:304:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					{
					// OCL.g:304:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					// OCL.g:304:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==63 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression1080);
					nUnExp=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }
					}

					}
					break;
				case 2 :
					// OCL.g:308:7: nPosExp= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression1100);
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
	// OCL.g:316:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
	public final ASTExpression postfixExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nPrimExp =null;
		ASTExpression nPc =null;

		 boolean arrow = false; 
		try {
			// OCL.g:318:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
			// OCL.g:319:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression1133);
			nPrimExp=primaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nPrimExp; }
			// OCL.g:320:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ARROW||LA18_0==DOT) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// OCL.g:321:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
					{
					// OCL.g:321:6: ( ARROW | DOT )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ARROW) ) {
						alt17=1;
					}
					else if ( (LA17_0==DOT) ) {
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
							// OCL.g:321:8: ARROW
							{
							match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1151); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = true; }
							}
							break;
						case 2 :
							// OCL.g:321:34: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_postfixExpression1157); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = false; }
							}
							break;

					}

					pushFollow(FOLLOW_propertyCall_in_postfixExpression1168);
					nPc=propertyCall(n, arrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
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
	// $ANTLR end "postfixExpression"



	// $ANTLR start "primaryExpression"
	// OCL.g:337:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
	public final ASTExpression primaryExpression() throws RecognitionException {
		ASTExpression n = null;


		Token id1=null;
		Token id2=null;
		ASTExpression nLit =null;
		ASTExpression nOr =null;
		ASTExpression nPc =null;
		ASTExpression nExp =null;
		ASTExpression nIfExp =null;
		ASTExpression idExp =null;

		try {
			// OCL.g:338:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
			int alt22=7;
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
			case 57:
			case 64:
			case 66:
			case 71:
			case 77:
				{
				alt22=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case COLON_COLON:
					{
					alt22=1;
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
				case SLASH:
				case STAR:
				case 52:
				case 54:
				case 55:
				case 56:
				case 59:
				case 60:
				case 72:
				case 76:
				case 78:
					{
					alt22=3;
					}
					break;
				case DOT:
					{
					switch ( input.LA(3) ) {
					case 51:
						{
						alt22=6;
						}
						break;
					case 53:
						{
						alt22=7;
						}
						break;
					case IDENT:
					case 61:
					case 65:
					case 67:
					case 68:
					case 69:
					case 70:
					case 74:
					case 75:
						{
						alt22=3;
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
								new NoViableAltException("", 22, 7, input);
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
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case AT:
				{
				alt22=2;
				}
				break;
			case 61:
			case 65:
			case 67:
			case 68:
			case 69:
			case 70:
			case 74:
			case 75:
				{
				alt22=3;
				}
				break;
			case LPAREN:
				{
				alt22=4;
				}
				break;
			case 58:
				{
				alt22=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// OCL.g:339:7: nLit= literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression1208);
					nLit=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nLit; }
					}
					break;
				case 2 :
					// OCL.g:340:7: nOr= objectReference
					{
					pushFollow(FOLLOW_objectReference_in_primaryExpression1222);
					nOr=objectReference();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nOr; }
					}
					break;
				case 3 :
					// OCL.g:341:7: nPc= propertyCall[null, false]
					{
					pushFollow(FOLLOW_propertyCall_in_primaryExpression1234);
					nPc=propertyCall(null, false);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;
				case 4 :
					// OCL.g:342:7: LPAREN nExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1245); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression1249);
					nExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1251); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExp; }
					}
					break;
				case 5 :
					// OCL.g:343:7: nIfExp= ifExpression
					{
					pushFollow(FOLLOW_ifExpression_in_primaryExpression1263);
					nIfExp=ifExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nIfExp; }
					}
					break;
				case 6 :
					// OCL.g:344:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
					{
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1275); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression1277); if (state.failed) return n;
					match(input,51,FOLLOW_51_in_primaryExpression1279); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }
					// OCL.g:346:9: ( AT 'pre' )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==AT) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// OCL.g:346:11: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression1302); if (state.failed) return n;
							match(input,73,FOLLOW_73_in_primaryExpression1304); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					// OCL.g:347:9: ( LPAREN RPAREN )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LPAREN) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// OCL.g:347:11: LPAREN RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1322); if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1324); if (state.failed) return n;
							}
							break;

					}

					}
					break;
				case 7 :
					// OCL.g:348:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
					{
					id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1337); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression1339); if (state.failed) return n;
					match(input,53,FOLLOW_53_in_primaryExpression1341); if (state.failed) return n;
					// OCL.g:348:31: ( LPAREN idExp= expression RPAREN )
					// OCL.g:348:33: LPAREN idExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1345); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression1349);
					idExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1351); if (state.failed) return n;
					}

					if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }
					// OCL.g:350:7: ( AT 'pre' )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==AT) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// OCL.g:350:9: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression1371); if (state.failed) return n;
							match(input,73,FOLLOW_73_in_primaryExpression1373); if (state.failed) return n;
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
	// OCL.g:354:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
	public final ASTExpression objectReference() throws RecognitionException {
		ASTExpression n = null;


		Token objectName=null;

		try {
			// OCL.g:355:3: ( AT objectName= IDENT )
			// OCL.g:356:3: AT objectName= IDENT
			{
			match(input,AT,FOLLOW_AT_in_objectReference1399); if (state.failed) return n;
			objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1407); if (state.failed) return n;
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
	// OCL.g:370:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
	public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExpQuery =null;
		ASTExpression nExpIterate =null;
		ParserRuleReturnScope nExpOperation =null;
		ASTTypeArgExpression nExpType =null;
		ASTInStateExpression nExpInState =null;

		try {
			// OCL.g:371:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
			int alt23=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA23_1 = input.LA(2);
				if ( ((( input.LA(2) == LPAREN )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
					alt23=1;
				}
				else if ( (true) ) {
					alt23=3;
				}

				}
				break;
			case 61:
				{
				alt23=2;
				}
				break;
			case 65:
			case 69:
			case 70:
			case 74:
			case 75:
				{
				alt23=4;
				}
				break;
			case 67:
			case 68:
				{
				alt23=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// OCL.g:375:7: {...}?{...}?nExpQuery= queryExpression[source]
					{
					if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
					}
					if ( !(( input.LA(2) == LPAREN )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
					}
					pushFollow(FOLLOW_queryExpression_in_propertyCall1472);
					nExpQuery=queryExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpQuery; }
					}
					break;
				case 2 :
					// OCL.g:378:7: nExpIterate= iterateExpression[source]
					{
					pushFollow(FOLLOW_iterateExpression_in_propertyCall1485);
					nExpIterate=iterateExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpIterate; }
					}
					break;
				case 3 :
					// OCL.g:379:7: nExpOperation= operationExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_operationExpression_in_propertyCall1498);
					nExpOperation=operationExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExpOperation!=null?((OCLParser.operationExpression_return)nExpOperation).n:null); }
					}
					break;
				case 4 :
					// OCL.g:380:7: nExpType= typeExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_typeExpression_in_propertyCall1511);
					nExpType=typeExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpType; }
					}
					break;
				case 5 :
					// OCL.g:381:7: nExpInState= inStateExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_inStateExpression_in_propertyCall1524);
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
	// OCL.g:390:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
	public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTElemVarsDeclaration decls =null;
		ASTExpression nExp =null;

		ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
		try {
			// OCL.g:391:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
			// OCL.g:392:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
			{
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1559); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression1566); if (state.failed) return n;
			// OCL.g:394:5: (decls= elemVarsDeclaration BAR )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==IDENT) ) {
				int LA24_1 = input.LA(2);
				if ( ((LA24_1 >= BAR && LA24_1 <= COLON)||LA24_1==COMMA) ) {
					alt24=1;
				}
			}
			switch (alt24) {
				case 1 :
					// OCL.g:394:7: decls= elemVarsDeclaration BAR
					{
					pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression1577);
					decls=elemVarsDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {decl = decls;}
					match(input,BAR,FOLLOW_BAR_in_queryExpression1581); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_queryExpression1592);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression1598); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, nExp); }
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
	// OCL.g:408:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
	public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTElemVarsDeclaration decls =null;
		ASTVariableInitialization init =null;
		ASTExpression nExp =null;

		try {
			// OCL.g:408:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
			// OCL.g:409:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
			{
			i=(Token)match(input,61,FOLLOW_61_in_iterateExpression1630); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression1636); if (state.failed) return n;
			pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression1644);
			decls=elemVarsDeclaration();
			state._fsp--;
			if (state.failed) return n;
			match(input,SEMI,FOLLOW_SEMI_in_iterateExpression1646); if (state.failed) return n;
			pushFollow(FOLLOW_variableInitialization_in_iterateExpression1654);
			init=variableInitialization();
			state._fsp--;
			if (state.failed) return n;
			match(input,BAR,FOLLOW_BAR_in_iterateExpression1656); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_iterateExpression1664);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression1670); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, nExp); }
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
	// OCL.g:430:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
	public final OCLParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		OCLParser.operationExpression_return retval = new OCLParser.operationExpression_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTExpression rolename =null;
		ASTExpression e =null;

		try {
			// OCL.g:432:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
			// OCL.g:433:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression1714); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }
			// OCL.g:439:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==LBRACK) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// OCL.g:439:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression1736); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operationExpression1749);
					rolename=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }
					// OCL.g:441:9: ( COMMA rolename= expression )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COMMA) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// OCL.g:441:10: COMMA rolename= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_operationExpression1762); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression1766);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }
							}
							break;

						default :
							break loop25;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression1778); if (state.failed) return retval;
					// OCL.g:444:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==LBRACK) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// OCL.g:444:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression1795); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression1810);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }
							// OCL.g:446:11: ( COMMA rolename= expression )*
							loop26:
							while (true) {
								int alt26=2;
								int LA26_0 = input.LA(1);
								if ( (LA26_0==COMMA) ) {
									alt26=1;
								}

								switch (alt26) {
								case 1 :
									// OCL.g:446:12: COMMA rolename= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression1825); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression1829);
									rolename=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }
									}
									break;

								default :
									break loop26;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression1843); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			// OCL.g:451:5: ( AT 'pre' )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==AT) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// OCL.g:451:7: AT 'pre'
					{
					match(input,AT,FOLLOW_AT_in_operationExpression1868); if (state.failed) return retval;
					match(input,73,FOLLOW_73_in_operationExpression1870); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.setIsPre(); }
					}
					break;

			}

			// OCL.g:453:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==LPAREN) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// OCL.g:454:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression1895); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.hasParentheses(); }
					// OCL.g:455:7: (e= expression ( COMMA e= expression )* )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==AT||LA31_0==HASH||(LA31_0 >= IDENT && LA31_0 <= INT)||(LA31_0 >= LPAREN && LA31_0 <= MINUS)||LA31_0==PLUS||LA31_0==REAL||(LA31_0 >= STAR && LA31_0 <= STRING)||(LA31_0 >= 44 && LA31_0 <= 50)||(LA31_0 >= 57 && LA31_0 <= 58)||(LA31_0 >= 61 && LA31_0 <= 71)||(LA31_0 >= 74 && LA31_0 <= 75)||LA31_0==77) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// OCL.g:456:7: e= expression ( COMMA e= expression )*
							{
							pushFollow(FOLLOW_expression_in_operationExpression1916);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addArg(e); }
							// OCL.g:457:7: ( COMMA e= expression )*
							loop30:
							while (true) {
								int alt30=2;
								int LA30_0 = input.LA(1);
								if ( (LA30_0==COMMA) ) {
									alt30=1;
								}

								switch (alt30) {
								case 1 :
									// OCL.g:457:9: COMMA e= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression1928); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression1932);
									e=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addArg(e); }
									}
									break;

								default :
									break loop30;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression1952); if (state.failed) return retval;
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
	// OCL.g:464:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN ;
	public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTInStateExpression n = null;


		Token s=null;

		 Token opToken = null; 
		try {
			// OCL.g:467:4: ( ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN )
			// OCL.g:468:4: ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2013); if (state.failed) return n;
			s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2022); if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2027); if (state.failed) return n;
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
	// OCL.g:481:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
	public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTTypeArgExpression n = null;


		ASTType t =null;

		 Token opToken = null; 
		try {
			// OCL.g:484:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
			// OCL.g:485:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( input.LA(1)==65||(input.LA(1) >= 69 && input.LA(1) <= 70)||(input.LA(1) >= 74 && input.LA(1) <= 75) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2087); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_typeExpression2091);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2093); if (state.failed) return n;
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
	// OCL.g:496:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
	public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
		ASTElemVarsDeclaration n = null;


		Token var1=null;
		Token varN=null;
		ASTType t =null;
		ASTType tN =null;

		try {
			// OCL.g:497:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
			// OCL.g:498:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
			{
			if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }
			var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2131); if (state.failed) return n;
			// OCL.g:499:17: ( COLON t= type )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COLON) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// OCL.g:499:18: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2134); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_elemVarsDeclaration2138);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}
			// OCL.g:500:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==COMMA) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// OCL.g:500:5: COMMA varN= IDENT ( COLON tN= type )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2148); if (state.failed) return n;
					varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2154); if (state.failed) return n;
					// OCL.g:500:24: ( COLON tN= type )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==COLON) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// OCL.g:500:25: COLON tN= type
							{
							match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2157); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_elemVarsDeclaration2163);
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
	// $ANTLR end "elemVarsDeclaration"



	// $ANTLR start "variableInitialization"
	// OCL.g:508:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
	public final ASTVariableInitialization variableInitialization() throws RecognitionException {
		ASTVariableInitialization n = null;


		Token name=null;
		ASTType t =null;
		ASTExpression e =null;

		try {
			// OCL.g:509:5: (name= IDENT COLON t= type EQUAL e= expression )
			// OCL.g:510:5: name= IDENT COLON t= type EQUAL e= expression
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2191); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableInitialization2193); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableInitialization2197);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2199); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_variableInitialization2203);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, e); }
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
	// OCL.g:519:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
	public final ASTExpression ifExpression() throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTExpression cond =null;
		ASTExpression t =null;
		ASTExpression e =null;

		try {
			// OCL.g:520:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
			// OCL.g:521:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
			{
			i=(Token)match(input,58,FOLLOW_58_in_ifExpression2235); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression2239);
			cond=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,76,FOLLOW_76_in_ifExpression2241); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression2245);
			t=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,55,FOLLOW_55_in_ifExpression2247); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression2251);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,56,FOLLOW_56_in_ifExpression2253); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIfExpression(i, cond, t, e); }
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
	// OCL.g:540:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
			// OCL.g:541:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
			int alt36=12;
			switch ( input.LA(1) ) {
			case 77:
				{
				alt36=1;
				}
				break;
			case 57:
				{
				alt36=2;
				}
				break;
			case INT:
				{
				alt36=3;
				}
				break;
			case REAL:
				{
				alt36=4;
				}
				break;
			case STRING:
				{
				alt36=5;
				}
				break;
			case HASH:
				{
				alt36=6;
				}
				break;
			case IDENT:
				{
				alt36=7;
				}
				break;
			case 44:
			case 46:
			case 47:
			case 48:
				{
				int LA36_8 = input.LA(2);
				if ( (LA36_8==LPAREN) ) {
					alt36=9;
				}
				else if ( (LA36_8==LBRACE) ) {
					alt36=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 45:
			case 66:
				{
				alt36=9;
				}
				break;
			case 50:
			case 64:
			case 71:
				{
				alt36=10;
				}
				break;
			case 49:
				{
				alt36=11;
				}
				break;
			case STAR:
				{
				alt36=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// OCL.g:542:7: t= 'true'
					{
					t=(Token)match(input,77,FOLLOW_77_in_literal2292); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }
					}
					break;
				case 2 :
					// OCL.g:543:7: f= 'false'
					{
					f=(Token)match(input,57,FOLLOW_57_in_literal2306); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }
					}
					break;
				case 3 :
					// OCL.g:544:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_literal2319); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }
					}
					break;
				case 4 :
					// OCL.g:545:7: r= REAL
					{
					r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2334); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }
					}
					break;
				case 5 :
					// OCL.g:546:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2348); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }
					}
					break;
				case 6 :
					// OCL.g:547:7: HASH enumLit= IDENT
					{
					match(input,HASH,FOLLOW_HASH_in_literal2358); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2362); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}
					}
					break;
				case 7 :
					// OCL.g:548:7: enumName= IDENT '::' enumLit= IDENT
					{
					enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2374); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2376); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2380); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }
					}
					break;
				case 8 :
					// OCL.g:549:7: nColIt= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_literal2392);
					nColIt=collectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nColIt; }
					}
					break;
				case 9 :
					// OCL.g:550:7: nEColIt= emptyCollectionLiteral
					{
					pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2404);
					nEColIt=emptyCollectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nEColIt; }
					}
					break;
				case 10 :
					// OCL.g:551:7: nUndLit= undefinedLiteral
					{
					pushFollow(FOLLOW_undefinedLiteral_in_literal2416);
					nUndLit=undefinedLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nUndLit; }
					}
					break;
				case 11 :
					// OCL.g:552:7: nTupleLit= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_literal2428);
					nTupleLit=tupleLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nTupleLit; }
					}
					break;
				case 12 :
					// OCL.g:553:7: un= STAR
					{
					un=(Token)match(input,STAR,FOLLOW_STAR_in_literal2440); if (state.failed) return n;
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
	// OCL.g:561:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
	public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
		ASTCollectionLiteral n = null;


		ASTCollectionItem ci =null;

		 Token op = null; 
		try {
			// OCL.g:563:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
			// OCL.g:564:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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
			match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2507); if (state.failed) return n;
			// OCL.g:568:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==AT||LA38_0==HASH||(LA38_0 >= IDENT && LA38_0 <= INT)||(LA38_0 >= LPAREN && LA38_0 <= MINUS)||LA38_0==PLUS||LA38_0==REAL||(LA38_0 >= STAR && LA38_0 <= STRING)||(LA38_0 >= 44 && LA38_0 <= 50)||(LA38_0 >= 57 && LA38_0 <= 58)||(LA38_0 >= 61 && LA38_0 <= 71)||(LA38_0 >= 74 && LA38_0 <= 75)||LA38_0==77) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// OCL.g:569:7: ci= collectionItem ( COMMA ci= collectionItem )*
					{
					pushFollow(FOLLOW_collectionItem_in_collectionLiteral2524);
					ci=collectionItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addItem(ci); }
					// OCL.g:570:7: ( COMMA ci= collectionItem )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==COMMA) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// OCL.g:570:9: COMMA ci= collectionItem
							{
							match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2537); if (state.failed) return n;
							pushFollow(FOLLOW_collectionItem_in_collectionLiteral2541);
							ci=collectionItem();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addItem(ci); }
							}
							break;

						default :
							break loop37;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2560); if (state.failed) return n;
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
	// OCL.g:579:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
	public final ASTCollectionItem collectionItem() throws RecognitionException {
		ASTCollectionItem n = null;


		ASTExpression e =null;

		 n = new ASTCollectionItem(); 
		try {
			// OCL.g:581:5: (e= expression ( DOTDOT e= expression )? )
			// OCL.g:582:5: e= expression ( DOTDOT e= expression )?
			{
			pushFollow(FOLLOW_expression_in_collectionItem2589);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setFirst(e); }
			// OCL.g:583:5: ( DOTDOT e= expression )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==DOTDOT) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// OCL.g:583:7: DOTDOT e= expression
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem2600); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_collectionItem2604);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setSecond(e); }
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
	// OCL.g:593:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
	public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
		ASTEmptyCollectionLiteral n = null;


		ASTCollectionType t =null;

		try {
			// OCL.g:594:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==66) ) {
				alt40=1;
			}
			else if ( ((LA40_0 >= 44 && LA40_0 <= 48)) ) {
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
					// OCL.g:595:5: 'oclEmpty' LPAREN t= collectionType RPAREN
					{
					match(input,66,FOLLOW_66_in_emptyCollectionLiteral2633); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral2635); if (state.failed) return n;
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2639);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral2641); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;
				case 2 :
					// OCL.g:598:5: t= collectionType LBRACE RBRACE
					{
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2657);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral2659); if (state.failed) return n;
					match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral2661); if (state.failed) return n;
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
	// OCL.g:609:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
	public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
		ASTUndefinedLiteral n = null;


		ASTType t =null;

		try {
			// OCL.g:610:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
			int alt41=4;
			switch ( input.LA(1) ) {
			case 71:
				{
				alt41=1;
				}
				break;
			case 50:
				{
				alt41=2;
				}
				break;
			case 64:
				{
				int LA41_3 = input.LA(2);
				if ( (LA41_3==LPAREN) ) {
					alt41=3;
				}
				else if ( (LA41_3==EOF||LA41_3==ARROW||LA41_3==BAR||(LA41_3 >= COMMA && LA41_3 <= EQUAL)||(LA41_3 >= GREATER && LA41_3 <= GREATER_EQUAL)||(LA41_3 >= LESS && LA41_3 <= LESS_EQUAL)||LA41_3==MINUS||(LA41_3 >= NOT_EQUAL && LA41_3 <= PLUS)||(LA41_3 >= RBRACE && LA41_3 <= RBRACK)||LA41_3==RPAREN||LA41_3==SLASH||LA41_3==STAR||LA41_3==52||(LA41_3 >= 54 && LA41_3 <= 56)||(LA41_3 >= 59 && LA41_3 <= 60)||LA41_3==72||LA41_3==76||LA41_3==78) ) {
					alt41=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 3, input);
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
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// OCL.g:611:5: 'oclUndefined' LPAREN t= type RPAREN
					{
					match(input,71,FOLLOW_71_in_undefinedLiteral2691); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral2693); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral2697);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral2699); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 2 :
					// OCL.g:614:5: 'Undefined'
					{
					match(input,50,FOLLOW_50_in_undefinedLiteral2713); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;
				case 3 :
					// OCL.g:617:5: 'null' LPAREN t= type RPAREN
					{
					match(input,64,FOLLOW_64_in_undefinedLiteral2727); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral2729); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral2733);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral2735); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 4 :
					// OCL.g:620:5: 'null'
					{
					match(input,64,FOLLOW_64_in_undefinedLiteral2749); if (state.failed) return n;
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
	// OCL.g:630:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
	public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
		ASTTupleLiteral n = null;


		ASTTupleItem ti =null;

		 List tiList = new ArrayList(); 
		try {
			// OCL.g:632:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
			// OCL.g:633:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
			{
			match(input,49,FOLLOW_49_in_tupleLiteral2788); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral2794); if (state.failed) return n;
			pushFollow(FOLLOW_tupleItem_in_tupleLiteral2802);
			ti=tupleItem();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tiList.add(ti); }
			// OCL.g:636:5: ( COMMA ti= tupleItem )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==COMMA) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// OCL.g:636:7: COMMA ti= tupleItem
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral2813); if (state.failed) return n;
					pushFollow(FOLLOW_tupleItem_in_tupleLiteral2817);
					ti=tupleItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tiList.add(ti); }
					}
					break;

				default :
					break loop42;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral2828); if (state.failed) return n;
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
	// OCL.g:644:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
	public final ASTTupleItem tupleItem() throws RecognitionException {
		ASTTupleItem n = null;


		Token name=null;
		ASTType t =null;
		ASTExpression e =null;

		try {
			// OCL.g:645:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
			// OCL.g:646:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem2859); if (state.failed) return n;
			// OCL.g:647:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==COLON) ) {
				int LA43_1 = input.LA(2);
				if ( (synpred1_OCL()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

			}
			else if ( (LA43_0==EQUAL) ) {
				alt43=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// OCL.g:650:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
					{
					match(input,COLON,FOLLOW_COLON_in_tupleItem2898); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_tupleItem2902);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem2904); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_tupleItem2908);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }
					}
					break;
				case 2 :
					// OCL.g:653:7: ( COLON | EQUAL ) e= expression
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
					pushFollow(FOLLOW_expression_in_tupleItem2940);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, e); }
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
	// OCL.g:664:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
	public final ASTType type() throws RecognitionException {
		ASTType n = null;


		ASTSimpleType nTSimple =null;
		ASTCollectionType nTCollection =null;
		ASTTupleType nTTuple =null;

		 Token tok = null; 
		try {
			// OCL.g:666:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
			// OCL.g:667:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }
			// OCL.g:668:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			int alt44=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt44=1;
				}
				break;
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
				{
				alt44=2;
				}
				break;
			case 49:
				{
				alt44=3;
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
					// OCL.g:669:7: nTSimple= simpleType
					{
					pushFollow(FOLLOW_simpleType_in_type3006);
					nTSimple=simpleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 2 :
					// OCL.g:670:7: nTCollection= collectionType
					{
					pushFollow(FOLLOW_collectionType_in_type3018);
					nTCollection=collectionType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 3 :
					// OCL.g:671:7: nTTuple= tupleType
					{
					pushFollow(FOLLOW_tupleType_in_type3030);
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
	// OCL.g:676:1: typeOnly returns [ASTType n] : nT= type EOF ;
	public final ASTType typeOnly() throws RecognitionException {
		ASTType n = null;


		ASTType nT =null;

		try {
			// OCL.g:677:5: (nT= type EOF )
			// OCL.g:678:5: nT= type EOF
			{
			pushFollow(FOLLOW_type_in_typeOnly3062);
			nT=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_typeOnly3064); if (state.failed) return n;
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
	// OCL.g:688:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
	public final ASTSimpleType simpleType() throws RecognitionException {
		ASTSimpleType n = null;


		Token name=null;

		try {
			// OCL.g:689:5: (name= IDENT )
			// OCL.g:690:5: name= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3092); if (state.failed) return n;
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
	// OCL.g:698:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
	public final ASTCollectionType collectionType() throws RecognitionException {
		ASTCollectionType n = null;


		ASTType elemType =null;

		 Token op = null; 
		try {
			// OCL.g:700:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
			// OCL.g:701:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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
			match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3157); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_collectionType3161);
			elemType=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3163); if (state.failed) return n;
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
	// OCL.g:711:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
	public final ASTTupleType tupleType() throws RecognitionException {
		ASTTupleType n = null;


		ASTTuplePart tp =null;

		 List tpList = new ArrayList(); 
		try {
			// OCL.g:713:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
			// OCL.g:714:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
			{
			match(input,49,FOLLOW_49_in_tupleType3197); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3199); if (state.failed) return n;
			pushFollow(FOLLOW_tuplePart_in_tupleType3208);
			tp=tuplePart();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tpList.add(tp); }
			// OCL.g:716:5: ( COMMA tp= tuplePart )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==COMMA) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// OCL.g:716:7: COMMA tp= tuplePart
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleType3219); if (state.failed) return n;
					pushFollow(FOLLOW_tuplePart_in_tupleType3223);
					tp=tuplePart();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tpList.add(tp); }
					}
					break;

				default :
					break loop45;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3235); if (state.failed) return n;
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
	// OCL.g:725:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
	public final ASTTuplePart tuplePart() throws RecognitionException {
		ASTTuplePart n = null;


		Token name=null;
		ASTType t =null;

		try {
			// OCL.g:726:5: (name= IDENT COLON t= type )
			// OCL.g:727:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3267); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_tuplePart3269); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_tuplePart3273);
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

	// $ANTLR start synpred1_OCL
	public final void synpred1_OCL_fragment() throws RecognitionException {
		// OCL.g:650:7: ( COLON type EQUAL )
		// OCL.g:650:8: COLON type EQUAL
		{
		match(input,COLON,FOLLOW_COLON_in_synpred1_OCL2889); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred1_OCL2891);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_OCL2893); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_OCL

	// Delegated rules

	public final boolean synpred1_OCL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_OCL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_expression_in_expressionOnly67 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expressionOnly69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_expression117 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression128 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression132 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_expression136 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression141 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_expression145 = new BitSet(new long[]{0x1000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_expression183 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_expression195 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression199 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_expression203 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression208 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_expression212 = new BitSet(new long[]{0x1000000000000400L});
	public static final BitSet FOLLOW_60_in_expression253 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramList302 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList319 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_paramList331 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList335 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_paramList355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idList384 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_idList394 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_idList398 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration429 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration431 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression471 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_conditionalImpliesExpression484 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression488 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_conditionalOrExpression546 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conditionalXOrExpression607 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression655 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_52_in_conditionalAndExpression668 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression672 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression720 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_set_in_equalityExpression739 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression749 = new BitSet(new long[]{0x0000000040002002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression798 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_set_in_relationalExpression816 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression834 = new BitSet(new long[]{0x0000000001818002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression884 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression902 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression912 = new BitSet(new long[]{0x0000000084000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression962 = new BitSet(new long[]{0x0040014000000002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression980 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression994 = new BitSet(new long[]{0x0040014000000002L});
	public static final BitSet FOLLOW_set_in_unaryExpression1056 = new BitSet(new long[]{0xA607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1133 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_ARROW_in_postfixExpression1151 = new BitSet(new long[]{0x2000000000080000L,0x0000000000000C7AL});
	public static final BitSet FOLLOW_DOT_in_postfixExpression1157 = new BitSet(new long[]{0x2000000000080000L,0x0000000000000C7AL});
	public static final BitSet FOLLOW_propertyCall_in_postfixExpression1168 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_literal_in_primaryExpression1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectReference_in_primaryExpression1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyCall_in_primaryExpression1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression1245 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_primaryExpression1249 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_primaryExpression1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression1275 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression1277 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_primaryExpression1279 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression1302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_primaryExpression1304 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression1322 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression1337 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression1339 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_primaryExpression1341 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression1345 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_primaryExpression1349 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression1351 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_primaryExpression1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_objectReference1399 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_objectReference1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryExpression_in_propertyCall1472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterateExpression_in_propertyCall1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationExpression_in_propertyCall1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeExpression_in_propertyCall1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inStateExpression_in_propertyCall1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_queryExpression1559 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_queryExpression1566 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression1577 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_queryExpression1581 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_queryExpression1592 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_queryExpression1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_iterateExpression1630 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_iterateExpression1636 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression1644 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterateExpression1646 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_variableInitialization_in_iterateExpression1654 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_iterateExpression1656 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_iterateExpression1664 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterateExpression1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_operationExpression1714 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression1736 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_operationExpression1749 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression1762 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_operationExpression1766 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression1778 = new BitSet(new long[]{0x0000000002400022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression1795 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_operationExpression1810 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression1825 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_operationExpression1829 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression1843 = new BitSet(new long[]{0x0000000002000022L});
	public static final BitSet FOLLOW_AT_in_operationExpression1868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_operationExpression1870 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LPAREN_in_operationExpression1895 = new BitSet(new long[]{0xE607F318861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_operationExpression1916 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression1928 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_operationExpression1932 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_operationExpression1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inStateExpression2000 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_inStateExpression2013 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_inStateExpression2022 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_inStateExpression2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeExpression2063 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_typeExpression2087 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_typeExpression2091 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_typeExpression2093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2131 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2134 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration2138 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2148 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2154 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2157 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration2163 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableInitialization2191 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableInitialization2193 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_variableInitialization2197 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_variableInitialization2199 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_variableInitialization2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_ifExpression2235 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_ifExpression2239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_ifExpression2241 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_ifExpression2245 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ifExpression2247 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_ifExpression2251 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ifExpression2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_literal2292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_literal2306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal2319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_literal2334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal2348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_literal2358 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_literal2374 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_literal2376 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENT_in_literal2380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_literal2392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_undefinedLiteral_in_literal2416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_literal2428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_literal2440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionLiteral2478 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2507 = new BitSet(new long[]{0xE607F30A861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2524 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_collectionLiteral2537 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2541 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_collectionItem2589 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_collectionItem2600 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_collectionItem2604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_emptyCollectionLiteral2633 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral2635 = new BitSet(new long[]{0x0001F00000000000L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2639 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral2641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2657 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral2659 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_undefinedLiteral2691 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral2693 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral2697 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral2699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_undefinedLiteral2713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_undefinedLiteral2727 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral2729 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral2733 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral2735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_undefinedLiteral2749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_tupleLiteral2788 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LBRACE_in_tupleLiteral2794 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral2802 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleLiteral2813 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral2817 = new BitSet(new long[]{0x0000000200000400L});
	public static final BitSet FOLLOW_RBRACE_in_tupleLiteral2828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tupleItem2859 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_tupleItem2898 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_tupleItem2902 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_tupleItem2904 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_tupleItem2908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_tupleItem2930 = new BitSet(new long[]{0xE607F308861A0020L,0x0000000000002CFFL});
	public static final BitSet FOLLOW_expression_in_tupleItem2940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type3006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_type3018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleType_in_type3030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOnly3062 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_typeOnly3064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simpleType3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionType3130 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_collectionType3157 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_collectionType3161 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RPAREN_in_collectionType3163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_tupleType3197 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_tupleType3199 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType3208 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleType3219 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType3223 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_RPAREN_in_tupleType3235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tuplePart3267 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_tuplePart3269 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_tuplePart3273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_synpred1_OCL2889 = new BitSet(new long[]{0x0003F00000080000L});
	public static final BitSet FOLLOW_type_in_synpred1_OCL2891 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred1_OCL2893 = new BitSet(new long[]{0x0000000000000002L});
}
