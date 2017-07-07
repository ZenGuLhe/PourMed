package org.test.camunda.springboot;

import org.camunda.bpm.ProcessEngineService;
import org.camunda.bpm.engine.*;
import org.camunda.bpm.engine.query.Query;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.runtime.ProcessInstanceQuery;
import org.camunda.bpm.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class CamundaBpmSpringBootApplication {

	private RuntimeService rts;

//	public CamundaBpmSpringBootApplication(
//			@Autowired
//					RuntimeService rts,
//			@Autowired RepositoryService repositoryService,
//			@Autowired TaskService taskService
//	) {
//		this.rts = rts;
//		String processKey = "Ping";
//		for (int i = 0; i < 30; i++) {
//			ProcessInstance myProcess = rts.startProcessInstanceByKey(processKey, new HashMap<String,Object>(){{
//				put("value","Pong !");
//			}});
//			System.out.println("myProcess = " + myProcess);
//			System.out.println("myProcess.isSuspended() = " + myProcess.isSuspended());
//			System.out.println("myProcess.isEnded() = " + myProcess.isEnded());
//		}
//
//
//
//
//		List<ProcessInstance> processInstances = rts
//				.createProcessInstanceQuery()
//				.processDefinitionKey(processKey)
//				.list();
//		System.out.println("processInstances.size() = " + processInstances.size());
//
//		processInstances
//				.stream()
//				.peek(x->System.out.println("ProcessInstance :"))
//				.peek(System.out::println)
//				.map(ProcessInstance::getProcessInstanceId)
//				.map(taskService.createTaskQuery()::processInstanceId)
//				.map(Query::list)
//				.flatMap(List::stream)
//				.peek(x->System.out.println("Task"))
//				.peek(System.out::println)
//				.map(Task::getName)
//				.forEach(System.out::println);
//
//
//		System.out.println("fin processInstances");
//	}

	public static void main(String... args) {
		SpringApplication.run(CamundaBpmSpringBootApplication.class, args);
	}
}
