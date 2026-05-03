// $ANTLR 3.5.2 CAP.g 2026-05-03 14:12:44

package org.tzi.use.examplePlugin.parser;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.tzi.use.examplePlugin.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CAPParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "ATTRIBUTES", "BOOLEAN", 
		"CLASS", "COLON", "COMMA", "END", "EQ", "IDENT", "LBRACE", "LPAREN", "NUMBER", 
		"QUALIFIED_IDENT", "RBRACE", "RPAREN", "STRING", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CAPParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CAPParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CAPParser.tokenNames; }
	@Override public String getGrammarFileName() { return "CAP.g"; }


	    String stripQuotes(String s) {
	        return s.substring(1, s.length() - 1);
	    }



	// $ANTLR start "annotationFile"
	// CAP.g:27:1: annotationFile returns [ASTInterface ann] : a= annotation (ctx= contextBlock )? EOF ;
	public final ASTInterface annotationFile() throws RecognitionException {
		ASTInterface ann = null;


		ASTInterface a =null;
		String ctx =null;

		 ann = null; 
		try {
			// CAP.g:29:5: (a= annotation (ctx= contextBlock )? EOF )
			// CAP.g:30:7: a= annotation (ctx= contextBlock )? EOF
			{
			pushFollow(FOLLOW_annotation_in_annotationFile55);
			a=annotation();
			state._fsp--;

			// CAP.g:31:10: (ctx= contextBlock )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CLASS) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// CAP.g:31:10: ctx= contextBlock
					{
					pushFollow(FOLLOW_contextBlock_in_annotationFile65);
					ctx=contextBlock();
					state._fsp--;

					}
					break;

			}

			match(input,EOF,FOLLOW_EOF_in_annotationFile74); 

			        ann = a;

			        if(ctx != null){
			            ann.contextClass = ctx;
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
	// $ANTLR end "annotationFile"



	// $ANTLR start "contextBlock"
	// CAP.g:46:1: contextBlock returns [String c] : cls= classDecl ;
	public final String contextBlock() throws RecognitionException {
		String c = null;


		String cls =null;

		 c = null; 
		try {
			// CAP.g:48:5: (cls= classDecl )
			// CAP.g:49:7: cls= classDecl
			{
			pushFollow(FOLLOW_classDecl_in_contextBlock119);
			cls=classDecl();
			state._fsp--;


			        c = cls;
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "contextBlock"



	// $ANTLR start "classDecl"
	// CAP.g:59:1: classDecl returns [String name] : CLASS cname= IDENT (attr= attributesBlock )? ( END )? ;
	public final String classDecl() throws RecognitionException {
		String name = null;


		Token cname=null;

		 name = null; 
		try {
			// CAP.g:61:5: ( CLASS cname= IDENT (attr= attributesBlock )? ( END )? )
			// CAP.g:62:7: CLASS cname= IDENT (attr= attributesBlock )? ( END )?
			{
			match(input,CLASS,FOLLOW_CLASS_in_classDecl162); 
			cname=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDecl166); 
			// CAP.g:63:11: (attr= attributesBlock )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ATTRIBUTES) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// CAP.g:63:11: attr= attributesBlock
					{
					pushFollow(FOLLOW_attributesBlock_in_classDecl176);
					attributesBlock();
					state._fsp--;

					}
					break;

			}

			// CAP.g:64:7: ( END )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==END) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// CAP.g:64:7: END
					{
					match(input,END,FOLLOW_END_in_classDecl185); 
					}
					break;

			}


			        name = cname.getText();
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "classDecl"



	// $ANTLR start "attributesBlock"
	// CAP.g:74:1: attributesBlock : ATTRIBUTES ( attribute )* ;
	public final void attributesBlock() throws RecognitionException {
		try {
			// CAP.g:75:5: ( ATTRIBUTES ( attribute )* )
			// CAP.g:76:7: ATTRIBUTES ( attribute )*
			{
			match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_attributesBlock220); 
			// CAP.g:77:7: ( attribute )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==IDENT) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// CAP.g:77:7: attribute
					{
					pushFollow(FOLLOW_attribute_in_attributesBlock228);
					attribute();
					state._fsp--;

					}
					break;

				default :
					break loop4;
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
	}
	// $ANTLR end "attributesBlock"



	// $ANTLR start "attribute"
	// CAP.g:80:1: attribute : IDENT COLON IDENT ;
	public final void attribute() throws RecognitionException {
		try {
			// CAP.g:81:5: ( IDENT COLON IDENT )
			// CAP.g:82:7: IDENT COLON IDENT
			{
			match(input,IDENT,FOLLOW_IDENT_in_attribute252); 
			match(input,COLON,FOLLOW_COLON_in_attribute254); 
			match(input,IDENT,FOLLOW_IDENT_in_attribute256); 
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
	// $ANTLR end "attribute"



	// $ANTLR start "annotation"
	// CAP.g:89:1: annotation returns [ASTInterface n] : ( AT name= IDENT |name= IDENT ) LPAREN ( arguments[$n] )? RPAREN ;
	public final ASTInterface annotation() throws RecognitionException {
		ASTInterface n = null;


		Token name=null;


		    n = new ASTInterface();

		try {
			// CAP.g:93:5: ( ( AT name= IDENT |name= IDENT ) LPAREN ( arguments[$n] )? RPAREN )
			// CAP.g:94:7: ( AT name= IDENT |name= IDENT ) LPAREN ( arguments[$n] )? RPAREN
			{
			// CAP.g:94:7: ( AT name= IDENT |name= IDENT )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==AT) ) {
				alt5=1;
			}
			else if ( (LA5_0==IDENT) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// CAP.g:94:8: AT name= IDENT
					{
					match(input,AT,FOLLOW_AT_in_annotation292); 
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation296); 
					}
					break;
				case 2 :
					// CAP.g:94:24: name= IDENT
					{
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation302); 
					}
					break;

			}


			        n.name = name.getText();
			      
			match(input,LPAREN,FOLLOW_LPAREN_in_annotation319); 
			// CAP.g:99:9: ( arguments[$n] )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// CAP.g:99:9: arguments[$n]
					{
					pushFollow(FOLLOW_arguments_in_annotation329);
					arguments(n);
					state._fsp--;

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_annotation339); 
			}

		}
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



	// $ANTLR start "arguments"
	// CAP.g:107:1: arguments[ASTInterface ann] : argument[ann] ( COMMA argument[ann] )* ;
	public final void arguments(ASTInterface ann) throws RecognitionException {
		try {
			// CAP.g:108:5: ( argument[ann] ( COMMA argument[ann] )* )
			// CAP.g:109:7: argument[ann] ( COMMA argument[ann] )*
			{
			pushFollow(FOLLOW_argument_in_arguments366);
			argument(ann);
			state._fsp--;

			// CAP.g:109:21: ( COMMA argument[ann] )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// CAP.g:109:22: COMMA argument[ann]
					{
					match(input,COMMA,FOLLOW_COMMA_in_arguments370); 
					pushFollow(FOLLOW_argument_in_arguments372);
					argument(ann);
					state._fsp--;

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
	}
	// $ANTLR end "arguments"



	// $ANTLR start "argument"
	// CAP.g:112:1: argument[ASTInterface ann] : key= IDENT EQ v= value ;
	public final void argument(ASTInterface ann) throws RecognitionException {
		Token key=null;
		Object v =null;

		try {
			// CAP.g:113:5: (key= IDENT EQ v= value )
			// CAP.g:114:7: key= IDENT EQ v= value
			{
			key=(Token)match(input,IDENT,FOLLOW_IDENT_in_argument401); 
			match(input,EQ,FOLLOW_EQ_in_argument403); 
			pushFollow(FOLLOW_value_in_argument407);
			v=value();
			state._fsp--;


			        ann.args.put(key.getText(), v);
			      
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
	// $ANTLR end "argument"



	// $ANTLR start "value"
	// CAP.g:124:1: value returns [Object val] : (s= STRING |n= NUMBER |b= BOOLEAN |q= QUALIFIED_IDENT |i= IDENT |eq= EQ |a= annotation |arr= array );
	public final Object value() throws RecognitionException {
		Object val = null;


		Token s=null;
		Token n=null;
		Token b=null;
		Token q=null;
		Token i=null;
		Token eq=null;
		ASTInterface a =null;
		List<Object> arr =null;

		try {
			// CAP.g:125:5: (s= STRING |n= NUMBER |b= BOOLEAN |q= QUALIFIED_IDENT |i= IDENT |eq= EQ |a= annotation |arr= array )
			int alt8=8;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt8=1;
				}
				break;
			case NUMBER:
				{
				alt8=2;
				}
				break;
			case BOOLEAN:
				{
				alt8=3;
				}
				break;
			case QUALIFIED_IDENT:
				{
				alt8=4;
				}
				break;
			case IDENT:
				{
				int LA8_5 = input.LA(2);
				if ( (LA8_5==COMMA||(LA8_5 >= RBRACE && LA8_5 <= RPAREN)) ) {
					alt8=5;
				}
				else if ( (LA8_5==LPAREN) ) {
					alt8=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EQ:
				{
				alt8=6;
				}
				break;
			case AT:
				{
				alt8=7;
				}
				break;
			case LBRACE:
				{
				alt8=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// CAP.g:126:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_value447); 
					 val = stripQuotes(s.getText()); 
					}
					break;
				case 2 :
					// CAP.g:129:7: n= NUMBER
					{
					n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_value468); 

					            String txt = n.getText();
					            if (txt.contains(".")) {
					                val = Double.parseDouble(txt);
					            } else {
					                val = Integer.parseInt(txt);
					            }
					        
					}
					break;
				case 3 :
					// CAP.g:139:7: b= BOOLEAN
					{
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value489); 
					 val = Boolean.parseBoolean(b.getText()); 
					}
					break;
				case 4 :
					// CAP.g:142:7: q= QUALIFIED_IDENT
					{
					q=(Token)match(input,QUALIFIED_IDENT,FOLLOW_QUALIFIED_IDENT_in_value510); 
					 val = q.getText(); 
					}
					break;
				case 5 :
					// CAP.g:145:7: i= IDENT
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_value531); 
					 val = i.getText(); 
					}
					break;
				case 6 :
					// CAP.g:148:7: eq= EQ
					{
					eq=(Token)match(input,EQ,FOLLOW_EQ_in_value552); 
					 val = eq.getText(); 
					}
					break;
				case 7 :
					// CAP.g:151:7: a= annotation
					{
					pushFollow(FOLLOW_annotation_in_value573);
					a=annotation();
					state._fsp--;

					 val = a; 
					}
					break;
				case 8 :
					// CAP.g:154:7: arr= array
					{
					pushFollow(FOLLOW_array_in_value594);
					arr=array();
					state._fsp--;

					 val = arr; 
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
	// $ANTLR end "value"



	// $ANTLR start "array"
	// CAP.g:162:1: array returns [List<Object> list] : LBRACE v= value ( COMMA v= value )* RBRACE ;
	public final List<Object> array() throws RecognitionException {
		List<Object> list = null;


		Object v =null;

		 list = new ArrayList<Object>(); 
		try {
			// CAP.g:164:5: ( LBRACE v= value ( COMMA v= value )* RBRACE )
			// CAP.g:165:7: LBRACE v= value ( COMMA v= value )* RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_array639); 
			pushFollow(FOLLOW_value_in_array651);
			v=value();
			state._fsp--;

			 list.add(v); 
			// CAP.g:167:9: ( COMMA v= value )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// CAP.g:167:10: COMMA v= value
					{
					match(input,COMMA,FOLLOW_COMMA_in_array664); 
					pushFollow(FOLLOW_value_in_array668);
					v=value();
					state._fsp--;

					 list.add(v); 
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_array680); 
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
	// $ANTLR end "array"

	// Delegated rules



	public static final BitSet FOLLOW_annotation_in_annotationFile55 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_contextBlock_in_annotationFile65 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_annotationFile74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDecl_in_contextBlock119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classDecl162 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENT_in_classDecl166 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_attributesBlock_in_classDecl176 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_END_in_classDecl185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATTRIBUTES_in_attributesBlock220 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_attribute_in_attributesBlock228 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_IDENT_in_attribute252 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_attribute254 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENT_in_attribute256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_annotation292 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENT_in_annotation296 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_annotation302 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_LPAREN_in_annotation319 = new BitSet(new long[]{0x0000000000041000L});
	public static final BitSet FOLLOW_arguments_in_annotation329 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_annotation339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_arguments366 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_arguments370 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_argument_in_arguments372 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_IDENT_in_argument401 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_argument403 = new BitSet(new long[]{0x000000000009B850L});
	public static final BitSet FOLLOW_value_in_argument407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_value468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUALIFIED_IDENT_in_value510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_value531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_value552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_value573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_value594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_array639 = new BitSet(new long[]{0x000000000009B850L});
	public static final BitSet FOLLOW_value_in_array651 = new BitSet(new long[]{0x0000000000020200L});
	public static final BitSet FOLLOW_COMMA_in_array664 = new BitSet(new long[]{0x000000000009B850L});
	public static final BitSet FOLLOW_value_in_array668 = new BitSet(new long[]{0x0000000000020200L});
	public static final BitSet FOLLOW_RBRACE_in_array680 = new BitSet(new long[]{0x0000000000000002L});
}
