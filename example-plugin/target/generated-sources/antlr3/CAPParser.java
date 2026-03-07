// $ANTLR 3.5.2 CAP.g 2026-03-07 22:15:57

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "COMMA", "EQ", "IDENT", 
		"LBRACE", "LPAREN", "NUMBER", "QUALIFIED_IDENT", "RBRACE", "RPAREN", "STRING", 
		"WS"
	};
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
	// CAP.g:26:1: annotationFile returns [ASTInterface ann] : a= annotation EOF ;
	public final ASTInterface annotationFile() throws RecognitionException {
		ASTInterface ann = null;


		ASTInterface a =null;

		 ann = null; 
		try {
			// CAP.g:28:5: (a= annotation EOF )
			// CAP.g:29:7: a= annotation EOF
			{
			pushFollow(FOLLOW_annotation_in_annotationFile55);
			a=annotation();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_annotationFile57); 
			 ann = a; 
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



	// $ANTLR start "annotation"
	// CAP.g:37:1: annotation returns [ASTInterface n] : ( AT name= IDENT |name= IDENT ) LPAREN ( arguments[$n] )? RPAREN ;
	public final ASTInterface annotation() throws RecognitionException {
		ASTInterface n = null;


		Token name=null;


		    n = new ASTInterface(); // <-- MUST be concrete class

		try {
			// CAP.g:41:5: ( ( AT name= IDENT |name= IDENT ) LPAREN ( arguments[$n] )? RPAREN )
			// CAP.g:42:7: ( AT name= IDENT |name= IDENT ) LPAREN ( arguments[$n] )? RPAREN
			{
			// CAP.g:42:7: ( AT name= IDENT |name= IDENT )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==AT) ) {
				alt1=1;
			}
			else if ( (LA1_0==IDENT) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// CAP.g:42:8: AT name= IDENT
					{
					match(input,AT,FOLLOW_AT_in_annotation101); 
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation105); 
					}
					break;
				case 2 :
					// CAP.g:42:24: name= IDENT
					{
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation111); 
					}
					break;

			}


			        n.name = name.getText();
			      
			match(input,LPAREN,FOLLOW_LPAREN_in_annotation128); 
			// CAP.g:47:9: ( arguments[$n] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==IDENT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// CAP.g:47:9: arguments[$n]
					{
					pushFollow(FOLLOW_arguments_in_annotation138);
					arguments(n);
					state._fsp--;

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_annotation148); 
			}

		}
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
	// CAP.g:55:1: arguments[ASTInterface ann] : argument[ann] ( COMMA argument[ann] )* ;
	public final void arguments(ASTInterface ann) throws RecognitionException {
		try {
			// CAP.g:56:5: ( argument[ann] ( COMMA argument[ann] )* )
			// CAP.g:57:7: argument[ann] ( COMMA argument[ann] )*
			{
			pushFollow(FOLLOW_argument_in_arguments175);
			argument(ann);
			state._fsp--;

			// CAP.g:57:21: ( COMMA argument[ann] )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// CAP.g:57:22: COMMA argument[ann]
					{
					match(input,COMMA,FOLLOW_COMMA_in_arguments179); 
					pushFollow(FOLLOW_argument_in_arguments181);
					argument(ann);
					state._fsp--;

					}
					break;

				default :
					break loop3;
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
	// CAP.g:60:1: argument[ASTInterface ann] : key= IDENT EQ v= value ;
	public final void argument(ASTInterface ann) throws RecognitionException {
		Token key=null;
		Object v =null;

		try {
			// CAP.g:61:5: (key= IDENT EQ v= value )
			// CAP.g:62:7: key= IDENT EQ v= value
			{
			key=(Token)match(input,IDENT,FOLLOW_IDENT_in_argument210); 
			match(input,EQ,FOLLOW_EQ_in_argument212); 
			pushFollow(FOLLOW_value_in_argument216);
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
	// CAP.g:72:1: value returns [Object val] : (s= STRING |n= NUMBER |q= QUALIFIED_IDENT |i= IDENT |a= annotation |arr= array );
	public final Object value() throws RecognitionException {
		Object val = null;


		Token s=null;
		Token n=null;
		Token q=null;
		Token i=null;
		ASTInterface a =null;
		List<Object> arr =null;

		try {
			// CAP.g:73:5: (s= STRING |n= NUMBER |q= QUALIFIED_IDENT |i= IDENT |a= annotation |arr= array )
			int alt4=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt4=1;
				}
				break;
			case NUMBER:
				{
				alt4=2;
				}
				break;
			case QUALIFIED_IDENT:
				{
				alt4=3;
				}
				break;
			case IDENT:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==COMMA||(LA4_4 >= RBRACE && LA4_4 <= RPAREN)) ) {
					alt4=4;
				}
				else if ( (LA4_4==LPAREN) ) {
					alt4=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				alt4=5;
				}
				break;
			case LBRACE:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// CAP.g:74:7: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_value256); 
					 val = stripQuotes(s.getText()); 
					}
					break;
				case 2 :
					// CAP.g:76:7: n= NUMBER
					{
					n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_value276); 

					        String txt = n.getText();
					        if (txt.contains(".")) {
					            val = Double.parseDouble(txt);
					        } else {
					            val = Integer.parseInt(txt);
					        }
					    
					}
					break;
				case 3 :
					// CAP.g:84:7: q= QUALIFIED_IDENT
					{
					q=(Token)match(input,QUALIFIED_IDENT,FOLLOW_QUALIFIED_IDENT_in_value288); 
					 val = q.getText(); 
					}
					break;
				case 4 :
					// CAP.g:86:7: i= IDENT
					{
					i=(Token)match(input,IDENT,FOLLOW_IDENT_in_value308); 
					 val = i.getText(); 
					}
					break;
				case 5 :
					// CAP.g:88:7: a= annotation
					{
					pushFollow(FOLLOW_annotation_in_value328);
					a=annotation();
					state._fsp--;

					 val = a; 
					}
					break;
				case 6 :
					// CAP.g:90:7: arr= array
					{
					pushFollow(FOLLOW_array_in_value348);
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
	// CAP.g:98:1: array returns [List<Object> list] : LBRACE v= value ( COMMA v= value )* RBRACE ;
	public final List<Object> array() throws RecognitionException {
		List<Object> list = null;


		Object v =null;

		 list = new ArrayList<Object>(); 
		try {
			// CAP.g:100:5: ( LBRACE v= value ( COMMA v= value )* RBRACE )
			// CAP.g:101:7: LBRACE v= value ( COMMA v= value )* RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_array393); 
			pushFollow(FOLLOW_value_in_array405);
			v=value();
			state._fsp--;

			 list.add(v); 
			// CAP.g:103:9: ( COMMA v= value )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// CAP.g:103:10: COMMA v= value
					{
					match(input,COMMA,FOLLOW_COMMA_in_array418); 
					pushFollow(FOLLOW_value_in_array422);
					v=value();
					state._fsp--;

					 list.add(v); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_array434); 
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



	public static final BitSet FOLLOW_annotation_in_annotationFile55 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_annotationFile57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_annotation101 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_IDENT_in_annotation105 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_annotation111 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_LPAREN_in_annotation128 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_arguments_in_annotation138 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_annotation148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_arguments175 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_arguments179 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_argument_in_arguments181 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_IDENT_in_argument210 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_EQ_in_argument212 = new BitSet(new long[]{0x0000000000004D90L});
	public static final BitSet FOLLOW_value_in_argument216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_value276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUALIFIED_IDENT_in_value288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_value308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_value328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_value348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_array393 = new BitSet(new long[]{0x0000000000004D90L});
	public static final BitSet FOLLOW_value_in_array405 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_COMMA_in_array418 = new BitSet(new long[]{0x0000000000004D90L});
	public static final BitSet FOLLOW_value_in_array422 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_RBRACE_in_array434 = new BitSet(new long[]{0x0000000000000002L});
}
