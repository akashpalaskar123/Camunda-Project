package com.example.workflow.listeners;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class exampleTaskListeners implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println(delegateTask.getVariable("age"));
        System.out.println("task listeners execeuted");
    }
}
