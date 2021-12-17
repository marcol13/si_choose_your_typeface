package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javax.swing.JOptionPane;

/**
 * This is a sample class to launch a rule.
 */
public class Fontface {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
        	
        	
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
            // go !
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    public static String GuiWindow(String content, String [] answers) {
		int option = JOptionPane.showOptionDialog(null, content, "Typeface project", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, null);
		return answers[option];
    }
    
    public static void GuiFinal(String answer) {
    	JOptionPane.showMessageDialog(null, answer, "Typeface project", JOptionPane.PLAIN_MESSAGE);
    }
}
