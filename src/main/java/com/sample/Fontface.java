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
    
    public static String GuiWindow(Question question) {
		int option = JOptionPane.showOptionDialog(null, question.content, "Typeface project", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, question.answers, null);
		return question.answers[option];
    }
    
    public static void GuiFinal(String answer) {
    	JOptionPane.showMessageDialog(null, "Your typeface: " + answer, "Typeface project", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static class Answer{
    	public String question;
    	public String variant;
    	
    	public Answer(String question, String variant) {
    		this.question = question;
    		this.variant = variant;
    	}
    }
    
    public static class Question {
    	public String content;
    	public String answers []; 
    	public String choosed;
    	
    	public Question(String content, String [] answers) {
    		this.content = content;
    		this.answers = answers;
    	}
    }
}
