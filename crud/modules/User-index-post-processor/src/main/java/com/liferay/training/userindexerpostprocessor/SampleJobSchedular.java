package com.liferay.training.userindexerpostprocessor;

import com.liferay.dispatch.executor.BaseDispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutorOutput;
import com.liferay.dispatch.model.DispatchTrigger;

import org.osgi.service.component.annotations.Component;

@Component( immediate = true, property = {
		  
		  "dispatch.task.executor.name=Sample Scheduler",
		  "dispatch.task.executor.type=dnebing.job-01" 
		  }, 
		service =  DispatchTaskExecutor.class 
		)
public class SampleJobSchedular extends BaseDispatchTaskExecutor{

	@Override
	public String getName() {
		
		return "My Sample Job Scheduler Showing";
	}

	@Override
	public void doExecute(DispatchTrigger dispatchTrigger, DispatchTaskExecutorOutput dispatchTaskExecutorOutput)
			throws Exception {
		System.out.println("Sample Data Trigger in scheduler" );
		dispatchTaskExecutorOutput.setOutput("Using Scheduler");
		
	}

}
