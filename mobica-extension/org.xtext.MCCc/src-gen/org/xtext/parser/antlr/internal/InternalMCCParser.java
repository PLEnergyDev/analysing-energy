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
import org.xtext.services.MCCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cloud'", "'['", "','", "']'", "';'", "'DummyDevice'", "'Application'", "'{'", "'}'", "'Structure'", "'Fragment'", "'init'", "'System'", "':='", "'|'", "'-->'", "'--|'", "'--::'"
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

        public InternalMCCParser(TokenStream input, MCCGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MCCGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMCC.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMCC.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMCC.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMCC.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_devices_0_0= ruleDevice ) ) | ( (lv_applications_1_0= ruleApplication ) ) | ( (lv_systems_2_0= ruleSystem ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_devices_0_0 = null;

        EObject lv_applications_1_0 = null;

        EObject lv_systems_2_0 = null;



        	enterRule();

        try {
            // InternalMCC.g:78:2: ( ( ( (lv_devices_0_0= ruleDevice ) ) | ( (lv_applications_1_0= ruleApplication ) ) | ( (lv_systems_2_0= ruleSystem ) ) )* )
            // InternalMCC.g:79:2: ( ( (lv_devices_0_0= ruleDevice ) ) | ( (lv_applications_1_0= ruleApplication ) ) | ( (lv_systems_2_0= ruleSystem ) ) )*
            {
            // InternalMCC.g:79:2: ( ( (lv_devices_0_0= ruleDevice ) ) | ( (lv_applications_1_0= ruleApplication ) ) | ( (lv_systems_2_0= ruleSystem ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                case 16:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                    {
                    alt1=2;
                    }
                    break;
                case 23:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalMCC.g:80:3: ( (lv_devices_0_0= ruleDevice ) )
            	    {
            	    // InternalMCC.g:80:3: ( (lv_devices_0_0= ruleDevice ) )
            	    // InternalMCC.g:81:4: (lv_devices_0_0= ruleDevice )
            	    {
            	    // InternalMCC.g:81:4: (lv_devices_0_0= ruleDevice )
            	    // InternalMCC.g:82:5: lv_devices_0_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDevicesDeviceParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_devices_0_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_0_0,
            	    						"org.xtext.MCC.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMCC.g:100:3: ( (lv_applications_1_0= ruleApplication ) )
            	    {
            	    // InternalMCC.g:100:3: ( (lv_applications_1_0= ruleApplication ) )
            	    // InternalMCC.g:101:4: (lv_applications_1_0= ruleApplication )
            	    {
            	    // InternalMCC.g:101:4: (lv_applications_1_0= ruleApplication )
            	    // InternalMCC.g:102:5: lv_applications_1_0= ruleApplication
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_applications_1_0=ruleApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"applications",
            	    						lv_applications_1_0,
            	    						"org.xtext.MCC.Application");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMCC.g:120:3: ( (lv_systems_2_0= ruleSystem ) )
            	    {
            	    // InternalMCC.g:120:3: ( (lv_systems_2_0= ruleSystem ) )
            	    // InternalMCC.g:121:4: (lv_systems_2_0= ruleSystem )
            	    {
            	    // InternalMCC.g:121:4: (lv_systems_2_0= ruleSystem )
            	    // InternalMCC.g:122:5: lv_systems_2_0= ruleSystem
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_systems_2_0=ruleSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_2_0,
            	    						"org.xtext.MCC.System");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDevice"
    // InternalMCC.g:143:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalMCC.g:143:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalMCC.g:144:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMCC.g:150:1: ruleDevice returns [EObject current=null] : (this_Cloud_0= ruleCloud | this_DummyDevice_1= ruleDummyDevice ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Cloud_0 = null;

        EObject this_DummyDevice_1 = null;



        	enterRule();

        try {
            // InternalMCC.g:156:2: ( (this_Cloud_0= ruleCloud | this_DummyDevice_1= ruleDummyDevice ) )
            // InternalMCC.g:157:2: (this_Cloud_0= ruleCloud | this_DummyDevice_1= ruleDummyDevice )
            {
            // InternalMCC.g:157:2: (this_Cloud_0= ruleCloud | this_DummyDevice_1= ruleDummyDevice )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMCC.g:158:3: this_Cloud_0= ruleCloud
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getCloudParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cloud_0=ruleCloud();

                    state._fsp--;


                    			current = this_Cloud_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCC.g:167:3: this_DummyDevice_1= ruleDummyDevice
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getDummyDeviceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DummyDevice_1=ruleDummyDevice();

                    state._fsp--;


                    			current = this_DummyDevice_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleCloud"
    // InternalMCC.g:179:1: entryRuleCloud returns [EObject current=null] : iv_ruleCloud= ruleCloud EOF ;
    public final EObject entryRuleCloud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloud = null;


        try {
            // InternalMCC.g:179:46: (iv_ruleCloud= ruleCloud EOF )
            // InternalMCC.g:180:2: iv_ruleCloud= ruleCloud EOF
            {
             newCompositeNode(grammarAccess.getCloudRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloud=ruleCloud();

            state._fsp--;

             current =iv_ruleCloud; 
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
    // $ANTLR end "entryRuleCloud"


    // $ANTLR start "ruleCloud"
    // InternalMCC.g:186:1: ruleCloud returns [EObject current=null] : (otherlv_0= 'Cloud' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_cpuInstructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_energyPerInstruction_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_energyPerMemoryUnit_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_energyPerDataUnit_9_0= RULE_INT ) ) otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) otherlv_12= ']' otherlv_13= ';' ) ;
    public final EObject ruleCloud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cpuInstructions_3_0=null;
        Token otherlv_4=null;
        Token lv_energyPerInstruction_5_0=null;
        Token otherlv_6=null;
        Token lv_energyPerMemoryUnit_7_0=null;
        Token otherlv_8=null;
        Token lv_energyPerDataUnit_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMCC.g:192:2: ( (otherlv_0= 'Cloud' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_cpuInstructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_energyPerInstruction_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_energyPerMemoryUnit_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_energyPerDataUnit_9_0= RULE_INT ) ) otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) otherlv_12= ']' otherlv_13= ';' ) )
            // InternalMCC.g:193:2: (otherlv_0= 'Cloud' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_cpuInstructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_energyPerInstruction_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_energyPerMemoryUnit_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_energyPerDataUnit_9_0= RULE_INT ) ) otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) otherlv_12= ']' otherlv_13= ';' )
            {
            // InternalMCC.g:193:2: (otherlv_0= 'Cloud' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_cpuInstructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_energyPerInstruction_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_energyPerMemoryUnit_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_energyPerDataUnit_9_0= RULE_INT ) ) otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) otherlv_12= ']' otherlv_13= ';' )
            // InternalMCC.g:194:3: otherlv_0= 'Cloud' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_cpuInstructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_energyPerInstruction_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_energyPerMemoryUnit_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_energyPerDataUnit_9_0= RULE_INT ) ) otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) otherlv_12= ']' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloudAccess().getCloudKeyword_0());
            		
            // InternalMCC.g:198:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMCC.g:199:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMCC.g:199:4: (lv_name_1_0= RULE_ID )
            // InternalMCC.g:200:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCloudAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCloudAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMCC.g:220:3: ( (lv_cpuInstructions_3_0= RULE_INT ) )
            // InternalMCC.g:221:4: (lv_cpuInstructions_3_0= RULE_INT )
            {
            // InternalMCC.g:221:4: (lv_cpuInstructions_3_0= RULE_INT )
            // InternalMCC.g:222:5: lv_cpuInstructions_3_0= RULE_INT
            {
            lv_cpuInstructions_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_cpuInstructions_3_0, grammarAccess.getCloudAccess().getCpuInstructionsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cpuInstructions",
            						lv_cpuInstructions_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCloudAccess().getCommaKeyword_4());
            		
            // InternalMCC.g:242:3: ( (lv_energyPerInstruction_5_0= RULE_INT ) )
            // InternalMCC.g:243:4: (lv_energyPerInstruction_5_0= RULE_INT )
            {
            // InternalMCC.g:243:4: (lv_energyPerInstruction_5_0= RULE_INT )
            // InternalMCC.g:244:5: lv_energyPerInstruction_5_0= RULE_INT
            {
            lv_energyPerInstruction_5_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_energyPerInstruction_5_0, grammarAccess.getCloudAccess().getEnergyPerInstructionINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"energyPerInstruction",
            						lv_energyPerInstruction_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCloudAccess().getCommaKeyword_6());
            		
            // InternalMCC.g:264:3: ( (lv_energyPerMemoryUnit_7_0= RULE_INT ) )
            // InternalMCC.g:265:4: (lv_energyPerMemoryUnit_7_0= RULE_INT )
            {
            // InternalMCC.g:265:4: (lv_energyPerMemoryUnit_7_0= RULE_INT )
            // InternalMCC.g:266:5: lv_energyPerMemoryUnit_7_0= RULE_INT
            {
            lv_energyPerMemoryUnit_7_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_energyPerMemoryUnit_7_0, grammarAccess.getCloudAccess().getEnergyPerMemoryUnitINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"energyPerMemoryUnit",
            						lv_energyPerMemoryUnit_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getCloudAccess().getCommaKeyword_8());
            		
            // InternalMCC.g:286:3: ( (lv_energyPerDataUnit_9_0= RULE_INT ) )
            // InternalMCC.g:287:4: (lv_energyPerDataUnit_9_0= RULE_INT )
            {
            // InternalMCC.g:287:4: (lv_energyPerDataUnit_9_0= RULE_INT )
            // InternalMCC.g:288:5: lv_energyPerDataUnit_9_0= RULE_INT
            {
            lv_energyPerDataUnit_9_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_energyPerDataUnit_9_0, grammarAccess.getCloudAccess().getEnergyPerDataUnitINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"energyPerDataUnit",
            						lv_energyPerDataUnit_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getCloudAccess().getCommaKeyword_10());
            		
            // InternalMCC.g:308:3: ( (otherlv_11= RULE_ID ) )
            // InternalMCC.g:309:4: (otherlv_11= RULE_ID )
            {
            // InternalMCC.g:309:4: (otherlv_11= RULE_ID )
            // InternalMCC.g:310:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_11, grammarAccess.getCloudAccess().getApplicationsApplicationCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getCloudAccess().getRightSquareBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCloudAccess().getSemicolonKeyword_13());
            		

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
    // $ANTLR end "ruleCloud"


    // $ANTLR start "entryRuleDummyDevice"
    // InternalMCC.g:333:1: entryRuleDummyDevice returns [EObject current=null] : iv_ruleDummyDevice= ruleDummyDevice EOF ;
    public final EObject entryRuleDummyDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDummyDevice = null;


        try {
            // InternalMCC.g:333:52: (iv_ruleDummyDevice= ruleDummyDevice EOF )
            // InternalMCC.g:334:2: iv_ruleDummyDevice= ruleDummyDevice EOF
            {
             newCompositeNode(grammarAccess.getDummyDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDummyDevice=ruleDummyDevice();

            state._fsp--;

             current =iv_ruleDummyDevice; 
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
    // $ANTLR end "entryRuleDummyDevice"


    // $ANTLR start "ruleDummyDevice"
    // InternalMCC.g:340:1: ruleDummyDevice returns [EObject current=null] : (otherlv_0= 'DummyDevice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= ';' ) ;
    public final EObject ruleDummyDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMCC.g:346:2: ( (otherlv_0= 'DummyDevice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= ';' ) )
            // InternalMCC.g:347:2: (otherlv_0= 'DummyDevice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= ';' )
            {
            // InternalMCC.g:347:2: (otherlv_0= 'DummyDevice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= ';' )
            // InternalMCC.g:348:3: otherlv_0= 'DummyDevice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDummyDeviceAccess().getDummyDeviceKeyword_0());
            		
            // InternalMCC.g:352:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMCC.g:353:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMCC.g:353:4: (lv_name_1_0= RULE_ID )
            // InternalMCC.g:354:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDummyDeviceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDummyDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDummyDeviceAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMCC.g:374:3: ( (otherlv_3= RULE_ID ) )
            // InternalMCC.g:375:4: (otherlv_3= RULE_ID )
            {
            // InternalMCC.g:375:4: (otherlv_3= RULE_ID )
            // InternalMCC.g:376:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDummyDeviceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getDummyDeviceAccess().getApplicationsApplicationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDummyDeviceAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDummyDeviceAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleDummyDevice"


    // $ANTLR start "entryRuleApplication"
    // InternalMCC.g:399:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMCC.g:399:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalMCC.g:400:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMCC.g:406:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )+ ( (lv_structure_4_0= ruleStructure ) ) otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_fragments_3_0 = null;

        EObject lv_structure_4_0 = null;



        	enterRule();

        try {
            // InternalMCC.g:412:2: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )+ ( (lv_structure_4_0= ruleStructure ) ) otherlv_5= '}' otherlv_6= ';' ) )
            // InternalMCC.g:413:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )+ ( (lv_structure_4_0= ruleStructure ) ) otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalMCC.g:413:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )+ ( (lv_structure_4_0= ruleStructure ) ) otherlv_5= '}' otherlv_6= ';' )
            // InternalMCC.g:414:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )+ ( (lv_structure_4_0= ruleStructure ) ) otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalMCC.g:418:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMCC.g:419:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMCC.g:419:4: (lv_name_1_0= RULE_ID )
            // InternalMCC.g:420:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMCC.g:440:3: ( (lv_fragments_3_0= ruleFragment ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMCC.g:441:4: (lv_fragments_3_0= ruleFragment )
            	    {
            	    // InternalMCC.g:441:4: (lv_fragments_3_0= ruleFragment )
            	    // InternalMCC.g:442:5: lv_fragments_3_0= ruleFragment
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getFragmentsFragmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_fragments_3_0=ruleFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_3_0,
            	    						"org.xtext.MCC.Fragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalMCC.g:459:3: ( (lv_structure_4_0= ruleStructure ) )
            // InternalMCC.g:460:4: (lv_structure_4_0= ruleStructure )
            {
            // InternalMCC.g:460:4: (lv_structure_4_0= ruleStructure )
            // InternalMCC.g:461:5: lv_structure_4_0= ruleStructure
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getStructureStructureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_structure_4_0=ruleStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"structure",
            						lv_structure_4_0,
            						"org.xtext.MCC.Structure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleStructure"
    // InternalMCC.g:490:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalMCC.g:490:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalMCC.g:491:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalMCC.g:497:1: ruleStructure returns [EObject current=null] : (otherlv_0= 'Structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_edges_3_0= ruleEdge ) )+ otherlv_4= ']' otherlv_5= ';' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_edges_3_0 = null;



        	enterRule();

        try {
            // InternalMCC.g:503:2: ( (otherlv_0= 'Structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_edges_3_0= ruleEdge ) )+ otherlv_4= ']' otherlv_5= ';' ) )
            // InternalMCC.g:504:2: (otherlv_0= 'Structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_edges_3_0= ruleEdge ) )+ otherlv_4= ']' otherlv_5= ';' )
            {
            // InternalMCC.g:504:2: (otherlv_0= 'Structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_edges_3_0= ruleEdge ) )+ otherlv_4= ']' otherlv_5= ';' )
            // InternalMCC.g:505:3: otherlv_0= 'Structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_edges_3_0= ruleEdge ) )+ otherlv_4= ']' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStructureAccess().getStructureKeyword_0());
            		
            // InternalMCC.g:509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMCC.g:510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMCC.g:510:4: (lv_name_1_0= RULE_ID )
            // InternalMCC.g:511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStructureAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMCC.g:531:3: ( (lv_edges_3_0= ruleEdge ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMCC.g:532:4: (lv_edges_3_0= ruleEdge )
            	    {
            	    // InternalMCC.g:532:4: (lv_edges_3_0= ruleEdge )
            	    // InternalMCC.g:533:5: lv_edges_3_0= ruleEdge
            	    {

            	    					newCompositeNode(grammarAccess.getStructureAccess().getEdgesEdgeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_edges_3_0=ruleEdge();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStructureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edges",
            	    						lv_edges_3_0,
            	    						"org.xtext.MCC.Edge");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getStructureAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStructureAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleEdge"
    // InternalMCC.g:562:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalMCC.g:562:45: (iv_ruleEdge= ruleEdge EOF )
            // InternalMCC.g:563:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalMCC.g:569:1: ruleEdge returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalMCC.g:575:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalMCC.g:576:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalMCC.g:576:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalMCC.g:577:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';'
            {
            // InternalMCC.g:577:3: ( (otherlv_0= RULE_ID ) )
            // InternalMCC.g:578:4: (otherlv_0= RULE_ID )
            {
            // InternalMCC.g:578:4: (otherlv_0= RULE_ID )
            // InternalMCC.g:579:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getEdgeAccess().getStartFragmentCrossReference_0_0());
            				

            }


            }

            // InternalMCC.g:590:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalMCC.g:591:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalMCC.g:591:4: (lv_operator_1_0= ruleOperator )
            // InternalMCC.g:592:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEdgeAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEdgeRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.MCC.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMCC.g:609:3: ( (otherlv_2= RULE_ID ) )
            // InternalMCC.g:610:4: (otherlv_2= RULE_ID )
            {
            // InternalMCC.g:610:4: (otherlv_2= RULE_ID )
            // InternalMCC.g:611:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getEdgeAccess().getStopFragmentCrossReference_2_0());
            				

            }


            }

            // InternalMCC.g:622:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMCC.g:623:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEdgeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMCC.g:627:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalMCC.g:628:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMCC.g:628:5: (otherlv_4= RULE_ID )
            	    // InternalMCC.g:629:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEdgeRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_4, grammarAccess.getEdgeAccess().getStopFragmentCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEdgeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleFragment"
    // InternalMCC.g:649:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalMCC.g:649:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalMCC.g:650:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalMCC.g:656:1: ruleFragment returns [EObject current=null] : (otherlv_0= 'Fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_instructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_communicationData_7_0= RULE_INT ) ) otherlv_8= ']' ( (lv_init_9_0= 'init' ) )? otherlv_10= ';' ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_instructions_3_0=null;
        Token otherlv_4=null;
        Token lv_memory_5_0=null;
        Token otherlv_6=null;
        Token lv_communicationData_7_0=null;
        Token otherlv_8=null;
        Token lv_init_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMCC.g:662:2: ( (otherlv_0= 'Fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_instructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_communicationData_7_0= RULE_INT ) ) otherlv_8= ']' ( (lv_init_9_0= 'init' ) )? otherlv_10= ';' ) )
            // InternalMCC.g:663:2: (otherlv_0= 'Fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_instructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_communicationData_7_0= RULE_INT ) ) otherlv_8= ']' ( (lv_init_9_0= 'init' ) )? otherlv_10= ';' )
            {
            // InternalMCC.g:663:2: (otherlv_0= 'Fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_instructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_communicationData_7_0= RULE_INT ) ) otherlv_8= ']' ( (lv_init_9_0= 'init' ) )? otherlv_10= ';' )
            // InternalMCC.g:664:3: otherlv_0= 'Fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_instructions_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_communicationData_7_0= RULE_INT ) ) otherlv_8= ']' ( (lv_init_9_0= 'init' ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAccess().getFragmentKeyword_0());
            		
            // InternalMCC.g:668:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMCC.g:669:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMCC.g:669:4: (lv_name_1_0= RULE_ID )
            // InternalMCC.g:670:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFragmentAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMCC.g:690:3: ( (lv_instructions_3_0= RULE_INT ) )
            // InternalMCC.g:691:4: (lv_instructions_3_0= RULE_INT )
            {
            // InternalMCC.g:691:4: (lv_instructions_3_0= RULE_INT )
            // InternalMCC.g:692:5: lv_instructions_3_0= RULE_INT
            {
            lv_instructions_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_instructions_3_0, grammarAccess.getFragmentAccess().getInstructionsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"instructions",
            						lv_instructions_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFragmentAccess().getCommaKeyword_4());
            		
            // InternalMCC.g:712:3: ( (lv_memory_5_0= RULE_INT ) )
            // InternalMCC.g:713:4: (lv_memory_5_0= RULE_INT )
            {
            // InternalMCC.g:713:4: (lv_memory_5_0= RULE_INT )
            // InternalMCC.g:714:5: lv_memory_5_0= RULE_INT
            {
            lv_memory_5_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_memory_5_0, grammarAccess.getFragmentAccess().getMemoryINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"memory",
            						lv_memory_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getFragmentAccess().getCommaKeyword_6());
            		
            // InternalMCC.g:734:3: ( (lv_communicationData_7_0= RULE_INT ) )
            // InternalMCC.g:735:4: (lv_communicationData_7_0= RULE_INT )
            {
            // InternalMCC.g:735:4: (lv_communicationData_7_0= RULE_INT )
            // InternalMCC.g:736:5: lv_communicationData_7_0= RULE_INT
            {
            lv_communicationData_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_communicationData_7_0, grammarAccess.getFragmentAccess().getCommunicationDataINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"communicationData",
            						lv_communicationData_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getFragmentAccess().getRightSquareBracketKeyword_8());
            		
            // InternalMCC.g:756:3: ( (lv_init_9_0= 'init' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMCC.g:757:4: (lv_init_9_0= 'init' )
                    {
                    // InternalMCC.g:757:4: (lv_init_9_0= 'init' )
                    // InternalMCC.g:758:5: lv_init_9_0= 'init'
                    {
                    lv_init_9_0=(Token)match(input,22,FOLLOW_9); 

                    					newLeafNode(lv_init_9_0, grammarAccess.getFragmentAccess().getInitInitKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_9_0, "init");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFragmentAccess().getSemicolonKeyword_10());
            		

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleSystem"
    // InternalMCC.g:778:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalMCC.g:778:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalMCC.g:779:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMCC.g:785:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMCC.g:791:2: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // InternalMCC.g:792:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // InternalMCC.g:792:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // InternalMCC.g:793:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalMCC.g:797:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMCC.g:798:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMCC.g:798:4: (lv_name_1_0= RULE_ID )
            // InternalMCC.g:799:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getColonEqualsSignKeyword_2());
            		
            // InternalMCC.g:819:3: ( (otherlv_3= RULE_ID ) )
            // InternalMCC.g:820:4: (otherlv_3= RULE_ID )
            {
            // InternalMCC.g:820:4: (otherlv_3= RULE_ID )
            // InternalMCC.g:821:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_3_0());
            				

            }


            }

            // InternalMCC.g:832:3: (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMCC.g:833:4: otherlv_4= '|' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalMCC.g:837:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalMCC.g:838:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMCC.g:838:5: (otherlv_5= RULE_ID )
            	    // InternalMCC.g:839:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSystemRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getDevicesDeviceCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "ruleOperator"
    // InternalMCC.g:859:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '--|' ) | (enumLiteral_2= '--::' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMCC.g:865:2: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '--|' ) | (enumLiteral_2= '--::' ) ) )
            // InternalMCC.g:866:2: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '--|' ) | (enumLiteral_2= '--::' ) )
            {
            // InternalMCC.g:866:2: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '--|' ) | (enumLiteral_2= '--::' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMCC.g:867:3: (enumLiteral_0= '-->' )
                    {
                    // InternalMCC.g:867:3: (enumLiteral_0= '-->' )
                    // InternalMCC.g:868:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getNDCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getNDCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMCC.g:875:3: (enumLiteral_1= '--|' )
                    {
                    // InternalMCC.g:875:3: (enumLiteral_1= '--|' )
                    // InternalMCC.g:876:4: enumLiteral_1= '--|'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getPAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getPAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMCC.g:883:3: (enumLiteral_2= '--::' )
                    {
                    // InternalMCC.g:883:3: (enumLiteral_2= '--::' )
                    // InternalMCC.g:884:4: enumLiteral_2= '--::'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getSEQEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000830802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002008000L});

}