// $ANTLR 3.5.2 Generator.g 2026-03-08 12:46:18
 
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

		try {
			// Generator.g:465:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
			// Generator.g:466:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
			{
			pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition1829);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return;
			// Generator.g:467:5: ( 'abstract' )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==56) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Generator.g:467:7: 'abstract'
					{
					match(input,56,FOLLOW_56_in_generalClassifierDefinition1837); if (state.failed) return;
					if ( state.backtracking==0 ) { isAbstract = true; }
					}
					break;

			}

			// Generator.g:468:5: (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
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
					// Generator.g:469:9: c= classDefinition[isAbstract]
					{
					pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition1865);
					c=classDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }
					}
					break;
				case 2 :
					// Generator.g:472:9: d= dataTypeDefinition[isAbstract]
					{
					pushFollow(FOLLOW_dataTypeDefinition_in_generalClassifierDefinition1904);
					d=dataTypeDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addDataType(d); d.setAnnotations(as); }
					}
					break;
				case 3 :
					// Generator.g:475:9: ac= associationClassDefinition[isAbstract]
					{
					pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition1935);
					ac=associationClassDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }
					}
					break;
				case 4 :
					// Generator.g:478:9: s= signalDefinition[isAbstract]
					{
					pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition1980);
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
	// Generator.g:499:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
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
			// Generator.g:501:5: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
			// Generator.g:502:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
			{
			pushFollow(FOLLOW_keyClass_in_classDefinition2034);
			keyClass();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition2038); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); }
			// Generator.g:503:5: ( LESS idListRes= idList )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LESS) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Generator.g:503:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_classDefinition2048); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_classDefinition2052);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// Generator.g:504:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==61) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Generator.g:504:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,61,FOLLOW_61_in_classDefinition2065); if (state.failed) return n;
					// Generator.g:505:7: (a= attributeDefinition )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==AT||LA31_0==IDENT||LA31_0==56||(LA31_0 >= 59 && LA31_0 <= 60)||LA31_0==76||LA31_0==86||LA31_0==89||(LA31_0 >= 103 && LA31_0 <= 104)) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// Generator.g:505:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_classDefinition2078);
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

			// Generator.g:507:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==100) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Generator.g:507:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,100,FOLLOW_100_in_classDefinition2099); if (state.failed) return n;
					// Generator.g:508:7: (op= operationDefinition[n] )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==AT||LA33_0==IDENT||LA33_0==56||(LA33_0 >= 59 && LA33_0 <= 60)||LA33_0==76||LA33_0==86||LA33_0==89||(LA33_0 >= 103 && LA33_0 <= 104)) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// Generator.g:508:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_classDefinition2112);
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

			// Generator.g:510:5: ( 'constraints' (inv= invariantClause )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==65) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Generator.g:510:7: 'constraints' (inv= invariantClause )*
					{
					match(input,65,FOLLOW_65_in_classDefinition2134); if (state.failed) return n;
					// Generator.g:511:7: (inv= invariantClause )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==AT||LA35_0==IDENT||LA35_0==56||(LA35_0 >= 59 && LA35_0 <= 60)||(LA35_0 >= 76 && LA35_0 <= 77)||LA35_0==86||LA35_0==89||(LA35_0 >= 103 && LA35_0 <= 104)) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// Generator.g:512:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_classDefinition2154);
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

			// Generator.g:515:5: ( 'statemachines' (sm= stateMachine )* )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==110) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Generator.g:515:7: 'statemachines' (sm= stateMachine )*
					{
					match(input,110,FOLLOW_110_in_classDefinition2180); if (state.failed) return n;
					// Generator.g:516:7: (sm= stateMachine )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==106) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// Generator.g:517:9: sm= stateMachine
							{
							pushFollow(FOLLOW_stateMachine_in_classDefinition2200);
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

			match(input,74,FOLLOW_74_in_classDefinition2224); if (state.failed) return n;
			}

		}
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
	// Generator.g:538:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
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
			// Generator.g:540:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
			// Generator.g:541:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
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
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition2283); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }
			// Generator.g:550:5: ( LESS idListRes= idList )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LESS) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Generator.g:550:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_associationClassDefinition2293); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_associationClassDefinition2297);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// Generator.g:551:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==63) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Generator.g:551:6: 'between' ae= associationEnd (ae= associationEnd )+
					{
					match(input,63,FOLLOW_63_in_associationClassDefinition2309); if (state.failed) return n;
					pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2317);
					ae=associationEnd();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addEnd(ae); }
					// Generator.g:553:5: (ae= associationEnd )+
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
							// Generator.g:553:7: ae= associationEnd
							{
							pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2329);
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

			// Generator.g:555:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==61) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Generator.g:555:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,61,FOLLOW_61_in_associationClassDefinition2349); if (state.failed) return n;
					// Generator.g:556:7: (a= attributeDefinition )*
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
							// Generator.g:556:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition2362);
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

			// Generator.g:558:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==100) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Generator.g:558:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,100,FOLLOW_100_in_associationClassDefinition2383); if (state.failed) return n;
					// Generator.g:559:7: (op= operationDefinition[n] )*
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
							// Generator.g:559:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition2396);
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

			// Generator.g:561:5: ( 'constraints' (inv= invariantClause )* )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==65) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Generator.g:561:7: 'constraints' (inv= invariantClause )*
					{
					match(input,65,FOLLOW_65_in_associationClassDefinition2418); if (state.failed) return n;
					// Generator.g:562:7: (inv= invariantClause )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==AT||LA46_0==77||LA46_0==86) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// Generator.g:563:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2438);
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

			// Generator.g:566:5: ( 'statemachines' (sm= stateMachine )* )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==110) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// Generator.g:566:7: 'statemachines' (sm= stateMachine )*
					{
					match(input,110,FOLLOW_110_in_associationClassDefinition2464); if (state.failed) return n;
					// Generator.g:567:7: (sm= stateMachine )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==106) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// Generator.g:568:9: sm= stateMachine
							{
							pushFollow(FOLLOW_stateMachine_in_associationClassDefinition2484);
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

			// Generator.g:572:5: ( ( keyAggregation | keyComposition ) )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==IDENT) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Generator.g:572:7: ( keyAggregation | keyComposition )
					{
					if ( state.backtracking==0 ) { t = input.LT(1); }
					// Generator.g:573:7: ( keyAggregation | keyComposition )
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
							// Generator.g:573:9: keyAggregation
							{
							pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2525);
							keyAggregation();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// Generator.g:573:26: keyComposition
							{
							pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2529);
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

			match(input,74,FOLLOW_74_in_associationClassDefinition2552); if (state.failed) return n;
			}

		}
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
	// Generator.g:583:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
	public final ASTAttribute attributeDefinition() throws RecognitionException {
		ASTAttribute n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ASTType t =null;
		ParserRuleReturnScope deriveExpression =null;
		ParserRuleReturnScope initExpression =null;

		try {
			// Generator.g:584:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
			// Generator.g:585:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_attributeDefinition2580);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2588); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_attributeDefinition2590); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_attributeDefinition2594);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			// Generator.g:588:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
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
					// Generator.g:589:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
					{
					// Generator.g:589:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
					// Generator.g:589:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
					{
					// Generator.g:589:10: ( keyDerive | keyDerived )
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
							// Generator.g:589:11: keyDerive
							{
							pushFollow(FOLLOW_keyDerive_in_attributeDefinition2618);
							keyDerive();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// Generator.g:589:21: keyDerived
							{
							pushFollow(FOLLOW_keyDerived_in_attributeDefinition2620);
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
					pushFollow(FOLLOW_expression_in_attributeDefinition2633);
					deriveExpression=expression();
					state._fsp--;
					if (state.failed) return n;
					}

					}
					break;
				case 2 :
					// Generator.g:591:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
					{
					// Generator.g:591:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
					// Generator.g:591:10: keyInit ( COLON | EQUAL ) initExpression= expression
					{
					pushFollow(FOLLOW_keyInit_in_attributeDefinition2653);
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
					pushFollow(FOLLOW_expression_in_attributeDefinition2669);
					initExpression=expression();
					state._fsp--;
					if (state.failed) return n;
					}

					}
					break;

			}

			// Generator.g:593:5: ( SEMI )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==SEMI) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Generator.g:593:5: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2683); if (state.failed) return n;
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
	// Generator.g:607:1: operationDefinition[ASTClassifier c] returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
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
			// Generator.g:609:2: (as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
			// Generator.g:610:2: as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_operationDefinition2720);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2730); if (state.failed) return n;
			pushFollow(FOLLOW_paramList_in_operationDefinition2740);
			pl=paramList();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_superParamList_in_operationDefinition2750);
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
			// Generator.g:633:5: ( COLON t= type )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==COLON) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// Generator.g:633:7: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_operationDefinition2771); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_operationDefinition2777);
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
			// Generator.g:639:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
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
					// Generator.g:640:9: ( EQUAL e= expression )
					{
					// Generator.g:640:9: ( EQUAL e= expression )
					// Generator.g:640:11: EQUAL e= expression
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2805); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_operationDefinition2811);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setExpression((e!=null?((GeneratorParser.expression_return)e).n:null)); }
					}

					}
					break;
				case 2 :
					// Generator.g:641:9: (s= blockStat )
					{
					// Generator.g:641:9: (s= blockStat )
					// Generator.g:641:11: s= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_operationDefinition2833);
					s=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setStatement((s!=null?((GeneratorParser.blockStat_return)s).n:null));  }
					}

					}
					break;

			}

			// Generator.g:643:5: (ppc= prePostClause )*
			loop57:
			while (true) {
				int alt57=2;
				alt57 = dfa57.predict(input);
				switch (alt57) {
				case 1 :
					// Generator.g:643:7: ppc= prePostClause
					{
					pushFollow(FOLLOW_prePostClause_in_operationDefinition2855);
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

			// Generator.g:644:5: ( SEMI )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==SEMI) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// Generator.g:644:7: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2868); if (state.failed) return n;
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
	// Generator.g:651:1: superParamList[List<ASTVariableDeclaration> paramList] returns [List<String> superParamList] : ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )? ;
	public final List<String> superParamList(List<ASTVariableDeclaration> paramList) throws RecognitionException {
		List<String> superParamList = null;


		Token i=null;

		 superParamList = new ArrayList<String>(); 
		try {
			// Generator.g:653:3: ( ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )? )
			// Generator.g:654:3: ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )?
			{
			// Generator.g:654:3: ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==LPAREN) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// Generator.g:655:5: LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_superParamList2903); if (state.failed) return superParamList;
					// Generator.g:656:5: (i= IDENT ( COMMA i= IDENT )* )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==IDENT) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// Generator.g:657:7: i= IDENT ( COMMA i= IDENT )*
							{
							i=(Token)match(input,IDENT,FOLLOW_IDENT_in_superParamList2921); if (state.failed) return superParamList;
							if ( state.backtracking==0 ) { superParamList.add((i!=null?i.getText():null)); }
							// Generator.g:658:7: ( COMMA i= IDENT )*
							loop59:
							while (true) {
								int alt59=2;
								int LA59_0 = input.LA(1);
								if ( (LA59_0==COMMA) ) {
									alt59=1;
								}

								switch (alt59) {
								case 1 :
									// Generator.g:658:8: COMMA i= IDENT
									{
									match(input,COMMA,FOLLOW_COMMA_in_superParamList2932); if (state.failed) return superParamList;
									i=(Token)match(input,IDENT,FOLLOW_IDENT_in_superParamList2938); if (state.failed) return superParamList;
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

					match(input,RPAREN,FOLLOW_RPAREN_in_superParamList2955); if (state.failed) return superParamList;
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
	// Generator.g:671:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
	public final ASTAssociation associationDefinition() throws RecognitionException {
		ASTAssociation n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ASTAssociationEnd ae =null;

		 Token t = null; 
		try {
			// Generator.g:673:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
			// Generator.g:674:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
			{
			pushFollow(FOLLOW_annotationSet_in_associationDefinition2986);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { t = input.LT(1); }
			// Generator.g:676:5: ( keyAssociation | keyAggregation | keyComposition )
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
					// Generator.g:676:7: keyAssociation
					{
					pushFollow(FOLLOW_keyAssociation_in_associationDefinition3000);
					keyAssociation();
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 2 :
					// Generator.g:676:24: keyAggregation
					{
					pushFollow(FOLLOW_keyAggregation_in_associationDefinition3004);
					keyAggregation();
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 3 :
					// Generator.g:676:41: keyComposition
					{
					pushFollow(FOLLOW_keyComposition_in_associationDefinition3008);
					keyComposition();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition3018); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }
			match(input,63,FOLLOW_63_in_associationDefinition3026); if (state.failed) return n;
			pushFollow(FOLLOW_associationEnd_in_associationDefinition3034);
			ae=associationEnd();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.addEnd(ae); }
			// Generator.g:680:5: (ae= associationEnd )+
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
					// Generator.g:680:7: ae= associationEnd
					{
					pushFollow(FOLLOW_associationEnd_in_associationDefinition3046);
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

			match(input,74,FOLLOW_74_in_associationDefinition3057); if (state.failed) return n;
			}

		}
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
	// Generator.g:689:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
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
			// Generator.g:690:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
			// Generator.g:691:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_associationEnd3082);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3090); if (state.failed) return n;
			match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd3092); if (state.failed) return n;
			pushFollow(FOLLOW_multiplicity_in_associationEnd3096);
			m=multiplicity();
			state._fsp--;
			if (state.failed) return n;
			match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd3098); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }
			// Generator.g:693:5: ( keyRole rn= IDENT )?
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
					// Generator.g:693:7: keyRole rn= IDENT
					{
					pushFollow(FOLLOW_keyRole_in_associationEnd3109);
					keyRole();
					state._fsp--;
					if (state.failed) return n;
					rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3113); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setRolename(rn); }
					}
					break;

			}

			// Generator.g:694:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
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
					// Generator.g:695:9: 'ordered'
					{
					match(input,102,FOLLOW_102_in_associationEnd3134); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setOrdered(); }
					}
					break;
				case 2 :
					// Generator.g:696:9: 'subsets' sr= IDENT
					{
					match(input,112,FOLLOW_112_in_associationEnd3146); if (state.failed) return n;
					sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3150); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }
					}
					break;
				case 3 :
					// Generator.g:697:9: keyUnion
					{
					pushFollow(FOLLOW_keyUnion_in_associationEnd3162);
					keyUnion();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setUnion(true); }
					}
					break;
				case 4 :
					// Generator.g:698:9: 'redefines' rd= IDENT
					{
					match(input,107,FOLLOW_107_in_associationEnd3174); if (state.failed) return n;
					rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd3178); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }
					}
					break;
				case 5 :
					// Generator.g:699:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
					{
					// Generator.g:699:9: ( keyDerived | keyDerive )
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
							// Generator.g:699:10: keyDerived
							{
							pushFollow(FOLLOW_keyDerived_in_associationEnd3191);
							keyDerived();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// Generator.g:699:21: keyDerive
							{
							pushFollow(FOLLOW_keyDerive_in_associationEnd3193);
							keyDerive();
							state._fsp--;
							if (state.failed) return n;
							}
							break;

					}

					// Generator.g:699:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==LPAREN) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// Generator.g:699:34: LPAREN parameter= elemVarsDeclaration RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd3198); if (state.failed) return n;
							pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd3204);
							parameter=elemVarsDeclaration();
							state._fsp--;
							if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd3206); if (state.failed) return n;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd3210); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_associationEnd3214);
					exp=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setDerived((exp!=null?((GeneratorParser.expression_return)exp).n:null), parameter); }
					}
					break;
				case 6 :
					// Generator.g:700:9: keyQualifier qualifiers= paramList
					{
					pushFollow(FOLLOW_keyQualifier_in_associationEnd3226);
					keyQualifier();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_paramList_in_associationEnd3232);
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

			// Generator.g:702:5: ( SEMI )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==SEMI) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Generator.g:702:7: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_associationEnd3249); if (state.failed) return n;
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
	// Generator.g:716:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
	public final ASTMultiplicity multiplicity() throws RecognitionException {
		ASTMultiplicity n = null;


		ASTMultiplicityRange mr =null;

		try {
			// Generator.g:717:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
			// Generator.g:718:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
			{
			if ( state.backtracking==0 ) { 
				Token t = input.LT(1); // remember start position of expression
				n = new ASTMultiplicity(t);
			    }
			pushFollow(FOLLOW_multiplicityRange_in_multiplicity3284);
			mr=multiplicityRange();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.addRange(mr); }
			// Generator.g:723:5: ( COMMA mr= multiplicityRange )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==COMMA) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// Generator.g:723:7: COMMA mr= multiplicityRange
					{
					match(input,COMMA,FOLLOW_COMMA_in_multiplicity3294); if (state.failed) return n;
					pushFollow(FOLLOW_multiplicityRange_in_multiplicity3298);
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
	// Generator.g:726:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
	public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
		ASTMultiplicityRange n = null;


		int ms1 =0;
		int ms2 =0;

		try {
			// Generator.g:727:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
			// Generator.g:728:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
			{
			pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3327);
			ms1=multiplicitySpec();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }
			// Generator.g:729:5: ( DOTDOT ms2= multiplicitySpec )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==DOTDOT) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Generator.g:729:7: DOTDOT ms2= multiplicitySpec
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange3337); if (state.failed) return n;
					pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3341);
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
	// Generator.g:732:1: multiplicitySpec returns [int m] : (i= INT | STAR );
	public final int multiplicitySpec() throws RecognitionException {
		int m = 0;


		Token i=null;

		 m = -1; 
		try {
			// Generator.g:734:7: (i= INT | STAR )
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
					// Generator.g:735:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec3375); if (state.failed) return m;
					if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }
					}
					break;
				case 2 :
					// Generator.g:736:7: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_multiplicitySpec3385); if (state.failed) return m;
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
	// Generator.g:757:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
	public final ASTConstraintDefinition invariant() throws RecognitionException {
		ASTConstraintDefinition n = null;


		Token v=null;
		ASTSimpleType t =null;
		ASTInvariantClause inv =null;

		try {
			// Generator.g:758:5: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
			// Generator.g:759:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
			{
			if ( state.backtracking==0 ) { n = new ASTConstraintDefinition(); }
			match(input,66,FOLLOW_66_in_invariant3426); if (state.failed) return n;
			// Generator.g:761:5: (v= IDENT ( ',' v= IDENT )* COLON )?
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
					// Generator.g:761:7: v= IDENT ( ',' v= IDENT )* COLON
					{
					v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3436); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addVarName(v); }
					// Generator.g:762:8: ( ',' v= IDENT )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==COMMA) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// Generator.g:762:9: ',' v= IDENT
							{
							match(input,COMMA,FOLLOW_COMMA_in_invariant3449); if (state.failed) return n;
							v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3453); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addVarName(v); }
							}
							break;

						default :
							break loop72;
						}
					}

					match(input,COLON,FOLLOW_COLON_in_invariant3461); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_simpleType_in_invariant3473);
			t=simpleType();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setType(t); }
			// Generator.g:764:5: (inv= invariantClause )*
			loop74:
			while (true) {
				int alt74=2;
				alt74 = dfa74.predict(input);
				switch (alt74) {
				case 1 :
					// Generator.g:764:7: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_invariant3485);
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
	// Generator.g:771:1: invariantClause returns [ASTInvariantClause n] : (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
	public final ASTInvariantClause invariantClause() throws RecognitionException {
		ASTInvariantClause n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:772:2: (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
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
					// Generator.g:773:2: as= annotationSet 'inv' (name= IDENT )? COLON e= expression
					{
					pushFollow(FOLLOW_annotationSet_in_invariantClause3515);
					as=annotationSet();
					state._fsp--;
					if (state.failed) return n;
					match(input,86,FOLLOW_86_in_invariantClause3523); if (state.failed) return n;
					// Generator.g:774:13: (name= IDENT )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==IDENT) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// Generator.g:774:15: name= IDENT
							{
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3529); if (state.failed) return n;
							}
							break;

					}

					match(input,COLON,FOLLOW_COLON_in_invariantClause3534); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_invariantClause3538);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?((GeneratorParser.expression_return)e).n:null)); n.setAnnotations(as); }
					}
					break;
				case 2 :
					// Generator.g:776:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
					{
					match(input,77,FOLLOW_77_in_invariantClause3555); if (state.failed) return n;
					match(input,86,FOLLOW_86_in_invariantClause3557); if (state.failed) return n;
					// Generator.g:776:27: (name= IDENT )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==IDENT) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// Generator.g:776:29: name= IDENT
							{
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3563); if (state.failed) return n;
							}
							break;

					}

					match(input,COLON,FOLLOW_COLON_in_invariantClause3568); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_invariantClause3572);
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
	// Generator.g:788:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
	public final ASTPrePost prePost() throws RecognitionException {
		ASTPrePost n = null;


		Token classname=null;
		Token opname=null;
		List<ASTVariableDeclaration> pl =null;
		ASTType rt =null;
		ASTPrePostClause ppc =null;

		try {
			// Generator.g:789:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
			// Generator.g:790:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
			{
			match(input,66,FOLLOW_66_in_prePost3605); if (state.failed) return n;
			classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3609); if (state.failed) return n;
			match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost3611); if (state.failed) return n;
			opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3615); if (state.failed) return n;
			pushFollow(FOLLOW_paramList_in_prePost3619);
			pl=paramList();
			state._fsp--;
			if (state.failed) return n;
			// Generator.g:790:69: ( COLON rt= type )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==COLON) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// Generator.g:790:71: COLON rt= type
					{
					match(input,COLON,FOLLOW_COLON_in_prePost3623); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_prePost3627);
					rt=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }
			// Generator.g:792:5: (ppc= prePostClause )+
			int cnt79=0;
			loop79:
			while (true) {
				int alt79=2;
				alt79 = dfa79.predict(input);
				switch (alt79) {
				case 1 :
					// Generator.g:792:7: ppc= prePostClause
					{
					pushFollow(FOLLOW_prePostClause_in_prePost3646);
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
	// Generator.g:799:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
	public final ASTPrePostClause prePostClause() throws RecognitionException {
		ASTPrePostClause n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ParserRuleReturnScope e =null;

		 Token t = null; 
		try {
			// Generator.g:801:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
			// Generator.g:802:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
			{
			pushFollow(FOLLOW_annotationSet_in_prePostClause3680);
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
			// Generator.g:804:25: (name= IDENT )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// Generator.g:804:27: name= IDENT
					{
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3707); if (state.failed) return n;
					}
					break;

			}

			match(input,COLON,FOLLOW_COLON_in_prePostClause3712); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_prePostClause3716);
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
	// Generator.g:808:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
	public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
		Set<ASTAnnotation> annotations = null;


		ASTAnnotation an =null;

		 annotations = new HashSet<ASTAnnotation>(); 
		try {
			// Generator.g:810:2: ( (an= annotation )* )
			// Generator.g:811:2: (an= annotation )*
			{
			// Generator.g:811:2: (an= annotation )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==AT) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// Generator.g:811:3: an= annotation
					{
					pushFollow(FOLLOW_annotation_in_annotationSet3743);
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
	// Generator.g:814:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
	public final ASTAnnotation annotation() throws RecognitionException {
		ASTAnnotation n = null;


		Token name=null;
		Map<Token, Token> values =null;

		try {
			// Generator.g:814:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
			// Generator.g:815:2: AT name= IDENT LPAREN values= annotationValues RPAREN
			{
			match(input,AT,FOLLOW_AT_in_annotation3762); if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3766); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}
			match(input,LPAREN,FOLLOW_LPAREN_in_annotation3772); if (state.failed) return n;
			pushFollow(FOLLOW_annotationValues_in_annotation3781);
			values=annotationValues();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setValues(values); }
			match(input,RPAREN,FOLLOW_RPAREN_in_annotation3786); if (state.failed) return n;
			}

		}
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
	// Generator.g:821:1: annotationValues returns [Map<Token, Token> annoValues] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
	public final Map<Token, Token> annotationValues() throws RecognitionException {
		Map<Token, Token> annoValues = null;


		ParserRuleReturnScope firstVal =null;
		ParserRuleReturnScope val =null;

		 annoValues = new HashMap<Token, Token>(); 
		try {
			// Generator.g:823:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
			// Generator.g:824:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
			{
			// Generator.g:824:2: (firstVal= annotationValue )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==IDENT) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// Generator.g:824:3: firstVal= annotationValue
					{
					pushFollow(FOLLOW_annotationValue_in_annotationValues3809);
					firstVal=annotationValue();
					state._fsp--;
					if (state.failed) return annoValues;
					if ( state.backtracking==0 ) { annoValues.put((firstVal!=null?((GeneratorParser.annotationValue_return)firstVal).name:null), (firstVal!=null?((GeneratorParser.annotationValue_return)firstVal).value:null)); }
					}
					break;

			}

			// Generator.g:825:2: ( COMMA val= annotationValue )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==COMMA) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// Generator.g:825:3: COMMA val= annotationValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_annotationValues3817); if (state.failed) return annoValues;
					pushFollow(FOLLOW_annotationValue_in_annotationValues3821);
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
	// Generator.g:828:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
	public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
		GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
		retval.start = input.LT(1);

		Token aName=null;
		Token aValue=null;

		try {
			// Generator.g:828:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
			// Generator.g:829:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
			{
			aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3840); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.name = aName; }
			match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3845); if (state.failed) return retval;
			aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3851); if (state.failed) return retval;
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
	// Generator.g:834:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
	public final ASTStateMachine stateMachine() throws RecognitionException {
		ASTStateMachine n = null;


		Token smName=null;
		ASTStateDefinition s =null;
		ASTTransitionDefinition t =null;

		try {
			// Generator.g:835:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
			// Generator.g:836:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
			{
			// Generator.g:836:5: ( 'psm' )
			// Generator.g:837:8: 'psm'
			{
			match(input,106,FOLLOW_106_in_stateMachine3881); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }
			}

			smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine3914); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setName(smName); }
			match(input,111,FOLLOW_111_in_stateMachine3927); if (state.failed) return n;
			// Generator.g:844:10: (s= stateDefinition )+
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
					// Generator.g:844:11: s= stateDefinition
					{
					pushFollow(FOLLOW_stateDefinition_in_stateMachine3943);
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

			match(input,114,FOLLOW_114_in_stateMachine3953); if (state.failed) return n;
			// Generator.g:846:10: (t= transitionDefinition )+
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
					// Generator.g:846:11: t= transitionDefinition
					{
					pushFollow(FOLLOW_transitionDefinition_in_stateMachine3969);
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

			match(input,74,FOLLOW_74_in_stateMachine3979); if (state.failed) return n;
			}

		}
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
	// Generator.g:850:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
	public final ASTStateDefinition stateDefinition() throws RecognitionException {
		ASTStateDefinition n = null;


		Token sn=null;
		Token stateType=null;
		ParserRuleReturnScope stateInv =null;

		try {
			// Generator.g:850:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
			// Generator.g:851:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
			{
			sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition3995); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }
			// Generator.g:852:3: ( COLON stateType= IDENT )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==COLON) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// Generator.g:852:5: COLON stateType= IDENT
					{
					match(input,COLON,FOLLOW_COLON_in_stateDefinition4003); if (state.failed) return n;
					stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition4007); if (state.failed) return n;
					if ( state.backtracking==0 ) {n.setType(stateType); }
					}
					break;

			}

			// Generator.g:853:3: ( LBRACK stateInv= expression RBRACK )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LBRACK) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Generator.g:853:5: LBRACK stateInv= expression RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition4018); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_stateDefinition4024);
					stateInv=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition4026); if (state.failed) return n;
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
	// Generator.g:856:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
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
			// Generator.g:856:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
			// Generator.g:857:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
			{
			source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4047); if (state.failed) return n;
			match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition4049); if (state.failed) return n;
			target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4053); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }
			// Generator.g:858:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LBRACE) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// Generator.g:858:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition4063); if (state.failed) return n;
					// Generator.g:859:7: ( LBRACK pre= expression RBRACK )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==LBRACK) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// Generator.g:859:8: LBRACK pre= expression RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4073); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_transitionDefinition4077);
							pre=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?((GeneratorParser.expression_return)pre).n:null)); }
							match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4081); if (state.failed) return n;
							}
							break;

					}

					// Generator.g:860:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
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
							// Generator.g:861:11: e= event
							{
							pushFollow(FOLLOW_event_in_transitionDefinition4105);
							e=event();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setEvent(e); }
							}
							break;
						case 2 :
							// Generator.g:862:11: o= IDENT LPAREN (args= paramList )? RPAREN
							{
							o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4121); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setOperation(o); }
							match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition4125); if (state.failed) return n;
							// Generator.g:862:50: (args= paramList )?
							int alt89=2;
							int LA89_0 = input.LA(1);
							if ( (LA89_0==LPAREN) ) {
								alt89=1;
							}
							switch (alt89) {
								case 1 :
									// Generator.g:862:51: args= paramList
									{
									pushFollow(FOLLOW_paramList_in_transitionDefinition4130);
									args=paramList();
									state._fsp--;
									if (state.failed) return n;
									if ( state.backtracking==0 ) { n.setOperationArgs(args); }
									}
									break;

							}

							match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition4137); if (state.failed) return n;
							}
							break;

					}

					// Generator.g:864:7: ( LBRACK post= expression RBRACK )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==LBRACK) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// Generator.g:864:8: LBRACK post= expression RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4154); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_transitionDefinition4158);
							post=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setPostCondition((post!=null?((GeneratorParser.expression_return)post).n:null)); }
							match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4162); if (state.failed) return n;
							}
							break;

					}

					match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition4170); if (state.failed) return n;
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
	// Generator.g:868:1: event returns [Token t] : tcr= 'create' ;
	public final Token event() throws RecognitionException {
		Token t = null;


		Token tcr=null;

		try {
			// Generator.g:868:24: (tcr= 'create' )
			// Generator.g:869:5: tcr= 'create'
			{
			tcr=(Token)match(input,67,FOLLOW_67_in_event4192); if (state.failed) return t;
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
	// Generator.g:872:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
	public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
		ASTSignal n = null;


		Token name=null;
		List idListRes =null;
		ASTAttribute a =null;
		ASTInvariantClause inv =null;

		try {
			// Generator.g:872:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
			// Generator.g:873:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
			{
			pushFollow(FOLLOW_keySignal_in_signalDefinition4212);
			keySignal();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition4216); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }
			// Generator.g:875:5: ( LESS idListRes= idList )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LESS) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// Generator.g:875:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_signalDefinition4231); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_signalDefinition4235);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addGenerals(idListRes); }
					}
					break;

			}

			// Generator.g:876:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==61) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// Generator.g:876:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,61,FOLLOW_61_in_signalDefinition4248); if (state.failed) return n;
					// Generator.g:877:7: (a= attributeDefinition )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==AT||LA94_0==IDENT||LA94_0==56||(LA94_0 >= 59 && LA94_0 <= 60)||LA94_0==76||LA94_0==86||LA94_0==89||(LA94_0 >= 103 && LA94_0 <= 104)) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// Generator.g:877:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_signalDefinition4261);
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

			// Generator.g:879:5: ( 'constraints' (inv= invariantClause )* )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==65) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// Generator.g:879:7: 'constraints' (inv= invariantClause )*
					{
					match(input,65,FOLLOW_65_in_signalDefinition4282); if (state.failed) return n;
					// Generator.g:880:7: (inv= invariantClause )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==AT||LA96_0==IDENT||LA96_0==56||(LA96_0 >= 59 && LA96_0 <= 60)||(LA96_0 >= 76 && LA96_0 <= 77)||LA96_0==86||LA96_0==89||(LA96_0 >= 103 && LA96_0 <= 104)) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// Generator.g:881:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_signalDefinition4302);
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

			match(input,74,FOLLOW_74_in_signalDefinition4326); if (state.failed) return n;
			}

		}
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
	// Generator.g:887:1: capAnnotation returns [CAPAnnotation ann] : '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')' ;
	public final CAPAnnotation capAnnotation() throws RecognitionException {
		CAPAnnotation ann = null;


		Token name=null;
		Map.Entry<String,Object> arg =null;


		   List<Map.Entry<String,Object>> args = new ArrayList<Map.Entry<String,Object>>();

		try {
			// Generator.g:891:4: ( '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')' )
			// Generator.g:892:4: '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')'
			{
			match(input,AT,FOLLOW_AT_in_capAnnotation4353); if (state.failed) return ann;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_capAnnotation4357); if (state.failed) return ann;
			match(input,LPAREN,FOLLOW_LPAREN_in_capAnnotation4359); if (state.failed) return ann;
			// Generator.g:893:8: (arg= capArg ( ',' arg= capArg )* )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==IDENT) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// Generator.g:893:9: arg= capArg ( ',' arg= capArg )*
					{
					pushFollow(FOLLOW_capArg_in_capAnnotation4371);
					arg=capArg();
					state._fsp--;
					if (state.failed) return ann;
					if ( state.backtracking==0 ) { args.add(arg); }
					// Generator.g:894:9: ( ',' arg= capArg )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==COMMA) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// Generator.g:894:10: ',' arg= capArg
							{
							match(input,COMMA,FOLLOW_COMMA_in_capAnnotation4384); if (state.failed) return ann;
							pushFollow(FOLLOW_capArg_in_capAnnotation4388);
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

			match(input,RPAREN,FOLLOW_RPAREN_in_capAnnotation4400); if (state.failed) return ann;
			if ( state.backtracking==0 ) {
			       ann = new CAPAnnotation(name.getText());
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
	// Generator.g:905:1: capArg returns [Map.Entry<String,Object> entry] : key= IDENT '=' value= capValue ;
	public final Map.Entry<String,Object> capArg() throws RecognitionException {
		Map.Entry<String,Object> entry = null;


		Token key=null;
		Object value =null;

		try {
			// Generator.g:906:4: (key= IDENT '=' value= capValue )
			// Generator.g:907:4: key= IDENT '=' value= capValue
			{
			key=(Token)match(input,IDENT,FOLLOW_IDENT_in_capArg4424); if (state.failed) return entry;
			match(input,EQUAL,FOLLOW_EQUAL_in_capArg4426); if (state.failed) return entry;
			pushFollow(FOLLOW_capValue_in_capArg4430);
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
	// Generator.g:914:1: capValue returns [Object val] : (s1= NON_OCL_STRING |s2= STRING |n= INT |f= FLOAT |t= 'true' |f2= 'false' |q= qualifiedName |e= enumRef |ann= capAnnotation |blk= capBlock );
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
			// Generator.g:915:5: (s1= NON_OCL_STRING |s2= STRING |n= INT |f= FLOAT |t= 'true' |f2= 'false' |q= qualifiedName |e= enumRef |ann= capAnnotation |blk= capBlock )
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
					// Generator.g:916:5: s1= NON_OCL_STRING
					{
					s1=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_capValue4455); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					            val = s1.getText().substring(1, s1.getText().length() - 1);
					        }
					}
					break;
				case 2 :
					// Generator.g:922:9: s2= STRING
					{
					s2=(Token)match(input,STRING,FOLLOW_STRING_in_capValue4485); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					            val = s2.getText().substring(1, s2.getText().length() - 1);
					        }
					}
					break;
				case 3 :
					// Generator.g:926:6: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_capValue4504); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Integer.parseInt(n.getText()); }
					}
					break;
				case 4 :
					// Generator.g:927:6: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_capValue4523); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Double.parseDouble(f.getText()); }
					}
					break;
				case 5 :
					// Generator.g:928:6: t= 'true'
					{
					t=(Token)match(input,115,FOLLOW_115_in_capValue4540); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Boolean.TRUE; }
					}
					break;
				case 6 :
					// Generator.g:929:6: f2= 'false'
					{
					f2=(Token)match(input,78,FOLLOW_78_in_capValue4556); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Boolean.FALSE; }
					}
					break;
				case 7 :
					// Generator.g:930:6: q= qualifiedName
					{
					pushFollow(FOLLOW_qualifiedName_in_capValue4570);
					q=qualifiedName();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = q; }
					}
					break;
				case 8 :
					// Generator.g:933:6: e= enumRef
					{
					pushFollow(FOLLOW_enumRef_in_capValue4586);
					e=enumRef();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = e; }
					}
					break;
				case 9 :
					// Generator.g:936:6: ann= capAnnotation
					{
					pushFollow(FOLLOW_capAnnotation_in_capValue4608);
					ann=capAnnotation();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = ann; }
					}
					break;
				case 10 :
					// Generator.g:939:6: blk= capBlock
					{
					pushFollow(FOLLOW_capBlock_in_capValue4624);
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
	// Generator.g:945:1: qualifiedName returns [String text] : i1= IDENT ( '.' i2= IDENT )* ;
	public final String qualifiedName() throws RecognitionException {
		String text = null;


		Token i1=null;
		Token i2=null;

		 StringBuilder sb = new StringBuilder(); 
		try {
			// Generator.g:948:5: (i1= IDENT ( '.' i2= IDENT )* )
			// Generator.g:949:5: i1= IDENT ( '.' i2= IDENT )*
			{
			i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedName4653); if (state.failed) return text;
			if ( state.backtracking==0 ) { sb.append(i1.getText()); }
			// Generator.g:950:5: ( '.' i2= IDENT )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==DOT) ) {
					alt101=1;
				}

				switch (alt101) {
				case 1 :
					// Generator.g:950:7: '.' i2= IDENT
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedName4663); if (state.failed) return text;
					i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedName4667); if (state.failed) return text;
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
	// Generator.g:955:1: enumRef returns [String text] : t= IDENT COLON_COLON c= IDENT ;
	public final String enumRef() throws RecognitionException {
		String text = null;


		Token t=null;
		Token c=null;

		try {
			// Generator.g:957:5: (t= IDENT COLON_COLON c= IDENT )
			// Generator.g:958:5: t= IDENT COLON_COLON c= IDENT
			{
			t=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumRef4698); if (state.failed) return text;
			match(input,COLON_COLON,FOLLOW_COLON_COLON_in_enumRef4700); if (state.failed) return text;
			c=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumRef4704); if (state.failed) return text;
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
	// Generator.g:962:1: capBlock returns [List<Object> list] : '{' (v= capValue ( ',' v= capValue )* )? '}' ;
	public final List<Object> capBlock() throws RecognitionException {
		List<Object> list = null;


		Object v =null;

		 list = new ArrayList<Object>(); 
		try {
			// Generator.g:964:5: ( '{' (v= capValue ( ',' v= capValue )* )? '}' )
			// Generator.g:965:5: '{' (v= capValue ( ',' v= capValue )* )? '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_capBlock4732); if (state.failed) return list;
			// Generator.g:966:7: (v= capValue ( ',' v= capValue )* )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==AT||LA103_0==FLOAT||(LA103_0 >= IDENT && LA103_0 <= LBRACE)||LA103_0==NON_OCL_STRING||LA103_0==STRING||LA103_0==78||LA103_0==115) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// Generator.g:967:9: v= capValue ( ',' v= capValue )*
					{
					pushFollow(FOLLOW_capValue_in_capBlock4752);
					v=capValue();
					state._fsp--;
					if (state.failed) return list;
					if ( state.backtracking==0 ) { list.add(v); }
					// Generator.g:968:9: ( ',' v= capValue )*
					loop102:
					while (true) {
						int alt102=2;
						int LA102_0 = input.LA(1);
						if ( (LA102_0==COMMA) ) {
							alt102=1;
						}

						switch (alt102) {
						case 1 :
							// Generator.g:968:10: ',' v= capValue
							{
							match(input,COMMA,FOLLOW_COMMA_in_capBlock4765); if (state.failed) return list;
							pushFollow(FOLLOW_capValue_in_capBlock4769);
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

			match(input,RBRACE,FOLLOW_RBRACE_in_capBlock4788); if (state.failed) return list;
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
	// Generator.g:974:1: keyUnion :{...}? IDENT ;
	public final void keyUnion() throws RecognitionException {
		try {
			// Generator.g:974:9: ({...}? IDENT )
			// Generator.g:975:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("union"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyUnion4801); if (state.failed) return;
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
	// Generator.g:977:1: keyAssociation :{...}? IDENT ;
	public final void keyAssociation() throws RecognitionException {
		try {
			// Generator.g:977:15: ({...}? IDENT )
			// Generator.g:978:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("association"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyAssociation4815); if (state.failed) return;
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
	// Generator.g:980:1: keyRole :{...}? IDENT ;
	public final void keyRole() throws RecognitionException {
		try {
			// Generator.g:980:8: ({...}? IDENT )
			// Generator.g:981:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("role"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyRole4829); if (state.failed) return;
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
	// Generator.g:983:1: keyComposition :{...}? IDENT ;
	public final void keyComposition() throws RecognitionException {
		try {
			// Generator.g:983:15: ({...}? IDENT )
			// Generator.g:984:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("composition"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyComposition4841); if (state.failed) return;
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
	// Generator.g:986:1: keyAggregation :{...}? IDENT ;
	public final void keyAggregation() throws RecognitionException {
		try {
			// Generator.g:986:15: ({...}? IDENT )
			// Generator.g:987:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("aggregation"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyAggregation4853); if (state.failed) return;
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
	// Generator.g:989:1: keyDataType :{...}? IDENT ;
	public final void keyDataType() throws RecognitionException {
		try {
			// Generator.g:989:12: ({...}? IDENT )
			// Generator.g:990:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("dataType"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDataType", "input.LT(1).getText().equals(\"dataType\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDataType4867); if (state.failed) return;
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
	// Generator.g:992:1: keyClass :{...}? IDENT ;
	public final void keyClass() throws RecognitionException {
		try {
			// Generator.g:992:9: ({...}? IDENT )
			// Generator.g:993:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("class"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyClass4879); if (state.failed) return;
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
	// Generator.g:995:1: keySignal :{...}? IDENT ;
	public final void keySignal() throws RecognitionException {
		try {
			// Generator.g:995:10: ({...}? IDENT )
			// Generator.g:996:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("signal"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keySignal4891); if (state.failed) return;
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
	// Generator.g:998:1: keyDerived :{...}? IDENT ;
	public final void keyDerived() throws RecognitionException {
		try {
			// Generator.g:998:11: ({...}? IDENT )
			// Generator.g:999:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("derived"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDerived4905); if (state.failed) return;
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
	// Generator.g:1001:1: keyDerive :{...}? IDENT ;
	public final void keyDerive() throws RecognitionException {
		try {
			// Generator.g:1001:10: ({...}? IDENT )
			// Generator.g:1002:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("derive"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDerive4919); if (state.failed) return;
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
	// Generator.g:1004:1: keyInit :{...}? IDENT ;
	public final void keyInit() throws RecognitionException {
		try {
			// Generator.g:1004:8: ({...}? IDENT )
			// Generator.g:1005:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("init"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyInit4931); if (state.failed) return;
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
	// Generator.g:1007:1: keyQualifier :{...}? IDENT ;
	public final void keyQualifier() throws RecognitionException {
		try {
			// Generator.g:1007:13: ({...}? IDENT )
			// Generator.g:1008:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("qualifier"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyQualifier4947); if (state.failed) return;
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
	// Generator.g:1037:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
	public final ASTExpression expressionOnly() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope nExp =null;

		try {
			// Generator.g:1038:5: (nExp= expression EOF )
			// Generator.g:1039:5: nExp= expression EOF
			{
			pushFollow(FOLLOW_expression_in_expressionOnly4975);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_expressionOnly4977); if (state.failed) return n;
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
	// Generator.g:1046:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
			// Generator.g:1052:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
			// Generator.g:1053:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }
			// Generator.g:1054:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==88) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// Generator.g:1055:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
					{
					match(input,88,FOLLOW_88_in_expression5025); if (state.failed) return retval;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression5036); if (state.failed) return retval;
					// Generator.g:1056:18: ( COLON t= type )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==COLON) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// Generator.g:1056:20: COLON t= type
							{
							match(input,COLON,FOLLOW_COLON_in_expression5040); if (state.failed) return retval;
							pushFollow(FOLLOW_type_in_expression5044);
							t=type();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_expression5049); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression5053);
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
					// Generator.g:1066:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
					loop106:
					while (true) {
						int alt106=2;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==COMMA) ) {
							alt106=1;
						}

						switch (alt106) {
						case 1 :
							// Generator.g:1067:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_expression5091); if (state.failed) return retval;
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression5103); if (state.failed) return retval;
							// Generator.g:1068:20: ( COLON t= type )?
							int alt105=2;
							int LA105_0 = input.LA(1);
							if ( (LA105_0==COLON) ) {
								alt105=1;
							}
							switch (alt105) {
								case 1 :
									// Generator.g:1068:22: COLON t= type
									{
									match(input,COLON,FOLLOW_COLON_in_expression5107); if (state.failed) return retval;
									pushFollow(FOLLOW_type_in_expression5111);
									t=type();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							match(input,EQUAL,FOLLOW_EQUAL_in_expression5116); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_expression5120);
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

					match(input,83,FOLLOW_83_in_expression5161); if (state.failed) return retval;
					}
					break;

				default :
					break loop107;
				}
			}

			pushFollow(FOLLOW_conditionalImpliesExpression_in_expression5177);
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
	// Generator.g:1100:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
	public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
		List<ASTVariableDeclaration> paramList = null;


		ASTVariableDeclaration v =null;

		 paramList = new ArrayList<ASTVariableDeclaration>(); 
		try {
			// Generator.g:1102:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
			// Generator.g:1103:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_paramList5210); if (state.failed) return paramList;
			// Generator.g:1104:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==IDENT) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// Generator.g:1105:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_paramList5227);
					v=variableDeclaration();
					state._fsp--;
					if (state.failed) return paramList;
					if ( state.backtracking==0 ) { paramList.add(v); }
					// Generator.g:1106:7: ( COMMA v= variableDeclaration )*
					loop108:
					while (true) {
						int alt108=2;
						int LA108_0 = input.LA(1);
						if ( (LA108_0==COMMA) ) {
							alt108=1;
						}

						switch (alt108) {
						case 1 :
							// Generator.g:1106:9: COMMA v= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramList5239); if (state.failed) return paramList;
							pushFollow(FOLLOW_variableDeclaration_in_paramList5243);
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

			match(input,RPAREN,FOLLOW_RPAREN_in_paramList5263); if (state.failed) return paramList;
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
	// Generator.g:1114:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
	public final List idList() throws RecognitionException {
		List idList = null;


		Token id0=null;
		Token idn=null;

		 idList = new ArrayList(); 
		try {
			// Generator.g:1116:5: (id0= IDENT ( COMMA idn= IDENT )* )
			// Generator.g:1117:5: id0= IDENT ( COMMA idn= IDENT )*
			{
			id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList5292); if (state.failed) return idList;
			if ( state.backtracking==0 ) { idList.add(id0); }
			// Generator.g:1118:5: ( COMMA idn= IDENT )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==COMMA) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// Generator.g:1118:7: COMMA idn= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_idList5302); if (state.failed) return idList;
					idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList5306); if (state.failed) return idList;
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
	// Generator.g:1126:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
	public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
		ASTVariableDeclaration n = null;


		Token name=null;
		ASTType t =null;

		try {
			// Generator.g:1127:5: (name= IDENT COLON t= type )
			// Generator.g:1128:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration5337); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableDeclaration5339); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration5343);
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
	// Generator.g:1136:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
	public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndOrExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1137:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
			// Generator.g:1138:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5379);
			nCndOrExp=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndOrExp;}
			// Generator.g:1139:5: (op= 'implies' n1= conditionalOrExpression )*
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==82) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// Generator.g:1139:7: op= 'implies' n1= conditionalOrExpression
					{
					op=(Token)match(input,82,FOLLOW_82_in_conditionalImpliesExpression5392); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5396);
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
	// Generator.g:1148:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
	public final ASTExpression conditionalOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndXorExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1149:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
			// Generator.g:1150:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
			{
			pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5441);
			nCndXorExp=conditionalXOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndXorExp;}
			// Generator.g:1151:5: (op= 'or' n1= conditionalXOrExpression )*
			loop112:
			while (true) {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==101) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// Generator.g:1151:7: op= 'or' n1= conditionalXOrExpression
					{
					op=(Token)match(input,101,FOLLOW_101_in_conditionalOrExpression5454); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5458);
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
	// Generator.g:1160:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
	public final ASTExpression conditionalXOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndAndExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1161:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
			// Generator.g:1162:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5502);
			nCndAndExp=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndAndExp;}
			// Generator.g:1163:5: (op= 'xor' n1= conditionalAndExpression )*
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==118) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// Generator.g:1163:7: op= 'xor' n1= conditionalAndExpression
					{
					op=(Token)match(input,118,FOLLOW_118_in_conditionalXOrExpression5515); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5519);
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
	// Generator.g:1172:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
	public final ASTExpression conditionalAndExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nEqExp =null;
		ASTExpression n1 =null;

		try {
			// Generator.g:1173:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
			// Generator.g:1174:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5563);
			nEqExp=equalityExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nEqExp;}
			// Generator.g:1175:5: (op= 'and' n1= equalityExpression )*
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==58) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// Generator.g:1175:7: op= 'and' n1= equalityExpression
					{
					op=(Token)match(input,58,FOLLOW_58_in_conditionalAndExpression5576); if (state.failed) return n;
					pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5580);
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
	// Generator.g:1184:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
	public final ASTExpression equalityExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nRelExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1186:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
			// Generator.g:1187:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression5628);
			nRelExp=relationalExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nRelExp;}
			// Generator.g:1188:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==EQUAL||LA115_0==NOT_EQUAL) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// Generator.g:1188:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression5657);
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
	// Generator.g:1198:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
	public final ASTExpression relationalExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nAddiExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1200:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
			// Generator.g:1201:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression5706);
			nAddiExp=additiveExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nAddiExp;}
			// Generator.g:1202:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( ((LA116_0 >= GREATER && LA116_0 <= GREATER_EQUAL)||(LA116_0 >= LESS && LA116_0 <= LESS_EQUAL)) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// Generator.g:1202:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression5742);
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
	// Generator.g:1212:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
	public final ASTExpression additiveExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nMulExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1214:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
			// Generator.g:1215:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5792);
			nMulExp=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nMulExp;}
			// Generator.g:1216:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==MINUS||LA117_0==PLUS) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// Generator.g:1216:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5820);
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
	// Generator.g:1227:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
	public final ASTExpression multiplicativeExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// Generator.g:1229:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
			// Generator.g:1230:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5870);
			nUnExp=unaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nUnExp;}
			// Generator.g:1231:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==SLASH||LA118_0==STAR||LA118_0==71) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// Generator.g:1231:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
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
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5902);
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
	// Generator.g:1243:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
	public final ASTExpression unaryExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression nPosExp =null;

		 Token op = null; 
		try {
			// Generator.g:1245:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
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
					// Generator.g:1246:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					{
					// Generator.g:1246:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					// Generator.g:1246:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
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
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5988);
					nUnExp=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }
					}

					}
					break;
				case 2 :
					// Generator.g:1250:7: nPosExp= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression6008);
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
	// Generator.g:1258:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
	public final ASTExpression postfixExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nPrimExp =null;
		ASTExpression nPc =null;

		 boolean arrow = false; 
		try {
			// Generator.g:1260:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
			// Generator.g:1261:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression6041);
			nPrimExp=primaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nPrimExp; }
			// Generator.g:1262:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
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
					// Generator.g:1263:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
					{
					// Generator.g:1263:6: ( ARROW | DOT )
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
							// Generator.g:1263:8: ARROW
							{
							match(input,ARROW,FOLLOW_ARROW_in_postfixExpression6059); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = true; }
							}
							break;
						case 2 :
							// Generator.g:1263:34: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_postfixExpression6065); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = false; }
							}
							break;

					}

					pushFollow(FOLLOW_propertyCall_in_postfixExpression6076);
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
	// Generator.g:1279:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
			// Generator.g:1280:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
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
					// Generator.g:1281:7: nLit= literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression6116);
					nLit=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nLit; }
					}
					break;
				case 2 :
					// Generator.g:1282:7: nOr= objectReference
					{
					pushFollow(FOLLOW_objectReference_in_primaryExpression6130);
					nOr=objectReference();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nOr; }
					}
					break;
				case 3 :
					// Generator.g:1283:7: nPc= propertyCall[null, false]
					{
					pushFollow(FOLLOW_propertyCall_in_primaryExpression6142);
					nPc=propertyCall(null, false);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;
				case 4 :
					// Generator.g:1284:7: LPAREN nExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6153); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression6157);
					nExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6159); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExp!=null?((GeneratorParser.expression_return)nExp).n:null); }
					}
					break;
				case 5 :
					// Generator.g:1285:7: nIfExp= ifExpression
					{
					pushFollow(FOLLOW_ifExpression_in_primaryExpression6171);
					nIfExp=ifExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nIfExp; }
					}
					break;
				case 6 :
					// Generator.g:1286:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
					{
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression6183); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression6185); if (state.failed) return n;
					match(input,57,FOLLOW_57_in_primaryExpression6187); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }
					// Generator.g:1288:9: ( AT 'pre' )?
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
							// Generator.g:1288:11: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression6210); if (state.failed) return n;
							match(input,104,FOLLOW_104_in_primaryExpression6212); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					// Generator.g:1289:9: ( LPAREN RPAREN )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==LPAREN) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// Generator.g:1289:11: LPAREN RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6230); if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6232); if (state.failed) return n;
							}
							break;

					}

					}
					break;
				case 7 :
					// Generator.g:1290:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
					{
					id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression6245); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression6247); if (state.failed) return n;
					match(input,64,FOLLOW_64_in_primaryExpression6249); if (state.failed) return n;
					// Generator.g:1290:31: ( LPAREN idExp= expression RPAREN )
					// Generator.g:1290:33: LPAREN idExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6253); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression6257);
					idExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6259); if (state.failed) return n;
					}

					if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?((GeneratorParser.expression_return)idExp).n:null)); }
					// Generator.g:1292:7: ( AT 'pre' )?
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
							// Generator.g:1292:9: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression6279); if (state.failed) return n;
							match(input,104,FOLLOW_104_in_primaryExpression6281); if (state.failed) return n;
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
	// Generator.g:1296:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
	public final ASTExpression objectReference() throws RecognitionException {
		ASTExpression n = null;


		Token objectName=null;

		try {
			// Generator.g:1297:3: ( AT objectName= IDENT )
			// Generator.g:1298:3: AT objectName= IDENT
			{
			match(input,AT,FOLLOW_AT_in_objectReference6307); if (state.failed) return n;
			objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference6315); if (state.failed) return n;
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
	// Generator.g:1312:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
	public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExpQuery =null;
		ASTExpression nExpIterate =null;
		ParserRuleReturnScope nExpOperation =null;
		ASTTypeArgExpression nExpType =null;
		ASTInStateExpression nExpInState =null;

		try {
			// Generator.g:1313:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
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
					// Generator.g:1317:7: {...}?{...}?nExpQuery= queryExpression[source]
					{
					if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
					}
					if ( !(( input.LA(2) == LPAREN )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
					}
					pushFollow(FOLLOW_queryExpression_in_propertyCall6380);
					nExpQuery=queryExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpQuery; }
					}
					break;
				case 2 :
					// Generator.g:1320:7: nExpIterate= iterateExpression[source]
					{
					pushFollow(FOLLOW_iterateExpression_in_propertyCall6393);
					nExpIterate=iterateExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpIterate; }
					}
					break;
				case 3 :
					// Generator.g:1321:7: nExpOperation= operationExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_operationExpression_in_propertyCall6406);
					nExpOperation=operationExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExpOperation!=null?((GeneratorParser.operationExpression_return)nExpOperation).n:null); }
					}
					break;
				case 4 :
					// Generator.g:1322:7: nExpType= typeExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_typeExpression_in_propertyCall6419);
					nExpType=typeExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpType; }
					}
					break;
				case 5 :
					// Generator.g:1323:7: nExpInState= inStateExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_inStateExpression_in_propertyCall6432);
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
	// Generator.g:1332:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
	public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTElemVarsDeclaration decls =null;
		ParserRuleReturnScope nExp =null;

		ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
		try {
			// Generator.g:1333:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
			// Generator.g:1334:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
			{
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression6467); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression6474); if (state.failed) return n;
			// Generator.g:1336:5: (decls= elemVarsDeclaration BAR )?
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
					// Generator.g:1336:7: decls= elemVarsDeclaration BAR
					{
					pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression6485);
					decls=elemVarsDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {decl = decls;}
					match(input,BAR,FOLLOW_BAR_in_queryExpression6489); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_queryExpression6500);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression6506); if (state.failed) return n;
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
	// Generator.g:1350:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
	public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTElemVarsDeclaration decls =null;
		ASTVariableInitialization init =null;
		ParserRuleReturnScope nExp =null;

		try {
			// Generator.g:1350:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
			// Generator.g:1351:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
			{
			i=(Token)match(input,87,FOLLOW_87_in_iterateExpression6538); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression6544); if (state.failed) return n;
			pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression6552);
			decls=elemVarsDeclaration();
			state._fsp--;
			if (state.failed) return n;
			match(input,SEMI,FOLLOW_SEMI_in_iterateExpression6554); if (state.failed) return n;
			pushFollow(FOLLOW_variableInitialization_in_iterateExpression6562);
			init=variableInitialization();
			state._fsp--;
			if (state.failed) return n;
			match(input,BAR,FOLLOW_BAR_in_iterateExpression6564); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_iterateExpression6572);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression6578); if (state.failed) return n;
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
	// Generator.g:1372:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
	public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
		retval.start = input.LT(1);

		Token name=null;
		ParserRuleReturnScope rolename =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1374:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
			// Generator.g:1375:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression6622); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }
			// Generator.g:1381:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==LBRACK) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// Generator.g:1381:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6644); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operationExpression6657);
					rolename=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((GeneratorParser.expression_return)rolename).n:null)); }
					// Generator.g:1383:9: ( COMMA rolename= expression )*
					loop128:
					while (true) {
						int alt128=2;
						int LA128_0 = input.LA(1);
						if ( (LA128_0==COMMA) ) {
							alt128=1;
						}

						switch (alt128) {
						case 1 :
							// Generator.g:1383:10: COMMA rolename= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_operationExpression6670); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression6674);
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

					match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6686); if (state.failed) return retval;
					// Generator.g:1386:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					int alt130=2;
					int LA130_0 = input.LA(1);
					if ( (LA130_0==LBRACK) ) {
						alt130=1;
					}
					switch (alt130) {
						case 1 :
							// Generator.g:1386:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6703); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression6718);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((GeneratorParser.expression_return)rolename).n:null)); }
							// Generator.g:1388:11: ( COMMA rolename= expression )*
							loop129:
							while (true) {
								int alt129=2;
								int LA129_0 = input.LA(1);
								if ( (LA129_0==COMMA) ) {
									alt129=1;
								}

								switch (alt129) {
								case 1 :
									// Generator.g:1388:12: COMMA rolename= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression6733); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression6737);
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

							match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6751); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			// Generator.g:1393:5: ( AT 'pre' )?
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
					// Generator.g:1393:7: AT 'pre'
					{
					match(input,AT,FOLLOW_AT_in_operationExpression6776); if (state.failed) return retval;
					match(input,104,FOLLOW_104_in_operationExpression6778); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.setIsPre(); }
					}
					break;

			}

			// Generator.g:1395:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==LPAREN) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// Generator.g:1396:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression6803); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.hasParentheses(); }
					// Generator.g:1397:7: (e= expression ( COMMA e= expression )* )?
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==AT||LA134_0==HASH||(LA134_0 >= IDENT && LA134_0 <= INT)||(LA134_0 >= LPAREN && LA134_0 <= MINUS)||LA134_0==PLUS||LA134_0==REAL||(LA134_0 >= STAR && LA134_0 <= STRING)||LA134_0==46||LA134_0==48||(LA134_0 >= 51 && LA134_0 <= 55)||LA134_0==78||LA134_0==81||(LA134_0 >= 87 && LA134_0 <= 88)||(LA134_0 >= 91 && LA134_0 <= 99)||(LA134_0 >= 108 && LA134_0 <= 109)||LA134_0==115) ) {
						alt134=1;
					}
					switch (alt134) {
						case 1 :
							// Generator.g:1398:7: e= expression ( COMMA e= expression )*
							{
							pushFollow(FOLLOW_expression_in_operationExpression6824);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((GeneratorParser.expression_return)e).n:null)); }
							// Generator.g:1399:7: ( COMMA e= expression )*
							loop133:
							while (true) {
								int alt133=2;
								int LA133_0 = input.LA(1);
								if ( (LA133_0==COMMA) ) {
									alt133=1;
								}

								switch (alt133) {
								case 1 :
									// Generator.g:1399:9: COMMA e= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression6836); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression6840);
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

					match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression6860); if (state.failed) return retval;
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
	// Generator.g:1406:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN ;
	public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTInStateExpression n = null;


		Token s=null;

		 Token opToken = null; 
		try {
			// Generator.g:1409:4: ( ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN )
			// Generator.g:1410:4: ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN
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
			match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression6921); if (state.failed) return n;
			s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression6930); if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression6935); if (state.failed) return n;
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
	// Generator.g:1423:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
	public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTTypeArgExpression n = null;


		ASTType t =null;

		 Token opToken = null; 
		try {
			// Generator.g:1426:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
			// Generator.g:1427:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
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
			match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression6995); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_typeExpression6999);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression7001); if (state.failed) return n;
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
	// Generator.g:1438:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
	public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
		ASTElemVarsDeclaration n = null;


		Token var1=null;
		Token varN=null;
		ASTType t =null;
		ASTType tN =null;

		try {
			// Generator.g:1439:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
			// Generator.g:1440:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
			{
			if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }
			var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration7039); if (state.failed) return n;
			// Generator.g:1441:17: ( COLON t= type )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==COLON) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Generator.g:1441:18: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration7042); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_elemVarsDeclaration7046);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}
			// Generator.g:1442:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==COMMA) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// Generator.g:1442:5: COMMA varN= IDENT ( COLON tN= type )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration7056); if (state.failed) return n;
					varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration7062); if (state.failed) return n;
					// Generator.g:1442:24: ( COLON tN= type )?
					int alt137=2;
					int LA137_0 = input.LA(1);
					if ( (LA137_0==COLON) ) {
						alt137=1;
					}
					switch (alt137) {
						case 1 :
							// Generator.g:1442:25: COLON tN= type
							{
							match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration7065); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_elemVarsDeclaration7071);
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
	// Generator.g:1450:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
	public final ASTVariableInitialization variableInitialization() throws RecognitionException {
		ASTVariableInitialization n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1451:5: (name= IDENT COLON t= type EQUAL e= expression )
			// Generator.g:1452:5: name= IDENT COLON t= type EQUAL e= expression
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization7099); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableInitialization7101); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableInitialization7105);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization7107); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_variableInitialization7111);
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
	// Generator.g:1461:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
	public final ASTExpression ifExpression() throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1462:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
			// Generator.g:1463:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
			{
			i=(Token)match(input,81,FOLLOW_81_in_ifExpression7143); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression7147);
			cond=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,113,FOLLOW_113_in_ifExpression7149); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression7153);
			t=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,73,FOLLOW_73_in_ifExpression7155); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression7159);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,75,FOLLOW_75_in_ifExpression7161); if (state.failed) return n;
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
	// Generator.g:1482:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
			// Generator.g:1483:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
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
					// Generator.g:1484:7: t= 'true'
					{
					t=(Token)match(input,115,FOLLOW_115_in_literal7200); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }
					}
					break;
				case 2 :
					// Generator.g:1485:7: f= 'false'
					{
					f=(Token)match(input,78,FOLLOW_78_in_literal7214); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }
					}
					break;
				case 3 :
					// Generator.g:1486:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_literal7227); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }
					}
					break;
				case 4 :
					// Generator.g:1487:7: r= REAL
					{
					r=(Token)match(input,REAL,FOLLOW_REAL_in_literal7242); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }
					}
					break;
				case 5 :
					// Generator.g:1488:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_literal7256); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }
					}
					break;
				case 6 :
					// Generator.g:1489:7: HASH enumLit= IDENT
					{
					match(input,HASH,FOLLOW_HASH_in_literal7266); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7270); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}
					}
					break;
				case 7 :
					// Generator.g:1490:7: enumName= IDENT '::' enumLit= IDENT
					{
					enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7282); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal7284); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7288); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }
					}
					break;
				case 8 :
					// Generator.g:1491:7: nColIt= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_literal7300);
					nColIt=collectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nColIt; }
					}
					break;
				case 9 :
					// Generator.g:1492:7: nEColIt= emptyCollectionLiteral
					{
					pushFollow(FOLLOW_emptyCollectionLiteral_in_literal7312);
					nEColIt=emptyCollectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nEColIt; }
					}
					break;
				case 10 :
					// Generator.g:1493:7: nUndLit= undefinedLiteral
					{
					pushFollow(FOLLOW_undefinedLiteral_in_literal7324);
					nUndLit=undefinedLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nUndLit; }
					}
					break;
				case 11 :
					// Generator.g:1494:7: nTupleLit= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_literal7336);
					nTupleLit=tupleLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nTupleLit; }
					}
					break;
				case 12 :
					// Generator.g:1495:7: un= STAR
					{
					un=(Token)match(input,STAR,FOLLOW_STAR_in_literal7348); if (state.failed) return n;
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
	// Generator.g:1503:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
	public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
		ASTCollectionLiteral n = null;


		ASTCollectionItem ci =null;

		 Token op = null; 
		try {
			// Generator.g:1505:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
			// Generator.g:1506:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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
			match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral7415); if (state.failed) return n;
			// Generator.g:1510:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==AT||LA141_0==HASH||(LA141_0 >= IDENT && LA141_0 <= INT)||(LA141_0 >= LPAREN && LA141_0 <= MINUS)||LA141_0==PLUS||LA141_0==REAL||(LA141_0 >= STAR && LA141_0 <= STRING)||LA141_0==46||LA141_0==48||(LA141_0 >= 51 && LA141_0 <= 55)||LA141_0==78||LA141_0==81||(LA141_0 >= 87 && LA141_0 <= 88)||(LA141_0 >= 91 && LA141_0 <= 99)||(LA141_0 >= 108 && LA141_0 <= 109)||LA141_0==115) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// Generator.g:1511:7: ci= collectionItem ( COMMA ci= collectionItem )*
					{
					pushFollow(FOLLOW_collectionItem_in_collectionLiteral7432);
					ci=collectionItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addItem(ci); }
					// Generator.g:1512:7: ( COMMA ci= collectionItem )*
					loop140:
					while (true) {
						int alt140=2;
						int LA140_0 = input.LA(1);
						if ( (LA140_0==COMMA) ) {
							alt140=1;
						}

						switch (alt140) {
						case 1 :
							// Generator.g:1512:9: COMMA ci= collectionItem
							{
							match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral7445); if (state.failed) return n;
							pushFollow(FOLLOW_collectionItem_in_collectionLiteral7449);
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

			match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral7468); if (state.failed) return n;
			}

		}
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
	// Generator.g:1521:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
	public final ASTCollectionItem collectionItem() throws RecognitionException {
		ASTCollectionItem n = null;


		ParserRuleReturnScope e =null;

		 n = new ASTCollectionItem(); 
		try {
			// Generator.g:1523:5: (e= expression ( DOTDOT e= expression )? )
			// Generator.g:1524:5: e= expression ( DOTDOT e= expression )?
			{
			pushFollow(FOLLOW_expression_in_collectionItem7497);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setFirst((e!=null?((GeneratorParser.expression_return)e).n:null)); }
			// Generator.g:1525:5: ( DOTDOT e= expression )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==DOTDOT) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// Generator.g:1525:7: DOTDOT e= expression
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem7508); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_collectionItem7512);
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
	// Generator.g:1535:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
	public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
		ASTEmptyCollectionLiteral n = null;


		ASTCollectionType t =null;

		try {
			// Generator.g:1536:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
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
					// Generator.g:1537:5: 'oclEmpty' LPAREN t= collectionType RPAREN
					{
					match(input,94,FOLLOW_94_in_emptyCollectionLiteral7541); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral7543); if (state.failed) return n;
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7547);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral7549); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;
				case 2 :
					// Generator.g:1540:5: t= collectionType LBRACE RBRACE
					{
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7565);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral7567); if (state.failed) return n;
					match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral7569); if (state.failed) return n;
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
	// Generator.g:1551:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
	public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
		ASTUndefinedLiteral n = null;


		ASTType t =null;

		try {
			// Generator.g:1552:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
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
					// Generator.g:1553:5: 'oclUndefined' LPAREN t= type RPAREN
					{
					match(input,99,FOLLOW_99_in_undefinedLiteral7599); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7601); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral7605);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7607); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 2 :
					// Generator.g:1556:5: 'Undefined'
					{
					match(input,55,FOLLOW_55_in_undefinedLiteral7621); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;
				case 3 :
					// Generator.g:1559:5: 'null' LPAREN t= type RPAREN
					{
					match(input,92,FOLLOW_92_in_undefinedLiteral7635); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7637); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral7641);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7643); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 4 :
					// Generator.g:1562:5: 'null'
					{
					match(input,92,FOLLOW_92_in_undefinedLiteral7657); if (state.failed) return n;
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
	// Generator.g:1572:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
	public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
		ASTTupleLiteral n = null;


		ASTTupleItem ti =null;

		 List tiList = new ArrayList(); 
		try {
			// Generator.g:1574:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
			// Generator.g:1575:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
			{
			match(input,54,FOLLOW_54_in_tupleLiteral7696); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral7702); if (state.failed) return n;
			pushFollow(FOLLOW_tupleItem_in_tupleLiteral7710);
			ti=tupleItem();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tiList.add(ti); }
			// Generator.g:1578:5: ( COMMA ti= tupleItem )*
			loop145:
			while (true) {
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==COMMA) ) {
					alt145=1;
				}

				switch (alt145) {
				case 1 :
					// Generator.g:1578:7: COMMA ti= tupleItem
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral7721); if (state.failed) return n;
					pushFollow(FOLLOW_tupleItem_in_tupleLiteral7725);
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

			match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral7736); if (state.failed) return n;
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
	// Generator.g:1586:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
	public final ASTTupleItem tupleItem() throws RecognitionException {
		ASTTupleItem n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// Generator.g:1587:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
			// Generator.g:1588:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem7767); if (state.failed) return n;
			// Generator.g:1589:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
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
					// Generator.g:1592:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
					{
					match(input,COLON,FOLLOW_COLON_in_tupleItem7806); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_tupleItem7810);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem7812); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_tupleItem7816);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?((GeneratorParser.expression_return)e).n:null)); }
					}
					break;
				case 2 :
					// Generator.g:1595:7: ( COLON | EQUAL ) e= expression
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
					pushFollow(FOLLOW_expression_in_tupleItem7848);
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
	// Generator.g:1606:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
	public final ASTType type() throws RecognitionException {
		ASTType n = null;


		ASTSimpleType nTSimple =null;
		ASTCollectionType nTCollection =null;
		ASTTupleType nTTuple =null;

		 Token tok = null; 
		try {
			// Generator.g:1608:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
			// Generator.g:1609:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }
			// Generator.g:1610:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
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
					// Generator.g:1611:7: nTSimple= simpleType
					{
					pushFollow(FOLLOW_simpleType_in_type7914);
					nTSimple=simpleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 2 :
					// Generator.g:1612:7: nTCollection= collectionType
					{
					pushFollow(FOLLOW_collectionType_in_type7926);
					nTCollection=collectionType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 3 :
					// Generator.g:1613:7: nTTuple= tupleType
					{
					pushFollow(FOLLOW_tupleType_in_type7938);
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
	// Generator.g:1618:1: typeOnly returns [ASTType n] : nT= type EOF ;
	public final ASTType typeOnly() throws RecognitionException {
		ASTType n = null;


		ASTType nT =null;

		try {
			// Generator.g:1619:5: (nT= type EOF )
			// Generator.g:1620:5: nT= type EOF
			{
			pushFollow(FOLLOW_type_in_typeOnly7970);
			nT=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_typeOnly7972); if (state.failed) return n;
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
	// Generator.g:1630:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
	public final ASTSimpleType simpleType() throws RecognitionException {
		ASTSimpleType n = null;


		Token name=null;

		try {
			// Generator.g:1631:5: (name= IDENT )
			// Generator.g:1632:5: name= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType8000); if (state.failed) return n;
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
	// Generator.g:1640:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
	public final ASTCollectionType collectionType() throws RecognitionException {
		ASTCollectionType n = null;


		ASTType elemType =null;

		 Token op = null; 
		try {
			// Generator.g:1642:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
			// Generator.g:1643:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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
			match(input,LPAREN,FOLLOW_LPAREN_in_collectionType8065); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_collectionType8069);
			elemType=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_collectionType8071); if (state.failed) return n;
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
	// Generator.g:1653:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
	public final ASTTupleType tupleType() throws RecognitionException {
		ASTTupleType n = null;


		ASTTuplePart tp =null;

		 List tpList = new ArrayList(); 
		try {
			// Generator.g:1655:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
			// Generator.g:1656:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
			{
			match(input,54,FOLLOW_54_in_tupleType8105); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_tupleType8107); if (state.failed) return n;
			pushFollow(FOLLOW_tuplePart_in_tupleType8116);
			tp=tuplePart();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tpList.add(tp); }
			// Generator.g:1658:5: ( COMMA tp= tuplePart )*
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==COMMA) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// Generator.g:1658:7: COMMA tp= tuplePart
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleType8127); if (state.failed) return n;
					pushFollow(FOLLOW_tuplePart_in_tupleType8131);
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

			match(input,RPAREN,FOLLOW_RPAREN_in_tupleType8143); if (state.failed) return n;
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
	// Generator.g:1667:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
	public final ASTTuplePart tuplePart() throws RecognitionException {
		ASTTuplePart n = null;


		Token name=null;
		ASTType t =null;

		try {
			// Generator.g:1668:5: (name= IDENT COLON t= type )
			// Generator.g:1669:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart8175); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_tuplePart8177); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_tuplePart8181);
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
	// Generator.g:1708:1: statOnly returns [ASTStatement n] : s= stat EOF ;
	public final ASTStatement statOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;

		try {
			// Generator.g:1709:3: (s= stat EOF )
			// Generator.g:1710:3: s= stat EOF
			{
			pushFollow(FOLLOW_stat_in_statOnly8230);
			s=stat();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_statOnly8234); if (state.failed) return n;
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
	// Generator.g:1720:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
	public final GeneratorParser.stat_return stat() throws RecognitionException {
		GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
		retval.start = input.LT(1);

		ASTStatement s =null;
		ASTStatement s2 =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// Generator.g:1724:3: (s= singleStat ( SEMI s2= singleStat )* )
			// Generator.g:1725:3: s= singleStat ( SEMI s2= singleStat )*
			{
			pushFollow(FOLLOW_singleStat_in_stat8269);
			s=singleStat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {seq.addStatement(s);}
			// Generator.g:1726:3: ( SEMI s2= singleStat )*
			loop149:
			while (true) {
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==SEMI) ) {
					alt149=1;
				}

				switch (alt149) {
				case 1 :
					// Generator.g:1727:5: SEMI s2= singleStat
					{
					match(input,SEMI,FOLLOW_SEMI_in_stat8281); if (state.failed) return retval;
					pushFollow(FOLLOW_singleStat_in_stat8291);
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
	// Generator.g:1739:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
			// Generator.g:1740:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
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
					// Generator.g:1741:5: emp= emptyStat
					{
					pushFollow(FOLLOW_emptyStat_in_singleStat8331);
					emp=emptyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = emp; }
					}
					break;
				case 2 :
					// Generator.g:1743:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
					{
					pushFollow(FOLLOW_statStartingWithExpr_in_singleStat8357);
					sse=statStartingWithExpr();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (sse!=null?((GeneratorParser.statStartingWithExpr_return)sse).n:null); }
					}
					break;
				case 3 :
					// Generator.g:1744:5: vas= varAssignStat
					{
					pushFollow(FOLLOW_varAssignStat_in_singleStat8369);
					vas=varAssignStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = vas; }
					}
					break;
				case 4 :
					// Generator.g:1745:5: ocs= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_singleStat8383);
					ocs=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ocs!=null?((GeneratorParser.objCreateStat_return)ocs).n:null); }
					}
					break;
				case 5 :
					// Generator.g:1746:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleStat8397);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((GeneratorParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 6 :
					// Generator.g:1747:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleStat8410);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((GeneratorParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 7 :
					// Generator.g:1748:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleStat8427);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((GeneratorParser.lnkDelStat_return)lds).n:null); }
					}
					break;
				case 8 :
					// Generator.g:1749:5: ces= condExStat
					{
					pushFollow(FOLLOW_condExStat_in_singleStat8444);
					ces=condExStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ces!=null?((GeneratorParser.condExStat_return)ces).n:null); }
					}
					break;
				case 9 :
					// Generator.g:1750:5: its= iterStat
					{
					pushFollow(FOLLOW_iterStat_in_singleStat8461);
					its=iterStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (its!=null?((GeneratorParser.iterStat_return)its).n:null); }
					}
					break;
				case 10 :
					// Generator.g:1752:5: whs= whileStat
					{
					pushFollow(FOLLOW_whileStat_in_singleStat8483);
					whs=whileStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (whs!=null?((GeneratorParser.whileStat_return)whs).n:null); }
					}
					break;
				case 11 :
					// Generator.g:1753:5: blk= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_singleStat8501);
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
	// Generator.g:1760:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
	public final ASTEmptyStatement emptyStat() throws RecognitionException {
		ASTEmptyStatement n = null;


		try {
			// Generator.g:1761:3: ( nothing )
			// Generator.g:1762:3: nothing
			{
			pushFollow(FOLLOW_nothing_in_emptyStat8528);
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
	// Generator.g:1767:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
	public final GeneratorParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
		GeneratorParser.statStartingWithExpr_return retval = new GeneratorParser.statStartingWithExpr_return();
		retval.start = input.LT(1);

		ASTExpression expr =null;
		ASTAttributeAssignmentStatement aas =null;

		try {
			// Generator.g:1768:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
			// Generator.g:1769:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
			{
			pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr8554);
			expr=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			// Generator.g:1770:3: (aas= attAssignStat[$expr.n] )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==DOT) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// Generator.g:1771:5: aas= attAssignStat[$expr.n]
					{
					pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr8568);
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
	// Generator.g:1783:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
	public final ASTStatement varAssignStat() throws RecognitionException {
		ASTStatement n = null;


		Token varName=null;
		ASTRValue rVal =null;

		try {
			// Generator.g:1784:3: (varName= IDENT COLON_EQUAL rVal= rValue )
			// Generator.g:1785:3: varName= IDENT COLON_EQUAL rVal= rValue
			{
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat8606); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat8610); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_varAssignStat8618);
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
	// Generator.g:1797:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
	public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
		ASTAttributeAssignmentStatement n = null;


		Token attName=null;
		ASTRValue r =null;

		try {
			// Generator.g:1798:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
			// Generator.g:1799:3: DOT attName= IDENT COLON_EQUAL r= rValue
			{
			match(input,DOT,FOLLOW_DOT_in_attAssignStat8642); if (state.failed) return n;
			attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat8651); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat8655); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_attAssignStat8663);
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
	// Generator.g:1811:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
	public final GeneratorParser.objCreateStat_return objCreateStat() throws RecognitionException {
		GeneratorParser.objCreateStat_return retval = new GeneratorParser.objCreateStat_return();
		retval.start = input.LT(1);

		ASTSimpleType ident =null;
		ASTExpression objName =null;
		ParserRuleReturnScope p =null;

		try {
			// Generator.g:1812:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
			// Generator.g:1813:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			{
			match(input,90,FOLLOW_90_in_objCreateStat8689); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_objCreateStat8697);
			ident=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			// Generator.g:1815:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==LPAREN) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// Generator.g:1816:5: LPAREN (objName= inSoilExpression )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8707); if (state.failed) return retval;
					// Generator.g:1817:7: (objName= inSoilExpression )?
					int alt152=2;
					int LA152_0 = input.LA(1);
					if ( (LA152_0==AT||LA152_0==HASH||(LA152_0 >= IDENT && LA152_0 <= INT)||(LA152_0 >= LPAREN && LA152_0 <= MINUS)||LA152_0==PLUS||LA152_0==REAL||(LA152_0 >= STAR && LA152_0 <= STRING)||LA152_0==46||LA152_0==48||(LA152_0 >= 51 && LA152_0 <= 55)||LA152_0==78||LA152_0==81||(LA152_0 >= 87 && LA152_0 <= 88)||(LA152_0 >= 91 && LA152_0 <= 99)||(LA152_0 >= 108 && LA152_0 <= 109)||LA152_0==115) ) {
						alt152=1;
					}
					switch (alt152) {
						case 1 :
							// Generator.g:1817:8: objName= inSoilExpression
							{
							pushFollow(FOLLOW_inSoilExpression_in_objCreateStat8720);
							objName=inSoilExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8728); if (state.failed) return retval;
					}
					break;

			}

			// Generator.g:1821:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==63) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// Generator.g:1822:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
					{
					match(input,63,FOLLOW_63_in_objCreateStat8746); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8754); if (state.failed) return retval;
					pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8768);
					p=rValListMin2WithOptionalQualifiers();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8776); if (state.failed) return retval;
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
	// Generator.g:1841:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
	public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
		GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
		retval.start = input.LT(1);

		List<ASTExpression> el =null;

		try {
			// Generator.g:1842:3: ( 'destroy' el= exprListMin1 )
			// Generator.g:1843:3: 'destroy' el= exprListMin1
			{
			match(input,70,FOLLOW_70_in_objDestroyStat8812); if (state.failed) return retval;
			pushFollow(FOLLOW_exprListMin1_in_objDestroyStat8820);
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
	// Generator.g:1862:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
	public final GeneratorParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
		GeneratorParser.lnkInsStat_return retval = new GeneratorParser.lnkInsStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// Generator.g:1863:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
			// Generator.g:1864:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
			{
			match(input,84,FOLLOW_84_in_lnkInsStat8846); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat8850); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8860);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat8864); if (state.failed) return retval;
			match(input,85,FOLLOW_85_in_lnkInsStat8868); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat8876); if (state.failed) return retval;
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
	// Generator.g:1874:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
	public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
		GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
		retval.start = input.LT(1);

		ASTRValue r =null;
		List<ASTRValue> qualifierValues =null;


		  retval.participans = new ArrayList<ASTRValue>();
		  retval.qualifiers = new ArrayList<List<ASTRValue>>();
		  List<ASTRValue> currentQualifiers = Collections.emptyList();

		try {
			// Generator.g:1880:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
			// Generator.g:1881:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8905);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// Generator.g:1882:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==LBRACE) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// Generator.g:1883:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8916); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8925);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8932); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8948); if (state.failed) return retval;
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8959);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// Generator.g:1895:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==LBRACE) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// Generator.g:1896:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8970); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8979);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8986); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			// Generator.g:1905:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			loop158:
			while (true) {
				int alt158=2;
				int LA158_0 = input.LA(1);
				if ( (LA158_0==COMMA) ) {
					alt158=1;
				}

				switch (alt158) {
				case 1 :
					// Generator.g:1906:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9008); if (state.failed) return retval;
					pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9023);
					r=rValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.participans.add(r); }
					// Generator.g:1910:5: ( LBRACE qualifierValues= rValList RBRACE )?
					int alt157=2;
					int LA157_0 = input.LA(1);
					if ( (LA157_0==LBRACE) ) {
						alt157=1;
					}
					switch (alt157) {
						case 1 :
							// Generator.g:1911:6: LBRACE qualifierValues= rValList RBRACE
							{
							match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9043); if (state.failed) return retval;
							pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9054);
							qualifierValues=rValList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
							match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9063); if (state.failed) return retval;
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
	// Generator.g:1926:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
	public final GeneratorParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
		GeneratorParser.lnkDelStat_return retval = new GeneratorParser.lnkDelStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// Generator.g:1927:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
			// Generator.g:1928:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
			{
			match(input,69,FOLLOW_69_in_lnkDelStat9104); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat9108); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat9118);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat9122); if (state.failed) return retval;
			match(input,80,FOLLOW_80_in_lnkDelStat9126); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat9135); if (state.failed) return retval;
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
	// Generator.g:1942:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
	public final GeneratorParser.condExStat_return condExStat() throws RecognitionException {
		GeneratorParser.condExStat_return retval = new GeneratorParser.condExStat_return();
		retval.start = input.LT(1);

		ASTExpression con =null;
		ASTStatement ts =null;
		ASTStatement es =null;


		  ASTStatement elseStat = new ASTEmptyStatement();

		try {
			// Generator.g:1946:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
			// Generator.g:1947:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
			{
			match(input,81,FOLLOW_81_in_condExStat9166); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_condExStat9175);
			con=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,113,FOLLOW_113_in_condExStat9179); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat9188);
			ts=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			// Generator.g:1951:3: ( 'else' es= statOrImplicitBlock )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==73) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// Generator.g:1952:5: 'else' es= statOrImplicitBlock
					{
					match(input,73,FOLLOW_73_in_condExStat9199); if (state.failed) return retval;
					pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat9211);
					es=statOrImplicitBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { elseStat = es; }
					}
					break;

			}

			match(input,74,FOLLOW_74_in_condExStat9223); if (state.failed) return retval;
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
	// Generator.g:1963:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final GeneratorParser.iterStat_return iterStat() throws RecognitionException {
		GeneratorParser.iterStat_return retval = new GeneratorParser.iterStat_return();
		retval.start = input.LT(1);

		Token var=null;
		ASTExpression set =null;
		ASTStatement s =null;

		try {
			// Generator.g:1964:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// Generator.g:1965:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,79,FOLLOW_79_in_iterStat9248); if (state.failed) return retval;
			var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat9256); if (state.failed) return retval;
			match(input,83,FOLLOW_83_in_iterStat9260); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_iterStat9268);
			set=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,72,FOLLOW_72_in_iterStat9272); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat9280);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,74,FOLLOW_74_in_iterStat9285); if (state.failed) return retval;
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
	// Generator.g:1980:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final GeneratorParser.whileStat_return whileStat() throws RecognitionException {
		GeneratorParser.whileStat_return retval = new GeneratorParser.whileStat_return();
		retval.start = input.LT(1);

		ASTExpression cond =null;
		ASTStatement s =null;

		try {
			// Generator.g:1981:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// Generator.g:1982:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,117,FOLLOW_117_in_whileStat9311); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_whileStat9319);
			cond=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,72,FOLLOW_72_in_whileStat9323); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat9331);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,74,FOLLOW_74_in_whileStat9336); if (state.failed) return retval;
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
	// Generator.g:1994:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
	public final GeneratorParser.blockStat_return blockStat() throws RecognitionException {
		GeneratorParser.blockStat_return retval = new GeneratorParser.blockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

		try {
			// Generator.g:1998:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
			// Generator.g:1999:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
			{
			match(input,62,FOLLOW_62_in_blockStat9366); if (state.failed) return retval;
			// Generator.g:2000:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==68) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// Generator.g:2000:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
					{
					match(input,68,FOLLOW_68_in_blockStat9371); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_blockStat9377);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
					// Generator.g:2000:73: ( COMMA vd1= variableDeclaration )*
					loop160:
					while (true) {
						int alt160=2;
						int LA160_0 = input.LA(1);
						if ( (LA160_0==COMMA) ) {
							alt160=1;
						}

						switch (alt160) {
						case 1 :
							// Generator.g:2000:75: COMMA vd1= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_blockStat9383); if (state.failed) return retval;
							pushFollow(FOLLOW_variableDeclaration_in_blockStat9389);
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

					match(input,SEMI,FOLLOW_SEMI_in_blockStat9396); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_stat_in_blockStat9406);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((GeneratorParser.stat_return)s).n:null)); }
			match(input,74,FOLLOW_74_in_blockStat9411); if (state.failed) return retval;
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
	// Generator.g:2009:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
	public final GeneratorParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
		GeneratorParser.implicitBlockStat_return retval = new GeneratorParser.implicitBlockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), false);

		try {
			// Generator.g:2013:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
			// Generator.g:2014:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
			{
			match(input,68,FOLLOW_68_in_implicitBlockStat9437); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9443);
			vd=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
			// Generator.g:2014:72: ( COMMA vd1= variableDeclaration )*
			loop162:
			while (true) {
				int alt162=2;
				int LA162_0 = input.LA(1);
				if ( (LA162_0==COMMA) ) {
					alt162=1;
				}

				switch (alt162) {
				case 1 :
					// Generator.g:2014:74: COMMA vd1= variableDeclaration
					{
					match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat9449); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9455);
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

			match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat9462); if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_implicitBlockStat9470);
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
	// Generator.g:2018:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
	public final ASTStatement statOrImplicitBlock() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;

		try {
			// Generator.g:2019:3: ( (s1= stat |s2= implicitBlockStat ) )
			// Generator.g:2020:3: (s1= stat |s2= implicitBlockStat )
			{
			// Generator.g:2020:3: (s1= stat |s2= implicitBlockStat )
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
					// Generator.g:2020:4: s1= stat
					{
					pushFollow(FOLLOW_stat_in_statOrImplicitBlock9493);
					s1=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s1!=null?((GeneratorParser.stat_return)s1).n:null); }
					}
					break;
				case 2 :
					// Generator.g:2020:31: s2= implicitBlockStat
					{
					pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock9503);
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
	// Generator.g:2034:1: nothing :;
	public final void nothing() throws RecognitionException {
		try {
			// Generator.g:2035:1: ()
			// Generator.g:2036:1: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nothing"



	// $ANTLR start "rValue"
	// Generator.g:2042:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
	public final ASTRValue rValue() throws RecognitionException {
		ASTRValue n = null;


		ASTExpression e =null;
		ParserRuleReturnScope oc =null;

		try {
			// Generator.g:2043:5: (e= inSoilExpression |oc= objCreateStat )
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
					// Generator.g:2044:5: e= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_rValue9549);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }
					}
					break;
				case 2 :
					// Generator.g:2045:5: oc= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_rValue9561);
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
	// Generator.g:2058:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
	public final List<ASTRValue> rValList() throws RecognitionException {
		List<ASTRValue> n = null;


		List<ASTRValue> rl =null;

		try {
			// Generator.g:2059:3: ( nothing |rl= rValListMin1 )
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
					// Generator.g:2060:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_rValList9584);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }
					}
					break;
				case 2 :
					// Generator.g:2063:3: rl= rValListMin1
					{
					pushFollow(FOLLOW_rValListMin1_in_rValList9611);
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
	// Generator.g:2071:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin1() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// Generator.g:2075:3: (r= rValue ( COMMA r= rValue )* )
			// Generator.g:2076:3: r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin19644);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// Generator.g:2078:3: ( COMMA r= rValue )*
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==COMMA) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// Generator.g:2079:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin19658); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin19668);
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
	// Generator.g:2089:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin2() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// Generator.g:2093:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
			// Generator.g:2094:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin29707);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin29715); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_rValListMin29723);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// Generator.g:2099:3: ( COMMA r= rValue )*
			loop167:
			while (true) {
				int alt167=2;
				int LA167_0 = input.LA(1);
				if ( (LA167_0==COMMA) ) {
					alt167=1;
				}

				switch (alt167) {
				case 1 :
					// Generator.g:2100:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin29737); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin29747);
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
	// Generator.g:2110:1: inSoilExpression returns [ASTExpression n] : e= expression ;
	public final ASTExpression inSoilExpression() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope e =null;

		try {
			// Generator.g:2111:3: (e= expression )
			// Generator.g:2112:3: e= expression
			{
			pushFollow(FOLLOW_expression_in_inSoilExpression9781);
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
	// Generator.g:2121:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
	public final List<ASTExpression> exprList() throws RecognitionException {
		List<ASTExpression> n = null;


		List<ASTExpression> el =null;

		try {
			// Generator.g:2122:3: ( nothing |el= exprListMin1 )
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
					// Generator.g:2123:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_exprList9810);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }
					}
					break;
				case 2 :
					// Generator.g:2126:3: el= exprListMin1
					{
					pushFollow(FOLLOW_exprListMin1_in_exprList9828);
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
	// Generator.g:2134:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin1() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// Generator.g:2138:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// Generator.g:2139:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin19861);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// Generator.g:2141:3: ( COMMA e= inSoilExpression )*
			loop169:
			while (true) {
				int alt169=2;
				int LA169_0 = input.LA(1);
				if ( (LA169_0==COMMA) ) {
					alt169=1;
				}

				switch (alt169) {
				case 1 :
					// Generator.g:2142:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin19876); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin19886);
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
	// Generator.g:2152:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin2() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// Generator.g:2156:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// Generator.g:2157:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin29926);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			match(input,COMMA,FOLLOW_COMMA_in_exprListMin29934); if (state.failed) return n;
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin29942);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// Generator.g:2162:3: ( COMMA e= inSoilExpression )*
			loop170:
			while (true) {
				int alt170=2;
				int LA170_0 = input.LA(1);
				if ( (LA170_0==COMMA) ) {
					alt170=1;
				}

				switch (alt170) {
				case 1 :
					// Generator.g:2163:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin29956); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin29966);
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
	// Generator.g:2173:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
	public final List<String> identList() throws RecognitionException {
		List<String> n = null;


		List<String> il =null;

		try {
			// Generator.g:2174:3: ( nothing |il= identListMin1 )
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
					// Generator.g:2175:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_identList9996);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<String>(); }
					}
					break;
				case 2 :
					// Generator.g:2178:3: il= identListMin1
					{
					pushFollow(FOLLOW_identListMin1_in_identList10013);
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
	// Generator.g:2186:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
	public final List<String> identListMin1() throws RecognitionException {
		List<String> n = null;


		Token id=null;


		  n = new ArrayList<String>();

		try {
			// Generator.g:2190:3: (id= IDENT ( COMMA id= IDENT )* )
			// Generator.g:2191:3: id= IDENT ( COMMA id= IDENT )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin110047); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }
			// Generator.g:2193:3: ( COMMA id= IDENT )*
			loop172:
			while (true) {
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==COMMA) ) {
					alt172=1;
				}

				switch (alt172) {
				case 1 :
					// Generator.g:2194:5: COMMA id= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_identListMin110061); if (state.failed) return n;
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin110071); if (state.failed) return n;
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
		// Generator.g:1592:7: ( COLON type EQUAL )
		// Generator.g:1592:8: COLON type EQUAL
		{
		match(input,COLON,FOLLOW_COLON_in_synpred1_Generator7797); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred1_Generator7799);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator7801); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Generator

	// $ANTLR start synpred2_Generator
	public final void synpred2_Generator_fragment() throws RecognitionException {
		// Generator.g:1743:5: ( statStartingWithExpr )
		// Generator.g:1743:6: statStartingWithExpr
		{
		pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator8349);
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
			return "()* loopback of 643:5: (ppc= prePostClause )*";
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
			return "()* loopback of 764:5: (inv= invariantClause )*";
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
			return "()+ loopback of 792:5: (ppc= prePostClause )+";
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
	public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataTypeDefinition_in_generalClassifierDefinition1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition1935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyClass_in_classDefinition2034 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_classDefinition2038 = new BitSet(new long[]{0x2000000001000000L,0x0000401000000402L});
	public static final BitSet FOLLOW_LESS_in_classDefinition2048 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_classDefinition2052 = new BitSet(new long[]{0x2000000000000000L,0x0000401000000402L});
	public static final BitSet FOLLOW_61_in_classDefinition2065 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_attributeDefinition_in_classDefinition2078 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_100_in_classDefinition2099 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_operationDefinition_in_classDefinition2112 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_65_in_classDefinition2134 = new BitSet(new long[]{0x0000000000000020L,0x0000400000402400L});
	public static final BitSet FOLLOW_invariantClause_in_classDefinition2154 = new BitSet(new long[]{0x0000000000000020L,0x0000400000402400L});
	public static final BitSet FOLLOW_110_in_classDefinition2180 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000400L});
	public static final BitSet FOLLOW_stateMachine_in_classDefinition2200 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000400L});
	public static final BitSet FOLLOW_74_in_classDefinition2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_associationClassDefinition2257 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationClassDefinition2283 = new BitSet(new long[]{0xA000000001100000L,0x0000401000000402L});
	public static final BitSet FOLLOW_LESS_in_associationClassDefinition2293 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_associationClassDefinition2297 = new BitSet(new long[]{0xA000000000100000L,0x0000401000000402L});
	public static final BitSet FOLLOW_63_in_associationClassDefinition2309 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2317 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2329 = new BitSet(new long[]{0x2000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_61_in_associationClassDefinition2349 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition2362 = new BitSet(new long[]{0x0000000000100020L,0x0000401000000402L});
	public static final BitSet FOLLOW_100_in_associationClassDefinition2383 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition2396 = new BitSet(new long[]{0x0000000000100020L,0x0000400000000402L});
	public static final BitSet FOLLOW_65_in_associationClassDefinition2418 = new BitSet(new long[]{0x0000000000100020L,0x0000400000402400L});
	public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2438 = new BitSet(new long[]{0x0000000000100020L,0x0000400000402400L});
	public static final BitSet FOLLOW_110_in_associationClassDefinition2464 = new BitSet(new long[]{0x0000000000100000L,0x0000040000000400L});
	public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition2484 = new BitSet(new long[]{0x0000000000100000L,0x0000040000000400L});
	public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_associationClassDefinition2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2580 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_attributeDefinition2588 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_attributeDefinition2590 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_attributeDefinition2594 = new BitSet(new long[]{0x0000004000100002L});
	public static final BitSet FOLLOW_keyDerive_in_attributeDefinition2618 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_keyDerived_in_attributeDefinition2620 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_set_in_attributeDefinition2623 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_attributeDefinition2633 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_keyInit_in_attributeDefinition2653 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_set_in_attributeDefinition2657 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_attributeDefinition2669 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_attributeDefinition2683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_operationDefinition2720 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_operationDefinition2730 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_operationDefinition2740 = new BitSet(new long[]{0x40000040040020A0L,0x0000018000000000L});
	public static final BitSet FOLLOW_superParamList_in_operationDefinition2750 = new BitSet(new long[]{0x40000040000020A2L,0x0000018000000000L});
	public static final BitSet FOLLOW_COLON_in_operationDefinition2771 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_operationDefinition2777 = new BitSet(new long[]{0x4000004000002022L,0x0000018000000000L});
	public static final BitSet FOLLOW_EQUAL_in_operationDefinition2805 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationDefinition2811 = new BitSet(new long[]{0x0000004000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_blockStat_in_operationDefinition2833 = new BitSet(new long[]{0x0000004000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_prePostClause_in_operationDefinition2855 = new BitSet(new long[]{0x0000004000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_SEMI_in_operationDefinition2868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_superParamList2903 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_IDENT_in_superParamList2921 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_superParamList2932 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_superParamList2938 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_superParamList2955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_associationDefinition2986 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyAssociation_in_associationDefinition3000 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyAggregation_in_associationDefinition3004 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyComposition_in_associationDefinition3008 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationDefinition3018 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_associationDefinition3026 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationDefinition3034 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationDefinition3046 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_associationDefinition3057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_associationEnd3082 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3090 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LBRACK_in_associationEnd3092 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicity_in_associationEnd3096 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_associationEnd3098 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyRole_in_associationEnd3109 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3113 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_102_in_associationEnd3134 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_112_in_associationEnd3146 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3150 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyUnion_in_associationEnd3162 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_107_in_associationEnd3174 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd3178 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyDerived_in_associationEnd3191 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_keyDerive_in_associationEnd3193 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_LPAREN_in_associationEnd3198 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd3204 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_associationEnd3206 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_associationEnd3210 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_associationEnd3214 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_keyQualifier_in_associationEnd3226 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_associationEnd3232 = new BitSet(new long[]{0x0000004000100002L,0x0001084000000000L});
	public static final BitSet FOLLOW_SEMI_in_associationEnd3249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicityRange_in_multiplicity3284 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_multiplicity3294 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicityRange_in_multiplicity3298 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3327 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange3337 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_multiplicitySpec3375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_multiplicitySpec3385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_invariant3426 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_invariant3436 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_COMMA_in_invariant3449 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_invariant3453 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_COLON_in_invariant3461 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_simpleType_in_invariant3473 = new BitSet(new long[]{0x0000000000000022L,0x0000000000402000L});
	public static final BitSet FOLLOW_invariantClause_in_invariant3485 = new BitSet(new long[]{0x0000000000000022L,0x0000000000402000L});
	public static final BitSet FOLLOW_annotationSet_in_invariantClause3515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_invariantClause3523 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_invariantClause3529 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_invariantClause3534 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_invariantClause3538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_invariantClause3555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_invariantClause3557 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_invariantClause3563 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_invariantClause3568 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_invariantClause3572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_prePost3605 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_prePost3609 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_prePost3611 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_prePost3615 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_prePost3619 = new BitSet(new long[]{0x00000000000000A0L,0x0000018000000000L});
	public static final BitSet FOLLOW_COLON_in_prePost3623 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_prePost3627 = new BitSet(new long[]{0x0000000000000020L,0x0000018000000000L});
	public static final BitSet FOLLOW_prePostClause_in_prePost3646 = new BitSet(new long[]{0x0000000000000022L,0x0000018000000000L});
	public static final BitSet FOLLOW_annotationSet_in_prePostClause3680 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
	public static final BitSet FOLLOW_set_in_prePostClause3692 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_prePostClause3707 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_prePostClause3712 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_prePostClause3716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotationSet3743 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_annotation3762 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_annotation3766 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_annotation3772 = new BitSet(new long[]{0x0000002000100400L});
	public static final BitSet FOLLOW_annotationValues_in_annotation3781 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_annotation3786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationValue_in_annotationValues3809 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_annotationValues3817 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_annotationValue_in_annotationValues3821 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_annotationValue3840 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_annotationValue3845 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_stateMachine3881 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_stateMachine3914 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_stateMachine3927 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_stateDefinition_in_stateMachine3943 = new BitSet(new long[]{0x0000000000100000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_stateMachine3953 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_transitionDefinition_in_stateMachine3969 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_stateMachine3979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_stateDefinition3995 = new BitSet(new long[]{0x0000000000800082L});
	public static final BitSet FOLLOW_COLON_in_stateDefinition4003 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_stateDefinition4007 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_LBRACK_in_stateDefinition4018 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_stateDefinition4024 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_stateDefinition4026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition4047 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARROW_in_transitionDefinition4049 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition4053 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_LBRACE_in_transitionDefinition4063 = new BitSet(new long[]{0x0000000000900000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4073 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_transitionDefinition4077 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4081 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000008L});
	public static final BitSet FOLLOW_event_in_transitionDefinition4105 = new BitSet(new long[]{0x0000000400800000L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition4121 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_transitionDefinition4125 = new BitSet(new long[]{0x0000002004000000L});
	public static final BitSet FOLLOW_paramList_in_transitionDefinition4130 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_transitionDefinition4137 = new BitSet(new long[]{0x0000000400800000L});
	public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4154 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_transitionDefinition4158 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4162 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_transitionDefinition4170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_event4192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keySignal_in_signalDefinition4212 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_signalDefinition4216 = new BitSet(new long[]{0x2000000001000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_LESS_in_signalDefinition4231 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_signalDefinition4235 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_61_in_signalDefinition4248 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000402L});
	public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition4261 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000402L});
	public static final BitSet FOLLOW_65_in_signalDefinition4282 = new BitSet(new long[]{0x0000000000000020L,0x0000000000402400L});
	public static final BitSet FOLLOW_invariantClause_in_signalDefinition4302 = new BitSet(new long[]{0x0000000000000020L,0x0000000000402400L});
	public static final BitSet FOLLOW_74_in_signalDefinition4326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_capAnnotation4353 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_capAnnotation4357 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_capAnnotation4359 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_capArg_in_capAnnotation4371 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_capAnnotation4384 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_capArg_in_capAnnotation4388 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_capAnnotation4400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_capArg4424 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_capArg4426 = new BitSet(new long[]{0x0000040040708020L,0x0008000000004000L});
	public static final BitSet FOLLOW_capValue_in_capArg4430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_OCL_STRING_in_capValue4455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_capValue4485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_capValue4504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_capValue4523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_capValue4540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_capValue4556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_capValue4570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumRef_in_capValue4586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_capAnnotation_in_capValue4608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_capBlock_in_capValue4624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedName4653 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_DOT_in_qualifiedName4663 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedName4667 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_IDENT_in_enumRef4698 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_enumRef4700 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_enumRef4704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_capBlock4732 = new BitSet(new long[]{0x0000040440708020L,0x0008000000004000L});
	public static final BitSet FOLLOW_capValue_in_capBlock4752 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_capBlock4765 = new BitSet(new long[]{0x0000040040708020L,0x0008000000004000L});
	public static final BitSet FOLLOW_capValue_in_capBlock4769 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_capBlock4788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyUnion4801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyAssociation4815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyRole4829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyComposition4841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyAggregation4853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDataType4867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyClass4879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keySignal4891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDerived4905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDerive4919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyInit4931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyQualifier4947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOnly4975 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expressionOnly4977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_expression5025 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_expression5036 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression5040 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_expression5044 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression5049 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_expression5053 = new BitSet(new long[]{0x0000000000000400L,0x0000000000080000L});
	public static final BitSet FOLLOW_COMMA_in_expression5091 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_expression5103 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression5107 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_expression5111 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression5116 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_expression5120 = new BitSet(new long[]{0x0000000000000400L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_expression5161 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression5177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramList5210 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList5227 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_paramList5239 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList5243 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_paramList5263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idList5292 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_idList5302 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_idList5306 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration5337 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration5339 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration5343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_conditionalImpliesExpression5392 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5441 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_conditionalOrExpression5454 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5458 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5502 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_conditionalXOrExpression5515 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5519 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5563 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_conditionalAndExpression5576 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5580 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5628 = new BitSet(new long[]{0x0000000080002002L});
	public static final BitSet FOLLOW_set_in_equalityExpression5647 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5657 = new BitSet(new long[]{0x0000000080002002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5706 = new BitSet(new long[]{0x0000000003030002L});
	public static final BitSet FOLLOW_set_in_relationalExpression5724 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5742 = new BitSet(new long[]{0x0000000003030002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5792 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression5810 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5820 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5870 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression5888 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5902 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_unaryExpression5964 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF8824000L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression6008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression6041 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_ARROW_in_postfixExpression6059 = new BitSet(new long[]{0x0000000000100000L,0x00003007A0800000L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression6065 = new BitSet(new long[]{0x0000000000100000L,0x00003007A0800000L});
	public static final BitSet FOLLOW_propertyCall_in_postfixExpression6076 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_literal_in_primaryExpression6116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectReference_in_primaryExpression6130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyCall_in_primaryExpression6142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression6153 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_primaryExpression6157 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression6159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_primaryExpression6171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression6183 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression6185 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_primaryExpression6187 = new BitSet(new long[]{0x0000000004000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression6210 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_primaryExpression6212 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression6230 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression6232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression6245 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression6247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_primaryExpression6249 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression6253 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_primaryExpression6257 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression6259 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression6279 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_primaryExpression6281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_objectReference6307 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_objectReference6315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryExpression_in_propertyCall6380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterateExpression_in_propertyCall6393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationExpression_in_propertyCall6406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeExpression_in_propertyCall6419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inStateExpression_in_propertyCall6432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_queryExpression6467 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_queryExpression6474 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression6485 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_queryExpression6489 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_queryExpression6500 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_queryExpression6506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_iterateExpression6538 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_iterateExpression6544 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression6552 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterateExpression6554 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableInitialization_in_iterateExpression6562 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_iterateExpression6564 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_iterateExpression6572 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterateExpression6578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_operationExpression6622 = new BitSet(new long[]{0x0000000004800022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression6644 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6657 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression6670 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6674 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression6686 = new BitSet(new long[]{0x0000000004800022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression6703 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6718 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression6733 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6737 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression6751 = new BitSet(new long[]{0x0000000004000022L});
	public static final BitSet FOLLOW_AT_in_operationExpression6776 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_operationExpression6778 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_operationExpression6803 = new BitSet(new long[]{0x00F946310C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6824 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression6836 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_operationExpression6840 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_operationExpression6860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inStateExpression6908 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_inStateExpression6921 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_inStateExpression6930 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_inStateExpression6935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeExpression6971 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_typeExpression6995 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_typeExpression6999 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_typeExpression7001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration7039 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration7042 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration7046 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration7056 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration7062 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration7065 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration7071 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableInitialization7099 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableInitialization7101 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_variableInitialization7105 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_variableInitialization7107 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_variableInitialization7111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_ifExpression7143 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_ifExpression7147 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_ifExpression7149 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_ifExpression7153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_ifExpression7155 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_ifExpression7159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_ifExpression7161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_literal7200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_literal7214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal7227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_literal7242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal7256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_literal7266 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_literal7270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_literal7282 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_literal7284 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_literal7288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_literal7300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal7312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_undefinedLiteral_in_literal7324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_literal7336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_literal7348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionLiteral7386 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_collectionLiteral7415 = new BitSet(new long[]{0x00F946150C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7432 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_collectionLiteral7445 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7449 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_collectionLiteral7468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_collectionItem7497 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_collectionItem7508 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_collectionItem7512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_emptyCollectionLiteral7541 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral7543 = new BitSet(new long[]{0x0039400000000000L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7547 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral7549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7565 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral7567 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral7569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_undefinedLiteral7599 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7601 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral7605 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_undefinedLiteral7621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_undefinedLiteral7635 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7637 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral7641 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_undefinedLiteral7657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_tupleLiteral7696 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_tupleLiteral7702 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7710 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleLiteral7721 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7725 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_tupleLiteral7736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tupleItem7767 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_tupleItem7806 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_tupleItem7810 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_tupleItem7812 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_tupleItem7816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_tupleItem7838 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_expression_in_tupleItem7848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type7914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_type7926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleType_in_type7938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOnly7970 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_typeOnly7972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simpleType8000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionType8038 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_collectionType8065 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_collectionType8069 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_collectionType8071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_tupleType8105 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_tupleType8107 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType8116 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleType8127 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType8131 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_tupleType8143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tuplePart8175 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_tuplePart8177 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_tuplePart8181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOnly8230 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statOnly8234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleStat_in_stat8269 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_stat8281 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C060L});
	public static final BitSet FOLLOW_singleStat_in_stat8291 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_emptyStat_in_singleStat8331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat8357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAssignStat_in_singleStat8369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_singleStat8383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleStat8397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleStat8410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleStat8427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExStat_in_singleStat8444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterStat_in_singleStat8461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_singleStat8483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStat_in_singleStat8501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_emptyStat8528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr8554 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr8568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_varAssignStat8606 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat8610 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_varAssignStat8618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_attAssignStat8642 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_attAssignStat8651 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat8655 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_attAssignStat8663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_objCreateStat8689 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_simpleType_in_objCreateStat8697 = new BitSet(new long[]{0x8000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat8707 = new BitSet(new long[]{0x00F946310C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat8720 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat8728 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_objCreateStat8746 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat8754 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8768 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat8776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_objDestroyStat8812 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat8820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_lnkInsStat8846 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkInsStat8850 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8860 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkInsStat8864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_lnkInsStat8868 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_lnkInsStat8876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8905 = new BitSet(new long[]{0x0000000000400400L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8916 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8925 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8932 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8948 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8959 = new BitSet(new long[]{0x0000000000400402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8970 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8979 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8986 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9008 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9023 = new BitSet(new long[]{0x0000000000400402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9043 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9054 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9063 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_69_in_lnkDelStat9104 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkDelStat9108 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat9118 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkDelStat9122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_lnkDelStat9126 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_lnkDelStat9135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_condExStat9166 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_condExStat9175 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_condExStat9179 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat9188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
	public static final BitSet FOLLOW_73_in_condExStat9199 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat9211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_condExStat9223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_iterStat9248 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_iterStat9256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_iterStat9260 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_iterStat9268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iterStat9272 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat9280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_iterStat9285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_whileStat9311 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_whileStat9319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_whileStat9323 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat9331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_whileStat9336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_blockStat9366 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C070L});
	public static final BitSet FOLLOW_68_in_blockStat9371 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat9377 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_blockStat9383 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat9389 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_SEMI_in_blockStat9396 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C060L});
	public static final BitSet FOLLOW_stat_in_blockStat9406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_blockStat9411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_implicitBlockStat9437 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9443 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_implicitBlockStat9449 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9455 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_SEMI_in_implicitBlockStat9462 = new BitSet(new long[]{0x40F946110C340020L,0x0028300FFD92C060L});
	public static final BitSet FOLLOW_stat_in_implicitBlockStat9470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOrImplicitBlock9493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock9503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_rValue9549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_rValue9561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_rValList9584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValListMin1_in_rValList9611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin19644 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin19658 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin19668 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_rValue_in_rValListMin29707 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin29715 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin29723 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin29737 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FFD824000L});
	public static final BitSet FOLLOW_rValue_in_rValListMin29747 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expression_in_inSoilExpression9781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_exprList9810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprListMin1_in_exprList9828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19861 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin19876 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19886 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29926 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin29934 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29942 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin29956 = new BitSet(new long[]{0x00F946110C340020L,0x0008300FF9824000L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29966 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_nothing_in_identList9996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identListMin1_in_identList10013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identListMin110047 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_identListMin110061 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_identListMin110071 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COLON_in_synpred1_Generator7797 = new BitSet(new long[]{0x0079400000100000L});
	public static final BitSet FOLLOW_type_in_synpred1_Generator7799 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator7801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator8349 = new BitSet(new long[]{0x0000000000000002L});
}
