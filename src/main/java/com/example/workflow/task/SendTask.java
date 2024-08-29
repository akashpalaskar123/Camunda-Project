package com.example.workflow.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("SendTask")
public class SendTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Send Task");
        System.out.println("-------------------");
        System.out.println(delegateExecution.getVariable("global-gender"));
        System.out.println("--------------");
    }
}
