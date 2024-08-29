package com.example.workflow.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.model.bpmn.instance.ServiceTask;
import org.camunda.bpm.model.bpmn.instance.camunda.CamundaProperties;
import org.camunda.bpm.model.bpmn.instance.camunda.CamundaProperty;
import org.springframework.stereotype.Service;

@Service("LeaveCheckBalance")
public class LeaveCheckBalance implements JavaDelegate {
    public Expression qaurl; // field injection from leave applicatio2 check-leave process
    public static  final  int LEAVE_BALANCE = 5;
    @SuppressWarnings("unused")
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("qaurl => "+qaurl.getValue(delegateExecution)); // field injection from leave applicatio2 check-leave process

        ServiceTask serviceTask = (ServiceTask) delegateExecution.getBpmnModelElementInstance(); //getting extention values from leave applicatio2 check-leave process
        CamundaProperties camundaProperties = serviceTask.getExtensionElements()
                                                            .getElementsQuery()
                                                            .filterByType(CamundaProperties.class)
                                                            .singleResult();        //getting extention values

        for (CamundaProperty camundaProperty : camundaProperties.getCamundaProperties()){    //getting extention values
            System.out.println("---------");
            System.out.println("name => "+camundaProperty.getCamundaName());        //getting extention values by name
            System.out.println("value => "+camundaProperty.getCamundaValue());      //getting extention values by value
            System.out.println("---------");

        }

        System.out.println("--------------");
if(LEAVE_BALANCE>0){
    System.out.println("emp has balance");
}else {
    System.out.println("emp don't has balance");
}
    }
}
