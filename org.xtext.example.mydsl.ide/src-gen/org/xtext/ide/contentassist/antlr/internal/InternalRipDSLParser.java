package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.RipDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRipDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PUT'", "'POST'", "'DELETE'", "'GET'", "'PATCH'", "'host'", "':'", "'port'", "'commands'", "'method'", "'path'", "'entryFormats'", "'-'", "'outputFormats'", "'description'", "'parameters'", "'response'", "'name'", "'type'"
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

    	public void setGrammarAccess(RipDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAPIRest"
    // InternalRipDSL.g:53:1: entryRuleAPIRest : ruleAPIRest EOF ;
    public final void entryRuleAPIRest() throws RecognitionException {
        try {
            // InternalRipDSL.g:54:1: ( ruleAPIRest EOF )
            // InternalRipDSL.g:55:1: ruleAPIRest EOF
            {
             before(grammarAccess.getAPIRestRule()); 
            pushFollow(FOLLOW_1);
            ruleAPIRest();

            state._fsp--;

             after(grammarAccess.getAPIRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAPIRest"


    // $ANTLR start "ruleAPIRest"
    // InternalRipDSL.g:62:1: ruleAPIRest : ( ( rule__APIRest__Group__0 ) ) ;
    public final void ruleAPIRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:66:2: ( ( ( rule__APIRest__Group__0 ) ) )
            // InternalRipDSL.g:67:2: ( ( rule__APIRest__Group__0 ) )
            {
            // InternalRipDSL.g:67:2: ( ( rule__APIRest__Group__0 ) )
            // InternalRipDSL.g:68:3: ( rule__APIRest__Group__0 )
            {
             before(grammarAccess.getAPIRestAccess().getGroup()); 
            // InternalRipDSL.g:69:3: ( rule__APIRest__Group__0 )
            // InternalRipDSL.g:69:4: rule__APIRest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__APIRest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPIRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPIRest"


    // $ANTLR start "entryRuleCommandRest"
    // InternalRipDSL.g:78:1: entryRuleCommandRest : ruleCommandRest EOF ;
    public final void entryRuleCommandRest() throws RecognitionException {
        try {
            // InternalRipDSL.g:79:1: ( ruleCommandRest EOF )
            // InternalRipDSL.g:80:1: ruleCommandRest EOF
            {
             before(grammarAccess.getCommandRestRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandRest();

            state._fsp--;

             after(grammarAccess.getCommandRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandRest"


    // $ANTLR start "ruleCommandRest"
    // InternalRipDSL.g:87:1: ruleCommandRest : ( ( rule__CommandRest__Group__0 ) ) ;
    public final void ruleCommandRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:91:2: ( ( ( rule__CommandRest__Group__0 ) ) )
            // InternalRipDSL.g:92:2: ( ( rule__CommandRest__Group__0 ) )
            {
            // InternalRipDSL.g:92:2: ( ( rule__CommandRest__Group__0 ) )
            // InternalRipDSL.g:93:3: ( rule__CommandRest__Group__0 )
            {
             before(grammarAccess.getCommandRestAccess().getGroup()); 
            // InternalRipDSL.g:94:3: ( rule__CommandRest__Group__0 )
            // InternalRipDSL.g:94:4: rule__CommandRest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandRest"


    // $ANTLR start "entryRuleEString"
    // InternalRipDSL.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRipDSL.g:104:1: ( ruleEString EOF )
            // InternalRipDSL.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRipDSL.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRipDSL.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRipDSL.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalRipDSL.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRipDSL.g:119:3: ( rule__EString__Alternatives )
            // InternalRipDSL.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalRipDSL.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRipDSL.g:129:1: ( ruleEInt EOF )
            // InternalRipDSL.g:130:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRipDSL.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRipDSL.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRipDSL.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalRipDSL.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRipDSL.g:144:3: ( rule__EInt__Group__0 )
            // InternalRipDSL.g:144:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleParameter"
    // InternalRipDSL.g:153:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalRipDSL.g:154:1: ( ruleParameter EOF )
            // InternalRipDSL.g:155:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRipDSL.g:162:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:166:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalRipDSL.g:167:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalRipDSL.g:167:2: ( ( rule__Parameter__Group__0 ) )
            // InternalRipDSL.g:168:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalRipDSL.g:169:3: ( rule__Parameter__Group__0 )
            // InternalRipDSL.g:169:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleResponse"
    // InternalRipDSL.g:178:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalRipDSL.g:179:1: ( ruleResponse EOF )
            // InternalRipDSL.g:180:1: ruleResponse EOF
            {
             before(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalRipDSL.g:187:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:191:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalRipDSL.g:192:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalRipDSL.g:192:2: ( ( rule__Response__Group__0 ) )
            // InternalRipDSL.g:193:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalRipDSL.g:194:3: ( rule__Response__Group__0 )
            // InternalRipDSL.g:194:4: rule__Response__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "ruleMethod"
    // InternalRipDSL.g:203:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:207:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalRipDSL.g:208:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalRipDSL.g:208:2: ( ( rule__Method__Alternatives ) )
            // InternalRipDSL.g:209:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalRipDSL.g:210:3: ( rule__Method__Alternatives )
            // InternalRipDSL.g:210:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRipDSL.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRipDSL.g:223:2: ( RULE_STRING )
                    {
                    // InternalRipDSL.g:223:2: ( RULE_STRING )
                    // InternalRipDSL.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRipDSL.g:229:2: ( RULE_ID )
                    {
                    // InternalRipDSL.g:229:2: ( RULE_ID )
                    // InternalRipDSL.g:230:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalRipDSL.g:239:1: rule__Method__Alternatives : ( ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'DELETE' ) ) | ( ( 'GET' ) ) | ( ( 'PATCH' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:243:1: ( ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'DELETE' ) ) | ( ( 'GET' ) ) | ( ( 'PATCH' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRipDSL.g:244:2: ( ( 'PUT' ) )
                    {
                    // InternalRipDSL.g:244:2: ( ( 'PUT' ) )
                    // InternalRipDSL.g:245:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_0()); 
                    // InternalRipDSL.g:246:3: ( 'PUT' )
                    // InternalRipDSL.g:246:4: 'PUT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRipDSL.g:250:2: ( ( 'POST' ) )
                    {
                    // InternalRipDSL.g:250:2: ( ( 'POST' ) )
                    // InternalRipDSL.g:251:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalRipDSL.g:252:3: ( 'POST' )
                    // InternalRipDSL.g:252:4: 'POST'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRipDSL.g:256:2: ( ( 'DELETE' ) )
                    {
                    // InternalRipDSL.g:256:2: ( ( 'DELETE' ) )
                    // InternalRipDSL.g:257:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_2()); 
                    // InternalRipDSL.g:258:3: ( 'DELETE' )
                    // InternalRipDSL.g:258:4: 'DELETE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRipDSL.g:262:2: ( ( 'GET' ) )
                    {
                    // InternalRipDSL.g:262:2: ( ( 'GET' ) )
                    // InternalRipDSL.g:263:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_3()); 
                    // InternalRipDSL.g:264:3: ( 'GET' )
                    // InternalRipDSL.g:264:4: 'GET'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRipDSL.g:268:2: ( ( 'PATCH' ) )
                    {
                    // InternalRipDSL.g:268:2: ( ( 'PATCH' ) )
                    // InternalRipDSL.g:269:3: ( 'PATCH' )
                    {
                     before(grammarAccess.getMethodAccess().getPATCHEnumLiteralDeclaration_4()); 
                    // InternalRipDSL.g:270:3: ( 'PATCH' )
                    // InternalRipDSL.g:270:4: 'PATCH'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPATCHEnumLiteralDeclaration_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__APIRest__Group__0"
    // InternalRipDSL.g:278:1: rule__APIRest__Group__0 : rule__APIRest__Group__0__Impl rule__APIRest__Group__1 ;
    public final void rule__APIRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:282:1: ( rule__APIRest__Group__0__Impl rule__APIRest__Group__1 )
            // InternalRipDSL.g:283:2: rule__APIRest__Group__0__Impl rule__APIRest__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__APIRest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__0"


    // $ANTLR start "rule__APIRest__Group__0__Impl"
    // InternalRipDSL.g:290:1: rule__APIRest__Group__0__Impl : ( () ) ;
    public final void rule__APIRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:294:1: ( ( () ) )
            // InternalRipDSL.g:295:1: ( () )
            {
            // InternalRipDSL.g:295:1: ( () )
            // InternalRipDSL.g:296:2: ()
            {
             before(grammarAccess.getAPIRestAccess().getAPIRestAction_0()); 
            // InternalRipDSL.g:297:2: ()
            // InternalRipDSL.g:297:3: 
            {
            }

             after(grammarAccess.getAPIRestAccess().getAPIRestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__0__Impl"


    // $ANTLR start "rule__APIRest__Group__1"
    // InternalRipDSL.g:305:1: rule__APIRest__Group__1 : rule__APIRest__Group__1__Impl rule__APIRest__Group__2 ;
    public final void rule__APIRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:309:1: ( rule__APIRest__Group__1__Impl rule__APIRest__Group__2 )
            // InternalRipDSL.g:310:2: rule__APIRest__Group__1__Impl rule__APIRest__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__APIRest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__1"


    // $ANTLR start "rule__APIRest__Group__1__Impl"
    // InternalRipDSL.g:317:1: rule__APIRest__Group__1__Impl : ( 'host' ) ;
    public final void rule__APIRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:321:1: ( ( 'host' ) )
            // InternalRipDSL.g:322:1: ( 'host' )
            {
            // InternalRipDSL.g:322:1: ( 'host' )
            // InternalRipDSL.g:323:2: 'host'
            {
             before(grammarAccess.getAPIRestAccess().getHostKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAPIRestAccess().getHostKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__1__Impl"


    // $ANTLR start "rule__APIRest__Group__2"
    // InternalRipDSL.g:332:1: rule__APIRest__Group__2 : rule__APIRest__Group__2__Impl rule__APIRest__Group__3 ;
    public final void rule__APIRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:336:1: ( rule__APIRest__Group__2__Impl rule__APIRest__Group__3 )
            // InternalRipDSL.g:337:2: rule__APIRest__Group__2__Impl rule__APIRest__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__APIRest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__2"


    // $ANTLR start "rule__APIRest__Group__2__Impl"
    // InternalRipDSL.g:344:1: rule__APIRest__Group__2__Impl : ( ':' ) ;
    public final void rule__APIRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:348:1: ( ( ':' ) )
            // InternalRipDSL.g:349:1: ( ':' )
            {
            // InternalRipDSL.g:349:1: ( ':' )
            // InternalRipDSL.g:350:2: ':'
            {
             before(grammarAccess.getAPIRestAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAPIRestAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__2__Impl"


    // $ANTLR start "rule__APIRest__Group__3"
    // InternalRipDSL.g:359:1: rule__APIRest__Group__3 : rule__APIRest__Group__3__Impl rule__APIRest__Group__4 ;
    public final void rule__APIRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:363:1: ( rule__APIRest__Group__3__Impl rule__APIRest__Group__4 )
            // InternalRipDSL.g:364:2: rule__APIRest__Group__3__Impl rule__APIRest__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__APIRest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__3"


    // $ANTLR start "rule__APIRest__Group__3__Impl"
    // InternalRipDSL.g:371:1: rule__APIRest__Group__3__Impl : ( ( rule__APIRest__HostAssignment_3 ) ) ;
    public final void rule__APIRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:375:1: ( ( ( rule__APIRest__HostAssignment_3 ) ) )
            // InternalRipDSL.g:376:1: ( ( rule__APIRest__HostAssignment_3 ) )
            {
            // InternalRipDSL.g:376:1: ( ( rule__APIRest__HostAssignment_3 ) )
            // InternalRipDSL.g:377:2: ( rule__APIRest__HostAssignment_3 )
            {
             before(grammarAccess.getAPIRestAccess().getHostAssignment_3()); 
            // InternalRipDSL.g:378:2: ( rule__APIRest__HostAssignment_3 )
            // InternalRipDSL.g:378:3: rule__APIRest__HostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__APIRest__HostAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAPIRestAccess().getHostAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__3__Impl"


    // $ANTLR start "rule__APIRest__Group__4"
    // InternalRipDSL.g:386:1: rule__APIRest__Group__4 : rule__APIRest__Group__4__Impl rule__APIRest__Group__5 ;
    public final void rule__APIRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:390:1: ( rule__APIRest__Group__4__Impl rule__APIRest__Group__5 )
            // InternalRipDSL.g:391:2: rule__APIRest__Group__4__Impl rule__APIRest__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__APIRest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__4"


    // $ANTLR start "rule__APIRest__Group__4__Impl"
    // InternalRipDSL.g:398:1: rule__APIRest__Group__4__Impl : ( 'port' ) ;
    public final void rule__APIRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:402:1: ( ( 'port' ) )
            // InternalRipDSL.g:403:1: ( 'port' )
            {
            // InternalRipDSL.g:403:1: ( 'port' )
            // InternalRipDSL.g:404:2: 'port'
            {
             before(grammarAccess.getAPIRestAccess().getPortKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAPIRestAccess().getPortKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__4__Impl"


    // $ANTLR start "rule__APIRest__Group__5"
    // InternalRipDSL.g:413:1: rule__APIRest__Group__5 : rule__APIRest__Group__5__Impl rule__APIRest__Group__6 ;
    public final void rule__APIRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:417:1: ( rule__APIRest__Group__5__Impl rule__APIRest__Group__6 )
            // InternalRipDSL.g:418:2: rule__APIRest__Group__5__Impl rule__APIRest__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__APIRest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__5"


    // $ANTLR start "rule__APIRest__Group__5__Impl"
    // InternalRipDSL.g:425:1: rule__APIRest__Group__5__Impl : ( ':' ) ;
    public final void rule__APIRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:429:1: ( ( ':' ) )
            // InternalRipDSL.g:430:1: ( ':' )
            {
            // InternalRipDSL.g:430:1: ( ':' )
            // InternalRipDSL.g:431:2: ':'
            {
             before(grammarAccess.getAPIRestAccess().getColonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAPIRestAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__5__Impl"


    // $ANTLR start "rule__APIRest__Group__6"
    // InternalRipDSL.g:440:1: rule__APIRest__Group__6 : rule__APIRest__Group__6__Impl rule__APIRest__Group__7 ;
    public final void rule__APIRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:444:1: ( rule__APIRest__Group__6__Impl rule__APIRest__Group__7 )
            // InternalRipDSL.g:445:2: rule__APIRest__Group__6__Impl rule__APIRest__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__APIRest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__6"


    // $ANTLR start "rule__APIRest__Group__6__Impl"
    // InternalRipDSL.g:452:1: rule__APIRest__Group__6__Impl : ( ( rule__APIRest__PortAssignment_6 ) ) ;
    public final void rule__APIRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:456:1: ( ( ( rule__APIRest__PortAssignment_6 ) ) )
            // InternalRipDSL.g:457:1: ( ( rule__APIRest__PortAssignment_6 ) )
            {
            // InternalRipDSL.g:457:1: ( ( rule__APIRest__PortAssignment_6 ) )
            // InternalRipDSL.g:458:2: ( rule__APIRest__PortAssignment_6 )
            {
             before(grammarAccess.getAPIRestAccess().getPortAssignment_6()); 
            // InternalRipDSL.g:459:2: ( rule__APIRest__PortAssignment_6 )
            // InternalRipDSL.g:459:3: rule__APIRest__PortAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__APIRest__PortAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAPIRestAccess().getPortAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__6__Impl"


    // $ANTLR start "rule__APIRest__Group__7"
    // InternalRipDSL.g:467:1: rule__APIRest__Group__7 : rule__APIRest__Group__7__Impl rule__APIRest__Group__8 ;
    public final void rule__APIRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:471:1: ( rule__APIRest__Group__7__Impl rule__APIRest__Group__8 )
            // InternalRipDSL.g:472:2: rule__APIRest__Group__7__Impl rule__APIRest__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__APIRest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__7"


    // $ANTLR start "rule__APIRest__Group__7__Impl"
    // InternalRipDSL.g:479:1: rule__APIRest__Group__7__Impl : ( 'commands' ) ;
    public final void rule__APIRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:483:1: ( ( 'commands' ) )
            // InternalRipDSL.g:484:1: ( 'commands' )
            {
            // InternalRipDSL.g:484:1: ( 'commands' )
            // InternalRipDSL.g:485:2: 'commands'
            {
             before(grammarAccess.getAPIRestAccess().getCommandsKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAPIRestAccess().getCommandsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__7__Impl"


    // $ANTLR start "rule__APIRest__Group__8"
    // InternalRipDSL.g:494:1: rule__APIRest__Group__8 : rule__APIRest__Group__8__Impl rule__APIRest__Group__9 ;
    public final void rule__APIRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:498:1: ( rule__APIRest__Group__8__Impl rule__APIRest__Group__9 )
            // InternalRipDSL.g:499:2: rule__APIRest__Group__8__Impl rule__APIRest__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__APIRest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIRest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__8"


    // $ANTLR start "rule__APIRest__Group__8__Impl"
    // InternalRipDSL.g:506:1: rule__APIRest__Group__8__Impl : ( ':' ) ;
    public final void rule__APIRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:510:1: ( ( ':' ) )
            // InternalRipDSL.g:511:1: ( ':' )
            {
            // InternalRipDSL.g:511:1: ( ':' )
            // InternalRipDSL.g:512:2: ':'
            {
             before(grammarAccess.getAPIRestAccess().getColonKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAPIRestAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__8__Impl"


    // $ANTLR start "rule__APIRest__Group__9"
    // InternalRipDSL.g:521:1: rule__APIRest__Group__9 : rule__APIRest__Group__9__Impl ;
    public final void rule__APIRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:525:1: ( rule__APIRest__Group__9__Impl )
            // InternalRipDSL.g:526:2: rule__APIRest__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__APIRest__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__9"


    // $ANTLR start "rule__APIRest__Group__9__Impl"
    // InternalRipDSL.g:532:1: rule__APIRest__Group__9__Impl : ( ( ( rule__APIRest__CommandsAssignment_9 ) ) ( ( rule__APIRest__CommandsAssignment_9 )* ) ) ;
    public final void rule__APIRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:536:1: ( ( ( ( rule__APIRest__CommandsAssignment_9 ) ) ( ( rule__APIRest__CommandsAssignment_9 )* ) ) )
            // InternalRipDSL.g:537:1: ( ( ( rule__APIRest__CommandsAssignment_9 ) ) ( ( rule__APIRest__CommandsAssignment_9 )* ) )
            {
            // InternalRipDSL.g:537:1: ( ( ( rule__APIRest__CommandsAssignment_9 ) ) ( ( rule__APIRest__CommandsAssignment_9 )* ) )
            // InternalRipDSL.g:538:2: ( ( rule__APIRest__CommandsAssignment_9 ) ) ( ( rule__APIRest__CommandsAssignment_9 )* )
            {
            // InternalRipDSL.g:538:2: ( ( rule__APIRest__CommandsAssignment_9 ) )
            // InternalRipDSL.g:539:3: ( rule__APIRest__CommandsAssignment_9 )
            {
             before(grammarAccess.getAPIRestAccess().getCommandsAssignment_9()); 
            // InternalRipDSL.g:540:3: ( rule__APIRest__CommandsAssignment_9 )
            // InternalRipDSL.g:540:4: rule__APIRest__CommandsAssignment_9
            {
            pushFollow(FOLLOW_9);
            rule__APIRest__CommandsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAPIRestAccess().getCommandsAssignment_9()); 

            }

            // InternalRipDSL.g:543:2: ( ( rule__APIRest__CommandsAssignment_9 )* )
            // InternalRipDSL.g:544:3: ( rule__APIRest__CommandsAssignment_9 )*
            {
             before(grammarAccess.getAPIRestAccess().getCommandsAssignment_9()); 
            // InternalRipDSL.g:545:3: ( rule__APIRest__CommandsAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRipDSL.g:545:4: rule__APIRest__CommandsAssignment_9
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__APIRest__CommandsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAPIRestAccess().getCommandsAssignment_9()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__Group__9__Impl"


    // $ANTLR start "rule__CommandRest__Group__0"
    // InternalRipDSL.g:555:1: rule__CommandRest__Group__0 : rule__CommandRest__Group__0__Impl rule__CommandRest__Group__1 ;
    public final void rule__CommandRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:559:1: ( rule__CommandRest__Group__0__Impl rule__CommandRest__Group__1 )
            // InternalRipDSL.g:560:2: rule__CommandRest__Group__0__Impl rule__CommandRest__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__0"


    // $ANTLR start "rule__CommandRest__Group__0__Impl"
    // InternalRipDSL.g:567:1: rule__CommandRest__Group__0__Impl : ( ( rule__CommandRest__NameAssignment_0 ) ) ;
    public final void rule__CommandRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:571:1: ( ( ( rule__CommandRest__NameAssignment_0 ) ) )
            // InternalRipDSL.g:572:1: ( ( rule__CommandRest__NameAssignment_0 ) )
            {
            // InternalRipDSL.g:572:1: ( ( rule__CommandRest__NameAssignment_0 ) )
            // InternalRipDSL.g:573:2: ( rule__CommandRest__NameAssignment_0 )
            {
             before(grammarAccess.getCommandRestAccess().getNameAssignment_0()); 
            // InternalRipDSL.g:574:2: ( rule__CommandRest__NameAssignment_0 )
            // InternalRipDSL.g:574:3: rule__CommandRest__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__0__Impl"


    // $ANTLR start "rule__CommandRest__Group__1"
    // InternalRipDSL.g:582:1: rule__CommandRest__Group__1 : rule__CommandRest__Group__1__Impl rule__CommandRest__Group__2 ;
    public final void rule__CommandRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:586:1: ( rule__CommandRest__Group__1__Impl rule__CommandRest__Group__2 )
            // InternalRipDSL.g:587:2: rule__CommandRest__Group__1__Impl rule__CommandRest__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CommandRest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__1"


    // $ANTLR start "rule__CommandRest__Group__1__Impl"
    // InternalRipDSL.g:594:1: rule__CommandRest__Group__1__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:598:1: ( ( ':' ) )
            // InternalRipDSL.g:599:1: ( ':' )
            {
            // InternalRipDSL.g:599:1: ( ':' )
            // InternalRipDSL.g:600:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__1__Impl"


    // $ANTLR start "rule__CommandRest__Group__2"
    // InternalRipDSL.g:609:1: rule__CommandRest__Group__2 : rule__CommandRest__Group__2__Impl rule__CommandRest__Group__3 ;
    public final void rule__CommandRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:613:1: ( rule__CommandRest__Group__2__Impl rule__CommandRest__Group__3 )
            // InternalRipDSL.g:614:2: rule__CommandRest__Group__2__Impl rule__CommandRest__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__2"


    // $ANTLR start "rule__CommandRest__Group__2__Impl"
    // InternalRipDSL.g:621:1: rule__CommandRest__Group__2__Impl : ( 'method' ) ;
    public final void rule__CommandRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:625:1: ( ( 'method' ) )
            // InternalRipDSL.g:626:1: ( 'method' )
            {
            // InternalRipDSL.g:626:1: ( 'method' )
            // InternalRipDSL.g:627:2: 'method'
            {
             before(grammarAccess.getCommandRestAccess().getMethodKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getMethodKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__2__Impl"


    // $ANTLR start "rule__CommandRest__Group__3"
    // InternalRipDSL.g:636:1: rule__CommandRest__Group__3 : rule__CommandRest__Group__3__Impl rule__CommandRest__Group__4 ;
    public final void rule__CommandRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:640:1: ( rule__CommandRest__Group__3__Impl rule__CommandRest__Group__4 )
            // InternalRipDSL.g:641:2: rule__CommandRest__Group__3__Impl rule__CommandRest__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__CommandRest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__3"


    // $ANTLR start "rule__CommandRest__Group__3__Impl"
    // InternalRipDSL.g:648:1: rule__CommandRest__Group__3__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:652:1: ( ( ':' ) )
            // InternalRipDSL.g:653:1: ( ':' )
            {
            // InternalRipDSL.g:653:1: ( ':' )
            // InternalRipDSL.g:654:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__3__Impl"


    // $ANTLR start "rule__CommandRest__Group__4"
    // InternalRipDSL.g:663:1: rule__CommandRest__Group__4 : rule__CommandRest__Group__4__Impl rule__CommandRest__Group__5 ;
    public final void rule__CommandRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:667:1: ( rule__CommandRest__Group__4__Impl rule__CommandRest__Group__5 )
            // InternalRipDSL.g:668:2: rule__CommandRest__Group__4__Impl rule__CommandRest__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CommandRest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__4"


    // $ANTLR start "rule__CommandRest__Group__4__Impl"
    // InternalRipDSL.g:675:1: rule__CommandRest__Group__4__Impl : ( ( rule__CommandRest__MethodAssignment_4 ) ) ;
    public final void rule__CommandRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:679:1: ( ( ( rule__CommandRest__MethodAssignment_4 ) ) )
            // InternalRipDSL.g:680:1: ( ( rule__CommandRest__MethodAssignment_4 ) )
            {
            // InternalRipDSL.g:680:1: ( ( rule__CommandRest__MethodAssignment_4 ) )
            // InternalRipDSL.g:681:2: ( rule__CommandRest__MethodAssignment_4 )
            {
             before(grammarAccess.getCommandRestAccess().getMethodAssignment_4()); 
            // InternalRipDSL.g:682:2: ( rule__CommandRest__MethodAssignment_4 )
            // InternalRipDSL.g:682:3: rule__CommandRest__MethodAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__MethodAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getMethodAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__4__Impl"


    // $ANTLR start "rule__CommandRest__Group__5"
    // InternalRipDSL.g:690:1: rule__CommandRest__Group__5 : rule__CommandRest__Group__5__Impl rule__CommandRest__Group__6 ;
    public final void rule__CommandRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:694:1: ( rule__CommandRest__Group__5__Impl rule__CommandRest__Group__6 )
            // InternalRipDSL.g:695:2: rule__CommandRest__Group__5__Impl rule__CommandRest__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__5"


    // $ANTLR start "rule__CommandRest__Group__5__Impl"
    // InternalRipDSL.g:702:1: rule__CommandRest__Group__5__Impl : ( 'path' ) ;
    public final void rule__CommandRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:706:1: ( ( 'path' ) )
            // InternalRipDSL.g:707:1: ( 'path' )
            {
            // InternalRipDSL.g:707:1: ( 'path' )
            // InternalRipDSL.g:708:2: 'path'
            {
             before(grammarAccess.getCommandRestAccess().getPathKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getPathKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__5__Impl"


    // $ANTLR start "rule__CommandRest__Group__6"
    // InternalRipDSL.g:717:1: rule__CommandRest__Group__6 : rule__CommandRest__Group__6__Impl rule__CommandRest__Group__7 ;
    public final void rule__CommandRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:721:1: ( rule__CommandRest__Group__6__Impl rule__CommandRest__Group__7 )
            // InternalRipDSL.g:722:2: rule__CommandRest__Group__6__Impl rule__CommandRest__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__CommandRest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__6"


    // $ANTLR start "rule__CommandRest__Group__6__Impl"
    // InternalRipDSL.g:729:1: rule__CommandRest__Group__6__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:733:1: ( ( ':' ) )
            // InternalRipDSL.g:734:1: ( ':' )
            {
            // InternalRipDSL.g:734:1: ( ':' )
            // InternalRipDSL.g:735:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__6__Impl"


    // $ANTLR start "rule__CommandRest__Group__7"
    // InternalRipDSL.g:744:1: rule__CommandRest__Group__7 : rule__CommandRest__Group__7__Impl rule__CommandRest__Group__8 ;
    public final void rule__CommandRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:748:1: ( rule__CommandRest__Group__7__Impl rule__CommandRest__Group__8 )
            // InternalRipDSL.g:749:2: rule__CommandRest__Group__7__Impl rule__CommandRest__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__CommandRest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__7"


    // $ANTLR start "rule__CommandRest__Group__7__Impl"
    // InternalRipDSL.g:756:1: rule__CommandRest__Group__7__Impl : ( ( rule__CommandRest__PathAssignment_7 ) ) ;
    public final void rule__CommandRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:760:1: ( ( ( rule__CommandRest__PathAssignment_7 ) ) )
            // InternalRipDSL.g:761:1: ( ( rule__CommandRest__PathAssignment_7 ) )
            {
            // InternalRipDSL.g:761:1: ( ( rule__CommandRest__PathAssignment_7 ) )
            // InternalRipDSL.g:762:2: ( rule__CommandRest__PathAssignment_7 )
            {
             before(grammarAccess.getCommandRestAccess().getPathAssignment_7()); 
            // InternalRipDSL.g:763:2: ( rule__CommandRest__PathAssignment_7 )
            // InternalRipDSL.g:763:3: rule__CommandRest__PathAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__PathAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getPathAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__7__Impl"


    // $ANTLR start "rule__CommandRest__Group__8"
    // InternalRipDSL.g:771:1: rule__CommandRest__Group__8 : rule__CommandRest__Group__8__Impl rule__CommandRest__Group__9 ;
    public final void rule__CommandRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:775:1: ( rule__CommandRest__Group__8__Impl rule__CommandRest__Group__9 )
            // InternalRipDSL.g:776:2: rule__CommandRest__Group__8__Impl rule__CommandRest__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__CommandRest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__8"


    // $ANTLR start "rule__CommandRest__Group__8__Impl"
    // InternalRipDSL.g:783:1: rule__CommandRest__Group__8__Impl : ( ( rule__CommandRest__Group_8__0 )? ) ;
    public final void rule__CommandRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:787:1: ( ( ( rule__CommandRest__Group_8__0 )? ) )
            // InternalRipDSL.g:788:1: ( ( rule__CommandRest__Group_8__0 )? )
            {
            // InternalRipDSL.g:788:1: ( ( rule__CommandRest__Group_8__0 )? )
            // InternalRipDSL.g:789:2: ( rule__CommandRest__Group_8__0 )?
            {
             before(grammarAccess.getCommandRestAccess().getGroup_8()); 
            // InternalRipDSL.g:790:2: ( rule__CommandRest__Group_8__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRipDSL.g:790:3: rule__CommandRest__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandRest__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandRestAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__8__Impl"


    // $ANTLR start "rule__CommandRest__Group__9"
    // InternalRipDSL.g:798:1: rule__CommandRest__Group__9 : rule__CommandRest__Group__9__Impl rule__CommandRest__Group__10 ;
    public final void rule__CommandRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:802:1: ( rule__CommandRest__Group__9__Impl rule__CommandRest__Group__10 )
            // InternalRipDSL.g:803:2: rule__CommandRest__Group__9__Impl rule__CommandRest__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__CommandRest__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__9"


    // $ANTLR start "rule__CommandRest__Group__9__Impl"
    // InternalRipDSL.g:810:1: rule__CommandRest__Group__9__Impl : ( ( rule__CommandRest__Group_9__0 )? ) ;
    public final void rule__CommandRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:814:1: ( ( ( rule__CommandRest__Group_9__0 )? ) )
            // InternalRipDSL.g:815:1: ( ( rule__CommandRest__Group_9__0 )? )
            {
            // InternalRipDSL.g:815:1: ( ( rule__CommandRest__Group_9__0 )? )
            // InternalRipDSL.g:816:2: ( rule__CommandRest__Group_9__0 )?
            {
             before(grammarAccess.getCommandRestAccess().getGroup_9()); 
            // InternalRipDSL.g:817:2: ( rule__CommandRest__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRipDSL.g:817:3: rule__CommandRest__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandRest__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandRestAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__9__Impl"


    // $ANTLR start "rule__CommandRest__Group__10"
    // InternalRipDSL.g:825:1: rule__CommandRest__Group__10 : rule__CommandRest__Group__10__Impl rule__CommandRest__Group__11 ;
    public final void rule__CommandRest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:829:1: ( rule__CommandRest__Group__10__Impl rule__CommandRest__Group__11 )
            // InternalRipDSL.g:830:2: rule__CommandRest__Group__10__Impl rule__CommandRest__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__CommandRest__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__10"


    // $ANTLR start "rule__CommandRest__Group__10__Impl"
    // InternalRipDSL.g:837:1: rule__CommandRest__Group__10__Impl : ( ( rule__CommandRest__Group_10__0 )? ) ;
    public final void rule__CommandRest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:841:1: ( ( ( rule__CommandRest__Group_10__0 )? ) )
            // InternalRipDSL.g:842:1: ( ( rule__CommandRest__Group_10__0 )? )
            {
            // InternalRipDSL.g:842:1: ( ( rule__CommandRest__Group_10__0 )? )
            // InternalRipDSL.g:843:2: ( rule__CommandRest__Group_10__0 )?
            {
             before(grammarAccess.getCommandRestAccess().getGroup_10()); 
            // InternalRipDSL.g:844:2: ( rule__CommandRest__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRipDSL.g:844:3: rule__CommandRest__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandRest__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandRestAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__10__Impl"


    // $ANTLR start "rule__CommandRest__Group__11"
    // InternalRipDSL.g:852:1: rule__CommandRest__Group__11 : rule__CommandRest__Group__11__Impl rule__CommandRest__Group__12 ;
    public final void rule__CommandRest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:856:1: ( rule__CommandRest__Group__11__Impl rule__CommandRest__Group__12 )
            // InternalRipDSL.g:857:2: rule__CommandRest__Group__11__Impl rule__CommandRest__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__CommandRest__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__11"


    // $ANTLR start "rule__CommandRest__Group__11__Impl"
    // InternalRipDSL.g:864:1: rule__CommandRest__Group__11__Impl : ( ( rule__CommandRest__Group_11__0 )? ) ;
    public final void rule__CommandRest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:868:1: ( ( ( rule__CommandRest__Group_11__0 )? ) )
            // InternalRipDSL.g:869:1: ( ( rule__CommandRest__Group_11__0 )? )
            {
            // InternalRipDSL.g:869:1: ( ( rule__CommandRest__Group_11__0 )? )
            // InternalRipDSL.g:870:2: ( rule__CommandRest__Group_11__0 )?
            {
             before(grammarAccess.getCommandRestAccess().getGroup_11()); 
            // InternalRipDSL.g:871:2: ( rule__CommandRest__Group_11__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRipDSL.g:871:3: rule__CommandRest__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandRest__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandRestAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__11__Impl"


    // $ANTLR start "rule__CommandRest__Group__12"
    // InternalRipDSL.g:879:1: rule__CommandRest__Group__12 : rule__CommandRest__Group__12__Impl ;
    public final void rule__CommandRest__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:883:1: ( rule__CommandRest__Group__12__Impl )
            // InternalRipDSL.g:884:2: rule__CommandRest__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__12"


    // $ANTLR start "rule__CommandRest__Group__12__Impl"
    // InternalRipDSL.g:890:1: rule__CommandRest__Group__12__Impl : ( ( rule__CommandRest__Group_12__0 )? ) ;
    public final void rule__CommandRest__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:894:1: ( ( ( rule__CommandRest__Group_12__0 )? ) )
            // InternalRipDSL.g:895:1: ( ( rule__CommandRest__Group_12__0 )? )
            {
            // InternalRipDSL.g:895:1: ( ( rule__CommandRest__Group_12__0 )? )
            // InternalRipDSL.g:896:2: ( rule__CommandRest__Group_12__0 )?
            {
             before(grammarAccess.getCommandRestAccess().getGroup_12()); 
            // InternalRipDSL.g:897:2: ( rule__CommandRest__Group_12__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRipDSL.g:897:3: rule__CommandRest__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandRest__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandRestAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group__12__Impl"


    // $ANTLR start "rule__CommandRest__Group_8__0"
    // InternalRipDSL.g:906:1: rule__CommandRest__Group_8__0 : rule__CommandRest__Group_8__0__Impl rule__CommandRest__Group_8__1 ;
    public final void rule__CommandRest__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:910:1: ( rule__CommandRest__Group_8__0__Impl rule__CommandRest__Group_8__1 )
            // InternalRipDSL.g:911:2: rule__CommandRest__Group_8__0__Impl rule__CommandRest__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__0"


    // $ANTLR start "rule__CommandRest__Group_8__0__Impl"
    // InternalRipDSL.g:918:1: rule__CommandRest__Group_8__0__Impl : ( 'entryFormats' ) ;
    public final void rule__CommandRest__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:922:1: ( ( 'entryFormats' ) )
            // InternalRipDSL.g:923:1: ( 'entryFormats' )
            {
            // InternalRipDSL.g:923:1: ( 'entryFormats' )
            // InternalRipDSL.g:924:2: 'entryFormats'
            {
             before(grammarAccess.getCommandRestAccess().getEntryFormatsKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getEntryFormatsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_8__1"
    // InternalRipDSL.g:933:1: rule__CommandRest__Group_8__1 : rule__CommandRest__Group_8__1__Impl rule__CommandRest__Group_8__2 ;
    public final void rule__CommandRest__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:937:1: ( rule__CommandRest__Group_8__1__Impl rule__CommandRest__Group_8__2 )
            // InternalRipDSL.g:938:2: rule__CommandRest__Group_8__1__Impl rule__CommandRest__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__1"


    // $ANTLR start "rule__CommandRest__Group_8__1__Impl"
    // InternalRipDSL.g:945:1: rule__CommandRest__Group_8__1__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:949:1: ( ( ':' ) )
            // InternalRipDSL.g:950:1: ( ':' )
            {
            // InternalRipDSL.g:950:1: ( ':' )
            // InternalRipDSL.g:951:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_8__2"
    // InternalRipDSL.g:960:1: rule__CommandRest__Group_8__2 : rule__CommandRest__Group_8__2__Impl rule__CommandRest__Group_8__3 ;
    public final void rule__CommandRest__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:964:1: ( rule__CommandRest__Group_8__2__Impl rule__CommandRest__Group_8__3 )
            // InternalRipDSL.g:965:2: rule__CommandRest__Group_8__2__Impl rule__CommandRest__Group_8__3
            {
            pushFollow(FOLLOW_5);
            rule__CommandRest__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__2"


    // $ANTLR start "rule__CommandRest__Group_8__2__Impl"
    // InternalRipDSL.g:972:1: rule__CommandRest__Group_8__2__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:976:1: ( ( '-' ) )
            // InternalRipDSL.g:977:1: ( '-' )
            {
            // InternalRipDSL.g:977:1: ( '-' )
            // InternalRipDSL.g:978:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_8_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__2__Impl"


    // $ANTLR start "rule__CommandRest__Group_8__3"
    // InternalRipDSL.g:987:1: rule__CommandRest__Group_8__3 : rule__CommandRest__Group_8__3__Impl rule__CommandRest__Group_8__4 ;
    public final void rule__CommandRest__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:991:1: ( rule__CommandRest__Group_8__3__Impl rule__CommandRest__Group_8__4 )
            // InternalRipDSL.g:992:2: rule__CommandRest__Group_8__3__Impl rule__CommandRest__Group_8__4
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__3"


    // $ANTLR start "rule__CommandRest__Group_8__3__Impl"
    // InternalRipDSL.g:999:1: rule__CommandRest__Group_8__3__Impl : ( ( rule__CommandRest__EntryFormatsAssignment_8_3 ) ) ;
    public final void rule__CommandRest__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1003:1: ( ( ( rule__CommandRest__EntryFormatsAssignment_8_3 ) ) )
            // InternalRipDSL.g:1004:1: ( ( rule__CommandRest__EntryFormatsAssignment_8_3 ) )
            {
            // InternalRipDSL.g:1004:1: ( ( rule__CommandRest__EntryFormatsAssignment_8_3 ) )
            // InternalRipDSL.g:1005:2: ( rule__CommandRest__EntryFormatsAssignment_8_3 )
            {
             before(grammarAccess.getCommandRestAccess().getEntryFormatsAssignment_8_3()); 
            // InternalRipDSL.g:1006:2: ( rule__CommandRest__EntryFormatsAssignment_8_3 )
            // InternalRipDSL.g:1006:3: rule__CommandRest__EntryFormatsAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__EntryFormatsAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getEntryFormatsAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__3__Impl"


    // $ANTLR start "rule__CommandRest__Group_8__4"
    // InternalRipDSL.g:1014:1: rule__CommandRest__Group_8__4 : rule__CommandRest__Group_8__4__Impl ;
    public final void rule__CommandRest__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1018:1: ( rule__CommandRest__Group_8__4__Impl )
            // InternalRipDSL.g:1019:2: rule__CommandRest__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__4"


    // $ANTLR start "rule__CommandRest__Group_8__4__Impl"
    // InternalRipDSL.g:1025:1: rule__CommandRest__Group_8__4__Impl : ( ( rule__CommandRest__Group_8_4__0 )* ) ;
    public final void rule__CommandRest__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1029:1: ( ( ( rule__CommandRest__Group_8_4__0 )* ) )
            // InternalRipDSL.g:1030:1: ( ( rule__CommandRest__Group_8_4__0 )* )
            {
            // InternalRipDSL.g:1030:1: ( ( rule__CommandRest__Group_8_4__0 )* )
            // InternalRipDSL.g:1031:2: ( rule__CommandRest__Group_8_4__0 )*
            {
             before(grammarAccess.getCommandRestAccess().getGroup_8_4()); 
            // InternalRipDSL.g:1032:2: ( rule__CommandRest__Group_8_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRipDSL.g:1032:3: rule__CommandRest__Group_8_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CommandRest__Group_8_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCommandRestAccess().getGroup_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8__4__Impl"


    // $ANTLR start "rule__CommandRest__Group_8_4__0"
    // InternalRipDSL.g:1041:1: rule__CommandRest__Group_8_4__0 : rule__CommandRest__Group_8_4__0__Impl rule__CommandRest__Group_8_4__1 ;
    public final void rule__CommandRest__Group_8_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1045:1: ( rule__CommandRest__Group_8_4__0__Impl rule__CommandRest__Group_8_4__1 )
            // InternalRipDSL.g:1046:2: rule__CommandRest__Group_8_4__0__Impl rule__CommandRest__Group_8_4__1
            {
            pushFollow(FOLLOW_5);
            rule__CommandRest__Group_8_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_8_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8_4__0"


    // $ANTLR start "rule__CommandRest__Group_8_4__0__Impl"
    // InternalRipDSL.g:1053:1: rule__CommandRest__Group_8_4__0__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_8_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1057:1: ( ( '-' ) )
            // InternalRipDSL.g:1058:1: ( '-' )
            {
            // InternalRipDSL.g:1058:1: ( '-' )
            // InternalRipDSL.g:1059:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_8_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8_4__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_8_4__1"
    // InternalRipDSL.g:1068:1: rule__CommandRest__Group_8_4__1 : rule__CommandRest__Group_8_4__1__Impl ;
    public final void rule__CommandRest__Group_8_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1072:1: ( rule__CommandRest__Group_8_4__1__Impl )
            // InternalRipDSL.g:1073:2: rule__CommandRest__Group_8_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_8_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8_4__1"


    // $ANTLR start "rule__CommandRest__Group_8_4__1__Impl"
    // InternalRipDSL.g:1079:1: rule__CommandRest__Group_8_4__1__Impl : ( ( rule__CommandRest__EntryFormatsAssignment_8_4_1 ) ) ;
    public final void rule__CommandRest__Group_8_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1083:1: ( ( ( rule__CommandRest__EntryFormatsAssignment_8_4_1 ) ) )
            // InternalRipDSL.g:1084:1: ( ( rule__CommandRest__EntryFormatsAssignment_8_4_1 ) )
            {
            // InternalRipDSL.g:1084:1: ( ( rule__CommandRest__EntryFormatsAssignment_8_4_1 ) )
            // InternalRipDSL.g:1085:2: ( rule__CommandRest__EntryFormatsAssignment_8_4_1 )
            {
             before(grammarAccess.getCommandRestAccess().getEntryFormatsAssignment_8_4_1()); 
            // InternalRipDSL.g:1086:2: ( rule__CommandRest__EntryFormatsAssignment_8_4_1 )
            // InternalRipDSL.g:1086:3: rule__CommandRest__EntryFormatsAssignment_8_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__EntryFormatsAssignment_8_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getEntryFormatsAssignment_8_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_8_4__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_9__0"
    // InternalRipDSL.g:1095:1: rule__CommandRest__Group_9__0 : rule__CommandRest__Group_9__0__Impl rule__CommandRest__Group_9__1 ;
    public final void rule__CommandRest__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1099:1: ( rule__CommandRest__Group_9__0__Impl rule__CommandRest__Group_9__1 )
            // InternalRipDSL.g:1100:2: rule__CommandRest__Group_9__0__Impl rule__CommandRest__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__0"


    // $ANTLR start "rule__CommandRest__Group_9__0__Impl"
    // InternalRipDSL.g:1107:1: rule__CommandRest__Group_9__0__Impl : ( 'outputFormats' ) ;
    public final void rule__CommandRest__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1111:1: ( ( 'outputFormats' ) )
            // InternalRipDSL.g:1112:1: ( 'outputFormats' )
            {
            // InternalRipDSL.g:1112:1: ( 'outputFormats' )
            // InternalRipDSL.g:1113:2: 'outputFormats'
            {
             before(grammarAccess.getCommandRestAccess().getOutputFormatsKeyword_9_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getOutputFormatsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_9__1"
    // InternalRipDSL.g:1122:1: rule__CommandRest__Group_9__1 : rule__CommandRest__Group_9__1__Impl rule__CommandRest__Group_9__2 ;
    public final void rule__CommandRest__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1126:1: ( rule__CommandRest__Group_9__1__Impl rule__CommandRest__Group_9__2 )
            // InternalRipDSL.g:1127:2: rule__CommandRest__Group_9__1__Impl rule__CommandRest__Group_9__2
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__1"


    // $ANTLR start "rule__CommandRest__Group_9__1__Impl"
    // InternalRipDSL.g:1134:1: rule__CommandRest__Group_9__1__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1138:1: ( ( ':' ) )
            // InternalRipDSL.g:1139:1: ( ':' )
            {
            // InternalRipDSL.g:1139:1: ( ':' )
            // InternalRipDSL.g:1140:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_9__2"
    // InternalRipDSL.g:1149:1: rule__CommandRest__Group_9__2 : rule__CommandRest__Group_9__2__Impl rule__CommandRest__Group_9__3 ;
    public final void rule__CommandRest__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1153:1: ( rule__CommandRest__Group_9__2__Impl rule__CommandRest__Group_9__3 )
            // InternalRipDSL.g:1154:2: rule__CommandRest__Group_9__2__Impl rule__CommandRest__Group_9__3
            {
            pushFollow(FOLLOW_5);
            rule__CommandRest__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__2"


    // $ANTLR start "rule__CommandRest__Group_9__2__Impl"
    // InternalRipDSL.g:1161:1: rule__CommandRest__Group_9__2__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1165:1: ( ( '-' ) )
            // InternalRipDSL.g:1166:1: ( '-' )
            {
            // InternalRipDSL.g:1166:1: ( '-' )
            // InternalRipDSL.g:1167:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_9_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__2__Impl"


    // $ANTLR start "rule__CommandRest__Group_9__3"
    // InternalRipDSL.g:1176:1: rule__CommandRest__Group_9__3 : rule__CommandRest__Group_9__3__Impl rule__CommandRest__Group_9__4 ;
    public final void rule__CommandRest__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1180:1: ( rule__CommandRest__Group_9__3__Impl rule__CommandRest__Group_9__4 )
            // InternalRipDSL.g:1181:2: rule__CommandRest__Group_9__3__Impl rule__CommandRest__Group_9__4
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__3"


    // $ANTLR start "rule__CommandRest__Group_9__3__Impl"
    // InternalRipDSL.g:1188:1: rule__CommandRest__Group_9__3__Impl : ( ( rule__CommandRest__OutputFormatsAssignment_9_3 ) ) ;
    public final void rule__CommandRest__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1192:1: ( ( ( rule__CommandRest__OutputFormatsAssignment_9_3 ) ) )
            // InternalRipDSL.g:1193:1: ( ( rule__CommandRest__OutputFormatsAssignment_9_3 ) )
            {
            // InternalRipDSL.g:1193:1: ( ( rule__CommandRest__OutputFormatsAssignment_9_3 ) )
            // InternalRipDSL.g:1194:2: ( rule__CommandRest__OutputFormatsAssignment_9_3 )
            {
             before(grammarAccess.getCommandRestAccess().getOutputFormatsAssignment_9_3()); 
            // InternalRipDSL.g:1195:2: ( rule__CommandRest__OutputFormatsAssignment_9_3 )
            // InternalRipDSL.g:1195:3: rule__CommandRest__OutputFormatsAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__OutputFormatsAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getOutputFormatsAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__3__Impl"


    // $ANTLR start "rule__CommandRest__Group_9__4"
    // InternalRipDSL.g:1203:1: rule__CommandRest__Group_9__4 : rule__CommandRest__Group_9__4__Impl ;
    public final void rule__CommandRest__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1207:1: ( rule__CommandRest__Group_9__4__Impl )
            // InternalRipDSL.g:1208:2: rule__CommandRest__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__4"


    // $ANTLR start "rule__CommandRest__Group_9__4__Impl"
    // InternalRipDSL.g:1214:1: rule__CommandRest__Group_9__4__Impl : ( ( rule__CommandRest__Group_9_4__0 )* ) ;
    public final void rule__CommandRest__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1218:1: ( ( ( rule__CommandRest__Group_9_4__0 )* ) )
            // InternalRipDSL.g:1219:1: ( ( rule__CommandRest__Group_9_4__0 )* )
            {
            // InternalRipDSL.g:1219:1: ( ( rule__CommandRest__Group_9_4__0 )* )
            // InternalRipDSL.g:1220:2: ( rule__CommandRest__Group_9_4__0 )*
            {
             before(grammarAccess.getCommandRestAccess().getGroup_9_4()); 
            // InternalRipDSL.g:1221:2: ( rule__CommandRest__Group_9_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRipDSL.g:1221:3: rule__CommandRest__Group_9_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CommandRest__Group_9_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCommandRestAccess().getGroup_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9__4__Impl"


    // $ANTLR start "rule__CommandRest__Group_9_4__0"
    // InternalRipDSL.g:1230:1: rule__CommandRest__Group_9_4__0 : rule__CommandRest__Group_9_4__0__Impl rule__CommandRest__Group_9_4__1 ;
    public final void rule__CommandRest__Group_9_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1234:1: ( rule__CommandRest__Group_9_4__0__Impl rule__CommandRest__Group_9_4__1 )
            // InternalRipDSL.g:1235:2: rule__CommandRest__Group_9_4__0__Impl rule__CommandRest__Group_9_4__1
            {
            pushFollow(FOLLOW_5);
            rule__CommandRest__Group_9_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_9_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9_4__0"


    // $ANTLR start "rule__CommandRest__Group_9_4__0__Impl"
    // InternalRipDSL.g:1242:1: rule__CommandRest__Group_9_4__0__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_9_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1246:1: ( ( '-' ) )
            // InternalRipDSL.g:1247:1: ( '-' )
            {
            // InternalRipDSL.g:1247:1: ( '-' )
            // InternalRipDSL.g:1248:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_9_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9_4__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_9_4__1"
    // InternalRipDSL.g:1257:1: rule__CommandRest__Group_9_4__1 : rule__CommandRest__Group_9_4__1__Impl ;
    public final void rule__CommandRest__Group_9_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1261:1: ( rule__CommandRest__Group_9_4__1__Impl )
            // InternalRipDSL.g:1262:2: rule__CommandRest__Group_9_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_9_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9_4__1"


    // $ANTLR start "rule__CommandRest__Group_9_4__1__Impl"
    // InternalRipDSL.g:1268:1: rule__CommandRest__Group_9_4__1__Impl : ( ( rule__CommandRest__OutputFormatsAssignment_9_4_1 ) ) ;
    public final void rule__CommandRest__Group_9_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1272:1: ( ( ( rule__CommandRest__OutputFormatsAssignment_9_4_1 ) ) )
            // InternalRipDSL.g:1273:1: ( ( rule__CommandRest__OutputFormatsAssignment_9_4_1 ) )
            {
            // InternalRipDSL.g:1273:1: ( ( rule__CommandRest__OutputFormatsAssignment_9_4_1 ) )
            // InternalRipDSL.g:1274:2: ( rule__CommandRest__OutputFormatsAssignment_9_4_1 )
            {
             before(grammarAccess.getCommandRestAccess().getOutputFormatsAssignment_9_4_1()); 
            // InternalRipDSL.g:1275:2: ( rule__CommandRest__OutputFormatsAssignment_9_4_1 )
            // InternalRipDSL.g:1275:3: rule__CommandRest__OutputFormatsAssignment_9_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__OutputFormatsAssignment_9_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getOutputFormatsAssignment_9_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_9_4__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_10__0"
    // InternalRipDSL.g:1284:1: rule__CommandRest__Group_10__0 : rule__CommandRest__Group_10__0__Impl rule__CommandRest__Group_10__1 ;
    public final void rule__CommandRest__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1288:1: ( rule__CommandRest__Group_10__0__Impl rule__CommandRest__Group_10__1 )
            // InternalRipDSL.g:1289:2: rule__CommandRest__Group_10__0__Impl rule__CommandRest__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_10__0"


    // $ANTLR start "rule__CommandRest__Group_10__0__Impl"
    // InternalRipDSL.g:1296:1: rule__CommandRest__Group_10__0__Impl : ( 'description' ) ;
    public final void rule__CommandRest__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1300:1: ( ( 'description' ) )
            // InternalRipDSL.g:1301:1: ( 'description' )
            {
            // InternalRipDSL.g:1301:1: ( 'description' )
            // InternalRipDSL.g:1302:2: 'description'
            {
             before(grammarAccess.getCommandRestAccess().getDescriptionKeyword_10_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getDescriptionKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_10__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_10__1"
    // InternalRipDSL.g:1311:1: rule__CommandRest__Group_10__1 : rule__CommandRest__Group_10__1__Impl rule__CommandRest__Group_10__2 ;
    public final void rule__CommandRest__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1315:1: ( rule__CommandRest__Group_10__1__Impl rule__CommandRest__Group_10__2 )
            // InternalRipDSL.g:1316:2: rule__CommandRest__Group_10__1__Impl rule__CommandRest__Group_10__2
            {
            pushFollow(FOLLOW_5);
            rule__CommandRest__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_10__1"


    // $ANTLR start "rule__CommandRest__Group_10__1__Impl"
    // InternalRipDSL.g:1323:1: rule__CommandRest__Group_10__1__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1327:1: ( ( ':' ) )
            // InternalRipDSL.g:1328:1: ( ':' )
            {
            // InternalRipDSL.g:1328:1: ( ':' )
            // InternalRipDSL.g:1329:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_10__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_10__2"
    // InternalRipDSL.g:1338:1: rule__CommandRest__Group_10__2 : rule__CommandRest__Group_10__2__Impl ;
    public final void rule__CommandRest__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1342:1: ( rule__CommandRest__Group_10__2__Impl )
            // InternalRipDSL.g:1343:2: rule__CommandRest__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_10__2"


    // $ANTLR start "rule__CommandRest__Group_10__2__Impl"
    // InternalRipDSL.g:1349:1: rule__CommandRest__Group_10__2__Impl : ( ( rule__CommandRest__DescriptionAssignment_10_2 ) ) ;
    public final void rule__CommandRest__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1353:1: ( ( ( rule__CommandRest__DescriptionAssignment_10_2 ) ) )
            // InternalRipDSL.g:1354:1: ( ( rule__CommandRest__DescriptionAssignment_10_2 ) )
            {
            // InternalRipDSL.g:1354:1: ( ( rule__CommandRest__DescriptionAssignment_10_2 ) )
            // InternalRipDSL.g:1355:2: ( rule__CommandRest__DescriptionAssignment_10_2 )
            {
             before(grammarAccess.getCommandRestAccess().getDescriptionAssignment_10_2()); 
            // InternalRipDSL.g:1356:2: ( rule__CommandRest__DescriptionAssignment_10_2 )
            // InternalRipDSL.g:1356:3: rule__CommandRest__DescriptionAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__DescriptionAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getDescriptionAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_10__2__Impl"


    // $ANTLR start "rule__CommandRest__Group_11__0"
    // InternalRipDSL.g:1365:1: rule__CommandRest__Group_11__0 : rule__CommandRest__Group_11__0__Impl rule__CommandRest__Group_11__1 ;
    public final void rule__CommandRest__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1369:1: ( rule__CommandRest__Group_11__0__Impl rule__CommandRest__Group_11__1 )
            // InternalRipDSL.g:1370:2: rule__CommandRest__Group_11__0__Impl rule__CommandRest__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__0"


    // $ANTLR start "rule__CommandRest__Group_11__0__Impl"
    // InternalRipDSL.g:1377:1: rule__CommandRest__Group_11__0__Impl : ( 'parameters' ) ;
    public final void rule__CommandRest__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1381:1: ( ( 'parameters' ) )
            // InternalRipDSL.g:1382:1: ( 'parameters' )
            {
            // InternalRipDSL.g:1382:1: ( 'parameters' )
            // InternalRipDSL.g:1383:2: 'parameters'
            {
             before(grammarAccess.getCommandRestAccess().getParametersKeyword_11_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getParametersKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_11__1"
    // InternalRipDSL.g:1392:1: rule__CommandRest__Group_11__1 : rule__CommandRest__Group_11__1__Impl rule__CommandRest__Group_11__2 ;
    public final void rule__CommandRest__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1396:1: ( rule__CommandRest__Group_11__1__Impl rule__CommandRest__Group_11__2 )
            // InternalRipDSL.g:1397:2: rule__CommandRest__Group_11__1__Impl rule__CommandRest__Group_11__2
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__1"


    // $ANTLR start "rule__CommandRest__Group_11__1__Impl"
    // InternalRipDSL.g:1404:1: rule__CommandRest__Group_11__1__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1408:1: ( ( ':' ) )
            // InternalRipDSL.g:1409:1: ( ':' )
            {
            // InternalRipDSL.g:1409:1: ( ':' )
            // InternalRipDSL.g:1410:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_11__2"
    // InternalRipDSL.g:1419:1: rule__CommandRest__Group_11__2 : rule__CommandRest__Group_11__2__Impl rule__CommandRest__Group_11__3 ;
    public final void rule__CommandRest__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1423:1: ( rule__CommandRest__Group_11__2__Impl rule__CommandRest__Group_11__3 )
            // InternalRipDSL.g:1424:2: rule__CommandRest__Group_11__2__Impl rule__CommandRest__Group_11__3
            {
            pushFollow(FOLLOW_16);
            rule__CommandRest__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__2"


    // $ANTLR start "rule__CommandRest__Group_11__2__Impl"
    // InternalRipDSL.g:1431:1: rule__CommandRest__Group_11__2__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1435:1: ( ( '-' ) )
            // InternalRipDSL.g:1436:1: ( '-' )
            {
            // InternalRipDSL.g:1436:1: ( '-' )
            // InternalRipDSL.g:1437:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_11_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__2__Impl"


    // $ANTLR start "rule__CommandRest__Group_11__3"
    // InternalRipDSL.g:1446:1: rule__CommandRest__Group_11__3 : rule__CommandRest__Group_11__3__Impl rule__CommandRest__Group_11__4 ;
    public final void rule__CommandRest__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1450:1: ( rule__CommandRest__Group_11__3__Impl rule__CommandRest__Group_11__4 )
            // InternalRipDSL.g:1451:2: rule__CommandRest__Group_11__3__Impl rule__CommandRest__Group_11__4
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__3"


    // $ANTLR start "rule__CommandRest__Group_11__3__Impl"
    // InternalRipDSL.g:1458:1: rule__CommandRest__Group_11__3__Impl : ( ( rule__CommandRest__ParametersAssignment_11_3 ) ) ;
    public final void rule__CommandRest__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1462:1: ( ( ( rule__CommandRest__ParametersAssignment_11_3 ) ) )
            // InternalRipDSL.g:1463:1: ( ( rule__CommandRest__ParametersAssignment_11_3 ) )
            {
            // InternalRipDSL.g:1463:1: ( ( rule__CommandRest__ParametersAssignment_11_3 ) )
            // InternalRipDSL.g:1464:2: ( rule__CommandRest__ParametersAssignment_11_3 )
            {
             before(grammarAccess.getCommandRestAccess().getParametersAssignment_11_3()); 
            // InternalRipDSL.g:1465:2: ( rule__CommandRest__ParametersAssignment_11_3 )
            // InternalRipDSL.g:1465:3: rule__CommandRest__ParametersAssignment_11_3
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__ParametersAssignment_11_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getParametersAssignment_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__3__Impl"


    // $ANTLR start "rule__CommandRest__Group_11__4"
    // InternalRipDSL.g:1473:1: rule__CommandRest__Group_11__4 : rule__CommandRest__Group_11__4__Impl ;
    public final void rule__CommandRest__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1477:1: ( rule__CommandRest__Group_11__4__Impl )
            // InternalRipDSL.g:1478:2: rule__CommandRest__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__4"


    // $ANTLR start "rule__CommandRest__Group_11__4__Impl"
    // InternalRipDSL.g:1484:1: rule__CommandRest__Group_11__4__Impl : ( ( rule__CommandRest__Group_11_4__0 )* ) ;
    public final void rule__CommandRest__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1488:1: ( ( ( rule__CommandRest__Group_11_4__0 )* ) )
            // InternalRipDSL.g:1489:1: ( ( rule__CommandRest__Group_11_4__0 )* )
            {
            // InternalRipDSL.g:1489:1: ( ( rule__CommandRest__Group_11_4__0 )* )
            // InternalRipDSL.g:1490:2: ( rule__CommandRest__Group_11_4__0 )*
            {
             before(grammarAccess.getCommandRestAccess().getGroup_11_4()); 
            // InternalRipDSL.g:1491:2: ( rule__CommandRest__Group_11_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRipDSL.g:1491:3: rule__CommandRest__Group_11_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CommandRest__Group_11_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCommandRestAccess().getGroup_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11__4__Impl"


    // $ANTLR start "rule__CommandRest__Group_11_4__0"
    // InternalRipDSL.g:1500:1: rule__CommandRest__Group_11_4__0 : rule__CommandRest__Group_11_4__0__Impl rule__CommandRest__Group_11_4__1 ;
    public final void rule__CommandRest__Group_11_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1504:1: ( rule__CommandRest__Group_11_4__0__Impl rule__CommandRest__Group_11_4__1 )
            // InternalRipDSL.g:1505:2: rule__CommandRest__Group_11_4__0__Impl rule__CommandRest__Group_11_4__1
            {
            pushFollow(FOLLOW_16);
            rule__CommandRest__Group_11_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_11_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11_4__0"


    // $ANTLR start "rule__CommandRest__Group_11_4__0__Impl"
    // InternalRipDSL.g:1512:1: rule__CommandRest__Group_11_4__0__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_11_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1516:1: ( ( '-' ) )
            // InternalRipDSL.g:1517:1: ( '-' )
            {
            // InternalRipDSL.g:1517:1: ( '-' )
            // InternalRipDSL.g:1518:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_11_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_11_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11_4__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_11_4__1"
    // InternalRipDSL.g:1527:1: rule__CommandRest__Group_11_4__1 : rule__CommandRest__Group_11_4__1__Impl ;
    public final void rule__CommandRest__Group_11_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1531:1: ( rule__CommandRest__Group_11_4__1__Impl )
            // InternalRipDSL.g:1532:2: rule__CommandRest__Group_11_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_11_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11_4__1"


    // $ANTLR start "rule__CommandRest__Group_11_4__1__Impl"
    // InternalRipDSL.g:1538:1: rule__CommandRest__Group_11_4__1__Impl : ( ( rule__CommandRest__ParametersAssignment_11_4_1 ) ) ;
    public final void rule__CommandRest__Group_11_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1542:1: ( ( ( rule__CommandRest__ParametersAssignment_11_4_1 ) ) )
            // InternalRipDSL.g:1543:1: ( ( rule__CommandRest__ParametersAssignment_11_4_1 ) )
            {
            // InternalRipDSL.g:1543:1: ( ( rule__CommandRest__ParametersAssignment_11_4_1 ) )
            // InternalRipDSL.g:1544:2: ( rule__CommandRest__ParametersAssignment_11_4_1 )
            {
             before(grammarAccess.getCommandRestAccess().getParametersAssignment_11_4_1()); 
            // InternalRipDSL.g:1545:2: ( rule__CommandRest__ParametersAssignment_11_4_1 )
            // InternalRipDSL.g:1545:3: rule__CommandRest__ParametersAssignment_11_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__ParametersAssignment_11_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getParametersAssignment_11_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_11_4__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_12__0"
    // InternalRipDSL.g:1554:1: rule__CommandRest__Group_12__0 : rule__CommandRest__Group_12__0__Impl rule__CommandRest__Group_12__1 ;
    public final void rule__CommandRest__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1558:1: ( rule__CommandRest__Group_12__0__Impl rule__CommandRest__Group_12__1 )
            // InternalRipDSL.g:1559:2: rule__CommandRest__Group_12__0__Impl rule__CommandRest__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandRest__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__0"


    // $ANTLR start "rule__CommandRest__Group_12__0__Impl"
    // InternalRipDSL.g:1566:1: rule__CommandRest__Group_12__0__Impl : ( 'response' ) ;
    public final void rule__CommandRest__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1570:1: ( ( 'response' ) )
            // InternalRipDSL.g:1571:1: ( 'response' )
            {
            // InternalRipDSL.g:1571:1: ( 'response' )
            // InternalRipDSL.g:1572:2: 'response'
            {
             before(grammarAccess.getCommandRestAccess().getResponseKeyword_12_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getResponseKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_12__1"
    // InternalRipDSL.g:1581:1: rule__CommandRest__Group_12__1 : rule__CommandRest__Group_12__1__Impl rule__CommandRest__Group_12__2 ;
    public final void rule__CommandRest__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1585:1: ( rule__CommandRest__Group_12__1__Impl rule__CommandRest__Group_12__2 )
            // InternalRipDSL.g:1586:2: rule__CommandRest__Group_12__1__Impl rule__CommandRest__Group_12__2
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__1"


    // $ANTLR start "rule__CommandRest__Group_12__1__Impl"
    // InternalRipDSL.g:1593:1: rule__CommandRest__Group_12__1__Impl : ( ':' ) ;
    public final void rule__CommandRest__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1597:1: ( ( ':' ) )
            // InternalRipDSL.g:1598:1: ( ':' )
            {
            // InternalRipDSL.g:1598:1: ( ':' )
            // InternalRipDSL.g:1599:2: ':'
            {
             before(grammarAccess.getCommandRestAccess().getColonKeyword_12_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__1__Impl"


    // $ANTLR start "rule__CommandRest__Group_12__2"
    // InternalRipDSL.g:1608:1: rule__CommandRest__Group_12__2 : rule__CommandRest__Group_12__2__Impl rule__CommandRest__Group_12__3 ;
    public final void rule__CommandRest__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1612:1: ( rule__CommandRest__Group_12__2__Impl rule__CommandRest__Group_12__3 )
            // InternalRipDSL.g:1613:2: rule__CommandRest__Group_12__2__Impl rule__CommandRest__Group_12__3
            {
            pushFollow(FOLLOW_7);
            rule__CommandRest__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__2"


    // $ANTLR start "rule__CommandRest__Group_12__2__Impl"
    // InternalRipDSL.g:1620:1: rule__CommandRest__Group_12__2__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1624:1: ( ( '-' ) )
            // InternalRipDSL.g:1625:1: ( '-' )
            {
            // InternalRipDSL.g:1625:1: ( '-' )
            // InternalRipDSL.g:1626:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_12_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__2__Impl"


    // $ANTLR start "rule__CommandRest__Group_12__3"
    // InternalRipDSL.g:1635:1: rule__CommandRest__Group_12__3 : rule__CommandRest__Group_12__3__Impl rule__CommandRest__Group_12__4 ;
    public final void rule__CommandRest__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1639:1: ( rule__CommandRest__Group_12__3__Impl rule__CommandRest__Group_12__4 )
            // InternalRipDSL.g:1640:2: rule__CommandRest__Group_12__3__Impl rule__CommandRest__Group_12__4
            {
            pushFollow(FOLLOW_14);
            rule__CommandRest__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__3"


    // $ANTLR start "rule__CommandRest__Group_12__3__Impl"
    // InternalRipDSL.g:1647:1: rule__CommandRest__Group_12__3__Impl : ( ( rule__CommandRest__ResponseAssignment_12_3 ) ) ;
    public final void rule__CommandRest__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1651:1: ( ( ( rule__CommandRest__ResponseAssignment_12_3 ) ) )
            // InternalRipDSL.g:1652:1: ( ( rule__CommandRest__ResponseAssignment_12_3 ) )
            {
            // InternalRipDSL.g:1652:1: ( ( rule__CommandRest__ResponseAssignment_12_3 ) )
            // InternalRipDSL.g:1653:2: ( rule__CommandRest__ResponseAssignment_12_3 )
            {
             before(grammarAccess.getCommandRestAccess().getResponseAssignment_12_3()); 
            // InternalRipDSL.g:1654:2: ( rule__CommandRest__ResponseAssignment_12_3 )
            // InternalRipDSL.g:1654:3: rule__CommandRest__ResponseAssignment_12_3
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__ResponseAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getResponseAssignment_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__3__Impl"


    // $ANTLR start "rule__CommandRest__Group_12__4"
    // InternalRipDSL.g:1662:1: rule__CommandRest__Group_12__4 : rule__CommandRest__Group_12__4__Impl ;
    public final void rule__CommandRest__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1666:1: ( rule__CommandRest__Group_12__4__Impl )
            // InternalRipDSL.g:1667:2: rule__CommandRest__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__4"


    // $ANTLR start "rule__CommandRest__Group_12__4__Impl"
    // InternalRipDSL.g:1673:1: rule__CommandRest__Group_12__4__Impl : ( ( rule__CommandRest__Group_12_4__0 )* ) ;
    public final void rule__CommandRest__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1677:1: ( ( ( rule__CommandRest__Group_12_4__0 )* ) )
            // InternalRipDSL.g:1678:1: ( ( rule__CommandRest__Group_12_4__0 )* )
            {
            // InternalRipDSL.g:1678:1: ( ( rule__CommandRest__Group_12_4__0 )* )
            // InternalRipDSL.g:1679:2: ( rule__CommandRest__Group_12_4__0 )*
            {
             before(grammarAccess.getCommandRestAccess().getGroup_12_4()); 
            // InternalRipDSL.g:1680:2: ( rule__CommandRest__Group_12_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRipDSL.g:1680:3: rule__CommandRest__Group_12_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CommandRest__Group_12_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCommandRestAccess().getGroup_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12__4__Impl"


    // $ANTLR start "rule__CommandRest__Group_12_4__0"
    // InternalRipDSL.g:1689:1: rule__CommandRest__Group_12_4__0 : rule__CommandRest__Group_12_4__0__Impl rule__CommandRest__Group_12_4__1 ;
    public final void rule__CommandRest__Group_12_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1693:1: ( rule__CommandRest__Group_12_4__0__Impl rule__CommandRest__Group_12_4__1 )
            // InternalRipDSL.g:1694:2: rule__CommandRest__Group_12_4__0__Impl rule__CommandRest__Group_12_4__1
            {
            pushFollow(FOLLOW_7);
            rule__CommandRest__Group_12_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_12_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12_4__0"


    // $ANTLR start "rule__CommandRest__Group_12_4__0__Impl"
    // InternalRipDSL.g:1701:1: rule__CommandRest__Group_12_4__0__Impl : ( '-' ) ;
    public final void rule__CommandRest__Group_12_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1705:1: ( ( '-' ) )
            // InternalRipDSL.g:1706:1: ( '-' )
            {
            // InternalRipDSL.g:1706:1: ( '-' )
            // InternalRipDSL.g:1707:2: '-'
            {
             before(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_12_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommandRestAccess().getHyphenMinusKeyword_12_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12_4__0__Impl"


    // $ANTLR start "rule__CommandRest__Group_12_4__1"
    // InternalRipDSL.g:1716:1: rule__CommandRest__Group_12_4__1 : rule__CommandRest__Group_12_4__1__Impl ;
    public final void rule__CommandRest__Group_12_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1720:1: ( rule__CommandRest__Group_12_4__1__Impl )
            // InternalRipDSL.g:1721:2: rule__CommandRest__Group_12_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__Group_12_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12_4__1"


    // $ANTLR start "rule__CommandRest__Group_12_4__1__Impl"
    // InternalRipDSL.g:1727:1: rule__CommandRest__Group_12_4__1__Impl : ( ( rule__CommandRest__ResponseAssignment_12_4_1 ) ) ;
    public final void rule__CommandRest__Group_12_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1731:1: ( ( ( rule__CommandRest__ResponseAssignment_12_4_1 ) ) )
            // InternalRipDSL.g:1732:1: ( ( rule__CommandRest__ResponseAssignment_12_4_1 ) )
            {
            // InternalRipDSL.g:1732:1: ( ( rule__CommandRest__ResponseAssignment_12_4_1 ) )
            // InternalRipDSL.g:1733:2: ( rule__CommandRest__ResponseAssignment_12_4_1 )
            {
             before(grammarAccess.getCommandRestAccess().getResponseAssignment_12_4_1()); 
            // InternalRipDSL.g:1734:2: ( rule__CommandRest__ResponseAssignment_12_4_1 )
            // InternalRipDSL.g:1734:3: rule__CommandRest__ResponseAssignment_12_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandRest__ResponseAssignment_12_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandRestAccess().getResponseAssignment_12_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__Group_12_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRipDSL.g:1743:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1747:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRipDSL.g:1748:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalRipDSL.g:1755:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1759:1: ( ( ( '-' )? ) )
            // InternalRipDSL.g:1760:1: ( ( '-' )? )
            {
            // InternalRipDSL.g:1760:1: ( ( '-' )? )
            // InternalRipDSL.g:1761:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRipDSL.g:1762:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRipDSL.g:1762:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalRipDSL.g:1770:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1774:1: ( rule__EInt__Group__1__Impl )
            // InternalRipDSL.g:1775:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalRipDSL.g:1781:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1785:1: ( ( RULE_INT ) )
            // InternalRipDSL.g:1786:1: ( RULE_INT )
            {
            // InternalRipDSL.g:1786:1: ( RULE_INT )
            // InternalRipDSL.g:1787:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalRipDSL.g:1797:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1801:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalRipDSL.g:1802:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalRipDSL.g:1809:1: rule__Parameter__Group__0__Impl : ( 'name' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1813:1: ( ( 'name' ) )
            // InternalRipDSL.g:1814:1: ( 'name' )
            {
            // InternalRipDSL.g:1814:1: ( 'name' )
            // InternalRipDSL.g:1815:2: 'name'
            {
             before(grammarAccess.getParameterAccess().getNameKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalRipDSL.g:1824:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1828:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalRipDSL.g:1829:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalRipDSL.g:1836:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1840:1: ( ( ':' ) )
            // InternalRipDSL.g:1841:1: ( ':' )
            {
            // InternalRipDSL.g:1841:1: ( ':' )
            // InternalRipDSL.g:1842:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalRipDSL.g:1851:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1855:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalRipDSL.g:1856:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalRipDSL.g:1863:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1867:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalRipDSL.g:1868:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalRipDSL.g:1868:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalRipDSL.g:1869:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalRipDSL.g:1870:2: ( rule__Parameter__NameAssignment_2 )
            // InternalRipDSL.g:1870:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalRipDSL.g:1878:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1882:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalRipDSL.g:1883:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalRipDSL.g:1890:1: rule__Parameter__Group__3__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1894:1: ( ( 'type' ) )
            // InternalRipDSL.g:1895:1: ( 'type' )
            {
            // InternalRipDSL.g:1895:1: ( 'type' )
            // InternalRipDSL.g:1896:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalRipDSL.g:1905:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1909:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalRipDSL.g:1910:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalRipDSL.g:1917:1: rule__Parameter__Group__4__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1921:1: ( ( ':' ) )
            // InternalRipDSL.g:1922:1: ( ':' )
            {
            // InternalRipDSL.g:1922:1: ( ':' )
            // InternalRipDSL.g:1923:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalRipDSL.g:1932:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1936:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalRipDSL.g:1937:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalRipDSL.g:1944:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__TypeAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1948:1: ( ( ( rule__Parameter__TypeAssignment_5 ) ) )
            // InternalRipDSL.g:1949:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            {
            // InternalRipDSL.g:1949:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            // InternalRipDSL.g:1950:2: ( rule__Parameter__TypeAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_5()); 
            // InternalRipDSL.g:1951:2: ( rule__Parameter__TypeAssignment_5 )
            // InternalRipDSL.g:1951:3: rule__Parameter__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // InternalRipDSL.g:1959:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1963:1: ( rule__Parameter__Group__6__Impl )
            // InternalRipDSL.g:1964:2: rule__Parameter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // InternalRipDSL.g:1970:1: rule__Parameter__Group__6__Impl : ( ( rule__Parameter__Group_6__0 )? ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1974:1: ( ( ( rule__Parameter__Group_6__0 )? ) )
            // InternalRipDSL.g:1975:1: ( ( rule__Parameter__Group_6__0 )? )
            {
            // InternalRipDSL.g:1975:1: ( ( rule__Parameter__Group_6__0 )? )
            // InternalRipDSL.g:1976:2: ( rule__Parameter__Group_6__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_6()); 
            // InternalRipDSL.g:1977:2: ( rule__Parameter__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRipDSL.g:1977:3: rule__Parameter__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group_6__0"
    // InternalRipDSL.g:1986:1: rule__Parameter__Group_6__0 : rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1 ;
    public final void rule__Parameter__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:1990:1: ( rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1 )
            // InternalRipDSL.g:1991:2: rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__0"


    // $ANTLR start "rule__Parameter__Group_6__0__Impl"
    // InternalRipDSL.g:1998:1: rule__Parameter__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Parameter__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2002:1: ( ( 'description' ) )
            // InternalRipDSL.g:2003:1: ( 'description' )
            {
            // InternalRipDSL.g:2003:1: ( 'description' )
            // InternalRipDSL.g:2004:2: 'description'
            {
             before(grammarAccess.getParameterAccess().getDescriptionKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__0__Impl"


    // $ANTLR start "rule__Parameter__Group_6__1"
    // InternalRipDSL.g:2013:1: rule__Parameter__Group_6__1 : rule__Parameter__Group_6__1__Impl rule__Parameter__Group_6__2 ;
    public final void rule__Parameter__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2017:1: ( rule__Parameter__Group_6__1__Impl rule__Parameter__Group_6__2 )
            // InternalRipDSL.g:2018:2: rule__Parameter__Group_6__1__Impl rule__Parameter__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__1"


    // $ANTLR start "rule__Parameter__Group_6__1__Impl"
    // InternalRipDSL.g:2025:1: rule__Parameter__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2029:1: ( ( ':' ) )
            // InternalRipDSL.g:2030:1: ( ':' )
            {
            // InternalRipDSL.g:2030:1: ( ':' )
            // InternalRipDSL.g:2031:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__1__Impl"


    // $ANTLR start "rule__Parameter__Group_6__2"
    // InternalRipDSL.g:2040:1: rule__Parameter__Group_6__2 : rule__Parameter__Group_6__2__Impl ;
    public final void rule__Parameter__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2044:1: ( rule__Parameter__Group_6__2__Impl )
            // InternalRipDSL.g:2045:2: rule__Parameter__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__2"


    // $ANTLR start "rule__Parameter__Group_6__2__Impl"
    // InternalRipDSL.g:2051:1: rule__Parameter__Group_6__2__Impl : ( ( rule__Parameter__CommentAssignment_6_2 ) ) ;
    public final void rule__Parameter__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2055:1: ( ( ( rule__Parameter__CommentAssignment_6_2 ) ) )
            // InternalRipDSL.g:2056:1: ( ( rule__Parameter__CommentAssignment_6_2 ) )
            {
            // InternalRipDSL.g:2056:1: ( ( rule__Parameter__CommentAssignment_6_2 ) )
            // InternalRipDSL.g:2057:2: ( rule__Parameter__CommentAssignment_6_2 )
            {
             before(grammarAccess.getParameterAccess().getCommentAssignment_6_2()); 
            // InternalRipDSL.g:2058:2: ( rule__Parameter__CommentAssignment_6_2 )
            // InternalRipDSL.g:2058:3: rule__Parameter__CommentAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__CommentAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getCommentAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__2__Impl"


    // $ANTLR start "rule__Response__Group__0"
    // InternalRipDSL.g:2067:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2071:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalRipDSL.g:2072:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Response__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0"


    // $ANTLR start "rule__Response__Group__0__Impl"
    // InternalRipDSL.g:2079:1: rule__Response__Group__0__Impl : ( ( rule__Response__CodeAssignment_0 ) ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2083:1: ( ( ( rule__Response__CodeAssignment_0 ) ) )
            // InternalRipDSL.g:2084:1: ( ( rule__Response__CodeAssignment_0 ) )
            {
            // InternalRipDSL.g:2084:1: ( ( rule__Response__CodeAssignment_0 ) )
            // InternalRipDSL.g:2085:2: ( rule__Response__CodeAssignment_0 )
            {
             before(grammarAccess.getResponseAccess().getCodeAssignment_0()); 
            // InternalRipDSL.g:2086:2: ( rule__Response__CodeAssignment_0 )
            // InternalRipDSL.g:2086:3: rule__Response__CodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Response__CodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getCodeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0__Impl"


    // $ANTLR start "rule__Response__Group__1"
    // InternalRipDSL.g:2094:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2098:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalRipDSL.g:2099:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Response__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1"


    // $ANTLR start "rule__Response__Group__1__Impl"
    // InternalRipDSL.g:2106:1: rule__Response__Group__1__Impl : ( ':' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2110:1: ( ( ':' ) )
            // InternalRipDSL.g:2111:1: ( ':' )
            {
            // InternalRipDSL.g:2111:1: ( ':' )
            // InternalRipDSL.g:2112:2: ':'
            {
             before(grammarAccess.getResponseAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1__Impl"


    // $ANTLR start "rule__Response__Group__2"
    // InternalRipDSL.g:2121:1: rule__Response__Group__2 : rule__Response__Group__2__Impl ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2125:1: ( rule__Response__Group__2__Impl )
            // InternalRipDSL.g:2126:2: rule__Response__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2"


    // $ANTLR start "rule__Response__Group__2__Impl"
    // InternalRipDSL.g:2132:1: rule__Response__Group__2__Impl : ( ( rule__Response__Group_2__0 )? ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2136:1: ( ( ( rule__Response__Group_2__0 )? ) )
            // InternalRipDSL.g:2137:1: ( ( rule__Response__Group_2__0 )? )
            {
            // InternalRipDSL.g:2137:1: ( ( rule__Response__Group_2__0 )? )
            // InternalRipDSL.g:2138:2: ( rule__Response__Group_2__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_2()); 
            // InternalRipDSL.g:2139:2: ( rule__Response__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRipDSL.g:2139:3: rule__Response__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2__Impl"


    // $ANTLR start "rule__Response__Group_2__0"
    // InternalRipDSL.g:2148:1: rule__Response__Group_2__0 : rule__Response__Group_2__0__Impl rule__Response__Group_2__1 ;
    public final void rule__Response__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2152:1: ( rule__Response__Group_2__0__Impl rule__Response__Group_2__1 )
            // InternalRipDSL.g:2153:2: rule__Response__Group_2__0__Impl rule__Response__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Response__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_2__0"


    // $ANTLR start "rule__Response__Group_2__0__Impl"
    // InternalRipDSL.g:2160:1: rule__Response__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Response__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2164:1: ( ( 'description' ) )
            // InternalRipDSL.g:2165:1: ( 'description' )
            {
            // InternalRipDSL.g:2165:1: ( 'description' )
            // InternalRipDSL.g:2166:2: 'description'
            {
             before(grammarAccess.getResponseAccess().getDescriptionKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_2__0__Impl"


    // $ANTLR start "rule__Response__Group_2__1"
    // InternalRipDSL.g:2175:1: rule__Response__Group_2__1 : rule__Response__Group_2__1__Impl rule__Response__Group_2__2 ;
    public final void rule__Response__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2179:1: ( rule__Response__Group_2__1__Impl rule__Response__Group_2__2 )
            // InternalRipDSL.g:2180:2: rule__Response__Group_2__1__Impl rule__Response__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Response__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_2__1"


    // $ANTLR start "rule__Response__Group_2__1__Impl"
    // InternalRipDSL.g:2187:1: rule__Response__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Response__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2191:1: ( ( ':' ) )
            // InternalRipDSL.g:2192:1: ( ':' )
            {
            // InternalRipDSL.g:2192:1: ( ':' )
            // InternalRipDSL.g:2193:2: ':'
            {
             before(grammarAccess.getResponseAccess().getColonKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_2__1__Impl"


    // $ANTLR start "rule__Response__Group_2__2"
    // InternalRipDSL.g:2202:1: rule__Response__Group_2__2 : rule__Response__Group_2__2__Impl ;
    public final void rule__Response__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2206:1: ( rule__Response__Group_2__2__Impl )
            // InternalRipDSL.g:2207:2: rule__Response__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_2__2"


    // $ANTLR start "rule__Response__Group_2__2__Impl"
    // InternalRipDSL.g:2213:1: rule__Response__Group_2__2__Impl : ( ( rule__Response__DescriptionAssignment_2_2 ) ) ;
    public final void rule__Response__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2217:1: ( ( ( rule__Response__DescriptionAssignment_2_2 ) ) )
            // InternalRipDSL.g:2218:1: ( ( rule__Response__DescriptionAssignment_2_2 ) )
            {
            // InternalRipDSL.g:2218:1: ( ( rule__Response__DescriptionAssignment_2_2 ) )
            // InternalRipDSL.g:2219:2: ( rule__Response__DescriptionAssignment_2_2 )
            {
             before(grammarAccess.getResponseAccess().getDescriptionAssignment_2_2()); 
            // InternalRipDSL.g:2220:2: ( rule__Response__DescriptionAssignment_2_2 )
            // InternalRipDSL.g:2220:3: rule__Response__DescriptionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Response__DescriptionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getDescriptionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_2__2__Impl"


    // $ANTLR start "rule__APIRest__HostAssignment_3"
    // InternalRipDSL.g:2229:1: rule__APIRest__HostAssignment_3 : ( ruleEString ) ;
    public final void rule__APIRest__HostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2233:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2234:2: ( ruleEString )
            {
            // InternalRipDSL.g:2234:2: ( ruleEString )
            // InternalRipDSL.g:2235:3: ruleEString
            {
             before(grammarAccess.getAPIRestAccess().getHostEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAPIRestAccess().getHostEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__HostAssignment_3"


    // $ANTLR start "rule__APIRest__PortAssignment_6"
    // InternalRipDSL.g:2244:1: rule__APIRest__PortAssignment_6 : ( ruleEInt ) ;
    public final void rule__APIRest__PortAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2248:1: ( ( ruleEInt ) )
            // InternalRipDSL.g:2249:2: ( ruleEInt )
            {
            // InternalRipDSL.g:2249:2: ( ruleEInt )
            // InternalRipDSL.g:2250:3: ruleEInt
            {
             before(grammarAccess.getAPIRestAccess().getPortEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAPIRestAccess().getPortEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__PortAssignment_6"


    // $ANTLR start "rule__APIRest__CommandsAssignment_9"
    // InternalRipDSL.g:2259:1: rule__APIRest__CommandsAssignment_9 : ( ruleCommandRest ) ;
    public final void rule__APIRest__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2263:1: ( ( ruleCommandRest ) )
            // InternalRipDSL.g:2264:2: ( ruleCommandRest )
            {
            // InternalRipDSL.g:2264:2: ( ruleCommandRest )
            // InternalRipDSL.g:2265:3: ruleCommandRest
            {
             before(grammarAccess.getAPIRestAccess().getCommandsCommandRestParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandRest();

            state._fsp--;

             after(grammarAccess.getAPIRestAccess().getCommandsCommandRestParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRest__CommandsAssignment_9"


    // $ANTLR start "rule__CommandRest__NameAssignment_0"
    // InternalRipDSL.g:2274:1: rule__CommandRest__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__CommandRest__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2278:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2279:2: ( ruleEString )
            {
            // InternalRipDSL.g:2279:2: ( ruleEString )
            // InternalRipDSL.g:2280:3: ruleEString
            {
             before(grammarAccess.getCommandRestAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__NameAssignment_0"


    // $ANTLR start "rule__CommandRest__MethodAssignment_4"
    // InternalRipDSL.g:2289:1: rule__CommandRest__MethodAssignment_4 : ( ruleMethod ) ;
    public final void rule__CommandRest__MethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2293:1: ( ( ruleMethod ) )
            // InternalRipDSL.g:2294:2: ( ruleMethod )
            {
            // InternalRipDSL.g:2294:2: ( ruleMethod )
            // InternalRipDSL.g:2295:3: ruleMethod
            {
             before(grammarAccess.getCommandRestAccess().getMethodMethodEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getMethodMethodEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__MethodAssignment_4"


    // $ANTLR start "rule__CommandRest__PathAssignment_7"
    // InternalRipDSL.g:2304:1: rule__CommandRest__PathAssignment_7 : ( ruleEString ) ;
    public final void rule__CommandRest__PathAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2308:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2309:2: ( ruleEString )
            {
            // InternalRipDSL.g:2309:2: ( ruleEString )
            // InternalRipDSL.g:2310:3: ruleEString
            {
             before(grammarAccess.getCommandRestAccess().getPathEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getPathEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__PathAssignment_7"


    // $ANTLR start "rule__CommandRest__EntryFormatsAssignment_8_3"
    // InternalRipDSL.g:2319:1: rule__CommandRest__EntryFormatsAssignment_8_3 : ( ruleEString ) ;
    public final void rule__CommandRest__EntryFormatsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2323:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2324:2: ( ruleEString )
            {
            // InternalRipDSL.g:2324:2: ( ruleEString )
            // InternalRipDSL.g:2325:3: ruleEString
            {
             before(grammarAccess.getCommandRestAccess().getEntryFormatsEStringParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getEntryFormatsEStringParserRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__EntryFormatsAssignment_8_3"


    // $ANTLR start "rule__CommandRest__EntryFormatsAssignment_8_4_1"
    // InternalRipDSL.g:2334:1: rule__CommandRest__EntryFormatsAssignment_8_4_1 : ( ruleEString ) ;
    public final void rule__CommandRest__EntryFormatsAssignment_8_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2338:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2339:2: ( ruleEString )
            {
            // InternalRipDSL.g:2339:2: ( ruleEString )
            // InternalRipDSL.g:2340:3: ruleEString
            {
             before(grammarAccess.getCommandRestAccess().getEntryFormatsEStringParserRuleCall_8_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getEntryFormatsEStringParserRuleCall_8_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__EntryFormatsAssignment_8_4_1"


    // $ANTLR start "rule__CommandRest__OutputFormatsAssignment_9_3"
    // InternalRipDSL.g:2349:1: rule__CommandRest__OutputFormatsAssignment_9_3 : ( ruleEString ) ;
    public final void rule__CommandRest__OutputFormatsAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2353:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2354:2: ( ruleEString )
            {
            // InternalRipDSL.g:2354:2: ( ruleEString )
            // InternalRipDSL.g:2355:3: ruleEString
            {
             before(grammarAccess.getCommandRestAccess().getOutputFormatsEStringParserRuleCall_9_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getOutputFormatsEStringParserRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__OutputFormatsAssignment_9_3"


    // $ANTLR start "rule__CommandRest__OutputFormatsAssignment_9_4_1"
    // InternalRipDSL.g:2364:1: rule__CommandRest__OutputFormatsAssignment_9_4_1 : ( ruleEString ) ;
    public final void rule__CommandRest__OutputFormatsAssignment_9_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2368:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2369:2: ( ruleEString )
            {
            // InternalRipDSL.g:2369:2: ( ruleEString )
            // InternalRipDSL.g:2370:3: ruleEString
            {
             before(grammarAccess.getCommandRestAccess().getOutputFormatsEStringParserRuleCall_9_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getOutputFormatsEStringParserRuleCall_9_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__OutputFormatsAssignment_9_4_1"


    // $ANTLR start "rule__CommandRest__DescriptionAssignment_10_2"
    // InternalRipDSL.g:2379:1: rule__CommandRest__DescriptionAssignment_10_2 : ( ruleEString ) ;
    public final void rule__CommandRest__DescriptionAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2383:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2384:2: ( ruleEString )
            {
            // InternalRipDSL.g:2384:2: ( ruleEString )
            // InternalRipDSL.g:2385:3: ruleEString
            {
             before(grammarAccess.getCommandRestAccess().getDescriptionEStringParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getDescriptionEStringParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__DescriptionAssignment_10_2"


    // $ANTLR start "rule__CommandRest__ParametersAssignment_11_3"
    // InternalRipDSL.g:2394:1: rule__CommandRest__ParametersAssignment_11_3 : ( ruleParameter ) ;
    public final void rule__CommandRest__ParametersAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2398:1: ( ( ruleParameter ) )
            // InternalRipDSL.g:2399:2: ( ruleParameter )
            {
            // InternalRipDSL.g:2399:2: ( ruleParameter )
            // InternalRipDSL.g:2400:3: ruleParameter
            {
             before(grammarAccess.getCommandRestAccess().getParametersParameterParserRuleCall_11_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getParametersParameterParserRuleCall_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__ParametersAssignment_11_3"


    // $ANTLR start "rule__CommandRest__ParametersAssignment_11_4_1"
    // InternalRipDSL.g:2409:1: rule__CommandRest__ParametersAssignment_11_4_1 : ( ruleParameter ) ;
    public final void rule__CommandRest__ParametersAssignment_11_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2413:1: ( ( ruleParameter ) )
            // InternalRipDSL.g:2414:2: ( ruleParameter )
            {
            // InternalRipDSL.g:2414:2: ( ruleParameter )
            // InternalRipDSL.g:2415:3: ruleParameter
            {
             before(grammarAccess.getCommandRestAccess().getParametersParameterParserRuleCall_11_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getParametersParameterParserRuleCall_11_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__ParametersAssignment_11_4_1"


    // $ANTLR start "rule__CommandRest__ResponseAssignment_12_3"
    // InternalRipDSL.g:2424:1: rule__CommandRest__ResponseAssignment_12_3 : ( ruleResponse ) ;
    public final void rule__CommandRest__ResponseAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2428:1: ( ( ruleResponse ) )
            // InternalRipDSL.g:2429:2: ( ruleResponse )
            {
            // InternalRipDSL.g:2429:2: ( ruleResponse )
            // InternalRipDSL.g:2430:3: ruleResponse
            {
             before(grammarAccess.getCommandRestAccess().getResponseResponseParserRuleCall_12_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getResponseResponseParserRuleCall_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__ResponseAssignment_12_3"


    // $ANTLR start "rule__CommandRest__ResponseAssignment_12_4_1"
    // InternalRipDSL.g:2439:1: rule__CommandRest__ResponseAssignment_12_4_1 : ( ruleResponse ) ;
    public final void rule__CommandRest__ResponseAssignment_12_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2443:1: ( ( ruleResponse ) )
            // InternalRipDSL.g:2444:2: ( ruleResponse )
            {
            // InternalRipDSL.g:2444:2: ( ruleResponse )
            // InternalRipDSL.g:2445:3: ruleResponse
            {
             before(grammarAccess.getCommandRestAccess().getResponseResponseParserRuleCall_12_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getCommandRestAccess().getResponseResponseParserRuleCall_12_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandRest__ResponseAssignment_12_4_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalRipDSL.g:2454:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2458:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2459:2: ( ruleEString )
            {
            // InternalRipDSL.g:2459:2: ( ruleEString )
            // InternalRipDSL.g:2460:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_5"
    // InternalRipDSL.g:2469:1: rule__Parameter__TypeAssignment_5 : ( ruleEString ) ;
    public final void rule__Parameter__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2473:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2474:2: ( ruleEString )
            {
            // InternalRipDSL.g:2474:2: ( ruleEString )
            // InternalRipDSL.g:2475:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getTypeEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_5"


    // $ANTLR start "rule__Parameter__CommentAssignment_6_2"
    // InternalRipDSL.g:2484:1: rule__Parameter__CommentAssignment_6_2 : ( ruleEString ) ;
    public final void rule__Parameter__CommentAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2488:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2489:2: ( ruleEString )
            {
            // InternalRipDSL.g:2489:2: ( ruleEString )
            // InternalRipDSL.g:2490:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__CommentAssignment_6_2"


    // $ANTLR start "rule__Response__CodeAssignment_0"
    // InternalRipDSL.g:2499:1: rule__Response__CodeAssignment_0 : ( ruleEInt ) ;
    public final void rule__Response__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2503:1: ( ( ruleEInt ) )
            // InternalRipDSL.g:2504:2: ( ruleEInt )
            {
            // InternalRipDSL.g:2504:2: ( ruleEInt )
            // InternalRipDSL.g:2505:3: ruleEInt
            {
             before(grammarAccess.getResponseAccess().getCodeEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getCodeEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__CodeAssignment_0"


    // $ANTLR start "rule__Response__DescriptionAssignment_2_2"
    // InternalRipDSL.g:2514:1: rule__Response__DescriptionAssignment_2_2 : ( ruleEString ) ;
    public final void rule__Response__DescriptionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRipDSL.g:2518:1: ( ( ruleEString ) )
            // InternalRipDSL.g:2519:2: ( ruleEString )
            {
            // InternalRipDSL.g:2519:2: ( ruleEString )
            // InternalRipDSL.g:2520:3: ruleEString
            {
             before(grammarAccess.getResponseAccess().getDescriptionEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getDescriptionEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__DescriptionAssignment_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}