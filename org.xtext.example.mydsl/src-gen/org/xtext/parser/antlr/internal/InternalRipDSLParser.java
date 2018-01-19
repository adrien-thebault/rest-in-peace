package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.RipDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRipDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'host'", "':'", "'port'", "'commands'", "'method'", "'path'", "'entryFormats'", "'-'", "'outputFormats'", "'description'", "'parameters'", "'response'", "'name'", "'type'", "'PUT'", "'POST'", "'DELETE'", "'GET'", "'PATCH'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRipDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRipDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRipDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRipDSL.g"; }



     	private RipDSLGrammarAccess grammarAccess;

        public InternalRipDSLParser(TokenStream input, RipDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "APIRest";
       	}

       	@Override
       	protected RipDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAPIRest"
    // InternalRipDSL.g:65:1: entryRuleAPIRest returns [EObject current=null] : iv_ruleAPIRest= ruleAPIRest EOF ;
    public final EObject entryRuleAPIRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPIRest = null;


        try {
            // InternalRipDSL.g:65:48: (iv_ruleAPIRest= ruleAPIRest EOF )
            // InternalRipDSL.g:66:2: iv_ruleAPIRest= ruleAPIRest EOF
            {
             newCompositeNode(grammarAccess.getAPIRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAPIRest=ruleAPIRest();

            state._fsp--;

             current =iv_ruleAPIRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPIRest"


    // $ANTLR start "ruleAPIRest"
    // InternalRipDSL.g:72:1: ruleAPIRest returns [EObject current=null] : ( () otherlv_1= 'host' otherlv_2= ':' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= ':' ( (lv_port_6_0= ruleEInt ) ) otherlv_7= 'commands' otherlv_8= ':' ( (lv_commands_9_0= ruleCommandRest ) )+ ) ;
    public final EObject ruleAPIRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_host_3_0 = null;

        AntlrDatatypeRuleToken lv_port_6_0 = null;

        EObject lv_commands_9_0 = null;



        	enterRule();

        try {
            // InternalRipDSL.g:78:2: ( ( () otherlv_1= 'host' otherlv_2= ':' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= ':' ( (lv_port_6_0= ruleEInt ) ) otherlv_7= 'commands' otherlv_8= ':' ( (lv_commands_9_0= ruleCommandRest ) )+ ) )
            // InternalRipDSL.g:79:2: ( () otherlv_1= 'host' otherlv_2= ':' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= ':' ( (lv_port_6_0= ruleEInt ) ) otherlv_7= 'commands' otherlv_8= ':' ( (lv_commands_9_0= ruleCommandRest ) )+ )
            {
            // InternalRipDSL.g:79:2: ( () otherlv_1= 'host' otherlv_2= ':' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= ':' ( (lv_port_6_0= ruleEInt ) ) otherlv_7= 'commands' otherlv_8= ':' ( (lv_commands_9_0= ruleCommandRest ) )+ )
            // InternalRipDSL.g:80:3: () otherlv_1= 'host' otherlv_2= ':' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= ':' ( (lv_port_6_0= ruleEInt ) ) otherlv_7= 'commands' otherlv_8= ':' ( (lv_commands_9_0= ruleCommandRest ) )+
            {
            // InternalRipDSL.g:80:3: ()
            // InternalRipDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAPIRestAccess().getAPIRestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAPIRestAccess().getHostKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAPIRestAccess().getColonKeyword_2());
            		
            // InternalRipDSL.g:95:3: ( (lv_host_3_0= ruleEString ) )
            // InternalRipDSL.g:96:4: (lv_host_3_0= ruleEString )
            {
            // InternalRipDSL.g:96:4: (lv_host_3_0= ruleEString )
            // InternalRipDSL.g:97:5: lv_host_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAPIRestAccess().getHostEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_host_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAPIRestRule());
            					}
            					set(
            						current,
            						"host",
            						lv_host_3_0,
            						"org.xtext.RipDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAPIRestAccess().getPortKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAPIRestAccess().getColonKeyword_5());
            		
            // InternalRipDSL.g:122:3: ( (lv_port_6_0= ruleEInt ) )
            // InternalRipDSL.g:123:4: (lv_port_6_0= ruleEInt )
            {
            // InternalRipDSL.g:123:4: (lv_port_6_0= ruleEInt )
            // InternalRipDSL.g:124:5: lv_port_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAPIRestAccess().getPortEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_port_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAPIRestRule());
            					}
            					set(
            						current,
            						"port",
            						lv_port_6_0,
            						"org.xtext.RipDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAPIRestAccess().getCommandsKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getAPIRestAccess().getColonKeyword_8());
            		
            // InternalRipDSL.g:149:3: ( (lv_commands_9_0= ruleCommandRest ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRipDSL.g:150:4: (lv_commands_9_0= ruleCommandRest )
            	    {
            	    // InternalRipDSL.g:150:4: (lv_commands_9_0= ruleCommandRest )
            	    // InternalRipDSL.g:151:5: lv_commands_9_0= ruleCommandRest
            	    {

            	    					newCompositeNode(grammarAccess.getAPIRestAccess().getCommandsCommandRestParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_commands_9_0=ruleCommandRest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAPIRestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_9_0,
            	    						"org.xtext.RipDSL.CommandRest");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAPIRest"


    // $ANTLR start "entryRuleCommandRest"
    // InternalRipDSL.g:172:1: entryRuleCommandRest returns [EObject current=null] : iv_ruleCommandRest= ruleCommandRest EOF ;
    public final EObject entryRuleCommandRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandRest = null;


        try {
            // InternalRipDSL.g:172:52: (iv_ruleCommandRest= ruleCommandRest EOF )
            // InternalRipDSL.g:173:2: iv_ruleCommandRest= ruleCommandRest EOF
            {
             newCompositeNode(grammarAccess.getCommandRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandRest=ruleCommandRest();

            state._fsp--;

             current =iv_ruleCommandRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandRest"


    // $ANTLR start "ruleCommandRest"
    // InternalRipDSL.g:179:1: ruleCommandRest returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'method' otherlv_3= ':' ( (lv_method_4_0= ruleMethod ) ) otherlv_5= 'path' otherlv_6= ':' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'entryFormats' otherlv_9= ':' otherlv_10= '-' ( (lv_entryFormats_11_0= ruleEString ) ) (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )* )? (otherlv_14= 'outputFormats' otherlv_15= ':' otherlv_16= '-' ( (lv_outputFormats_17_0= ruleEString ) ) (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )* )? (otherlv_20= 'description' otherlv_21= ':' ( (lv_description_22_0= ruleEString ) ) )? (otherlv_23= 'parameters' otherlv_24= ':' otherlv_25= '-' ( (lv_parameters_26_0= ruleParameter ) ) (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )* )? (otherlv_29= 'response' otherlv_30= ':' otherlv_31= '-' ( (lv_response_32_0= ruleResponse ) ) (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )* )? ) ;
    public final EObject ruleCommandRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_method_4_0 = null;

        AntlrDatatypeRuleToken lv_path_7_0 = null;

        AntlrDatatypeRuleToken lv_entryFormats_11_0 = null;

        AntlrDatatypeRuleToken lv_entryFormats_13_0 = null;

        AntlrDatatypeRuleToken lv_outputFormats_17_0 = null;

        AntlrDatatypeRuleToken lv_outputFormats_19_0 = null;

        AntlrDatatypeRuleToken lv_description_22_0 = null;

        EObject lv_parameters_26_0 = null;

        EObject lv_parameters_28_0 = null;

        EObject lv_response_32_0 = null;

        EObject lv_response_34_0 = null;



        	enterRule();

        try {
            // InternalRipDSL.g:185:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'method' otherlv_3= ':' ( (lv_method_4_0= ruleMethod ) ) otherlv_5= 'path' otherlv_6= ':' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'entryFormats' otherlv_9= ':' otherlv_10= '-' ( (lv_entryFormats_11_0= ruleEString ) ) (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )* )? (otherlv_14= 'outputFormats' otherlv_15= ':' otherlv_16= '-' ( (lv_outputFormats_17_0= ruleEString ) ) (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )* )? (otherlv_20= 'description' otherlv_21= ':' ( (lv_description_22_0= ruleEString ) ) )? (otherlv_23= 'parameters' otherlv_24= ':' otherlv_25= '-' ( (lv_parameters_26_0= ruleParameter ) ) (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )* )? (otherlv_29= 'response' otherlv_30= ':' otherlv_31= '-' ( (lv_response_32_0= ruleResponse ) ) (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )* )? ) )
            // InternalRipDSL.g:186:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'method' otherlv_3= ':' ( (lv_method_4_0= ruleMethod ) ) otherlv_5= 'path' otherlv_6= ':' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'entryFormats' otherlv_9= ':' otherlv_10= '-' ( (lv_entryFormats_11_0= ruleEString ) ) (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )* )? (otherlv_14= 'outputFormats' otherlv_15= ':' otherlv_16= '-' ( (lv_outputFormats_17_0= ruleEString ) ) (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )* )? (otherlv_20= 'description' otherlv_21= ':' ( (lv_description_22_0= ruleEString ) ) )? (otherlv_23= 'parameters' otherlv_24= ':' otherlv_25= '-' ( (lv_parameters_26_0= ruleParameter ) ) (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )* )? (otherlv_29= 'response' otherlv_30= ':' otherlv_31= '-' ( (lv_response_32_0= ruleResponse ) ) (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )* )? )
            {
            // InternalRipDSL.g:186:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'method' otherlv_3= ':' ( (lv_method_4_0= ruleMethod ) ) otherlv_5= 'path' otherlv_6= ':' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'entryFormats' otherlv_9= ':' otherlv_10= '-' ( (lv_entryFormats_11_0= ruleEString ) ) (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )* )? (otherlv_14= 'outputFormats' otherlv_15= ':' otherlv_16= '-' ( (lv_outputFormats_17_0= ruleEString ) ) (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )* )? (otherlv_20= 'description' otherlv_21= ':' ( (lv_description_22_0= ruleEString ) ) )? (otherlv_23= 'parameters' otherlv_24= ':' otherlv_25= '-' ( (lv_parameters_26_0= ruleParameter ) ) (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )* )? (otherlv_29= 'response' otherlv_30= ':' otherlv_31= '-' ( (lv_response_32_0= ruleResponse ) ) (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )* )? )
            // InternalRipDSL.g:187:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'method' otherlv_3= ':' ( (lv_method_4_0= ruleMethod ) ) otherlv_5= 'path' otherlv_6= ':' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'entryFormats' otherlv_9= ':' otherlv_10= '-' ( (lv_entryFormats_11_0= ruleEString ) ) (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )* )? (otherlv_14= 'outputFormats' otherlv_15= ':' otherlv_16= '-' ( (lv_outputFormats_17_0= ruleEString ) ) (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )* )? (otherlv_20= 'description' otherlv_21= ':' ( (lv_description_22_0= ruleEString ) ) )? (otherlv_23= 'parameters' otherlv_24= ':' otherlv_25= '-' ( (lv_parameters_26_0= ruleParameter ) ) (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )* )? (otherlv_29= 'response' otherlv_30= ':' otherlv_31= '-' ( (lv_response_32_0= ruleResponse ) ) (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )* )?
            {
            // InternalRipDSL.g:187:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRipDSL.g:188:4: (lv_name_0_0= ruleEString )
            {
            // InternalRipDSL.g:188:4: (lv_name_0_0= ruleEString )
            // InternalRipDSL.g:189:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommandRestAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRestRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.RipDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandRestAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandRestAccess().getMethodKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandRestAccess().getColonKeyword_3());
            		
            // InternalRipDSL.g:218:3: ( (lv_method_4_0= ruleMethod ) )
            // InternalRipDSL.g:219:4: (lv_method_4_0= ruleMethod )
            {
            // InternalRipDSL.g:219:4: (lv_method_4_0= ruleMethod )
            // InternalRipDSL.g:220:5: lv_method_4_0= ruleMethod
            {

            					newCompositeNode(grammarAccess.getCommandRestAccess().getMethodMethodEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_method_4_0=ruleMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRestRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_4_0,
            						"org.xtext.RipDSL.Method");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCommandRestAccess().getPathKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandRestAccess().getColonKeyword_6());
            		
            // InternalRipDSL.g:245:3: ( (lv_path_7_0= ruleEString ) )
            // InternalRipDSL.g:246:4: (lv_path_7_0= ruleEString )
            {
            // InternalRipDSL.g:246:4: (lv_path_7_0= ruleEString )
            // InternalRipDSL.g:247:5: lv_path_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommandRestAccess().getPathEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_path_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRestRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_7_0,
            						"org.xtext.RipDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRipDSL.g:264:3: (otherlv_8= 'entryFormats' otherlv_9= ':' otherlv_10= '-' ( (lv_entryFormats_11_0= ruleEString ) ) (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRipDSL.g:265:4: otherlv_8= 'entryFormats' otherlv_9= ':' otherlv_10= '-' ( (lv_entryFormats_11_0= ruleEString ) ) (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCommandRestAccess().getEntryFormatsKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommandRestAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_8_2());
                    			
                    // InternalRipDSL.g:277:4: ( (lv_entryFormats_11_0= ruleEString ) )
                    // InternalRipDSL.g:278:5: (lv_entryFormats_11_0= ruleEString )
                    {
                    // InternalRipDSL.g:278:5: (lv_entryFormats_11_0= ruleEString )
                    // InternalRipDSL.g:279:6: lv_entryFormats_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandRestAccess().getEntryFormatsEStringParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_entryFormats_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    						}
                    						add(
                    							current,
                    							"entryFormats",
                    							lv_entryFormats_11_0,
                    							"org.xtext.RipDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRipDSL.g:296:4: (otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRipDSL.g:297:5: otherlv_12= '-' ( (lv_entryFormats_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_8_4_0());
                    	    				
                    	    // InternalRipDSL.g:301:5: ( (lv_entryFormats_13_0= ruleEString ) )
                    	    // InternalRipDSL.g:302:6: (lv_entryFormats_13_0= ruleEString )
                    	    {
                    	    // InternalRipDSL.g:302:6: (lv_entryFormats_13_0= ruleEString )
                    	    // InternalRipDSL.g:303:7: lv_entryFormats_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandRestAccess().getEntryFormatsEStringParserRuleCall_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_entryFormats_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entryFormats",
                    	    								lv_entryFormats_13_0,
                    	    								"org.xtext.RipDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRipDSL.g:322:3: (otherlv_14= 'outputFormats' otherlv_15= ':' otherlv_16= '-' ( (lv_outputFormats_17_0= ruleEString ) ) (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRipDSL.g:323:4: otherlv_14= 'outputFormats' otherlv_15= ':' otherlv_16= '-' ( (lv_outputFormats_17_0= ruleEString ) ) (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )*
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommandRestAccess().getOutputFormatsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getCommandRestAccess().getColonKeyword_9_1());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_9_2());
                    			
                    // InternalRipDSL.g:335:4: ( (lv_outputFormats_17_0= ruleEString ) )
                    // InternalRipDSL.g:336:5: (lv_outputFormats_17_0= ruleEString )
                    {
                    // InternalRipDSL.g:336:5: (lv_outputFormats_17_0= ruleEString )
                    // InternalRipDSL.g:337:6: lv_outputFormats_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandRestAccess().getOutputFormatsEStringParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_outputFormats_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    						}
                    						add(
                    							current,
                    							"outputFormats",
                    							lv_outputFormats_17_0,
                    							"org.xtext.RipDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRipDSL.g:354:4: (otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRipDSL.g:355:5: otherlv_18= '-' ( (lv_outputFormats_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_9_4_0());
                    	    				
                    	    // InternalRipDSL.g:359:5: ( (lv_outputFormats_19_0= ruleEString ) )
                    	    // InternalRipDSL.g:360:6: (lv_outputFormats_19_0= ruleEString )
                    	    {
                    	    // InternalRipDSL.g:360:6: (lv_outputFormats_19_0= ruleEString )
                    	    // InternalRipDSL.g:361:7: lv_outputFormats_19_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandRestAccess().getOutputFormatsEStringParserRuleCall_9_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_outputFormats_19_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputFormats",
                    	    								lv_outputFormats_19_0,
                    	    								"org.xtext.RipDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRipDSL.g:380:3: (otherlv_20= 'description' otherlv_21= ':' ( (lv_description_22_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRipDSL.g:381:4: otherlv_20= 'description' otherlv_21= ':' ( (lv_description_22_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getCommandRestAccess().getDescriptionKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getCommandRestAccess().getColonKeyword_10_1());
                    			
                    // InternalRipDSL.g:389:4: ( (lv_description_22_0= ruleEString ) )
                    // InternalRipDSL.g:390:5: (lv_description_22_0= ruleEString )
                    {
                    // InternalRipDSL.g:390:5: (lv_description_22_0= ruleEString )
                    // InternalRipDSL.g:391:6: lv_description_22_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandRestAccess().getDescriptionEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_22_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_22_0,
                    							"org.xtext.RipDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRipDSL.g:409:3: (otherlv_23= 'parameters' otherlv_24= ':' otherlv_25= '-' ( (lv_parameters_26_0= ruleParameter ) ) (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRipDSL.g:410:4: otherlv_23= 'parameters' otherlv_24= ':' otherlv_25= '-' ( (lv_parameters_26_0= ruleParameter ) ) (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )*
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getCommandRestAccess().getParametersKeyword_11_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_24, grammarAccess.getCommandRestAccess().getColonKeyword_11_1());
                    			
                    otherlv_25=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_25, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_11_2());
                    			
                    // InternalRipDSL.g:422:4: ( (lv_parameters_26_0= ruleParameter ) )
                    // InternalRipDSL.g:423:5: (lv_parameters_26_0= ruleParameter )
                    {
                    // InternalRipDSL.g:423:5: (lv_parameters_26_0= ruleParameter )
                    // InternalRipDSL.g:424:6: lv_parameters_26_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getCommandRestAccess().getParametersParameterParserRuleCall_11_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_26_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_26_0,
                    							"org.xtext.RipDSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRipDSL.g:441:4: (otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRipDSL.g:442:5: otherlv_27= '-' ( (lv_parameters_28_0= ruleParameter ) )
                    	    {
                    	    otherlv_27=(Token)match(input,18,FOLLOW_17); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_11_4_0());
                    	    				
                    	    // InternalRipDSL.g:446:5: ( (lv_parameters_28_0= ruleParameter ) )
                    	    // InternalRipDSL.g:447:6: (lv_parameters_28_0= ruleParameter )
                    	    {
                    	    // InternalRipDSL.g:447:6: (lv_parameters_28_0= ruleParameter )
                    	    // InternalRipDSL.g:448:7: lv_parameters_28_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandRestAccess().getParametersParameterParserRuleCall_11_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_28_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_28_0,
                    	    								"org.xtext.RipDSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRipDSL.g:467:3: (otherlv_29= 'response' otherlv_30= ':' otherlv_31= '-' ( (lv_response_32_0= ruleResponse ) ) (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRipDSL.g:468:4: otherlv_29= 'response' otherlv_30= ':' otherlv_31= '-' ( (lv_response_32_0= ruleResponse ) ) (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )*
                    {
                    otherlv_29=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getCommandRestAccess().getResponseKeyword_12_0());
                    			
                    otherlv_30=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_30, grammarAccess.getCommandRestAccess().getColonKeyword_12_1());
                    			
                    otherlv_31=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_31, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_12_2());
                    			
                    // InternalRipDSL.g:480:4: ( (lv_response_32_0= ruleResponse ) )
                    // InternalRipDSL.g:481:5: (lv_response_32_0= ruleResponse )
                    {
                    // InternalRipDSL.g:481:5: (lv_response_32_0= ruleResponse )
                    // InternalRipDSL.g:482:6: lv_response_32_0= ruleResponse
                    {

                    						newCompositeNode(grammarAccess.getCommandRestAccess().getResponseResponseParserRuleCall_12_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_response_32_0=ruleResponse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    						}
                    						add(
                    							current,
                    							"response",
                    							lv_response_32_0,
                    							"org.xtext.RipDSL.Response");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRipDSL.g:499:4: (otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRipDSL.g:500:5: otherlv_33= '-' ( (lv_response_34_0= ruleResponse ) )
                    	    {
                    	    otherlv_33=(Token)match(input,18,FOLLOW_6); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_12_4_0());
                    	    				
                    	    // InternalRipDSL.g:504:5: ( (lv_response_34_0= ruleResponse ) )
                    	    // InternalRipDSL.g:505:6: (lv_response_34_0= ruleResponse )
                    	    {
                    	    // InternalRipDSL.g:505:6: (lv_response_34_0= ruleResponse )
                    	    // InternalRipDSL.g:506:7: lv_response_34_0= ruleResponse
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandRestAccess().getResponseResponseParserRuleCall_12_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_response_34_0=ruleResponse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandRestRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"response",
                    	    								lv_response_34_0,
                    	    								"org.xtext.RipDSL.Response");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandRest"


    // $ANTLR start "entryRuleEString"
    // InternalRipDSL.g:529:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRipDSL.g:529:47: (iv_ruleEString= ruleEString EOF )
            // InternalRipDSL.g:530:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRipDSL.g:536:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRipDSL.g:542:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRipDSL.g:543:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRipDSL.g:543:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRipDSL.g:544:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRipDSL.g:552:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalRipDSL.g:563:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRipDSL.g:563:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRipDSL.g:564:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRipDSL.g:570:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRipDSL.g:576:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRipDSL.g:577:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRipDSL.g:577:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRipDSL.g:578:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRipDSL.g:578:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRipDSL.g:579:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleParameter"
    // InternalRipDSL.g:596:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRipDSL.g:596:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRipDSL.g:597:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRipDSL.g:603:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= ':' ( (lv_comment_8_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;



        	enterRule();

        try {
            // InternalRipDSL.g:609:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= ':' ( (lv_comment_8_0= ruleEString ) ) )? ) )
            // InternalRipDSL.g:610:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= ':' ( (lv_comment_8_0= ruleEString ) ) )? )
            {
            // InternalRipDSL.g:610:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= ':' ( (lv_comment_8_0= ruleEString ) ) )? )
            // InternalRipDSL.g:611:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= ':' ( (lv_comment_8_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalRipDSL.g:619:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRipDSL.g:620:4: (lv_name_2_0= ruleEString )
            {
            // InternalRipDSL.g:620:4: (lv_name_2_0= ruleEString )
            // InternalRipDSL.g:621:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.RipDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_4());
            		
            // InternalRipDSL.g:646:3: ( (lv_type_5_0= ruleEString ) )
            // InternalRipDSL.g:647:4: (lv_type_5_0= ruleEString )
            {
            // InternalRipDSL.g:647:4: (lv_type_5_0= ruleEString )
            // InternalRipDSL.g:648:5: lv_type_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.RipDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRipDSL.g:665:3: (otherlv_6= 'description' otherlv_7= ':' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRipDSL.g:666:4: otherlv_6= 'description' otherlv_7= ':' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getColonKeyword_6_1());
                    			
                    // InternalRipDSL.g:674:4: ( (lv_comment_8_0= ruleEString ) )
                    // InternalRipDSL.g:675:5: (lv_comment_8_0= ruleEString )
                    {
                    // InternalRipDSL.g:675:5: (lv_comment_8_0= ruleEString )
                    // InternalRipDSL.g:676:6: lv_comment_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"comment",
                    							lv_comment_8_0,
                    							"org.xtext.RipDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleResponse"
    // InternalRipDSL.g:698:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalRipDSL.g:698:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalRipDSL.g:699:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalRipDSL.g:705:1: ruleResponse returns [EObject current=null] : ( ( (lv_code_0_0= ruleEInt ) ) otherlv_1= ':' (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_0_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalRipDSL.g:711:2: ( ( ( (lv_code_0_0= ruleEInt ) ) otherlv_1= ':' (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? ) )
            // InternalRipDSL.g:712:2: ( ( (lv_code_0_0= ruleEInt ) ) otherlv_1= ':' (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? )
            {
            // InternalRipDSL.g:712:2: ( ( (lv_code_0_0= ruleEInt ) ) otherlv_1= ':' (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? )
            // InternalRipDSL.g:713:3: ( (lv_code_0_0= ruleEInt ) ) otherlv_1= ':' (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )?
            {
            // InternalRipDSL.g:713:3: ( (lv_code_0_0= ruleEInt ) )
            // InternalRipDSL.g:714:4: (lv_code_0_0= ruleEInt )
            {
            // InternalRipDSL.g:714:4: (lv_code_0_0= ruleEInt )
            // InternalRipDSL.g:715:5: lv_code_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getCodeEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_code_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_0_0,
            						"org.xtext.RipDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getColonKeyword_1());
            		
            // InternalRipDSL.g:736:3: (otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRipDSL.g:737:4: otherlv_2= 'description' otherlv_3= ':' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getDescriptionKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getResponseAccess().getColonKeyword_2_1());
                    			
                    // InternalRipDSL.g:745:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalRipDSL.g:746:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalRipDSL.g:746:5: (lv_description_4_0= ruleEString )
                    // InternalRipDSL.g:747:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResponseAccess().getDescriptionEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResponseRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.xtext.RipDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "ruleMethod"
    // InternalRipDSL.g:769:1: ruleMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'DELETE' ) | (enumLiteral_3= 'GET' ) | (enumLiteral_4= 'PATCH' ) ) ;
    public final Enumerator ruleMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRipDSL.g:775:2: ( ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'DELETE' ) | (enumLiteral_3= 'GET' ) | (enumLiteral_4= 'PATCH' ) ) )
            // InternalRipDSL.g:776:2: ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'DELETE' ) | (enumLiteral_3= 'GET' ) | (enumLiteral_4= 'PATCH' ) )
            {
            // InternalRipDSL.g:776:2: ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'DELETE' ) | (enumLiteral_3= 'GET' ) | (enumLiteral_4= 'PATCH' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            case 29:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRipDSL.g:777:3: (enumLiteral_0= 'PUT' )
                    {
                    // InternalRipDSL.g:777:3: (enumLiteral_0= 'PUT' )
                    // InternalRipDSL.g:778:4: enumLiteral_0= 'PUT'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRipDSL.g:785:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalRipDSL.g:785:3: (enumLiteral_1= 'POST' )
                    // InternalRipDSL.g:786:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRipDSL.g:793:3: (enumLiteral_2= 'DELETE' )
                    {
                    // InternalRipDSL.g:793:3: (enumLiteral_2= 'DELETE' )
                    // InternalRipDSL.g:794:4: enumLiteral_2= 'DELETE'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRipDSL.g:801:3: (enumLiteral_3= 'GET' )
                    {
                    // InternalRipDSL.g:801:3: (enumLiteral_3= 'GET' )
                    // InternalRipDSL.g:802:4: enumLiteral_3= 'GET'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRipDSL.g:809:3: (enumLiteral_4= 'PATCH' )
                    {
                    // InternalRipDSL.g:809:3: (enumLiteral_4= 'PATCH' )
                    // InternalRipDSL.g:810:4: enumLiteral_4= 'PATCH'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPATCHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMethodAccess().getPATCHEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007A0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000007C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000740002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100002L});

}