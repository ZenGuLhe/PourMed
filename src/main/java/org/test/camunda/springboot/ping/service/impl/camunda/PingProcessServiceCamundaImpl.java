package org.test.camunda.springboot.ping.service.impl.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.query.Query;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.camunda.springboot.ping.service.PingProcessService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service public class PingProcessServiceCamundaImpl implements PingProcessService {

	public static final String PROCESS_DEFINITION_KEY = "Ping";
	private final RuntimeService runtimeService;
	private TaskService taskService;

	public PingProcessServiceCamundaImpl(@Autowired RuntimeService runtimeService, @Autowired TaskService taskService) {
		this.runtimeService = runtimeService;
		this.taskService = taskService;
	}

	@Override public ProcessInstance startProcess() {
		return runtimeService.startProcessInstanceByKey(PROCESS_DEFINITION_KEY);
	}

	@Override public List<ProcessInstance> findInstances() {
		return runtimeService.createProcessInstanceQuery().processDefinitionKey(PROCESS_DEFINITION_KEY).list();
	}

	@Override public List<Task> findCurrentTasks(ProcessInstance processInstance) {
		return Stream.of(processInstance)
				.map(ProcessInstance::getProcessInstanceId)
				.map(taskService.createTaskQuery()::processInstanceId)
				.map(Query::list)
				.flatMap(List::stream)
				.collect(Collectors.toList());

	}
}
