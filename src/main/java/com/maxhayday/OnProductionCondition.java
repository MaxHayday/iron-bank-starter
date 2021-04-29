package com.maxhayday;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnProductionCondition implements Condition {
    private static Boolean enabled;
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (enabled == null){
            String answer = JOptionPane.showInputDialog("Its production, a? ");
            enabled = answer.toLowerCase().contains("yes");
        }
        return enabled;
    }
}
