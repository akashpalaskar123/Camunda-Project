package com.example.workflow.listeners;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class sampleExecutionListeners implements ExecutionListener {


    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        System.out.println("executing listeners ");
    }
}
