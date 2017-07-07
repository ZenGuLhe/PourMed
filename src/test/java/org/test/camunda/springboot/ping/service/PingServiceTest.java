package org.test.camunda.springboot.ping.service;

import static org.assertj.core.api.Assertions.*;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import static org.springframework.test.annotation.DirtiesContext.ClassMode.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.test.camunda.springboot.CamundaBpmSpringBootApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(CamundaBpmSpringBootApplication.class)
//@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
@DirtiesContext(classMode = BEFORE_EACH_TEST_METHOD)
public class PingServiceTest {

	@Autowired private PingProcessService pingProcessService;

	@Test
	public void pingProcessShouldBeStartable() {
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);


		int processCount = pingProcessService.findInstances().size();
		assertThat(processCount).isEqualTo(0);

		ProcessInstance processInstance = pingProcessService.startProcess();

		assertThat(processInstance).isNotNull();

		processCount = pingProcessService.findInstances().size();
		assertThat(processCount).isEqualTo(1);
	}

	@Test
	public void pingProcessShouldWaitAtPongTask() {
		ProcessInstance processInstance = pingProcessService.startProcess();

		String allNames = pingProcessService
				.findCurrentTasks(processInstance)
				.stream()
				.map(Task::getName)
				.reduce(
						"",
						(a, b) -> a + b
				);
		assertThat(allNames).isEqualTo("Pong");
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
		pingProcessService.findInstances().forEach(System.out::println);
	}

}
