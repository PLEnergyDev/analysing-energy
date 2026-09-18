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
import org.xtext.services.MCCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCCParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-->'", "'--|'", "'--::'", "'Cloud'", "'['", "','", "']'", "';'", "'DummyDevice'", "'Application'", "'{'", "'}'", "'Structure'", "'Fragment'", "'System'", "':='", "'|'", "'init'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMCCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMCCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMCCParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMCC.g"; }


    	private MCCGrammarAccess grammarAccess;

    	public void setGrammarAccess(MCCGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMCC.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMCC.g:54:1: ( ruleModel EOF )
            // InternalMCC.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMCC.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalMCC.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalMCC.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalMCC.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalMCC.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=19 && LA1_0<=20)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMCC.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDevice"
    // InternalMCC.g:78:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalMCC.g:79:1: ( ruleDevice EOF )
            // InternalMCC.g:80:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMCC.g:87:1: ruleDevice : ( ( rule__Device__Alternatives ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:91:2: ( ( ( rule__Device__Alternatives ) ) )
            // InternalMCC.g:92:2: ( ( rule__Device__Alternatives ) )
            {
            // InternalMCC.g:92:2: ( ( rule__Device__Alternatives ) )
            // InternalMCC.g:93:3: ( rule__Device__Alternatives )
            {
             before(grammarAccess.getDeviceAccess().getAlternatives()); 
            // InternalMCC.g:94:3: ( rule__Device__Alternatives )
            // InternalMCC.g:94:4: rule__Device__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Device__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleCloud"
    // InternalMCC.g:103:1: entryRuleCloud : ruleCloud EOF ;
    public final void entryRuleCloud() throws RecognitionException {
        try {
            // InternalMCC.g:104:1: ( ruleCloud EOF )
            // InternalMCC.g:105:1: ruleCloud EOF
            {
             before(grammarAccess.getCloudRule()); 
            pushFollow(FOLLOW_1);
            ruleCloud();

            state._fsp--;

             after(grammarAccess.getCloudRule()); 
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
    // $ANTLR end "entryRuleCloud"


    // $ANTLR start "ruleCloud"
    // InternalMCC.g:112:1: ruleCloud : ( ( rule__Cloud__Group__0 ) ) ;
    public final void ruleCloud() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:116:2: ( ( ( rule__Cloud__Group__0 ) ) )
            // InternalMCC.g:117:2: ( ( rule__Cloud__Group__0 ) )
            {
            // InternalMCC.g:117:2: ( ( rule__Cloud__Group__0 ) )
            // InternalMCC.g:118:3: ( rule__Cloud__Group__0 )
            {
             before(grammarAccess.getCloudAccess().getGroup()); 
            // InternalMCC.g:119:3: ( rule__Cloud__Group__0 )
            // InternalMCC.g:119:4: rule__Cloud__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getGroup()); 

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
    // $ANTLR end "ruleCloud"


    // $ANTLR start "entryRuleDummyDevice"
    // InternalMCC.g:128:1: entryRuleDummyDevice : ruleDummyDevice EOF ;
    public final void entryRuleDummyDevice() throws RecognitionException {
        try {
            // InternalMCC.g:129:1: ( ruleDummyDevice EOF )
            // InternalMCC.g:130:1: ruleDummyDevice EOF
            {
             before(grammarAccess.getDummyDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDummyDevice();

            state._fsp--;

             after(grammarAccess.getDummyDeviceRule()); 
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
    // $ANTLR end "entryRuleDummyDevice"


    // $ANTLR start "ruleDummyDevice"
    // InternalMCC.g:137:1: ruleDummyDevice : ( ( rule__DummyDevice__Group__0 ) ) ;
    public final void ruleDummyDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:141:2: ( ( ( rule__DummyDevice__Group__0 ) ) )
            // InternalMCC.g:142:2: ( ( rule__DummyDevice__Group__0 ) )
            {
            // InternalMCC.g:142:2: ( ( rule__DummyDevice__Group__0 ) )
            // InternalMCC.g:143:3: ( rule__DummyDevice__Group__0 )
            {
             before(grammarAccess.getDummyDeviceAccess().getGroup()); 
            // InternalMCC.g:144:3: ( rule__DummyDevice__Group__0 )
            // InternalMCC.g:144:4: rule__DummyDevice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DummyDevice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDummyDeviceAccess().getGroup()); 

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
    // $ANTLR end "ruleDummyDevice"


    // $ANTLR start "entryRuleApplication"
    // InternalMCC.g:153:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalMCC.g:154:1: ( ruleApplication EOF )
            // InternalMCC.g:155:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMCC.g:162:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:166:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalMCC.g:167:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalMCC.g:167:2: ( ( rule__Application__Group__0 ) )
            // InternalMCC.g:168:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalMCC.g:169:3: ( rule__Application__Group__0 )
            // InternalMCC.g:169:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleStructure"
    // InternalMCC.g:178:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // InternalMCC.g:179:1: ( ruleStructure EOF )
            // InternalMCC.g:180:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalMCC.g:187:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:191:2: ( ( ( rule__Structure__Group__0 ) ) )
            // InternalMCC.g:192:2: ( ( rule__Structure__Group__0 ) )
            {
            // InternalMCC.g:192:2: ( ( rule__Structure__Group__0 ) )
            // InternalMCC.g:193:3: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // InternalMCC.g:194:3: ( rule__Structure__Group__0 )
            // InternalMCC.g:194:4: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getGroup()); 

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleEdge"
    // InternalMCC.g:203:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalMCC.g:204:1: ( ruleEdge EOF )
            // InternalMCC.g:205:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalMCC.g:212:1: ruleEdge : ( ( rule__Edge__Group__0 ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:216:2: ( ( ( rule__Edge__Group__0 ) ) )
            // InternalMCC.g:217:2: ( ( rule__Edge__Group__0 ) )
            {
            // InternalMCC.g:217:2: ( ( rule__Edge__Group__0 ) )
            // InternalMCC.g:218:3: ( rule__Edge__Group__0 )
            {
             before(grammarAccess.getEdgeAccess().getGroup()); 
            // InternalMCC.g:219:3: ( rule__Edge__Group__0 )
            // InternalMCC.g:219:4: rule__Edge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getGroup()); 

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleFragment"
    // InternalMCC.g:228:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalMCC.g:229:1: ( ruleFragment EOF )
            // InternalMCC.g:230:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalMCC.g:237:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:241:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalMCC.g:242:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalMCC.g:242:2: ( ( rule__Fragment__Group__0 ) )
            // InternalMCC.g:243:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalMCC.g:244:3: ( rule__Fragment__Group__0 )
            // InternalMCC.g:244:4: rule__Fragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getGroup()); 

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleSystem"
    // InternalMCC.g:253:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalMCC.g:254:1: ( ruleSystem EOF )
            // InternalMCC.g:255:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMCC.g:262:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:266:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalMCC.g:267:2: ( ( rule__System__Group__0 ) )
            {
            // InternalMCC.g:267:2: ( ( rule__System__Group__0 ) )
            // InternalMCC.g:268:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalMCC.g:269:3: ( rule__System__Group__0 )
            // InternalMCC.g:269:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "ruleOperator"
    // InternalMCC.g:278:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:282:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMCC.g:283:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMCC.g:283:2: ( ( rule__Operator__Alternatives ) )
            // InternalMCC.g:284:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMCC.g:285:3: ( rule__Operator__Alternatives )
            // InternalMCC.g:285:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalMCC.g:293:1: rule__Model__Alternatives : ( ( ( rule__Model__DevicesAssignment_0 ) ) | ( ( rule__Model__ApplicationsAssignment_1 ) ) | ( ( rule__Model__SystemsAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:297:1: ( ( ( rule__Model__DevicesAssignment_0 ) ) | ( ( rule__Model__ApplicationsAssignment_1 ) ) | ( ( rule__Model__SystemsAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMCC.g:298:2: ( ( rule__Model__DevicesAssignment_0 ) )
                    {
                    // InternalMCC.g:298:2: ( ( rule__Model__DevicesAssignment_0 ) )
                    // InternalMCC.g:299:3: ( rule__Model__DevicesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getDevicesAssignment_0()); 
                    // InternalMCC.g:300:3: ( rule__Model__DevicesAssignment_0 )
                    // InternalMCC.g:300:4: rule__Model__DevicesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DevicesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDevicesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:304:2: ( ( rule__Model__ApplicationsAssignment_1 ) )
                    {
                    // InternalMCC.g:304:2: ( ( rule__Model__ApplicationsAssignment_1 ) )
                    // InternalMCC.g:305:3: ( rule__Model__ApplicationsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getApplicationsAssignment_1()); 
                    // InternalMCC.g:306:3: ( rule__Model__ApplicationsAssignment_1 )
                    // InternalMCC.g:306:4: rule__Model__ApplicationsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ApplicationsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getApplicationsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCC.g:310:2: ( ( rule__Model__SystemsAssignment_2 ) )
                    {
                    // InternalMCC.g:310:2: ( ( rule__Model__SystemsAssignment_2 ) )
                    // InternalMCC.g:311:3: ( rule__Model__SystemsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getSystemsAssignment_2()); 
                    // InternalMCC.g:312:3: ( rule__Model__SystemsAssignment_2 )
                    // InternalMCC.g:312:4: rule__Model__SystemsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SystemsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSystemsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Device__Alternatives"
    // InternalMCC.g:320:1: rule__Device__Alternatives : ( ( ruleCloud ) | ( ruleDummyDevice ) );
    public final void rule__Device__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:324:1: ( ( ruleCloud ) | ( ruleDummyDevice ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMCC.g:325:2: ( ruleCloud )
                    {
                    // InternalMCC.g:325:2: ( ruleCloud )
                    // InternalMCC.g:326:3: ruleCloud
                    {
                     before(grammarAccess.getDeviceAccess().getCloudParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCloud();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getCloudParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:331:2: ( ruleDummyDevice )
                    {
                    // InternalMCC.g:331:2: ( ruleDummyDevice )
                    // InternalMCC.g:332:3: ruleDummyDevice
                    {
                     before(grammarAccess.getDeviceAccess().getDummyDeviceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDummyDevice();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getDummyDeviceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Device__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMCC.g:341:1: rule__Operator__Alternatives : ( ( ( '-->' ) ) | ( ( '--|' ) ) | ( ( '--::' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:345:1: ( ( ( '-->' ) ) | ( ( '--|' ) ) | ( ( '--::' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMCC.g:346:2: ( ( '-->' ) )
                    {
                    // InternalMCC.g:346:2: ( ( '-->' ) )
                    // InternalMCC.g:347:3: ( '-->' )
                    {
                     before(grammarAccess.getOperatorAccess().getNDCEnumLiteralDeclaration_0()); 
                    // InternalMCC.g:348:3: ( '-->' )
                    // InternalMCC.g:348:4: '-->'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getNDCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:352:2: ( ( '--|' ) )
                    {
                    // InternalMCC.g:352:2: ( ( '--|' ) )
                    // InternalMCC.g:353:3: ( '--|' )
                    {
                     before(grammarAccess.getOperatorAccess().getPAREnumLiteralDeclaration_1()); 
                    // InternalMCC.g:354:3: ( '--|' )
                    // InternalMCC.g:354:4: '--|'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCC.g:358:2: ( ( '--::' ) )
                    {
                    // InternalMCC.g:358:2: ( ( '--::' ) )
                    // InternalMCC.g:359:3: ( '--::' )
                    {
                     before(grammarAccess.getOperatorAccess().getSEQEnumLiteralDeclaration_2()); 
                    // InternalMCC.g:360:3: ( '--::' )
                    // InternalMCC.g:360:4: '--::'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSEQEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Cloud__Group__0"
    // InternalMCC.g:368:1: rule__Cloud__Group__0 : rule__Cloud__Group__0__Impl rule__Cloud__Group__1 ;
    public final void rule__Cloud__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:372:1: ( rule__Cloud__Group__0__Impl rule__Cloud__Group__1 )
            // InternalMCC.g:373:2: rule__Cloud__Group__0__Impl rule__Cloud__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cloud__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__1();

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
    // $ANTLR end "rule__Cloud__Group__0"


    // $ANTLR start "rule__Cloud__Group__0__Impl"
    // InternalMCC.g:380:1: rule__Cloud__Group__0__Impl : ( 'Cloud' ) ;
    public final void rule__Cloud__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:384:1: ( ( 'Cloud' ) )
            // InternalMCC.g:385:1: ( 'Cloud' )
            {
            // InternalMCC.g:385:1: ( 'Cloud' )
            // InternalMCC.g:386:2: 'Cloud'
            {
             before(grammarAccess.getCloudAccess().getCloudKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCloudKeyword_0()); 

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
    // $ANTLR end "rule__Cloud__Group__0__Impl"


    // $ANTLR start "rule__Cloud__Group__1"
    // InternalMCC.g:395:1: rule__Cloud__Group__1 : rule__Cloud__Group__1__Impl rule__Cloud__Group__2 ;
    public final void rule__Cloud__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:399:1: ( rule__Cloud__Group__1__Impl rule__Cloud__Group__2 )
            // InternalMCC.g:400:2: rule__Cloud__Group__1__Impl rule__Cloud__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Cloud__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__2();

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
    // $ANTLR end "rule__Cloud__Group__1"


    // $ANTLR start "rule__Cloud__Group__1__Impl"
    // InternalMCC.g:407:1: rule__Cloud__Group__1__Impl : ( ( rule__Cloud__NameAssignment_1 ) ) ;
    public final void rule__Cloud__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:411:1: ( ( ( rule__Cloud__NameAssignment_1 ) ) )
            // InternalMCC.g:412:1: ( ( rule__Cloud__NameAssignment_1 ) )
            {
            // InternalMCC.g:412:1: ( ( rule__Cloud__NameAssignment_1 ) )
            // InternalMCC.g:413:2: ( rule__Cloud__NameAssignment_1 )
            {
             before(grammarAccess.getCloudAccess().getNameAssignment_1()); 
            // InternalMCC.g:414:2: ( rule__Cloud__NameAssignment_1 )
            // InternalMCC.g:414:3: rule__Cloud__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Cloud__Group__1__Impl"


    // $ANTLR start "rule__Cloud__Group__2"
    // InternalMCC.g:422:1: rule__Cloud__Group__2 : rule__Cloud__Group__2__Impl rule__Cloud__Group__3 ;
    public final void rule__Cloud__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:426:1: ( rule__Cloud__Group__2__Impl rule__Cloud__Group__3 )
            // InternalMCC.g:427:2: rule__Cloud__Group__2__Impl rule__Cloud__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Cloud__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__3();

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
    // $ANTLR end "rule__Cloud__Group__2"


    // $ANTLR start "rule__Cloud__Group__2__Impl"
    // InternalMCC.g:434:1: rule__Cloud__Group__2__Impl : ( '[' ) ;
    public final void rule__Cloud__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:438:1: ( ( '[' ) )
            // InternalMCC.g:439:1: ( '[' )
            {
            // InternalMCC.g:439:1: ( '[' )
            // InternalMCC.g:440:2: '['
            {
             before(grammarAccess.getCloudAccess().getLeftSquareBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Cloud__Group__2__Impl"


    // $ANTLR start "rule__Cloud__Group__3"
    // InternalMCC.g:449:1: rule__Cloud__Group__3 : rule__Cloud__Group__3__Impl rule__Cloud__Group__4 ;
    public final void rule__Cloud__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:453:1: ( rule__Cloud__Group__3__Impl rule__Cloud__Group__4 )
            // InternalMCC.g:454:2: rule__Cloud__Group__3__Impl rule__Cloud__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Cloud__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__4();

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
    // $ANTLR end "rule__Cloud__Group__3"


    // $ANTLR start "rule__Cloud__Group__3__Impl"
    // InternalMCC.g:461:1: rule__Cloud__Group__3__Impl : ( ( rule__Cloud__CpuInstructionsAssignment_3 ) ) ;
    public final void rule__Cloud__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:465:1: ( ( ( rule__Cloud__CpuInstructionsAssignment_3 ) ) )
            // InternalMCC.g:466:1: ( ( rule__Cloud__CpuInstructionsAssignment_3 ) )
            {
            // InternalMCC.g:466:1: ( ( rule__Cloud__CpuInstructionsAssignment_3 ) )
            // InternalMCC.g:467:2: ( rule__Cloud__CpuInstructionsAssignment_3 )
            {
             before(grammarAccess.getCloudAccess().getCpuInstructionsAssignment_3()); 
            // InternalMCC.g:468:2: ( rule__Cloud__CpuInstructionsAssignment_3 )
            // InternalMCC.g:468:3: rule__Cloud__CpuInstructionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__CpuInstructionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getCpuInstructionsAssignment_3()); 

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
    // $ANTLR end "rule__Cloud__Group__3__Impl"


    // $ANTLR start "rule__Cloud__Group__4"
    // InternalMCC.g:476:1: rule__Cloud__Group__4 : rule__Cloud__Group__4__Impl rule__Cloud__Group__5 ;
    public final void rule__Cloud__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:480:1: ( rule__Cloud__Group__4__Impl rule__Cloud__Group__5 )
            // InternalMCC.g:481:2: rule__Cloud__Group__4__Impl rule__Cloud__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Cloud__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__5();

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
    // $ANTLR end "rule__Cloud__Group__4"


    // $ANTLR start "rule__Cloud__Group__4__Impl"
    // InternalMCC.g:488:1: rule__Cloud__Group__4__Impl : ( ',' ) ;
    public final void rule__Cloud__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:492:1: ( ( ',' ) )
            // InternalMCC.g:493:1: ( ',' )
            {
            // InternalMCC.g:493:1: ( ',' )
            // InternalMCC.g:494:2: ','
            {
             before(grammarAccess.getCloudAccess().getCommaKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Cloud__Group__4__Impl"


    // $ANTLR start "rule__Cloud__Group__5"
    // InternalMCC.g:503:1: rule__Cloud__Group__5 : rule__Cloud__Group__5__Impl rule__Cloud__Group__6 ;
    public final void rule__Cloud__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:507:1: ( rule__Cloud__Group__5__Impl rule__Cloud__Group__6 )
            // InternalMCC.g:508:2: rule__Cloud__Group__5__Impl rule__Cloud__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Cloud__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__6();

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
    // $ANTLR end "rule__Cloud__Group__5"


    // $ANTLR start "rule__Cloud__Group__5__Impl"
    // InternalMCC.g:515:1: rule__Cloud__Group__5__Impl : ( ( rule__Cloud__EnergyPerInstructionAssignment_5 ) ) ;
    public final void rule__Cloud__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:519:1: ( ( ( rule__Cloud__EnergyPerInstructionAssignment_5 ) ) )
            // InternalMCC.g:520:1: ( ( rule__Cloud__EnergyPerInstructionAssignment_5 ) )
            {
            // InternalMCC.g:520:1: ( ( rule__Cloud__EnergyPerInstructionAssignment_5 ) )
            // InternalMCC.g:521:2: ( rule__Cloud__EnergyPerInstructionAssignment_5 )
            {
             before(grammarAccess.getCloudAccess().getEnergyPerInstructionAssignment_5()); 
            // InternalMCC.g:522:2: ( rule__Cloud__EnergyPerInstructionAssignment_5 )
            // InternalMCC.g:522:3: rule__Cloud__EnergyPerInstructionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__EnergyPerInstructionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getEnergyPerInstructionAssignment_5()); 

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
    // $ANTLR end "rule__Cloud__Group__5__Impl"


    // $ANTLR start "rule__Cloud__Group__6"
    // InternalMCC.g:530:1: rule__Cloud__Group__6 : rule__Cloud__Group__6__Impl rule__Cloud__Group__7 ;
    public final void rule__Cloud__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:534:1: ( rule__Cloud__Group__6__Impl rule__Cloud__Group__7 )
            // InternalMCC.g:535:2: rule__Cloud__Group__6__Impl rule__Cloud__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Cloud__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__7();

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
    // $ANTLR end "rule__Cloud__Group__6"


    // $ANTLR start "rule__Cloud__Group__6__Impl"
    // InternalMCC.g:542:1: rule__Cloud__Group__6__Impl : ( ',' ) ;
    public final void rule__Cloud__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:546:1: ( ( ',' ) )
            // InternalMCC.g:547:1: ( ',' )
            {
            // InternalMCC.g:547:1: ( ',' )
            // InternalMCC.g:548:2: ','
            {
             before(grammarAccess.getCloudAccess().getCommaKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Cloud__Group__6__Impl"


    // $ANTLR start "rule__Cloud__Group__7"
    // InternalMCC.g:557:1: rule__Cloud__Group__7 : rule__Cloud__Group__7__Impl rule__Cloud__Group__8 ;
    public final void rule__Cloud__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:561:1: ( rule__Cloud__Group__7__Impl rule__Cloud__Group__8 )
            // InternalMCC.g:562:2: rule__Cloud__Group__7__Impl rule__Cloud__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Cloud__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__8();

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
    // $ANTLR end "rule__Cloud__Group__7"


    // $ANTLR start "rule__Cloud__Group__7__Impl"
    // InternalMCC.g:569:1: rule__Cloud__Group__7__Impl : ( ( rule__Cloud__EnergyPerMemoryUnitAssignment_7 ) ) ;
    public final void rule__Cloud__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:573:1: ( ( ( rule__Cloud__EnergyPerMemoryUnitAssignment_7 ) ) )
            // InternalMCC.g:574:1: ( ( rule__Cloud__EnergyPerMemoryUnitAssignment_7 ) )
            {
            // InternalMCC.g:574:1: ( ( rule__Cloud__EnergyPerMemoryUnitAssignment_7 ) )
            // InternalMCC.g:575:2: ( rule__Cloud__EnergyPerMemoryUnitAssignment_7 )
            {
             before(grammarAccess.getCloudAccess().getEnergyPerMemoryUnitAssignment_7()); 
            // InternalMCC.g:576:2: ( rule__Cloud__EnergyPerMemoryUnitAssignment_7 )
            // InternalMCC.g:576:3: rule__Cloud__EnergyPerMemoryUnitAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__EnergyPerMemoryUnitAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getEnergyPerMemoryUnitAssignment_7()); 

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
    // $ANTLR end "rule__Cloud__Group__7__Impl"


    // $ANTLR start "rule__Cloud__Group__8"
    // InternalMCC.g:584:1: rule__Cloud__Group__8 : rule__Cloud__Group__8__Impl rule__Cloud__Group__9 ;
    public final void rule__Cloud__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:588:1: ( rule__Cloud__Group__8__Impl rule__Cloud__Group__9 )
            // InternalMCC.g:589:2: rule__Cloud__Group__8__Impl rule__Cloud__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Cloud__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__9();

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
    // $ANTLR end "rule__Cloud__Group__8"


    // $ANTLR start "rule__Cloud__Group__8__Impl"
    // InternalMCC.g:596:1: rule__Cloud__Group__8__Impl : ( ',' ) ;
    public final void rule__Cloud__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:600:1: ( ( ',' ) )
            // InternalMCC.g:601:1: ( ',' )
            {
            // InternalMCC.g:601:1: ( ',' )
            // InternalMCC.g:602:2: ','
            {
             before(grammarAccess.getCloudAccess().getCommaKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Cloud__Group__8__Impl"


    // $ANTLR start "rule__Cloud__Group__9"
    // InternalMCC.g:611:1: rule__Cloud__Group__9 : rule__Cloud__Group__9__Impl rule__Cloud__Group__10 ;
    public final void rule__Cloud__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:615:1: ( rule__Cloud__Group__9__Impl rule__Cloud__Group__10 )
            // InternalMCC.g:616:2: rule__Cloud__Group__9__Impl rule__Cloud__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Cloud__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__10();

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
    // $ANTLR end "rule__Cloud__Group__9"


    // $ANTLR start "rule__Cloud__Group__9__Impl"
    // InternalMCC.g:623:1: rule__Cloud__Group__9__Impl : ( ( rule__Cloud__EnergyPerDataUnitAssignment_9 ) ) ;
    public final void rule__Cloud__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:627:1: ( ( ( rule__Cloud__EnergyPerDataUnitAssignment_9 ) ) )
            // InternalMCC.g:628:1: ( ( rule__Cloud__EnergyPerDataUnitAssignment_9 ) )
            {
            // InternalMCC.g:628:1: ( ( rule__Cloud__EnergyPerDataUnitAssignment_9 ) )
            // InternalMCC.g:629:2: ( rule__Cloud__EnergyPerDataUnitAssignment_9 )
            {
             before(grammarAccess.getCloudAccess().getEnergyPerDataUnitAssignment_9()); 
            // InternalMCC.g:630:2: ( rule__Cloud__EnergyPerDataUnitAssignment_9 )
            // InternalMCC.g:630:3: rule__Cloud__EnergyPerDataUnitAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__EnergyPerDataUnitAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getEnergyPerDataUnitAssignment_9()); 

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
    // $ANTLR end "rule__Cloud__Group__9__Impl"


    // $ANTLR start "rule__Cloud__Group__10"
    // InternalMCC.g:638:1: rule__Cloud__Group__10 : rule__Cloud__Group__10__Impl rule__Cloud__Group__11 ;
    public final void rule__Cloud__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:642:1: ( rule__Cloud__Group__10__Impl rule__Cloud__Group__11 )
            // InternalMCC.g:643:2: rule__Cloud__Group__10__Impl rule__Cloud__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Cloud__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__11();

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
    // $ANTLR end "rule__Cloud__Group__10"


    // $ANTLR start "rule__Cloud__Group__10__Impl"
    // InternalMCC.g:650:1: rule__Cloud__Group__10__Impl : ( ',' ) ;
    public final void rule__Cloud__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:654:1: ( ( ',' ) )
            // InternalMCC.g:655:1: ( ',' )
            {
            // InternalMCC.g:655:1: ( ',' )
            // InternalMCC.g:656:2: ','
            {
             before(grammarAccess.getCloudAccess().getCommaKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCommaKeyword_10()); 

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
    // $ANTLR end "rule__Cloud__Group__10__Impl"


    // $ANTLR start "rule__Cloud__Group__11"
    // InternalMCC.g:665:1: rule__Cloud__Group__11 : rule__Cloud__Group__11__Impl rule__Cloud__Group__12 ;
    public final void rule__Cloud__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:669:1: ( rule__Cloud__Group__11__Impl rule__Cloud__Group__12 )
            // InternalMCC.g:670:2: rule__Cloud__Group__11__Impl rule__Cloud__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Cloud__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__12();

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
    // $ANTLR end "rule__Cloud__Group__11"


    // $ANTLR start "rule__Cloud__Group__11__Impl"
    // InternalMCC.g:677:1: rule__Cloud__Group__11__Impl : ( ( rule__Cloud__ApplicationsAssignment_11 ) ) ;
    public final void rule__Cloud__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:681:1: ( ( ( rule__Cloud__ApplicationsAssignment_11 ) ) )
            // InternalMCC.g:682:1: ( ( rule__Cloud__ApplicationsAssignment_11 ) )
            {
            // InternalMCC.g:682:1: ( ( rule__Cloud__ApplicationsAssignment_11 ) )
            // InternalMCC.g:683:2: ( rule__Cloud__ApplicationsAssignment_11 )
            {
             before(grammarAccess.getCloudAccess().getApplicationsAssignment_11()); 
            // InternalMCC.g:684:2: ( rule__Cloud__ApplicationsAssignment_11 )
            // InternalMCC.g:684:3: rule__Cloud__ApplicationsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__ApplicationsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getApplicationsAssignment_11()); 

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
    // $ANTLR end "rule__Cloud__Group__11__Impl"


    // $ANTLR start "rule__Cloud__Group__12"
    // InternalMCC.g:692:1: rule__Cloud__Group__12 : rule__Cloud__Group__12__Impl rule__Cloud__Group__13 ;
    public final void rule__Cloud__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:696:1: ( rule__Cloud__Group__12__Impl rule__Cloud__Group__13 )
            // InternalMCC.g:697:2: rule__Cloud__Group__12__Impl rule__Cloud__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__Cloud__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__13();

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
    // $ANTLR end "rule__Cloud__Group__12"


    // $ANTLR start "rule__Cloud__Group__12__Impl"
    // InternalMCC.g:704:1: rule__Cloud__Group__12__Impl : ( ']' ) ;
    public final void rule__Cloud__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:708:1: ( ( ']' ) )
            // InternalMCC.g:709:1: ( ']' )
            {
            // InternalMCC.g:709:1: ( ']' )
            // InternalMCC.g:710:2: ']'
            {
             before(grammarAccess.getCloudAccess().getRightSquareBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getRightSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__Cloud__Group__12__Impl"


    // $ANTLR start "rule__Cloud__Group__13"
    // InternalMCC.g:719:1: rule__Cloud__Group__13 : rule__Cloud__Group__13__Impl ;
    public final void rule__Cloud__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:723:1: ( rule__Cloud__Group__13__Impl )
            // InternalMCC.g:724:2: rule__Cloud__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group__13__Impl();

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
    // $ANTLR end "rule__Cloud__Group__13"


    // $ANTLR start "rule__Cloud__Group__13__Impl"
    // InternalMCC.g:730:1: rule__Cloud__Group__13__Impl : ( ';' ) ;
    public final void rule__Cloud__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:734:1: ( ( ';' ) )
            // InternalMCC.g:735:1: ( ';' )
            {
            // InternalMCC.g:735:1: ( ';' )
            // InternalMCC.g:736:2: ';'
            {
             before(grammarAccess.getCloudAccess().getSemicolonKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getSemicolonKeyword_13()); 

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
    // $ANTLR end "rule__Cloud__Group__13__Impl"


    // $ANTLR start "rule__DummyDevice__Group__0"
    // InternalMCC.g:746:1: rule__DummyDevice__Group__0 : rule__DummyDevice__Group__0__Impl rule__DummyDevice__Group__1 ;
    public final void rule__DummyDevice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:750:1: ( rule__DummyDevice__Group__0__Impl rule__DummyDevice__Group__1 )
            // InternalMCC.g:751:2: rule__DummyDevice__Group__0__Impl rule__DummyDevice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DummyDevice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DummyDevice__Group__1();

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
    // $ANTLR end "rule__DummyDevice__Group__0"


    // $ANTLR start "rule__DummyDevice__Group__0__Impl"
    // InternalMCC.g:758:1: rule__DummyDevice__Group__0__Impl : ( 'DummyDevice' ) ;
    public final void rule__DummyDevice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:762:1: ( ( 'DummyDevice' ) )
            // InternalMCC.g:763:1: ( 'DummyDevice' )
            {
            // InternalMCC.g:763:1: ( 'DummyDevice' )
            // InternalMCC.g:764:2: 'DummyDevice'
            {
             before(grammarAccess.getDummyDeviceAccess().getDummyDeviceKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDummyDeviceAccess().getDummyDeviceKeyword_0()); 

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
    // $ANTLR end "rule__DummyDevice__Group__0__Impl"


    // $ANTLR start "rule__DummyDevice__Group__1"
    // InternalMCC.g:773:1: rule__DummyDevice__Group__1 : rule__DummyDevice__Group__1__Impl rule__DummyDevice__Group__2 ;
    public final void rule__DummyDevice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:777:1: ( rule__DummyDevice__Group__1__Impl rule__DummyDevice__Group__2 )
            // InternalMCC.g:778:2: rule__DummyDevice__Group__1__Impl rule__DummyDevice__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DummyDevice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DummyDevice__Group__2();

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
    // $ANTLR end "rule__DummyDevice__Group__1"


    // $ANTLR start "rule__DummyDevice__Group__1__Impl"
    // InternalMCC.g:785:1: rule__DummyDevice__Group__1__Impl : ( ( rule__DummyDevice__NameAssignment_1 ) ) ;
    public final void rule__DummyDevice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:789:1: ( ( ( rule__DummyDevice__NameAssignment_1 ) ) )
            // InternalMCC.g:790:1: ( ( rule__DummyDevice__NameAssignment_1 ) )
            {
            // InternalMCC.g:790:1: ( ( rule__DummyDevice__NameAssignment_1 ) )
            // InternalMCC.g:791:2: ( rule__DummyDevice__NameAssignment_1 )
            {
             before(grammarAccess.getDummyDeviceAccess().getNameAssignment_1()); 
            // InternalMCC.g:792:2: ( rule__DummyDevice__NameAssignment_1 )
            // InternalMCC.g:792:3: rule__DummyDevice__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DummyDevice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDummyDeviceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DummyDevice__Group__1__Impl"


    // $ANTLR start "rule__DummyDevice__Group__2"
    // InternalMCC.g:800:1: rule__DummyDevice__Group__2 : rule__DummyDevice__Group__2__Impl rule__DummyDevice__Group__3 ;
    public final void rule__DummyDevice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:804:1: ( rule__DummyDevice__Group__2__Impl rule__DummyDevice__Group__3 )
            // InternalMCC.g:805:2: rule__DummyDevice__Group__2__Impl rule__DummyDevice__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DummyDevice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DummyDevice__Group__3();

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
    // $ANTLR end "rule__DummyDevice__Group__2"


    // $ANTLR start "rule__DummyDevice__Group__2__Impl"
    // InternalMCC.g:812:1: rule__DummyDevice__Group__2__Impl : ( '[' ) ;
    public final void rule__DummyDevice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:816:1: ( ( '[' ) )
            // InternalMCC.g:817:1: ( '[' )
            {
            // InternalMCC.g:817:1: ( '[' )
            // InternalMCC.g:818:2: '['
            {
             before(grammarAccess.getDummyDeviceAccess().getLeftSquareBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDummyDeviceAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__DummyDevice__Group__2__Impl"


    // $ANTLR start "rule__DummyDevice__Group__3"
    // InternalMCC.g:827:1: rule__DummyDevice__Group__3 : rule__DummyDevice__Group__3__Impl rule__DummyDevice__Group__4 ;
    public final void rule__DummyDevice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:831:1: ( rule__DummyDevice__Group__3__Impl rule__DummyDevice__Group__4 )
            // InternalMCC.g:832:2: rule__DummyDevice__Group__3__Impl rule__DummyDevice__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__DummyDevice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DummyDevice__Group__4();

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
    // $ANTLR end "rule__DummyDevice__Group__3"


    // $ANTLR start "rule__DummyDevice__Group__3__Impl"
    // InternalMCC.g:839:1: rule__DummyDevice__Group__3__Impl : ( ( rule__DummyDevice__ApplicationsAssignment_3 ) ) ;
    public final void rule__DummyDevice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:843:1: ( ( ( rule__DummyDevice__ApplicationsAssignment_3 ) ) )
            // InternalMCC.g:844:1: ( ( rule__DummyDevice__ApplicationsAssignment_3 ) )
            {
            // InternalMCC.g:844:1: ( ( rule__DummyDevice__ApplicationsAssignment_3 ) )
            // InternalMCC.g:845:2: ( rule__DummyDevice__ApplicationsAssignment_3 )
            {
             before(grammarAccess.getDummyDeviceAccess().getApplicationsAssignment_3()); 
            // InternalMCC.g:846:2: ( rule__DummyDevice__ApplicationsAssignment_3 )
            // InternalMCC.g:846:3: rule__DummyDevice__ApplicationsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DummyDevice__ApplicationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDummyDeviceAccess().getApplicationsAssignment_3()); 

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
    // $ANTLR end "rule__DummyDevice__Group__3__Impl"


    // $ANTLR start "rule__DummyDevice__Group__4"
    // InternalMCC.g:854:1: rule__DummyDevice__Group__4 : rule__DummyDevice__Group__4__Impl rule__DummyDevice__Group__5 ;
    public final void rule__DummyDevice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:858:1: ( rule__DummyDevice__Group__4__Impl rule__DummyDevice__Group__5 )
            // InternalMCC.g:859:2: rule__DummyDevice__Group__4__Impl rule__DummyDevice__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__DummyDevice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DummyDevice__Group__5();

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
    // $ANTLR end "rule__DummyDevice__Group__4"


    // $ANTLR start "rule__DummyDevice__Group__4__Impl"
    // InternalMCC.g:866:1: rule__DummyDevice__Group__4__Impl : ( ']' ) ;
    public final void rule__DummyDevice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:870:1: ( ( ']' ) )
            // InternalMCC.g:871:1: ( ']' )
            {
            // InternalMCC.g:871:1: ( ']' )
            // InternalMCC.g:872:2: ']'
            {
             before(grammarAccess.getDummyDeviceAccess().getRightSquareBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDummyDeviceAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__DummyDevice__Group__4__Impl"


    // $ANTLR start "rule__DummyDevice__Group__5"
    // InternalMCC.g:881:1: rule__DummyDevice__Group__5 : rule__DummyDevice__Group__5__Impl ;
    public final void rule__DummyDevice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:885:1: ( rule__DummyDevice__Group__5__Impl )
            // InternalMCC.g:886:2: rule__DummyDevice__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DummyDevice__Group__5__Impl();

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
    // $ANTLR end "rule__DummyDevice__Group__5"


    // $ANTLR start "rule__DummyDevice__Group__5__Impl"
    // InternalMCC.g:892:1: rule__DummyDevice__Group__5__Impl : ( ';' ) ;
    public final void rule__DummyDevice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:896:1: ( ( ';' ) )
            // InternalMCC.g:897:1: ( ';' )
            {
            // InternalMCC.g:897:1: ( ';' )
            // InternalMCC.g:898:2: ';'
            {
             before(grammarAccess.getDummyDeviceAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDummyDeviceAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__DummyDevice__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalMCC.g:908:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:912:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalMCC.g:913:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

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
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalMCC.g:920:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:924:1: ( ( 'Application' ) )
            // InternalMCC.g:925:1: ( 'Application' )
            {
            // InternalMCC.g:925:1: ( 'Application' )
            // InternalMCC.g:926:2: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

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
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalMCC.g:935:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:939:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalMCC.g:940:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

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
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalMCC.g:947:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:951:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalMCC.g:952:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalMCC.g:952:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalMCC.g:953:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalMCC.g:954:2: ( rule__Application__NameAssignment_1 )
            // InternalMCC.g:954:3: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalMCC.g:962:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:966:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalMCC.g:967:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

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
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalMCC.g:974:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:978:1: ( ( '{' ) )
            // InternalMCC.g:979:1: ( '{' )
            {
            // InternalMCC.g:979:1: ( '{' )
            // InternalMCC.g:980:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalMCC.g:989:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:993:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalMCC.g:994:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

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
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalMCC.g:1001:1: rule__Application__Group__3__Impl : ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1005:1: ( ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) ) )
            // InternalMCC.g:1006:1: ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) )
            {
            // InternalMCC.g:1006:1: ( ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* ) )
            // InternalMCC.g:1007:2: ( ( rule__Application__FragmentsAssignment_3 ) ) ( ( rule__Application__FragmentsAssignment_3 )* )
            {
            // InternalMCC.g:1007:2: ( ( rule__Application__FragmentsAssignment_3 ) )
            // InternalMCC.g:1008:3: ( rule__Application__FragmentsAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 
            // InternalMCC.g:1009:3: ( rule__Application__FragmentsAssignment_3 )
            // InternalMCC.g:1009:4: rule__Application__FragmentsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__Application__FragmentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 

            }

            // InternalMCC.g:1012:2: ( ( rule__Application__FragmentsAssignment_3 )* )
            // InternalMCC.g:1013:3: ( rule__Application__FragmentsAssignment_3 )*
            {
             before(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 
            // InternalMCC.g:1014:3: ( rule__Application__FragmentsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMCC.g:1014:4: rule__Application__FragmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Application__FragmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getFragmentsAssignment_3()); 

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
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalMCC.g:1023:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1027:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalMCC.g:1028:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

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
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalMCC.g:1035:1: rule__Application__Group__4__Impl : ( ( rule__Application__StructureAssignment_4 ) ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1039:1: ( ( ( rule__Application__StructureAssignment_4 ) ) )
            // InternalMCC.g:1040:1: ( ( rule__Application__StructureAssignment_4 ) )
            {
            // InternalMCC.g:1040:1: ( ( rule__Application__StructureAssignment_4 ) )
            // InternalMCC.g:1041:2: ( rule__Application__StructureAssignment_4 )
            {
             before(grammarAccess.getApplicationAccess().getStructureAssignment_4()); 
            // InternalMCC.g:1042:2: ( rule__Application__StructureAssignment_4 )
            // InternalMCC.g:1042:3: rule__Application__StructureAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Application__StructureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getStructureAssignment_4()); 

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
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalMCC.g:1050:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1054:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalMCC.g:1055:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__6();

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
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalMCC.g:1062:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1066:1: ( ( '}' ) )
            // InternalMCC.g:1067:1: ( '}' )
            {
            // InternalMCC.g:1067:1: ( '}' )
            // InternalMCC.g:1068:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // InternalMCC.g:1077:1: rule__Application__Group__6 : rule__Application__Group__6__Impl ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1081:1: ( rule__Application__Group__6__Impl )
            // InternalMCC.g:1082:2: rule__Application__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__6__Impl();

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
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // InternalMCC.g:1088:1: rule__Application__Group__6__Impl : ( ';' ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1092:1: ( ( ';' ) )
            // InternalMCC.g:1093:1: ( ';' )
            {
            // InternalMCC.g:1093:1: ( ';' )
            // InternalMCC.g:1094:2: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Structure__Group__0"
    // InternalMCC.g:1104:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1108:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // InternalMCC.g:1109:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__1();

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
    // $ANTLR end "rule__Structure__Group__0"


    // $ANTLR start "rule__Structure__Group__0__Impl"
    // InternalMCC.g:1116:1: rule__Structure__Group__0__Impl : ( 'Structure' ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1120:1: ( ( 'Structure' ) )
            // InternalMCC.g:1121:1: ( 'Structure' )
            {
            // InternalMCC.g:1121:1: ( 'Structure' )
            // InternalMCC.g:1122:2: 'Structure'
            {
             before(grammarAccess.getStructureAccess().getStructureKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getStructureKeyword_0()); 

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
    // $ANTLR end "rule__Structure__Group__0__Impl"


    // $ANTLR start "rule__Structure__Group__1"
    // InternalMCC.g:1131:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1135:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // InternalMCC.g:1136:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__2();

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
    // $ANTLR end "rule__Structure__Group__1"


    // $ANTLR start "rule__Structure__Group__1__Impl"
    // InternalMCC.g:1143:1: rule__Structure__Group__1__Impl : ( ( rule__Structure__NameAssignment_1 ) ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1147:1: ( ( ( rule__Structure__NameAssignment_1 ) ) )
            // InternalMCC.g:1148:1: ( ( rule__Structure__NameAssignment_1 ) )
            {
            // InternalMCC.g:1148:1: ( ( rule__Structure__NameAssignment_1 ) )
            // InternalMCC.g:1149:2: ( rule__Structure__NameAssignment_1 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_1()); 
            // InternalMCC.g:1150:2: ( rule__Structure__NameAssignment_1 )
            // InternalMCC.g:1150:3: rule__Structure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Structure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Structure__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__2"
    // InternalMCC.g:1158:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1162:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // InternalMCC.g:1163:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__3();

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
    // $ANTLR end "rule__Structure__Group__2"


    // $ANTLR start "rule__Structure__Group__2__Impl"
    // InternalMCC.g:1170:1: rule__Structure__Group__2__Impl : ( '[' ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1174:1: ( ( '[' ) )
            // InternalMCC.g:1175:1: ( '[' )
            {
            // InternalMCC.g:1175:1: ( '[' )
            // InternalMCC.g:1176:2: '['
            {
             before(grammarAccess.getStructureAccess().getLeftSquareBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Structure__Group__2__Impl"


    // $ANTLR start "rule__Structure__Group__3"
    // InternalMCC.g:1185:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl rule__Structure__Group__4 ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1189:1: ( rule__Structure__Group__3__Impl rule__Structure__Group__4 )
            // InternalMCC.g:1190:2: rule__Structure__Group__3__Impl rule__Structure__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Structure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__4();

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
    // $ANTLR end "rule__Structure__Group__3"


    // $ANTLR start "rule__Structure__Group__3__Impl"
    // InternalMCC.g:1197:1: rule__Structure__Group__3__Impl : ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1201:1: ( ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) ) )
            // InternalMCC.g:1202:1: ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) )
            {
            // InternalMCC.g:1202:1: ( ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* ) )
            // InternalMCC.g:1203:2: ( ( rule__Structure__EdgesAssignment_3 ) ) ( ( rule__Structure__EdgesAssignment_3 )* )
            {
            // InternalMCC.g:1203:2: ( ( rule__Structure__EdgesAssignment_3 ) )
            // InternalMCC.g:1204:3: ( rule__Structure__EdgesAssignment_3 )
            {
             before(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 
            // InternalMCC.g:1205:3: ( rule__Structure__EdgesAssignment_3 )
            // InternalMCC.g:1205:4: rule__Structure__EdgesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Structure__EdgesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 

            }

            // InternalMCC.g:1208:2: ( ( rule__Structure__EdgesAssignment_3 )* )
            // InternalMCC.g:1209:3: ( rule__Structure__EdgesAssignment_3 )*
            {
             before(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 
            // InternalMCC.g:1210:3: ( rule__Structure__EdgesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMCC.g:1210:4: rule__Structure__EdgesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Structure__EdgesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getEdgesAssignment_3()); 

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
    // $ANTLR end "rule__Structure__Group__3__Impl"


    // $ANTLR start "rule__Structure__Group__4"
    // InternalMCC.g:1219:1: rule__Structure__Group__4 : rule__Structure__Group__4__Impl rule__Structure__Group__5 ;
    public final void rule__Structure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1223:1: ( rule__Structure__Group__4__Impl rule__Structure__Group__5 )
            // InternalMCC.g:1224:2: rule__Structure__Group__4__Impl rule__Structure__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Structure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__5();

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
    // $ANTLR end "rule__Structure__Group__4"


    // $ANTLR start "rule__Structure__Group__4__Impl"
    // InternalMCC.g:1231:1: rule__Structure__Group__4__Impl : ( ']' ) ;
    public final void rule__Structure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1235:1: ( ( ']' ) )
            // InternalMCC.g:1236:1: ( ']' )
            {
            // InternalMCC.g:1236:1: ( ']' )
            // InternalMCC.g:1237:2: ']'
            {
             before(grammarAccess.getStructureAccess().getRightSquareBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Structure__Group__4__Impl"


    // $ANTLR start "rule__Structure__Group__5"
    // InternalMCC.g:1246:1: rule__Structure__Group__5 : rule__Structure__Group__5__Impl ;
    public final void rule__Structure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1250:1: ( rule__Structure__Group__5__Impl )
            // InternalMCC.g:1251:2: rule__Structure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Group__5__Impl();

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
    // $ANTLR end "rule__Structure__Group__5"


    // $ANTLR start "rule__Structure__Group__5__Impl"
    // InternalMCC.g:1257:1: rule__Structure__Group__5__Impl : ( ';' ) ;
    public final void rule__Structure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1261:1: ( ( ';' ) )
            // InternalMCC.g:1262:1: ( ';' )
            {
            // InternalMCC.g:1262:1: ( ';' )
            // InternalMCC.g:1263:2: ';'
            {
             before(grammarAccess.getStructureAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Structure__Group__5__Impl"


    // $ANTLR start "rule__Edge__Group__0"
    // InternalMCC.g:1273:1: rule__Edge__Group__0 : rule__Edge__Group__0__Impl rule__Edge__Group__1 ;
    public final void rule__Edge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1277:1: ( rule__Edge__Group__0__Impl rule__Edge__Group__1 )
            // InternalMCC.g:1278:2: rule__Edge__Group__0__Impl rule__Edge__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Edge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__1();

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
    // $ANTLR end "rule__Edge__Group__0"


    // $ANTLR start "rule__Edge__Group__0__Impl"
    // InternalMCC.g:1285:1: rule__Edge__Group__0__Impl : ( ( rule__Edge__StartAssignment_0 ) ) ;
    public final void rule__Edge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1289:1: ( ( ( rule__Edge__StartAssignment_0 ) ) )
            // InternalMCC.g:1290:1: ( ( rule__Edge__StartAssignment_0 ) )
            {
            // InternalMCC.g:1290:1: ( ( rule__Edge__StartAssignment_0 ) )
            // InternalMCC.g:1291:2: ( rule__Edge__StartAssignment_0 )
            {
             before(grammarAccess.getEdgeAccess().getStartAssignment_0()); 
            // InternalMCC.g:1292:2: ( rule__Edge__StartAssignment_0 )
            // InternalMCC.g:1292:3: rule__Edge__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getStartAssignment_0()); 

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
    // $ANTLR end "rule__Edge__Group__0__Impl"


    // $ANTLR start "rule__Edge__Group__1"
    // InternalMCC.g:1300:1: rule__Edge__Group__1 : rule__Edge__Group__1__Impl rule__Edge__Group__2 ;
    public final void rule__Edge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1304:1: ( rule__Edge__Group__1__Impl rule__Edge__Group__2 )
            // InternalMCC.g:1305:2: rule__Edge__Group__1__Impl rule__Edge__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Edge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__2();

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
    // $ANTLR end "rule__Edge__Group__1"


    // $ANTLR start "rule__Edge__Group__1__Impl"
    // InternalMCC.g:1312:1: rule__Edge__Group__1__Impl : ( ( rule__Edge__OperatorAssignment_1 ) ) ;
    public final void rule__Edge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1316:1: ( ( ( rule__Edge__OperatorAssignment_1 ) ) )
            // InternalMCC.g:1317:1: ( ( rule__Edge__OperatorAssignment_1 ) )
            {
            // InternalMCC.g:1317:1: ( ( rule__Edge__OperatorAssignment_1 ) )
            // InternalMCC.g:1318:2: ( rule__Edge__OperatorAssignment_1 )
            {
             before(grammarAccess.getEdgeAccess().getOperatorAssignment_1()); 
            // InternalMCC.g:1319:2: ( rule__Edge__OperatorAssignment_1 )
            // InternalMCC.g:1319:3: rule__Edge__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Edge__Group__1__Impl"


    // $ANTLR start "rule__Edge__Group__2"
    // InternalMCC.g:1327:1: rule__Edge__Group__2 : rule__Edge__Group__2__Impl rule__Edge__Group__3 ;
    public final void rule__Edge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1331:1: ( rule__Edge__Group__2__Impl rule__Edge__Group__3 )
            // InternalMCC.g:1332:2: rule__Edge__Group__2__Impl rule__Edge__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Edge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__3();

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
    // $ANTLR end "rule__Edge__Group__2"


    // $ANTLR start "rule__Edge__Group__2__Impl"
    // InternalMCC.g:1339:1: rule__Edge__Group__2__Impl : ( ( rule__Edge__StopAssignment_2 ) ) ;
    public final void rule__Edge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1343:1: ( ( ( rule__Edge__StopAssignment_2 ) ) )
            // InternalMCC.g:1344:1: ( ( rule__Edge__StopAssignment_2 ) )
            {
            // InternalMCC.g:1344:1: ( ( rule__Edge__StopAssignment_2 ) )
            // InternalMCC.g:1345:2: ( rule__Edge__StopAssignment_2 )
            {
             before(grammarAccess.getEdgeAccess().getStopAssignment_2()); 
            // InternalMCC.g:1346:2: ( rule__Edge__StopAssignment_2 )
            // InternalMCC.g:1346:3: rule__Edge__StopAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Edge__StopAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getStopAssignment_2()); 

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
    // $ANTLR end "rule__Edge__Group__2__Impl"


    // $ANTLR start "rule__Edge__Group__3"
    // InternalMCC.g:1354:1: rule__Edge__Group__3 : rule__Edge__Group__3__Impl rule__Edge__Group__4 ;
    public final void rule__Edge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1358:1: ( rule__Edge__Group__3__Impl rule__Edge__Group__4 )
            // InternalMCC.g:1359:2: rule__Edge__Group__3__Impl rule__Edge__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Edge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__4();

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
    // $ANTLR end "rule__Edge__Group__3"


    // $ANTLR start "rule__Edge__Group__3__Impl"
    // InternalMCC.g:1366:1: rule__Edge__Group__3__Impl : ( ( rule__Edge__Group_3__0 )* ) ;
    public final void rule__Edge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1370:1: ( ( ( rule__Edge__Group_3__0 )* ) )
            // InternalMCC.g:1371:1: ( ( rule__Edge__Group_3__0 )* )
            {
            // InternalMCC.g:1371:1: ( ( rule__Edge__Group_3__0 )* )
            // InternalMCC.g:1372:2: ( rule__Edge__Group_3__0 )*
            {
             before(grammarAccess.getEdgeAccess().getGroup_3()); 
            // InternalMCC.g:1373:2: ( rule__Edge__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMCC.g:1373:3: rule__Edge__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Edge__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEdgeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Edge__Group__3__Impl"


    // $ANTLR start "rule__Edge__Group__4"
    // InternalMCC.g:1381:1: rule__Edge__Group__4 : rule__Edge__Group__4__Impl ;
    public final void rule__Edge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1385:1: ( rule__Edge__Group__4__Impl )
            // InternalMCC.g:1386:2: rule__Edge__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__4__Impl();

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
    // $ANTLR end "rule__Edge__Group__4"


    // $ANTLR start "rule__Edge__Group__4__Impl"
    // InternalMCC.g:1392:1: rule__Edge__Group__4__Impl : ( ';' ) ;
    public final void rule__Edge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1396:1: ( ( ';' ) )
            // InternalMCC.g:1397:1: ( ';' )
            {
            // InternalMCC.g:1397:1: ( ';' )
            // InternalMCC.g:1398:2: ';'
            {
             before(grammarAccess.getEdgeAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Edge__Group__4__Impl"


    // $ANTLR start "rule__Edge__Group_3__0"
    // InternalMCC.g:1408:1: rule__Edge__Group_3__0 : rule__Edge__Group_3__0__Impl rule__Edge__Group_3__1 ;
    public final void rule__Edge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1412:1: ( rule__Edge__Group_3__0__Impl rule__Edge__Group_3__1 )
            // InternalMCC.g:1413:2: rule__Edge__Group_3__0__Impl rule__Edge__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Edge__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_3__1();

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
    // $ANTLR end "rule__Edge__Group_3__0"


    // $ANTLR start "rule__Edge__Group_3__0__Impl"
    // InternalMCC.g:1420:1: rule__Edge__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Edge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1424:1: ( ( ',' ) )
            // InternalMCC.g:1425:1: ( ',' )
            {
            // InternalMCC.g:1425:1: ( ',' )
            // InternalMCC.g:1426:2: ','
            {
             before(grammarAccess.getEdgeAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Edge__Group_3__0__Impl"


    // $ANTLR start "rule__Edge__Group_3__1"
    // InternalMCC.g:1435:1: rule__Edge__Group_3__1 : rule__Edge__Group_3__1__Impl ;
    public final void rule__Edge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1439:1: ( rule__Edge__Group_3__1__Impl )
            // InternalMCC.g:1440:2: rule__Edge__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group_3__1__Impl();

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
    // $ANTLR end "rule__Edge__Group_3__1"


    // $ANTLR start "rule__Edge__Group_3__1__Impl"
    // InternalMCC.g:1446:1: rule__Edge__Group_3__1__Impl : ( ( rule__Edge__StopAssignment_3_1 ) ) ;
    public final void rule__Edge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1450:1: ( ( ( rule__Edge__StopAssignment_3_1 ) ) )
            // InternalMCC.g:1451:1: ( ( rule__Edge__StopAssignment_3_1 ) )
            {
            // InternalMCC.g:1451:1: ( ( rule__Edge__StopAssignment_3_1 ) )
            // InternalMCC.g:1452:2: ( rule__Edge__StopAssignment_3_1 )
            {
             before(grammarAccess.getEdgeAccess().getStopAssignment_3_1()); 
            // InternalMCC.g:1453:2: ( rule__Edge__StopAssignment_3_1 )
            // InternalMCC.g:1453:3: rule__Edge__StopAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__StopAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getStopAssignment_3_1()); 

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
    // $ANTLR end "rule__Edge__Group_3__1__Impl"


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalMCC.g:1462:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1466:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalMCC.g:1467:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__1();

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
    // $ANTLR end "rule__Fragment__Group__0"


    // $ANTLR start "rule__Fragment__Group__0__Impl"
    // InternalMCC.g:1474:1: rule__Fragment__Group__0__Impl : ( 'Fragment' ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1478:1: ( ( 'Fragment' ) )
            // InternalMCC.g:1479:1: ( 'Fragment' )
            {
            // InternalMCC.g:1479:1: ( 'Fragment' )
            // InternalMCC.g:1480:2: 'Fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 

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
    // $ANTLR end "rule__Fragment__Group__0__Impl"


    // $ANTLR start "rule__Fragment__Group__1"
    // InternalMCC.g:1489:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1493:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalMCC.g:1494:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Fragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__2();

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
    // $ANTLR end "rule__Fragment__Group__1"


    // $ANTLR start "rule__Fragment__Group__1__Impl"
    // InternalMCC.g:1501:1: rule__Fragment__Group__1__Impl : ( ( rule__Fragment__NameAssignment_1 ) ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1505:1: ( ( ( rule__Fragment__NameAssignment_1 ) ) )
            // InternalMCC.g:1506:1: ( ( rule__Fragment__NameAssignment_1 ) )
            {
            // InternalMCC.g:1506:1: ( ( rule__Fragment__NameAssignment_1 ) )
            // InternalMCC.g:1507:2: ( rule__Fragment__NameAssignment_1 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_1()); 
            // InternalMCC.g:1508:2: ( rule__Fragment__NameAssignment_1 )
            // InternalMCC.g:1508:3: rule__Fragment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Fragment__Group__1__Impl"


    // $ANTLR start "rule__Fragment__Group__2"
    // InternalMCC.g:1516:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1520:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalMCC.g:1521:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Fragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__3();

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
    // $ANTLR end "rule__Fragment__Group__2"


    // $ANTLR start "rule__Fragment__Group__2__Impl"
    // InternalMCC.g:1528:1: rule__Fragment__Group__2__Impl : ( '[' ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1532:1: ( ( '[' ) )
            // InternalMCC.g:1533:1: ( '[' )
            {
            // InternalMCC.g:1533:1: ( '[' )
            // InternalMCC.g:1534:2: '['
            {
             before(grammarAccess.getFragmentAccess().getLeftSquareBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Fragment__Group__2__Impl"


    // $ANTLR start "rule__Fragment__Group__3"
    // InternalMCC.g:1543:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl rule__Fragment__Group__4 ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1547:1: ( rule__Fragment__Group__3__Impl rule__Fragment__Group__4 )
            // InternalMCC.g:1548:2: rule__Fragment__Group__3__Impl rule__Fragment__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Fragment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__4();

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
    // $ANTLR end "rule__Fragment__Group__3"


    // $ANTLR start "rule__Fragment__Group__3__Impl"
    // InternalMCC.g:1555:1: rule__Fragment__Group__3__Impl : ( ( rule__Fragment__InstructionsAssignment_3 ) ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1559:1: ( ( ( rule__Fragment__InstructionsAssignment_3 ) ) )
            // InternalMCC.g:1560:1: ( ( rule__Fragment__InstructionsAssignment_3 ) )
            {
            // InternalMCC.g:1560:1: ( ( rule__Fragment__InstructionsAssignment_3 ) )
            // InternalMCC.g:1561:2: ( rule__Fragment__InstructionsAssignment_3 )
            {
             before(grammarAccess.getFragmentAccess().getInstructionsAssignment_3()); 
            // InternalMCC.g:1562:2: ( rule__Fragment__InstructionsAssignment_3 )
            // InternalMCC.g:1562:3: rule__Fragment__InstructionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__InstructionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getInstructionsAssignment_3()); 

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
    // $ANTLR end "rule__Fragment__Group__3__Impl"


    // $ANTLR start "rule__Fragment__Group__4"
    // InternalMCC.g:1570:1: rule__Fragment__Group__4 : rule__Fragment__Group__4__Impl rule__Fragment__Group__5 ;
    public final void rule__Fragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1574:1: ( rule__Fragment__Group__4__Impl rule__Fragment__Group__5 )
            // InternalMCC.g:1575:2: rule__Fragment__Group__4__Impl rule__Fragment__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Fragment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__5();

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
    // $ANTLR end "rule__Fragment__Group__4"


    // $ANTLR start "rule__Fragment__Group__4__Impl"
    // InternalMCC.g:1582:1: rule__Fragment__Group__4__Impl : ( ',' ) ;
    public final void rule__Fragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1586:1: ( ( ',' ) )
            // InternalMCC.g:1587:1: ( ',' )
            {
            // InternalMCC.g:1587:1: ( ',' )
            // InternalMCC.g:1588:2: ','
            {
             before(grammarAccess.getFragmentAccess().getCommaKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Fragment__Group__4__Impl"


    // $ANTLR start "rule__Fragment__Group__5"
    // InternalMCC.g:1597:1: rule__Fragment__Group__5 : rule__Fragment__Group__5__Impl rule__Fragment__Group__6 ;
    public final void rule__Fragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1601:1: ( rule__Fragment__Group__5__Impl rule__Fragment__Group__6 )
            // InternalMCC.g:1602:2: rule__Fragment__Group__5__Impl rule__Fragment__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Fragment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__6();

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
    // $ANTLR end "rule__Fragment__Group__5"


    // $ANTLR start "rule__Fragment__Group__5__Impl"
    // InternalMCC.g:1609:1: rule__Fragment__Group__5__Impl : ( ( rule__Fragment__MemoryAssignment_5 ) ) ;
    public final void rule__Fragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1613:1: ( ( ( rule__Fragment__MemoryAssignment_5 ) ) )
            // InternalMCC.g:1614:1: ( ( rule__Fragment__MemoryAssignment_5 ) )
            {
            // InternalMCC.g:1614:1: ( ( rule__Fragment__MemoryAssignment_5 ) )
            // InternalMCC.g:1615:2: ( rule__Fragment__MemoryAssignment_5 )
            {
             before(grammarAccess.getFragmentAccess().getMemoryAssignment_5()); 
            // InternalMCC.g:1616:2: ( rule__Fragment__MemoryAssignment_5 )
            // InternalMCC.g:1616:3: rule__Fragment__MemoryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__MemoryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getMemoryAssignment_5()); 

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
    // $ANTLR end "rule__Fragment__Group__5__Impl"


    // $ANTLR start "rule__Fragment__Group__6"
    // InternalMCC.g:1624:1: rule__Fragment__Group__6 : rule__Fragment__Group__6__Impl rule__Fragment__Group__7 ;
    public final void rule__Fragment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1628:1: ( rule__Fragment__Group__6__Impl rule__Fragment__Group__7 )
            // InternalMCC.g:1629:2: rule__Fragment__Group__6__Impl rule__Fragment__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Fragment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__7();

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
    // $ANTLR end "rule__Fragment__Group__6"


    // $ANTLR start "rule__Fragment__Group__6__Impl"
    // InternalMCC.g:1636:1: rule__Fragment__Group__6__Impl : ( ',' ) ;
    public final void rule__Fragment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1640:1: ( ( ',' ) )
            // InternalMCC.g:1641:1: ( ',' )
            {
            // InternalMCC.g:1641:1: ( ',' )
            // InternalMCC.g:1642:2: ','
            {
             before(grammarAccess.getFragmentAccess().getCommaKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Fragment__Group__6__Impl"


    // $ANTLR start "rule__Fragment__Group__7"
    // InternalMCC.g:1651:1: rule__Fragment__Group__7 : rule__Fragment__Group__7__Impl rule__Fragment__Group__8 ;
    public final void rule__Fragment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1655:1: ( rule__Fragment__Group__7__Impl rule__Fragment__Group__8 )
            // InternalMCC.g:1656:2: rule__Fragment__Group__7__Impl rule__Fragment__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Fragment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__8();

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
    // $ANTLR end "rule__Fragment__Group__7"


    // $ANTLR start "rule__Fragment__Group__7__Impl"
    // InternalMCC.g:1663:1: rule__Fragment__Group__7__Impl : ( ( rule__Fragment__CommunicationDataAssignment_7 ) ) ;
    public final void rule__Fragment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1667:1: ( ( ( rule__Fragment__CommunicationDataAssignment_7 ) ) )
            // InternalMCC.g:1668:1: ( ( rule__Fragment__CommunicationDataAssignment_7 ) )
            {
            // InternalMCC.g:1668:1: ( ( rule__Fragment__CommunicationDataAssignment_7 ) )
            // InternalMCC.g:1669:2: ( rule__Fragment__CommunicationDataAssignment_7 )
            {
             before(grammarAccess.getFragmentAccess().getCommunicationDataAssignment_7()); 
            // InternalMCC.g:1670:2: ( rule__Fragment__CommunicationDataAssignment_7 )
            // InternalMCC.g:1670:3: rule__Fragment__CommunicationDataAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__CommunicationDataAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getCommunicationDataAssignment_7()); 

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
    // $ANTLR end "rule__Fragment__Group__7__Impl"


    // $ANTLR start "rule__Fragment__Group__8"
    // InternalMCC.g:1678:1: rule__Fragment__Group__8 : rule__Fragment__Group__8__Impl rule__Fragment__Group__9 ;
    public final void rule__Fragment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1682:1: ( rule__Fragment__Group__8__Impl rule__Fragment__Group__9 )
            // InternalMCC.g:1683:2: rule__Fragment__Group__8__Impl rule__Fragment__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Fragment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__9();

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
    // $ANTLR end "rule__Fragment__Group__8"


    // $ANTLR start "rule__Fragment__Group__8__Impl"
    // InternalMCC.g:1690:1: rule__Fragment__Group__8__Impl : ( ']' ) ;
    public final void rule__Fragment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1694:1: ( ( ']' ) )
            // InternalMCC.g:1695:1: ( ']' )
            {
            // InternalMCC.g:1695:1: ( ']' )
            // InternalMCC.g:1696:2: ']'
            {
             before(grammarAccess.getFragmentAccess().getRightSquareBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__Fragment__Group__8__Impl"


    // $ANTLR start "rule__Fragment__Group__9"
    // InternalMCC.g:1705:1: rule__Fragment__Group__9 : rule__Fragment__Group__9__Impl rule__Fragment__Group__10 ;
    public final void rule__Fragment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1709:1: ( rule__Fragment__Group__9__Impl rule__Fragment__Group__10 )
            // InternalMCC.g:1710:2: rule__Fragment__Group__9__Impl rule__Fragment__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Fragment__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__10();

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
    // $ANTLR end "rule__Fragment__Group__9"


    // $ANTLR start "rule__Fragment__Group__9__Impl"
    // InternalMCC.g:1717:1: rule__Fragment__Group__9__Impl : ( ( rule__Fragment__InitAssignment_9 )? ) ;
    public final void rule__Fragment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1721:1: ( ( ( rule__Fragment__InitAssignment_9 )? ) )
            // InternalMCC.g:1722:1: ( ( rule__Fragment__InitAssignment_9 )? )
            {
            // InternalMCC.g:1722:1: ( ( rule__Fragment__InitAssignment_9 )? )
            // InternalMCC.g:1723:2: ( rule__Fragment__InitAssignment_9 )?
            {
             before(grammarAccess.getFragmentAccess().getInitAssignment_9()); 
            // InternalMCC.g:1724:2: ( rule__Fragment__InitAssignment_9 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMCC.g:1724:3: rule__Fragment__InitAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__InitAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getInitAssignment_9()); 

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
    // $ANTLR end "rule__Fragment__Group__9__Impl"


    // $ANTLR start "rule__Fragment__Group__10"
    // InternalMCC.g:1732:1: rule__Fragment__Group__10 : rule__Fragment__Group__10__Impl ;
    public final void rule__Fragment__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1736:1: ( rule__Fragment__Group__10__Impl )
            // InternalMCC.g:1737:2: rule__Fragment__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__10__Impl();

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
    // $ANTLR end "rule__Fragment__Group__10"


    // $ANTLR start "rule__Fragment__Group__10__Impl"
    // InternalMCC.g:1743:1: rule__Fragment__Group__10__Impl : ( ';' ) ;
    public final void rule__Fragment__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1747:1: ( ( ';' ) )
            // InternalMCC.g:1748:1: ( ';' )
            {
            // InternalMCC.g:1748:1: ( ';' )
            // InternalMCC.g:1749:2: ';'
            {
             before(grammarAccess.getFragmentAccess().getSemicolonKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getSemicolonKeyword_10()); 

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
    // $ANTLR end "rule__Fragment__Group__10__Impl"


    // $ANTLR start "rule__System__Group__0"
    // InternalMCC.g:1759:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1763:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMCC.g:1764:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalMCC.g:1771:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1775:1: ( ( 'System' ) )
            // InternalMCC.g:1776:1: ( 'System' )
            {
            // InternalMCC.g:1776:1: ( 'System' )
            // InternalMCC.g:1777:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalMCC.g:1786:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1790:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMCC.g:1791:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalMCC.g:1798:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1802:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalMCC.g:1803:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalMCC.g:1803:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalMCC.g:1804:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalMCC.g:1805:2: ( rule__System__NameAssignment_1 )
            // InternalMCC.g:1805:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalMCC.g:1813:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1817:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalMCC.g:1818:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalMCC.g:1825:1: rule__System__Group__2__Impl : ( ':=' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1829:1: ( ( ':=' ) )
            // InternalMCC.g:1830:1: ( ':=' )
            {
            // InternalMCC.g:1830:1: ( ':=' )
            // InternalMCC.g:1831:2: ':='
            {
             before(grammarAccess.getSystemAccess().getColonEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getColonEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalMCC.g:1840:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1844:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalMCC.g:1845:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalMCC.g:1852:1: rule__System__Group__3__Impl : ( ( rule__System__DevicesAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1856:1: ( ( ( rule__System__DevicesAssignment_3 ) ) )
            // InternalMCC.g:1857:1: ( ( rule__System__DevicesAssignment_3 ) )
            {
            // InternalMCC.g:1857:1: ( ( rule__System__DevicesAssignment_3 ) )
            // InternalMCC.g:1858:2: ( rule__System__DevicesAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getDevicesAssignment_3()); 
            // InternalMCC.g:1859:2: ( rule__System__DevicesAssignment_3 )
            // InternalMCC.g:1859:3: rule__System__DevicesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__System__DevicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDevicesAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalMCC.g:1867:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1871:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalMCC.g:1872:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalMCC.g:1879:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1883:1: ( ( ( rule__System__Group_4__0 )* ) )
            // InternalMCC.g:1884:1: ( ( rule__System__Group_4__0 )* )
            {
            // InternalMCC.g:1884:1: ( ( rule__System__Group_4__0 )* )
            // InternalMCC.g:1885:2: ( rule__System__Group_4__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // InternalMCC.g:1886:2: ( rule__System__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMCC.g:1886:3: rule__System__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__System__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalMCC.g:1894:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1898:1: ( rule__System__Group__5__Impl )
            // InternalMCC.g:1899:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__5__Impl();

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
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalMCC.g:1905:1: rule__System__Group__5__Impl : ( ';' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1909:1: ( ( ';' ) )
            // InternalMCC.g:1910:1: ( ';' )
            {
            // InternalMCC.g:1910:1: ( ';' )
            // InternalMCC.g:1911:2: ';'
            {
             before(grammarAccess.getSystemAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group_4__0"
    // InternalMCC.g:1921:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1925:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // InternalMCC.g:1926:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_4__1();

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
    // $ANTLR end "rule__System__Group_4__0"


    // $ANTLR start "rule__System__Group_4__0__Impl"
    // InternalMCC.g:1933:1: rule__System__Group_4__0__Impl : ( '|' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1937:1: ( ( '|' ) )
            // InternalMCC.g:1938:1: ( '|' )
            {
            // InternalMCC.g:1938:1: ( '|' )
            // InternalMCC.g:1939:2: '|'
            {
             before(grammarAccess.getSystemAccess().getVerticalLineKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getVerticalLineKeyword_4_0()); 

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
    // $ANTLR end "rule__System__Group_4__0__Impl"


    // $ANTLR start "rule__System__Group_4__1"
    // InternalMCC.g:1948:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1952:1: ( rule__System__Group_4__1__Impl )
            // InternalMCC.g:1953:2: rule__System__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_4__1__Impl();

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
    // $ANTLR end "rule__System__Group_4__1"


    // $ANTLR start "rule__System__Group_4__1__Impl"
    // InternalMCC.g:1959:1: rule__System__Group_4__1__Impl : ( ( rule__System__DevicesAssignment_4_1 ) ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1963:1: ( ( ( rule__System__DevicesAssignment_4_1 ) ) )
            // InternalMCC.g:1964:1: ( ( rule__System__DevicesAssignment_4_1 ) )
            {
            // InternalMCC.g:1964:1: ( ( rule__System__DevicesAssignment_4_1 ) )
            // InternalMCC.g:1965:2: ( rule__System__DevicesAssignment_4_1 )
            {
             before(grammarAccess.getSystemAccess().getDevicesAssignment_4_1()); 
            // InternalMCC.g:1966:2: ( rule__System__DevicesAssignment_4_1 )
            // InternalMCC.g:1966:3: rule__System__DevicesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__System__DevicesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDevicesAssignment_4_1()); 

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
    // $ANTLR end "rule__System__Group_4__1__Impl"


    // $ANTLR start "rule__Model__DevicesAssignment_0"
    // InternalMCC.g:1975:1: rule__Model__DevicesAssignment_0 : ( ruleDevice ) ;
    public final void rule__Model__DevicesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1979:1: ( ( ruleDevice ) )
            // InternalMCC.g:1980:2: ( ruleDevice )
            {
            // InternalMCC.g:1980:2: ( ruleDevice )
            // InternalMCC.g:1981:3: ruleDevice
            {
             before(grammarAccess.getModelAccess().getDevicesDeviceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDevicesDeviceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__DevicesAssignment_0"


    // $ANTLR start "rule__Model__ApplicationsAssignment_1"
    // InternalMCC.g:1990:1: rule__Model__ApplicationsAssignment_1 : ( ruleApplication ) ;
    public final void rule__Model__ApplicationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:1994:1: ( ( ruleApplication ) )
            // InternalMCC.g:1995:2: ( ruleApplication )
            {
            // InternalMCC.g:1995:2: ( ruleApplication )
            // InternalMCC.g:1996:3: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ApplicationsAssignment_1"


    // $ANTLR start "rule__Model__SystemsAssignment_2"
    // InternalMCC.g:2005:1: rule__Model__SystemsAssignment_2 : ( ruleSystem ) ;
    public final void rule__Model__SystemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2009:1: ( ( ruleSystem ) )
            // InternalMCC.g:2010:2: ( ruleSystem )
            {
            // InternalMCC.g:2010:2: ( ruleSystem )
            // InternalMCC.g:2011:3: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__SystemsAssignment_2"


    // $ANTLR start "rule__Cloud__NameAssignment_1"
    // InternalMCC.g:2020:1: rule__Cloud__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cloud__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2024:1: ( ( RULE_ID ) )
            // InternalMCC.g:2025:2: ( RULE_ID )
            {
            // InternalMCC.g:2025:2: ( RULE_ID )
            // InternalMCC.g:2026:3: RULE_ID
            {
             before(grammarAccess.getCloudAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cloud__NameAssignment_1"


    // $ANTLR start "rule__Cloud__CpuInstructionsAssignment_3"
    // InternalMCC.g:2035:1: rule__Cloud__CpuInstructionsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Cloud__CpuInstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2039:1: ( ( RULE_INT ) )
            // InternalMCC.g:2040:2: ( RULE_INT )
            {
            // InternalMCC.g:2040:2: ( RULE_INT )
            // InternalMCC.g:2041:3: RULE_INT
            {
             before(grammarAccess.getCloudAccess().getCpuInstructionsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCpuInstructionsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Cloud__CpuInstructionsAssignment_3"


    // $ANTLR start "rule__Cloud__EnergyPerInstructionAssignment_5"
    // InternalMCC.g:2050:1: rule__Cloud__EnergyPerInstructionAssignment_5 : ( RULE_INT ) ;
    public final void rule__Cloud__EnergyPerInstructionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2054:1: ( ( RULE_INT ) )
            // InternalMCC.g:2055:2: ( RULE_INT )
            {
            // InternalMCC.g:2055:2: ( RULE_INT )
            // InternalMCC.g:2056:3: RULE_INT
            {
             before(grammarAccess.getCloudAccess().getEnergyPerInstructionINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getEnergyPerInstructionINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Cloud__EnergyPerInstructionAssignment_5"


    // $ANTLR start "rule__Cloud__EnergyPerMemoryUnitAssignment_7"
    // InternalMCC.g:2065:1: rule__Cloud__EnergyPerMemoryUnitAssignment_7 : ( RULE_INT ) ;
    public final void rule__Cloud__EnergyPerMemoryUnitAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2069:1: ( ( RULE_INT ) )
            // InternalMCC.g:2070:2: ( RULE_INT )
            {
            // InternalMCC.g:2070:2: ( RULE_INT )
            // InternalMCC.g:2071:3: RULE_INT
            {
             before(grammarAccess.getCloudAccess().getEnergyPerMemoryUnitINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getEnergyPerMemoryUnitINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Cloud__EnergyPerMemoryUnitAssignment_7"


    // $ANTLR start "rule__Cloud__EnergyPerDataUnitAssignment_9"
    // InternalMCC.g:2080:1: rule__Cloud__EnergyPerDataUnitAssignment_9 : ( RULE_INT ) ;
    public final void rule__Cloud__EnergyPerDataUnitAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2084:1: ( ( RULE_INT ) )
            // InternalMCC.g:2085:2: ( RULE_INT )
            {
            // InternalMCC.g:2085:2: ( RULE_INT )
            // InternalMCC.g:2086:3: RULE_INT
            {
             before(grammarAccess.getCloudAccess().getEnergyPerDataUnitINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getEnergyPerDataUnitINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Cloud__EnergyPerDataUnitAssignment_9"


    // $ANTLR start "rule__Cloud__ApplicationsAssignment_11"
    // InternalMCC.g:2095:1: rule__Cloud__ApplicationsAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Cloud__ApplicationsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2099:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2100:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2100:2: ( ( RULE_ID ) )
            // InternalMCC.g:2101:3: ( RULE_ID )
            {
             before(grammarAccess.getCloudAccess().getApplicationsApplicationCrossReference_11_0()); 
            // InternalMCC.g:2102:3: ( RULE_ID )
            // InternalMCC.g:2103:4: RULE_ID
            {
             before(grammarAccess.getCloudAccess().getApplicationsApplicationIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getApplicationsApplicationIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getCloudAccess().getApplicationsApplicationCrossReference_11_0()); 

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
    // $ANTLR end "rule__Cloud__ApplicationsAssignment_11"


    // $ANTLR start "rule__DummyDevice__NameAssignment_1"
    // InternalMCC.g:2114:1: rule__DummyDevice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DummyDevice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2118:1: ( ( RULE_ID ) )
            // InternalMCC.g:2119:2: ( RULE_ID )
            {
            // InternalMCC.g:2119:2: ( RULE_ID )
            // InternalMCC.g:2120:3: RULE_ID
            {
             before(grammarAccess.getDummyDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDummyDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DummyDevice__NameAssignment_1"


    // $ANTLR start "rule__DummyDevice__ApplicationsAssignment_3"
    // InternalMCC.g:2129:1: rule__DummyDevice__ApplicationsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DummyDevice__ApplicationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2133:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2134:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2134:2: ( ( RULE_ID ) )
            // InternalMCC.g:2135:3: ( RULE_ID )
            {
             before(grammarAccess.getDummyDeviceAccess().getApplicationsApplicationCrossReference_3_0()); 
            // InternalMCC.g:2136:3: ( RULE_ID )
            // InternalMCC.g:2137:4: RULE_ID
            {
             before(grammarAccess.getDummyDeviceAccess().getApplicationsApplicationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDummyDeviceAccess().getApplicationsApplicationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDummyDeviceAccess().getApplicationsApplicationCrossReference_3_0()); 

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
    // $ANTLR end "rule__DummyDevice__ApplicationsAssignment_3"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // InternalMCC.g:2148:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2152:1: ( ( RULE_ID ) )
            // InternalMCC.g:2153:2: ( RULE_ID )
            {
            // InternalMCC.g:2153:2: ( RULE_ID )
            // InternalMCC.g:2154:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__FragmentsAssignment_3"
    // InternalMCC.g:2163:1: rule__Application__FragmentsAssignment_3 : ( ruleFragment ) ;
    public final void rule__Application__FragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2167:1: ( ( ruleFragment ) )
            // InternalMCC.g:2168:2: ( ruleFragment )
            {
            // InternalMCC.g:2168:2: ( ruleFragment )
            // InternalMCC.g:2169:3: ruleFragment
            {
             before(grammarAccess.getApplicationAccess().getFragmentsFragmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFragmentsFragmentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Application__FragmentsAssignment_3"


    // $ANTLR start "rule__Application__StructureAssignment_4"
    // InternalMCC.g:2178:1: rule__Application__StructureAssignment_4 : ( ruleStructure ) ;
    public final void rule__Application__StructureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2182:1: ( ( ruleStructure ) )
            // InternalMCC.g:2183:2: ( ruleStructure )
            {
            // InternalMCC.g:2183:2: ( ruleStructure )
            // InternalMCC.g:2184:3: ruleStructure
            {
             before(grammarAccess.getApplicationAccess().getStructureStructureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getStructureStructureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Application__StructureAssignment_4"


    // $ANTLR start "rule__Structure__NameAssignment_1"
    // InternalMCC.g:2193:1: rule__Structure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Structure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2197:1: ( ( RULE_ID ) )
            // InternalMCC.g:2198:2: ( RULE_ID )
            {
            // InternalMCC.g:2198:2: ( RULE_ID )
            // InternalMCC.g:2199:3: RULE_ID
            {
             before(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Structure__NameAssignment_1"


    // $ANTLR start "rule__Structure__EdgesAssignment_3"
    // InternalMCC.g:2208:1: rule__Structure__EdgesAssignment_3 : ( ruleEdge ) ;
    public final void rule__Structure__EdgesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2212:1: ( ( ruleEdge ) )
            // InternalMCC.g:2213:2: ( ruleEdge )
            {
            // InternalMCC.g:2213:2: ( ruleEdge )
            // InternalMCC.g:2214:3: ruleEdge
            {
             before(grammarAccess.getStructureAccess().getEdgesEdgeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getEdgesEdgeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Structure__EdgesAssignment_3"


    // $ANTLR start "rule__Edge__StartAssignment_0"
    // InternalMCC.g:2223:1: rule__Edge__StartAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2227:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2228:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2228:2: ( ( RULE_ID ) )
            // InternalMCC.g:2229:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getStartFragmentCrossReference_0_0()); 
            // InternalMCC.g:2230:3: ( RULE_ID )
            // InternalMCC.g:2231:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getStartFragmentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getStartFragmentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getStartFragmentCrossReference_0_0()); 

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
    // $ANTLR end "rule__Edge__StartAssignment_0"


    // $ANTLR start "rule__Edge__OperatorAssignment_1"
    // InternalMCC.g:2242:1: rule__Edge__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__Edge__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2246:1: ( ( ruleOperator ) )
            // InternalMCC.g:2247:2: ( ruleOperator )
            {
            // InternalMCC.g:2247:2: ( ruleOperator )
            // InternalMCC.g:2248:3: ruleOperator
            {
             before(grammarAccess.getEdgeAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getOperatorOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Edge__OperatorAssignment_1"


    // $ANTLR start "rule__Edge__StopAssignment_2"
    // InternalMCC.g:2257:1: rule__Edge__StopAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__StopAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2261:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2262:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2262:2: ( ( RULE_ID ) )
            // InternalMCC.g:2263:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_2_0()); 
            // InternalMCC.g:2264:3: ( RULE_ID )
            // InternalMCC.g:2265:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_2_0()); 

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
    // $ANTLR end "rule__Edge__StopAssignment_2"


    // $ANTLR start "rule__Edge__StopAssignment_3_1"
    // InternalMCC.g:2276:1: rule__Edge__StopAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__StopAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2280:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2281:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2281:2: ( ( RULE_ID ) )
            // InternalMCC.g:2282:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_3_1_0()); 
            // InternalMCC.g:2283:3: ( RULE_ID )
            // InternalMCC.g:2284:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getStopFragmentIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getStopFragmentCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Edge__StopAssignment_3_1"


    // $ANTLR start "rule__Fragment__NameAssignment_1"
    // InternalMCC.g:2295:1: rule__Fragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2299:1: ( ( RULE_ID ) )
            // InternalMCC.g:2300:2: ( RULE_ID )
            {
            // InternalMCC.g:2300:2: ( RULE_ID )
            // InternalMCC.g:2301:3: RULE_ID
            {
             before(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fragment__NameAssignment_1"


    // $ANTLR start "rule__Fragment__InstructionsAssignment_3"
    // InternalMCC.g:2310:1: rule__Fragment__InstructionsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Fragment__InstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2314:1: ( ( RULE_INT ) )
            // InternalMCC.g:2315:2: ( RULE_INT )
            {
            // InternalMCC.g:2315:2: ( RULE_INT )
            // InternalMCC.g:2316:3: RULE_INT
            {
             before(grammarAccess.getFragmentAccess().getInstructionsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getInstructionsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Fragment__InstructionsAssignment_3"


    // $ANTLR start "rule__Fragment__MemoryAssignment_5"
    // InternalMCC.g:2325:1: rule__Fragment__MemoryAssignment_5 : ( RULE_INT ) ;
    public final void rule__Fragment__MemoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2329:1: ( ( RULE_INT ) )
            // InternalMCC.g:2330:2: ( RULE_INT )
            {
            // InternalMCC.g:2330:2: ( RULE_INT )
            // InternalMCC.g:2331:3: RULE_INT
            {
             before(grammarAccess.getFragmentAccess().getMemoryINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getMemoryINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Fragment__MemoryAssignment_5"


    // $ANTLR start "rule__Fragment__CommunicationDataAssignment_7"
    // InternalMCC.g:2340:1: rule__Fragment__CommunicationDataAssignment_7 : ( RULE_INT ) ;
    public final void rule__Fragment__CommunicationDataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2344:1: ( ( RULE_INT ) )
            // InternalMCC.g:2345:2: ( RULE_INT )
            {
            // InternalMCC.g:2345:2: ( RULE_INT )
            // InternalMCC.g:2346:3: RULE_INT
            {
             before(grammarAccess.getFragmentAccess().getCommunicationDataINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getCommunicationDataINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Fragment__CommunicationDataAssignment_7"


    // $ANTLR start "rule__Fragment__InitAssignment_9"
    // InternalMCC.g:2355:1: rule__Fragment__InitAssignment_9 : ( ( 'init' ) ) ;
    public final void rule__Fragment__InitAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2359:1: ( ( ( 'init' ) ) )
            // InternalMCC.g:2360:2: ( ( 'init' ) )
            {
            // InternalMCC.g:2360:2: ( ( 'init' ) )
            // InternalMCC.g:2361:3: ( 'init' )
            {
             before(grammarAccess.getFragmentAccess().getInitInitKeyword_9_0()); 
            // InternalMCC.g:2362:3: ( 'init' )
            // InternalMCC.g:2363:4: 'init'
            {
             before(grammarAccess.getFragmentAccess().getInitInitKeyword_9_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getInitInitKeyword_9_0()); 

            }

             after(grammarAccess.getFragmentAccess().getInitInitKeyword_9_0()); 

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
    // $ANTLR end "rule__Fragment__InitAssignment_9"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalMCC.g:2374:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2378:1: ( ( RULE_ID ) )
            // InternalMCC.g:2379:2: ( RULE_ID )
            {
            // InternalMCC.g:2379:2: ( RULE_ID )
            // InternalMCC.g:2380:3: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__DevicesAssignment_3"
    // InternalMCC.g:2389:1: rule__System__DevicesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__System__DevicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2393:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2394:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2394:2: ( ( RULE_ID ) )
            // InternalMCC.g:2395:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_3_0()); 
            // InternalMCC.g:2396:3: ( RULE_ID )
            // InternalMCC.g:2397:4: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_3_0()); 

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
    // $ANTLR end "rule__System__DevicesAssignment_3"


    // $ANTLR start "rule__System__DevicesAssignment_4_1"
    // InternalMCC.g:2408:1: rule__System__DevicesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__System__DevicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCC.g:2412:1: ( ( ( RULE_ID ) ) )
            // InternalMCC.g:2413:2: ( ( RULE_ID ) )
            {
            // InternalMCC.g:2413:2: ( ( RULE_ID ) )
            // InternalMCC.g:2414:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_4_1_0()); 
            // InternalMCC.g:2415:3: ( RULE_ID )
            // InternalMCC.g:2416:4: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getDevicesDeviceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__System__DevicesAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002184002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});

}