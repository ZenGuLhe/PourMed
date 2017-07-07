package org.test.camunda.springboot.ping.service;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;

import java.util.List;

public interface PingProcessService {
	ProcessInstance startProcess();

	List<ProcessInstance> findInstances();

	List<Task> findCurrentTasks(ProcessInstance processInstance);
}
