// $ANTLR 3.5.2 USE.g 2026-03-15 21:43:54
 
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

package org.tzi.use.parser.use; 

// ------------------------------------
//  USE parser
// ------------------------------------
import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.statemachines.*;
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
public class USEParser extends BaseParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", 
		"COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", 
		"FLOAT", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", 
		"LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", 
		"NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", 
		"RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", 
		"VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", 
		"'Set'", "'Tuple'", "'Undefined'", "'abstract'", "'allInstances'", "'and'", 
		"'associationClass'", "'associationclass'", "'attributes'", "'begin'", 
		"'between'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", 
		"'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", 
		"'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", 
		"'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", 
		"'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", 
		"'oclIsInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", 
		"'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'psm'", "'redefines'", 
		"'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", 
		"'then'", "'transitions'", "'true'", "'while'", "'xor'"
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


	public USEParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public USEParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return USEParser.tokenNames; }
	@Override public String getGrammarFileName() { return "USE.g"; }



	// $ANTLR start "model"
	// USE.g:129:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )* EOF ;
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
			// USE.g:133:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )* EOF )
			// USE.g:134:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )* EOF
			{
			pushFollow(FOLLOW_annotationSet_in_model76);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			match(input,85,FOLLOW_85_in_model82); if (state.failed) return n;
			modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model86); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }
			// USE.g:136:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )*
			loop2:
			while (true) {
				int alt2=6;
				alt2 = dfa2.predict(input);
				switch (alt2) {
				case 1 :
					// USE.g:136:9: generalClassifierDefinition[$n]
					{
					pushFollow(FOLLOW_generalClassifierDefinition_in_model98);
					generalClassifierDefinition(n);
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 2 :
					// USE.g:137:9: a= associationDefinition
					{
					pushFollow(FOLLOW_associationDefinition_in_model111);
					a=associationDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addAssociation(a); }
					}
					break;
				case 3 :
					// USE.g:138:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
					{
					// USE.g:138:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
					// USE.g:138:11: 'constraints' (cons= invariant |ppc= prePost )*
					{
					match(input,61,FOLLOW_61_in_model125); if (state.failed) return n;
					// USE.g:139:11: (cons= invariant |ppc= prePost )*
					loop1:
					while (true) {
						int alt1=3;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==62) ) {
							int LA1_2 = input.LA(2);
							if ( (LA1_2==IDENT) ) {
								int LA1_3 = input.LA(3);
								if ( (LA1_3==COLON_COLON) ) {
									alt1=2;
								}
								else if ( (LA1_3==EOF||LA1_3==AT||LA1_3==COLON||LA1_3==COMMA||LA1_3==IDENT||LA1_3==52||(LA1_3 >= 55 && LA1_3 <= 56)||(LA1_3 >= 61 && LA1_3 <= 62)||(LA1_3 >= 72 && LA1_3 <= 73)||LA1_3==82) ) {
									alt1=1;
								}

							}

						}

						switch (alt1) {
						case 1 :
							// USE.g:139:15: cons= invariant
							{
							pushFollow(FOLLOW_invariant_in_model143);
							cons=invariant();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addConstraint(cons); }
							}
							break;
						case 2 :
							// USE.g:140:15: ppc= prePost
							{
							pushFollow(FOLLOW_prePost_in_model164);
							ppc=prePost();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addPrePost(ppc); }
							}
							break;

						default :
							break loop1;
						}
					}

					}

					}
					break;
				case 4 :
					// USE.g:143:9: e= enumTypeDefinition
					{
					pushFollow(FOLLOW_enumTypeDefinition_in_model204);
					e=enumTypeDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }
					}
					break;
				case 5 :
					// USE.g:144:9: ca= capAnnotation
					{
					pushFollow(FOLLOW_capAnnotation_in_model218);
					ca=capAnnotation();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { capAnnos.add(ca); }
					}
					break;

				default :
					break loop2;
				}
			}

			if ( state.backtracking==0 ) { n.setCapAnnotations(capAnnos); }
			match(input,EOF,FOLLOW_EOF_in_model239); if (state.failed) return n;
			}

		}
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
	// USE.g:154:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
	public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
		ASTEnumTypeDefinition n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		List idListRes =null;

		try {
			// USE.g:155:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
			// USE.g:156:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition267);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			match(input,72,FOLLOW_72_in_enumTypeDefinition273); if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition277); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition279); if (state.failed) return n;
			pushFollow(FOLLOW_idList_in_enumTypeDefinition283);
			idListRes=idList();
			state._fsp--;
			if (state.failed) return n;
			match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition285); if (state.failed) return n;
			// USE.g:157:54: ( SEMI )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==SEMI) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// USE.g:157:56: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition289); if (state.failed) return n;
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
	// USE.g:172:1: dataTypeDefinition[boolean isAbstract] returns [ASTDataType n] : keyDataType name= IDENT ( LESS idListRes= idList )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
	public final ASTDataType dataTypeDefinition(boolean isAbstract) throws RecognitionException {
		ASTDataType n = null;


		Token name=null;
		List idListRes =null;
		ASTOperation op =null;
		ASTInvariantClause inv =null;

		try {
			// USE.g:173:5: ( keyDataType name= IDENT ( LESS idListRes= idList )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
			// USE.g:174:5: keyDataType name= IDENT ( LESS idListRes= idList )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
			{
			pushFollow(FOLLOW_keyDataType_in_dataTypeDefinition326);
			keyDataType();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_dataTypeDefinition330); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTDataType(name, isAbstract); }
			// USE.g:175:5: ( LESS idListRes= idList )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LESS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// USE.g:175:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_dataTypeDefinition340); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_dataTypeDefinition344);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// USE.g:176:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==96) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// USE.g:176:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,96,FOLLOW_96_in_dataTypeDefinition357); if (state.failed) return n;
					// USE.g:177:7: (op= operationDefinition[n] )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==AT||LA5_0==IDENT||LA5_0==52||(LA5_0 >= 55 && LA5_0 <= 56)||LA5_0==72||LA5_0==82||LA5_0==85||(LA5_0 >= 99 && LA5_0 <= 100)) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// USE.g:178:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_dataTypeDefinition377);
							op=operationDefinition(n);
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addOperation(op); }
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			// USE.g:181:5: ( 'constraints' (inv= invariantClause )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==61) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// USE.g:181:7: 'constraints' (inv= invariantClause )*
					{
					match(input,61,FOLLOW_61_in_dataTypeDefinition404); if (state.failed) return n;
					// USE.g:182:7: (inv= invariantClause )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==AT||LA7_0==IDENT||LA7_0==52||(LA7_0 >= 55 && LA7_0 <= 56)||(LA7_0 >= 72 && LA7_0 <= 73)||LA7_0==82||LA7_0==85||(LA7_0 >= 99 && LA7_0 <= 100)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// USE.g:183:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_dataTypeDefinition424);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			match(input,70,FOLLOW_70_in_dataTypeDefinition448); if (state.failed) return n;
			}

		}
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
	// USE.g:194:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
	public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
		Set<ASTAnnotation> as =null;
		ASTClass c =null;
		ASTDataType d =null;
		ASTAssociationClass ac =null;
		ASTSignal s =null;

		 
		  boolean isAbstract = false;
		  List<CAPAnnotation> caps = new ArrayList<>();

		try {
			// USE.g:199:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
			// USE.g:200:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
			{
			pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition473);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return;
			// USE.g:201:5: ( 'abstract' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==52) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// USE.g:201:7: 'abstract'
					{
					match(input,52,FOLLOW_52_in_generalClassifierDefinition481); if (state.failed) return;
					if ( state.backtracking==0 ) { isAbstract = true; }
					}
					break;

			}

			// USE.g:202:5: (c= classDefinition[isAbstract] |d= dataTypeDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
			int alt10=4;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==IDENT) ) {
				int LA10_1 = input.LA(2);
				if ( ((input.LT(1).getText().equals("class"))) ) {
					alt10=1;
				}
				else if ( ((input.LT(1).getText().equals("dataType"))) ) {
					alt10=2;
				}
				else if ( ((input.LT(1).getText().equals("signal"))) ) {
					alt10=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
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
			else if ( ((LA10_0 >= 55 && LA10_0 <= 56)) ) {
				alt10=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// USE.g:203:9: c= classDefinition[isAbstract]
					{
					pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition507);
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
					// USE.g:217:9: d= dataTypeDefinition[isAbstract]
					{
					pushFollow(FOLLOW_dataTypeDefinition_in_generalClassifierDefinition543);
					d=dataTypeDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addDataType(d); d.setAnnotations(as); }
					}
					break;
				case 3 :
					// USE.g:220:9: ac= associationClassDefinition[isAbstract]
					{
					pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition574);
					ac=associationClassDefinition(isAbstract);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }
					}
					break;
				case 4 :
					// USE.g:223:9: s= signalDefinition[isAbstract]
					{
					pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition619);
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
	// USE.g:244:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
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
			// USE.g:246:5: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
			// USE.g:247:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
			{
			pushFollow(FOLLOW_keyClass_in_classDefinition673);
			keyClass();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition677); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); }
			// USE.g:248:5: ( LESS idListRes= idList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==LESS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// USE.g:248:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_classDefinition687); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_classDefinition691);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// USE.g:249:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==57) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// USE.g:249:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,57,FOLLOW_57_in_classDefinition704); if (state.failed) return n;
					// USE.g:250:7: (a= attributeDefinition )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==AT||LA12_0==IDENT||LA12_0==52||(LA12_0 >= 55 && LA12_0 <= 56)||LA12_0==72||LA12_0==82||LA12_0==85||(LA12_0 >= 99 && LA12_0 <= 100)) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// USE.g:250:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_classDefinition717);
							a=attributeDefinition();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addAttribute(a); }
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			// USE.g:252:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==96) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// USE.g:252:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,96,FOLLOW_96_in_classDefinition738); if (state.failed) return n;
					// USE.g:253:7: (op= operationDefinition[n] )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==AT||LA14_0==IDENT||LA14_0==52||(LA14_0 >= 55 && LA14_0 <= 56)||LA14_0==72||LA14_0==82||LA14_0==85||(LA14_0 >= 99 && LA14_0 <= 100)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// USE.g:253:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_classDefinition751);
							op=operationDefinition(n);
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addOperation(op); }
							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

			}

			// USE.g:255:5: ( 'constraints' (inv= invariantClause )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==61) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// USE.g:255:7: 'constraints' (inv= invariantClause )*
					{
					match(input,61,FOLLOW_61_in_classDefinition773); if (state.failed) return n;
					// USE.g:256:7: (inv= invariantClause )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==AT||LA16_0==IDENT||LA16_0==52||(LA16_0 >= 55 && LA16_0 <= 56)||(LA16_0 >= 72 && LA16_0 <= 73)||LA16_0==82||LA16_0==85||(LA16_0 >= 99 && LA16_0 <= 100)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// USE.g:257:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_classDefinition793);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

			}

			// USE.g:260:5: ( 'statemachines' (sm= stateMachine )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==105) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// USE.g:260:7: 'statemachines' (sm= stateMachine )*
					{
					match(input,105,FOLLOW_105_in_classDefinition819); if (state.failed) return n;
					// USE.g:261:7: (sm= stateMachine )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==101) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// USE.g:262:9: sm= stateMachine
							{
							pushFollow(FOLLOW_stateMachine_in_classDefinition839);
							sm=stateMachine();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addStateMachine(sm); }
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			match(input,70,FOLLOW_70_in_classDefinition863); if (state.failed) return n;
			}

		}
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
	// USE.g:283:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
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
			// USE.g:285:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
			// USE.g:286:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition[n] )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
			{
			classKW=input.LT(1);
			if ( (input.LA(1) >= 55 && input.LA(1) <= 56) ) {
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
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition922); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }
			// USE.g:295:5: ( LESS idListRes= idList )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==LESS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// USE.g:295:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_associationClassDefinition932); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_associationClassDefinition936);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSuperClassifiers(idListRes); }
					}
					break;

			}

			// USE.g:296:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==59) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// USE.g:296:6: 'between' ae= associationEnd (ae= associationEnd )+
					{
					match(input,59,FOLLOW_59_in_associationClassDefinition948); if (state.failed) return n;
					pushFollow(FOLLOW_associationEnd_in_associationClassDefinition956);
					ae=associationEnd();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addEnd(ae); }
					// USE.g:298:5: (ae= associationEnd )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==IDENT) ) {
							int LA21_2 = input.LA(2);
							if ( (LA21_2==LBRACK) ) {
								alt21=1;
							}

						}
						else if ( (LA21_0==AT) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// USE.g:298:7: ae= associationEnd
							{
							pushFollow(FOLLOW_associationEnd_in_associationClassDefinition968);
							ae=associationEnd();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addEnd(ae); }
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return n;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					}
					break;

			}

			// USE.g:300:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==57) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// USE.g:300:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,57,FOLLOW_57_in_associationClassDefinition988); if (state.failed) return n;
					// USE.g:301:7: (a= attributeDefinition )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==IDENT) ) {
							int LA23_2 = input.LA(2);
							if ( (LA23_2==COLON) ) {
								alt23=1;
							}

						}
						else if ( (LA23_0==AT) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// USE.g:301:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition1001);
							a=attributeDefinition();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addAttribute(a); }
							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}

			// USE.g:303:5: ( 'operations' (op= operationDefinition[n] )* )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==96) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// USE.g:303:7: 'operations' (op= operationDefinition[n] )*
					{
					match(input,96,FOLLOW_96_in_associationClassDefinition1022); if (state.failed) return n;
					// USE.g:304:7: (op= operationDefinition[n] )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==IDENT) ) {
							int LA25_2 = input.LA(2);
							if ( (LA25_2==LPAREN) ) {
								alt25=1;
							}

						}
						else if ( (LA25_0==AT) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// USE.g:304:9: op= operationDefinition[n]
							{
							pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition1035);
							op=operationDefinition(n);
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addOperation(op); }
							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;

			}

			// USE.g:306:5: ( 'constraints' (inv= invariantClause )* )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==61) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// USE.g:306:7: 'constraints' (inv= invariantClause )*
					{
					match(input,61,FOLLOW_61_in_associationClassDefinition1057); if (state.failed) return n;
					// USE.g:307:7: (inv= invariantClause )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==AT||LA27_0==73||LA27_0==82) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// USE.g:308:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_associationClassDefinition1077);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop27;
						}
					}

					}
					break;

			}

			// USE.g:311:5: ( 'statemachines' (sm= stateMachine )* )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==105) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// USE.g:311:7: 'statemachines' (sm= stateMachine )*
					{
					match(input,105,FOLLOW_105_in_associationClassDefinition1103); if (state.failed) return n;
					// USE.g:312:7: (sm= stateMachine )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==101) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// USE.g:313:9: sm= stateMachine
							{
							pushFollow(FOLLOW_stateMachine_in_associationClassDefinition1123);
							sm=stateMachine();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addStateMachine(sm); }
							}
							break;

						default :
							break loop29;
						}
					}

					}
					break;

			}

			// USE.g:317:5: ( ( keyAggregation | keyComposition ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==IDENT) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// USE.g:317:7: ( keyAggregation | keyComposition )
					{
					if ( state.backtracking==0 ) { t = input.LT(1); }
					// USE.g:318:7: ( keyAggregation | keyComposition )
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==IDENT) ) {
						int LA31_1 = input.LA(2);
						if ( ((input.LT(1).getText().equals("aggregation"))) ) {
							alt31=1;
						}
						else if ( ((input.LT(1).getText().equals("composition"))) ) {
							alt31=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 31, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// USE.g:318:9: keyAggregation
							{
							pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition1164);
							keyAggregation();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// USE.g:318:26: keyComposition
							{
							pushFollow(FOLLOW_keyComposition_in_associationClassDefinition1168);
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

			match(input,70,FOLLOW_70_in_associationClassDefinition1191); if (state.failed) return n;
			}

		}
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
	// USE.g:328:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
	public final ASTAttribute attributeDefinition() throws RecognitionException {
		ASTAttribute n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ASTType t =null;
		ParserRuleReturnScope deriveExpression =null;
		ParserRuleReturnScope initExpression =null;

		try {
			// USE.g:329:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
			// USE.g:330:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_attributeDefinition1219);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition1227); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_attributeDefinition1229); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_attributeDefinition1233);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			// USE.g:333:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
			int alt34=3;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==IDENT) ) {
				int LA34_1 = input.LA(2);
				if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
					alt34=1;
				}
				else if ( ((input.LT(1).getText().equals("init"))) ) {
					alt34=2;
				}
			}
			switch (alt34) {
				case 1 :
					// USE.g:334:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
					{
					// USE.g:334:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
					// USE.g:334:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
					{
					// USE.g:334:10: ( keyDerive | keyDerived )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==IDENT) ) {
						int LA33_1 = input.LA(2);
						if ( ((input.LT(1).getText().equals("derive"))) ) {
							alt33=1;
						}
						else if ( ((input.LT(1).getText().equals("derived"))) ) {
							alt33=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 33, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// USE.g:334:11: keyDerive
							{
							pushFollow(FOLLOW_keyDerive_in_attributeDefinition1257);
							keyDerive();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// USE.g:334:21: keyDerived
							{
							pushFollow(FOLLOW_keyDerived_in_attributeDefinition1259);
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
					pushFollow(FOLLOW_expression_in_attributeDefinition1272);
					deriveExpression=expression();
					state._fsp--;
					if (state.failed) return n;
					}

					}
					break;
				case 2 :
					// USE.g:336:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
					{
					// USE.g:336:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
					// USE.g:336:10: keyInit ( COLON | EQUAL ) initExpression= expression
					{
					pushFollow(FOLLOW_keyInit_in_attributeDefinition1292);
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
					pushFollow(FOLLOW_expression_in_attributeDefinition1308);
					initExpression=expression();
					state._fsp--;
					if (state.failed) return n;
					}

					}
					break;

			}

			// USE.g:338:5: ( SEMI )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==SEMI) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// USE.g:338:5: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition1322); if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) { 
			       n = new ASTAttribute(name, t); 
			       n.setAnnotations(as);
			       n.setDeriveExpression((deriveExpression!=null?((USEParser.expression_return)deriveExpression).n:null));
			       n.setInitExpression((initExpression!=null?((USEParser.expression_return)initExpression).n:null));
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
	// USE.g:352:1: operationDefinition[ASTClassifier c] returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
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
			// USE.g:354:2: (as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
			// USE.g:355:2: as= annotationSet name= IDENT pl= paramList spl= superParamList[pl] ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_operationDefinition1359);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition1369); if (state.failed) return n;
			pushFollow(FOLLOW_paramList_in_operationDefinition1379);
			pl=paramList();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_superParamList_in_operationDefinition1389);
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
			// USE.g:378:5: ( COLON t= type )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==COLON) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// USE.g:378:7: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_operationDefinition1410); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_operationDefinition1416);
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
			// USE.g:384:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQUAL) ) {
				alt37=1;
			}
			else if ( (LA37_0==58) ) {
				alt37=2;
			}
			switch (alt37) {
				case 1 :
					// USE.g:385:9: ( EQUAL e= expression )
					{
					// USE.g:385:9: ( EQUAL e= expression )
					// USE.g:385:11: EQUAL e= expression
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition1444); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_operationDefinition1450);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setExpression((e!=null?((USEParser.expression_return)e).n:null)); }
					}

					}
					break;
				case 2 :
					// USE.g:386:9: (s= blockStat )
					{
					// USE.g:386:9: (s= blockStat )
					// USE.g:386:11: s= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_operationDefinition1472);
					s=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setStatement((s!=null?((USEParser.blockStat_return)s).n:null));  }
					}

					}
					break;

			}

			// USE.g:388:5: (ppc= prePostClause )*
			loop38:
			while (true) {
				int alt38=2;
				alt38 = dfa38.predict(input);
				switch (alt38) {
				case 1 :
					// USE.g:388:7: ppc= prePostClause
					{
					pushFollow(FOLLOW_prePostClause_in_operationDefinition1494);
					ppc=prePostClause();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }
					}
					break;

				default :
					break loop38;
				}
			}

			// USE.g:389:5: ( SEMI )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==SEMI) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// USE.g:389:7: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_operationDefinition1507); if (state.failed) return n;
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
	// USE.g:396:1: superParamList[List<ASTVariableDeclaration> paramList] returns [List<String> superParamList] : ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )? ;
	public final List<String> superParamList(List<ASTVariableDeclaration> paramList) throws RecognitionException {
		List<String> superParamList = null;


		Token i=null;

		 superParamList = new ArrayList<String>(); 
		try {
			// USE.g:398:3: ( ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )? )
			// USE.g:399:3: ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )?
			{
			// USE.g:399:3: ( LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==LPAREN) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// USE.g:400:5: LPAREN (i= IDENT ( COMMA i= IDENT )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_superParamList1542); if (state.failed) return superParamList;
					// USE.g:401:5: (i= IDENT ( COMMA i= IDENT )* )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==IDENT) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// USE.g:402:7: i= IDENT ( COMMA i= IDENT )*
							{
							i=(Token)match(input,IDENT,FOLLOW_IDENT_in_superParamList1560); if (state.failed) return superParamList;
							if ( state.backtracking==0 ) { superParamList.add((i!=null?i.getText():null)); }
							// USE.g:403:7: ( COMMA i= IDENT )*
							loop40:
							while (true) {
								int alt40=2;
								int LA40_0 = input.LA(1);
								if ( (LA40_0==COMMA) ) {
									alt40=1;
								}

								switch (alt40) {
								case 1 :
									// USE.g:403:8: COMMA i= IDENT
									{
									match(input,COMMA,FOLLOW_COMMA_in_superParamList1571); if (state.failed) return superParamList;
									i=(Token)match(input,IDENT,FOLLOW_IDENT_in_superParamList1577); if (state.failed) return superParamList;
									if ( state.backtracking==0 ) { superParamList.add((i!=null?i.getText():null)); }
									}
									break;

								default :
									break loop40;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_superParamList1594); if (state.failed) return superParamList;
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
	// USE.g:416:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
	public final ASTAssociation associationDefinition() throws RecognitionException {
		ASTAssociation n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ASTAssociationEnd ae =null;

		 Token t = null; 
		try {
			// USE.g:418:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
			// USE.g:419:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
			{
			pushFollow(FOLLOW_annotationSet_in_associationDefinition1625);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { t = input.LT(1); }
			// USE.g:421:5: ( keyAssociation | keyAggregation | keyComposition )
			int alt43=3;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==IDENT) ) {
				int LA43_1 = input.LA(2);
				if ( ((input.LT(1).getText().equals("association"))) ) {
					alt43=1;
				}
				else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
					alt43=2;
				}
				else if ( ((input.LT(1).getText().equals("composition"))) ) {
					alt43=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// USE.g:421:7: keyAssociation
					{
					pushFollow(FOLLOW_keyAssociation_in_associationDefinition1639);
					keyAssociation();
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 2 :
					// USE.g:421:24: keyAggregation
					{
					pushFollow(FOLLOW_keyAggregation_in_associationDefinition1643);
					keyAggregation();
					state._fsp--;
					if (state.failed) return n;
					}
					break;
				case 3 :
					// USE.g:421:41: keyComposition
					{
					pushFollow(FOLLOW_keyComposition_in_associationDefinition1647);
					keyComposition();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition1657); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }
			match(input,59,FOLLOW_59_in_associationDefinition1665); if (state.failed) return n;
			pushFollow(FOLLOW_associationEnd_in_associationDefinition1673);
			ae=associationEnd();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.addEnd(ae); }
			// USE.g:425:5: (ae= associationEnd )+
			int cnt44=0;
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==AT||LA44_0==IDENT||LA44_0==52||(LA44_0 >= 55 && LA44_0 <= 56)||LA44_0==72||LA44_0==82||LA44_0==85||(LA44_0 >= 99 && LA44_0 <= 100)) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// USE.g:425:7: ae= associationEnd
					{
					pushFollow(FOLLOW_associationEnd_in_associationDefinition1685);
					ae=associationEnd();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addEnd(ae); }
					}
					break;

				default :
					if ( cnt44 >= 1 ) break loop44;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(44, input);
					throw eee;
				}
				cnt44++;
			}

			match(input,70,FOLLOW_70_in_associationDefinition1696); if (state.failed) return n;
			}

		}
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
	// USE.g:434:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
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
			// USE.g:435:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
			// USE.g:436:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
			{
			pushFollow(FOLLOW_annotationSet_in_associationEnd1721);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1729); if (state.failed) return n;
			match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd1731); if (state.failed) return n;
			pushFollow(FOLLOW_multiplicity_in_associationEnd1735);
			m=multiplicity();
			state._fsp--;
			if (state.failed) return n;
			match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd1737); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }
			// USE.g:438:5: ( keyRole rn= IDENT )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==IDENT) ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1==IDENT) ) {
					int LA45_3 = input.LA(3);
					if ( ((input.LT(1).getText().equals("role"))) ) {
						alt45=1;
					}
				}
			}
			switch (alt45) {
				case 1 :
					// USE.g:438:7: keyRole rn= IDENT
					{
					pushFollow(FOLLOW_keyRole_in_associationEnd1748);
					keyRole();
					state._fsp--;
					if (state.failed) return n;
					rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1752); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setRolename(rn); }
					}
					break;

			}

			// USE.g:439:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
			loop48:
			while (true) {
				int alt48=7;
				switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA48_3 = input.LA(2);
					if ( ((input.LT(1).getText().equals("union"))) ) {
						alt48=3;
					}
					else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
						alt48=5;
					}
					else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
						alt48=6;
					}

					}
					break;
				case 98:
					{
					alt48=1;
					}
					break;
				case 107:
					{
					alt48=2;
					}
					break;
				case 102:
					{
					alt48=4;
					}
					break;
				}
				switch (alt48) {
				case 1 :
					// USE.g:440:9: 'ordered'
					{
					match(input,98,FOLLOW_98_in_associationEnd1773); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setOrdered(); }
					}
					break;
				case 2 :
					// USE.g:441:9: 'subsets' sr= IDENT
					{
					match(input,107,FOLLOW_107_in_associationEnd1785); if (state.failed) return n;
					sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1789); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }
					}
					break;
				case 3 :
					// USE.g:442:9: keyUnion
					{
					pushFollow(FOLLOW_keyUnion_in_associationEnd1801);
					keyUnion();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setUnion(true); }
					}
					break;
				case 4 :
					// USE.g:443:9: 'redefines' rd= IDENT
					{
					match(input,102,FOLLOW_102_in_associationEnd1813); if (state.failed) return n;
					rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1817); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }
					}
					break;
				case 5 :
					// USE.g:444:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
					{
					// USE.g:444:9: ( keyDerived | keyDerive )
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==IDENT) ) {
						int LA46_1 = input.LA(2);
						if ( ((input.LT(1).getText().equals("derived"))) ) {
							alt46=1;
						}
						else if ( ((input.LT(1).getText().equals("derive"))) ) {
							alt46=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 46, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						throw nvae;
					}

					switch (alt46) {
						case 1 :
							// USE.g:444:10: keyDerived
							{
							pushFollow(FOLLOW_keyDerived_in_associationEnd1830);
							keyDerived();
							state._fsp--;
							if (state.failed) return n;
							}
							break;
						case 2 :
							// USE.g:444:21: keyDerive
							{
							pushFollow(FOLLOW_keyDerive_in_associationEnd1832);
							keyDerive();
							state._fsp--;
							if (state.failed) return n;
							}
							break;

					}

					// USE.g:444:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==LPAREN) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// USE.g:444:34: LPAREN parameter= elemVarsDeclaration RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd1837); if (state.failed) return n;
							pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd1843);
							parameter=elemVarsDeclaration();
							state._fsp--;
							if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd1845); if (state.failed) return n;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd1849); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_associationEnd1853);
					exp=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setDerived((exp!=null?((USEParser.expression_return)exp).n:null), parameter); }
					}
					break;
				case 6 :
					// USE.g:445:9: keyQualifier qualifiers= paramList
					{
					pushFollow(FOLLOW_keyQualifier_in_associationEnd1865);
					keyQualifier();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_paramList_in_associationEnd1871);
					qualifiers=paramList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }
					}
					break;

				default :
					break loop48;
				}
			}

			// USE.g:447:5: ( SEMI )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==SEMI) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// USE.g:447:7: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_associationEnd1888); if (state.failed) return n;
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
	// USE.g:461:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
	public final ASTMultiplicity multiplicity() throws RecognitionException {
		ASTMultiplicity n = null;


		ASTMultiplicityRange mr =null;

		try {
			// USE.g:462:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
			// USE.g:463:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
			{
			if ( state.backtracking==0 ) { 
				Token t = input.LT(1); // remember start position of expression
				n = new ASTMultiplicity(t);
			    }
			pushFollow(FOLLOW_multiplicityRange_in_multiplicity1923);
			mr=multiplicityRange();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.addRange(mr); }
			// USE.g:468:5: ( COMMA mr= multiplicityRange )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==COMMA) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// USE.g:468:7: COMMA mr= multiplicityRange
					{
					match(input,COMMA,FOLLOW_COMMA_in_multiplicity1933); if (state.failed) return n;
					pushFollow(FOLLOW_multiplicityRange_in_multiplicity1937);
					mr=multiplicityRange();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addRange(mr); }
					}
					break;

				default :
					break loop50;
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
	// USE.g:471:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
	public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
		ASTMultiplicityRange n = null;


		int ms1 =0;
		int ms2 =0;

		try {
			// USE.g:472:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
			// USE.g:473:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
			{
			pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1966);
			ms1=multiplicitySpec();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }
			// USE.g:474:5: ( DOTDOT ms2= multiplicitySpec )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==DOTDOT) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// USE.g:474:7: DOTDOT ms2= multiplicitySpec
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange1976); if (state.failed) return n;
					pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1980);
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
	// USE.g:477:1: multiplicitySpec returns [int m] : (i= INT | STAR );
	public final int multiplicitySpec() throws RecognitionException {
		int m = 0;


		Token i=null;

		 m = -1; 
		try {
			// USE.g:479:7: (i= INT | STAR )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==INT) ) {
				alt52=1;
			}
			else if ( (LA52_0==STAR) ) {
				alt52=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return m;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// USE.g:480:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec2014); if (state.failed) return m;
					if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }
					}
					break;
				case 2 :
					// USE.g:481:7: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_multiplicitySpec2024); if (state.failed) return m;
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
	// USE.g:502:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
	public final ASTConstraintDefinition invariant() throws RecognitionException {
		ASTConstraintDefinition n = null;


		Token v=null;
		ASTSimpleType t =null;
		ASTInvariantClause inv =null;

		try {
			// USE.g:503:5: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
			// USE.g:504:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
			{
			if ( state.backtracking==0 ) { n = new ASTConstraintDefinition(); }
			match(input,62,FOLLOW_62_in_invariant2065); if (state.failed) return n;
			// USE.g:506:5: (v= IDENT ( ',' v= IDENT )* COLON )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==IDENT) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==COLON||LA54_1==COMMA) ) {
					alt54=1;
				}
			}
			switch (alt54) {
				case 1 :
					// USE.g:506:7: v= IDENT ( ',' v= IDENT )* COLON
					{
					v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2075); if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addVarName(v); }
					// USE.g:507:8: ( ',' v= IDENT )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==COMMA) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// USE.g:507:9: ',' v= IDENT
							{
							match(input,COMMA,FOLLOW_COMMA_in_invariant2088); if (state.failed) return n;
							v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2092); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addVarName(v); }
							}
							break;

						default :
							break loop53;
						}
					}

					match(input,COLON,FOLLOW_COLON_in_invariant2100); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_simpleType_in_invariant2112);
			t=simpleType();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setType(t); }
			// USE.g:509:5: (inv= invariantClause )*
			loop55:
			while (true) {
				int alt55=2;
				alt55 = dfa55.predict(input);
				switch (alt55) {
				case 1 :
					// USE.g:509:7: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_invariant2124);
					inv=invariantClause();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
					}
					break;

				default :
					break loop55;
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
	// USE.g:516:1: invariantClause returns [ASTInvariantClause n] : (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
	public final ASTInvariantClause invariantClause() throws RecognitionException {
		ASTInvariantClause n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ParserRuleReturnScope e =null;

		try {
			// USE.g:517:2: (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==AT||LA58_0==IDENT||LA58_0==52||(LA58_0 >= 55 && LA58_0 <= 56)||LA58_0==72||LA58_0==82||LA58_0==85||(LA58_0 >= 99 && LA58_0 <= 100)) ) {
				alt58=1;
			}
			else if ( (LA58_0==73) ) {
				alt58=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// USE.g:518:2: as= annotationSet 'inv' (name= IDENT )? COLON e= expression
					{
					pushFollow(FOLLOW_annotationSet_in_invariantClause2154);
					as=annotationSet();
					state._fsp--;
					if (state.failed) return n;
					match(input,82,FOLLOW_82_in_invariantClause2162); if (state.failed) return n;
					// USE.g:519:13: (name= IDENT )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==IDENT) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// USE.g:519:15: name= IDENT
							{
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2168); if (state.failed) return n;
							}
							break;

					}

					match(input,COLON,FOLLOW_COLON_in_invariantClause2173); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_invariantClause2177);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?((USEParser.expression_return)e).n:null)); n.setAnnotations(as); }
					}
					break;
				case 2 :
					// USE.g:521:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
					{
					match(input,73,FOLLOW_73_in_invariantClause2194); if (state.failed) return n;
					match(input,82,FOLLOW_82_in_invariantClause2196); if (state.failed) return n;
					// USE.g:521:27: (name= IDENT )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==IDENT) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// USE.g:521:29: name= IDENT
							{
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2202); if (state.failed) return n;
							}
							break;

					}

					match(input,COLON,FOLLOW_COLON_in_invariantClause2207); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_invariantClause2211);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTExistentialInvariantClause(name, (e!=null?((USEParser.expression_return)e).n:null)); n.setAnnotations(as); }
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
	// USE.g:533:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
	public final ASTPrePost prePost() throws RecognitionException {
		ASTPrePost n = null;


		Token classname=null;
		Token opname=null;
		List<ASTVariableDeclaration> pl =null;
		ASTType rt =null;
		ASTPrePostClause ppc =null;

		try {
			// USE.g:534:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
			// USE.g:535:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
			{
			match(input,62,FOLLOW_62_in_prePost2244); if (state.failed) return n;
			classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2248); if (state.failed) return n;
			match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost2250); if (state.failed) return n;
			opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2254); if (state.failed) return n;
			pushFollow(FOLLOW_paramList_in_prePost2258);
			pl=paramList();
			state._fsp--;
			if (state.failed) return n;
			// USE.g:535:69: ( COLON rt= type )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==COLON) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// USE.g:535:71: COLON rt= type
					{
					match(input,COLON,FOLLOW_COLON_in_prePost2262); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_prePost2266);
					rt=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }
			// USE.g:537:5: (ppc= prePostClause )+
			int cnt60=0;
			loop60:
			while (true) {
				int alt60=2;
				alt60 = dfa60.predict(input);
				switch (alt60) {
				case 1 :
					// USE.g:537:7: ppc= prePostClause
					{
					pushFollow(FOLLOW_prePostClause_in_prePost2285);
					ppc=prePostClause();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }
					}
					break;

				default :
					if ( cnt60 >= 1 ) break loop60;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(60, input);
					throw eee;
				}
				cnt60++;
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
	// USE.g:544:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
	public final ASTPrePostClause prePostClause() throws RecognitionException {
		ASTPrePostClause n = null;


		Token name=null;
		Set<ASTAnnotation> as =null;
		ParserRuleReturnScope e =null;

		 Token t = null; 
		try {
			// USE.g:546:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
			// USE.g:547:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
			{
			pushFollow(FOLLOW_annotationSet_in_prePostClause2319);
			as=annotationSet();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { t = input.LT(1); }
			if ( (input.LA(1) >= 99 && input.LA(1) <= 100) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// USE.g:549:25: (name= IDENT )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==IDENT) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// USE.g:549:27: name= IDENT
					{
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause2346); if (state.failed) return n;
					}
					break;

			}

			match(input,COLON,FOLLOW_COLON_in_prePostClause2351); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_prePostClause2355);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTPrePostClause(t, name, (e!=null?((USEParser.expression_return)e).n:null)); n.setAnnotations(as); }
			}

		}
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
	// USE.g:553:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
	public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
		Set<ASTAnnotation> annotations = null;


		ASTAnnotation an =null;

		 annotations = new HashSet<ASTAnnotation>(); 
		try {
			// USE.g:555:2: ( (an= annotation )* )
			// USE.g:556:2: (an= annotation )*
			{
			// USE.g:556:2: (an= annotation )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==AT) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// USE.g:556:3: an= annotation
					{
					pushFollow(FOLLOW_annotation_in_annotationSet2382);
					an=annotation();
					state._fsp--;
					if (state.failed) return annotations;
					if ( state.backtracking==0 ) { annotations.add(an); }
					}
					break;

				default :
					break loop62;
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
	// USE.g:559:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
	public final ASTAnnotation annotation() throws RecognitionException {
		ASTAnnotation n = null;


		Token name=null;
		Map<Token, Token> values =null;

		try {
			// USE.g:559:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
			// USE.g:560:2: AT name= IDENT LPAREN values= annotationValues RPAREN
			{
			match(input,AT,FOLLOW_AT_in_annotation2401); if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation2405); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}
			match(input,LPAREN,FOLLOW_LPAREN_in_annotation2410); if (state.failed) return n;
			pushFollow(FOLLOW_annotationValues_in_annotation2418);
			values=annotationValues();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setValues(values); }
			match(input,RPAREN,FOLLOW_RPAREN_in_annotation2423); if (state.failed) return n;
			}

		}
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
	// USE.g:566:1: annotationValues returns [Map<Token, Token> annoValues] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
	public final Map<Token, Token> annotationValues() throws RecognitionException {
		Map<Token, Token> annoValues = null;


		ParserRuleReturnScope firstVal =null;
		ParserRuleReturnScope val =null;

		 annoValues = new HashMap<Token, Token>(); 
		try {
			// USE.g:568:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
			// USE.g:569:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
			{
			// USE.g:569:2: (firstVal= annotationValue )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==IDENT) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// USE.g:569:3: firstVal= annotationValue
					{
					pushFollow(FOLLOW_annotationValue_in_annotationValues2446);
					firstVal=annotationValue();
					state._fsp--;
					if (state.failed) return annoValues;
					if ( state.backtracking==0 ) { annoValues.put((firstVal!=null?((USEParser.annotationValue_return)firstVal).name:null), (firstVal!=null?((USEParser.annotationValue_return)firstVal).value:null)); }
					}
					break;

			}

			// USE.g:570:2: ( COMMA val= annotationValue )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==COMMA) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// USE.g:570:3: COMMA val= annotationValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_annotationValues2454); if (state.failed) return annoValues;
					pushFollow(FOLLOW_annotationValue_in_annotationValues2458);
					val=annotationValue();
					state._fsp--;
					if (state.failed) return annoValues;
					if ( state.backtracking==0 ) { annoValues.put((val!=null?((USEParser.annotationValue_return)val).name:null), (val!=null?((USEParser.annotationValue_return)val).value:null)); }
					}
					break;

				default :
					break loop64;
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
	// USE.g:573:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
	public final USEParser.annotationValue_return annotationValue() throws RecognitionException {
		USEParser.annotationValue_return retval = new USEParser.annotationValue_return();
		retval.start = input.LT(1);

		Token aName=null;
		Token aValue=null;

		try {
			// USE.g:573:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
			// USE.g:574:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
			{
			aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue2477); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.name = aName; }
			match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue2482); if (state.failed) return retval;
			aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue2488); if (state.failed) return retval;
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
	// USE.g:579:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
	public final ASTStateMachine stateMachine() throws RecognitionException {
		ASTStateMachine n = null;


		Token smName=null;
		ASTStateDefinition s =null;
		ASTTransitionDefinition t =null;

		try {
			// USE.g:580:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
			// USE.g:581:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
			{
			// USE.g:581:5: ( 'psm' )
			// USE.g:582:8: 'psm'
			{
			match(input,101,FOLLOW_101_in_stateMachine2518); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }
			}

			smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine2551); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setName(smName); }
			match(input,106,FOLLOW_106_in_stateMachine2564); if (state.failed) return n;
			// USE.g:589:10: (s= stateDefinition )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==IDENT) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// USE.g:589:11: s= stateDefinition
					{
					pushFollow(FOLLOW_stateDefinition_in_stateMachine2580);
					s=stateDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addStateDefinition(s); }
					}
					break;

				default :
					if ( cnt65 >= 1 ) break loop65;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(65, input);
					throw eee;
				}
				cnt65++;
			}

			match(input,109,FOLLOW_109_in_stateMachine2590); if (state.failed) return n;
			// USE.g:591:10: (t= transitionDefinition )+
			int cnt66=0;
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==IDENT) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// USE.g:591:11: t= transitionDefinition
					{
					pushFollow(FOLLOW_transitionDefinition_in_stateMachine2606);
					t=transitionDefinition();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }
					}
					break;

				default :
					if ( cnt66 >= 1 ) break loop66;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(66, input);
					throw eee;
				}
				cnt66++;
			}

			match(input,70,FOLLOW_70_in_stateMachine2616); if (state.failed) return n;
			}

		}
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
	// USE.g:595:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
	public final ASTStateDefinition stateDefinition() throws RecognitionException {
		ASTStateDefinition n = null;


		Token sn=null;
		Token stateType=null;
		ParserRuleReturnScope stateInv =null;

		try {
			// USE.g:595:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
			// USE.g:596:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
			{
			sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2632); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }
			// USE.g:597:3: ( COLON stateType= IDENT )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==COLON) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// USE.g:597:5: COLON stateType= IDENT
					{
					match(input,COLON,FOLLOW_COLON_in_stateDefinition2640); if (state.failed) return n;
					stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2644); if (state.failed) return n;
					if ( state.backtracking==0 ) {n.setType(stateType); }
					}
					break;

			}

			// USE.g:598:3: ( LBRACK stateInv= expression RBRACK )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==LBRACK) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// USE.g:598:5: LBRACK stateInv= expression RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition2655); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_stateDefinition2661);
					stateInv=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition2663); if (state.failed) return n;
					if ( state.backtracking==0 ) {n.setStateInvariant((stateInv!=null?((USEParser.expression_return)stateInv).n:null)); }
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
	// USE.g:601:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
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
			// USE.g:601:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
			// USE.g:602:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
			{
			source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2684); if (state.failed) return n;
			match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition2686); if (state.failed) return n;
			target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2690); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }
			// USE.g:603:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==LBRACE) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// USE.g:603:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition2700); if (state.failed) return n;
					// USE.g:604:7: ( LBRACK pre= expression RBRACK )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==LBRACK) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// USE.g:604:8: LBRACK pre= expression RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2710); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_transitionDefinition2714);
							pre=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?((USEParser.expression_return)pre).n:null)); }
							match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2718); if (state.failed) return n;
							}
							break;

					}

					// USE.g:605:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==63) ) {
						alt71=1;
					}
					else if ( (LA71_0==IDENT) ) {
						alt71=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 71, 0, input);
						throw nvae;
					}

					switch (alt71) {
						case 1 :
							// USE.g:606:11: e= event
							{
							pushFollow(FOLLOW_event_in_transitionDefinition2742);
							e=event();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setEvent(e); }
							}
							break;
						case 2 :
							// USE.g:607:11: o= IDENT LPAREN (args= paramList )? RPAREN
							{
							o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2758); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setOperation(o); }
							match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition2762); if (state.failed) return n;
							// USE.g:607:50: (args= paramList )?
							int alt70=2;
							int LA70_0 = input.LA(1);
							if ( (LA70_0==LPAREN) ) {
								alt70=1;
							}
							switch (alt70) {
								case 1 :
									// USE.g:607:51: args= paramList
									{
									pushFollow(FOLLOW_paramList_in_transitionDefinition2767);
									args=paramList();
									state._fsp--;
									if (state.failed) return n;
									if ( state.backtracking==0 ) { n.setOperationArgs(args); }
									}
									break;

							}

							match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition2774); if (state.failed) return n;
							}
							break;

					}

					// USE.g:609:7: ( LBRACK post= expression RBRACK )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==LBRACK) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// USE.g:609:8: LBRACK post= expression RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2791); if (state.failed) return n;
							pushFollow(FOLLOW_expression_in_transitionDefinition2795);
							post=expression();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setPostCondition((post!=null?((USEParser.expression_return)post).n:null)); }
							match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2799); if (state.failed) return n;
							}
							break;

					}

					match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition2807); if (state.failed) return n;
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
	// USE.g:613:1: event returns [Token t] : tcr= 'create' ;
	public final Token event() throws RecognitionException {
		Token t = null;


		Token tcr=null;

		try {
			// USE.g:613:24: (tcr= 'create' )
			// USE.g:614:5: tcr= 'create'
			{
			tcr=(Token)match(input,63,FOLLOW_63_in_event2829); if (state.failed) return t;
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
	// USE.g:617:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
	public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
		ASTSignal n = null;


		Token name=null;
		List idListRes =null;
		ASTAttribute a =null;
		ASTInvariantClause inv =null;

		try {
			// USE.g:617:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
			// USE.g:618:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
			{
			pushFollow(FOLLOW_keySignal_in_signalDefinition2849);
			keySignal();
			state._fsp--;
			if (state.failed) return n;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition2853); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }
			// USE.g:620:5: ( LESS idListRes= idList )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==LESS) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// USE.g:620:7: LESS idListRes= idList
					{
					match(input,LESS,FOLLOW_LESS_in_signalDefinition2868); if (state.failed) return n;
					pushFollow(FOLLOW_idList_in_signalDefinition2872);
					idListRes=idList();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addGenerals(idListRes); }
					}
					break;

			}

			// USE.g:621:5: ( 'attributes' (a= attributeDefinition )* )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==57) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// USE.g:621:7: 'attributes' (a= attributeDefinition )*
					{
					match(input,57,FOLLOW_57_in_signalDefinition2885); if (state.failed) return n;
					// USE.g:622:7: (a= attributeDefinition )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==AT||LA75_0==IDENT||LA75_0==52||(LA75_0 >= 55 && LA75_0 <= 56)||LA75_0==72||LA75_0==82||LA75_0==85||(LA75_0 >= 99 && LA75_0 <= 100)) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// USE.g:622:9: a= attributeDefinition
							{
							pushFollow(FOLLOW_attributeDefinition_in_signalDefinition2898);
							a=attributeDefinition();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addAttribute(a); }
							}
							break;

						default :
							break loop75;
						}
					}

					}
					break;

			}

			// USE.g:624:5: ( 'constraints' (inv= invariantClause )* )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==61) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// USE.g:624:7: 'constraints' (inv= invariantClause )*
					{
					match(input,61,FOLLOW_61_in_signalDefinition2919); if (state.failed) return n;
					// USE.g:625:7: (inv= invariantClause )*
					loop77:
					while (true) {
						int alt77=2;
						int LA77_0 = input.LA(1);
						if ( (LA77_0==AT||LA77_0==IDENT||LA77_0==52||(LA77_0 >= 55 && LA77_0 <= 56)||(LA77_0 >= 72 && LA77_0 <= 73)||LA77_0==82||LA77_0==85||(LA77_0 >= 99 && LA77_0 <= 100)) ) {
							alt77=1;
						}

						switch (alt77) {
						case 1 :
							// USE.g:626:9: inv= invariantClause
							{
							pushFollow(FOLLOW_invariantClause_in_signalDefinition2939);
							inv=invariantClause();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addInvariantClause(inv); }
							}
							break;

						default :
							break loop77;
						}
					}

					}
					break;

			}

			match(input,70,FOLLOW_70_in_signalDefinition2963); if (state.failed) return n;
			}

		}
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
	// USE.g:632:1: capAnnotation returns [CAPAnnotation ann] : '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')' ;
	public final CAPAnnotation capAnnotation() throws RecognitionException {
		CAPAnnotation ann = null;


		Token name=null;
		Map.Entry<String,Object> arg =null;


		   List<Map.Entry<String,Object>> args = new ArrayList<Map.Entry<String,Object>>();

		try {
			// USE.g:636:4: ( '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')' )
			// USE.g:637:4: '@' name= IDENT '(' (arg= capArg ( ',' arg= capArg )* )? ')'
			{
			match(input,AT,FOLLOW_AT_in_capAnnotation2990); if (state.failed) return ann;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_capAnnotation2994); if (state.failed) return ann;
			match(input,LPAREN,FOLLOW_LPAREN_in_capAnnotation2996); if (state.failed) return ann;
			// USE.g:638:8: (arg= capArg ( ',' arg= capArg )* )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// USE.g:638:9: arg= capArg ( ',' arg= capArg )*
					{
					pushFollow(FOLLOW_capArg_in_capAnnotation3008);
					arg=capArg();
					state._fsp--;
					if (state.failed) return ann;
					if ( state.backtracking==0 ) { args.add(arg); }
					// USE.g:639:9: ( ',' arg= capArg )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==COMMA) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// USE.g:639:10: ',' arg= capArg
							{
							match(input,COMMA,FOLLOW_COMMA_in_capAnnotation3021); if (state.failed) return ann;
							pushFollow(FOLLOW_capArg_in_capAnnotation3025);
							arg=capArg();
							state._fsp--;
							if (state.failed) return ann;
							if ( state.backtracking==0 ) { args.add(arg); }
							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_capAnnotation3037); if (state.failed) return ann;
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
	// USE.g:650:1: capArg returns [Map.Entry<String,Object> entry] : key= IDENT '=' value= capValue ;
	public final Map.Entry<String,Object> capArg() throws RecognitionException {
		Map.Entry<String,Object> entry = null;


		Token key=null;
		Object value =null;

		try {
			// USE.g:651:4: (key= IDENT '=' value= capValue )
			// USE.g:652:4: key= IDENT '=' value= capValue
			{
			key=(Token)match(input,IDENT,FOLLOW_IDENT_in_capArg3061); if (state.failed) return entry;
			match(input,EQUAL,FOLLOW_EQUAL_in_capArg3063); if (state.failed) return entry;
			pushFollow(FOLLOW_capValue_in_capArg3067);
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
	// USE.g:659:1: capValue returns [Object val] : (s1= NON_OCL_STRING |s2= STRING |n= INT |f= FLOAT |t= 'true' |f2= 'false' |q= qualifiedName |e= enumRef |ann= capAnnotation |blk= capBlock );
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
			// USE.g:660:5: (s1= NON_OCL_STRING |s2= STRING |n= INT |f= FLOAT |t= 'true' |f2= 'false' |q= qualifiedName |e= enumRef |ann= capAnnotation |blk= capBlock )
			int alt81=10;
			switch ( input.LA(1) ) {
			case NON_OCL_STRING:
				{
				alt81=1;
				}
				break;
			case STRING:
				{
				alt81=2;
				}
				break;
			case INT:
				{
				alt81=3;
				}
				break;
			case FLOAT:
				{
				alt81=4;
				}
				break;
			case 110:
				{
				alt81=5;
				}
				break;
			case 74:
				{
				alt81=6;
				}
				break;
			case IDENT:
				{
				int LA81_7 = input.LA(2);
				if ( (LA81_7==COLON_COLON) ) {
					alt81=8;
				}
				else if ( ((LA81_7 >= COMMA && LA81_7 <= DOT)||LA81_7==RBRACE||LA81_7==RPAREN) ) {
					alt81=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				alt81=9;
				}
				break;
			case LBRACE:
				{
				alt81=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// USE.g:661:5: s1= NON_OCL_STRING
					{
					s1=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_capValue3092); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					            val = s1.getText().substring(1, s1.getText().length() - 1);
					        }
					}
					break;
				case 2 :
					// USE.g:667:9: s2= STRING
					{
					s2=(Token)match(input,STRING,FOLLOW_STRING_in_capValue3122); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					            val = s2.getText().substring(1, s2.getText().length() - 1);
					        }
					}
					break;
				case 3 :
					// USE.g:671:6: n= INT
					{
					n=(Token)match(input,INT,FOLLOW_INT_in_capValue3141); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Integer.parseInt(n.getText()); }
					}
					break;
				case 4 :
					// USE.g:672:6: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_capValue3160); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Double.parseDouble(f.getText()); }
					}
					break;
				case 5 :
					// USE.g:673:6: t= 'true'
					{
					t=(Token)match(input,110,FOLLOW_110_in_capValue3177); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Boolean.TRUE; }
					}
					break;
				case 6 :
					// USE.g:674:6: f2= 'false'
					{
					f2=(Token)match(input,74,FOLLOW_74_in_capValue3193); if (state.failed) return val;
					if ( state.backtracking==0 ) { val = Boolean.FALSE; }
					}
					break;
				case 7 :
					// USE.g:675:6: q= qualifiedName
					{
					pushFollow(FOLLOW_qualifiedName_in_capValue3207);
					q=qualifiedName();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = q; }
					}
					break;
				case 8 :
					// USE.g:678:6: e= enumRef
					{
					pushFollow(FOLLOW_enumRef_in_capValue3223);
					e=enumRef();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = e; }
					}
					break;
				case 9 :
					// USE.g:681:6: ann= capAnnotation
					{
					pushFollow(FOLLOW_capAnnotation_in_capValue3245);
					ann=capAnnotation();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) { val = ann; }
					}
					break;
				case 10 :
					// USE.g:684:6: blk= capBlock
					{
					pushFollow(FOLLOW_capBlock_in_capValue3261);
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
	// USE.g:690:1: qualifiedName returns [String text] : i1= IDENT ( '.' i2= IDENT )* ;
	public final String qualifiedName() throws RecognitionException {
		String text = null;


		Token i1=null;
		Token i2=null;

		 StringBuilder sb = new StringBuilder(); 
		try {
			// USE.g:693:5: (i1= IDENT ( '.' i2= IDENT )* )
			// USE.g:694:5: i1= IDENT ( '.' i2= IDENT )*
			{
			i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedName3290); if (state.failed) return text;
			if ( state.backtracking==0 ) { sb.append(i1.getText()); }
			// USE.g:695:5: ( '.' i2= IDENT )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==DOT) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// USE.g:695:7: '.' i2= IDENT
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedName3300); if (state.failed) return text;
					i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiedName3304); if (state.failed) return text;
					if ( state.backtracking==0 ) { sb.append('.').append(i2.getText()); }
					}
					break;

				default :
					break loop82;
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
	// USE.g:700:1: enumRef returns [String text] : t= IDENT COLON_COLON c= IDENT ;
	public final String enumRef() throws RecognitionException {
		String text = null;


		Token t=null;
		Token c=null;

		try {
			// USE.g:702:5: (t= IDENT COLON_COLON c= IDENT )
			// USE.g:703:5: t= IDENT COLON_COLON c= IDENT
			{
			t=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumRef3335); if (state.failed) return text;
			match(input,COLON_COLON,FOLLOW_COLON_COLON_in_enumRef3337); if (state.failed) return text;
			c=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumRef3341); if (state.failed) return text;
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
	// USE.g:707:1: capBlock returns [List<Object> list] : '{' (v= capValue ( ',' v= capValue )* )? '}' ;
	public final List<Object> capBlock() throws RecognitionException {
		List<Object> list = null;


		Object v =null;

		 list = new ArrayList<Object>(); 
		try {
			// USE.g:709:5: ( '{' (v= capValue ( ',' v= capValue )* )? '}' )
			// USE.g:710:5: '{' (v= capValue ( ',' v= capValue )* )? '}'
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_capBlock3369); if (state.failed) return list;
			// USE.g:711:7: (v= capValue ( ',' v= capValue )* )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==AT||LA84_0==FLOAT||(LA84_0 >= IDENT && LA84_0 <= LBRACE)||LA84_0==NON_OCL_STRING||LA84_0==STRING||LA84_0==74||LA84_0==110) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// USE.g:712:9: v= capValue ( ',' v= capValue )*
					{
					pushFollow(FOLLOW_capValue_in_capBlock3389);
					v=capValue();
					state._fsp--;
					if (state.failed) return list;
					if ( state.backtracking==0 ) { list.add(v); }
					// USE.g:713:9: ( ',' v= capValue )*
					loop83:
					while (true) {
						int alt83=2;
						int LA83_0 = input.LA(1);
						if ( (LA83_0==COMMA) ) {
							alt83=1;
						}

						switch (alt83) {
						case 1 :
							// USE.g:713:10: ',' v= capValue
							{
							match(input,COMMA,FOLLOW_COMMA_in_capBlock3402); if (state.failed) return list;
							pushFollow(FOLLOW_capValue_in_capBlock3406);
							v=capValue();
							state._fsp--;
							if (state.failed) return list;
							if ( state.backtracking==0 ) { list.add(v); }
							}
							break;

						default :
							break loop83;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_capBlock3425); if (state.failed) return list;
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
	// USE.g:719:1: keyUnion :{...}? IDENT ;
	public final void keyUnion() throws RecognitionException {
		try {
			// USE.g:719:9: ({...}? IDENT )
			// USE.g:720:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("union"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyUnion3438); if (state.failed) return;
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
	// USE.g:722:1: keyAssociation :{...}? IDENT ;
	public final void keyAssociation() throws RecognitionException {
		try {
			// USE.g:722:15: ({...}? IDENT )
			// USE.g:723:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("association"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyAssociation3452); if (state.failed) return;
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
	// USE.g:725:1: keyRole :{...}? IDENT ;
	public final void keyRole() throws RecognitionException {
		try {
			// USE.g:725:8: ({...}? IDENT )
			// USE.g:726:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("role"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyRole3466); if (state.failed) return;
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
	// USE.g:728:1: keyComposition :{...}? IDENT ;
	public final void keyComposition() throws RecognitionException {
		try {
			// USE.g:728:15: ({...}? IDENT )
			// USE.g:729:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("composition"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyComposition3478); if (state.failed) return;
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
	// USE.g:731:1: keyAggregation :{...}? IDENT ;
	public final void keyAggregation() throws RecognitionException {
		try {
			// USE.g:731:15: ({...}? IDENT )
			// USE.g:732:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("aggregation"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyAggregation3490); if (state.failed) return;
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
	// USE.g:734:1: keyDataType :{...}? IDENT ;
	public final void keyDataType() throws RecognitionException {
		try {
			// USE.g:734:12: ({...}? IDENT )
			// USE.g:735:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("dataType"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDataType", "input.LT(1).getText().equals(\"dataType\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDataType3504); if (state.failed) return;
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
	// USE.g:737:1: keyClass :{...}? IDENT ;
	public final void keyClass() throws RecognitionException {
		try {
			// USE.g:737:9: ({...}? IDENT )
			// USE.g:738:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("class"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyClass3516); if (state.failed) return;
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
	// USE.g:740:1: keySignal :{...}? IDENT ;
	public final void keySignal() throws RecognitionException {
		try {
			// USE.g:740:10: ({...}? IDENT )
			// USE.g:741:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("signal"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keySignal3528); if (state.failed) return;
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
	// USE.g:743:1: keyDerived :{...}? IDENT ;
	public final void keyDerived() throws RecognitionException {
		try {
			// USE.g:743:11: ({...}? IDENT )
			// USE.g:744:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("derived"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDerived3542); if (state.failed) return;
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
	// USE.g:746:1: keyDerive :{...}? IDENT ;
	public final void keyDerive() throws RecognitionException {
		try {
			// USE.g:746:10: ({...}? IDENT )
			// USE.g:747:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("derive"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyDerive3556); if (state.failed) return;
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
	// USE.g:749:1: keyInit :{...}? IDENT ;
	public final void keyInit() throws RecognitionException {
		try {
			// USE.g:749:8: ({...}? IDENT )
			// USE.g:750:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("init"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyInit3568); if (state.failed) return;
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
	// USE.g:752:1: keyQualifier :{...}? IDENT ;
	public final void keyQualifier() throws RecognitionException {
		try {
			// USE.g:752:13: ({...}? IDENT )
			// USE.g:753:3: {...}? IDENT
			{
			if ( !((input.LT(1).getText().equals("qualifier"))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
			}
			match(input,IDENT,FOLLOW_IDENT_in_keyQualifier3584); if (state.failed) return;
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
	// USE.g:782:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
	public final ASTExpression expressionOnly() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope nExp =null;

		try {
			// USE.g:783:5: (nExp= expression EOF )
			// USE.g:784:5: nExp= expression EOF
			{
			pushFollow(FOLLOW_expression_in_expressionOnly3612);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_expressionOnly3614); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = (nExp!=null?((USEParser.expression_return)nExp).n:null);}
			}

		}
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
	// USE.g:791:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
	public final USEParser.expression_return expression() throws RecognitionException {
		USEParser.expression_return retval = new USEParser.expression_return();
		retval.start = input.LT(1);

		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e1 =null;
		ASTExpression nCndImplies =null;

		 
		  ASTLetExpression prevLet = null, firstLet = null;
		  ASTExpression e2;
		  Token tok = null;

		try {
			// USE.g:797:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
			// USE.g:798:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }
			// USE.g:799:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==84) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// USE.g:800:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
					{
					match(input,84,FOLLOW_84_in_expression3662); if (state.failed) return retval;
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3673); if (state.failed) return retval;
					// USE.g:801:18: ( COLON t= type )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==COLON) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// USE.g:801:20: COLON t= type
							{
							match(input,COLON,FOLLOW_COLON_in_expression3677); if (state.failed) return retval;
							pushFollow(FOLLOW_type_in_expression3681);
							t=type();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,EQUAL,FOLLOW_EQUAL_in_expression3686); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression3690);
					e1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((USEParser.expression_return)e1).n:null));
					         if ( firstLet == null ) 
					             firstLet = nextLet;
					         if ( prevLet != null ) 
					             prevLet.setInExpr(nextLet);
					         prevLet = nextLet;
					      }
					// USE.g:811:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==COMMA) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// USE.g:812:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_expression3728); if (state.failed) return retval;
							name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3740); if (state.failed) return retval;
							// USE.g:813:20: ( COLON t= type )?
							int alt86=2;
							int LA86_0 = input.LA(1);
							if ( (LA86_0==COLON) ) {
								alt86=1;
							}
							switch (alt86) {
								case 1 :
									// USE.g:813:22: COLON t= type
									{
									match(input,COLON,FOLLOW_COLON_in_expression3744); if (state.failed) return retval;
									pushFollow(FOLLOW_type_in_expression3748);
									t=type();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							match(input,EQUAL,FOLLOW_EQUAL_in_expression3753); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_expression3757);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?((USEParser.expression_return)e1).n:null));
							           if ( firstLet == null ) 
							               firstLet = nextLet;
							           if ( prevLet != null ) 
							               prevLet.setInExpr(nextLet);
							           prevLet = nextLet;
							        }
							}
							break;

						default :
							break loop87;
						}
					}

					match(input,79,FOLLOW_79_in_expression3798); if (state.failed) return retval;
					}
					break;

				default :
					break loop88;
				}
			}

			pushFollow(FOLLOW_conditionalImpliesExpression_in_expression3814);
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
	// USE.g:845:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
	public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
		List<ASTVariableDeclaration> paramList = null;


		ASTVariableDeclaration v =null;

		 paramList = new ArrayList<ASTVariableDeclaration>(); 
		try {
			// USE.g:847:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
			// USE.g:848:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_paramList3847); if (state.failed) return paramList;
			// USE.g:849:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==IDENT) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// USE.g:850:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
					{
					pushFollow(FOLLOW_variableDeclaration_in_paramList3864);
					v=variableDeclaration();
					state._fsp--;
					if (state.failed) return paramList;
					if ( state.backtracking==0 ) { paramList.add(v); }
					// USE.g:851:7: ( COMMA v= variableDeclaration )*
					loop89:
					while (true) {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==COMMA) ) {
							alt89=1;
						}

						switch (alt89) {
						case 1 :
							// USE.g:851:9: COMMA v= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_paramList3876); if (state.failed) return paramList;
							pushFollow(FOLLOW_variableDeclaration_in_paramList3880);
							v=variableDeclaration();
							state._fsp--;
							if (state.failed) return paramList;
							if ( state.backtracking==0 ) { paramList.add(v); }
							}
							break;

						default :
							break loop89;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_paramList3900); if (state.failed) return paramList;
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
	// USE.g:859:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
	public final List idList() throws RecognitionException {
		List idList = null;


		Token id0=null;
		Token idn=null;

		 idList = new ArrayList(); 
		try {
			// USE.g:861:5: (id0= IDENT ( COMMA idn= IDENT )* )
			// USE.g:862:5: id0= IDENT ( COMMA idn= IDENT )*
			{
			id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3929); if (state.failed) return idList;
			if ( state.backtracking==0 ) { idList.add(id0); }
			// USE.g:863:5: ( COMMA idn= IDENT )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==COMMA) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// USE.g:863:7: COMMA idn= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_idList3939); if (state.failed) return idList;
					idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3943); if (state.failed) return idList;
					if ( state.backtracking==0 ) { idList.add(idn); }
					}
					break;

				default :
					break loop91;
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
	// USE.g:871:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
	public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
		ASTVariableDeclaration n = null;


		Token name=null;
		ASTType t =null;

		try {
			// USE.g:872:5: (name= IDENT COLON t= type )
			// USE.g:873:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration3974); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableDeclaration3976); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration3980);
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
	// USE.g:881:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
	public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndOrExp =null;
		ASTExpression n1 =null;

		try {
			// USE.g:882:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
			// USE.g:883:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4016);
			nCndOrExp=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndOrExp;}
			// USE.g:884:5: (op= 'implies' n1= conditionalOrExpression )*
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==78) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// USE.g:884:7: op= 'implies' n1= conditionalOrExpression
					{
					op=(Token)match(input,78,FOLLOW_78_in_conditionalImpliesExpression4029); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4033);
					n1=conditionalOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop92;
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
	// USE.g:893:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
	public final ASTExpression conditionalOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndXorExp =null;
		ASTExpression n1 =null;

		try {
			// USE.g:894:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
			// USE.g:895:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
			{
			pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4078);
			nCndXorExp=conditionalXOrExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndXorExp;}
			// USE.g:896:5: (op= 'or' n1= conditionalXOrExpression )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==97) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// USE.g:896:7: op= 'or' n1= conditionalXOrExpression
					{
					op=(Token)match(input,97,FOLLOW_97_in_conditionalOrExpression4091); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4095);
					n1=conditionalXOrExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop93;
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
	// USE.g:905:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
	public final ASTExpression conditionalXOrExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nCndAndExp =null;
		ASTExpression n1 =null;

		try {
			// USE.g:906:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
			// USE.g:907:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4139);
			nCndAndExp=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nCndAndExp;}
			// USE.g:908:5: (op= 'xor' n1= conditionalAndExpression )*
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==112) ) {
					alt94=1;
				}

				switch (alt94) {
				case 1 :
					// USE.g:908:7: op= 'xor' n1= conditionalAndExpression
					{
					op=(Token)match(input,112,FOLLOW_112_in_conditionalXOrExpression4152); if (state.failed) return n;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4156);
					n1=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop94;
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
	// USE.g:917:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
	public final ASTExpression conditionalAndExpression() throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTExpression nEqExp =null;
		ASTExpression n1 =null;

		try {
			// USE.g:918:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
			// USE.g:919:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression4200);
			nEqExp=equalityExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nEqExp;}
			// USE.g:920:5: (op= 'and' n1= equalityExpression )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==54) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// USE.g:920:7: op= 'and' n1= equalityExpression
					{
					op=(Token)match(input,54,FOLLOW_54_in_conditionalAndExpression4213); if (state.failed) return n;
					pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression4217);
					n1=equalityExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop95;
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
	// USE.g:929:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
	public final ASTExpression equalityExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nRelExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// USE.g:931:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
			// USE.g:932:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression4265);
			nRelExp=relationalExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nRelExp;}
			// USE.g:933:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==EQUAL||LA96_0==NOT_EQUAL) ) {
					alt96=1;
				}

				switch (alt96) {
				case 1 :
					// USE.g:933:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression4294);
					n1=relationalExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop96;
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
	// USE.g:943:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
	public final ASTExpression relationalExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nAddiExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// USE.g:945:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
			// USE.g:946:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression4343);
			nAddiExp=additiveExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nAddiExp;}
			// USE.g:947:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( ((LA97_0 >= GREATER && LA97_0 <= GREATER_EQUAL)||(LA97_0 >= LESS && LA97_0 <= LESS_EQUAL)) ) {
					alt97=1;
				}

				switch (alt97) {
				case 1 :
					// USE.g:947:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression4379);
					n1=additiveExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop97;
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
	// USE.g:957:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
	public final ASTExpression additiveExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nMulExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// USE.g:959:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
			// USE.g:960:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4429);
			nMulExp=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = nMulExp;}
			// USE.g:961:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
			loop98:
			while (true) {
				int alt98=2;
				int LA98_0 = input.LA(1);
				if ( (LA98_0==MINUS||LA98_0==PLUS) ) {
					alt98=1;
				}

				switch (alt98) {
				case 1 :
					// USE.g:961:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4457);
					n1=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop98;
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
	// USE.g:972:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
	public final ASTExpression multiplicativeExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression n1 =null;

		 Token op = null; 
		try {
			// USE.g:974:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
			// USE.g:975:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4507);
			nUnExp=unaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nUnExp;}
			// USE.g:976:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
			loop99:
			while (true) {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==SLASH||LA99_0==STAR||LA99_0==67) ) {
					alt99=1;
				}

				switch (alt99) {
				case 1 :
					// USE.g:976:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==67 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4539);
					n1=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }
					}
					break;

				default :
					break loop99;
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
	// USE.g:988:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
	public final ASTExpression unaryExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nUnExp =null;
		ASTExpression nPosExp =null;

		 Token op = null; 
		try {
			// USE.g:990:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==MINUS||LA100_0==PLUS||LA100_0==87) ) {
				alt100=1;
			}
			else if ( (LA100_0==AT||LA100_0==HASH||(LA100_0 >= IDENT && LA100_0 <= INT)||LA100_0==LPAREN||LA100_0==REAL||(LA100_0 >= STAR && LA100_0 <= STRING)||(LA100_0 >= 45 && LA100_0 <= 51)||LA100_0==74||LA100_0==77||LA100_0==83||(LA100_0 >= 88 && LA100_0 <= 95)||(LA100_0 >= 103 && LA100_0 <= 104)||LA100_0==110) ) {
				alt100=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// USE.g:991:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					{
					// USE.g:991:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
					// USE.g:991:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
					{
					if ( state.backtracking==0 ) { op = input.LT(1); }
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==87 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4625);
					nUnExp=unaryExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }
					}

					}
					break;
				case 2 :
					// USE.g:995:7: nPosExp= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression4645);
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
	// USE.g:1003:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
	public final ASTExpression postfixExpression() throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nPrimExp =null;
		ASTExpression nPc =null;

		 boolean arrow = false; 
		try {
			// USE.g:1005:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
			// USE.g:1006:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			{
			pushFollow(FOLLOW_primaryExpression_in_postfixExpression4678);
			nPrimExp=primaryExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = nPrimExp; }
			// USE.g:1007:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
			loop102:
			while (true) {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==DOT) ) {
					int LA102_2 = input.LA(2);
					if ( (LA102_2==IDENT) ) {
						int LA102_4 = input.LA(3);
						if ( (LA102_4==EOF||(LA102_4 >= ARROW && LA102_4 <= BAR)||(LA102_4 >= COMMA && LA102_4 <= EQUAL)||(LA102_4 >= GREATER && LA102_4 <= GREATER_EQUAL)||LA102_4==IDENT||(LA102_4 >= LBRACE && LA102_4 <= MINUS)||(LA102_4 >= NOT_EQUAL && LA102_4 <= PLUS)||(LA102_4 >= RBRACE && LA102_4 <= RBRACK)||(LA102_4 >= RPAREN && LA102_4 <= SLASH)||LA102_4==STAR||LA102_4==52||(LA102_4 >= 54 && LA102_4 <= 57)||(LA102_4 >= 61 && LA102_4 <= 62)||(LA102_4 >= 67 && LA102_4 <= 73)||(LA102_4 >= 78 && LA102_4 <= 79)||LA102_4==82||(LA102_4 >= 96 && LA102_4 <= 100)||LA102_4==102||LA102_4==105||(LA102_4 >= 107 && LA102_4 <= 108)||LA102_4==112) ) {
							alt102=1;
						}

					}
					else if ( (LA102_2==83||LA102_2==89||(LA102_2 >= 91 && LA102_2 <= 94)||(LA102_2 >= 103 && LA102_2 <= 104)) ) {
						alt102=1;
					}

				}
				else if ( (LA102_0==ARROW) ) {
					alt102=1;
				}

				switch (alt102) {
				case 1 :
					// USE.g:1008:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
					{
					// USE.g:1008:6: ( ARROW | DOT )
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==ARROW) ) {
						alt101=1;
					}
					else if ( (LA101_0==DOT) ) {
						alt101=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						NoViableAltException nvae =
							new NoViableAltException("", 101, 0, input);
						throw nvae;
					}

					switch (alt101) {
						case 1 :
							// USE.g:1008:8: ARROW
							{
							match(input,ARROW,FOLLOW_ARROW_in_postfixExpression4696); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = true; }
							}
							break;
						case 2 :
							// USE.g:1008:34: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_postfixExpression4702); if (state.failed) return n;
							if ( state.backtracking==0 ) { arrow = false; }
							}
							break;

					}

					pushFollow(FOLLOW_propertyCall_in_postfixExpression4713);
					nPc=propertyCall(n, arrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;

				default :
					break loop102;
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
	// USE.g:1024:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
			// USE.g:1025:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
			int alt106=7;
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
			case 74:
			case 88:
			case 90:
			case 95:
			case 110:
				{
				alt106=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case COLON_COLON:
					{
					alt106=1;
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
				case 54:
				case 55:
				case 56:
				case 57:
				case 61:
				case 62:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 78:
				case 79:
				case 82:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 102:
				case 105:
				case 107:
				case 108:
				case 112:
					{
					alt106=3;
					}
					break;
				case DOT:
					{
					switch ( input.LA(3) ) {
					case 53:
						{
						alt106=6;
						}
						break;
					case 60:
						{
						alt106=7;
						}
						break;
					case IDENT:
					case 83:
					case 89:
					case 91:
					case 92:
					case 93:
					case 94:
					case 103:
					case 104:
						{
						alt106=3;
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
								new NoViableAltException("", 106, 7, input);
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
							new NoViableAltException("", 106, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case AT:
				{
				alt106=2;
				}
				break;
			case 83:
			case 89:
			case 91:
			case 92:
			case 93:
			case 94:
			case 103:
			case 104:
				{
				alt106=3;
				}
				break;
			case LPAREN:
				{
				alt106=4;
				}
				break;
			case 77:
				{
				alt106=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// USE.g:1026:7: nLit= literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression4753);
					nLit=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nLit; }
					}
					break;
				case 2 :
					// USE.g:1027:7: nOr= objectReference
					{
					pushFollow(FOLLOW_objectReference_in_primaryExpression4767);
					nOr=objectReference();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nOr; }
					}
					break;
				case 3 :
					// USE.g:1028:7: nPc= propertyCall[null, false]
					{
					pushFollow(FOLLOW_propertyCall_in_primaryExpression4779);
					nPc=propertyCall(null, false);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nPc; }
					}
					break;
				case 4 :
					// USE.g:1029:7: LPAREN nExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4790); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression4794);
					nExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4796); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExp!=null?((USEParser.expression_return)nExp).n:null); }
					}
					break;
				case 5 :
					// USE.g:1030:7: nIfExp= ifExpression
					{
					pushFollow(FOLLOW_ifExpression_in_primaryExpression4808);
					nIfExp=ifExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nIfExp; }
					}
					break;
				case 6 :
					// USE.g:1031:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
					{
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4820); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression4822); if (state.failed) return n;
					match(input,53,FOLLOW_53_in_primaryExpression4824); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }
					// USE.g:1033:9: ( AT 'pre' )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==AT) ) {
						int LA103_1 = input.LA(2);
						if ( (LA103_1==100) ) {
							alt103=1;
						}
					}
					switch (alt103) {
						case 1 :
							// USE.g:1033:11: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression4847); if (state.failed) return n;
							match(input,100,FOLLOW_100_in_primaryExpression4849); if (state.failed) return n;
							if ( state.backtracking==0 ) { n.setIsPre(); }
							}
							break;

					}

					// USE.g:1034:9: ( LPAREN RPAREN )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==LPAREN) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// USE.g:1034:11: LPAREN RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4867); if (state.failed) return n;
							match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4869); if (state.failed) return n;
							}
							break;

					}

					}
					break;
				case 7 :
					// USE.g:1035:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
					{
					id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4882); if (state.failed) return n;
					match(input,DOT,FOLLOW_DOT_in_primaryExpression4884); if (state.failed) return n;
					match(input,60,FOLLOW_60_in_primaryExpression4886); if (state.failed) return n;
					// USE.g:1035:31: ( LPAREN idExp= expression RPAREN )
					// USE.g:1035:33: LPAREN idExp= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4890); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_primaryExpression4894);
					idExp=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4896); if (state.failed) return n;
					}

					if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?((USEParser.expression_return)idExp).n:null)); }
					// USE.g:1037:7: ( AT 'pre' )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==AT) ) {
						int LA105_1 = input.LA(2);
						if ( (LA105_1==100) ) {
							alt105=1;
						}
					}
					switch (alt105) {
						case 1 :
							// USE.g:1037:9: AT 'pre'
							{
							match(input,AT,FOLLOW_AT_in_primaryExpression4916); if (state.failed) return n;
							match(input,100,FOLLOW_100_in_primaryExpression4918); if (state.failed) return n;
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
	// USE.g:1041:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
	public final ASTExpression objectReference() throws RecognitionException {
		ASTExpression n = null;


		Token objectName=null;

		try {
			// USE.g:1042:3: ( AT objectName= IDENT )
			// USE.g:1043:3: AT objectName= IDENT
			{
			match(input,AT,FOLLOW_AT_in_objectReference4944); if (state.failed) return n;
			objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference4952); if (state.failed) return n;
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
	// USE.g:1057:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
	public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTExpression n = null;


		ASTExpression nExpQuery =null;
		ASTExpression nExpIterate =null;
		ParserRuleReturnScope nExpOperation =null;
		ASTTypeArgExpression nExpType =null;
		ASTInStateExpression nExpInState =null;

		try {
			// USE.g:1058:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
			int alt107=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA107_1 = input.LA(2);
				if ( ((( input.LA(2) == LPAREN )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 83:
				{
				alt107=2;
				}
				break;
			case 89:
			case 93:
			case 94:
			case 103:
			case 104:
				{
				alt107=4;
				}
				break;
			case 91:
			case 92:
				{
				alt107=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// USE.g:1062:7: {...}?{...}?nExpQuery= queryExpression[source]
					{
					if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
					}
					if ( !(( input.LA(2) == LPAREN )) ) {
						if (state.backtracking>0) {state.failed=true; return n;}
						throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
					}
					pushFollow(FOLLOW_queryExpression_in_propertyCall5017);
					nExpQuery=queryExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpQuery; }
					}
					break;
				case 2 :
					// USE.g:1065:7: nExpIterate= iterateExpression[source]
					{
					pushFollow(FOLLOW_iterateExpression_in_propertyCall5030);
					nExpIterate=iterateExpression(source);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpIterate; }
					}
					break;
				case 3 :
					// USE.g:1066:7: nExpOperation= operationExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_operationExpression_in_propertyCall5043);
					nExpOperation=operationExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (nExpOperation!=null?((USEParser.operationExpression_return)nExpOperation).n:null); }
					}
					break;
				case 4 :
					// USE.g:1067:7: nExpType= typeExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_typeExpression_in_propertyCall5056);
					nExpType=typeExpression(source, followsArrow);
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nExpType; }
					}
					break;
				case 5 :
					// USE.g:1068:7: nExpInState= inStateExpression[source, followsArrow]
					{
					pushFollow(FOLLOW_inStateExpression_in_propertyCall5069);
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
	// USE.g:1077:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
	public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token op=null;
		ASTElemVarsDeclaration decls =null;
		ParserRuleReturnScope nExp =null;

		ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
		try {
			// USE.g:1078:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
			// USE.g:1079:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
			{
			op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression5104); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression5111); if (state.failed) return n;
			// USE.g:1081:5: (decls= elemVarsDeclaration BAR )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==IDENT) ) {
				int LA108_1 = input.LA(2);
				if ( ((LA108_1 >= BAR && LA108_1 <= COLON)||LA108_1==COMMA) ) {
					alt108=1;
				}
			}
			switch (alt108) {
				case 1 :
					// USE.g:1081:7: decls= elemVarsDeclaration BAR
					{
					pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression5122);
					decls=elemVarsDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {decl = decls;}
					match(input,BAR,FOLLOW_BAR_in_queryExpression5126); if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_queryExpression5137);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression5143); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?((USEParser.expression_return)nExp).n:null)); }
			}

		}
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
	// USE.g:1095:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
	public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ASTElemVarsDeclaration decls =null;
		ASTVariableInitialization init =null;
		ParserRuleReturnScope nExp =null;

		try {
			// USE.g:1095:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
			// USE.g:1096:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
			{
			i=(Token)match(input,83,FOLLOW_83_in_iterateExpression5175); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression5181); if (state.failed) return n;
			pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression5189);
			decls=elemVarsDeclaration();
			state._fsp--;
			if (state.failed) return n;
			match(input,SEMI,FOLLOW_SEMI_in_iterateExpression5191); if (state.failed) return n;
			pushFollow(FOLLOW_variableInitialization_in_iterateExpression5199);
			init=variableInitialization();
			state._fsp--;
			if (state.failed) return n;
			match(input,BAR,FOLLOW_BAR_in_iterateExpression5201); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_iterateExpression5209);
			nExp=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression5215); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?((USEParser.expression_return)nExp).n:null)); }
			}

		}
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
	// USE.g:1117:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
	public final USEParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		USEParser.operationExpression_return retval = new USEParser.operationExpression_return();
		retval.start = input.LT(1);

		Token name=null;
		ParserRuleReturnScope rolename =null;
		ParserRuleReturnScope e =null;

		try {
			// USE.g:1119:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
			// USE.g:1120:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression5259); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }
			// USE.g:1126:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==LBRACK) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// USE.g:1126:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression5281); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operationExpression5294);
					rolename=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((USEParser.expression_return)rolename).n:null)); }
					// USE.g:1128:9: ( COMMA rolename= expression )*
					loop109:
					while (true) {
						int alt109=2;
						int LA109_0 = input.LA(1);
						if ( (LA109_0==COMMA) ) {
							alt109=1;
						}

						switch (alt109) {
						case 1 :
							// USE.g:1128:10: COMMA rolename= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_operationExpression5307); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression5311);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?((USEParser.expression_return)rolename).n:null)); }
							}
							break;

						default :
							break loop109;
						}
					}

					match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression5323); if (state.failed) return retval;
					// USE.g:1131:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==LBRACK) ) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// USE.g:1131:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression5340); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_operationExpression5355);
							rolename=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((USEParser.expression_return)rolename).n:null)); }
							// USE.g:1133:11: ( COMMA rolename= expression )*
							loop110:
							while (true) {
								int alt110=2;
								int LA110_0 = input.LA(1);
								if ( (LA110_0==COMMA) ) {
									alt110=1;
								}

								switch (alt110) {
								case 1 :
									// USE.g:1133:12: COMMA rolename= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression5370); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression5374);
									rolename=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?((USEParser.expression_return)rolename).n:null)); }
									}
									break;

								default :
									break loop110;
								}
							}

							match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression5388); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			// USE.g:1138:5: ( AT 'pre' )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==AT) ) {
				int LA113_1 = input.LA(2);
				if ( (LA113_1==100) ) {
					alt113=1;
				}
			}
			switch (alt113) {
				case 1 :
					// USE.g:1138:7: AT 'pre'
					{
					match(input,AT,FOLLOW_AT_in_operationExpression5413); if (state.failed) return retval;
					match(input,100,FOLLOW_100_in_operationExpression5415); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.setIsPre(); }
					}
					break;

			}

			// USE.g:1140:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==LPAREN) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// USE.g:1141:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression5440); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.hasParentheses(); }
					// USE.g:1142:7: (e= expression ( COMMA e= expression )* )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==AT||LA115_0==HASH||(LA115_0 >= IDENT && LA115_0 <= INT)||(LA115_0 >= LPAREN && LA115_0 <= MINUS)||LA115_0==PLUS||LA115_0==REAL||(LA115_0 >= STAR && LA115_0 <= STRING)||(LA115_0 >= 45 && LA115_0 <= 51)||LA115_0==74||LA115_0==77||(LA115_0 >= 83 && LA115_0 <= 84)||(LA115_0 >= 87 && LA115_0 <= 95)||(LA115_0 >= 103 && LA115_0 <= 104)||LA115_0==110) ) {
						alt115=1;
					}
					switch (alt115) {
						case 1 :
							// USE.g:1143:7: e= expression ( COMMA e= expression )*
							{
							pushFollow(FOLLOW_expression_in_operationExpression5461);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((USEParser.expression_return)e).n:null)); }
							// USE.g:1144:7: ( COMMA e= expression )*
							loop114:
							while (true) {
								int alt114=2;
								int LA114_0 = input.LA(1);
								if ( (LA114_0==COMMA) ) {
									alt114=1;
								}

								switch (alt114) {
								case 1 :
									// USE.g:1144:9: COMMA e= expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_operationExpression5473); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_operationExpression5477);
									e=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) { retval.n.addArg((e!=null?((USEParser.expression_return)e).n:null)); }
									}
									break;

								default :
									break loop114;
								}
							}

							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression5497); if (state.failed) return retval;
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
	// USE.g:1151:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN ;
	public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTInStateExpression n = null;


		Token s=null;

		 Token opToken = null; 
		try {
			// USE.g:1154:4: ( ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN )
			// USE.g:1155:4: ( 'oclIsInState' | 'oclInState' ) LPAREN s= IDENT RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( (input.LA(1) >= 91 && input.LA(1) <= 92) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression5558); if (state.failed) return n;
			s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression5567); if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression5572); if (state.failed) return n;
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
	// USE.g:1168:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
	public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
		ASTTypeArgExpression n = null;


		ASTType t =null;

		 Token opToken = null; 
		try {
			// USE.g:1171:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
			// USE.g:1172:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
			{
			if ( state.backtracking==0 ) { opToken = input.LT(1); }
			if ( input.LA(1)==89||(input.LA(1) >= 93 && input.LA(1) <= 94)||(input.LA(1) >= 103 && input.LA(1) <= 104) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression5632); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_typeExpression5636);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression5638); if (state.failed) return n;
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
	// USE.g:1183:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
	public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
		ASTElemVarsDeclaration n = null;


		Token var1=null;
		Token varN=null;
		ASTType t =null;
		ASTType tN =null;

		try {
			// USE.g:1184:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
			// USE.g:1185:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
			{
			if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }
			var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5676); if (state.failed) return n;
			// USE.g:1186:17: ( COLON t= type )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==COLON) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// USE.g:1186:18: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5679); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_elemVarsDeclaration5683);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}
			// USE.g:1187:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==COMMA) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// USE.g:1187:5: COMMA varN= IDENT ( COLON tN= type )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration5693); if (state.failed) return n;
					varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5699); if (state.failed) return n;
					// USE.g:1187:24: ( COLON tN= type )?
					int alt118=2;
					int LA118_0 = input.LA(1);
					if ( (LA118_0==COLON) ) {
						alt118=1;
					}
					switch (alt118) {
						case 1 :
							// USE.g:1187:25: COLON tN= type
							{
							match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5702); if (state.failed) return n;
							pushFollow(FOLLOW_type_in_elemVarsDeclaration5708);
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
					break loop119;
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
	// USE.g:1195:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
	public final ASTVariableInitialization variableInitialization() throws RecognitionException {
		ASTVariableInitialization n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// USE.g:1196:5: (name= IDENT COLON t= type EQUAL e= expression )
			// USE.g:1197:5: name= IDENT COLON t= type EQUAL e= expression
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization5736); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_variableInitialization5738); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableInitialization5742);
			t=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization5744); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_variableInitialization5748);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?((USEParser.expression_return)e).n:null)); }
			}

		}
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
	// USE.g:1206:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
	public final ASTExpression ifExpression() throws RecognitionException {
		ASTExpression n = null;


		Token i=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;

		try {
			// USE.g:1207:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
			// USE.g:1208:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
			{
			i=(Token)match(input,77,FOLLOW_77_in_ifExpression5780); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression5784);
			cond=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,108,FOLLOW_108_in_ifExpression5786); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression5790);
			t=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,69,FOLLOW_69_in_ifExpression5792); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_ifExpression5796);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input,71,FOLLOW_71_in_ifExpression5798); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?((USEParser.expression_return)cond).n:null), (t!=null?((USEParser.expression_return)t).n:null), (e!=null?((USEParser.expression_return)e).n:null)); }
			}

		}
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
	// USE.g:1227:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
			// USE.g:1228:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
			int alt120=12;
			switch ( input.LA(1) ) {
			case 110:
				{
				alt120=1;
				}
				break;
			case 74:
				{
				alt120=2;
				}
				break;
			case INT:
				{
				alt120=3;
				}
				break;
			case REAL:
				{
				alt120=4;
				}
				break;
			case STRING:
				{
				alt120=5;
				}
				break;
			case HASH:
				{
				alt120=6;
				}
				break;
			case IDENT:
				{
				alt120=7;
				}
				break;
			case 45:
			case 47:
			case 48:
			case 49:
				{
				int LA120_8 = input.LA(2);
				if ( (LA120_8==LPAREN) ) {
					alt120=9;
				}
				else if ( (LA120_8==LBRACE) ) {
					alt120=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 120, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 46:
			case 90:
				{
				alt120=9;
				}
				break;
			case 51:
			case 88:
			case 95:
				{
				alt120=10;
				}
				break;
			case 50:
				{
				alt120=11;
				}
				break;
			case STAR:
				{
				alt120=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}
			switch (alt120) {
				case 1 :
					// USE.g:1229:7: t= 'true'
					{
					t=(Token)match(input,110,FOLLOW_110_in_literal5837); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }
					}
					break;
				case 2 :
					// USE.g:1230:7: f= 'false'
					{
					f=(Token)match(input,74,FOLLOW_74_in_literal5851); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }
					}
					break;
				case 3 :
					// USE.g:1231:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_literal5864); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }
					}
					break;
				case 4 :
					// USE.g:1232:7: r= REAL
					{
					r=(Token)match(input,REAL,FOLLOW_REAL_in_literal5879); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }
					}
					break;
				case 5 :
					// USE.g:1233:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_literal5893); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }
					}
					break;
				case 6 :
					// USE.g:1234:7: HASH enumLit= IDENT
					{
					match(input,HASH,FOLLOW_HASH_in_literal5903); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5907); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}
					}
					break;
				case 7 :
					// USE.g:1235:7: enumName= IDENT '::' enumLit= IDENT
					{
					enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5919); if (state.failed) return n;
					match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal5921); if (state.failed) return n;
					enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5925); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }
					}
					break;
				case 8 :
					// USE.g:1236:7: nColIt= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_literal5937);
					nColIt=collectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nColIt; }
					}
					break;
				case 9 :
					// USE.g:1237:7: nEColIt= emptyCollectionLiteral
					{
					pushFollow(FOLLOW_emptyCollectionLiteral_in_literal5949);
					nEColIt=emptyCollectionLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nEColIt; }
					}
					break;
				case 10 :
					// USE.g:1238:7: nUndLit= undefinedLiteral
					{
					pushFollow(FOLLOW_undefinedLiteral_in_literal5961);
					nUndLit=undefinedLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nUndLit; }
					}
					break;
				case 11 :
					// USE.g:1239:7: nTupleLit= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_literal5973);
					nTupleLit=tupleLiteral();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = nTupleLit; }
					}
					break;
				case 12 :
					// USE.g:1240:7: un= STAR
					{
					un=(Token)match(input,STAR,FOLLOW_STAR_in_literal5985); if (state.failed) return n;
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
	// USE.g:1248:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
	public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
		ASTCollectionLiteral n = null;


		ASTCollectionItem ci =null;

		 Token op = null; 
		try {
			// USE.g:1250:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
			// USE.g:1251:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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
			match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral6052); if (state.failed) return n;
			// USE.g:1255:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==AT||LA122_0==HASH||(LA122_0 >= IDENT && LA122_0 <= INT)||(LA122_0 >= LPAREN && LA122_0 <= MINUS)||LA122_0==PLUS||LA122_0==REAL||(LA122_0 >= STAR && LA122_0 <= STRING)||(LA122_0 >= 45 && LA122_0 <= 51)||LA122_0==74||LA122_0==77||(LA122_0 >= 83 && LA122_0 <= 84)||(LA122_0 >= 87 && LA122_0 <= 95)||(LA122_0 >= 103 && LA122_0 <= 104)||LA122_0==110) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// USE.g:1256:7: ci= collectionItem ( COMMA ci= collectionItem )*
					{
					pushFollow(FOLLOW_collectionItem_in_collectionLiteral6069);
					ci=collectionItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.addItem(ci); }
					// USE.g:1257:7: ( COMMA ci= collectionItem )*
					loop121:
					while (true) {
						int alt121=2;
						int LA121_0 = input.LA(1);
						if ( (LA121_0==COMMA) ) {
							alt121=1;
						}

						switch (alt121) {
						case 1 :
							// USE.g:1257:9: COMMA ci= collectionItem
							{
							match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral6082); if (state.failed) return n;
							pushFollow(FOLLOW_collectionItem_in_collectionLiteral6086);
							ci=collectionItem();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) { n.addItem(ci); }
							}
							break;

						default :
							break loop121;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral6105); if (state.failed) return n;
			}

		}
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
	// USE.g:1266:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
	public final ASTCollectionItem collectionItem() throws RecognitionException {
		ASTCollectionItem n = null;


		ParserRuleReturnScope e =null;

		 n = new ASTCollectionItem(); 
		try {
			// USE.g:1268:5: (e= expression ( DOTDOT e= expression )? )
			// USE.g:1269:5: e= expression ( DOTDOT e= expression )?
			{
			pushFollow(FOLLOW_expression_in_collectionItem6134);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.setFirst((e!=null?((USEParser.expression_return)e).n:null)); }
			// USE.g:1270:5: ( DOTDOT e= expression )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==DOTDOT) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// USE.g:1270:7: DOTDOT e= expression
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem6145); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_collectionItem6149);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.setSecond((e!=null?((USEParser.expression_return)e).n:null)); }
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
	// USE.g:1280:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
	public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
		ASTEmptyCollectionLiteral n = null;


		ASTCollectionType t =null;

		try {
			// USE.g:1281:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==90) ) {
				alt124=1;
			}
			else if ( ((LA124_0 >= 45 && LA124_0 <= 49)) ) {
				alt124=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}

			switch (alt124) {
				case 1 :
					// USE.g:1282:5: 'oclEmpty' LPAREN t= collectionType RPAREN
					{
					match(input,90,FOLLOW_90_in_emptyCollectionLiteral6178); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral6180); if (state.failed) return n;
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral6184);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral6186); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }
					}
					break;
				case 2 :
					// USE.g:1285:5: t= collectionType LBRACE RBRACE
					{
					pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral6202);
					t=collectionType();
					state._fsp--;
					if (state.failed) return n;
					match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral6204); if (state.failed) return n;
					match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral6206); if (state.failed) return n;
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
	// USE.g:1296:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
	public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
		ASTUndefinedLiteral n = null;


		ASTType t =null;

		try {
			// USE.g:1297:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
			int alt125=4;
			switch ( input.LA(1) ) {
			case 95:
				{
				alt125=1;
				}
				break;
			case 51:
				{
				alt125=2;
				}
				break;
			case 88:
				{
				int LA125_3 = input.LA(2);
				if ( (LA125_3==LPAREN) ) {
					alt125=3;
				}
				else if ( (LA125_3==EOF||(LA125_3 >= ARROW && LA125_3 <= BAR)||(LA125_3 >= COMMA && LA125_3 <= EQUAL)||(LA125_3 >= GREATER && LA125_3 <= GREATER_EQUAL)||LA125_3==IDENT||LA125_3==LBRACE||(LA125_3 >= LESS && LA125_3 <= LESS_EQUAL)||LA125_3==MINUS||(LA125_3 >= NOT_EQUAL && LA125_3 <= PLUS)||(LA125_3 >= RBRACE && LA125_3 <= RBRACK)||(LA125_3 >= RPAREN && LA125_3 <= SLASH)||LA125_3==STAR||LA125_3==52||(LA125_3 >= 54 && LA125_3 <= 57)||(LA125_3 >= 61 && LA125_3 <= 62)||(LA125_3 >= 67 && LA125_3 <= 73)||(LA125_3 >= 78 && LA125_3 <= 79)||LA125_3==82||(LA125_3 >= 96 && LA125_3 <= 100)||LA125_3==102||LA125_3==105||(LA125_3 >= 107 && LA125_3 <= 108)||LA125_3==112) ) {
					alt125=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 3, input);
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
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// USE.g:1298:5: 'oclUndefined' LPAREN t= type RPAREN
					{
					match(input,95,FOLLOW_95_in_undefinedLiteral6236); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral6238); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral6242);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral6244); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 2 :
					// USE.g:1301:5: 'Undefined'
					{
					match(input,51,FOLLOW_51_in_undefinedLiteral6258); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }
					}
					break;
				case 3 :
					// USE.g:1304:5: 'null' LPAREN t= type RPAREN
					{
					match(input,88,FOLLOW_88_in_undefinedLiteral6272); if (state.failed) return n;
					match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral6274); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_undefinedLiteral6278);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral6280); if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }
					}
					break;
				case 4 :
					// USE.g:1307:5: 'null'
					{
					match(input,88,FOLLOW_88_in_undefinedLiteral6294); if (state.failed) return n;
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
	// USE.g:1317:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
	public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
		ASTTupleLiteral n = null;


		ASTTupleItem ti =null;

		 List tiList = new ArrayList(); 
		try {
			// USE.g:1319:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
			// USE.g:1320:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
			{
			match(input,50,FOLLOW_50_in_tupleLiteral6333); if (state.failed) return n;
			match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral6339); if (state.failed) return n;
			pushFollow(FOLLOW_tupleItem_in_tupleLiteral6347);
			ti=tupleItem();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tiList.add(ti); }
			// USE.g:1323:5: ( COMMA ti= tupleItem )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==COMMA) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// USE.g:1323:7: COMMA ti= tupleItem
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral6358); if (state.failed) return n;
					pushFollow(FOLLOW_tupleItem_in_tupleLiteral6362);
					ti=tupleItem();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tiList.add(ti); }
					}
					break;

				default :
					break loop126;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral6373); if (state.failed) return n;
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
	// USE.g:1331:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
	public final ASTTupleItem tupleItem() throws RecognitionException {
		ASTTupleItem n = null;


		Token name=null;
		ASTType t =null;
		ParserRuleReturnScope e =null;

		try {
			// USE.g:1332:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
			// USE.g:1333:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem6404); if (state.failed) return n;
			// USE.g:1334:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==COLON) ) {
				int LA127_1 = input.LA(2);
				if ( (synpred1_USE()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

			}
			else if ( (LA127_0==EQUAL) ) {
				alt127=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// USE.g:1337:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
					{
					match(input,COLON,FOLLOW_COLON_in_tupleItem6443); if (state.failed) return n;
					pushFollow(FOLLOW_type_in_tupleItem6447);
					t=type();
					state._fsp--;
					if (state.failed) return n;
					match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem6449); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_tupleItem6453);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?((USEParser.expression_return)e).n:null)); }
					}
					break;
				case 2 :
					// USE.g:1340:7: ( COLON | EQUAL ) e= expression
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
					pushFollow(FOLLOW_expression_in_tupleItem6485);
					e=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?((USEParser.expression_return)e).n:null)); }
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
	// USE.g:1351:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
	public final ASTType type() throws RecognitionException {
		ASTType n = null;


		ASTSimpleType nTSimple =null;
		ASTCollectionType nTCollection =null;
		ASTTupleType nTTuple =null;

		 Token tok = null; 
		try {
			// USE.g:1353:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
			// USE.g:1354:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			{
			if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }
			// USE.g:1355:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
			int alt128=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt128=1;
				}
				break;
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
				{
				alt128=2;
				}
				break;
			case 50:
				{
				alt128=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// USE.g:1356:7: nTSimple= simpleType
					{
					pushFollow(FOLLOW_simpleType_in_type6551);
					nTSimple=simpleType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 2 :
					// USE.g:1357:7: nTCollection= collectionType
					{
					pushFollow(FOLLOW_collectionType_in_type6563);
					nTCollection=collectionType();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }
					}
					break;
				case 3 :
					// USE.g:1358:7: nTTuple= tupleType
					{
					pushFollow(FOLLOW_tupleType_in_type6575);
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
	// USE.g:1363:1: typeOnly returns [ASTType n] : nT= type EOF ;
	public final ASTType typeOnly() throws RecognitionException {
		ASTType n = null;


		ASTType nT =null;

		try {
			// USE.g:1364:5: (nT= type EOF )
			// USE.g:1365:5: nT= type EOF
			{
			pushFollow(FOLLOW_type_in_typeOnly6607);
			nT=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_typeOnly6609); if (state.failed) return n;
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
	// USE.g:1375:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
	public final ASTSimpleType simpleType() throws RecognitionException {
		ASTSimpleType n = null;


		Token name=null;

		try {
			// USE.g:1376:5: (name= IDENT )
			// USE.g:1377:5: name= IDENT
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType6637); if (state.failed) return n;
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
	// USE.g:1385:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
	public final ASTCollectionType collectionType() throws RecognitionException {
		ASTCollectionType n = null;


		ASTType elemType =null;

		 Token op = null; 
		try {
			// USE.g:1387:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
			// USE.g:1388:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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
			match(input,LPAREN,FOLLOW_LPAREN_in_collectionType6702); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_collectionType6706);
			elemType=type();
			state._fsp--;
			if (state.failed) return n;
			match(input,RPAREN,FOLLOW_RPAREN_in_collectionType6708); if (state.failed) return n;
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
	// USE.g:1398:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
	public final ASTTupleType tupleType() throws RecognitionException {
		ASTTupleType n = null;


		ASTTuplePart tp =null;

		 List tpList = new ArrayList(); 
		try {
			// USE.g:1400:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
			// USE.g:1401:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
			{
			match(input,50,FOLLOW_50_in_tupleType6742); if (state.failed) return n;
			match(input,LPAREN,FOLLOW_LPAREN_in_tupleType6744); if (state.failed) return n;
			pushFollow(FOLLOW_tuplePart_in_tupleType6753);
			tp=tuplePart();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { tpList.add(tp); }
			// USE.g:1403:5: ( COMMA tp= tuplePart )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==COMMA) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// USE.g:1403:7: COMMA tp= tuplePart
					{
					match(input,COMMA,FOLLOW_COMMA_in_tupleType6764); if (state.failed) return n;
					pushFollow(FOLLOW_tuplePart_in_tupleType6768);
					tp=tuplePart();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { tpList.add(tp); }
					}
					break;

				default :
					break loop129;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_tupleType6780); if (state.failed) return n;
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
	// USE.g:1412:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
	public final ASTTuplePart tuplePart() throws RecognitionException {
		ASTTuplePart n = null;


		Token name=null;
		ASTType t =null;

		try {
			// USE.g:1413:5: (name= IDENT COLON t= type )
			// USE.g:1414:5: name= IDENT COLON t= type
			{
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart6812); if (state.failed) return n;
			match(input,COLON,FOLLOW_COLON_in_tuplePart6814); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_tuplePart6818);
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
	// USE.g:1453:1: statOnly returns [ASTStatement n] : s= stat EOF ;
	public final ASTStatement statOnly() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s =null;

		try {
			// USE.g:1454:3: (s= stat EOF )
			// USE.g:1455:3: s= stat EOF
			{
			pushFollow(FOLLOW_stat_in_statOnly6867);
			s=stat();
			state._fsp--;
			if (state.failed) return n;
			match(input,EOF,FOLLOW_EOF_in_statOnly6871); if (state.failed) return n;
			if ( state.backtracking==0 ) { n = (s!=null?((USEParser.stat_return)s).n:null); }
			}

		}
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
	// USE.g:1465:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
	public final USEParser.stat_return stat() throws RecognitionException {
		USEParser.stat_return retval = new USEParser.stat_return();
		retval.start = input.LT(1);

		ASTStatement s =null;
		ASTStatement s2 =null;


		  ASTSequenceStatement seq = new ASTSequenceStatement((retval.start));

		try {
			// USE.g:1469:3: (s= singleStat ( SEMI s2= singleStat )* )
			// USE.g:1470:3: s= singleStat ( SEMI s2= singleStat )*
			{
			pushFollow(FOLLOW_singleStat_in_stat6906);
			s=singleStat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {seq.addStatement(s);}
			// USE.g:1471:3: ( SEMI s2= singleStat )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==SEMI) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// USE.g:1472:5: SEMI s2= singleStat
					{
					match(input,SEMI,FOLLOW_SEMI_in_stat6918); if (state.failed) return retval;
					pushFollow(FOLLOW_singleStat_in_stat6928);
					s2=singleStat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {seq.addStatement(s2); }
					}
					break;

				default :
					break loop130;
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
	// USE.g:1484:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
			// USE.g:1485:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
			int alt131=11;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==EOF||LA131_0==SEMI||(LA131_0 >= 69 && LA131_0 <= 70)) ) {
				alt131=1;
			}
			else if ( (LA131_0==84) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==MINUS||LA131_0==PLUS||LA131_0==87) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==110) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==74) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==INT) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==REAL) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==STRING) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==HASH) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==IDENT) ) {
				int LA131_13 = input.LA(2);
				if ( (synpred2_USE()) ) {
					alt131=2;
				}
				else if ( (true) ) {
					alt131=3;
				}

			}
			else if ( (LA131_0==45||(LA131_0 >= 47 && LA131_0 <= 49)) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==90) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==46) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==95) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==51) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==88) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==50) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==STAR) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==AT) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==83) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==89||(LA131_0 >= 93 && LA131_0 <= 94)||(LA131_0 >= 103 && LA131_0 <= 104)) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( ((LA131_0 >= 91 && LA131_0 <= 92)) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==LPAREN) && (synpred2_USE())) {
				alt131=2;
			}
			else if ( (LA131_0==77) ) {
				int LA131_27 = input.LA(2);
				if ( (synpred2_USE()) ) {
					alt131=2;
				}
				else if ( (true) ) {
					alt131=8;
				}

			}
			else if ( (LA131_0==86) ) {
				alt131=4;
			}
			else if ( (LA131_0==66) ) {
				alt131=5;
			}
			else if ( (LA131_0==80) ) {
				alt131=6;
			}
			else if ( (LA131_0==65) ) {
				alt131=7;
			}
			else if ( (LA131_0==75) ) {
				alt131=9;
			}
			else if ( (LA131_0==111) ) {
				alt131=10;
			}
			else if ( (LA131_0==58) ) {
				alt131=11;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// USE.g:1486:5: emp= emptyStat
					{
					pushFollow(FOLLOW_emptyStat_in_singleStat6968);
					emp=emptyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = emp; }
					}
					break;
				case 2 :
					// USE.g:1488:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
					{
					pushFollow(FOLLOW_statStartingWithExpr_in_singleStat6994);
					sse=statStartingWithExpr();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (sse!=null?((USEParser.statStartingWithExpr_return)sse).n:null); }
					}
					break;
				case 3 :
					// USE.g:1489:5: vas= varAssignStat
					{
					pushFollow(FOLLOW_varAssignStat_in_singleStat7006);
					vas=varAssignStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = vas; }
					}
					break;
				case 4 :
					// USE.g:1490:5: ocs= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_singleStat7020);
					ocs=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ocs!=null?((USEParser.objCreateStat_return)ocs).n:null); }
					}
					break;
				case 5 :
					// USE.g:1491:5: ods= objDestroyStat
					{
					pushFollow(FOLLOW_objDestroyStat_in_singleStat7034);
					ods=objDestroyStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ods!=null?((USEParser.objDestroyStat_return)ods).n:null); }
					}
					break;
				case 6 :
					// USE.g:1492:5: lis= lnkInsStat
					{
					pushFollow(FOLLOW_lnkInsStat_in_singleStat7047);
					lis=lnkInsStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lis!=null?((USEParser.lnkInsStat_return)lis).n:null); }
					}
					break;
				case 7 :
					// USE.g:1493:5: lds= lnkDelStat
					{
					pushFollow(FOLLOW_lnkDelStat_in_singleStat7064);
					lds=lnkDelStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (lds!=null?((USEParser.lnkDelStat_return)lds).n:null); }
					}
					break;
				case 8 :
					// USE.g:1494:5: ces= condExStat
					{
					pushFollow(FOLLOW_condExStat_in_singleStat7081);
					ces=condExStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (ces!=null?((USEParser.condExStat_return)ces).n:null); }
					}
					break;
				case 9 :
					// USE.g:1495:5: its= iterStat
					{
					pushFollow(FOLLOW_iterStat_in_singleStat7098);
					its=iterStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (its!=null?((USEParser.iterStat_return)its).n:null); }
					}
					break;
				case 10 :
					// USE.g:1497:5: whs= whileStat
					{
					pushFollow(FOLLOW_whileStat_in_singleStat7120);
					whs=whileStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (whs!=null?((USEParser.whileStat_return)whs).n:null); }
					}
					break;
				case 11 :
					// USE.g:1498:5: blk= blockStat
					{
					pushFollow(FOLLOW_blockStat_in_singleStat7138);
					blk=blockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (blk!=null?((USEParser.blockStat_return)blk).n:null); }
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
	// USE.g:1505:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
	public final ASTEmptyStatement emptyStat() throws RecognitionException {
		ASTEmptyStatement n = null;


		try {
			// USE.g:1506:3: ( nothing )
			// USE.g:1507:3: nothing
			{
			pushFollow(FOLLOW_nothing_in_emptyStat7165);
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
	// USE.g:1512:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
	public final USEParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
		USEParser.statStartingWithExpr_return retval = new USEParser.statStartingWithExpr_return();
		retval.start = input.LT(1);

		ASTExpression expr =null;
		ASTAttributeAssignmentStatement aas =null;

		try {
			// USE.g:1513:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
			// USE.g:1514:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
			{
			pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr7191);
			expr=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			// USE.g:1515:3: (aas= attAssignStat[$expr.n] )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==DOT) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// USE.g:1516:5: aas= attAssignStat[$expr.n]
					{
					pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr7205);
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
	// USE.g:1528:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
	public final ASTStatement varAssignStat() throws RecognitionException {
		ASTStatement n = null;


		Token varName=null;
		ASTRValue rVal =null;

		try {
			// USE.g:1529:3: (varName= IDENT COLON_EQUAL rVal= rValue )
			// USE.g:1530:3: varName= IDENT COLON_EQUAL rVal= rValue
			{
			varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat7243); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat7247); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_varAssignStat7255);
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
	// USE.g:1542:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
	public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
		ASTAttributeAssignmentStatement n = null;


		Token attName=null;
		ASTRValue r =null;

		try {
			// USE.g:1543:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
			// USE.g:1544:3: DOT attName= IDENT COLON_EQUAL r= rValue
			{
			match(input,DOT,FOLLOW_DOT_in_attAssignStat7279); if (state.failed) return n;
			attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat7288); if (state.failed) return n;
			match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat7292); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_attAssignStat7300);
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
	// USE.g:1556:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
	public final USEParser.objCreateStat_return objCreateStat() throws RecognitionException {
		USEParser.objCreateStat_return retval = new USEParser.objCreateStat_return();
		retval.start = input.LT(1);

		ASTSimpleType ident =null;
		ASTExpression objName =null;
		ParserRuleReturnScope p =null;

		try {
			// USE.g:1557:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
			// USE.g:1558:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			{
			match(input,86,FOLLOW_86_in_objCreateStat7326); if (state.failed) return retval;
			pushFollow(FOLLOW_simpleType_in_objCreateStat7334);
			ident=simpleType();
			state._fsp--;
			if (state.failed) return retval;
			// USE.g:1560:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==LPAREN) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// USE.g:1561:5: LPAREN (objName= inSoilExpression )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat7344); if (state.failed) return retval;
					// USE.g:1562:7: (objName= inSoilExpression )?
					int alt133=2;
					int LA133_0 = input.LA(1);
					if ( (LA133_0==AT||LA133_0==HASH||(LA133_0 >= IDENT && LA133_0 <= INT)||(LA133_0 >= LPAREN && LA133_0 <= MINUS)||LA133_0==PLUS||LA133_0==REAL||(LA133_0 >= STAR && LA133_0 <= STRING)||(LA133_0 >= 45 && LA133_0 <= 51)||LA133_0==74||LA133_0==77||(LA133_0 >= 83 && LA133_0 <= 84)||(LA133_0 >= 87 && LA133_0 <= 95)||(LA133_0 >= 103 && LA133_0 <= 104)||LA133_0==110) ) {
						alt133=1;
					}
					switch (alt133) {
						case 1 :
							// USE.g:1562:8: objName= inSoilExpression
							{
							pushFollow(FOLLOW_inSoilExpression_in_objCreateStat7357);
							objName=inSoilExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat7365); if (state.failed) return retval;
					}
					break;

			}

			// USE.g:1566:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==59) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// USE.g:1567:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
					{
					match(input,59,FOLLOW_59_in_objCreateStat7383); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat7391); if (state.failed) return retval;
					pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat7405);
					p=rValListMin2WithOptionalQualifiers();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat7413); if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					    retval.n = new ASTNewLinkObjectStatement((retval.start), ident, (p!=null?((USEParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((USEParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null), objName);
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
	// USE.g:1586:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
	public final USEParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
		USEParser.objDestroyStat_return retval = new USEParser.objDestroyStat_return();
		retval.start = input.LT(1);

		List<ASTExpression> el =null;

		try {
			// USE.g:1587:3: ( 'destroy' el= exprListMin1 )
			// USE.g:1588:3: 'destroy' el= exprListMin1
			{
			match(input,66,FOLLOW_66_in_objDestroyStat7449); if (state.failed) return retval;
			pushFollow(FOLLOW_exprListMin1_in_objDestroyStat7457);
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
	// USE.g:1607:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
	public final USEParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
		USEParser.lnkInsStat_return retval = new USEParser.lnkInsStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// USE.g:1608:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
			// USE.g:1609:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
			{
			match(input,80,FOLLOW_80_in_lnkInsStat7483); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat7487); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7497);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat7501); if (state.failed) return retval;
			match(input,81,FOLLOW_81_in_lnkInsStat7505); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat7513); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkInsertionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((USEParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((USEParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// USE.g:1619:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
	public final USEParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
		USEParser.rValListMin2WithOptionalQualifiers_return retval = new USEParser.rValListMin2WithOptionalQualifiers_return();
		retval.start = input.LT(1);

		ASTRValue r =null;
		List<ASTRValue> qualifierValues =null;


		  retval.participans = new ArrayList<ASTRValue>();
		  retval.qualifiers = new ArrayList<List<ASTRValue>>();
		  List<ASTRValue> currentQualifiers = Collections.emptyList();

		try {
			// USE.g:1625:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
			// USE.g:1626:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7542);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// USE.g:1627:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==LBRACE) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// USE.g:1628:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7553); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7562);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7569); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7585); if (state.failed) return retval;
			pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7596);
			r=rValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.participans.add(r); }
			// USE.g:1640:3: ( LBRACE qualifierValues= rValList RBRACE )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==LBRACE) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// USE.g:1641:4: LBRACE qualifierValues= rValList RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7607); if (state.failed) return retval;
					pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7616);
					qualifierValues=rValList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
					match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7623); if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    retval.qualifiers.add(currentQualifiers);
			    currentQualifiers = Collections.emptyList();
			  }
			// USE.g:1650:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==COMMA) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// USE.g:1651:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7645); if (state.failed) return retval;
					pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7660);
					r=rValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.participans.add(r); }
					// USE.g:1655:5: ( LBRACE qualifierValues= rValList RBRACE )?
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( (LA138_0==LBRACE) ) {
						alt138=1;
					}
					switch (alt138) {
						case 1 :
							// USE.g:1656:6: LBRACE qualifierValues= rValList RBRACE
							{
							match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7680); if (state.failed) return retval;
							pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7691);
							qualifierValues=rValList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}
							match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7700); if (state.failed) return retval;
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
					break loop139;
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
	// USE.g:1671:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
	public final USEParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
		USEParser.lnkDelStat_return retval = new USEParser.lnkDelStat_return();
		retval.start = input.LT(1);

		Token ass=null;
		ParserRuleReturnScope p =null;

		try {
			// USE.g:1672:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
			// USE.g:1673:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
			{
			match(input,65,FOLLOW_65_in_lnkDelStat7741); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat7745); if (state.failed) return retval;
			pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7755);
			p=rValListMin2WithOptionalQualifiers();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat7759); if (state.failed) return retval;
			match(input,76,FOLLOW_76_in_lnkDelStat7763); if (state.failed) return retval;
			ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat7772); if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n = new ASTLinkDeletionStatement((retval.start), (ass!=null?ass.getText():null), (p!=null?((USEParser.rValListMin2WithOptionalQualifiers_return)p).participans:null), (p!=null?((USEParser.rValListMin2WithOptionalQualifiers_return)p).qualifiers:null)); }
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
	// USE.g:1687:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
	public final USEParser.condExStat_return condExStat() throws RecognitionException {
		USEParser.condExStat_return retval = new USEParser.condExStat_return();
		retval.start = input.LT(1);

		ASTExpression con =null;
		ASTStatement ts =null;
		ASTStatement es =null;


		  ASTStatement elseStat = new ASTEmptyStatement();

		try {
			// USE.g:1691:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
			// USE.g:1692:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
			{
			match(input,77,FOLLOW_77_in_condExStat7803); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_condExStat7812);
			con=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,108,FOLLOW_108_in_condExStat7816); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7825);
			ts=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			// USE.g:1696:3: ( 'else' es= statOrImplicitBlock )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==69) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// USE.g:1697:5: 'else' es= statOrImplicitBlock
					{
					match(input,69,FOLLOW_69_in_condExStat7836); if (state.failed) return retval;
					pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7848);
					es=statOrImplicitBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { elseStat = es; }
					}
					break;

			}

			match(input,70,FOLLOW_70_in_condExStat7860); if (state.failed) return retval;
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
	// USE.g:1708:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final USEParser.iterStat_return iterStat() throws RecognitionException {
		USEParser.iterStat_return retval = new USEParser.iterStat_return();
		retval.start = input.LT(1);

		Token var=null;
		ASTExpression set =null;
		ASTStatement s =null;

		try {
			// USE.g:1709:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// USE.g:1710:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,75,FOLLOW_75_in_iterStat7885); if (state.failed) return retval;
			var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat7893); if (state.failed) return retval;
			match(input,79,FOLLOW_79_in_iterStat7897); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_iterStat7905);
			set=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,68,FOLLOW_68_in_iterStat7909); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat7917);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,70,FOLLOW_70_in_iterStat7922); if (state.failed) return retval;
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
	// USE.g:1725:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
	public final USEParser.whileStat_return whileStat() throws RecognitionException {
		USEParser.whileStat_return retval = new USEParser.whileStat_return();
		retval.start = input.LT(1);

		ASTExpression cond =null;
		ASTStatement s =null;

		try {
			// USE.g:1726:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
			// USE.g:1727:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
			{
			match(input,111,FOLLOW_111_in_whileStat7948); if (state.failed) return retval;
			pushFollow(FOLLOW_inSoilExpression_in_whileStat7956);
			cond=inSoilExpression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,68,FOLLOW_68_in_whileStat7960); if (state.failed) return retval;
			pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat7968);
			s=statOrImplicitBlock();
			state._fsp--;
			if (state.failed) return retval;
			match(input,70,FOLLOW_70_in_whileStat7973); if (state.failed) return retval;
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
	// USE.g:1739:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
	public final USEParser.blockStat_return blockStat() throws RecognitionException {
		USEParser.blockStat_return retval = new USEParser.blockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

		try {
			// USE.g:1743:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
			// USE.g:1744:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
			{
			match(input,58,FOLLOW_58_in_blockStat8003); if (state.failed) return retval;
			// USE.g:1745:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==64) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// USE.g:1745:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
					{
					match(input,64,FOLLOW_64_in_blockStat8008); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_blockStat8014);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
					// USE.g:1745:73: ( COMMA vd1= variableDeclaration )*
					loop141:
					while (true) {
						int alt141=2;
						int LA141_0 = input.LA(1);
						if ( (LA141_0==COMMA) ) {
							alt141=1;
						}

						switch (alt141) {
						case 1 :
							// USE.g:1745:75: COMMA vd1= variableDeclaration
							{
							match(input,COMMA,FOLLOW_COMMA_in_blockStat8020); if (state.failed) return retval;
							pushFollow(FOLLOW_variableDeclaration_in_blockStat8026);
							vd1=variableDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
							}
							break;

						default :
							break loop141;
						}
					}

					match(input,SEMI,FOLLOW_SEMI_in_blockStat8033); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_stat_in_blockStat8043);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((USEParser.stat_return)s).n:null)); }
			match(input,70,FOLLOW_70_in_blockStat8048); if (state.failed) return retval;
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
	// USE.g:1754:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
	public final USEParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
		USEParser.implicitBlockStat_return retval = new USEParser.implicitBlockStat_return();
		retval.start = input.LT(1);

		ASTVariableDeclaration vd =null;
		ASTVariableDeclaration vd1 =null;
		ParserRuleReturnScope s =null;


		  retval.n = new ASTBlockStatement((retval.start), false);

		try {
			// USE.g:1758:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
			// USE.g:1759:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
			{
			match(input,64,FOLLOW_64_in_implicitBlockStat8074); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8080);
			vd=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}
			// USE.g:1759:72: ( COMMA vd1= variableDeclaration )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==COMMA) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// USE.g:1759:74: COMMA vd1= variableDeclaration
					{
					match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat8086); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8092);
					vd1=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}
					}
					break;

				default :
					break loop143;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat8099); if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_implicitBlockStat8107);
			s=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.n.setBody((s!=null?((USEParser.stat_return)s).n:null)); }
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
	// USE.g:1763:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
	public final ASTStatement statOrImplicitBlock() throws RecognitionException {
		ASTStatement n = null;


		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;

		try {
			// USE.g:1764:3: ( (s1= stat |s2= implicitBlockStat ) )
			// USE.g:1765:3: (s1= stat |s2= implicitBlockStat )
			{
			// USE.g:1765:3: (s1= stat |s2= implicitBlockStat )
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==AT||LA144_0==HASH||(LA144_0 >= IDENT && LA144_0 <= INT)||(LA144_0 >= LPAREN && LA144_0 <= MINUS)||LA144_0==PLUS||LA144_0==REAL||LA144_0==SEMI||(LA144_0 >= STAR && LA144_0 <= STRING)||(LA144_0 >= 45 && LA144_0 <= 51)||LA144_0==58||(LA144_0 >= 65 && LA144_0 <= 66)||(LA144_0 >= 69 && LA144_0 <= 70)||(LA144_0 >= 74 && LA144_0 <= 75)||LA144_0==77||LA144_0==80||(LA144_0 >= 83 && LA144_0 <= 84)||(LA144_0 >= 86 && LA144_0 <= 95)||(LA144_0 >= 103 && LA144_0 <= 104)||(LA144_0 >= 110 && LA144_0 <= 111)) ) {
				alt144=1;
			}
			else if ( (LA144_0==64) ) {
				alt144=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}

			switch (alt144) {
				case 1 :
					// USE.g:1765:4: s1= stat
					{
					pushFollow(FOLLOW_stat_in_statOrImplicitBlock8130);
					s1=stat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s1!=null?((USEParser.stat_return)s1).n:null); }
					}
					break;
				case 2 :
					// USE.g:1765:31: s2= implicitBlockStat
					{
					pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock8140);
					s2=implicitBlockStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = (s2!=null?((USEParser.implicitBlockStat_return)s2).n:null); }
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
	// USE.g:1779:1: nothing :;
	public final void nothing() throws RecognitionException {
		try {
			// USE.g:1780:1: ()
			// USE.g:1781:1: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nothing"



	// $ANTLR start "rValue"
	// USE.g:1787:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
	public final ASTRValue rValue() throws RecognitionException {
		ASTRValue n = null;


		ASTExpression e =null;
		ParserRuleReturnScope oc =null;

		try {
			// USE.g:1788:5: (e= inSoilExpression |oc= objCreateStat )
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==AT||LA145_0==HASH||(LA145_0 >= IDENT && LA145_0 <= INT)||(LA145_0 >= LPAREN && LA145_0 <= MINUS)||LA145_0==PLUS||LA145_0==REAL||(LA145_0 >= STAR && LA145_0 <= STRING)||(LA145_0 >= 45 && LA145_0 <= 51)||LA145_0==74||LA145_0==77||(LA145_0 >= 83 && LA145_0 <= 84)||(LA145_0 >= 87 && LA145_0 <= 95)||(LA145_0 >= 103 && LA145_0 <= 104)||LA145_0==110) ) {
				alt145=1;
			}
			else if ( (LA145_0==86) ) {
				alt145=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// USE.g:1789:5: e= inSoilExpression
					{
					pushFollow(FOLLOW_inSoilExpression_in_rValue8186);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }
					}
					break;
				case 2 :
					// USE.g:1790:5: oc= objCreateStat
					{
					pushFollow(FOLLOW_objCreateStat_in_rValue8198);
					oc=objCreateStat();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { 
					    if ((oc!=null?((USEParser.objCreateStat_return)oc).n:null) instanceof ASTNewLinkObjectStatement)
					    	n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)(oc!=null?((USEParser.objCreateStat_return)oc).n:null));
					    else
					    	n = new ASTRValueNewObject((ASTNewObjectStatement)(oc!=null?((USEParser.objCreateStat_return)oc).n:null));
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
	// USE.g:1803:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
	public final List<ASTRValue> rValList() throws RecognitionException {
		List<ASTRValue> n = null;


		List<ASTRValue> rl =null;

		try {
			// USE.g:1804:3: ( nothing |rl= rValListMin1 )
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==RBRACE) ) {
				alt146=1;
			}
			else if ( (LA146_0==AT||LA146_0==HASH||(LA146_0 >= IDENT && LA146_0 <= INT)||(LA146_0 >= LPAREN && LA146_0 <= MINUS)||LA146_0==PLUS||LA146_0==REAL||(LA146_0 >= STAR && LA146_0 <= STRING)||(LA146_0 >= 45 && LA146_0 <= 51)||LA146_0==74||LA146_0==77||(LA146_0 >= 83 && LA146_0 <= 84)||(LA146_0 >= 86 && LA146_0 <= 95)||(LA146_0 >= 103 && LA146_0 <= 104)||LA146_0==110) ) {
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
					// USE.g:1805:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_rValList8221);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }
					}
					break;
				case 2 :
					// USE.g:1808:3: rl= rValListMin1
					{
					pushFollow(FOLLOW_rValListMin1_in_rValList8248);
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
	// USE.g:1816:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin1() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// USE.g:1820:3: (r= rValue ( COMMA r= rValue )* )
			// USE.g:1821:3: r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin18281);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// USE.g:1823:3: ( COMMA r= rValue )*
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==COMMA) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// USE.g:1824:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin18295); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin18305);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop147;
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
	// USE.g:1834:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
	public final List<ASTRValue> rValListMin2() throws RecognitionException {
		List<ASTRValue> n = null;


		ASTRValue r =null;


		  n = new ArrayList<ASTRValue>();

		try {
			// USE.g:1838:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
			// USE.g:1839:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
			{
			pushFollow(FOLLOW_rValue_in_rValListMin28344);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			match(input,COMMA,FOLLOW_COMMA_in_rValListMin28352); if (state.failed) return n;
			pushFollow(FOLLOW_rValue_in_rValListMin28360);
			r=rValue();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add(r); }
			// USE.g:1844:3: ( COMMA r= rValue )*
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==COMMA) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// USE.g:1845:5: COMMA r= rValue
					{
					match(input,COMMA,FOLLOW_COMMA_in_rValListMin28374); if (state.failed) return n;
					pushFollow(FOLLOW_rValue_in_rValListMin28384);
					r=rValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n.add(r); }
					}
					break;

				default :
					break loop148;
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
	// USE.g:1855:1: inSoilExpression returns [ASTExpression n] : e= expression ;
	public final ASTExpression inSoilExpression() throws RecognitionException {
		ASTExpression n = null;


		ParserRuleReturnScope e =null;

		try {
			// USE.g:1856:3: (e= expression )
			// USE.g:1857:3: e= expression
			{
			pushFollow(FOLLOW_expression_in_inSoilExpression8418);
			e=expression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if ((e!=null?((USEParser.expression_return)e).n:null) != null) (e!=null?((USEParser.expression_return)e).n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }
			if ( state.backtracking==0 ) { n = (e!=null?((USEParser.expression_return)e).n:null); }
			}

		}
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
	// USE.g:1866:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
	public final List<ASTExpression> exprList() throws RecognitionException {
		List<ASTExpression> n = null;


		List<ASTExpression> el =null;

		try {
			// USE.g:1867:3: ( nothing |el= exprListMin1 )
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==EOF) ) {
				alt149=1;
			}
			else if ( (LA149_0==AT||LA149_0==HASH||(LA149_0 >= IDENT && LA149_0 <= INT)||(LA149_0 >= LPAREN && LA149_0 <= MINUS)||LA149_0==PLUS||LA149_0==REAL||(LA149_0 >= STAR && LA149_0 <= STRING)||(LA149_0 >= 45 && LA149_0 <= 51)||LA149_0==74||LA149_0==77||(LA149_0 >= 83 && LA149_0 <= 84)||(LA149_0 >= 87 && LA149_0 <= 95)||(LA149_0 >= 103 && LA149_0 <= 104)||LA149_0==110) ) {
				alt149=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}

			switch (alt149) {
				case 1 :
					// USE.g:1868:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_exprList8447);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }
					}
					break;
				case 2 :
					// USE.g:1871:3: el= exprListMin1
					{
					pushFollow(FOLLOW_exprListMin1_in_exprList8465);
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
	// USE.g:1879:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin1() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// USE.g:1883:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// USE.g:1884:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin18498);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// USE.g:1886:3: ( COMMA e= inSoilExpression )*
			loop150:
			while (true) {
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==COMMA) ) {
					alt150=1;
				}

				switch (alt150) {
				case 1 :
					// USE.g:1887:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin18513); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin18523);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop150;
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
	// USE.g:1897:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
	public final List<ASTExpression> exprListMin2() throws RecognitionException {
		List<ASTExpression> n = null;


		ASTExpression e =null;


		  n = new ArrayList<ASTExpression>();

		try {
			// USE.g:1901:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
			// USE.g:1902:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
			{
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin28563);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			match(input,COMMA,FOLLOW_COMMA_in_exprListMin28571); if (state.failed) return n;
			pushFollow(FOLLOW_inSoilExpression_in_exprListMin28579);
			e=inSoilExpression();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) { if (e != null) n.add(e); }
			// USE.g:1907:3: ( COMMA e= inSoilExpression )*
			loop151:
			while (true) {
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==COMMA) ) {
					alt151=1;
				}

				switch (alt151) {
				case 1 :
					// USE.g:1908:5: COMMA e= inSoilExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprListMin28593); if (state.failed) return n;
					pushFollow(FOLLOW_inSoilExpression_in_exprListMin28603);
					e=inSoilExpression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { if (e != null) n.add(e); }
					}
					break;

				default :
					break loop151;
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
	// USE.g:1918:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
	public final List<String> identList() throws RecognitionException {
		List<String> n = null;


		List<String> il =null;

		try {
			// USE.g:1919:3: ( nothing |il= identListMin1 )
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==EOF||LA152_0==RBRACE||LA152_0==SEMI||(LA152_0 >= 69 && LA152_0 <= 70)) ) {
				alt152=1;
			}
			else if ( (LA152_0==IDENT) ) {
				alt152=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 152, 0, input);
				throw nvae;
			}

			switch (alt152) {
				case 1 :
					// USE.g:1920:3: nothing
					{
					pushFollow(FOLLOW_nothing_in_identList8633);
					nothing();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) { n = new ArrayList<String>(); }
					}
					break;
				case 2 :
					// USE.g:1923:3: il= identListMin1
					{
					pushFollow(FOLLOW_identListMin1_in_identList8650);
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
	// USE.g:1931:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
	public final List<String> identListMin1() throws RecognitionException {
		List<String> n = null;


		Token id=null;


		  n = new ArrayList<String>();

		try {
			// USE.g:1935:3: (id= IDENT ( COMMA id= IDENT )* )
			// USE.g:1936:3: id= IDENT ( COMMA id= IDENT )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18684); if (state.failed) return n;
			if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }
			// USE.g:1938:3: ( COMMA id= IDENT )*
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==COMMA) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// USE.g:1939:5: COMMA id= IDENT
					{
					match(input,COMMA,FOLLOW_COMMA_in_identListMin18698); if (state.failed) return n;
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18708); if (state.failed) return n;
					if ( state.backtracking==0 ) {
					    n.add((id!=null?id.getText():null)); }
					}
					break;

				default :
					break loop153;
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

	// $ANTLR start synpred1_USE
	public final void synpred1_USE_fragment() throws RecognitionException {
		// USE.g:1337:7: ( COLON type EQUAL )
		// USE.g:1337:8: COLON type EQUAL
		{
		match(input,COLON,FOLLOW_COLON_in_synpred1_USE6434); if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred1_USE6436);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_USE6438); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_USE

	// $ANTLR start synpred2_USE
	public final void synpred2_USE_fragment() throws RecognitionException {
		// USE.g:1488:5: ( statStartingWithExpr )
		// USE.g:1488:6: statStartingWithExpr
		{
		pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_USE6986);
		statStartingWithExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_USE

	// Delegated rules

	public final boolean synpred2_USE() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_USE_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_USE() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_USE_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA38 dfa38 = new DFA38(this);
	protected DFA55 dfa55 = new DFA55(this);
	protected DFA60 dfa60 = new DFA60(this);
	static final String DFA2_eotS =
		"\41\uffff";
	static final String DFA2_eofS =
		"\1\1\40\uffff";
	static final String DFA2_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\24\2\uffff\1\32\1\30\1\12\1\uffff\1\15\1\uffff"+
		"\1\24\1\5\1\15\1\12\1\uffff\1\36\1\24\1\12\1\15\2\5\2\24\1\12\1\30\1\32"+
		"\1\12\1\15\1\36\1\12";
	static final String DFA2_maxS =
		"\1\110\1\uffff\1\24\1\uffff\1\24\2\uffff\1\32\1\151\1\45\1\uffff\1\15"+
		"\1\uffff\1\24\1\156\1\15\1\45\1\uffff\1\36\1\24\1\45\1\15\1\110\1\156"+
		"\2\24\1\45\1\151\1\32\1\45\1\15\1\36\1\45";
	static final String DFA2_acceptS =
		"\1\uffff\1\6\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\1\uffff\1\1\4\uffff"+
		"\1\5\17\uffff";
	static final String DFA2_specialS =
		"\41\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\16\uffff\1\4\37\uffff\1\3\2\uffff\2\3\4\uffff\1\5\12\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\10",
			"",
			"",
			"\1\11",
			"\1\3\40\uffff\1\3\1\uffff\1\12\1\uffff\1\3\10\uffff\1\3\31\uffff\1\3"+
			"\10\uffff\1\3",
			"\1\15\11\uffff\1\13\20\uffff\1\14",
			"",
			"\1\16",
			"",
			"\1\17",
			"\1\21\11\uffff\1\21\4\uffff\3\21\7\uffff\1\20\13\uffff\1\21\37\uffff"+
			"\1\21\43\uffff\1\21",
			"\1\22",
			"\1\23\32\uffff\1\14",
			"",
			"\1\24",
			"\1\25",
			"\1\15\32\uffff\1\26",
			"\1\27",
			"\1\31\16\uffff\1\30\37\uffff\1\3\2\uffff\2\14\17\uffff\1\6",
			"\1\21\11\uffff\1\21\4\uffff\3\21\7\uffff\1\32\13\uffff\1\21\37\uffff"+
			"\1\21\43\uffff\1\21",
			"\1\33",
			"\1\34",
			"\1\23\32\uffff\1\14",
			"\1\14\40\uffff\1\14\1\uffff\1\12\1\uffff\1\14\10\uffff\1\14\31\uffff"+
			"\1\14\10\uffff\1\14",
			"\1\35",
			"\1\15\11\uffff\1\36\20\uffff\1\26",
			"\1\37",
			"\1\40",
			"\1\15\32\uffff\1\26"
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 136:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition |ca= capAnnotation )*";
		}
	}

	static final String DFA38_eotS =
		"\16\uffff";
	static final String DFA38_eofS =
		"\16\uffff";
	static final String DFA38_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\15\1\24\1\5\1\36\1\15\1\12\1\36"+
		"\1\12";
	static final String DFA38_maxS =
		"\1\151\1\uffff\1\24\1\uffff\1\32\1\45\1\15\1\24\1\144\1\36\1\15\1\45\1"+
		"\36\1\45";
	static final String DFA38_acceptS =
		"\1\uffff\1\2\1\uffff\1\1\12\uffff";
	static final String DFA38_specialS =
		"\16\uffff}>";
	static final String[] DFA38_transitionS = {
			"\1\2\16\uffff\1\1\21\uffff\1\1\26\uffff\1\1\10\uffff\1\1\34\uffff\2\3"+
			"\4\uffff\1\1",
			"",
			"\1\4",
			"",
			"\1\5",
			"\1\7\11\uffff\1\6\20\uffff\1\10",
			"\1\11",
			"\1\12",
			"\1\2\16\uffff\1\1\116\uffff\2\3",
			"\1\13",
			"\1\14",
			"\1\7\32\uffff\1\10",
			"\1\15",
			"\1\7\32\uffff\1\10"
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 388:5: (ppc= prePostClause )*";
		}
	}

	static final String DFA55_eotS =
		"\31\uffff";
	static final String DFA55_eofS =
		"\1\1\6\uffff\1\1\21\uffff";
	static final String DFA55_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\15\1\5\1\24\1\5\1\15\1\12\1\36\1"+
		"\24\1\12\1\15\2\5\1\24\1\12\1\32\1\12\1\15\1\36\1\12";
	static final String DFA55_maxS =
		"\1\122\1\uffff\1\24\1\uffff\1\32\1\45\1\15\1\122\1\24\1\156\1\15\1\45"+
		"\1\36\1\24\1\45\1\15\1\122\1\156\1\24\1\45\1\32\1\45\1\15\1\36\1\45";
	static final String DFA55_acceptS =
		"\1\uffff\1\2\1\uffff\1\1\25\uffff";
	static final String DFA55_specialS =
		"\31\uffff}>";
	static final String[] DFA55_transitionS = {
			"\1\2\16\uffff\1\1\37\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff\1\1\1"+
			"\3\10\uffff\1\3",
			"",
			"\1\4",
			"",
			"\1\5",
			"\1\10\11\uffff\1\6\20\uffff\1\7",
			"\1\11",
			"\1\2\16\uffff\1\1\37\uffff\1\1\2\uffff\2\1\4\uffff\1\1\12\uffff\1\1"+
			"\11\uffff\1\3",
			"\1\12",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\13\13\uffff\1\1\37\uffff\1\1"+
			"\43\uffff\1\1",
			"\1\14",
			"\1\15\32\uffff\1\7",
			"\1\16",
			"\1\17",
			"\1\10\32\uffff\1\20",
			"\1\21",
			"\1\22\16\uffff\1\1\37\uffff\1\1\2\uffff\2\1\17\uffff\1\1\11\uffff\1"+
			"\3",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\23\13\uffff\1\1\37\uffff\1\1"+
			"\43\uffff\1\1",
			"\1\24",
			"\1\15\32\uffff\1\7",
			"\1\25",
			"\1\10\11\uffff\1\26\20\uffff\1\20",
			"\1\27",
			"\1\30",
			"\1\10\32\uffff\1\20"
	};

	static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
	static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
	static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
	static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
	static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
	static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
	static final short[][] DFA55_transition;

	static {
		int numStates = DFA55_transitionS.length;
		DFA55_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
		}
	}

	protected class DFA55 extends DFA {

		public DFA55(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 55;
			this.eot = DFA55_eot;
			this.eof = DFA55_eof;
			this.min = DFA55_min;
			this.max = DFA55_max;
			this.accept = DFA55_accept;
			this.special = DFA55_special;
			this.transition = DFA55_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 509:5: (inv= invariantClause )*";
		}
	}

	static final String DFA60_eotS =
		"\31\uffff";
	static final String DFA60_eofS =
		"\1\1\6\uffff\1\1\21\uffff";
	static final String DFA60_minS =
		"\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\15\1\5\1\24\1\5\1\15\1\12\1\36\1"+
		"\24\1\12\1\15\2\5\1\24\1\12\1\32\1\12\1\15\1\36\1\12";
	static final String DFA60_maxS =
		"\1\144\1\uffff\1\24\1\uffff\1\32\1\45\1\15\1\144\1\24\1\156\1\15\1\45"+
		"\1\36\1\24\1\45\1\15\1\144\1\156\1\24\1\45\1\32\1\45\1\15\1\36\1\45";
	static final String DFA60_acceptS =
		"\1\uffff\1\2\1\uffff\1\1\25\uffff";
	static final String DFA60_specialS =
		"\31\uffff}>";
	static final String[] DFA60_transitionS = {
			"\1\2\16\uffff\1\1\37\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff\1\1\32"+
			"\uffff\2\3",
			"",
			"\1\4",
			"",
			"\1\5",
			"\1\10\11\uffff\1\6\20\uffff\1\7",
			"\1\11",
			"\1\2\16\uffff\1\1\37\uffff\1\1\2\uffff\2\1\4\uffff\1\1\12\uffff\1\1"+
			"\32\uffff\2\3",
			"\1\12",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\13\13\uffff\1\1\37\uffff\1\1"+
			"\43\uffff\1\1",
			"\1\14",
			"\1\15\32\uffff\1\7",
			"\1\16",
			"\1\17",
			"\1\10\32\uffff\1\20",
			"\1\21",
			"\1\22\16\uffff\1\1\37\uffff\1\1\2\uffff\2\1\17\uffff\1\1\32\uffff\2"+
			"\3",
			"\1\1\11\uffff\1\1\4\uffff\3\1\7\uffff\1\23\13\uffff\1\1\37\uffff\1\1"+
			"\43\uffff\1\1",
			"\1\24",
			"\1\15\32\uffff\1\7",
			"\1\25",
			"\1\10\11\uffff\1\26\20\uffff\1\20",
			"\1\27",
			"\1\30",
			"\1\10\32\uffff\1\20"
	};

	static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
	static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
	static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
	static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
	static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
	static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
	static final short[][] DFA60_transition;

	static {
		int numStates = DFA60_transitionS.length;
		DFA60_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
		}
	}

	protected class DFA60 extends DFA {

		public DFA60(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 60;
			this.eot = DFA60_eot;
			this.eof = DFA60_eof;
			this.min = DFA60_min;
			this.max = DFA60_max;
			this.accept = DFA60_accept;
			this.special = DFA60_special;
			this.transition = DFA60_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 537:5: (ppc= prePostClause )+";
		}
	}

	public static final BitSet FOLLOW_annotationSet_in_model76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_model82 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_model86 = new BitSet(new long[]{0x2190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_generalClassifierDefinition_in_model98 = new BitSet(new long[]{0x2190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_associationDefinition_in_model111 = new BitSet(new long[]{0x2190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_61_in_model125 = new BitSet(new long[]{0x6190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_invariant_in_model143 = new BitSet(new long[]{0x6190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_prePost_in_model164 = new BitSet(new long[]{0x6190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_enumTypeDefinition_in_model204 = new BitSet(new long[]{0x2190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_capAnnotation_in_model218 = new BitSet(new long[]{0x2190000000100020L,0x0000000000000100L});
	public static final BitSet FOLLOW_EOF_in_model239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_enumTypeDefinition273 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition277 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition279 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_enumTypeDefinition283 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition285 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyDataType_in_dataTypeDefinition326 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_dataTypeDefinition330 = new BitSet(new long[]{0x2000000001000000L,0x0000000100000040L});
	public static final BitSet FOLLOW_LESS_in_dataTypeDefinition340 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_dataTypeDefinition344 = new BitSet(new long[]{0x2000000000000000L,0x0000000100000040L});
	public static final BitSet FOLLOW_96_in_dataTypeDefinition357 = new BitSet(new long[]{0x2000000000100020L,0x0000000000000040L});
	public static final BitSet FOLLOW_operationDefinition_in_dataTypeDefinition377 = new BitSet(new long[]{0x2000000000100020L,0x0000000000000040L});
	public static final BitSet FOLLOW_61_in_dataTypeDefinition404 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040240L});
	public static final BitSet FOLLOW_invariantClause_in_dataTypeDefinition424 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040240L});
	public static final BitSet FOLLOW_70_in_dataTypeDefinition448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition473 = new BitSet(new long[]{0x0190000000100000L});
	public static final BitSet FOLLOW_52_in_generalClassifierDefinition481 = new BitSet(new long[]{0x0180000000100000L});
	public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataTypeDefinition_in_generalClassifierDefinition543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyClass_in_classDefinition673 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_classDefinition677 = new BitSet(new long[]{0x2200000001000000L,0x0000020100000040L});
	public static final BitSet FOLLOW_LESS_in_classDefinition687 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_classDefinition691 = new BitSet(new long[]{0x2200000000000000L,0x0000020100000040L});
	public static final BitSet FOLLOW_57_in_classDefinition704 = new BitSet(new long[]{0x2000000000100020L,0x0000020100000040L});
	public static final BitSet FOLLOW_attributeDefinition_in_classDefinition717 = new BitSet(new long[]{0x2000000000100020L,0x0000020100000040L});
	public static final BitSet FOLLOW_96_in_classDefinition738 = new BitSet(new long[]{0x2000000000100020L,0x0000020000000040L});
	public static final BitSet FOLLOW_operationDefinition_in_classDefinition751 = new BitSet(new long[]{0x2000000000100020L,0x0000020000000040L});
	public static final BitSet FOLLOW_61_in_classDefinition773 = new BitSet(new long[]{0x0000000000000020L,0x0000020000040240L});
	public static final BitSet FOLLOW_invariantClause_in_classDefinition793 = new BitSet(new long[]{0x0000000000000020L,0x0000020000040240L});
	public static final BitSet FOLLOW_105_in_classDefinition819 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000040L});
	public static final BitSet FOLLOW_stateMachine_in_classDefinition839 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000040L});
	public static final BitSet FOLLOW_70_in_classDefinition863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_associationClassDefinition896 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationClassDefinition922 = new BitSet(new long[]{0x2A00000001100000L,0x0000020100000040L});
	public static final BitSet FOLLOW_LESS_in_associationClassDefinition932 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_associationClassDefinition936 = new BitSet(new long[]{0x2A00000000100000L,0x0000020100000040L});
	public static final BitSet FOLLOW_59_in_associationClassDefinition948 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition956 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition968 = new BitSet(new long[]{0x2200000000100020L,0x0000020100000040L});
	public static final BitSet FOLLOW_57_in_associationClassDefinition988 = new BitSet(new long[]{0x2000000000100020L,0x0000020100000040L});
	public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition1001 = new BitSet(new long[]{0x2000000000100020L,0x0000020100000040L});
	public static final BitSet FOLLOW_96_in_associationClassDefinition1022 = new BitSet(new long[]{0x2000000000100020L,0x0000020000000040L});
	public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition1035 = new BitSet(new long[]{0x2000000000100020L,0x0000020000000040L});
	public static final BitSet FOLLOW_61_in_associationClassDefinition1057 = new BitSet(new long[]{0x0000000000100020L,0x0000020000040240L});
	public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition1077 = new BitSet(new long[]{0x0000000000100020L,0x0000020000040240L});
	public static final BitSet FOLLOW_105_in_associationClassDefinition1103 = new BitSet(new long[]{0x0000000000100000L,0x0000002000000040L});
	public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition1123 = new BitSet(new long[]{0x0000000000100000L,0x0000002000000040L});
	public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition1164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition1168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_associationClassDefinition1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_attributeDefinition1219 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_attributeDefinition1227 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_attributeDefinition1229 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_attributeDefinition1233 = new BitSet(new long[]{0x0000004000100002L});
	public static final BitSet FOLLOW_keyDerive_in_attributeDefinition1257 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_keyDerived_in_attributeDefinition1259 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_set_in_attributeDefinition1262 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_attributeDefinition1272 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_keyInit_in_attributeDefinition1292 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_set_in_attributeDefinition1296 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_attributeDefinition1308 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_attributeDefinition1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_operationDefinition1359 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_operationDefinition1369 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_operationDefinition1379 = new BitSet(new long[]{0x04000040040020A0L,0x0000001800000000L});
	public static final BitSet FOLLOW_superParamList_in_operationDefinition1389 = new BitSet(new long[]{0x04000040000020A2L,0x0000001800000000L});
	public static final BitSet FOLLOW_COLON_in_operationDefinition1410 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_operationDefinition1416 = new BitSet(new long[]{0x0400004000002022L,0x0000001800000000L});
	public static final BitSet FOLLOW_EQUAL_in_operationDefinition1444 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_operationDefinition1450 = new BitSet(new long[]{0x0000004000000022L,0x0000001800000000L});
	public static final BitSet FOLLOW_blockStat_in_operationDefinition1472 = new BitSet(new long[]{0x0000004000000022L,0x0000001800000000L});
	public static final BitSet FOLLOW_prePostClause_in_operationDefinition1494 = new BitSet(new long[]{0x0000004000000022L,0x0000001800000000L});
	public static final BitSet FOLLOW_SEMI_in_operationDefinition1507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_superParamList1542 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_IDENT_in_superParamList1560 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_superParamList1571 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_superParamList1577 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_superParamList1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_associationDefinition1625 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyAssociation_in_associationDefinition1639 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyAggregation_in_associationDefinition1643 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_keyComposition_in_associationDefinition1647 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationDefinition1657 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_associationDefinition1665 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationDefinition1673 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_associationEnd_in_associationDefinition1685 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_associationDefinition1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationSet_in_associationEnd1721 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd1729 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LBRACK_in_associationEnd1731 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicity_in_associationEnd1735 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_associationEnd1737 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_keyRole_in_associationEnd1748 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd1752 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_98_in_associationEnd1773 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_107_in_associationEnd1785 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd1789 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_keyUnion_in_associationEnd1801 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_102_in_associationEnd1813 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_associationEnd1817 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_keyDerived_in_associationEnd1830 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_keyDerive_in_associationEnd1832 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_LPAREN_in_associationEnd1837 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd1843 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_associationEnd1845 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_associationEnd1849 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_associationEnd1853 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_keyQualifier_in_associationEnd1865 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_associationEnd1871 = new BitSet(new long[]{0x0000004000100002L,0x0000084400000000L});
	public static final BitSet FOLLOW_SEMI_in_associationEnd1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1923 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_multiplicity1933 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1937 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1966 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange1976 = new BitSet(new long[]{0x0000020000200000L});
	public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_multiplicitySpec2014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_multiplicitySpec2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_invariant2065 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_invariant2075 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_COMMA_in_invariant2088 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_invariant2092 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_COLON_in_invariant2100 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_simpleType_in_invariant2112 = new BitSet(new long[]{0x0000000000000022L,0x0000000000040200L});
	public static final BitSet FOLLOW_invariantClause_in_invariant2124 = new BitSet(new long[]{0x0000000000000022L,0x0000000000040200L});
	public static final BitSet FOLLOW_annotationSet_in_invariantClause2154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_invariantClause2162 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_invariantClause2168 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_invariantClause2173 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_invariantClause2177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_invariantClause2194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_invariantClause2196 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_invariantClause2202 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_invariantClause2207 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_invariantClause2211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_prePost2244 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_prePost2248 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_prePost2250 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_prePost2254 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_paramList_in_prePost2258 = new BitSet(new long[]{0x00000000000000A0L,0x0000001800000000L});
	public static final BitSet FOLLOW_COLON_in_prePost2262 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_prePost2266 = new BitSet(new long[]{0x0000000000000020L,0x0000001800000000L});
	public static final BitSet FOLLOW_prePostClause_in_prePost2285 = new BitSet(new long[]{0x0000000000000022L,0x0000001800000000L});
	public static final BitSet FOLLOW_annotationSet_in_prePostClause2319 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
	public static final BitSet FOLLOW_set_in_prePostClause2331 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_IDENT_in_prePostClause2346 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_prePostClause2351 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_prePostClause2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotationSet2382 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_annotation2401 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_annotation2405 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_annotation2410 = new BitSet(new long[]{0x0000002000100400L});
	public static final BitSet FOLLOW_annotationValues_in_annotation2418 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_annotation2423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationValue_in_annotationValues2446 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_annotationValues2454 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_annotationValue_in_annotationValues2458 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_annotationValue2477 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_annotationValue2482 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue2488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_stateMachine2518 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_stateMachine2551 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_stateMachine2564 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_stateDefinition_in_stateMachine2580 = new BitSet(new long[]{0x0000000000100000L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_stateMachine2590 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_transitionDefinition_in_stateMachine2606 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_stateMachine2616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_stateDefinition2632 = new BitSet(new long[]{0x0000000000800082L});
	public static final BitSet FOLLOW_COLON_in_stateDefinition2640 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_stateDefinition2644 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_LBRACK_in_stateDefinition2655 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_stateDefinition2661 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_stateDefinition2663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition2684 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARROW_in_transitionDefinition2686 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition2690 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_LBRACE_in_transitionDefinition2700 = new BitSet(new long[]{0x8000000000900000L});
	public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2710 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_transitionDefinition2714 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2718 = new BitSet(new long[]{0x8000000000100000L});
	public static final BitSet FOLLOW_event_in_transitionDefinition2742 = new BitSet(new long[]{0x0000000400800000L});
	public static final BitSet FOLLOW_IDENT_in_transitionDefinition2758 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_transitionDefinition2762 = new BitSet(new long[]{0x0000002004000000L});
	public static final BitSet FOLLOW_paramList_in_transitionDefinition2767 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_transitionDefinition2774 = new BitSet(new long[]{0x0000000400800000L});
	public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2791 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_transitionDefinition2795 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2799 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_transitionDefinition2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_event2829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keySignal_in_signalDefinition2849 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_signalDefinition2853 = new BitSet(new long[]{0x2200000001000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LESS_in_signalDefinition2868 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_idList_in_signalDefinition2872 = new BitSet(new long[]{0x2200000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_57_in_signalDefinition2885 = new BitSet(new long[]{0x2000000000100020L,0x0000000000000040L});
	public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition2898 = new BitSet(new long[]{0x2000000000100020L,0x0000000000000040L});
	public static final BitSet FOLLOW_61_in_signalDefinition2919 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040240L});
	public static final BitSet FOLLOW_invariantClause_in_signalDefinition2939 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040240L});
	public static final BitSet FOLLOW_70_in_signalDefinition2963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_capAnnotation2990 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_capAnnotation2994 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_capAnnotation2996 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_capArg_in_capAnnotation3008 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_capAnnotation3021 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_capArg_in_capAnnotation3025 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_capAnnotation3037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_capArg3061 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_capArg3063 = new BitSet(new long[]{0x0000040040708020L,0x0000400000000400L});
	public static final BitSet FOLLOW_capValue_in_capArg3067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_OCL_STRING_in_capValue3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_capValue3122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_capValue3141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_capValue3160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_capValue3177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_capValue3193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_capValue3207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumRef_in_capValue3223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_capAnnotation_in_capValue3245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_capBlock_in_capValue3261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedName3290 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_DOT_in_qualifiedName3300 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedName3304 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_IDENT_in_enumRef3335 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_enumRef3337 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_enumRef3341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_capBlock3369 = new BitSet(new long[]{0x0000040440708020L,0x0000400000000400L});
	public static final BitSet FOLLOW_capValue_in_capBlock3389 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_capBlock3402 = new BitSet(new long[]{0x0000040040708020L,0x0000400000000400L});
	public static final BitSet FOLLOW_capValue_in_capBlock3406 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_capBlock3425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyUnion3438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyAssociation3452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyRole3466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyComposition3478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyAggregation3490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDataType3504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyClass3516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keySignal3528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDerived3542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyDerive3556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyInit3568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_keyQualifier3584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOnly3612 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expressionOnly3614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_expression3662 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_expression3673 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression3677 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_expression3681 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression3686 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_expression3690 = new BitSet(new long[]{0x0000000000000400L,0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_expression3728 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_expression3740 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_expression3744 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_expression3748 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_expression3753 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_expression3757 = new BitSet(new long[]{0x0000000000000400L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_expression3798 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression3814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramList3847 = new BitSet(new long[]{0x0000002000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList3864 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_paramList3876 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_paramList3880 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_paramList3900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idList3929 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_idList3939 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_idList3943 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration3974 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableDeclaration3976 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration3980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4016 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conditionalImpliesExpression4029 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4078 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_conditionalOrExpression4091 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4095 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4139 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_conditionalXOrExpression4152 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4156 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression4200 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_conditionalAndExpression4213 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression4217 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4265 = new BitSet(new long[]{0x0000000080002002L});
	public static final BitSet FOLLOW_set_in_equalityExpression4284 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4294 = new BitSet(new long[]{0x0000000080002002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4343 = new BitSet(new long[]{0x0000000003030002L});
	public static final BitSet FOLLOW_set_in_relationalExpression4361 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4379 = new BitSet(new long[]{0x0000000003030002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4429 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression4447 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4457 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4507 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression4525 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4539 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_unaryExpression4601 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF882400L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression4678 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_ARROW_in_postfixExpression4696 = new BitSet(new long[]{0x0000000000100000L,0x000001807A080000L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression4702 = new BitSet(new long[]{0x0000000000100000L,0x000001807A080000L});
	public static final BitSet FOLLOW_propertyCall_in_postfixExpression4713 = new BitSet(new long[]{0x0000000000000812L});
	public static final BitSet FOLLOW_literal_in_primaryExpression4753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectReference_in_primaryExpression4767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyCall_in_primaryExpression4779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression4790 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_primaryExpression4794 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression4796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_primaryExpression4808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression4820 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression4822 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_primaryExpression4824 = new BitSet(new long[]{0x0000000004000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression4847 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_primaryExpression4849 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression4867 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression4869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression4882 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression4884 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_primaryExpression4886 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression4890 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_primaryExpression4894 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression4896 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AT_in_primaryExpression4916 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_primaryExpression4918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_objectReference4944 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_objectReference4952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryExpression_in_propertyCall5017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterateExpression_in_propertyCall5030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationExpression_in_propertyCall5043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeExpression_in_propertyCall5056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inStateExpression_in_propertyCall5069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_queryExpression5104 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_queryExpression5111 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression5122 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_queryExpression5126 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_queryExpression5137 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_queryExpression5143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_iterateExpression5175 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_iterateExpression5181 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression5189 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMI_in_iterateExpression5191 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableInitialization_in_iterateExpression5199 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BAR_in_iterateExpression5201 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_iterateExpression5209 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_iterateExpression5215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_operationExpression5259 = new BitSet(new long[]{0x0000000004800022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression5281 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_operationExpression5294 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression5307 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_operationExpression5311 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression5323 = new BitSet(new long[]{0x0000000004800022L});
	public static final BitSet FOLLOW_LBRACK_in_operationExpression5340 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_operationExpression5355 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression5370 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_operationExpression5374 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RBRACK_in_operationExpression5388 = new BitSet(new long[]{0x0000000004000022L});
	public static final BitSet FOLLOW_AT_in_operationExpression5413 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_operationExpression5415 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_operationExpression5440 = new BitSet(new long[]{0x000FE6310C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_operationExpression5461 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_operationExpression5473 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_operationExpression5477 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_operationExpression5497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inStateExpression5545 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_inStateExpression5558 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_inStateExpression5567 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_inStateExpression5572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeExpression5608 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_typeExpression5632 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_typeExpression5636 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_typeExpression5638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5676 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5679 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration5683 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration5693 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5699 = new BitSet(new long[]{0x0000000000000482L});
	public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5702 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_elemVarsDeclaration5708 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_IDENT_in_variableInitialization5736 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_variableInitialization5738 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_variableInitialization5742 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_variableInitialization5744 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_variableInitialization5748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_ifExpression5780 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_ifExpression5784 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_ifExpression5786 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_ifExpression5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_ifExpression5792 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_ifExpression5796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_ifExpression5798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_literal5837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_literal5851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal5864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_literal5879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal5893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_literal5903 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_literal5907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_literal5919 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_COLON_in_literal5921 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_literal5925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_literal5937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal5949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_undefinedLiteral_in_literal5961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_literal5973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_literal5985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionLiteral6023 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_collectionLiteral6052 = new BitSet(new long[]{0x000FE6150C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6069 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_collectionLiteral6082 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6086 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_collectionLiteral6105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_collectionItem6134 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DOTDOT_in_collectionItem6145 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_collectionItem6149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_emptyCollectionLiteral6178 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral6180 = new BitSet(new long[]{0x0003E00000000000L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral6184 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral6186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral6202 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral6204 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral6206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_undefinedLiteral6236 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral6238 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral6242 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral6244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_undefinedLiteral6258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_undefinedLiteral6272 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral6274 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_undefinedLiteral6278 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral6280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_undefinedLiteral6294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_tupleLiteral6333 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LBRACE_in_tupleLiteral6339 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral6347 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleLiteral6358 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tupleItem_in_tupleLiteral6362 = new BitSet(new long[]{0x0000000400000400L});
	public static final BitSet FOLLOW_RBRACE_in_tupleLiteral6373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tupleItem6404 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_COLON_in_tupleItem6443 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_tupleItem6447 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_tupleItem6449 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_tupleItem6453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_tupleItem6475 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_expression_in_tupleItem6485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleType_in_type6551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionType_in_type6563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleType_in_type6575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOnly6607 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_typeOnly6609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simpleType6637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_collectionType6675 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_collectionType6702 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_collectionType6706 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_collectionType6708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_tupleType6742 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_tupleType6744 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType6753 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_COMMA_in_tupleType6764 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_tuplePart_in_tupleType6768 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_RPAREN_in_tupleType6780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_tuplePart6812 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_tuplePart6814 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_tuplePart6818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOnly6867 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statOnly6871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleStat_in_stat6906 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_SEMI_in_stat6918 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C06L});
	public static final BitSet FOLLOW_singleStat_in_stat6928 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_emptyStat_in_singleStat6968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat6994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAssignStat_in_singleStat7006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_singleStat7020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDestroyStat_in_singleStat7034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkInsStat_in_singleStat7047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lnkDelStat_in_singleStat7064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExStat_in_singleStat7081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterStat_in_singleStat7098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_singleStat7120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStat_in_singleStat7138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_emptyStat7165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr7191 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr7205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_varAssignStat7243 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat7247 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValue_in_varAssignStat7255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_attAssignStat7279 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_attAssignStat7288 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat7292 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValue_in_attAssignStat7300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_objCreateStat7326 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_simpleType_in_objCreateStat7334 = new BitSet(new long[]{0x0800000004000002L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat7344 = new BitSet(new long[]{0x000FE6310C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat7357 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat7365 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_objCreateStat7383 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_objCreateStat7391 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat7405 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_objCreateStat7413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_objDestroyStat7449 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat7457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_lnkInsStat7483 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkInsStat7487 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7497 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkInsStat7501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_lnkInsStat7505 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_lnkInsStat7513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7542 = new BitSet(new long[]{0x0000000000400400L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7553 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7562 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7569 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7585 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7596 = new BitSet(new long[]{0x0000000000400402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7607 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7616 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7623 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7645 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7660 = new BitSet(new long[]{0x0000000000400402L});
	public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7680 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7691 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7700 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_65_in_lnkDelStat7741 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_lnkDelStat7745 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7755 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lnkDelStat7759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_lnkDelStat7763 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_lnkDelStat7772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_condExStat7803 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_inSoilExpression_in_condExStat7812 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_condExStat7816 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C07L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_69_in_condExStat7836 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C07L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_condExStat7860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_iterStat7885 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_iterStat7893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_iterStat7897 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_inSoilExpression_in_iterStat7905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_iterStat7909 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C07L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat7917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_iterStat7922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_111_in_whileStat7948 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_inSoilExpression_in_whileStat7956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_whileStat7960 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C07L});
	public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat7968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_whileStat7973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_blockStat8003 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C07L});
	public static final BitSet FOLLOW_64_in_blockStat8008 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat8014 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_blockStat8020 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_blockStat8026 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_SEMI_in_blockStat8033 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C06L});
	public static final BitSet FOLLOW_stat_in_blockStat8043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_blockStat8048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_implicitBlockStat8074 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8080 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_implicitBlockStat8086 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8092 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_SEMI_in_implicitBlockStat8099 = new BitSet(new long[]{0x040FE6110C340020L,0x0000C180FFD92C06L});
	public static final BitSet FOLLOW_stat_in_implicitBlockStat8107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_statOrImplicitBlock8130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock8140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_rValue8186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objCreateStat_in_rValue8198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_rValList8221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValListMin1_in_rValList8248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rValue_in_rValListMin18281 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin18295 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValue_in_rValListMin18305 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_rValue_in_rValListMin28344 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin28352 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValue_in_rValListMin28360 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_rValListMin28374 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FFD82400L});
	public static final BitSet FOLLOW_rValue_in_rValListMin28384 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expression_in_inSoilExpression8418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nothing_in_exprList8447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprListMin1_in_exprList8465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18498 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin18513 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18523 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28563 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin28571 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28579 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprListMin28593 = new BitSet(new long[]{0x000FE6110C340020L,0x00004180FF982400L});
	public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28603 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_nothing_in_identList8633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identListMin1_in_identList8650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identListMin18684 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_identListMin18698 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_identListMin18708 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COLON_in_synpred1_USE6434 = new BitSet(new long[]{0x0007E00000100000L});
	public static final BitSet FOLLOW_type_in_synpred1_USE6436 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred1_USE6438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_USE6986 = new BitSet(new long[]{0x0000000000000002L});
}
