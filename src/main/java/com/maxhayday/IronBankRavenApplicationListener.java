package com.maxhayday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IronBankRavenApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("the crow flew in to the " + ravenProperties.getDestination());
    }
}
