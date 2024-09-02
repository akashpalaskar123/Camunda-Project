package com.example.workflow.prallel_process;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Arrays;
import java.util.List;

public class ServiceTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        List<String> list = Arrays.asList("foo","bdd","eee");
        delegateExecution.setVariable("list",list);
    }
}
