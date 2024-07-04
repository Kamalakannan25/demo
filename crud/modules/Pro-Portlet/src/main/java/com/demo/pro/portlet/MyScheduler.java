package com.demo.pro.portlet;

import com.liferay.dispatch.executor.BaseDispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutorOutput;
import com.liferay.dispatch.model.DispatchTrigger;

import org.osgi.service.component.annotations.Component;

@Component( immediate = true, property = {
		  
		  "dispatch.task.executor.name=Kamal Scheduler",
		  "dispatch.task.executor.type=dnebing.job-01" }, service =
		  DispatchTaskExecutor.class )

public class MyScheduler extends BaseDispatchTaskExecutor{

	@Override
	public String getName() {
		return "My Job Scheduler Showing";
	}

	@Override
	public void doExecute(DispatchTrigger dispatchTrigger, DispatchTaskExecutorOutput dispatchTaskExecutorOutput)
			throws Exception {
		System.out.println("Data Trigger in scheduler" );
		dispatchTaskExecutorOutput.setOutput("Using Svheduler");
	}

}
