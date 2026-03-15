// $ANTLR 3.5.2 Generator.g 2026-03-15 21:43:54
 
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

package org.tzi.use.parser.generator;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.statemachines.*;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class GeneratorParser extends BaseParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", 
		"COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", 
		"FLOAT", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", 
		"LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", 
		"NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", 
		"RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", 
		"VOCAB", "WS", "'ASSLCall'", "'Bag'", "'Barrier'", "'Collection'", "'OpEnter'", 
		"'OpExit'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", 
		"'abstract'", "'allInstances'", "'and'", "'associationClass'", "'associationclass'", 
		"'attributes'", "'begin'", "'between'", "'byUseId'", "'constraints'", 
		"'context'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", 
		"'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", 
		"'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", 
		"'inv'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", 
		"'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsInState'", "'oclIsKindOf'", 
		"'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", 
		"'post'", "'pre'", "'procedure'", "'psm'", "'redefines'", "'selectByKind'", 
		"'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", 
		"'transitions'", "'true'", "'var'", "'while'", "'xor'"
	};
	public static final int EOF=-1;
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
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
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
	public static final int FLOAT=15;
	public static final int GREATER=16;
	public static final int GREATER_EQUAL=17;
	public static final int HASH=18;
	public static final int HEX_DIGIT=19;
	public static final int IDENT=20;
	public static final int INT=21;
	public static final int LBRACE=22;
	public static final int LBRACK=23;
	public static final int LESS=24;
	public static final int LESS_EQUAL=25;
	public static final int LPAREN=26;
	public static final int MINUS=27;
	public static final int ML_COMMENT=28;
	public static final int NEWLINE=29;
	public static final int NON_OCL_STRING=30;
	public static final int NOT_EQUAL=31;
	public static final int PLUS=32;
	public static final int RANGE_OR_INT=33;
	public static final int RBRACE=34;
	public static final int RBRACK=35;
	public static final int REAL=36;
	public static final int RPAREN=37;
	public static final int SEMI=38;
	public static final int SLASH=39;
	public static final int SL_COMMENT=40;
	public static final int STAR=41;
	public static final int STRING=42;
	public static final int VOCAB=43;
	public static final int WS=44;

	// delegates
	public BaseParser[] getDelegates() {
		return new BaseParser[] {};
	}

	// delegators


	public GeneratorParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GeneratorParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GeneratorParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Generator.g"; }



	// $ANTLR start "invariantListOnly"
	// Generator.g:79:1: invariantListOnly returns [List<ASTConstraintDefinition> invariantList] : (def= invariant )* EOF ;
	public final List<ASTConstraintDefinition> invariantListOnly() throws RecognitionException {
		List<ASTConstraintDefinition> invariantList = null;


		ASTConstraintDefinition def =null;

		 invariantList = new ArrayList<ASTConstraintDefinition>(); 
		try {
			// Generator.g:81:5: ( (def= invariant )* EOF )
			// Generator.g:82:5: (def= invariant )* EOF
			{
			// Generator.g:82:5: (def= invariant )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==66) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Generator.g:82:7: def= invariant
					{
					pushFollow(FOLLOW_invariant_in_invariantListOnly80);
					def=invariant();
					state._fsp--;
					if (state.failed) return invariantList;
					if ( state.backtracking==0 ) { invariantList.add(def); }
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_invariantListOnly91); if (state.failed) return invariantList;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return invariantList;
	}
	// $ANTLR end "invariantListOnly"



	// $ANTLR start "procedureListOnly"
	// Generator.g:136:1: procedureListOnly returns [List<ASTGProcedure> procedureList] : (proc= procedure )* EOF ;
	public final List<ASTGProcedure> procedureListOnly() throws RecognitionException {
		List<ASTGProcedure> procedureList = null;


		ASTGProcedure proc =null;

		 procedureList = new ArrayList<ASTGProcedure>(); 
		try {
			// Generator.g:138:5: ( (proc= procedure )* EOF )
			// Generator.g:139:5: (proc= procedure )* EOF
			{
			// Generator.g:139:5: (proc= procedure )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==105) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Generator.g:140:7: proc= procedure
					{
					pushFollow(FOLLOW_procedure_in_procedureListOnly136);
					proc=procedure();
					state._fsp--;
					if (state.failed) return procedureList;
					if ( state.backtracking==0 ) { procedureList.add(proc); }
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_procedureListOnly151); if (state.failed) return procedureList;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return procedureList;
	}
	// $ANTLR end "procedureListOnly"



	// $ANTLR start "procedure"
	// Generator.g:151:1: procedure returns [ASTGProcedure proc] : 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI ;
	public final ASTGProcedure procedure() throws RecognitionException {
		ASTGProcedure proc = null;


		Token name=null;
		List parameterDecls =null;
		List localDecls =null;
		List instructions =null;

		 localDecls = new ArrayList(); 
		try {
			// Generator.g:153:5: ( 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI )
			// Generator.g:154:5: 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI
			{
			match(input,105,FOLLOW_105_in_procedure179); if (state.failed) return proc;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure183); if (state.failed) return proc;
			match(input,LPAREN,FOLLOW_LPAREN_in_procedure185); if (state.failed) return proc;
			pushFollow(FOLLOW_variableDeclarationList_in_procedure189);
			parameterDecls=variableDeclarationList();
			state._fsp--;
			if (state.failed) return proc;
			match(input,RPAREN,FOLLOW_RPAREN_in_procedure191); if (state.failed) return proc;
			// Generator.g:155:5: ( 'var' localDecls= variableDeclarationList SEMI )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==116) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Generator.g:155:7: 'var' localDecls= variableDeclarationList SEMI
					{
					match(input,116,FOLLOW_116_in_procedure199); if (state.failed) return proc;
					pushFollow(FOLLOW_variableDeclarationList_in_procedure203);
					localDecls=variableDeclarationList();
					state._fsp--;
					if (state.failed) return proc;
					match(input,SEMI,FOLLOW_SEMI_in_procedure205); if (state.failed) return proc;
					}
					break;

			}

			match(input,62,FOLLOW_62_in_procedure214); if (state.failed) return proc;
			pushFollow(FOLLOW_instructionList_in_procedure218);
			instructions=instructionList();
			state._fsp--;
			if (state.failed) return proc;
			match(input,74,FOLLOW_74_in_procedure220); if (state.failed) return proc;
			match(input,SEMI,FOLLOW_SEMI_in_procedure222); if (state.failed) return proc;
			if ( state.backtracking==0 ) { proc = new ASTGProcedure(name, parameterDecls, localDecls, instructions ); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return proc;
	}
	// $ANTLR end "procedure"



	// $ANTLR start "variableDeclarationList"
	// Generator.g:164:1: variableDeclarationList returns [List varDecls] : (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? ;
	public final List variableDeclarationList() throws RecognitionException {
		List varDecls = null;


		ASTVariableDeclaration decl =null;

		 varDecls = new ArrayList(); 
		try {
			// Generator.g:166:5: ( (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? )
			// Generator.g:167:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
			{
			// Generator.g:167:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IDENT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Generator.g:167:7: decl= variableDeclaration ( COMMA decl= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList260);
					decl=variableDeclaration();
					state._fsp--;
					if (state.failed) return varDecls;
					if ( state.backtracking==0 ) {varDecls.add(decl);}
					// Generator.g:168:7: ( COMMA decl= variableDeclaration )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Generator.g:168:8: COMMA decl= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_variableDeclarationList271); if (state.failed) return varDecls;
							pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList275);
							decl=variableDeclaration();
							state._fsp--;
							if (state.failed) return varDecls;
							if ( state.backtracking==0 ) {varDecls.add(decl);}
							}
							break;

						default :
							break loop4;
						}
					}

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
		return varDecls;
	}
	// $ANTLR end "variableDeclarationList"



	// $ANTLR start "instructionList"
	// Generator.g:176:1: instructionList returns [List instructions] : (instr= instruction SEMI )* ;
	public final List instructionList() throws RecognitionException {
		List instructions = null;


		ASTGInstruction instr =null;

		 instructions = new ArrayList(); 
		try {
			// Generator.g:178:5: ( (instr= instruction SEMI )* )
			// Generator.g:179:5: (instr= instruction SEMI )*
			{
			// Generator.g:179:5: (instr= instruction SEMI )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==IDENT||LA6_0==LBRACK||LA6_0==45||LA6_0==47||(LA6_0 >= 49 && LA6_0 <= 50)||LA6_0==79||LA6_0==81) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Generator.g:179:7: instr= instruction SEMI
					{
					pushFollow(FOLLOW_instruction_in_instructionList319);
					instr=instruction();
					state._fsp--;
					if (state.failed) return instructions;
					match(input,SEMI,FOLLOW_SEMI_in_instructionList321); if (state.failed) return instructions;
					if ( state.backtracking==0 ) {instructions.add(instr);}
					}
					break;

				default :
					break loop6;
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
		return instructions;
	}
	// $ANTLR end "instructionList"



	// $ANTLR start "instruction"
	// Generator.g:194:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier );
	public final ASTGInstruction instruction() throws RecognitionException {
		ASTGInstruction instr = null;


		ASTGVariableAssignment instrVA =null;
		ASTGAttributeAssignment instrAA =null;
		ASTGLoop instrLO =null;
		ASTGAtomicInstruction instrAI =null;
		ASTGIfThenElse instrIT =null;
		ASTGAsslCall instrAC =null;
		ASTGOpEnter instrOE =null;
		ASTGOpExit instrOX =null;
		ASTGBarrier instrBA =null;

		try {
			// Generator.g:195:7: (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier )
			int alt7=9;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA7_1 = input.LA(2);
				if ( (LA7_1==COLON_EQUAL) ) {
					alt7=1;
				}
				else if ( (LA7_1==LPAREN) ) {
					alt7=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return instr;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LBRACK:
				{
				alt7=2;
				}
				break;
			case 79:
				{
				alt7=3;
				}
				break;
			case 81:
				{
				alt7=5;
				}
				break;
			case 45:
				{
				alt7=6;
				}
				break;
			case 49:
				{
				alt7=7;
				}
				break;
			case 50:
				{
				alt7=8;
				}
				break;
			case 47:
				{
				alt7=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return instr;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// Generator.g:196:7: instrVA= variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction356);
					instrVA=variableAssignment();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrVA;}
					}
					break;
				case 2 :
					// Generator.g:197:7: instrAA= attributeAssignment
					{
					pushFollow(FOLLOW_attributeAssignment_in_instruction371);
					instrAA=attributeAssignment();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrAA;}
					}
					break;
				case 3 :
					// Generator.g:198:7: instrLO= loop
					{
					pushFollow(FOLLOW_loop_in_instruction385);
					instrLO=loop();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrLO;}
					}
					break;
				case 4 :
					// Generator.g:199:7: instrAI= atomicInstruction
					{
					pushFollow(FOLLOW_atomicInstruction_in_instruction402);
					instrAI=atomicInstruction();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrAI;}
					}
					break;
				case 5 :
					// Generator.g:200:7: instrIT= ifThenElse
					{
					pushFollow(FOLLOW_ifThenElse_in_instruction416);
					instrIT=ifThenElse();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrIT;}
					}
					break;
				case 6 :
					// Generator.g:201:7: instrAC= asslCall
					{
					pushFollow(FOLLOW_asslCall_in_instruction432);
					instrAC=asslCall();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrAC;}
					}
					break;
				case 7 :
					// Generator.g:202:7: instrOE= opEnter
					{
					pushFollow(FOLLOW_opEnter_in_instruction448);
					instrOE=opEnter();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrOE;}
					}
					break;
				case 8 :
					// Generator.g:203:7: instrOX= opExit
					{
					pushFollow(FOLLOW_opExit_in_instruction465);
					instrOX=opExit();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrOX;}
					}
					break;
				case 9 :
					// Generator.g:204:7: instrBA= barrier
					{
					pushFollow(FOLLOW_barrier_in_instruction482);
					instrBA=barrier();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) {instr = instrBA;}
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
		return instr;
	}
	// $ANTLR end "instruction"



	// $ANTLR start "variableAssignment"
	// Generator.g:211:1: variableAssignment returns [ASTGVariableAssignment assignment] : target= IDENT COLON_EQUAL source= valueInstruction ;
	public final ASTGVariableAssignment variableAssignment() throws RecognitionException {
		ASTGVariableAssignment assignment = null;


		Token target=null;
		ASTGValueInstruction source =null;

		try {
			// Generator.g:212:5: (target= IDENT COLON_EQUAL source= valueInstruction )
			// Generator.g:213:5: target= IDENT COLON_EQUAL source= valueInstruction
			{
			target=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableAssignment513); if (state.failed) return assignment;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_variableAssignment515); if (state.failed) return assignment;
			pushFollow(FOLLOW_valueInstruction_in_variableAssignment519);
			source=valueInstruction();
			state._fsp--;
			if (state.failed) return assignment;
			if ( state.backtracking==0 ) { assignment = new ASTGVariableAssignment( target, source ); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return assignment;
	}
	// $ANTLR end "variableAssignment"



	// $ANTLR start "attributeAssignment"
	// Generator.g:221:1: attributeAssignment returns [ASTGAttributeAssignment assignment] : targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction ;
	public final ASTGAttributeAssignment attributeAssignment() throws RecognitionException {
		ASTGAttributeAssignment assignment = null;


		Token attributeName=null;
		ASTGocl targetObject =null;
		ASTGValueInstruction source =null;

		try {
			// Generator.g:222:5: (targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction )
			// Generator.g:223:5: targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction
			{
			pushFollow(FOLLOW_oclExpression_in_attributeAssignment551);
			targetObject=oclExpression();
			state._fsp--;
			if (state.failed) return assignment;
			match(input,DOT,FOLLOW_DOT_in_attributeAssignment553); if (state.failed) return assignment;
			attributeName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeAssignment557); if (state.failed) return assignment;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attributeAssignment565); if (state.failed) return assignment;
			pushFollow(FOLLOW_valueInstruction_in_attributeAssignment569);
			source=valueInstruction();
			state._fsp--;
			if (state.failed) return assignment;
			if ( state.backtracking==0 ) { assignment = new ASTGAttributeAssignment(
						 targetObject, attributeName, source ); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return assignment;
	}
	// $ANTLR end "attributeAssignment"



	// $ANTLR start "loop"
	// Generator.g:233:1: loop returns [ASTGLoop loop] : t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' ;
	public final ASTGLoop loop() throws RecognitionException {
		ASTGLoop loop = null;


		Token t=null;
		ASTVariableDeclaration decl =null;
		ASTGocl sequence =null;
		List instructions =null;

		try {
			// Generator.g:234:5: (t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' )
			// Generator.g:235:5: t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end'
			{
			t=(Token)match(input,79,FOLLOW_79_in_loop601); if (state.failed) return loop;
			pushFollow(FOLLOW_variableDeclaration_in_loop605);
			decl=variableDeclaration();
			state._fsp--;
			if (state.failed) return loop;
			match(input,83,FOLLOW_83_in_loop607); if (state.failed) return loop;
			pushFollow(FOLLOW_oclExpression_in_loop611);
			sequence=oclExpression();
			state._fsp--;
			if (state.failed) return loop;
			match(input,62,FOLLOW_62_in_loop613); if (state.failed) return loop;
			pushFollow(FOLLOW_instructionList_in_loop624);
			instructions=instructionList();
			state._fsp--;
			if (state.failed) return loop;
			match(input,74,FOLLOW_74_in_loop626); if (state.failed) return loop;
			if ( state.backtracking==0 ) { loop = new ASTGLoop( decl, sequence, instructions, t ); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return loop;
	}
	// $ANTLR end "loop"



	// $ANTLR start "ifThenElse"
	// Generator.g:246:1: ifThenElse returns [ASTGIfThenElse ifThenElse] : token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? ;
	public final ASTGIfThenElse ifThenElse() throws RecognitionException {
		ASTGIfThenElse ifThenElse = null;


		Token token=null;
		ASTGocl sequence =null;
		List thenInstructions =null;
		List elseInstructions =null;

		 List elseInstructionsList = new ArrayList(); 
		try {
			// Generator.g:248:5: (token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? )
			// Generator.g:249:5: token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )?
			{
			token=(Token)match(input,81,FOLLOW_81_in_ifThenElse662); if (state.failed) return ifThenElse;
			pushFollow(FOLLOW_oclExpression_in_ifThenElse666);
			sequence=oclExpression();
			state._fsp--;
			if (state.failed) return ifThenElse;
			match(input,113,FOLLOW_113_in_ifThenElse677); if (state.failed) return ifThenElse;
			match(input,62,FOLLOW_62_in_ifThenElse679); if (state.failed) return ifThenElse;
			pushFollow(FOLLOW_instructionList_in_ifThenElse683);
			thenInstructions=instructionList();
			state._fsp--;
			if (state.failed) return ifThenElse;
			match(input,74,FOLLOW_74_in_ifThenElse685); if (state.failed) return ifThenElse;
			// Generator.g:251:9: ( 'else' 'begin' elseInstructions= instructionList 'end' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==73) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Generator.g:251:10: 'else' 'begin' elseInstructions= instructionList 'end'
					{
					match(input,73,FOLLOW_73_in_ifThenElse696); if (state.failed) return ifThenElse;
					match(input,62,FOLLOW_62_in_ifThenElse698); if (state.failed) return ifThenElse;
					pushFollow(FOLLOW_instructionList_in_ifThenElse702);
					elseInstructions=instructionList();
					state._fsp--;
					if (state.failed) return ifThenElse;
					match(input,74,FOLLOW_74_in_ifThenElse704); if (state.failed) return ifThenElse;
					if ( state.backtracking==0 ) { elseInstructionsList=elseInstructions; }
					}
					break;

			}

			if ( state.backtracking==0 ) { ifThenElse = new ASTGIfThenElse( sequence, thenInstructions,
			                elseInstructionsList, token ); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ifThenElse;
	}
	// $ANTLR end "ifThenElse"



	// $ANTLR start "valueInstruction"
	// Generator.g:260:1: valueInstruction returns [ASTGValueInstruction valueinstr] : (atmoicInstr= atomicInstruction |oclExpr= oclExpression );
	public final ASTGValueInstruction valueInstruction() throws RecognitionException {
		ASTGValueInstruction valueinstr = null;


		ASTGAtomicInstruction atmoicInstr =null;
		ASTGocl oclExpr =null;

		try {
			// Generator.g:261:7: (atmoicInstr= atomicInstruction |oclExpr= oclExpression )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENT) ) {
				alt9=1;
			}
			else if ( (LA9_0==LBRACK) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return valueinstr;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Generator.g:262:7: atmoicInstr= atomicInstruction
					{
					pushFollow(FOLLOW_atomicInstruction_in_valueInstruction744);
					atmoicInstr=atomicInstruction();
					state._fsp--;
					if (state.failed) return valueinstr;
					if ( state.backtracking==0 ) {valueinstr = atmoicInstr; }
					}
					break;
				case 2 :
					// Generator.g:263:7: oclExpr= oclExpression
					{
					pushFollow(FOLLOW_oclExpression_in_valueInstruction758);
					oclExpr=oclExpression();
					state._fsp--;
					if (state.failed) return valueinstr;
					if ( state.backtracking==0 ) {valueinstr = oclExpr; }
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
		return valueinstr;
	}
	// $ANTLR end "valueInstruction"



	// $ANTLR start "atomicInstruction"
	// Generator.g:271:1: atomicInstruction returns [ASTGAtomicInstruction instr] : name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN ;
	public final ASTGAtomicInstruction atomicInstruction() throws RecognitionException {
		ASTGAtomicInstruction instr = null;


		Token name=null;
		Object parameter =null;

		try {
			// Generator.g:272:5: (name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN )
			// Generator.g:273:5: name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomicInstruction788); if (state.failed) return instr;
			if ( state.backtracking==0 ) { instr = new ASTGAtomicInstruction(name); }
			match(input,LPAREN,FOLLOW_LPAREN_in_atomicInstruction792); if (state.failed) return instr;
			// Generator.g:274:9: (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IDENT||LA11_0==LBRACK) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Generator.g:274:11: parameter= instructionParameter ( COMMA parameter= instructionParameter )*
					{
					pushFollow(FOLLOW_instructionParameter_in_atomicInstruction806);
					parameter=instructionParameter();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) { instr.addParameter(parameter); }
					// Generator.g:275:13: ( COMMA parameter= instructionParameter )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==COMMA) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Generator.g:275:15: COMMA parameter= instructionParameter
							{
							match(input,COMMA,FOLLOW_COMMA_in_atomicInstruction824); if (state.failed) return instr;
							pushFollow(FOLLOW_instructionParameter_in_atomicInstruction828);
							parameter=instructionParameter();
							state._fsp--;
							if (state.failed) return instr;
							if ( state.backtracking==0 ) { instr.addParameter(parameter); }
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_atomicInstruction876); if (state.failed) return instr;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return instr;
	}
	// $ANTLR end "atomicInstruction"



	// $ANTLR start "asslCall"
	// Generator.g:286:1: asslCall returns [ASTGAsslCall instr] : 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
	public final ASTGAsslCall asslCall() throws RecognitionException {
		ASTGAsslCall instr = null;


		Token name=null;
		ASTGocl parameter =null;

		try {
			// Generator.g:287:5: ( 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
			// Generator.g:288:5: 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
			{
			match(input,45,FOLLOW_45_in_asslCall899); if (state.failed) return instr;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_asslCall903); if (state.failed) return instr;
			if ( state.backtracking==0 ) { instr = new ASTGAsslCall(name); }
			match(input,LPAREN,FOLLOW_LPAREN_in_asslCall907); if (state.failed) return instr;
			// Generator.g:289:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==LBRACK) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// Generator.g:289:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
					{
					pushFollow(FOLLOW_oclExpression_in_asslCall921);
					parameter=oclExpression();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) { instr.addParameter(parameter); }
					// Generator.g:290:13: ( COMMA parameter= oclExpression )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Generator.g:290:15: COMMA parameter= oclExpression
							{
							match(input,COMMA,FOLLOW_COMMA_in_asslCall939); if (state.failed) return instr;
							pushFollow(FOLLOW_oclExpression_in_asslCall943);
							parameter=oclExpression();
							state._fsp--;
							if (state.failed) return instr;
							if ( state.backtracking==0 ) { instr.addParameter(parameter); }
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_asslCall991); if (state.failed) return instr;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return instr;
	}
	// $ANTLR end "asslCall"



	// $ANTLR start "opEnter"
	// Generator.g:301:1: opEnter returns [ASTGOpEnter instr] : 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
	public final ASTGOpEnter opEnter() throws RecognitionException {
		ASTGOpEnter instr = null;


		Token opname=null;
		ASTGocl oid =null;
		ASTGocl parameter =null;

		try {
			// Generator.g:302:5: ( 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
			// Generator.g:303:5: 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
			{
			match(input,49,FOLLOW_49_in_opEnter1014); if (state.failed) return instr;
			pushFollow(FOLLOW_oclExpression_in_opEnter1018);
			oid=oclExpression();
			state._fsp--;
			if (state.failed) return instr;
			opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_opEnter1022); if (state.failed) return instr;
			if ( state.backtracking==0 ) { instr = new ASTGOpEnter(oid, opname); }
			match(input,LPAREN,FOLLOW_LPAREN_in_opEnter1026); if (state.failed) return instr;
			// Generator.g:304:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LBRACK) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Generator.g:304:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
					{
					pushFollow(FOLLOW_oclExpression_in_opEnter1041);
					parameter=oclExpression();
					state._fsp--;
					if (state.failed) return instr;
					if ( state.backtracking==0 ) { instr.addParameter(parameter); }
					// Generator.g:305:13: ( COMMA parameter= oclExpression )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==COMMA) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// Generator.g:305:15: COMMA parameter= oclExpression
							{
							match(input,COMMA,FOLLOW_COMMA_in_opEnter1059); if (state.failed) return instr;
							pushFollow(FOLLOW_oclExpression_in_opEnter1063);
							parameter=oclExpression();
							state._fsp--;
							if (state.failed) return instr;
							if ( state.backtracking==0 ) { instr.addParameter(parameter); }
							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_opEnter1111); if (state.failed) return instr;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return instr;
	}
	// $ANTLR end "opEnter"



	// $ANTLR start "opExit"
	// Generator.g:315:1: opExit returns [ASTGOpExit instr] : 'OpExit' ;
	public final ASTGOpExit opExit() throws RecognitionException {
		ASTGOpExit instr = null;


		try {
			// Generator.g:316:5: ( 'OpExit' )
			// Generator.g:317:5: 'OpExit'
			{
			match(input,50,FOLLOW_50_in_opExit1134); if (state.failed) return instr;
			if ( state.backtracking==0 ) { instr = new ASTGOpExit(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return instr;
	}
	// $ANTLR end "opExit"



	// $ANTLR start "instructionParameter"
	// Generator.g:323:1: instructionParameter returns [Object parameter] : (parameterOcl= oclExpression |parameterIdent= instrParameterIdent );
	public final Object instructionParameter() throws RecognitionException {
		Object parameter = null;


		ASTGocl parameterOcl =null;
		Token parameterIdent =null;

		try {
			// Generator.g:324:7: (parameterOcl= oclExpression |parameterIdent= instrParameterIdent )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LBRACK) ) {
				alt16=1;
			}
			else if ( (LA16_0==IDENT) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return parameter;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Generator.g:325:7: parameterOcl= oclExpression
					{
					pushFollow(FOLLOW_oclExpression_in_instructionParameter1163);
					parameterOcl=oclExpression();
					state._fsp--;
					if (state.failed) return parameter;
					if ( state.backtracking==0 ) {parameter = parameterOcl; }
					}
					break;
				case 2 :
					// Generator.g:326:7: parameterIdent= instrParameterIdent
					{
					pushFollow(FOLLOW_instrParameterIdent_in_instructionParameter1175);
					parameterIdent=instrParameterIdent();
					state._fsp--;
					if (state.failed) return parameter;
					if ( state.backtracking==0 ) {parameter = parameterIdent; }
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
		return parameter;
	}
	// $ANTLR end "instructionParameter"



	// $ANTLR start "instrParameterIdent"
	// Generator.g:333:1: instrParameterIdent returns [Token t] : i= IDENT ;
	public final Token instrParameterIdent() throws RecognitionException {
		Token t = null;


		Token i=null;

		try {
			// Generator.g:334:5: (i= IDENT )
			// Generator.g:335:5: i= IDENT
			{
			i=(Token)match(input,IDENT,FOLLOW_IDENT_in_instrParameterIdent1203); if (state.failed) return t;
			if ( state.backtracking==0 ) { t = i; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "instrParameterIdent"



	// $ANTLR start "oclExpression"
	// Generator.g:342:1: oclExpression returns [ASTGocl encapOcl] : i= LBRACK ocl= expression RBRACK ;
	public final ASTGocl oclExpression() throws RecognitionException {
		ASTGocl encapOcl = null;


		Token i=null;
		ParserRuleReturnScope ocl =null;

		try {
			// Generator.g:343:5: (i= LBRACK ocl= expression RBRACK )
			// Generator.g:344:5: i= LBRACK ocl= expression RBRACK
			{
			i=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_oclExpression1231); if (state.failed) return encapOcl;
			pushFollow(FOLLOW_expression_in_oclExpression1235);
			ocl=expression();
			state._fsp--;
			if (state.failed) return encapOcl;
			match(input,RBRACK,FOLLOW_RBRACK_in_oclExpression1237); if (state.failed) return encapOcl;
			if ( state.backtracking==0 ) { encapOcl = new ASTGocl((ocl!=null?((GeneratorParser.expression_return)ocl).n:null), i); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return encapOcl;
	}
	// $ANTLR end "oclExpression"



	// $ANTLR start "barrier"
	// Generator.g:351:1: barrier returns [ASTGBarrier barrier] : 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN ;
	public final ASTGBarrier barrier() throws RecognitionException {
		ASTGBarrier barrier = null;


		Token invClass=null;
		Token invName=null;
		ASTGocl exp =null;

		try {
			// Generator.g:352:4: ( 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN )
			// Generator.g:353:4: 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN
			{
			match(input,47,FOLLOW_47_in_barrier1265); if (state.failed) return barrier;
			match(input,LPAREN,FOLLOW_LPAREN_in_barrier1270); if (state.failed) return barrier;
			// Generator.g:354:11: (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==IDENT) ) {
				alt17=1;
			}
			else if ( (LA17_0==LBRACK) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return barrier;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// Generator.g:355:8: invClass= IDENT COLON_COLON invName= IDENT
					{
					invClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1285); if (state.failed) return barrier;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_barrier1287); if (state.failed) return barrier;
					invName=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1293); if (state.failed) return barrier;
					if ( state.backtracking==0 ) { barrier = new ASTGBarrierInvariant(invClass, invName); }
					}
					break;
				case 2 :
					// Generator.g:356:8: exp= oclExpression
					{
					pushFollow(FOLLOW_oclExpression_in_barrier1309);
					exp=oclExpression();
					state._fsp--;
					if (state.failed) return barrier;
					if ( state.backtracking==0 ) { barrier = new ASTGBarrierExpression(exp); }
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_barrier1321); if (state.failed) return barrier;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return barrier;
	}
	// $ANTLR end "barrier"



	// $ANTLR start "procedureCallOnly"
	// Generator.g:369:1: procedureCallOnly returns [ASTGProcedureCall call] : name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF ;
	public final ASTGProcedureCall procedureCallOnly() throws RecognitionException {
		ASTGProcedureCall call = null;


		Token name=null;
		ParserRuleReturnScope ocl =null;

		try {
			// Generator.g:370:5: (name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF )
			// Generator.g:371:5: name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCallOnly1345); if (state.failed) return call;
			if ( state.backtracking==0 ) {call = new ASTGProcedureCall(name);}
			match(input,LPAREN,FOLLOW_LPAREN_in_procedureCallOnly1353); if (state.failed) return call;
			// Generator.g:372:12: (ocl= expression ( COMMA ocl= expression )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==PLUS||LA19_0==REAL||(LA19_0 >= STAR && LA19_0 <= STRING)||LA19_0==46||LA19_0==48||(LA19_0 >= 51 && LA19_0 <= 55)||LA19_0==78||LA19_0==81||(LA19_0 >= 87 && LA19_0 <= 88)||(LA19_0 >= 91 && LA19_0 <= 99)||(LA19_0 >= 108 && LA19_0 <= 109)||LA19_0==115) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Generator.g:373:5: ocl= expression ( COMMA ocl= expression )*
					{
					pushFollow(FOLLOW_expression_in_procedureCallOnly1364);
					ocl=expression();
					state._fsp--;
					if (state.failed) return call;
					if ( state.backtracking==0 ) {call.addParameter((ocl!=null?((GeneratorParser.expression_return)ocl).n:null));}
					// Generator.g:374:5: ( COMMA ocl= expression )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==COMMA) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// Generator.g:374:7: COMMA ocl= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_procedureCallOnly1374); if (state.failed) return call;
							pushFollow(FOLLOW_expression_in_procedureCallOnly1378);
							ocl=expression();
							state._fsp--;
							if (state.failed) return call;
							if ( state.backtracking==0 ) {call.addParameter((ocl!=null?((GeneratorParser.expression_return)ocl).n:null));}
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_procedureCallOnly1392); if (state.failed) return call;
			match(input,EOF,FOLLOW_EOF_in_procedureCallOnly1398); if (state.failed) return call;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return call;
	}
	// $ANTLR end "procedureCallOnly"



	// $ANTLR start "model"
	// Generator.g:396:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )* EOF ;
	public final ASTModel model() throws RecognitionException {
		ASTModel n = null;


		Token modelName=null;
		Set<ASTAnnotation> as =null;
		ASTAssociation a =null;
		ASTConstraintDefinition cons =null;
		ASTPrePost ppc =null;
		ASTEnumTypeDefinition e =null;
		CAPAnnotation ca =null;


		    List<CAPAnnotation> capAnnos = new ArrayList<CAPAnnotation>();

		try {
			// Generator.g:400:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )* EOF )
			// Generator.g:401:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )* EOF
			{
			pushFollow(FOLLOW_annotationSet_in_model1432);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			match(input,89,FOLLOW_89_in_model1438); if (state.failed) return n;
			modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model1442); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }
			// Generator.g:403:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )*
			loop21:
			while (true) {
				int alt21=6;
				alt21 = dfa21.predict(input);
				switch (alt21) {
				case 1 :
					// Generator.g:403:9: generalClassifierDefinition[$n]
					{
					pushFollow(FOLLOW_generalClassifierDefinition_in_model1454);
					generalClassifierDefinition(n);
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 2 :
					// Generator.g:404:9: a= associationDefinition
					{
					pushFollow(FOLLOW_associationDefinition_in_model1467);
					a=associationDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addAssociation(a); }
					}
					break;
				case 3 :
					// Generator.g:405:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
					{
					// Generator.g:405:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
					// Generator.g:405:11: 'constraints' (cons= invariant |ppc= prePost )*
					{
					match(input,65,FOLLOW_65_in_model1481); if (state.failed) return n;
					// Generator.g:406:11: (cons= invariant |ppc= prePost )*
					loop20:
					while (true) {
						int alt20=3;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==66) ) {
							int LA20_2 = input.LA(2);
							if ( (LA20_2==IDENT) ) {
								int LA20_3 = input.LA(3);
								if ( (LA20_3==COLON_COLON) ) {
									alt20=2;
								}
								else if ( (LA20_3==EOF||LA20_3==AT||LA20_3==COLON||LA20_3==COMMA||LA20_3==IDENT||LA20_3==56||(LA20_3 >= 59 && LA20_3 <= 60)||(LA20_3 >= 65 && LA20_3 <= 66)||(LA20_3 >= 76 && LA20_3 <= 77)||LA20_3==86) ) {
									alt20=1;
								}

							}

						}

						switch (alt20) {
						case 1 :
							// Generator.g:406:15: cons= invariant
							{
							pushFollow(FOLLOW_invariant_in_model1499);
							cons=invariant();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addConstraint(cons); }
							}
							break;
						case 2 :
							// Generator.g:407:15: ppc= prePost
							{
							pushFollow(FOLLOW_prePost_in_model1520);
							ppc=prePost();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addPrePost(ppc); }
							}
							break;

						default :
							break loop20;
						}
					}

					}

					}
					break;
				case 4 :
					// Generator.g:410:9: e= enumTypeDefinition
					{
					pushFollow(FOLLOW_enumTypeDefinition_in_model1560);
					e=enumTypeDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }
					}
					break;
				case 5 :
					// Generator.g:411:9: ca= capAnnotation
					{
					pushFollow(FOLLOW_capAnnotation_in_model1574);
					ca=capAnnotation();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { capAnnos.add(ca); }
					}
					break;

				default :
					break loop21;
				}
			}

			if ( state.backtracking==0 ) { n.setCapAnnotations(capAnnos); }
			match(input,EOF,FOLLOW_EOF_in_model1595); if (state.failed) return n;
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
	// $ANTLR end "model"



	// $ANTLR start "enumTypeDefinition"
	// Generator.g:421:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
	public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
		ASTEnumTypeDefinition n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		List idListRes =null;

		try {
			// Generator.g:422:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
			// Generator.g:423:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition1623);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			match(input,76,FOLLOW_76_in_enumTypeDefinition1629); if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition1633); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition1635); if (state.failed) return n;
			pushFollow(FOLLOW_idList_in_enumTypeDefinition1639);
			idListRes=idList();
			state._fsp--;
			if (state.failed) return n;
			match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition1641); if (state.failed) return n;
			// Generator.g:424:54: ( SEMI )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==SEMI) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Generator.g:424:56: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition1645); if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) { n = new ASTEnumTypeDefinition(name, idListRes); n.setAnnotations(as); }
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
	// $ANTLR end "enumTypeDefinition"



	// $ANTLR start "dataTypeDefinition"
	// Generator.g:439:1: dataTypeDefinition[boolean isAbstract] returns [ASTDataType n] : keyDataType name= IDENT ( LESS idListRes= idList )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
	public final ASTDataType dataTypeDefinition(boolean isAbstract) throws RecognitionException {
		ASTDataType n = null;


		Token name=null;
		List idListRes =null;
		ASTOperation op =null;
		ASTInvariantClause inv =null;

		try {
			// Generator.g:440:5: ( keyDataType name= IDENT ( LESS idListRes= idList )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
			// Generator.g:441:5: keyDataType name= IDENT ( LESS idListRes= idList )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
			{
			pushFollow(FOLLOW_keyDataType_in_dataTypeDefinition1682);
			keyDataType();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_dataTypeDefinition1686); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTDataType(name, isAbstract); }
			// Generator.g:442:5: ( LESS idListRes= idList )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LESS) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Generator.g:442:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_dataTypeDefinition1696); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_dataTypeDefinition1700);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// Generator.g:443:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==100) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Generator.g:443:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,100,FOLLOW_100_in_dataTypeDefinition1713); if (state.failed) return n;
					// Generator.g:444:7: (op= operationDefinition[n] )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==AT||LA24_0==IDENT||LA24_0==56||(LA24_0 >= 59 && LA24_0 <= 60)||LA24_0==76||LA24_0==86||LA24_0==89||(LA24_0 >= 103 && LA24_0 <= 104)) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// Generator.g:445:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_dataTypeDefinition1733);
							op=operationDefinition(n);
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addOperation(op); }
							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			// Generator.g:448:5: ( 'constraints' (inv= invariantClause )* )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==65) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Generator.g:448:7: 'constraints' (inv= invariantClause )*
					{
					match(input,65,FOLLOW_65_in_dataTypeDefinition1760); if (state.failed) return n;
					// Generator.g:449:7: (inv= invariantClause )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==AT||LA26_0==IDENT||LA26_0==56||(LA26_0 >= 59 && LA26_0 <= 60)||(LA26_0 >= 76 && LA26_0 <= 77)||LA26_0==86||LA26_0==89||(LA26_0 >= 103 && LA26_0 <= 104)) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// Generator.g:450:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_dataTypeDefinition1780);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop26;
						}
					}

					}
					break;

			}

			match(input,74,FOLLOW_74_in_dataTypeDefinition1804); if (state.failed) return n;
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
	// $ANTLR end "dataTypeDefinition"



	// $ANTLR start "generalClassifierDefinition"
	// Generator.g:461:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
	public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
		Set<ASTAnnotation> as =null;
		ASTClass c =null;
		ASTDataType d =null;
		ASTAssociationClass ac =null;
		ASTSignal s =null;

		 
		  boolean isAbstract = false;
		  List<CAPAnnotation> caps = new ArrayList<>();

		try {
			// Generator.g:466:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
			// Generator.g:467:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
			{
			pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition1829);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return;
			// Generator.g:468:5: ( 'abstract' )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==56) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Generator.g:468:7: 'abstract'
					{
					match(input,56,FOLLOW_56_in_generalClassifierDefinition1837); if (state.failed) return;
					if ( state.backtracking==0 ) { isAbstract = true; }
					}
					break;

			}

			// Generator.g:469:5: (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
			int alt29=4;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==IDENT) ) {
				int LA29_1 = input.LA(2);
				if ( ((input.LT(1).getText().equals("class"))) ) {
					alt29=1;
				}
				else if ( ((input.LT(1).getText().equals("dataType"))) ) {
					alt29=2;
				}
				else if ( ((input.LT(1).getText().equals("signal"))) ) {
					alt29=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA29_0 >= 59 && LA29_0 <= 60)) ) {
				alt29=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// Generator.g:470:9: c= classDefinition[isAbstract]
					{
					pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition1863);
					c=classDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {  n.addClass(c);
					            c.setAnnotations(as);

					            String className = c.getName().getText();
					            for(CAPAnnotation a : caps){
					                a.contextClass = className;
					            }

					            n.setCapAnnotations(caps);
					         }
					}
					break;
				case 2 :
					// Generator.g:484:9: d= dataTypeDefinition[isAbstract]
					{
					pushFollow(FOLLOW_dataTypeDefinition_in_generalClassifierDefinition1899);
					d=dataTypeDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addDataType(d); d.setAnnotations(as); }
					}
					break;
				case 3 :
					// Generator.g:487:9: ac= associationClassDefinition[isAbstract]
					{
					pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition1930);
					ac=associationClassDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }
					}
					break;
				case 4 :
					// Generator.g:490:9: s= signalDefinition[isAbstract]
					{
					pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition1975);
					s=signalDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addSignal(s); s.setAnnotations(as); }
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
	}
	// $ANTLR end "generalClassifierDefinition"



	// $ANTLR start "classDefinition"
	// Generator.g:511:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
	public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
		ASTClass n = null;


		Token name=null;
		List idListRes =null;
		ASTAttribute a =null;
		ASTOperation op =null;
		ASTInvariantClause inv =null;
		ASTStateMachine sm =null;

		 List idList; 
		try {
			// Generator.g:513:5: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
			// Generator.g:514:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
			{
			pushFollow(FOLLOW_keyClass_in_classDefinition2029);
			keyClass();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition2033); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); }
			// Generator.g:515:5: ( LESS idListRes= idList )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LESS) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Generator.g:515:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_classDefinition2043); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_classDefinition2047);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// Generator.g:516:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==61) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Generator.g:516:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,61,FOLLOW_61_in_classDefinition2060); if (state.failed) return n;
					// Generator.g:517:7: (a= attributeDefinition )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==AT||LA31_0==IDENT||LA31_0==56||(LA31_0 >= 59 && LA31_0 <= 60)||LA31_0==76||LA31_0==86||LA31_0==89||(LA31_0 >= 103 && LA31_0 <= 104)) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// Generator.g:517:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_classDefinition2073);
							a=attributeDefinition();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addAttribute(a); }
							}
							break;

						default :
							break loop31;
						}
					}

					}
					break;

			}

			// Generator.g:519:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==100) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Generator.g:519:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,100,FOLLOW_100_in_classDefinition2094); if (state.failed) return n;
					// Generator.g:520:7: (op= operationDefinition[n] )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==AT||LA33_0==IDENT||LA33_0==56||(LA33_0 >= 59 && LA33_0 <= 60)||LA33_0==76||LA33_0==86||LA33_0==89||(LA33_0 >= 103 && LA33_0 <= 104)) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// Generator.g:520:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_classDefinition2107);
							op=operationDefinition(n);
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addOperation(op); }
							}
							break;

						default :
							break loop33;
						}
					}

					}
					break;

			}

			// Generator.g:522:5: ( 'constraints' (inv= invariantClause )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==65) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Generator.g:522:7: 'constraints' (inv= invariantClause )*
					{
					match(input,65,FOLLOW_65_in_classDefinition2129); if (state.failed) return n;
					// Generator.g:523:7: (inv= invariantClause )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==AT||LA35_0==IDENT||LA35_0==56||(LA35_0 >= 59 && LA35_0 <= 60)||(LA35_0 >= 76 && LA35_0 <= 77)||LA35_0==86||LA35_0==89||(LA35_0 >= 103 && LA35_0 <= 104)) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// Generator.g:524:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_classDefinition2149);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop35;
						}
					}

					}
					break;

			}

			// Generator.g:527:5: ( 'statemachines' (sm= stateMachine )* )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==110) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Generator.g:527:7: 'statemachines' (sm= stateMachine )*
					{
					match(input,110,FOLLOW_110_in_classDefinition2175); if (state.failed) return n;
					// Generator.g:528:7: (sm= stateMachine )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==106) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// Generator.g:529:9: sm= stateMachine
							{
							pushFollow(FOLLOW_stateMachine_in_classDefinition2195);
							sm=stateMachine();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addStateMachine(sm); }
							}
							break;

						default :
							break loop37;
						}
					}

					}
					break;

			}

			match(input,74,FOLLOW_74_in_classDefinition2219); if (state.failed) return n;
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
	// $ANTLR end "classDefinition"



	// $ANTLR start "associationClassDefinition"
	// Generator.g:550:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
	public final ASTAssociationClass associationClassDefinition(boolean isAbstract) throws RecognitionException {
		ASTAssociationClass n = null;


		Token classKW=null;
		Token name=null;
		List idListRes =null;
		ASTAssociationEnd ae =null;
		ASTAttribute a =null;
		ASTOperation op =null;
		ASTInvariantClause inv =null;
		ASTStateMachine sm =null;

		List idList; Token t = null;
		try {
			// Generator.g:552:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
			// Generator.g:553:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
			{
			classKW=input.LT(1);
			if ( (input.LA(1) >= 59 && input.LA(1) <= 60) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { 
			    	if ((classKW!=null?classKW.getText():null).equals("associationClass")) {
			               reportWarning("the 'associationClass' keyword is deprecated and will " +
			                             "not be supported in the future, use 'associationclass' instead");
			            }  
			    }
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition2278); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }
			// Generator.g:562:5: ( LESS idListRes= idList )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LESS) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Generator.g:562:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_associationClassDefinition2288); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_associationClassDefinition2292);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// Generator.g:563:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==63) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Generator.g:563:6: 'between' ae= associationEnd (ae= associationEnd )+
					{
					match(input,63,FOLLOW_63_in_associationClassDefinition2304); if (state.failed) return n;
					pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2312);
					ae=associationEnd();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addEnd(ae); }
					// Generator.g:565:5: (ae= associationEnd )+
					int cnt40=0;
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==IDENT) ) {
							int LA40_2 = input.LA(2);
							if ( (LA40_2==LBRACK) ) {
								alt40=1;
							}

						}
						else if ( (LA40_0==AT) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// Generator.g:565:7: ae= associationEnd
							{
							pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2324);
							ae=associationEnd();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addEnd(ae); }
							}
							break;

						default :
							if ( cnt40 >= 1 ) break loop40;
							if (state.backtracking>0) {state.failed=true; return n;}
							EarlyExitException eee = new EarlyExitException(40, input);
							throw eee;
						}
						cnt40++;
					}

					}
					break;

			}

			// Generator.g:567:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==61) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Generator.g:567:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,61,FOLLOW_61_in_associationClassDefinition2344); if (state.failed) return n;
					// Generator.g:568:7: (a= attributeDefinition )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==IDENT) ) {
							int LA42_2 = input.LA(2);
							if ( (LA42_2==COLON) ) {
								alt42=1;
							}

						}
						else if ( (LA42_0==AT) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// Generator.g:568:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition2357);
							a=attributeDefinition();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addAttribute(a); }
							}
							break;

						default :
							break loop42;
						}
					}

					}
					break;

			}

			// Generator.g:570:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==100) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Generator.g:570:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,100,FOLLOW_100_in_associationClassDefinition2378); if (state.failed) return n;
					// Generator.g:571:7: (op= operationDefinition[n] )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==IDENT) ) {
							int LA44_2 = input.LA(2);
							if ( (LA44_2==LPAREN) ) {
								alt44=1;
							}

						}
						else if ( (LA44_0==AT) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// Generator.g:571:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition2391);
							op=operationDefinition(n);
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addOperation(op); }
							}
							break;

						default :
							break loop44;
						}
					}

					}
					break;

			}

			// Generator.g:573:5: ( 'constraints' (inv= invariantClause )* )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==65) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Generator.g:573:7: 'constraints' (inv= invariantClause )*
					{
					match(input,65,FOLLOW_65_in_associationClassDefinition2413); if (state.failed) return n;
					// Generator.g:574:7: (inv= invariantClause )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==AT||LA46_0==77||LA46_0==86) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// Generator.g:575:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2433);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop46;
						}
					}

					}
					break;

			}

			// Generator.g:578:5: ( 'statemachines' (sm= stateMachine )* )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==110) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// Generator.g:578:7: 'statemachines' (sm= stateMachine )*
					{
					match(input,110,FOLLOW_110_in_associationClassDefinition2459); if (state.failed) return n;
					// Generator.g:579:7: (sm= stateMachine )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==106) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// Generator.g:580:9: sm= stateMachine
							{
							pushFollow(FOLLOW_stateMachine_in_associationClassDefinition2479);
							sm=stateMachine();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addStateMachine(sm); }
							}
							break;

						default :
							break loop48;
						}
					}

					}
					break;

			}

			// Generator.g:584:5: ( ( keyAggregation | keyComposition ) )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==IDENT) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Generator.g:584:7: ( keyAggregation | keyComposition )
					{
					if ( state.backtracking==0 ) { t = input.LT(1); }
					// Generator.g:585:7: ( keyAggregation | keyComposition )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==IDENT) ) {
						int LA50_1 = input.LA(2);
						if ( ((input.LT(1).getText().equals("aggregation"))) ) {
							alt50=1;
						}
						else if ( ((input.LT(1).getText().equals("composition"))) ) {
							alt50=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 50, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// Generator.g:585:9: keyAggregation
							{
							pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2520);
							keyAggregation();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// Generator.g:585:26: keyComposition
							{
							pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2524);
							keyComposition();
							state._fsp--;
							if (state.failed) return n;
							}
							break;

					}

					if ( state.backtracking==0 ) { n.setKind(t); }
					}
					break;

			}

			match(input,74,FOLLOW_74_in_associationClassDefinition2547); if (state.failed) return n;
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
	// $ANTLR end "associationClassDefinition"



	// $ANTLR start "attributeDefinition"
	// Generator.g:595:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
	public final ASTAttribute attributeDefinition() throws RecognitionException {
		ASTAttribute n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ASTType t =null;
		ParserRuleReturnScope deriveExpression =null;
		ParserRuleReturnScope initExpression =null;

		try {
			// Generator.g:596:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
			// Generator.g:597:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_attributeDefinition2575);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2583); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_attributeDefinition2585); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_attributeDefinition2589);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			// Generator.g:600:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
			int alt53=3;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==IDENT) ) {
				int LA53_1 = input.LA(2);
				if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
					alt53=1;
				}
				else if ( ((input.LT(1).getText().equals("init"))) ) {
					alt53=2;
				}
			}
			switch (alt53) {
				case 1 :
					// Generator.g:601:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
					{
					// Generator.g:601:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
					// Generator.g:601:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
					{
					// Generator.g:601:10: ( keyDerive | keyDerived )
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==IDENT) ) {
						int LA52_1 = input.LA(2);
						if ( ((input.LT(1).getText().equals("derive"))) ) {
							alt52=1;
						}
						else if ( ((input.LT(1).getText().equals("derived"))) ) {
							alt52=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 52, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);
						throw nvae;
					}

					switch (alt52) {
						case 1 :
							// Generator.g:601:11: keyDerive
							{
							pushFollow(FOLLOW_keyDerive_in_attributeDefinition2613);
							keyDerive();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// Generator.g:601:21: keyDerived
							{
							pushFollow(FOLLOW_keyDerived_in_attributeDefinition2615);
							keyDerived();
							state._fsp--;
							if (state.failed) return n;
							}
							break;

					}

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
					pushFollow(FOLLOW_expression_in_attributeDefinition2628);
					deriveExpression=expression();
					state._fsp--;
					if (state.failed) return n;
					}

					}
					break;
				case 2 :
					// Generator.g:603:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
					{
					// Generator.g:603:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
					// Generator.g:603:10: keyInit ( COLON | EQUAL ) initExpression= expression
					{
					pushFollow(FOLLOW_keyInit_in_attributeDefinition2648);
					keyInit();
					state._fsp--;
					if (state.failed) return n;
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
					pushFollow(FOLLOW_expression_in_attributeDefinition2664);
					initExpression=expression();
					state._fsp--;
					if (state.failed) return n;
					}

					}
					break;

			}

			// Generator.g:605:5: ( SEMI )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==SEMI) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Generator.g:605:5: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2678); if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) { 
			       n = new ASTAttribute(name, t); 
			       n.setAnnotations(as);
			       n.setDeriveExpression((deriveExpression!=null?((GeneratorParser.expression_return)deriveExpression).n:null));
			       n.setInitExpression((initExpression!=null?((GeneratorParser.expression_return)initExpression).n:null));
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
	// $ANTLR end "attributeDefinition"



	// $ANTLR start "operationDefinition"
	// Generator.g:619:1: operationDefinition[ASTClassifier c] returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
	public final ASTOperation operationDefinition(ASTClassifier c) throws RecognitionException {
		ASTOperation n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		List<ASTVariableDeclaration> pl =null;
		List<String> spl =null;
		ASTType t =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope s =null;
		ASTPrePostClause ppc =null;

		 boolean isConstructor = false; 
		try {
			// Generator.g:621:2: (as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
			// Generator.g:622:2: as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_operationDefinition2715);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2725); if (state.failed) return n;
			pushFollow(FOLLOW_paramList_in_operationDefinition2735);
			pl=paramList();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_superParamList_in_operationDefinition2745);
			spl=superParamList(pl);
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {
			      if ((name!=null?name.getText():null).equals(c.getName().getText())) {
			        isConstructor = true;
			        for (ASTVariableDeclaration vd : pl) {
			          /*
			           * If an attribute of a constructor is already defined in a
			           * super classifier, it will not be added to List<ASTAttribute>.
			           */
			          if (spl.contains(vd.name().getText())) {
			            c.addSuperAttribute(new ASTAttribute(vd.name(), vd.getType()));
			          } else {
			            c.addAttribute(new ASTAttribute(vd.name(), vd.getType()));
			          }
			        }
			      }
			    }
			// Generator.g:645:5: ( COLON t= type )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==COLON) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// Generator.g:645:7: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_operationDefinition2766); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_operationDefinition2772);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			      ASTType type = t;
			      n = new ASTOperation(name, pl, type, isConstructor);
			      n.setAnnotations(as);
			    }
			// Generator.g:651:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
			int alt56=3;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==EQUAL) ) {
				alt56=1;
			}
			else if ( (LA56_0==62) ) {
				alt56=2;
			}
			switch (alt56) {
				case 1 :
					// Generator.g:652:9: ( EQUAL e= expression )
					{
					// Generator.g:652:9: ( EQUAL e= expression )
					// Generator.g:652:11: EQUAL e= expression
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2800); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_operationDefinition2806);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setExpression((e!=null?((GeneratorParser.expression_return)e).n:null)); }
					}

					}
					break;
				case 2 :
					// Generator.g:653:9: (s= blockStat )
					{
					// Generator.g:653:9: (s= blockStat )
					// Generator.g:653:11: s= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_operationDefinition2828);
					s=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setStatement((s!=null?((GeneratorParser.blockStat_return)s).n:null));  }
					}

					}
					break;

			}

			// Generator.g:655:5: (ppc= prePostClause )*
			loop57:
			while (true) {
				int alt57=2;
				alt57 = dfa57.predict(input);
				switch (alt57) {
				case 1 :
					// Generator.g:655:7: ppc= prePostClause
					{
					pushFollow(FOLLOW_prePostClause_in_operationDefinition2850);
					ppc=prePostClause();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }
					}
					break;

				default :
					break loop57;
				}
			}

			// Generator.g:656:5: ( SEMI )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==SEMI) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// Generator.g:656:7: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2863); if (state.failed) return n;
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
	// $ANTLR end "operationDefinition"



	// $ANTLR start "superParamList"
	// Generator.g:663:1: superParamList[List<ASTVariableDeclaration> paramList] returns [List<String> superParamList] : ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )? ;
	public final List<String> superParamList(List<ASTVariableDeclaration> paramList) throws RecognitionException {
		List<String> superParamList = null;


		Token i=null;

		 superParamList = new ArrayList<String>(); 
		try {
			// Generator.g:665:3: ( ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )? )
			// Generator.g:666:3: ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )?
			{
			// Generator.g:666:3: ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==LPAREN) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// Generator.g:667:5: LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_superParamList2898); if (state.failed) return superParamList;
					// Generator.g:668:5: (i= IDENT ( COMMA i= IDENT )* )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==IDENT) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// Generator.g:669:7: i= IDENT ( COMMA i= IDENT )*
							{
							i=(Token)match(input,IDENT,FOLLOW_IDENT_in_superParamList2916); if (state.failed) return superParamList;
							if ( state.backtracking==0 ) { superParamList.add((i!=null?i.getText():null)); }
							// Generator.g:670:7: ( COMMA i= IDENT )*
							loop59:
							while (true) {
								int alt59=2;
								int LA59_0 = input.LA(1);
								if ( (LA59_0==COMMA) ) {
									alt59=1;
								}

								switch (alt59) {
								case 1 :
									// Generator.g:670:8: COMMA i= IDENT
									{
									match(input,COMMA,FOLLOW_COMMA_in_superParamList2927); if (state.failed) return superParamList;
									i=(Token)match(input,IDENT,FOLLOW_IDENT_in_superParamList2933); if (state.failed) return superParamList;
									if ( state.backtracking==0 ) { superParamList.add((i!=null?i.getText():null)); }
									}
									break;

								default :
									break loop59;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_superParamList2950); if (state.failed) return superParamList;
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
		return superParamList;
	}
	// $ANTLR end "superParamList"



	// $ANTLR start "associationDefinition"
	// Generator.g:683:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
	public final ASTAssociation associationDefinition() throws RecognitionException {
		ASTAssociation n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ASTAssociationEnd ae =null;

		 Token t = null; 
		try {
			// Generator.g:685:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
			// Generator.g:686:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
			{
			pushFollow(FOLLOW_annotationSet_in_associationDefinition2981);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { t = input.LT(1); }
			// Generator.g:688:5: ( keyAssociation | keyAggregation | keyComposition )
			int alt62=3;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==IDENT) ) {
				int LA62_1 = input.LA(2);
				if ( ((input.LT(1).getText().equals("association"))) ) {
					alt62=1;
				}
				else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
					alt62=2;
				}
				else if ( ((input.LT(1).getText().equals("composition"))) ) {
					alt62=3;
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

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// Generator.g:688:7: keyAssociation
					{
					pushFollow(FOLLOW_keyAssociation_in_associationDefinition2995);
					keyAssociation();
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 2 :
					// Generator.g:688:24: keyAggregation
					{
					pushFollow(FOLLOW_keyAggregation_in_associationDefinition2999);
					keyAggregation();
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 3 :
					// Generator.g:688:41: keyComposition
					{
					pushFollow(FOLLOW_keyComposition_in_associationDefinition3003);
					keyComposition();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition3013); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }
			match(input,63,FOLLOW_63_in_associationDefinition3021); if (state.failed) return n;
			pushFollow(FOLLOW_associationEnd_in_associationDefinition3029);
			ae=associationEnd();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.addEnd(ae); }
			// Generator.g:692:5: (ae= associationEnd )+
			int cnt63=0;
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==AT||LA63_0==IDENT||LA63_0==56||(LA63_0 >= 59 && LA63_0 <= 60)||LA63_0==76||LA63_0==86||LA63_0==89||(LA63_0 >= 103 && LA63_0 <= 104)) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// Generator.g:692:7: ae= associationEnd
					{
					pushFollow(FOLLOW_associationEnd_in_associationDefinition3041);
					ae=associationEnd();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addEnd(ae); }
					}
					break;

				default :
					if ( cnt63 >= 1 ) break loop63;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(63, input);
					throw eee;
				}
				cnt63++;
			}

			match(input,74,FOLLOW_74_in_associationDefinition3052); if (state.failed) return n;
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
	// $ANTLR end "associationDefinition"



	// $ANTLR start "associationEnd"
	// Generator.g:701:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
	public final ASTAssociationEnd associationEnd() throws RecognitionException {
		ASTAssociationEnd n = null;


		Token name=null;
		Token rn=null;
		Token sr=null;
		Token rd=null;
		Set<ASTAnnotation> as =null;
		ASTMultiplicity m =null;
		ASTElemVarsDeclaration parameter =null;
		ParserRuleReturnScope exp =null;
		List<ASTVariableDeclaration> qualifiers =null;

		try {
			// Generator.g:702:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
			// Generator.g:703:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_associationEnd3077);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3085); if (state.failed) return n;
			match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd3087); if (state.failed) return n;
			pushFollow(FOLLOW_multiplicity_in_associationEnd3091);
			m=multiplicity();
			state._fsp--;
			if (state.failed) return n;
			match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd3093); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }
			// Generator.g:705:5: ( keyRole rn= IDENT )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==IDENT) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==IDENT) ) {
					int LA64_3 = input.LA(3);
					if ( ((input.LT(1).getText().equals("role"))) ) {
						alt64=1;
					}
				}
			}
			switch (alt64) {
				case 1 :
					// Generator.g:705:7: keyRole rn= IDENT
					{
					pushFollow(FOLLOW_keyRole_in_associationEnd3104);
					keyRole();
					state._fsp--;
					if (state.failed) return n;
					rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3108); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setRolename(rn); }
					}
					break;

			}

			// Generator.g:706:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
			loop67:
			while (true) {
				int alt67=7;
				switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA67_3 = input.LA(2);
					if ( ((input.LT(1).getText().equals("union"))) ) {
						alt67=3;
					}
					else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
						alt67=5;
					}
					else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
						alt67=6;
					}

					}
					break;
				case 102:
					{
					alt67=1;
					}
					break;
				case 112:
					{
					alt67=2;
					}
					break;
				case 107:
					{
					alt67=4;
					}
					break;
				}
				switch (alt67) {
				case 1 :
					// Generator.g:707:9: 'ordered'
					{
					match(input,102,FOLLOW_102_in_associationEnd3129); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setOrdered(); }
					}
					break;
				case 2 :
					// Generator.g:708:9: 'subsets' sr= IDENT
					{
					match(input,112,FOLLOW_112_in_associationEnd3141); if (state.failed) return n;
					sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3145); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }
					}
					break;
				case 3 :
					// Generator.g:709:9: keyUnion
					{
					pushFollow(FOLLOW_keyUnion_in_associationEnd3157);
					keyUnion();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setUnion(true); }
					}
					break;
				case 4 :
					// Generator.g:710:9: 'redefines' rd= IDENT
					{
					match(input,107,FOLLOW_107_in_associationEnd3169); if (state.failed) return n;
					rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3173); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }
					}
					break;
				case 5 :
					// Generator.g:711:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
					{
					// Generator.g:711:9: ( keyDerived | keyDerive )
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==IDENT) ) {
						int LA65_1 = input.LA(2);
						if ( ((input.LT(1).getText().equals("derived"))) ) {
							alt65=1;
						}
						else if ( ((input.LT(1).getText().equals("derive"))) ) {
							alt65=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 65, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}

					switch (alt65) {
						case 1 :
							// Generator.g:711:10: keyDerived
							{
							pushFollow(FOLLOW_keyDerived_in_associationEnd3186);
							keyDerived();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// Generator.g:711:21: keyDerive
							{
							pushFollow(FOLLOW_keyDerive_in_associationEnd3188);
							keyDerive();
							state._fsp--;
							if (state.failed) return n;
							}
							break;

					}

					// Generator.g:711:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==LPAREN) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// Generator.g:711:34: LPAREN parameter= elemVarsDeclaration RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd3193); if (state.failed) return n;
							pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd3199);
							parameter=elemVarsDeclaration();
							state._fsp--;
							if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd3201); if (state.failed) return n;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd3205); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_associationEnd3209);
					exp=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setDerived((exp!=null?((GeneratorParser.expression_return)exp).n:null), parameter); }
					}
					break;
				case 6 :
					// Generator.g:712:9: keyQualifier qualifiers= paramList
					{
					pushFollow(FOLLOW_keyQualifier_in_associationEnd3221);
					keyQualifier();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_paramList_in_associationEnd3227);
					qualifiers=paramList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }
					}
					break;

				default :
					break loop67;
				}
			}

			// Generator.g:714:5: ( SEMI )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==SEMI) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Generator.g:714:7: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_associationEnd3244); if (state.failed) return n;
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
	// $ANTLR end "associationEnd"



	// $ANTLR start "multiplicity"
	// Generator.g:728:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
	public final ASTMultiplicity multiplicity() throws RecognitionException {
		ASTMultiplicity n = null;


		ASTMultiplicityRange mr =null;

		try {
			// Generator.g:729:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
			// Generator.g:730:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
			{
			if ( state.backtracking==0 ) { 
				Token t = input.LT(1); // remember start position of expression
				n = new ASTMultiplicity(t);
			    }
			pushFollow(FOLLOW_multiplicityRange_in_multiplicity3279);
			mr=multiplicityRange();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.addRange(mr); }
			// Generator.g:735:5: ( COMMA mr= multiplicityRange )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==COMMA) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// Generator.g:735:7: COMMA mr= multiplicityRange
					{
					match(input,COMMA,FOLLOW_COMMA_in_multiplicity3289); if (state.failed) return n;
					pushFollow(FOLLOW_multiplicityRange_in_multiplicity3293);
					mr=multiplicityRange();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addRange(mr); }
					}
					break;

				default :
					break loop69;
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
	// $ANTLR end "multiplicity"



	// $ANTLR start "multiplicityRange"
	// Generator.g:738:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
	public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
		ASTMultiplicityRange n = null;


		int ms1 =0;
		int ms2 =0;

		try {
			// Generator.g:739:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
			// Generator.g:740:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
			{
			pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3322);
			ms1=multiplicitySpec();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }
			// Generator.g:741:5: ( DOTDOT ms2= multiplicitySpec )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==DOTDOT) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Generator.g:741:7: DOTDOT ms2= multiplicitySpec
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange3332); if (state.failed) return n;
					pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3336);
					ms2=multiplicitySpec();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setHigh(ms2); }
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
	// $ANTLR end "multiplicityRange"



	// $ANTLR start "multiplicitySpec"
	// Generator.g:744:1: multiplicitySpec returns [int m] : (i= INT | STAR );
	public final int multiplicitySpec() throws RecognitionException {
		int m = 0;


		Token i=null;

		 m = -1; 
		try {
			// Generator.g:746:7: (i= INT | STAR )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==INT) ) {
				alt71=1;
			}
			else if ( (LA71_0==STAR) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return m;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// Generator.g:747:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec3370); if (state.failed) return m;
					if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }
					}
					break;
				case 2 :
					// Generator.g:748:7: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_multiplicitySpec3380); if (state.failed) return m;
					if ( state.backtracking==0 ) { m = -1; }
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
		return m;
	}
	// $ANTLR end "multiplicitySpec"



	// $ANTLR start "invariant"
	// Generator.g:769:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
	public final ASTConstraintDefinition invariant() throws RecognitionException {
		ASTConstraintDefinition n = null;


		Token v=null;
		ASTSimpleType t =null;
		ASTInvariantClause inv =null;

		try {
			// Generator.g:770:5: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
			// Generator.g:771:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
			{
			if ( state.backtracking==0 ) { n = new ASTConstraintDefinition(); }
			match(input,66,FOLLOW_66_in_invariant3421); if (state.failed) return n;
			// Generator.g:773:5: (v= IDENT ( ',' v= IDENT )* COLON )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==IDENT) ) {
				int LA73_1 = input.LA(2);
				if ( (LA73_1==COLON||LA73_1==COMMA) ) {
					alt73=1;
				}
			}
			switch (alt73) {
				case 1 :
					// Generator.g:773:7: v= IDENT ( ',' v= IDENT )* COLON
					{
					v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3431); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addVarName(v); }
					// Generator.g:774:8: ( ',' v= IDENT )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==COMMA) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// Generator.g:774:9: ',' v= IDENT
							{
							match(input,COMMA,FOLLOW_COMMA_in_invariant3444); if (state.failed) return n;
							v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3448); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addVarName(v); }
							}
							break;

						default :
							break loop72;
						}
					}

					match(input,COLON,FOLLOW_COLON_in_invariant3456); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_simpleType_in_invariant3468);
			t=simpleType();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setType(t); }
			// Generator.g:776:5: (inv= invariantClause )*
			loop74:
			while (true) {
				int alt74=2;
				alt74 = dfa74.predict(input);
				switch (alt74) {
				case 1 :
					// Generator.g:776:7: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_invariant3480);
					inv=invariantClause();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
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
	// $ANTLR end "invariant"



	// $ANTLR start "invariantClause"
	// Generator.g:783:1: invariantClause returns [ASTInvariantClause n] : (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
	public final ASTInvariantClause invariantClause() throws RecognitionException {
		ASTInvariantClause n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:784:2: (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==AT||LA77_0==IDENT||LA77_0==56||(LA77_0 >= 59 && LA77_0 <= 60)||LA77_0==76||LA77_0==86||LA77_0==89||(LA77_0 >= 103 && LA77_0 <= 104)) ) {
				alt77=1;
			}
			else if ( (LA77_0==77) ) {
				alt77=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// Generator.g:785:2: as= annotationSet 'inv' (name= IDENT )? COLON e= expression
					{
					pushFollow(FOLLOW_annotationSet_in_invariantClause3510);
					as=annotationSet();
					state._fsp--;
					if (state.failed) return n;
					match(input,86,FOLLOW_86_in_invariantClause3518); if (state.failed) return n;
					// Generator.g:786:13: (name= IDENT )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==IDENT) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// Generator.g:786:15: name= IDENT
							{
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3524); if (state.failed) return n;
							}
							break;

					}

					match(input,COLON,FOLLOW_COLON_in_invariantClause3529); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_invariantClause3533);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?((GeneratorParser.expression_return)e).n:null)); n.setAnnotations(as); }
					}
					break;
				case 2 :
					// Generator.g:788:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
					{
					match(input,77,FOLLOW_77_in_invariantClause3550); if (state.failed) return n;
					match(input,86,FOLLOW_86_in_invariantClause3552); if (state.failed) return n;
					// Generator.g:788:27: (name= IDENT )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==IDENT) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// Generator.g:788:29: name= IDENT
							{
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3558); if (state.failed) return n;
							}
							break;

					}

					match(input,COLON,FOLLOW_COLON_in_invariantClause3563); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_invariantClause3567);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTExistentialInvariantClause(name, (e!=null?((GeneratorParser.expression_return)e).n:null)); n.setAnnotations(as); }
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
	// $ANTLR end "invariantClause"



	// $ANTLR start "prePost"
	// Generator.g:800:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
	public final ASTPrePost prePost() throws RecognitionException {
		ASTPrePost n = null;


		Token classname=null;
		Token opname=null;
		List<ASTVariableDeclaration> pl =null;
		ASTType rt =null;
		ASTPrePostClause ppc =null;

		try {
			// Generator.g:801:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
			// Generator.g:802:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
			{
			match(input,66,FOLLOW_66_in_prePost3600); if (state.failed) return n;
			classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3604); if (state.failed) return n;
			match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost3606); if (state.failed) return n;
			opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3610); if (state.failed) return n;
			pushFollow(FOLLOW_paramList_in_prePost3614);
			pl=paramList();
			state._fsp--;
			if (state.failed) return n;
			// Generator.g:802:69: ( COLON rt= type )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==COLON) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// Generator.g:802:71: COLON rt= type
					{
					match(input,COLON,FOLLOW_COLON_in_prePost3618); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_prePost3622);
					rt=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }
			// Generator.g:804:5: (ppc= prePostClause )+
			int cnt79=0;
			loop79:
			while (true) {
				int alt79=2;
				alt79 = dfa79.predict(input);
				switch (alt79) {
				case 1 :
					// Generator.g:804:7: ppc= prePostClause
					{
					pushFollow(FOLLOW_prePostClause_in_prePost3641);
					ppc=prePostClause();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }
					}
					break;

				default :
					if ( cnt79 >= 1 ) break loop79;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(79, input);
					throw eee;
				}
				cnt79++;
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
	// $ANTLR end "prePost"



	// $ANTLR start "prePostClause"
	// Generator.g:811:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
	public final ASTPrePostClause prePostClause() throws RecognitionException {
		ASTPrePostClause n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ParserRuleReturnScope e =null;

		 Token t = null; 
		try {
			// Generator.g:813:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
			// Generator.g:814:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
			{
			pushFollow(FOLLOW_annotationSet_in_prePostClause3675);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { t = input.LT(1); }
			if ( (input.LA(1) >= 103 && input.LA(1) <= 104) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Generator.g:816:25: (name= IDENT )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// Generator.g:816:27: name= IDENT
					{
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3702); if (state.failed) return n;
					}
					break;

			}

			match(input,COLON,FOLLOW_COLON_in_prePostClause3707); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_prePostClause3711);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTPrePostClause(t, name, (e!=null?((GeneratorParser.expression_return)e).n:null)); n.setAnnotations(as); }
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
	// $ANTLR end "prePostClause"



	// $ANTLR start "annotationSet"
	// Generator.g:820:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
	public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
		Set<ASTAnnotation> annotations = null;


		ASTAnnotation an =null;

		 annotations = new HashSet<ASTAnnotation>(); 
		try {
			// Generator.g:822:2: ( (an= annotation )* )
			// Generator.g:823:2: (an= annotation )*
			{
			// Generator.g:823:2: (an= annotation )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==AT) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// Generator.g:823:3: an= annotation
					{
					pushFollow(FOLLOW_annotation_in_annotationSet3738);
					an=annotation();
					state._fsp--;
					if (state.failed) return annotations;
					if ( state.backtracking==0 ) { annotations.add(an); }
					}
					break;

				default :
					break loop81;
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
		return annotations;
	}
	// $ANTLR end "annotationSet"



	// $ANTLR start "annotation"
	// Generator.g:826:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
	public final ASTAnnotation annotation() throws RecognitionException {
		ASTAnnotation n = null;


		Token name=null;
		Map<Token, Token> values =null;

		try {
			// Generator.g:826:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
			// Generator.g:827:2: AT name= IDENT LPAREN values= annotationValues RPAREN
			{
			match(input,AT,FOLLOW_AT_in_annotation3757); if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3761); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}
			match(input,LPAREN,FOLLOW_LPAREN_in_annotation3766); if (state.failed) return n;
			pushFollow(FOLLOW_annotationValues_in_annotation3774);
			values=annotationValues();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setValues(values); }
			match(input,RPAREN,FOLLOW_RPAREN_in_annotation3779); if (state.failed) return n;
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
	// $ANTLR end "annotation"



	// $ANTLR start "annotationValues"
	// Generator.g:833:1: annotationValues returns [Map<Token, Token> annoValues] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
	public final Map<Token, Token> annotationValues() throws RecognitionException {
		Map<Token, Token> annoValues = null;


		ParserRuleReturnScope firstVal =null;
		ParserRuleReturnScope val =null;

		 annoValues = new HashMap<Token, Token>(); 
		try {
			// Generator.g:835:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
			// Generator.g:836:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
			{
			// Generator.g:836:2: (firstVal= annotationValue )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==IDENT) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// Generator.g:836:3: firstVal= annotationValue
					{
					pushFollow(FOLLOW_annotationValue_in_annotationValues3802);
					firstVal=annotationValue();
					state._fsp--;
					if (state.failed) return annoValues;
					if ( state.backtracking==0 ) { annoValues.put((firstVal!=null?((GeneratorParser.annotationValue_return)firstVal).name:null), (firstVal!=null?((GeneratorParser.annotationValue_return)firstVal).value:null)); }
					}
					break;

			}

			// Generator.g:837:2: ( COMMA val= annotationValue )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==COMMA) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// Generator.g:837:3: COMMA val= annotationValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_annotationValues3810); if (state.failed) return annoValues;
					pushFollow(FOLLOW_annotationValue_in_annotationValues3814);
					val=annotationValue();
					state._fsp--;
					if (state.failed) return annoValues;
					if ( state.backtracking==0 ) { annoValues.put((val!=null?((GeneratorParser.annotationValue_return)val).name:null), (val!=null?((GeneratorParser.annotationValue_return)val).value:null)); }
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
		return annoValues;
	}
	// $ANTLR end "annotationValues"


	public static class annotationValue_return extends ParserRuleReturnScope {
		public Token name;
		public Token value;
	};


	// $ANTLR start "annotationValue"
	// Generator.g:840:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
	public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
		GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
		retval.start = input.LT(1);

		Token aName=null;
		Token aValue=null;

		try {
			// Generator.g:840:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
			// Generator.g:841:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
			{
			aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3833); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.name = aName; }
			match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3838); if (state.failed) return retval;
			aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3844); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.value = aValue; }
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
	// $ANTLR end "annotationValue"



	// $ANTLR start "stateMachine"
	// Generator.g:846:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
	public final ASTStateMachine stateMachine() throws RecognitionException {
		ASTStateMachine n = null;


		Token smName=null;
		ASTStateDefinition s =null;
		ASTTransitionDefinition t =null;

		try {
			// Generator.g:847:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
			// Generator.g:848:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
			{
			// Generator.g:848:5: ( 'psm' )
			// Generator.g:849:8: 'psm'
			{
			match(input,106,FOLLOW_106_in_stateMachine3874); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }
			}

			smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine3907); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setName(smName); }
			match(input,111,FOLLOW_111_in_stateMachine3920); if (state.failed) return n;
			// Generator.g:856:10: (s= stateDefinition )+
			int cnt84=0;
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==IDENT) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// Generator.g:856:11: s= stateDefinition
					{
					pushFollow(FOLLOW_stateDefinition_in_stateMachine3936);
					s=stateDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addStateDefinition(s); }
					}
					break;

				default :
					if ( cnt84 >= 1 ) break loop84;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(84, input);
					throw eee;
				}
				cnt84++;
			}

			match(input,114,FOLLOW_114_in_stateMachine3946); if (state.failed) return n;
			// Generator.g:858:10: (t= transitionDefinition )+
			int cnt85=0;
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==IDENT) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// Generator.g:858:11: t= transitionDefinition
					{
					pushFollow(FOLLOW_transitionDefinition_in_stateMachine3962);
					t=transitionDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }
					}
					break;

				default :
					if ( cnt85 >= 1 ) break loop85;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(85, input);
					throw eee;
				}
				cnt85++;
			}

			match(input,74,FOLLOW_74_in_stateMachine3972); if (state.failed) return n;
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
	// $ANTLR end "stateMachine"



	// $ANTLR start "stateDefinition"
	// Generator.g:862:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
	public final ASTStateDefinition stateDefinition() throws RecognitionException {
		ASTStateDefinition n = null;


		Token sn=null;
		Token stateType=null;
		ParserRuleReturnScope stateInv =null;

		try {
			// Generator.g:862:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
			// Generator.g:863:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
			{
			sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition3988); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }
			// Generator.g:864:3: ( COLON stateType= IDENT )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==COLON) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// Generator.g:864:5: COLON stateType= IDENT
					{
					match(input,COLON,FOLLOW_COLON_in_stateDefinition3996); if (state.failed) return n;
					stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition4000); if (state.failed) return n;
					if ( state.backtracking==0 ) {n.setType(stateType); }
					}
					break;

			}

			// Generator.g:865:3: ( LBRACK stateInv= expression RBRACK )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LBRACK) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Generator.g:865:5: LBRACK stateInv= expression RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition4011); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_stateDefinition4017);
					stateInv=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition4019); if (state.failed) return n;
					if ( state.backtracking==0 ) {n.setStateInvariant((stateInv!=null?((GeneratorParser.expression_return)stateInv).n:null)); }
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
	// $ANTLR end "stateDefinition"



	// $ANTLR start "transitionDefinition"
	// Generator.g:868:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
	public final ASTTransitionDefinition transitionDefinition() throws RecognitionException {
		ASTTransitionDefinition n = null;


		Token source=null;
		Token target=null;
		Token o=null;
		ParserRuleReturnScope pre =null;
		Token e =null;
		List<ASTVariableDeclaration> args =null;
		ParserRuleReturnScope post =null;

		try {
			// Generator.g:868:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
			// Generator.g:869:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
			{
			source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4040); if (state.failed) return n;
			match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition4042); if (state.failed) return n;
			target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4046); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }
			// Generator.g:870:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LBRACE) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// Generator.g:870:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition4056); if (state.failed) return n;
					// Generator.g:871:7: ( LBRACK pre= expression RBRACK )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==LBRACK) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// Generator.g:871:8: LBRACK pre= expression RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4066); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_transitionDefinition4070);
							pre=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?((GeneratorParser.expression_return)pre).n:null)); }
							match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4074); if (state.failed) return n;
							}
							break;

					}

					// Generator.g:872:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==67) ) {
						alt90=1;
					}
					else if ( (LA90_0==IDENT) ) {
						alt90=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 90, 0, input);
						throw nvae;
					}

					switch (alt90) {
						case 1 :
							// Generator.g:873:11: e= event
							{
							pushFollow(FOLLOW_event_in_transitionDefinition4098);
							e=event();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setEvent(e); }
							}
							break;
						case 2 :
							// Generator.g:874:11: o= IDENT LPAREN (args= paramList )? RPAREN
							{
							o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4114); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setOperation(o); }
							match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition4118); if (state.failed) return n;
							// Generator.g:874:50: (args= paramList )?
							int alt89=2;
							int LA89_0 = input.LA(1);
							if ( (LA89_0==LPAREN) ) {
								alt89=1;
							}
							switch (alt89) {
								case 1 :
									// Generator.g:874:51: args= paramList
									{
									pushFollow(FOLLOW_paramList_in_transitionDefinition4123);
									args=paramList();
									state._fsp--;
									if (state.failed) return n;
									if ( state.backtracking==0 ) { n.setOperationArgs(args); }
									}
									break;

							}

							match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition4130); if (state.failed) return n;
							}
							break;

					}

					// Generator.g:876:7: ( LBRACK post= expression RBRACK )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==LBRACK) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// Generator.g:876:8: LBRACK post= expression RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4147); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_transitionDefinition4151);
							post=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setPostCondition((post!=null?((GeneratorParser.expression_return)post).n:null)); }
							match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4155); if (state.failed) return n;
							}
							break;

					}

					match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition4163); if (state.failed) return n;
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
	// $ANTLR end "transitionDefinition"



	// $ANTLR start "event"
	// Generator.g:880:1: event returns [Token t] : tcr= 'create' ;
	public final Token event() throws RecognitionException {
		Token t = null;


		Token tcr=null;

		try {
			// Generator.g:880:24: (tcr= 'create' )
			// Generator.g:881:5: tcr= 'create'
			{
			tcr=(Token)match(input,67,FOLLOW_67_in_event4185); if (state.failed) return t;
			if ( state.backtracking==0 ) {t = tcr;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "event"



	// $ANTLR start "signalDefinition"
	// Generator.g:884:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
	public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
		ASTSignal n = null;


		Token name=null;
		List idListRes =null;
		ASTAttribute a =null;
		ASTInvariantClause inv =null;

		try {
			// Generator.g:884:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
			// Generator.g:885:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
			{
			pushFollow(FOLLOW_keySignal_in_signalDefinition4205);
			keySignal();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition4209); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }
			// Generator.g:887:5: ( LESS idListRes= idList )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LESS) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// Generator.g:887:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_signalDefinition4224); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_signalDefinition4228);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addGenerals(idListRes); }
					}
					break;

			}

			// Generator.g:888:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==61) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// Generator.g:888:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,61,FOLLOW_61_in_signalDefinition4241); if (state.failed) return n;
					// Generator.g:889:7: (a= attributeDefinition )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==AT||LA94_0==IDENT||LA94_0==56||(LA94_0 >= 59 && LA94_0 <= 60)||LA94_0==76||LA94_0==86||LA94_0==89||(LA94_0 >= 103 && LA94_0 <= 104)) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// Generator.g:889:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_signalDefinition4254);
							a=attributeDefinition();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addAttribute(a); }
							}
							break;

						default :
							break loop94;
						}
					}

					}
					break;

			}

			// Generator.g:891:5: ( 'constraints' (inv= invariantClause )* )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==65) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// Generator.g:891:7: 'constraints' (inv= invariantClause )*
					{
					match(input,65,FOLLOW_65_in_signalDefinition4275); if (state.failed) return n;
					// Generator.g:892:7: (inv= invariantClause )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==AT||LA96_0==IDENT||LA96_0==56||(LA96_0 >= 59 && LA96_0 <= 60)||(LA96_0 >= 76 && LA96_0 <= 77)||LA96_0==86||LA96_0==89||(LA96_0 >= 103 && LA96_0 <= 104)) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// Generator.g:893:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_signalDefinition4295);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop96;
						}
					}

					}
					break;

			}

			match(input,74,FOLLOW_74_in_signalDefinition4319); if (state.failed) return n;
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
	// $ANTLR end "signalDefinition"



	// $ANTLR start "capAnnotation"
	// Generator.g:899:1: capAnnotation returns [CAPAnnotation ann] : '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')' ;
	public final CAPAnnotation capAnnotation() throws RecognitionException {
		CAPAnnotation ann = null;


		Token name=null;
		Map.Entry<String,Object> arg =null;


		   List<Map.Entry<String,Object>> args = new ArrayList<Map.Entry<String,Object>>();

		try {
			// Generator.g:903:4: ( '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')' )
			// Generator.g:904:4: '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')'
			{
			match(input,AT,FOLLOW_AT_in_capAnnotation4346); if (state.failed) return ann;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_capAnnotation4350); if (state.failed) return ann;
			match(input,LPAREN,FOLLOW_LPAREN_in_capAnnotation4352); if (state.failed) return ann;
			// Generator.g:905:8: (arg= capArg ( ',' arg= capArg )* )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==IDENT) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// Generator.g:905:9: arg= capArg ( ',' arg= capArg )*
					{
					pushFollow(FOLLOW_capArg_in_capAnnotation4364);
					arg=capArg();
					state._fsp--;
					if (state.failed) return ann;
					if ( state.backtracking==0 ) { args.add(arg); }
					// Generator.g:906:9: ( ',' arg= capArg )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==COMMA) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// Generator.g:906:10: ',' arg= capArg
							{
							match(input,COMMA,FOLLOW_COMMA_in_capAnnotation4377); if (state.failed) return ann;
							pushFollow(FOLLOW_capArg_in_capAnnotation4381);
							arg=capArg();
							state._fsp--;
							if (state.failed) return ann;
							if ( state.backtracking==0 ) { args.add(arg); }
							}
							break;

						default :
							break loop98;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_capAnnotation4393); if (state.failed) return ann;
			if ( state.backtracking==0 ) {
			       ann = new CAPAnnotation(name.getText(), name);
			       for(Map.Entry<String,Object> e : args) {
			           ann.addArg(e.getKey(), e.getValue());
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
		return ann;
	}
	// $ANTLR end "capAnnotation"



	// $ANTLR start "capArg"
	// Generator.g:917:1: capArg returns [Map.Entry<String,Object> entry] : key= IDENT '=' value= capValue ;
	public final Map.Entry<String,Object> capArg() throws RecognitionException {
		Map.Entry<String,Object> entry = null;


		Token key=null;
		Object value =null;

		try {
			// Generator.g:918:4: (key= IDENT '=' value= capValue )
			// Generator.g:919:4: key= IDENT '=' value= capValue
			{
			key=(Token)match(input,IDENT,FOLLOW_IDENT_in_capArg4417); if (state.failed) return entry;
			match(input,EQUAL,FOLLOW_EQUAL_in_capArg4419); if (state.failed) return entry;
			pushFollow(FOLLOW_capValue_in_capArg4423);
			value=capValue();
			state._fsp--;
			if (state.failed) return entry;
			if ( state.backtracking==0 ) {
			       entry = new java.util.AbstractMap.SimpleEntry<>(key.getText(), value);
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
		return entry;
	}
	// $ANTLR end "capArg"



	// $ANTLR start "capValue"
	// Generator.g:926:1: capValue returns [Object val] : (s1= NON_OCL_STRING |s2= STRING |n= INT |f= FLOAT |t= 'true' |f2= 'false' |q= qualifiedName |e= enumRef |ann= capAnnotation |blk= capBlock );
	public final Object capValue() throws RecognitionException {
		Object val = null;


		Token s1=null;
		Token s2=null;
		Token n=null;
		Token f=null;
		Token t=null;
		Token f2=null;
		String q =null;
		String e =null;
		CAPAnnotation ann =null;
		List<Object> blk =null;

		try {
			// Generator.g:927:5: (s1= NON_OCL_STRING |s2= STRING |n= INT |f= FLOAT |t= 'true' |f2= 'false' |q= qualifiedName |e= enumRef |ann= capAnnotation |blk= capBlock )
			int alt100=10;
			switch ( input.LA(1) ) {
			case NON_OCL_STRING:
				{
				alt100=1;
				}
				break;
			case STRING:
				{
				alt100=2;
				}
				break;
			case INT:
				{
				alt100=3;
				}
				break;
			case FLOAT:
				{
				alt100=4;
				}
				break;
			case 115:
				{
				alt100=5;
				}
				break;
			case 78:
				{
				alt100=6;
				}
				break;
			case IDENT:
				{
				int LA100_7 = input.LA(2);
				if ( (LA100_7==COLON_COLON) ) {
					alt100=8;
				}
				else if ( ((LA100_7 >= COMMA && LA100_7 <= DOT)||LA100_7==RBRACE||LA100_7==RPAREN) ) {
					alt100=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				alt100=9;
				}
				break;
			case LBRACE:
				{
				alt100=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// Generator.g:928:5: s1= NON_OCL_STRING
					{
					s1=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_capValue4448); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					            val = s1.getText().substring(1, s1.getText().length() - 1);
					        }
					}
					break;
				case 2 :
					// Generator.g:934:9: s2= STRING
					{
					s2=(Token)match(input,STRING,FOLLOW_STRING_in_capValue4478); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					            val = s2.getText().substring(1, s2.getText().length() - 1);
					        }
					}
					break;
				case 3 :
					// Generator.g:938:6: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_capValue4497); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Integer.parseInt(n.getText()); }
					}
					break;
				case 4 :
					// Generator.g:939:6: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_capValue4516); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Double.parseDouble(f.getText()); }
					}
					break;
				case 5 :
					// Generator.g:940:6: t= 'true'
					{
					t=(Token)match(input,115,FOLLOW_115_in_capValue4533); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Boolean.TRUE; }
					}
					break;
				case 6 :
					// Generator.g:941:6: f2= 'false'
					{
					f2=(Token)match(input,78,FOLLOW_78_in_capValue4549); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Boolean.FALSE; }
					}
					break;
				case 7 :
					// Generator.g:942:6: q= qualifiedName
					{
					pushFollow(FOLLOW_qualifiedName_in_capValue4563);
					q=qualifiedName();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = q; }
					}
					break;
				case 8 :
					// Generator.g:945:6: e= enumRef
					{
					pushFollow(FOLLOW_enumRef_in_capValue4579);
					e=enumRef();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = e; }
					}
					break;
				case 9 :
					// Generator.g:948:6: ann= capAnnotation
					{
					pushFollow(FOLLOW_capAnnotation_in_capValue4601);
					ann=capAnnotation();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = ann; }
					}
					break;
				case 10 :
					// Generator.g:951:6: blk= capBlock
					{
					pushFollow(FOLLOW_capBlock_in_capValue4617);
					blk=capBlock();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = blk; }
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
		return val;
	}
	// $ANTLR end "capValue"



	// $ANTLR start "qualifiedName"
	// Generator.g:957:1: qualifiedName returns [String text] : i1= IDENT ( '.' i2= IDENT )* ;
	public final String qualifiedName() throws RecognitionException {
		String text = null;


		Token i1=null;
		Token i2=null;

		 StringBuilder sb = new StringBuilder(); 
		try {
			// Generator.g:960:5: (i1= IDENT ( '.' i2= IDENT )* )
			// Generator.g:961:5: i1= IDENT ( '.' i2= IDENT )*
			{
			i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedName4646); if (state.failed) return text;
			if ( state.backtracking==0 ) { sb.append(i1.getText()); }
			// Generator.g:962:5: ( '.' i2= IDENT )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==DOT) ) {
					alt101=1;
				}

				switch (alt101) {
				case 1 :
					// Generator.g:962:7: '.' i2= IDENT
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedName4656); if (state.failed) return text;
					i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedName4660); if (state.failed) return text;
					if ( state.backtracking==0 ) { sb.append('.').append(i2.getText()); }
					}
					break;

				default :
					break loop101;
				}
			}

			if ( state.backtracking==0 ) { text = sb.toString(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return text;
	}
	// $ANTLR end "qualifiedName"



	// $ANTLR start "enumRef"
	// Generator.g:967:1: enumRef returns [String text] : t= IDENT COLON_COLON c= IDENT ;
	public final String enumRef() throws RecognitionException {
		String text = null;


		Token t=null;
		Token c=null;

		try {
			// Generator.g:969:5: (t= IDENT COLON_COLON c= IDENT )
			// Generator.g:970:5: t= IDENT COLON_COLON c= IDENT
			{
			t=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumRef4691); if (state.failed) return text;
			match(input,COLON_COLON,FOLLOW_COLON_COLON_in_enumRef4693); if (state.failed) return text;
			c=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumRef4697); if (state.failed) return text;
			if ( state.backtracking==0 ) { text = t.getText() + "::" + c.getText(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return text;
	}
	// $ANTLR end "enumRef"



	// $ANTLR start "capBlock"
	// Generator.g:974:1: capBlock returns [List<Object> list] : '{' (v= capValue ( ',' v= capValue )* )? '}' ;
	public final List<Object> capBlock() throws RecognitionException {
		List<Object> list = null;


		Object v =null;

		 list = new ArrayList<Object>(); 
		try {
			// Generator.g:976:5: ( '{' (v= capValue ( ',' v= capValue )* )? '}' )
			// Generator.g:977:5: '{' (v= capValue ( ',' v= capValue )* )? '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_capBlock4725); if (state.failed) return list;
			// Generator.g:978:7: (v= capValue ( ',' v= capValue )* )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==AT||LA103_0==FLOAT||(LA103_0 >= IDENT && LA103_0 <= LBRACE)||LA103_0==NON_OCL_STRING||LA103_0==STRING||LA103_0==78||LA103_0==115) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// Generator.g:979:9: v= capValue ( ',' v= capValue )*
					{
					pushFollow(FOLLOW_capValue_in_capBlock4745);
					v=capValue();
					state._fsp--;
					if (state.failed) return list;
					if ( state.backtracking==0 ) { list.add(v); }
					// Generator.g:980:9: ( ',' v= capValue )*
					loop102:
					while (true) {
						int alt102=2;
						int LA102_0 = input.LA(1);
						if ( (LA102_0==COMMA) ) {
							alt102=1;
						}

						switch (alt102) {
						case 1 :
							// Generator.g:980:10: ',' v= capValue
							{
							match(input,COMMA,FOLLOW_COMMA_in_capBlock4758); if (state.failed) return list;
							pushFollow(FOLLOW_capValue_in_capBlock4762);
							v=capValue();
							state._fsp--;
							if (state.failed) return list;
							if ( state.backtracking==0 ) { list.add(v); }
							}
							break;

						default :
							break loop102;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_capBlock4781); if (state.failed) return list;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "capBlock"



	// $ANTLR start "keyUnion"
	// Generator.g:986:1: keyUnion :{...}? IDENT ;
	public final void keyUnion() throws RecognitionException {
		try {
			// Generator.g:986:9: ({...}? IDENT )
			// Generator.g:987:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("union"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyUnion4794); if (state.failed) return;
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
	// $ANTLR end "keyUnion"



	// $ANTLR start "keyAssociation"
	// Generator.g:989:1: keyAssociation :{...}? IDENT ;
	public final void keyAssociation() throws RecognitionException {
		try {
			// Generator.g:989:15: ({...}? IDENT )
			// Generator.g:990:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("association"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyAssociation4808); if (state.failed) return;
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
	// $ANTLR end "keyAssociation"



	// $ANTLR start "keyRole"
	// Generator.g:992:1: keyRole :{...}? IDENT ;
	public final void keyRole() throws RecognitionException {
		try {
			// Generator.g:992:8: ({...}? IDENT )
			// Generator.g:993:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("role"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyRole4822); if (state.failed) return;
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
	// $ANTLR end "keyRole"



	// $ANTLR start "keyComposition"
	// Generator.g:995:1: keyComposition :{...}? IDENT ;
	public final void keyComposition() throws RecognitionException {
		try {
			// Generator.g:995:15: ({...}? IDENT )
			// Generator.g:996:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("composition"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyComposition4834); if (state.failed) return;
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
	// $ANTLR end "keyComposition"



	// $ANTLR start "keyAggregation"
	// Generator.g:998:1: keyAggregation :{...}? IDENT ;
	public final void keyAggregation() throws RecognitionException {
		try {
			// Generator.g:998:15: ({...}? IDENT )
			// Generator.g:999:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("aggregation"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyAggregation4846); if (state.failed) return;
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
	// $ANTLR end "keyAggregation"



	// $ANTLR start "keyDataType"
	// Generator.g:1001:1: keyDataType :{...}? IDENT ;
	public final void keyDataType() throws RecognitionException {
		try {
			// Generator.g:1001:12: ({...}? IDENT )
			// Generator.g:1002:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("dataType"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDataType", "input.LT(1).getText().equals(\"dataType\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDataType4860); if (state.failed) return;
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
	// $ANTLR end "keyDataType"



	// $ANTLR start "keyClass"
	// Generator.g:1004:1: keyClass :{...}? IDENT ;
	public final void keyClass() throws RecognitionException {
		try {
			// Generator.g:1004:9: ({...}? IDENT )
			// Generator.g:1005:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("class"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyClass4872); if (state.failed) return;
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
	// $ANTLR end "keyClass"



	// $ANTLR start "keySignal"
	// Generator.g:1007:1: keySignal :{...}? IDENT ;
	public final void keySignal() throws RecognitionException {
		try {
			// Generator.g:1007:10: ({...}? IDENT )
			// Generator.g:1008:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("signal"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keySignal4884); if (state.failed) return;
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
	// $ANTLR end "keySignal"



	// $ANTLR start "keyDerived"
	// Generator.g:1010:1: keyDerived :{...}? IDENT ;
	public final void keyDerived() throws RecognitionException {
		try {
			// Generator.g:1010:11: ({...}? IDENT )
			// Generator.g:1011:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("derived"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDerived4898); if (state.failed) return;
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
	// $ANTLR end "keyDerived"



	// $ANTLR start "keyDerive"
	// Generator.g:1013:1: keyDerive :{...}? IDENT ;
	public final void keyDerive() throws RecognitionException {
		try {
			// Generator.g:1013:10: ({...}? IDENT )
			// Generator.g:1014:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("derive"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDerive4912); if (state.failed) return;
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
	// $ANTLR end "keyDerive"



	// $ANTLR start "keyInit"
	// Generator.g:1016:1: keyInit :{...}? IDENT ;
	public final void keyInit() throws RecognitionException {
		try {
			// Generator.g:1016:8: ({...}? IDENT )
			// Generator.g:1017:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("init"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyInit4924); if (state.failed) return;
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
	// $ANTLR end "keyInit"



	// $ANTLR start "keyQualifier"
	// Generator.g:1019:1: keyQualifier :{...}? IDENT ;
	public final void keyQualifier() throws RecognitionException {
		try {
			// Generator.g:1019:13: ({...}? IDENT )
			// Generator.g:1020:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("qualifier"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyQualifier4940); if (state.failed) return;
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
	// $ANTLR end "keyQualifier"



	// $ANTLR start "expressionOnly"
	// Generator.g:1049:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
	public final ASTExpression expressionOnly() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope nExp =null;

		try {
			// Generator.g:1050:5: (nExp= expression EOF )
			// Generator.g:1051:5: nExp= expression EOF
			{
			pushFollow(FOLLOW_expression_in_expressionOnly4968);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_expressionOnly4970); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = (nExp!=null?((GeneratorParser.expression_return)nExp).n:null);}
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
	// Generator.g:1058:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
	public final GeneratorParser.expression_return expression() throws RecognitionException {
		GeneratorParser.expression_return retval = new GeneratorParser.expression_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e1 =null;
		ASTExpression nCndImplies =null;

		 
		  ASTLetExpression prevLet = null, firstLet = null;
		  ASTExpression e2;
		  Token tok = null;

		try {
			// Generator.g:1064:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
			// Generator.g:1065:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }
			// Generator.g:1066:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==88) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// Generator.g:1067:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
					{
					match(input,88,FOLLOW_88_in_expression5018); if (state.failed) return retval;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression5029); if (state.failed) return retval;
					// Generator.g:1068:18: ( COLON t= type )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==COLON) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// Generator.g:1068:20: COLON t= type
							{
							match(input,COLON,FOLLOW_COLON_in_expression5033); if (state.failed) return retval;
							pushFollow(FOLLOW_type_in_expression5037);
							t=type();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_expression5042); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression5046);
					e1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((GeneratorParser.expression_return)e1).n:null));
					         if ( firstLet == null ) 
					             firstLet = nextLet;
					         if ( prevLet != null ) 
					             prevLet.setInExpr(nextLet);
					         prevLet = nextLet;
					      }
					// Generator.g:1078:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
					loop106:
					while (true) {
						int alt106=2;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==COMMA) ) {
							alt106=1;
						}

						switch (alt106) {
						case 1 :
							// Generator.g:1079:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_expression5084); if (state.failed) return retval;
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression5096); if (state.failed) return retval;
							// Generator.g:1080:20: ( COLON t= type )?
							int alt105=2;
							int LA105_0 = input.LA(1);
							if ( (LA105_0==COLON) ) {
								alt105=1;
							}
							switch (alt105) {
								case 1 :
									// Generator.g:1080:22: COLON t= type
									{
									match(input,COLON,FOLLOW_COLON_in_expression5100); if (state.failed) return retval;
									pushFollow(FOLLOW_type_in_expression5104);
									t=type();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							match(input,EQUAL,FOLLOW_EQUAL_in_expression5109); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_expression5113);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((GeneratorParser.expression_return)e1).n:null));
							           if ( firstLet == null ) 
							               firstLet = nextLet;
							           if ( prevLet != null ) 
							               prevLet.setInExpr(nextLet);
							           prevLet = nextLet;
							        }
							}
							break;

						default :
							break loop106;
						}
					}

					match(input,83,FOLLOW_83_in_expression5154); if (state.failed) return retval;
					}
					break;

				default :
					break loop107;
				}
			}

			pushFollow(FOLLOW_conditionalImpliesExpression_in_expression5170);
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
	// Generator.g:1112:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
	public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
		List<ASTVariableDeclaration> paramList = null;


		ASTVariableDeclaration v =null;

		 paramList = new ArrayList<ASTVariableDeclaration>(); 
		try {
			// Generator.g:1114:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
			// Generator.g:1115:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_paramList5203); if (state.failed) return paramList;
			// Generator.g:1116:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==IDENT) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// Generator.g:1117:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_paramList5220);
					v=variableDeclaration();
					state._fsp--;
					if (state.failed) return paramList;
					if ( state.backtracking==0 ) { paramList.add(v); }
					// Generator.g:1118:7: ( COMMA v= variableDeclaration )*
					loop108:
					while (true) {
						int alt108=2;
						int LA108_0 = input.LA(1);
						if ( (LA108_0==COMMA) ) {
							alt108=1;
						}

						switch (alt108) {
						case 1 :
							// Generator.g:1118:9: COMMA v= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramList5232); if (state.failed) return paramList;
							pushFollow(FOLLOW_variableDeclaration_in_paramList5236);
							v=variableDeclaration();
							state._fsp--;
							if (state.failed) return paramList;
							if ( state.backtracking==0 ) { paramList.add(v); }
							}
							break;

						default :
							break loop108;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_paramList5256); if (state.failed) return paramList;
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
	// Generator.g:1126:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
	public final List idList() throws RecognitionException {
		List idList = null;


		Token id0=null;
		Token idn=null;

		 idList = new ArrayList(); 
		try {
			// Generator.g:1128:5: (id0= IDENT ( COMMA idn= IDENT )* )
			// Generator.g:1129:5: id0= IDENT ( COMMA idn= IDENT )*
			{
			id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList5285); if (state.failed) return idList;
			if ( state.backtracking==0 ) { idList.add(id0); }
			// Generator.g:1130:5: ( COMMA idn= IDENT )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==COMMA) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// Generator.g:1130:7: COMMA idn= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_idList5295); if (state.failed) return idList;
					idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList5299); if (state.failed) return idList;
					if ( state.backtracking==0 ) { idList.add(idn); }
					}
					break;

				default :
					break loop110;
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
	// Generator.g:1138:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
	public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
		ASTVariableDeclaration n = null;


		Token name=null;
		ASTType t =null;

		try {
			// Generator.g:1139:5: (name= IDENT COLON t= type )
			// Generator.g:1140:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration5330); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableDeclaration5332); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration5336);
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
	// Generator.g:1148:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
	public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndOrExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1149:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
			// Generator.g:1150:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5372);
			nCndOrExp=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndOrExp;}
			// Generator.g:1151:5: (op= 'implies' n1= conditionalOrExpression )*
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==82) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// Generator.g:1151:7: op= 'implies' n1= conditionalOrExpression
					{
					op=(Token)match(input,82,FOLLOW_82_in_conditionalImpliesExpression5385); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5389);
					n1=conditionalOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop111;
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
	// Generator.g:1160:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
	public final ASTExpression conditionalOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndXorExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1161:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
			// Generator.g:1162:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
			{
			pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5434);
			nCndXorExp=conditionalXOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndXorExp;}
			// Generator.g:1163:5: (op= 'or' n1= conditionalXOrExpression )*
			loop112:
			while (true) {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==101) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// Generator.g:1163:7: op= 'or' n1= conditionalXOrExpression
					{
					op=(Token)match(input,101,FOLLOW_101_in_conditionalOrExpression5447); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5451);
					n1=conditionalXOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop112;
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
	// Generator.g:1172:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
	public final ASTExpression conditionalXOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndAndExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1173:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
			// Generator.g:1174:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5495);
			nCndAndExp=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndAndExp;}
			// Generator.g:1175:5: (op= 'xor' n1= conditionalAndExpression )*
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==118) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// Generator.g:1175:7: op= 'xor' n1= conditionalAndExpression
					{
					op=(Token)match(input,118,FOLLOW_118_in_conditionalXOrExpression5508); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5512);
					n1=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop113;
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
	// Generator.g:1184:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
	public final ASTExpression conditionalAndExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nEqExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1185:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
			// Generator.g:1186:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5556);
			nEqExp=equalityExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nEqExp;}
			// Generator.g:1187:5: (op= 'and' n1= equalityExpression )*
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==58) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// Generator.g:1187:7: op= 'and' n1= equalityExpression
					{
					op=(Token)match(input,58,FOLLOW_58_in_conditionalAndExpression5569); if (state.failed) return n;
					pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5573);
					n1=equalityExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop114;
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
	// Generator.g:1196:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
	public final ASTExpression equalityExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nRelExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1198:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
			// Generator.g:1199:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression5621);
			nRelExp=relationalExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nRelExp;}
			// Generator.g:1200:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==EQUAL||LA115_0==NOT_EQUAL) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// Generator.g:1200:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression5650);
					n1=relationalExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop115;
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
	// Generator.g:1210:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
	public final ASTExpression relationalExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nAddiExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1212:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
			// Generator.g:1213:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression5699);
			nAddiExp=additiveExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nAddiExp;}
			// Generator.g:1214:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( ((LA116_0 >= GREATER && LA116_0 <= GREATER_EQUAL)||(LA116_0 >= LESS && LA116_0 <= LESS_EQUAL)) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// Generator.g:1214:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression5735);
					n1=additiveExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop116;
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
	// Generator.g:1224:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
	public final ASTExpression additiveExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nMulExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1226:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
			// Generator.g:1227:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5785);
			nMulExp=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nMulExp;}
			// Generator.g:1228:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==MINUS||LA117_0==PLUS) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// Generator.g:1228:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5813);
					n1=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop117;
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
	// Generator.g:1239:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
	public final ASTExpression multiplicativeExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1241:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
			// Generator.g:1242:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5863);
			nUnExp=unaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nUnExp;}
			// Generator.g:1243:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==SLASH||LA118_0==STAR||LA118_0==71) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// Generator.g:1243:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==71 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5895);
					n1=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop118;
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
	// Generator.g:1255:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
	public final ASTExpression unaryExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression nPosExp =null;

		 Token op = null; 
		try {
			// Generator.g:1257:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==MINUS||LA119_0==PLUS||LA119_0==91) ) {
				alt119=1;
			}
			else if ( (LA119_0==AT||LA119_0==HASH||(LA119_0 >= IDENT && LA119_0 <= INT)||LA119_0==LPAREN||LA119_0==REAL||(LA119_0 >= STAR && LA119_0 <= STRING)||LA119_0==46||LA119_0==48||(LA119_0 >= 51 && LA119_0 <= 55)||LA119_0==78||LA119_0==81||LA119_0==87||(LA119_0 >= 92 && LA119_0 <= 99)||(LA119_0 >= 108 && LA119_0 <= 109)||LA119_0==115) ) {
				alt119=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}

			switch (alt119) {
				case 1 :
					// Generator.g:1258:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					{
					// Generator.g:1258:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					// Generator.g:1258:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==91 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5981);
					nUnExp=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }
					}

					}
					break;
				case 2 :
					// Generator.g:1262:7: nPosExp= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression6001);
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
	// Generator.g:1270:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
	public final ASTExpression postfixExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nPrimExp =null;
		ASTExpression nPc =null;

		 boolean arrow = false; 
		try {
			// Generator.g:1272:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
			// Generator.g:1273:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression6034);
			nPrimExp=primaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nPrimExp; }
			// Generator.g:1274:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==DOT) ) {
					int LA121_2 = input.LA(2);
					if ( (LA121_2==IDENT) ) {
						int LA121_4 = input.LA(3);
						if ( (LA121_4==EOF||(LA121_4 >= ARROW && LA121_4 <= BAR)||(LA121_4 >= COMMA && LA121_4 <= EQUAL)||(LA121_4 >= GREATER && LA121_4 <= GREATER_EQUAL)||LA121_4==IDENT||(LA121_4 >= LBRACE && LA121_4 <= MINUS)||(LA121_4 >= NOT_EQUAL && LA121_4 <= PLUS)||(LA121_4 >= RBRACE && LA121_4 <= RBRACK)||(LA121_4 >= RPAREN && LA121_4 <= SLASH)||LA121_4==STAR||LA121_4==56||(LA121_4 >= 58 && LA121_4 <= 61)||(LA121_4 >= 65 && LA121_4 <= 66)||(LA121_4 >= 71 && LA121_4 <= 77)||(LA121_4 >= 82 && LA121_4 <= 83)||LA121_4==86||(LA121_4 >= 100 && LA121_4 <= 104)||LA121_4==107||LA121_4==110||(LA121_4 >= 112 && LA121_4 <= 113)||LA121_4==118) ) {
							alt121=1;
						}

					}
					else if ( (LA121_2==87||LA121_2==93||(LA121_2 >= 95 && LA121_2 <= 98)||(LA121_2 >= 108 && LA121_2 <= 109)) ) {
						alt121=1;
					}

				}
				else if ( (LA121_0==ARROW) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// Generator.g:1275:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
					{
					// Generator.g:1275:6: ( ARROW | DOT )
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==ARROW) ) {
						alt120=1;
					}
					else if ( (LA120_0==DOT) ) {
						alt120=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 120, 0, input);
						throw nvae;
					}

					switch (alt120) {
						case 1 :
							// Generator.g:1275:8: ARROW
							{
							match(input,ARROW,FOLLOW_ARROW_in_postfixExpression6052); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = true; }
							}
							break;
						case 2 :
							// Generator.g:1275:34: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_postfixExpression6058); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = false; }
							}
							break;

					}

					pushFollow(FOLLOW_propertyCall_in_postfixExpression6069);
					nPc=propertyCall(n, arrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;

				default :
					break loop121;
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
	// Generator.g:1291:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
			// Generator.g:1292:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
			int alt125=7;
			switch ( input.LA(1) ) {
			case HASH:
			case INT:
			case REAL:
			case STAR:
			case STRING:
			case 46:
			case 48:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 78:
			case 92:
			case 94:
			case 99:
			case 115:
				{
				alt125=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case COLON_COLON:
					{
					alt125=1;
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
				case 56:
				case 58:
				case 59:
				case 60:
				case 61:
				case 65:
				case 66:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 82:
				case 83:
				case 86:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 107:
				case 110:
				case 112:
				case 113:
				case 118:
					{
					alt125=3;
					}
					break;
				case DOT:
					{
					switch ( input.LA(3) ) {
					case 57:
						{
						alt125=6;
						}
						break;
					case 64:
						{
						alt125=7;
						}
						break;
					case IDENT:
					case 87:
					case 93:
					case 95:
					case 96:
					case 97:
					case 98:
					case 108:
					case 109:
						{
						alt125=3;
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
								new NoViableAltException("", 125, 7, input);
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
							new NoViableAltException("", 125, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case AT:
				{
				alt125=2;
				}
				break;
			case 87:
			case 93:
			case 95:
			case 96:
			case 97:
			case 98:
			case 108:
			case 109:
				{
				alt125=3;
				}
				break;
			case LPAREN:
				{
				alt125=4;
				}
				break;
			case 81:
				{
				alt125=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// Generator.g:1293:7: nLit= literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression6109);
					nLit=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nLit; }
					}
					break;
				case 2 :
					// Generator.g:1294:7: nOr= objectReference
					{
					pushFollow(FOLLOW_objectReference_in_primaryExpression6123);
					nOr=objectReference();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nOr; }
					}
					break;
				case 3 :
					// Generator.g:1295:7: nPc= propertyCall[null, false]
					{
					pushFollow(FOLLOW_propertyCall_in_primaryExpression6135);
					nPc=propertyCall(null, false);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;
				case 4 :
					// Generator.g:1296:7: LPAREN nExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6146); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression6150);
					nExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6152); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExp!=null?((GeneratorParser.expression_return)nExp).n:null); }
					}
					break;
				case 5 :
					// Generator.g:1297:7: nIfExp= ifExpression
					{
					pushFollow(FOLLOW_ifExpression_in_primaryExpression6164);
					nIfExp=ifExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nIfExp; }
					}
					break;
				case 6 :
					// Generator.g:1298:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
					{
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression6176); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression6178); if (state.failed) return n;
					match(input,57,FOLLOW_57_in_primaryExpression6180); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }
					// Generator.g:1300:9: ( AT 'pre' )?
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( (LA122_0==AT) ) {
						int LA122_1 = input.LA(2);
						if ( (LA122_1==104) ) {
							alt122=1;
						}
					}
					switch (alt122) {
						case 1 :
							// Generator.g:1300:11: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression6203); if (state.failed) return n;
							match(input,104,FOLLOW_104_in_primaryExpression6205); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					// Generator.g:1301:9: ( LPAREN RPAREN )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==LPAREN) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// Generator.g:1301:11: LPAREN RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6223); if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6225); if (state.failed) return n;
							}
							break;

					}

					}
					break;
				case 7 :
					// Generator.g:1302:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
					{
					id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression6238); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression6240); if (state.failed) return n;
					match(input,64,FOLLOW_64_in_primaryExpression6242); if (state.failed) return n;
					// Generator.g:1302:31: ( LPAREN idExp= expression RPAREN )
					// Generator.g:1302:33: LPAREN idExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6246); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression6250);
					idExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6252); if (state.failed) return n;
					}

					if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?((GeneratorParser.expression_return)idExp).n:null)); }
					// Generator.g:1304:7: ( AT 'pre' )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==AT) ) {
						int LA124_1 = input.LA(2);
						if ( (LA124_1==104) ) {
							alt124=1;
						}
					}
					switch (alt124) {
						case 1 :
							// Generator.g:1304:9: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression6272); if (state.failed) return n;
							match(input,104,FOLLOW_104_in_primaryExpression6274); if (state.failed) return n;
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
	// Generator.g:1308:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
	public final ASTExpression objectReference() throws RecognitionException {
		ASTExpression n = null;


		Token objectName=null;

		try {
			// Generator.g:1309:3: ( AT objectName= IDENT )
			// Generator.g:1310:3: AT objectName= IDENT
			{
			match(input,AT,FOLLOW_AT_in_objectReference6300); if (state.failed) return n;
			objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference6308); if (state.failed) return n;
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
	// Generator.g:1324:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
	public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExpQuery =null;
		ASTExpression nExpIterate =null;
		ParserRuleReturnScope nExpOperation =null;
		ASTTypeArgExpression nExpType =null;
		ASTInStateExpression nExpInState =null;

		try {
			// Generator.g:1325:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
			int alt126=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA126_1 = input.LA(2);
				if ( ((( input.LA(2) == LPAREN )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
					alt126=1;
				}
				else if ( (true) ) {
					alt126=3;
				}

				}
				break;
			case 87:
				{
				alt126=2;
				}
				break;
			case 93:
			case 97:
			case 98:
			case 108:
			case 109:
				{
				alt126=4;
				}
				break;
			case 95:
			case 96:
				{
				alt126=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}
			switch (alt126) {
				case 1 :
					// Generator.g:1329:7: {...}?{...}?nExpQuery= queryExpression[source]
					{
					if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
					}
					if ( !(( input.LA(2) == LPAREN )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
					}
					pushFollow(FOLLOW_queryExpression_in_propertyCall6373);
					nExpQuery=queryExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpQuery; }
					}
					break;
				case 2 :
					// Generator.g:1332:7: nExpIterate= iterateExpression[source]
					{
					pushFollow(FOLLOW_iterateExpression_in_propertyCall6386);
					nExpIterate=iterateExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpIterate; }
					}
					break;
				case 3 :
					// Generator.g:1333:7: nExpOperation= operationExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_operationExpression_in_propertyCall6399);
					nExpOperation=operationExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExpOperation!=null?((GeneratorParser.operationExpression_return)nExpOperation).n:null); }
					}
					break;
				case 4 :
					// Generator.g:1334:7: nExpType= typeExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_typeExpression_in_propertyCall6412);
					nExpType=typeExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpType; }
					}
					break;
				case 5 :
					// Generator.g:1335:7: nExpInState= inStateExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_inStateExpression_in_propertyCall6425);
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
	// Generator.g:1344:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
	public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTElemVarsDeclaration decls =null;
		ParserRuleReturnScope nExp =null;

		ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
		try {
			// Generator.g:1345:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
			// Generator.g:1346:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
			{
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression6460); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression6467); if (state.failed) return n;
			// Generator.g:1348:5: (decls= elemVarsDeclaration BAR )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==IDENT) ) {
				int LA127_1 = input.LA(2);
				if ( ((LA127_1 >= BAR && LA127_1 <= COLON)||LA127_1==COMMA) ) {
					alt127=1;
				}
			}
			switch (alt127) {
				case 1 :
					// Generator.g:1348:7: decls= elemVarsDeclaration BAR
					{
					pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression6478);
					decls=elemVarsDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {decl = decls;}
					match(input,BAR,FOLLOW_BAR_in_queryExpression6482); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_queryExpression6493);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression6499); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?((GeneratorParser.expression_return)nExp).n:null)); }
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
	// Generator.g:1362:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
	public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTElemVarsDeclaration decls =null;
		ASTVariableInitialization init =null;
		ParserRuleReturnScope nExp =null;

		try {
			// Generator.g:1362:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
			// Generator.g:1363:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
			{
			i=(Token)match(input,87,FOLLOW_87_in_iterateExpression6531); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression6537); if (state.failed) return n;
			pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression6545);
			decls=elemVarsDeclaration();
			state._fsp--;
			if (state.failed) return n;
			match(input,SEMI,FOLLOW_SEMI_in_iterateExpression6547); if (state.failed) return n;
			pushFollow(FOLLOW_variableInitialization_in_iterateExpression6555);
			init=variableInitialization();
			state._fsp--;
			if (state.failed) return n;
			match(input,BAR,FOLLOW_BAR_in_iterateExpression6557); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_iterateExpression6565);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression6571); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?((GeneratorParser.expression_return)nExp).n:null)); }
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
	// Generator.g:1384:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
	public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
		retval.start = input.LT(1);

		Token name=null;
		ParserRuleReturnScope rolename =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1386:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
			// Generator.g:1387:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression6615); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }
			// Generator.g:1393:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==LBRACK) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// Generator.g:1393:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6637); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operationExpression6650);
					rolename=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((GeneratorParser.expression_return)rolename).n:null)); }
					// Generator.g:1395:9: ( COMMA rolename= expression )*
					loop128:
					while (true) {
						int alt128=2;
						int LA128_0 = input.LA(1);
						if ( (LA128_0==COMMA) ) {
							alt128=1;
						}

						switch (alt128) {
						case 1 :
							// Generator.g:1395:10: COMMA rolename= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_operationExpression6663); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression6667);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((GeneratorParser.expression_return)rolename).n:null)); }
							}
							break;

						default :
							break loop128;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6679); if (state.failed) return retval;
					// Generator.g:1398:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					int alt130=2;
					int LA130_0 = input.LA(1);
					if ( (LA130_0==LBRACK) ) {
						alt130=1;
					}
					switch (alt130) {
						case 1 :
							// Generator.g:1398:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6696); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression6711);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((GeneratorParser.expression_return)rolename).n:null)); }
							// Generator.g:1400:11: ( COMMA rolename= expression )*
							loop129:
							while (true) {
								int alt129=2;
								int LA129_0 = input.LA(1);
								if ( (LA129_0==COMMA) ) {
									alt129=1;
								}

								switch (alt129) {
								case 1 :
									// Generator.g:1400:12: COMMA rolename= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression6726); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression6730);
									rolename=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((GeneratorParser.expression_return)rolename).n:null)); }
									}
									break;

								default :
									break loop129;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6744); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			// Generator.g:1405:5: ( AT 'pre' )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==AT) ) {
				int LA132_1 = input.LA(2);
				if ( (LA132_1==104) ) {
					alt132=1;
				}
			}
			switch (alt132) {
				case 1 :
					// Generator.g:1405:7: AT 'pre'
					{
					match(input,AT,FOLLOW_AT_in_operationExpression6769); if (state.failed) return retval;
					match(input,104,FOLLOW_104_in_operationExpression6771); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.setIsPre(); }
					}
					break;

			}

			// Generator.g:1407:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==LPAREN) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// Generator.g:1408:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression6796); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.hasParentheses(); }
					// Generator.g:1409:7: (e= expression ( COMMA e= expression )* )?
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==AT||LA134_0==HASH||(LA134_0 >= IDENT && LA134_0 <= INT)||(LA134_0 >= LPAREN && LA134_0 <= MINUS)||LA134_0==PLUS||LA134_0==REAL||(LA134_0 >= STAR && LA134_0 <= STRING)||LA134_0==46||LA134_0==48||(LA134_0 >= 51 && LA134_0 <= 55)||LA134_0==78||LA134_0==81||(LA134_0 >= 87 && LA134_0 <= 88)||(LA134_0 >= 91 && LA134_0 <= 99)||(LA134_0 >= 108 && LA134_0 <= 109)||LA134_0==115) ) {
						alt134=1;
					}
					switch (alt134) {
						case 1 :
							// Generator.g:1410:7: e= expression ( COMMA e= expression )*
							{
							pushFollow(FOLLOW_expression_in_operationExpression6817);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((GeneratorParser.expression_return)e).n:null)); }
							// Generator.g:1411:7: ( COMMA e= expression )*
							loop133:
							while (true) {
								int alt133=2;
								int LA133_0 = input.LA(1);
								if ( (LA133_0==COMMA) ) {
									alt133=1;
								}

								switch (alt133) {
								case 1 :
									// Generator.g:1411:9: COMMA e= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression6829); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression6833);
									e=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((GeneratorParser.expression_return)e).n:null)); }
									}
									break;

								default :
									break loop133;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression6853); if (state.failed) return retval;
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
	// Generator.g:1418:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN ;
	public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTInStateExpression n = null;


		Token s=null;

		 Token opToken = null; 
		try {
			// Generator.g:1421:4: ( ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN )
			// Generator.g:1422:4: ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( (input.LA(1) >= 95 && input.LA(1) <= 96) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression6914); if (state.failed) return n;
			s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression6923); if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression6928); if (state.failed) return n;
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
	// Generator.g:1435:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
	public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTTypeArgExpression n = null;


		ASTType t =null;

		 Token opToken = null; 
		try {
			// Generator.g:1438:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
			// Generator.g:1439:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( input.LA(1)==93||(input.LA(1) >= 97 && input.LA(1) <= 98)||(input.LA(1) >= 108 && input.LA(1) <= 109) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression6988); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_typeExpression6992);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression6994); if (state.failed) return n;
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
	// Generator.g:1450:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
	public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
		ASTElemVarsDeclaration n = null;


		Token var1=null;
		Token varN=null;
		ASTType t =null;
		ASTType tN =null;

		try {
			// Generator.g:1451:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
			// Generator.g:1452:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
			{
			if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }
			var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration7032); if (state.failed) return n;
			// Generator.g:1453:17: ( COLON t= type )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==COLON) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Generator.g:1453:18: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration7035); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_elemVarsDeclaration7039);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}
			// Generator.g:1454:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==COMMA) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// Generator.g:1454:5: COMMA varN= IDENT ( COLON tN= type )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration7049); if (state.failed) return n;
					varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration7055); if (state.failed) return n;
					// Generator.g:1454:24: ( COLON tN= type )?
					int alt137=2;
					int LA137_0 = input.LA(1);
					if ( (LA137_0==COLON) ) {
						alt137=1;
					}
					switch (alt137) {
						case 1 :
							// Generator.g:1454:25: COLON tN= type
							{
							match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration7058); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_elemVarsDeclaration7064);
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
					break loop138;
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
	// Generator.g:1462:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
	public final ASTVariableInitialization variableInitialization() throws RecognitionException {
		ASTVariableInitialization n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1463:5: (name= IDENT COLON t= type EQUAL e= expression )
			// Generator.g:1464:5: name= IDENT COLON t= type EQUAL e= expression
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization7092); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableInitialization7094); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableInitialization7098);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization7100); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_variableInitialization7104);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?((GeneratorParser.expression_return)e).n:null)); }
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
	// Generator.g:1473:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
	public final ASTExpression ifExpression() throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1474:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
			// Generator.g:1475:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
			{
			i=(Token)match(input,81,FOLLOW_81_in_ifExpression7136); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression7140);
			cond=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,113,FOLLOW_113_in_ifExpression7142); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression7146);
			t=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,73,FOLLOW_73_in_ifExpression7148); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression7152);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,75,FOLLOW_75_in_ifExpression7154); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?((GeneratorParser.expression_return)cond).n:null), (t!=null?((GeneratorParser.expression_return)t).n:null), (e!=null?((GeneratorParser.expression_return)e).n:null)); }
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
	// Generator.g:1494:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
			// Generator.g:1495:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
			int alt139=12;
			switch ( input.LA(1) ) {
			case 115:
				{
				alt139=1;
				}
				break;
			case 78:
				{
				alt139=2;
				}
				break;
			case INT:
				{
				alt139=3;
				}
				break;
			case REAL:
				{
				alt139=4;
				}
				break;
			case STRING:
				{
				alt139=5;
				}
				break;
			case HASH:
				{
				alt139=6;
				}
				break;
			case IDENT:
				{
				alt139=7;
				}
				break;
			case 46:
			case 51:
			case 52:
			case 53:
				{
				int LA139_8 = input.LA(2);
				if ( (LA139_8==LPAREN) ) {
					alt139=9;
				}
				else if ( (LA139_8==LBRACE) ) {
					alt139=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 139, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 48:
			case 94:
				{
				alt139=9;
				}
				break;
			case 55:
			case 92:
			case 99:
				{
				alt139=10;
				}
				break;
			case 54:
				{
				alt139=11;
				}
				break;
			case STAR:
				{
				alt139=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}
			switch (alt139) {
				case 1 :
					// Generator.g:1496:7: t= 'true'
					{
					t=(Token)match(input,115,FOLLOW_115_in_literal7193); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }
					}
					break;
				case 2 :
					// Generator.g:1497:7: f= 'false'
					{
					f=(Token)match(input,78,FOLLOW_78_in_literal7207); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }
					}
					break;
				case 3 :
					// Generator.g:1498:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_literal7220); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }
					}
					break;
				case 4 :
					// Generator.g:1499:7: r= REAL
					{
					r=(Token)match(input,REAL,FOLLOW_REAL_in_literal7235); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }
					}
					break;
				case 5 :
					// Generator.g:1500:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_literal7249); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }
					}
					break;
				case 6 :
					// Generator.g:1501:7: HASH enumLit= IDENT
					{
					match(input,HASH,FOLLOW_HASH_in_literal7259); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7263); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}
					}
					break;
				case 7 :
					// Generator.g:1502:7: enumName= IDENT '::' enumLit= IDENT
					{
					enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7275); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal7277); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7281); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }
					}
					break;
				case 8 :
					// Generator.g:1503:7: nColIt= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_literal7293);
					nColIt=collectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nColIt; }
					}
					break;
				case 9 :
					// Generator.g:1504:7: nEColIt= emptyCollectionLiteral
					{
					pushFollow(FOLLOW_emptyCollectionLiteral_in_literal7305);
					nEColIt=emptyCollectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nEColIt; }
					}
					break;
				case 10 :
					// Generator.g:1505:7: nUndLit= undefinedLiteral
					{
					pushFollow(FOLLOW_undefinedLiteral_in_literal7317);
					nUndLit=undefinedLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nUndLit; }
					}
					break;
				case 11 :
					// Generator.g:1506:7: nTupleLit= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_literal7329);
					nTupleLit=tupleLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nTupleLit; }
					}
					break;
				case 12 :
					// Generator.g:1507:7: un= STAR
					{
					un=(Token)match(input,STAR,FOLLOW_STAR_in_literal7341); if (state.failed) return n;
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
	// Generator.g:1515:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
	public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
		ASTCollectionLiteral n = null;


		ASTCollectionItem ci =null;

		 Token op = null; 
		try {
			// Generator.g:1517:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
			// Generator.g:1518:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
			{
			if ( state.backtracking==0 ) { op = input.LT(1); }
			if ( input.LA(1)==46||(input.LA(1) >= 51 && input.LA(1) <= 53) ) {
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
			match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral7408); if (state.failed) return n;
			// Generator.g:1522:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==AT||LA141_0==HASH||(LA141_0 >= IDENT && LA141_0 <= INT)||(LA141_0 >= LPAREN && LA141_0 <= MINUS)||LA141_0==PLUS||LA141_0==REAL||(LA141_0 >= STAR && LA141_0 <= STRING)||LA141_0==46||LA141_0==48||(LA141_0 >= 51 && LA141_0 <= 55)||LA141_0==78||LA141_0==81||(LA141_0 >= 87 && LA141_0 <= 88)||(LA141_0 >= 91 && LA141_0 <= 99)||(LA141_0 >= 108 && LA141_0 <= 109)||LA141_0==115) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// Generator.g:1523:7: ci= collectionItem ( COMMA ci= collectionItem )*
					{
					pushFollow(FOLLOW_collectionItem_in_collectionLiteral7425);
					ci=collectionItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addItem(ci); }
					// Generator.g:1524:7: ( COMMA ci= collectionItem )*
					loop140:
					while (true) {
						int alt140=2;
						int LA140_0 = input.LA(1);
						if ( (LA140_0==COMMA) ) {
							alt140=1;
						}

						switch (alt140) {
						case 1 :
							// Generator.g:1524:9: COMMA ci= collectionItem
							{
							match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral7438); if (state.failed) return n;
							pushFollow(FOLLOW_collectionItem_in_collectionLiteral7442);
							ci=collectionItem();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addItem(ci); }
							}
							break;

						default :
							break loop140;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral7461); if (state.failed) return n;
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
	// Generator.g:1533:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
	public final ASTCollectionItem collectionItem() throws RecognitionException {
		ASTCollectionItem n = null;


		ParserRuleReturnScope e =null;

		 n = new ASTCollectionItem(); 
		try {
			// Generator.g:1535:5: (e= expression ( DOTDOT e= expression )? )
			// Generator.g:1536:5: e= expression ( DOTDOT e= expression )?
			{
			pushFollow(FOLLOW_expression_in_collectionItem7490);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setFirst((e!=null?((GeneratorParser.expression_return)e).n:null)); }
			// Generator.g:1537:5: ( DOTDOT e= expression )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==DOTDOT) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// Generator.g:1537:7: DOTDOT e= expression
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem7501); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_collectionItem7505);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setSecond((e!=null?((GeneratorParser.expression_return)e).n:null)); }
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
	// Generator.g:1547:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
	public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
		ASTEmptyCollectionLiteral n = null;


		ASTCollectionType t =null;

		try {
			// Generator.g:1548:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==94) ) {
				alt143=1;
			}
			else if ( (LA143_0==46||LA143_0==48||(LA143_0 >= 51 && LA143_0 <= 53)) ) {
				alt143=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 143, 0, input);
				throw nvae;
			}

			switch (alt143) {
				case 1 :
					// Generator.g:1549:5: 'oclEmpty' LPAREN t= collectionType RPAREN
					{
					match(input,94,FOLLOW_94_in_emptyCollectionLiteral7534); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral7536); if (state.failed) return n;
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7540);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral7542); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;
				case 2 :
					// Generator.g:1552:5: t= collectionType LBRACE RBRACE
					{
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7558);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral7560); if (state.failed) return n;
					match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral7562); if (state.failed) return n;
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
	// Generator.g:1563:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
	public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
		ASTUndefinedLiteral n = null;


		ASTType t =null;

		try {
			// Generator.g:1564:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
			int alt144=4;
			switch ( input.LA(1) ) {
			case 99:
				{
				alt144=1;
				}
				break;
			case 55:
				{
				alt144=2;
				}
				break;
			case 92:
				{
				int LA144_3 = input.LA(2);
				if ( (LA144_3==LPAREN) ) {
					alt144=3;
				}
				else if ( (LA144_3==EOF||(LA144_3 >= ARROW && LA144_3 <= BAR)||(LA144_3 >= COMMA && LA144_3 <= EQUAL)||(LA144_3 >= GREATER && LA144_3 <= GREATER_EQUAL)||LA144_3==IDENT||LA144_3==LBRACE||(LA144_3 >= LESS && LA144_3 <= LESS_EQUAL)||LA144_3==MINUS||(LA144_3 >= NOT_EQUAL && LA144_3 <= PLUS)||(LA144_3 >= RBRACE && LA144_3 <= RBRACK)||(LA144_3 >= RPAREN && LA144_3 <= SLASH)||LA144_3==STAR||LA144_3==56||(LA144_3 >= 58 && LA144_3 <= 61)||(LA144_3 >= 65 && LA144_3 <= 66)||(LA144_3 >= 71 && LA144_3 <= 77)||(LA144_3 >= 82 && LA144_3 <= 83)||LA144_3==86||(LA144_3 >= 100 && LA144_3 <= 104)||LA144_3==107||LA144_3==110||(LA144_3 >= 112 && LA144_3 <= 113)||LA144_3==118) ) {
					alt144=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 144, 3, input);
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
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}
			switch (alt144) {
				case 1 :
					// Generator.g:1565:5: 'oclUndefined' LPAREN t= type RPAREN
					{
					match(input,99,FOLLOW_99_in_undefinedLiteral7592); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7594); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral7598);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7600); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 2 :
					// Generator.g:1568:5: 'Undefined'
					{
					match(input,55,FOLLOW_55_in_undefinedLiteral7614); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;
				case 3 :
					// Generator.g:1571:5: 'null' LPAREN t= type RPAREN
					{
					match(input,92,FOLLOW_92_in_undefinedLiteral7628); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7630); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral7634);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7636); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 4 :
					// Generator.g:1574:5: 'null'
					{
					match(input,92,FOLLOW_92_in_undefinedLiteral7650); if (state.failed) return n;
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
	// Generator.g:1584:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
	public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
		ASTTupleLiteral n = null;


		ASTTupleItem ti =null;

		 List tiList = new ArrayList(); 
		try {
			// Generator.g:1586:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
			// Generator.g:1587:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
			{
			match(input,54,FOLLOW_54_in_tupleLiteral7689); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral7695); if (state.failed) return n;
			pushFollow(FOLLOW_tupleItem_in_tupleLiteral7703);
			ti=tupleItem();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tiList.add(ti); }
			// Generator.g:1590:5: ( COMMA ti= tupleItem )*
			loop145:
			while (true) {
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==COMMA) ) {
					alt145=1;
				}

				switch (alt145) {
				case 1 :
					// Generator.g:1590:7: COMMA ti= tupleItem
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral7714); if (state.failed) return n;
					pushFollow(FOLLOW_tupleItem_in_tupleLiteral7718);
					ti=tupleItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tiList.add(ti); }
					}
					break;

				default :
					break loop145;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral7729); if (state.failed) return n;
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
	// Generator.g:1598:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
	public final ASTTupleItem tupleItem() throws RecognitionException {
		ASTTupleItem n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1599:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
			// Generator.g:1600:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem7760); if (state.failed) return n;
			// Generator.g:1601:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==COLON) ) {
				int LA146_1 = input.LA(2);
				if ( (synpred1_Generator()) ) {
					alt146=1;
				}
				else if ( (true) ) {
					alt146=2;
				}

			}
			else if ( (LA146_0==EQUAL) ) {
				alt146=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}

			switch (alt146) {
				case 1 :
					// Generator.g:1604:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
					{
					match(input,COLON,FOLLOW_COLON_in_tupleItem7799); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_tupleItem7803);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem7805); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_tupleItem7809);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?((GeneratorParser.expression_return)e).n:null)); }
					}
					break;
				case 2 :
					// Generator.g:1607:7: ( COLON | EQUAL ) e= expression
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
					pushFollow(FOLLOW_expression_in_tupleItem7841);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?((GeneratorParser.expression_return)e).n:null)); }
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
	// Generator.g:1618:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
	public final ASTType type() throws RecognitionException {
		ASTType n = null;


		ASTSimpleType nTSimple =null;
		ASTCollectionType nTCollection =null;
		ASTTupleType nTTuple =null;

		 Token tok = null; 
		try {
			// Generator.g:1620:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
			// Generator.g:1621:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }
			// Generator.g:1622:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			int alt147=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt147=1;
				}
				break;
			case 46:
			case 48:
			case 51:
			case 52:
			case 53:
				{
				alt147=2;
				}
				break;
			case 54:
				{
				alt147=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 147, 0, input);
				throw nvae;
			}
			switch (alt147) {
				case 1 :
					// Generator.g:1623:7: nTSimple= simpleType
					{
					pushFollow(FOLLOW_simpleType_in_type7907);
					nTSimple=simpleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 2 :
					// Generator.g:1624:7: nTCollection= collectionType
					{
					pushFollow(FOLLOW_collectionType_in_type7919);
					nTCollection=collectionType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 3 :
					// Generator.g:1625:7: nTTuple= tupleType
					{
					pushFollow(FOLLOW_tupleType_in_type7931);
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
	// Generator.g:1630:1: typeOnly returns [ASTType n] : nT= type EOF ;
	public final ASTType typeOnly() throws RecognitionException {
		ASTType n = null;


		ASTType nT =null;

		try {
			// Generator.g:1631:5: (nT= type EOF )
			// Generator.g:1632:5: nT= type EOF
			{
			pushFollow(FOLLOW_type_in_typeOnly7963);
			nT=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_typeOnly7965); if (state.failed) return n;
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
	// Generator.g:1642:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
	public final ASTSimpleType simpleType() throws RecognitionException {
		ASTSimpleType n = null;


		Token name=null;

		try {
			// Generator.g:1643:5: (name= IDENT )
			// Generator.g:1644:5: name= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType7993); if (state.failed) return n;
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
	// Generator.g:1652:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
	public final ASTCollectionType collectionType() throws RecognitionException {
		ASTCollectionType n = null;


		ASTType elemType =null;

		 Token op = null; 
		try {
			// Generator.g:1654:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
			// Generator.g:1655:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
			{
			if ( state.backtracking==0 ) { op = input.LT(1); }
			if ( input.LA(1)==46||input.LA(1)==48||(input.LA(1) >= 51 && input.LA(1) <= 53) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_collectionType8058); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_collectionType8062);
			elemType=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_collectionType8064); if (state.failed) return n;
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
	// Generator.g:1665:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
	public final ASTTupleType tupleType() throws RecognitionException {
		ASTTupleType n = null;


		ASTTuplePart tp =null;

		 List tpList = new ArrayList(); 
		try {
			// Generator.g:1667:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
			// Generator.g:1668:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
			{
			match(input,54,FOLLOW_54_in_tupleType8098); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_tupleType8100); if (state.failed) return n;
			pushFollow(FOLLOW_tuplePart_in_tupleType8109);
			tp=tuplePart();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tpList.add(tp); }
			// Generator.g:1670:5: ( COMMA tp= tuplePart )*
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==COMMA) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// Generator.g:1670:7: COMMA tp= tuplePart
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleType8120); if (state.failed) return n;
					pushFollow(FOLLOW_tuplePart_in_tupleType8124);
					tp=tuplePart();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tpList.add(tp); }
					}
					break;

				default :
					break loop148;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_tupleType8136); if (state.failed) return n;
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
	// Generator.g:1679:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
	public final ASTTuplePart tuplePart() throws RecognitionException {
		ASTTuplePart n = null;


		Token name=null;
		ASTType t =null;

		try {
			// Generator.g:1680:5: (name= IDENT COLON t= type )
			// Generator.g:1681:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart8168); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_tuplePart8170); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_tuplePart8174);
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
	// Generator.g:1720:1: statOnly returns [ASTStatement n] : s= stat EOF ;
	public final ASTStatement statOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;

		try {
			// Generator.g:1721:3: (s= stat EOF )
			// Generator.g:1722:3: s= stat EOF
			{
			pushFollow(FOLLOW_stat_in_statOnly8223);
			s=stat();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_statOnly8227); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = (s!=null?((GeneratorParser.stat_return)s).n:null); }
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
	// Generator.g:1732:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
	public final GeneratorParser.stat_return stat() throws RecognitionException {
		GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
		retval.start = input.LT(1);

		ASTStatement s =null;
		ASTStatement s2 =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// Generator.g:1736:3: (s= singleStat ( SEMI s2= singleStat )* )
			// Generator.g:1737:3: s= singleStat ( SEMI s2= singleStat )*
			{
			pushFollow(FOLLOW_singleStat_in_stat8262);
			s=singleStat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {seq.addStatement(s);}
			// Generator.g:1738:3: ( SEMI s2= singleStat )*
			loop149:
			while (true) {
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==SEMI) ) {
					alt149=1;
				}

				switch (alt149) {
				case 1 :
					// Generator.g:1739:5: SEMI s2= singleStat
					{
					match(input,SEMI,FOLLOW_SEMI_in_stat8274); if (state.failed) return retval;
					pushFollow(FOLLOW_singleStat_in_stat8284);
					s2=singleStat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {seq.addStatement(s2); }
					}
					break;

				default :
					break loop149;
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
	// Generator.g:1751:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
			// Generator.g:1752:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
			int alt150=11;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==EOF||LA150_0==SEMI||(LA150_0 >= 73 && LA150_0 <= 74)) ) {
				alt150=1;
			}
			else if ( (LA150_0==88) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==MINUS||LA150_0==PLUS||LA150_0==91) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==115) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==78) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==INT) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==REAL) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==STRING) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==HASH) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==IDENT) ) {
				int LA150_13 = input.LA(2);
				if ( (synpred2_Generator()) ) {
					alt150=2;
				}
				else if ( (true) ) {
					alt150=3;
				}

			}
			else if ( (LA150_0==46||(LA150_0 >= 51 && LA150_0 <= 53)) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==94) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==48) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==99) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==55) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==92) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==54) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==STAR) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==AT) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==87) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==93||(LA150_0 >= 97 && LA150_0 <= 98)||(LA150_0 >= 108 && LA150_0 <= 109)) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( ((LA150_0 >= 95 && LA150_0 <= 96)) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==LPAREN) && (synpred2_Generator())) {
				alt150=2;
			}
			else if ( (LA150_0==81) ) {
				int LA150_27 = input.LA(2);
				if ( (synpred2_Generator()) ) {
					alt150=2;
				}
				else if ( (true) ) {
					alt150=8;
				}

			}
			else if ( (LA150_0==90) ) {
				alt150=4;
			}
			else if ( (LA150_0==70) ) {
				alt150=5;
			}
			else if ( (LA150_0==84) ) {
				alt150=6;
			}
			else if ( (LA150_0==69) ) {
				alt150=7;
			}
			else if ( (LA150_0==79) ) {
				alt150=9;
			}
			else if ( (LA150_0==117) ) {
				alt150=10;
			}
			else if ( (LA150_0==62) ) {
				alt150=11;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}

			switch (alt150) {
				case 1 :
					// Generator.g:1753:5: emp= emptyStat
					{
					pushFollow(FOLLOW_emptyStat_in_singleStat8324);
					emp=emptyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = emp; }
					}
					break;
				case 2 :
					// Generator.g:1755:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
					{
					pushFollow(FOLLOW_statStartingWithExpr_in_singleStat8350);
					sse=statStartingWithExpr();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (sse!=null?((GeneratorParser.statStartingWithExpr_return)sse).n:null); }
					}
					break;
				case 3 :
					// Generator.g:1756:5: vas= varAssignStat
					{
					pushFollow(FOLLOW_varAssignStat_in_singleStat8362);
					vas=varAssignStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = vas; }
					}
					break;
				case 4 :
					// Generator.g:1757:5: ocs= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_singleStat8376);
					ocs=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ocs!=null?((GeneratorParser.objCreateStat_return)ocs).n:null); }
					}
					break;
				case 5 :
					// Generator.g:1758:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleStat8390);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((GeneratorParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 6 :
					// Generator.g:1759:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleStat8403);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((GeneratorParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 7 :
					// Generator.g:1760:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleStat8420);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((GeneratorParser.lnkDelStat_return)lds).n:null); }
					}
					break;
				case 8 :
					// Generator.g:1761:5: ces= condExStat
					{
					pushFollow(FOLLOW_condExStat_in_singleStat8437);
					ces=condExStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ces!=null?((GeneratorParser.condExStat_return)ces).n:null); }
					}
					break;
				case 9 :
					// Generator.g:1762:5: its= iterStat
					{
					pushFollow(FOLLOW_iterStat_in_singleStat8454);
					its=iterStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (its!=null?((GeneratorParser.iterStat_return)its).n:null); }
					}
					break;
				case 10 :
					// Generator.g:1764:5: whs= whileStat
					{
					pushFollow(FOLLOW_whileStat_in_singleStat8476);
					whs=whileStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (whs!=null?((GeneratorParser.whileStat_return)whs).n:null); }
					}
					break;
				case 11 :
					// Generator.g:1765:5: blk= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_singleStat8494);
					blk=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (blk!=null?((GeneratorParser.blockStat_return)blk).n:null); }
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
	// Generator.g:1772:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
	public final ASTEmptyStatement emptyStat() throws RecognitionException {
		ASTEmptyStatement n = null;


		try {
			// Generator.g:1773:3: ( nothing )
			// Generator.g:1774:3: nothing
			{
			pushFollow(FOLLOW_nothing_in_emptyStat8521);
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
	// Generator.g:1779:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
	public final GeneratorParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
		GeneratorParser.statStartingWithExpr_return retval = new GeneratorParser.statStartingWithExpr_return();
		retval.start = input.LT(1);

		ASTExpression expr =null;
		ASTAttributeAssignmentStatement aas =null;

		try {
			// Generator.g:1780:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
			// Generator.g:1781:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
			{
			pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr8547);
			expr=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			// Generator.g:1782:3: (aas= attAssignStat[$expr.n] )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==DOT) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// Generator.g:1783:5: aas= attAssignStat[$expr.n]
					{
					pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr8561);
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
	// Generator.g:1795:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
	public final ASTStatement varAssignStat() throws RecognitionException {
		ASTStatement n = null;


		Token varName=null;
		ASTRValue rVal =null;

		try {
			// Generator.g:1796:3: (varName= IDENT COLON_EQUAL rVal= rValue )
			// Generator.g:1797:3: varName= IDENT COLON_EQUAL rVal= rValue
			{
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat8599); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat8603); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_varAssignStat8611);
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
	// Generator.g:1809:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
	public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
		ASTAttributeAssignmentStatement n = null;


		Token attName=null;
		ASTRValue r =null;

		try {
			// Generator.g:1810:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
			// Generator.g:1811:3: DOT attName= IDENT COLON_EQUAL r= rValue
			{
			match(input,DOT,FOLLOW_DOT_in_attAssignStat8635); if (state.failed) return n;
			attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat8644); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat8648); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_attAssignStat8656);
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
	// Generator.g:1823:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
	public final GeneratorParser.objCreateStat_return objCreateStat() throws RecognitionException {
		GeneratorParser.objCreateStat_return retval = new GeneratorParser.objCreateStat_return();
		retval.start = input.LT(1);

		ASTSimpleType ident =null;
		ASTExpression objName =null;
		ParserRuleReturnScope p =null;

		try {
			// Generator.g:1824:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
			// Generator.g:1825:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			{
			match(input,90,FOLLOW_90_in_objCreateStat8682); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_objCreateStat8690);
			ident=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			// Generator.g:1827:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==LPAREN) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// Generator.g:1828:5: LPAREN (objName= inSoilExpression )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8700); if (state.failed) return retval;
					// Generator.g:1829:7: (objName= inSoilExpression )?
					int alt152=2;
					int LA152_0 = input.LA(1);
					if ( (LA152_0==AT||LA152_0==HASH||(LA152_0 >= IDENT && LA152_0 <= INT)||(LA152_0 >= LPAREN && LA152_0 <= MINUS)||LA152_0==PLUS||LA152_0==REAL||(LA152_0 >= STAR && LA152_0 <= STRING)||LA152_0==46||LA152_0==48||(LA152_0 >= 51 && LA152_0 <= 55)||LA152_0==78||LA152_0==81||(LA152_0 >= 87 && LA152_0 <= 88)||(LA152_0 >= 91 && LA152_0 <= 99)||(LA152_0 >= 108 && LA152_0 <= 109)||LA152_0==115) ) {
						alt152=1;
					}
					switch (alt152) {
						case 1 :
							// Generator.g:1829:8: objName= inSoilExpression
							{
							pushFollow(FOLLOW_inSoilExpression_in_objCreateStat8713);
							objName=inSoilExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8721); if (state.failed) return retval;
					}
					break;

			}

			// Generator.g:1833:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==63) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// Generator.g:1834:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
					{
					match(input,63,FOLLOW_63_in_objCreateStat8739); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8747); if (state.failed) return retval;
					pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8761);
					p=rValListMin2WithOptionalQualifiers();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8769); if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = new ASTNewLinkObjectStatement((retval.start), ident, (p!=null?((GeneratorParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((GeneratorParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null), objName);
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
	// Generator.g:1853:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
	public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
		GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
		retval.start = input.LT(1);

		List<ASTExpression> el =null;

		try {
			// Generator.g:1854:3: ( 'destroy' el= exprListMin1 )
			// Generator.g:1855:3: 'destroy' el= exprListMin1
			{
			match(input,70,FOLLOW_70_in_objDestroyStat8805); if (state.failed) return retval;
			pushFollow(FOLLOW_exprListMin1_in_objDestroyStat8813);
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
	// Generator.g:1874:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
	public final GeneratorParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
		GeneratorParser.lnkInsStat_return retval = new GeneratorParser.lnkInsStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// Generator.g:1875:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
			// Generator.g:1876:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
			{
			match(input,84,FOLLOW_84_in_lnkInsStat8839); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat8843); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8853);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat8857); if (state.failed) return retval;
			match(input,85,FOLLOW_85_in_lnkInsStat8861); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat8869); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkInsertionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((GeneratorParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((GeneratorParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// Generator.g:1886:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
	public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
		GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
		retval.start = input.LT(1);

		ASTRValue r =null;
		List<ASTRValue> qualifierValues =null;


		  retval.participans = new ArrayList<ASTRValue>();
		  retval.qualifiers = new ArrayList<List<ASTRValue>>();
		  List<ASTRValue> currentQualifiers = Collections.emptyList();

		try {
			// Generator.g:1892:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
			// Generator.g:1893:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8898);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// Generator.g:1894:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==LBRACE) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// Generator.g:1895:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8909); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8918);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8925); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8941); if (state.failed) return retval;
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8952);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// Generator.g:1907:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==LBRACE) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// Generator.g:1908:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8963); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8972);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8979); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			// Generator.g:1917:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			loop158:
			while (true) {
				int alt158=2;
				int LA158_0 = input.LA(1);
				if ( (LA158_0==COMMA) ) {
					alt158=1;
				}

				switch (alt158) {
				case 1 :
					// Generator.g:1918:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9001); if (state.failed) return retval;
					pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9016);
					r=rValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.participans.add(r); }
					// Generator.g:1922:5: ( LBRACE qualifierValues= rValList RBRACE )?
					int alt157=2;
					int LA157_0 = input.LA(1);
					if ( (LA157_0==LBRACE) ) {
						alt157=1;
					}
					switch (alt157) {
						case 1 :
							// Generator.g:1923:6: LBRACE qualifierValues= rValList RBRACE
							{
							match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9036); if (state.failed) return retval;
							pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9047);
							qualifierValues=rValList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
							match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9056); if (state.failed) return retval;
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
					break loop158;
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
	// Generator.g:1938:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
	public final GeneratorParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
		GeneratorParser.lnkDelStat_return retval = new GeneratorParser.lnkDelStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// Generator.g:1939:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
			// Generator.g:1940:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
			{
			match(input,69,FOLLOW_69_in_lnkDelStat9097); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat9101); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat9111);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat9115); if (state.failed) return retval;
			match(input,80,FOLLOW_80_in_lnkDelStat9119); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat9128); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkDeletionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((GeneratorParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((GeneratorParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// Generator.g:1954:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
	public final GeneratorParser.condExStat_return condExStat() throws RecognitionException {
		GeneratorParser.condExStat_return retval = new GeneratorParser.condExStat_return();
		retval.start = input.LT(1);

		ASTExpression con =null;
		ASTStatement ts =null;
		ASTStatement es =null;


		  ASTStatement elseStat = new ASTEmptyStatement();

		try {
			// Generator.g:1958:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
			// Generator.g:1959:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
			{
			match(input,81,FOLLOW_81_in_condExStat9159); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_condExStat9168);
			con=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,113,FOLLOW_113_in_condExStat9172); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat9181);
			ts=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			// Generator.g:1963:3: ( 'else' es= statOrImplicitBlock )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==73) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// Generator.g:1964:5: 'else' es= statOrImplicitBlock
					{
					match(input,73,FOLLOW_73_in_condExStat9192); if (state.failed) return retval;
					pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat9204);
					es=statOrImplicitBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { elseStat = es; }
					}
					break;

			}

			match(input,74,FOLLOW_74_in_condExStat9216); if (state.failed) return retval;
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
	// Generator.g:1975:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final GeneratorParser.iterStat_return iterStat() throws RecognitionException {
		GeneratorParser.iterStat_return retval = new GeneratorParser.iterStat_return();
		retval.start = input.LT(1);

		Token var=null;
		ASTExpression set =null;
		ASTStatement s =null;

		try {
			// Generator.g:1976:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// Generator.g:1977:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,79,FOLLOW_79_in_iterStat9241); if (state.failed) return retval;
			var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat9249); if (state.failed) return retval;
			match(input,83,FOLLOW_83_in_iterStat9253); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_iterStat9261);
			set=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,72,FOLLOW_72_in_iterStat9265); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat9273);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,74,FOLLOW_74_in_iterStat9278); if (state.failed) return retval;
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
	// Generator.g:1992:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final GeneratorParser.whileStat_return whileStat() throws RecognitionException {
		GeneratorParser.whileStat_return retval = new GeneratorParser.whileStat_return();
		retval.start = input.LT(1);

		ASTExpression cond =null;
		ASTStatement s =null;

		try {
			// Generator.g:1993:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// Generator.g:1994:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,117,FOLLOW_117_in_whileStat9304); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_whileStat9312);
			cond=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,72,FOLLOW_72_in_whileStat9316); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat9324);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,74,FOLLOW_74_in_whileStat9329); if (state.failed) return retval;
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
	// Generator.g:2006:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
	public final GeneratorParser.blockStat_return blockStat() throws RecognitionException {
		GeneratorParser.blockStat_return retval = new GeneratorParser.blockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

		try {
			// Generator.g:2010:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
			// Generator.g:2011:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
			{
			match(input,62,FOLLOW_62_in_blockStat9359); if (state.failed) return retval;
			// Generator.g:2012:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==68) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// Generator.g:2012:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
					{
					match(input,68,FOLLOW_68_in_blockStat9364); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_blockStat9370);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
					// Generator.g:2012:73: ( COMMA vd1= variableDeclaration )*
					loop160:
					while (true) {
						int alt160=2;
						int LA160_0 = input.LA(1);
						if ( (LA160_0==COMMA) ) {
							alt160=1;
						}

						switch (alt160) {
						case 1 :
							// Generator.g:2012:75: COMMA vd1= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_blockStat9376); if (state.failed) return retval;
							pushFollow(FOLLOW_variableDeclaration_in_blockStat9382);
							vd1=variableDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
							}
							break;

						default :
							break loop160;
						}
					}

					match(input,SEMI,FOLLOW_SEMI_in_blockStat9389); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_stat_in_blockStat9399);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((GeneratorParser.stat_return)s).n:null)); }
			match(input,74,FOLLOW_74_in_blockStat9404); if (state.failed) return retval;
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
	// Generator.g:2021:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
	public final GeneratorParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
		GeneratorParser.implicitBlockStat_return retval = new GeneratorParser.implicitBlockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), false);

		try {
			// Generator.g:2025:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
			// Generator.g:2026:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
			{
			match(input,68,FOLLOW_68_in_implicitBlockStat9430); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9436);
			vd=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
			// Generator.g:2026:72: ( COMMA vd1= variableDeclaration )*
			loop162:
			while (true) {
				int alt162=2;
				int LA162_0 = input.LA(1);
				if ( (LA162_0==COMMA) ) {
					alt162=1;
				}

				switch (alt162) {
				case 1 :
					// Generator.g:2026:74: COMMA vd1= variableDeclaration
					{
					match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat9442); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9448);
					vd1=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
					}
					break;

				default :
					break loop162;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat9455); if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_implicitBlockStat9463);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((GeneratorParser.stat_return)s).n:null)); }
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
	// Generator.g:2030:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
	public final ASTStatement statOrImplicitBlock() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;

		try {
			// Generator.g:2031:3: ( (s1= stat |s2= implicitBlockStat ) )
			// Generator.g:2032:3: (s1= stat |s2= implicitBlockStat )
			{
			// Generator.g:2032:3: (s1= stat |s2= implicitBlockStat )
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==AT||LA163_0==HASH||(LA163_0 >= IDENT && LA163_0 <= INT)||(LA163_0 >= LPAREN && LA163_0 <= MINUS)||LA163_0==PLUS||LA163_0==REAL||LA163_0==SEMI||(LA163_0 >= STAR && LA163_0 <= STRING)||LA163_0==46||LA163_0==48||(LA163_0 >= 51 && LA163_0 <= 55)||LA163_0==62||(LA163_0 >= 69 && LA163_0 <= 70)||(LA163_0 >= 73 && LA163_0 <= 74)||(LA163_0 >= 78 && LA163_0 <= 79)||LA163_0==81||LA163_0==84||(LA163_0 >= 87 && LA163_0 <= 88)||(LA163_0 >= 90 && LA163_0 <= 99)||(LA163_0 >= 108 && LA163_0 <= 109)||LA163_0==115||LA163_0==117) ) {
				alt163=1;
			}
			else if ( (LA163_0==68) ) {
				alt163=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 163, 0, input);
				throw nvae;
			}

			switch (alt163) {
				case 1 :
					// Generator.g:2032:4: s1= stat
					{
					pushFollow(FOLLOW_stat_in_statOrImplicitBlock9486);
					s1=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s1!=null?((GeneratorParser.stat_return)s1).n:null); }
					}
					break;
				case 2 :
					// Generator.g:2032:31: s2= implicitBlockStat
					{
					pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock9496);
					s2=implicitBlockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s2!=null?((GeneratorParser.implicitBlockStat_return)s2).n:null); }
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
	// Generator.g:2046:1: nothing :;
	public final void nothing() throws RecognitionException {
		try {
			// Generator.g:2047:1: ()
			// Generator.g:2048:1: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nothing"



	// $ANTLR start "rValue"
	// Generator.g:2054:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
	public final ASTRValue rValue() throws RecognitionException {
		ASTRValue n = null;


		ASTExpression e =null;
		ParserRuleReturnScope oc =null;

		try {
			// Generator.g:2055:5: (e= inSoilExpression |oc= objCreateStat )
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==AT||LA164_0==HASH||(LA164_0 >= IDENT && LA164_0 <= INT)||(LA164_0 >= LPAREN && LA164_0 <= MINUS)||LA164_0==PLUS||LA164_0==REAL||(LA164_0 >= STAR && LA164_0 <= STRING)||LA164_0==46||LA164_0==48||(LA164_0 >= 51 && LA164_0 <= 55)||LA164_0==78||LA164_0==81||(LA164_0 >= 87 && LA164_0 <= 88)||(LA164_0 >= 91 && LA164_0 <= 99)||(LA164_0 >= 108 && LA164_0 <= 109)||LA164_0==115) ) {
				alt164=1;
			}
			else if ( (LA164_0==90) ) {
				alt164=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// Generator.g:2056:5: e= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_rValue9542);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }
					}
					break;
				case 2 :
					// Generator.g:2057:5: oc= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_rValue9554);
					oc=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { 
					    if ((oc!=null?((GeneratorParser.objCreateStat_return)oc).n:null) instanceof ASTNewLinkObjectStatement)
					    	n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)(oc!=null?((GeneratorParser.objCreateStat_return)oc).n:null));
					    else
					    	n = new ASTRValueNewObject((ASTNewObjectStatement)(oc!=null?((GeneratorParser.objCreateStat_return)oc).n:null));
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
	// Generator.g:2070:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
	public final List<ASTRValue> rValList() throws RecognitionException {
		List<ASTRValue> n = null;


		List<ASTRValue> rl =null;

		try {
			// Generator.g:2071:3: ( nothing |rl= rValListMin1 )
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==RBRACE) ) {
				alt165=1;
			}
			else if ( (LA165_0==AT||LA165_0==HASH||(LA165_0 >= IDENT && LA165_0 <= INT)||(LA165_0 >= LPAREN && LA165_0 <= MINUS)||LA165_0==PLUS||LA165_0==REAL||(LA165_0 >= STAR && LA165_0 <= STRING)||LA165_0==46||LA165_0==48||(LA165_0 >= 51 && LA165_0 <= 55)||LA165_0==78||LA165_0==81||(LA165_0 >= 87 && LA165_0 <= 88)||(LA165_0 >= 90 && LA165_0 <= 99)||(LA165_0 >= 108 && LA165_0 <= 109)||LA165_0==115) ) {
				alt165=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// Generator.g:2072:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_rValList9577);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }
					}
					break;
				case 2 :
					// Generator.g:2075:3: rl= rValListMin1
					{
					pushFollow(FOLLOW_rValListMin1_in_rValList9604);
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
	// Generator.g:2083:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin1() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// Generator.g:2087:3: (r= rValue ( COMMA r= rValue )* )
			// Generator.g:2088:3: r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin19637);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// Generator.g:2090:3: ( COMMA r= rValue )*
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==COMMA) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// Generator.g:2091:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin19651); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin19661);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop166;
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
	// Generator.g:2101:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin2() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// Generator.g:2105:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
			// Generator.g:2106:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin29700);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin29708); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_rValListMin29716);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// Generator.g:2111:3: ( COMMA r= rValue )*
			loop167:
			while (true) {
				int alt167=2;
				int LA167_0 = input.LA(1);
				if ( (LA167_0==COMMA) ) {
					alt167=1;
				}

				switch (alt167) {
				case 1 :
					// Generator.g:2112:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin29730); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin29740);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop167;
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
	// Generator.g:2122:1: inSoilExpression returns [ASTExpression n] : e= expression ;
	public final ASTExpression inSoilExpression() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope e =null;

		try {
			// Generator.g:2123:3: (e= expression )
			// Generator.g:2124:3: e= expression
			{
			pushFollow(FOLLOW_expression_in_inSoilExpression9774);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if ((e!=null?((GeneratorParser.expression_return)e).n:null) != null) (e!=null?((GeneratorParser.expression_return)e).n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }
			if ( state.backtracking==0 ) { n = (e!=null?((GeneratorParser.expression_return)e).n:null); }
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
	// Generator.g:2133:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
	public final List<ASTExpression> exprList() throws RecognitionException {
		List<ASTExpression> n = null;


		List<ASTExpression> el =null;

		try {
			// Generator.g:2134:3: ( nothing |el= exprListMin1 )
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==EOF) ) {
				alt168=1;
			}
			else if ( (LA168_0==AT||LA168_0==HASH||(LA168_0 >= IDENT && LA168_0 <= INT)||(LA168_0 >= LPAREN && LA168_0 <= MINUS)||LA168_0==PLUS||LA168_0==REAL||(LA168_0 >= STAR && LA168_0 <= STRING)||LA168_0==46||LA168_0==48||(LA168_0 >= 51 && LA168_0 <= 55)||LA168_0==78||LA168_0==81||(LA168_0 >= 87 && LA168_0 <= 88)||(LA168_0 >= 91 && LA168_0 <= 99)||(LA168_0 >= 108 && LA168_0 <= 109)||LA168_0==115) ) {
				alt168=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 168, 0, input);
				throw nvae;
			}

			switch (alt168) {
				case 1 :
					// Generator.g:2135:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_exprList9803);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }
					}
					break;
				case 2 :
					// Generator.g:2138:3: el= exprListMin1
					{
					pushFollow(FOLLOW_exprListMin1_in_exprList9821);
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
	// Generator.g:2146:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin1() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// Generator.g:2150:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// Generator.g:2151:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin19854);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// Generator.g:2153:3: ( COMMA e= inSoilExpression )*
			loop169:
			while (true) {
				int alt169=2;
				int LA169_0 = input.LA(1);
				if ( (LA169_0==COMMA) ) {
					alt169=1;
				}

				switch (alt169) {
				case 1 :
					// Generator.g:2154:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin19869); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin19879);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop169;
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
	// Generator.g:2164:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin2() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// Generator.g:2168:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// Generator.g:2169:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin29919);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			match(input,COMMA,FOLLOW_COMMA_in_exprListMin29927); if (state.failed) return n;
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin29935);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// Generator.g:2174:3: ( COMMA e= inSoilExpression )*
			loop170:
			while (true) {
				int alt170=2;
				int LA170_0 = input.LA(1);
				if ( (LA170_0==COMMA) ) {
					alt170=1;
				}

				switch (alt170) {
				case 1 :
					// Generator.g:2175:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin29949); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin29959);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop170;
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
	// Generator.g:2185:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
	public final List<String> identList() throws RecognitionException {
		List<String> n = null;


		List<String> il =null;

		try {
			// Generator.g:2186:3: ( nothing |il= identListMin1 )
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==EOF||LA171_0==RBRACE||LA171_0==SEMI||(LA171_0 >= 73 && LA171_0 <= 74)) ) {
				alt171=1;
			}
			else if ( (LA171_0==IDENT) ) {
				alt171=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 171, 0, input);
				throw nvae;
			}

			switch (alt171) {
				case 1 :
					// Generator.g:2187:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_identList9989);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<String>(); }
					}
					break;
				case 2 :
					// Generator.g:2190:3: il= identListMin1
					{
					pushFollow(FOLLOW_identListMin1_in_identList10006);
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
	// Generator.g:2198:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
	public final List<String> identListMin1() throws RecognitionException {
		List<String> n = null;


		Token id=null;


		  n = new ArrayList<String>();

		try {
			// Generator.g:2202:3: (id= IDENT ( COMMA id= IDENT )* )
			// Generator.g:2203:3: id= IDENT ( COMMA id= IDENT )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin110040); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }
			// Generator.g:2205:3: ( COMMA id= IDENT )*
			loop172:
			while (true) {
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==COMMA) ) {
					alt172=1;
				}

				switch (alt172) {
				case 1 :
					// Generator.g:2206:5: COMMA id= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_identListMin110054); if (state.failed) return n;
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin110064); if (state.failed) return n;
					if ( state.backtracking==0 ) {
					    n.add((id!=null?id.getText():null)); }
					}
					break;

				default :
					break loop172;
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

	// $ANTLR start synpred1_Generator
	public final void synpred1_Generator_fragment() throws RecognitionException {
		// Generator.g:1604:7: ( COLON type EQUAL )
		// Generator.g:1604:8: COLON type EQUAL
		{
		match(input,COLON,FOLLOW_COLON_in_synpred1_Generator7790); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred1_Generator7792);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator7794); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Generator

	// $ANTLR start synpred2_Generator
	public final void synpred2_Generator_fragment() throws RecognitionException {
		// Generator.g:1755:5: ( statStartingWithExpr )
		// Generator.g:1755:6: statStartingWithExpr
		{
		pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator8342);
		statStartingWithExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Generator

	// Delegated rules

	public final boolean synpred1_Generator() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Generator_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Generator() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Generator_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA21 dfa21 = new DFA21(this);
	protected DFA57 dfa57 = new DFA57(this);
	protected DFA74 dfa74 = new DFA74(this);
	protected DFA79 dfa79 = new DFA79(this);
	static final String DFA21_eotS =
		"\41\uffff";
	static final String DFA21_eofS =
		"\1\1\40\uffff";
	static final String DFA21_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\24\2\uffff\1\32\1\30\1\12\1\uffff\1\15\1\uffff"+
		"\1\24\1\5\1\15\1\12\1\uffff\1\36\1\24\1\12\1\15\2\5\2\24\1\12\1\30\1\32"+
		"\1\12\1\15\1\36\1\12";
	static final String DFA21_maxS =
		"\1\114\1\uffff\1\24\1\uffff\1\24\2\uffff\1\32\1\156\1\45\1\uffff\1\15"+
		"\1\uffff\1\24\1\163\1\15\1\45\1\uffff\1\36\1\24\1\45\1\15\1\114\1\163"+
		"\2\24\1\45\1\156\1\32\1\45\1\15\1\36\1\45";
	static final String DFA21_acceptS =
		"\1\uffff\1\6\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\1\uffff\1\1\4\uffff"+
		"\1\5\17\uffff";
	static final String DFA21_specialS =
		"\41\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\2\16\uffff\1\4\43\uffff\1\3\2\uffff\2\3\4\uffff\1\5\12\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\10",
			"",
			"",
			"\1\11",
			"\1\3\44\uffff\1\3\1\uffff\1\12\1\uffff\1\3\10\uffff\1\3\31\uffff\1\3"+
			"\11\uffff\1\3",
			"\1\15\11\uffff\1\13\20\uffff\1\14",
			"",
			"\1\16",
			"",
			"\1\17",
			"\1\21\11\uffff\1\21\4\uffff\3\21\7\uffff\1\20\13\uffff\1\21\43\uffff"+
			"\1\21\44\uffff\1\21",
			"\1\22",
			"\1\23\32\uffff\1\14",
			"",
			"\1\24",
			"\1\25",
			"\1\15\32\uffff\1\26",
			"\1\27",
			"\1\31\16\uffff\1\30\43\uffff\1\3\2\uffff\2\14\17\uffff\1\6",
			"\1\21\11\uffff\1\21\4\uffff\3\21\7\uffff\1\32\13\uffff\1\21\43\uffff"+
			"\1\21\44\uffff\1\21",
			"\1\33",
			"\1\34",
			"\1\23\32\uffff\1\14",
			"\1\14\44\uffff\1\14\1\uffff\1\12\1\uffff\1\14\10\uffff\1\14\31\uffff"+
			"\1\14\11\uffff\1\14",
			"\1\35",
			"\1\15\11\uffff\1\36\20\uffff\1\26",
			"\1\37",
			"\1\40",
			"\1\15\32\uffff\1\26"
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 403:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )*";
		}
	}

	static final String DFA57_eotS =
		"\16\uffff";
	static final String DFA57_eofS =
		"\16\uffff";
	static final String DFA57_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\15\1\24\1\5\1\36\1\15\1\12\1\36"+
		"\1\12";
	static final String DFA57_maxS =
		"\1\156\1\uffff\1\24\1\uffff\1\32\1\45\1\15\1\24\1\150\1\36\1\15\1\45\1"+
		"\36\1\45";
	static final String DFA57_acceptS =
		"\1\uffff\1\2\1\uffff\1\1\12\uffff";
	static final String DFA57_specialS =
		"\16\uffff}>";
	static final String[] DFA57_transitionS = {
			"\1\2\16\uffff\1\1\21\uffff\1\1\32\uffff\1\1\10\uffff\1\1\34\uffff\2\3"+
			"\5\uffff\1\1",
			"",
			"\1\4",
			"",
			"\1\5",
			"\1\7\11\uffff\1\6\20\uffff\1\10",
			"\1\11",
			"\1\12",
			"\1\2\16\uffff\1\1\122\uffff\2\3",
			"\1\13",
			"\1\14",
			"\1\7\32\uffff\1\10",
			"\1\15",
			"\1\7\32\uffff\1\10"
	};

	static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
	static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
	static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
	static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
	static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
	static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
	static final short[][] DFA57_transition;

	static {
		int numStates = DFA57_transitionS.length;
		DFA57_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
		}
	}

	protected class DFA57 extends DFA {

		public DFA57(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 57;
			this.eot = DFA57_eot;
			this.eof = DFA57_eof;
			this.min = DFA57_min;
			this.max = DFA57_max;
			this.accept = DFA57_accept;
			this.special = DFA57_special;
			this.transition = DFA57_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 655:5: (ppc= prePostClause )*";
		}
	}

	static final String DFA74_eotS =
		"\31\uffff";
	static final String DFA74_eofS =
		"\1\1\6\uffff\1\1\21\uffff";
	static final String DFA74_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\15\1\5\1\24\1\5\1\15\1\12\1\36\1"+
		"\24\1\12\1\15\2\5\1\24\1\12\1\32\1\12\1\15\1\36\1\12";
	static final String DFA74_maxS =
		"\1\126\1\uffff\1\24\1\uffff\1\32\1\45\1\15\1\126\1\24\1\163\1\15\1\45"+
		"\1\36\1\24\1\45\1\15\1\126\1\163\1\24\1\45\1\32\1\45\1\15\1\36\1\45";
	static final String DFA74_acceptS =
		"\1\uffff\1\2\1\uffff\1\1\25\uffff";
	static final String DFA74_specialS =
		"\31\uffff}>";
	static final String[] DFA74_transitionS = {
			"\1\2\16\uffff\1\1\43\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff\1\1\1"+
			"\3\10\uffff\1\3",
			"",
			"\1\4",
			"",
			"\1\5",
			"\1\10\11\uffff\1\6\20\uffff\1\7",
			"\1\11",
			"\1\2\16\uffff\1\1\43\uffff\1\1\2\uffff\2\1\4\uffff\1\1\12\uffff\1\1"+
			"\11\uffff\1\3",
			"\1\12",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\13\13\uffff\1\1\43\uffff\1\1"+
			"\44\uffff\1\1",
			"\1\14",
			"\1\15\32\uffff\1\7",
			"\1\16",
			"\1\17",
			"\1\10\32\uffff\1\20",
			"\1\21",
			"\1\22\16\uffff\1\1\43\uffff\1\1\2\uffff\2\1\17\uffff\1\1\11\uffff\1"+
			"\3",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\23\13\uffff\1\1\43\uffff\1\1"+
			"\44\uffff\1\1",
			"\1\24",
			"\1\15\32\uffff\1\7",
			"\1\25",
			"\1\10\11\uffff\1\26\20\uffff\1\20",
			"\1\27",
			"\1\30",
			"\1\10\32\uffff\1\20"
	};

	static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
	static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
	static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
	static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
	static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
	static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
	static final short[][] DFA74_transition;

	static {
		int numStates = DFA74_transitionS.length;
		DFA74_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
		}
	}

	protected class DFA74 extends DFA {

		public DFA74(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 74;
			this.eot = DFA74_eot;
			this.eof = DFA74_eof;
			this.min = DFA74_min;
			this.max = DFA74_max;
			this.accept = DFA74_accept;
			this.special = DFA74_special;
			this.transition = DFA74_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 776:5: (inv= invariantClause )*";
		}
	}

	static final String DFA79_eotS =
		"\31\uffff";
	static final String DFA79_eofS =
		"\1\1\6\uffff\1\1\21\uffff";
	static final String DFA79_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\15\1\5\1\24\1\5\1\15\1\12\1\36\1"+
		"\24\1\12\1\15\2\5\1\24\1\12\1\32\1\12\1\15\1\36\1\12";
	static final String DFA79_maxS =
		"\1\150\1\uffff\1\24\1\uffff\1\32\1\45\1\15\1\150\1\24\1\163\1\15\1\45"+
		"\1\36\1\24\1\45\1\15\1\150\1\163\1\24\1\45\1\32\1\45\1\15\1\36\1\45";
	static final String DFA79_acceptS =
		"\1\uffff\1\2\1\uffff\1\1\25\uffff";
	static final String DFA79_specialS =
		"\31\uffff}>";
	static final String[] DFA79_transitionS = {
			"\1\2\16\uffff\1\1\43\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff\1\1\32"+
			"\uffff\2\3",
			"",
			"\1\4",
			"",
			"\1\5",
			"\1\10\11\uffff\1\6\20\uffff\1\7",
			"\1\11",
			"\1\2\16\uffff\1\1\43\uffff\1\1\2\uffff\2\1\4\uffff\1\1\12\uffff\1\1"+
			"\32\uffff\2\3",
			"\1\12",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\13\13\uffff\1\1\43\uffff\1\1"+
			"\44\uffff\1\1",
			"\1\14",
			"\1\15\32\uffff\1\7",
			"\1\16",
			"\1\17",
			"\1\10\32\uffff\1\20",
			"\1\21",
			"\1\22\16\uffff\1\1\43\uffff\1\1\2\uffff\2\1\17\uffff\1\1\32\uffff\2"+
			"\3",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\23\13\uffff\1\1\43\uffff\1\1"+
			"\44\uffff\1\1",
			"\1\24",
			"\1\15\32\uffff\1\7",
			"\1\25",
			"\1\10\11\uffff\1\26\20\uffff\1\20",
			"\1\27",
			"\1\30",
			"\1\10\32\uffff\1\20"
	};

	static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
	static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
	static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
	static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
	static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
	static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
	static final short[][] DFA79_transition;

	static {
		int numStates = DFA79_transitionS.length;
		DFA79_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
		}
	}

	protected class DFA79 extends DFA {

		public DFA79(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 79;
			this.eot = DFA79_eot;
			this.eof = DFA79_eof;
			this.min = DFA79_min;
			this.max = DFA79_max;
			this.accept = DFA79_accept;
			this.special = DFA79_special;
			this.transition = DFA79_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 804:5: (ppc= prePostClause )+";
		}
	}

	public static final BitSet FOLLOW_invariant_in_invariantListOnly80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_EOF_in_invariantListOnly91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_in_procedureListOnly136 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_EOF_in_procedureListOnly151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_procedure179 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_procedure183 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_procedure185 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_variableDeclarationList_in_procedure189 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_procedure191 = new BitSet(new long[]{0x4000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_procedure199 = new BitSet(new long[]{0x0000004000100000L});
	public static final BitSet FOLLOW_variableDeclarationList_in_procedure203 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMI_in_procedure205 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_procedure214 = new BitSet(new long[]{0x0006A00000900000L,0x0000000000028400L});
	public static final BitSet FOLLOW_instructionList_in_procedure218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_procedure220 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMI_in_procedure222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList260 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_variableDeclarationList271 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_instruction_in_instructionList319 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMI_in_instructionList321 = new BitSet(new long[]{0x0006A00000900002L,0x0000000000028000L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeAssignment_in_instruction371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_instruction385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicInstruction_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifThenElse_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asslCall_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_opEnter_in_instruction448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_opExit_in_instruction465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_barrier_in_instruction482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableAssignment513 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_variableAssignment515 = new BitSet(new long[]{0x0000000000900000L});
	public static final BitSet FOLLOW_valueInstruction_in_variableAssignment519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oclExpression_in_attributeAssignment551 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_attributeAssignment553 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_attributeAssignment557 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_attributeAssignment565 = new BitSet(new long[]{0x0000000000900000L});
	public static final BitSet FOLLOW_valueInstruction_in_attributeAssignment569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_loop601 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_loop605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_loop607 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_oclExpression_in_loop611 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_loop613 = new BitSet(new long[]{0x0006A00000900000L,0x0000000000028400L});
	public static final BitSet FOLLOW_instructionList_in_loop624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_loop626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_ifThenElse662 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_oclExpression_in_ifThenElse666 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_ifThenElse677 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_ifThenElse679 = new BitSet(new long[]{0x0006A00000900000L,0x0000000000028400L});
	public static final BitSet FOLLOW_instructionList_in_ifThenElse683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_ifThenElse685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_ifThenElse696 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_ifThenElse698 = new BitSet(new long[]{0x0006A00000900000L,0x0000000000028400L});
	public static final BitSet FOLLOW_instructionList_in_ifThenElse702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_ifThenElse704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicInstruction_in_valueInstruction744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oclExpression_in_valueInstruction758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_atomicInstruction788 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_atomicInstruction792 = new BitSet(new long[]{0x0000002000900000L});
	public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction806 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_atomicInstruction824 = new BitSet(new long[]{0x0000000000900000L});
	public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction828 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_atomicInstruction876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_asslCall899 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_asslCall903 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_asslCall907 = new BitSet(new long[]{0x0000002000800000L});
	public static final BitSet FOLLOW_oclExpression_in_asslCall921 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_asslCall939 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_oclExpression_in_asslCall943 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_asslCall991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_opEnter1014 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_oclExpression_in_opEnter1018 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_opEnter1022 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_opEnter1026 = new BitSet(new long[]{0x0000002000800000L});
	public static final BitSet FOLLOW_oclExpression_in_opEnter1041 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_opEnter1059 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_oclExpression_in_opEnter1063 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_opEnter1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_opExit1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oclExpression_in_instructionParameter1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instrParameterIdent_in_instructionParameter1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_instrParameterIdent1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_oclExpression1231 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_oclExpression1235 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_oclExpression1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_barrier1265 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_barrier1270 = new BitSet(new long[]{0x0000000000900000L});
	public static final BitSet FOLLOW_IDENT_in_barrier1285 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_barrier1287 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_barrier1293 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_oclExpression_in_barrier1309 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_barrier1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_procedureCallOnly1345 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_procedureCallOnly1353 = new BitSet(new long[]{0x00F946310C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_procedureCallOnly1364 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_procedureCallOnly1374 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_procedureCallOnly1378 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_procedureCallOnly1392 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_procedureCallOnly1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_model1432 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_model1438 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_model1442 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001002L});
	public static final BitSet FOLLOW_generalClassifierDefinition_in_model1454 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001002L});
	public static final BitSet FOLLOW_associationDefinition_in_model1467 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001002L});
	public static final BitSet FOLLOW_65_in_model1481 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001006L});
	public static final BitSet FOLLOW_invariant_in_model1499 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001006L});
	public static final BitSet FOLLOW_prePost_in_model1520 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001006L});
	public static final BitSet FOLLOW_enumTypeDefinition_in_model1560 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001002L});
	public static final BitSet FOLLOW_capAnnotation_in_model1574 = new BitSet(new long[]{0x1900000000100020L,0x0000000000001002L});
	public static final BitSet FOLLOW_EOF_in_model1595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_enumTypeDefinition1629 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition1633 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition1635 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_enumTypeDefinition1639 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition1641 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyDataType_in_dataTypeDefinition1682 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_dataTypeDefinition1686 = new BitSet(new long[]{0x0000000001000000L,0x0000001000000402L});
	public static final BitSet FOLLOW_LESS_in_dataTypeDefinition1696 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_dataTypeDefinition1700 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000402L});
	public static final BitSet FOLLOW_100_in_dataTypeDefinition1713 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000402L});
	public static final BitSet FOLLOW_operationDefinition_in_dataTypeDefinition1733 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000402L});
	public static final BitSet FOLLOW_65_in_dataTypeDefinition1760 = new BitSet(new long[]{0x0000000000000020L,0x0000000000402400L});
	public static final BitSet FOLLOW_invariantClause_in_dataTypeDefinition1780 = new BitSet(new long[]{0x0000000000000020L,0x0000000000402400L});
	public static final BitSet FOLLOW_74_in_dataTypeDefinition1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition1829 = new BitSet(new long[]{0x1900000000100000L});
	public static final BitSet FOLLOW_56_in_generalClassifierDefinition1837 = new BitSet(new long[]{0x1800000000100000L});
	public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition1863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataTypeDefinition_in_generalClassifierDefinition1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition1975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyClass_in_classDefinition2029 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_classDefinition2033 = new BitSet(new long[]{0x2000000001000000L,0x0000401000000402L});
	public static final BitSet FOLLOW_LESS_in_classDefinition2043 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_classDefinition2047 = new BitSet(new long[]{0x2000000000000000L,0x0000401000000402L});
	public static final BitSet FOLLOW_61_in_classDefinition2060 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_attributeDefinition_in_classDefinition2073 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_100_in_classDefinition2094 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_operationDefinition_in_classDefinition2107 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_65_in_classDefinition2129 = new BitSet(new long[]{0x0000000000000020L,0x0000400000402400L});
	public static final BitSet FOLLOW_invariantClause_in_classDefinition2149 = new BitSet(new long[]{0x0000000000000020L,0x0000400000402400L});
	public static final BitSet FOLLOW_110_in_classDefinition2175 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000400L});
	public static final BitSet FOLLOW_stateMachine_in_classDefinition2195 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000400L});
	public static final BitSet FOLLOW_74_in_classDefinition2219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_associationClassDefinition2252 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationClassDefinition2278 = new BitSet(new long[]{0xA000000001100000L,0x0000401000000402L});
	public static final BitSet FOLLOW_LESS_in_associationClassDefinition2288 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_associationClassDefinition2292 = new BitSet(new long[]{0xA000000000100000L,0x0000401000000402L});
	public static final BitSet FOLLOW_63_in_associationClassDefinition2304 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2312 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2324 = new BitSet(new long[]{0x2000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_61_in_associationClassDefinition2344 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition2357 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_100_in_associationClassDefinition2378 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition2391 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_65_in_associationClassDefinition2413 = new BitSet(new long[]{0x0000000000100020L,0x0000400000402400L});
	public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2433 = new BitSet(new long[]{0x0000000000100020L,0x0000400000402400L});
	public static final BitSet FOLLOW_110_in_associationClassDefinition2459 = new BitSet(new long[]{0x0000000000100000L,0x0000040000000400L});
	public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition2479 = new BitSet(new long[]{0x0000000000100000L,0x0000040000000400L});
	public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_associationClassDefinition2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2575 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_attributeDefinition2583 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_attributeDefinition2585 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_attributeDefinition2589 = new BitSet(new long[]{0x0000004000100002L});
	public static final BitSet FOLLOW_keyDerive_in_attributeDefinition2613 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_keyDerived_in_attributeDefinition2615 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_set_in_attributeDefinition2618 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_attributeDefinition2628 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_keyInit_in_attributeDefinition2648 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_set_in_attributeDefinition2652 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_attributeDefinition2664 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_attributeDefinition2678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_operationDefinition2715 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_operationDefinition2725 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_operationDefinition2735 = new BitSet(new long[]{0x40000040040020A0L,0x0000018000000000L});
	public static final BitSet FOLLOW_superParamList_in_operationDefinition2745 = new BitSet(new long[]{0x40000040000020A2L,0x0000018000000000L});
	public static final BitSet FOLLOW_COLON_in_operationDefinition2766 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_operationDefinition2772 = new BitSet(new long[]{0x4000004000002022L,0x0000018000000000L});
	public static final BitSet FOLLOW_EQUAL_in_operationDefinition2800 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationDefinition2806 = new BitSet(new long[]{0x0000004000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_blockStat_in_operationDefinition2828 = new BitSet(new long[]{0x0000004000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_prePostClause_in_operationDefinition2850 = new BitSet(new long[]{0x0000004000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_SEMI_in_operationDefinition2863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_superParamList2898 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_IDENT_in_superParamList2916 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_superParamList2927 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_superParamList2933 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_superParamList2950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_associationDefinition2981 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyAssociation_in_associationDefinition2995 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyAggregation_in_associationDefinition2999 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyComposition_in_associationDefinition3003 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationDefinition3013 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_associationDefinition3021 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationDefinition3029 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationDefinition3041 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_associationDefinition3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_associationEnd3077 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3085 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LBRACK_in_associationEnd3087 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicity_in_associationEnd3091 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_associationEnd3093 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyRole_in_associationEnd3104 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3108 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_102_in_associationEnd3129 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_112_in_associationEnd3141 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3145 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyUnion_in_associationEnd3157 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_107_in_associationEnd3169 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3173 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyDerived_in_associationEnd3186 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_keyDerive_in_associationEnd3188 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_LPAREN_in_associationEnd3193 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd3199 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_associationEnd3201 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_associationEnd3205 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_associationEnd3209 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyQualifier_in_associationEnd3221 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_associationEnd3227 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_SEMI_in_associationEnd3244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicityRange_in_multiplicity3279 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_multiplicity3289 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicityRange_in_multiplicity3293 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3322 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange3332 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_multiplicitySpec3370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_multiplicitySpec3380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_invariant3421 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_invariant3431 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_COMMA_in_invariant3444 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_invariant3448 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_COLON_in_invariant3456 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_simpleType_in_invariant3468 = new BitSet(new long[]{0x0000000000000022L,0x0000000000402000L});
	public static final BitSet FOLLOW_invariantClause_in_invariant3480 = new BitSet(new long[]{0x0000000000000022L,0x0000000000402000L});
	public static final BitSet FOLLOW_annotationSet_in_invariantClause3510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_invariantClause3518 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_invariantClause3524 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_invariantClause3529 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_invariantClause3533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_invariantClause3550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_invariantClause3552 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_invariantClause3558 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_invariantClause3563 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_invariantClause3567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_prePost3600 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_prePost3604 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_prePost3606 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_prePost3610 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_prePost3614 = new BitSet(new long[]{0x00000000000000A0L,0x0000018000000000L});
	public static final BitSet FOLLOW_COLON_in_prePost3618 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_prePost3622 = new BitSet(new long[]{0x0000000000000020L,0x0000018000000000L});
	public static final BitSet FOLLOW_prePostClause_in_prePost3641 = new BitSet(new long[]{0x0000000000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_annotationSet_in_prePostClause3675 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
	public static final BitSet FOLLOW_set_in_prePostClause3687 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_prePostClause3702 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_prePostClause3707 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_prePostClause3711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotationSet3738 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_annotation3757 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_annotation3761 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_annotation3766 = new BitSet(new long[]{0x0000002000100400L});
	public static final BitSet FOLLOW_annotationValues_in_annotation3774 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_annotation3779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationValue_in_annotationValues3802 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_annotationValues3810 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_annotationValue_in_annotationValues3814 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_annotationValue3833 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_annotationValue3838 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_stateMachine3874 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_stateMachine3907 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_stateMachine3920 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_stateDefinition_in_stateMachine3936 = new BitSet(new long[]{0x0000000000100000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_stateMachine3946 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_transitionDefinition_in_stateMachine3962 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_stateMachine3972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_stateDefinition3988 = new BitSet(new long[]{0x0000000000800082L});
	public static final BitSet FOLLOW_COLON_in_stateDefinition3996 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_stateDefinition4000 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_LBRACK_in_stateDefinition4011 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_stateDefinition4017 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_stateDefinition4019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition4040 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARROW_in_transitionDefinition4042 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition4046 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_LBRACE_in_transitionDefinition4056 = new BitSet(new long[]{0x0000000000900000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4066 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_transitionDefinition4070 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4074 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000008L});
	public static final BitSet FOLLOW_event_in_transitionDefinition4098 = new BitSet(new long[]{0x0000000400800000L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition4114 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_transitionDefinition4118 = new BitSet(new long[]{0x0000002004000000L});
	public static final BitSet FOLLOW_paramList_in_transitionDefinition4123 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_transitionDefinition4130 = new BitSet(new long[]{0x0000000400800000L});
	public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4147 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_transitionDefinition4151 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4155 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_transitionDefinition4163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_event4185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keySignal_in_signalDefinition4205 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_signalDefinition4209 = new BitSet(new long[]{0x2000000001000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_LESS_in_signalDefinition4224 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_signalDefinition4228 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_61_in_signalDefinition4241 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000402L});
	public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition4254 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000402L});
	public static final BitSet FOLLOW_65_in_signalDefinition4275 = new BitSet(new long[]{0x0000000000000020L,0x0000000000402400L});
	public static final BitSet FOLLOW_invariantClause_in_signalDefinition4295 = new BitSet(new long[]{0x0000000000000020L,0x0000000000402400L});
	public static final BitSet FOLLOW_74_in_signalDefinition4319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_capAnnotation4346 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_capAnnotation4350 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_capAnnotation4352 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_capArg_in_capAnnotation4364 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_capAnnotation4377 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_capArg_in_capAnnotation4381 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_capAnnotation4393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_capArg4417 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_capArg4419 = new BitSet(new long[]{0x0000040040708020L,0x0008000000004000L});
	public static final BitSet FOLLOW_capValue_in_capArg4423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_OCL_STRING_in_capValue4448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_capValue4478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_capValue4497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_capValue4516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_capValue4533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_capValue4549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_capValue4563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumRef_in_capValue4579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_capAnnotation_in_capValue4601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_capBlock_in_capValue4617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedName4646 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_DOT_in_qualifiedName4656 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedName4660 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_IDENT_in_enumRef4691 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_enumRef4693 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_enumRef4697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_capBlock4725 = new BitSet(new long[]{0x0000040440708020L,0x0008000000004000L});
	public static final BitSet FOLLOW_capValue_in_capBlock4745 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_capBlock4758 = new BitSet(new long[]{0x0000040040708020L,0x0008000000004000L});
	public static final BitSet FOLLOW_capValue_in_capBlock4762 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_capBlock4781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyUnion4794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyAssociation4808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyRole4822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyComposition4834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyAggregation4846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDataType4860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyClass4872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keySignal4884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDerived4898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDerive4912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyInit4924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyQualifier4940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOnly4968 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expressionOnly4970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_expression5018 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_expression5029 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression5033 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_expression5037 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression5042 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_expression5046 = new BitSet(new long[]{0x0000000000000400L,0x0000000000080000L});
	public static final BitSet FOLLOW_COMMA_in_expression5084 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_expression5096 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression5100 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_expression5104 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression5109 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_expression5113 = new BitSet(new long[]{0x0000000000000400L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_expression5154 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression5170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramList5203 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList5220 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_paramList5232 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList5236 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_paramList5256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idList5285 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_idList5295 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_idList5299 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration5330 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration5332 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration5336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5372 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_conditionalImpliesExpression5385 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5389 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5434 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_conditionalOrExpression5447 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5451 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5495 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_conditionalXOrExpression5508 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5512 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5556 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_conditionalAndExpression5569 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5573 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5621 = new BitSet(new long[]{0x0000000080002002L});
	public static final BitSet FOLLOW_set_in_equalityExpression5640 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5650 = new BitSet(new long[]{0x0000000080002002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5699 = new BitSet(new long[]{0x0000000003030002L});
	public static final BitSet FOLLOW_set_in_relationalExpression5717 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5735 = new BitSet(new long[]{0x0000000003030002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5785 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression5803 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5813 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5863 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression5881 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5895 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_unaryExpression5957 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression6001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression6034 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_ARROW_in_postfixExpression6052 = new BitSet(new long[]{0x0000000000100000L,0x00003007A0800000L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression6058 = new BitSet(new long[]{0x0000000000100000L,0x00003007A0800000L});
	public static final BitSet FOLLOW_propertyCall_in_postfixExpression6069 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_literal_in_primaryExpression6109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectReference_in_primaryExpression6123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyCall_in_primaryExpression6135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression6146 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_primaryExpression6150 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression6152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_primaryExpression6164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression6176 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression6178 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_primaryExpression6180 = new BitSet(new long[]{0x0000000004000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression6203 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_primaryExpression6205 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression6223 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression6225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression6238 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression6240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_primaryExpression6242 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression6246 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_primaryExpression6250 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression6252 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression6272 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_primaryExpression6274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_objectReference6300 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_objectReference6308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryExpression_in_propertyCall6373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterateExpression_in_propertyCall6386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationExpression_in_propertyCall6399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeExpression_in_propertyCall6412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inStateExpression_in_propertyCall6425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_queryExpression6460 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_queryExpression6467 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression6478 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_queryExpression6482 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_queryExpression6493 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_queryExpression6499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_iterateExpression6531 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_iterateExpression6537 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression6545 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterateExpression6547 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableInitialization_in_iterateExpression6555 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_iterateExpression6557 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_iterateExpression6565 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterateExpression6571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_operationExpression6615 = new BitSet(new long[]{0x0000000004800022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression6637 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6650 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression6663 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6667 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression6679 = new BitSet(new long[]{0x0000000004800022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression6696 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6711 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression6726 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6730 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression6744 = new BitSet(new long[]{0x0000000004000022L});
	public static final BitSet FOLLOW_AT_in_operationExpression6769 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_operationExpression6771 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_operationExpression6796 = new BitSet(new long[]{0x00F946310C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6817 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression6829 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6833 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_operationExpression6853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inStateExpression6901 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_inStateExpression6914 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_inStateExpression6923 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_inStateExpression6928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeExpression6964 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_typeExpression6988 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_typeExpression6992 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_typeExpression6994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration7032 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration7035 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration7039 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration7049 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration7055 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration7058 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration7064 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableInitialization7092 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableInitialization7094 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_variableInitialization7098 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_variableInitialization7100 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_variableInitialization7104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_ifExpression7136 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_ifExpression7140 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_ifExpression7142 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_ifExpression7146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_ifExpression7148 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_ifExpression7152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_ifExpression7154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_literal7193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_literal7207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal7220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_literal7235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal7249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_literal7259 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_literal7263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_literal7275 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_literal7277 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_literal7281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_literal7293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal7305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_undefinedLiteral_in_literal7317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_literal7329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_literal7341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionLiteral7379 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_collectionLiteral7408 = new BitSet(new long[]{0x00F946150C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7425 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_collectionLiteral7438 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7442 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_collectionLiteral7461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_collectionItem7490 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_collectionItem7501 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_collectionItem7505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_emptyCollectionLiteral7534 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral7536 = new BitSet(new long[]{0x0039400000000000L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7540 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral7542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7558 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral7560 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral7562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_undefinedLiteral7592 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7594 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral7598 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_undefinedLiteral7614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_undefinedLiteral7628 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7630 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral7634 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_undefinedLiteral7650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_tupleLiteral7689 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_tupleLiteral7695 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7703 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleLiteral7714 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7718 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_tupleLiteral7729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tupleItem7760 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_tupleItem7799 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_tupleItem7803 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_tupleItem7805 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_tupleItem7809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_tupleItem7831 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_tupleItem7841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type7907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_type7919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleType_in_type7931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOnly7963 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_typeOnly7965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simpleType7993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionType8031 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_collectionType8058 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_collectionType8062 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_collectionType8064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_tupleType8098 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_tupleType8100 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType8109 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleType8120 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType8124 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_tupleType8136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tuplePart8168 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_tuplePart8170 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_tuplePart8174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOnly8223 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statOnly8227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleStat_in_stat8262 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_stat8274 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C060L});
	public static final BitSet FOLLOW_singleStat_in_stat8284 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_emptyStat_in_singleStat8324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat8350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAssignStat_in_singleStat8362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_singleStat8376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleStat8390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleStat8403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleStat8420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExStat_in_singleStat8437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterStat_in_singleStat8454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_singleStat8476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStat_in_singleStat8494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_emptyStat8521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr8547 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr8561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_varAssignStat8599 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat8603 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_varAssignStat8611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_attAssignStat8635 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_attAssignStat8644 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat8648 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_attAssignStat8656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_objCreateStat8682 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_simpleType_in_objCreateStat8690 = new BitSet(new long[]{0x8000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat8700 = new BitSet(new long[]{0x00F946310C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat8713 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat8721 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_objCreateStat8739 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat8747 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8761 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat8769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_objDestroyStat8805 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat8813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_lnkInsStat8839 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkInsStat8843 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8853 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkInsStat8857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_lnkInsStat8861 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_lnkInsStat8869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8898 = new BitSet(new long[]{0x0000000000400400L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8909 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8918 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8925 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8941 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8952 = new BitSet(new long[]{0x0000000000400402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8963 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8972 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8979 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9001 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9016 = new BitSet(new long[]{0x0000000000400402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9036 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9047 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9056 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_69_in_lnkDelStat9097 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkDelStat9101 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat9111 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkDelStat9115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_lnkDelStat9119 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_lnkDelStat9128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_condExStat9159 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_condExStat9168 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_condExStat9172 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat9181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
	public static final BitSet FOLLOW_73_in_condExStat9192 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat9204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_condExStat9216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_iterStat9241 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_iterStat9249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_iterStat9253 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_iterStat9261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iterStat9265 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat9273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_iterStat9278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_whileStat9304 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_whileStat9312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_whileStat9316 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat9324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_whileStat9329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_blockStat9359 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_68_in_blockStat9364 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat9370 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_blockStat9376 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat9382 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_SEMI_in_blockStat9389 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C060L});
	public static final BitSet FOLLOW_stat_in_blockStat9399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_blockStat9404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_implicitBlockStat9430 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9436 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_implicitBlockStat9442 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9448 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_SEMI_in_implicitBlockStat9455 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C060L});
	public static final BitSet FOLLOW_stat_in_implicitBlockStat9463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOrImplicitBlock9486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock9496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_rValue9542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_rValue9554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_rValList9577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValListMin1_in_rValList9604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin19637 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin19651 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin19661 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_rValue_in_rValListMin29700 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin29708 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin29716 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin29730 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin29740 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expression_in_inSoilExpression9774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_exprList9803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprListMin1_in_exprList9821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19854 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin19869 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19879 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29919 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin29927 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29935 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin29949 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29959 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_nothing_in_identList9989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identListMin1_in_identList10006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identListMin110040 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_identListMin110054 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_identListMin110064 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COLON_in_synpred1_Generator7790 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_synpred1_Generator7792 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator7794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator8342 = new BitSet(new long[]{0x0000000000000002L});
}
