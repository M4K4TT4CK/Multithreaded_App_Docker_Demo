package edu.wgu.d387_sample_code.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable{

    Locale locale;

    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage(){
        ResourceBundle resBundle = ResourceBundle.getBundle("welcome", locale);
        return resBundle.getString("welcome");
    }

    @Override
    public void run() {
        System.out.println("Threads: " + getWelcomeMessage());
    }

}
