package org.jahia.modules.workflowTest;


import org.jahia.services.workflow.jbpm.custom.AbstractWorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class JobItemHandler  extends AbstractWorkItemHandler implements WorkItemHandler {

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        System.out.println("xxxx");

        workItemManager.completeWorkItem(workItem.getId(), null);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }

}

