package com.example.workflow.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("ServiceAgePrint")
public class ServiceAgePrint implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("output is : "+delegateExecution.getVariable("age"));

        System.out.println("output is : "+delegateExecution.getVariable("adult-or-child"));

        System.out.println("-----------------------");
        System.out.println("output is : "+delegateExecution.getVariable("local-gender"));
        System.out.println("output is : "+delegateExecution.getVariable("global-gender"));


    }
}
