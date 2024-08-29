package com.example.workflow.asyn;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrintAge implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        System.out.println("printage");
        System.out.println(delegateExecution.getVariable("username"));
        System.out.println(delegateExecution.getVariable("age"));

    }
}
