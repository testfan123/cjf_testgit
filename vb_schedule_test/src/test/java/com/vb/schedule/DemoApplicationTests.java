package com.vb.schedule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vb.entity.Result;
import com.vb.entity.Task;
import com.vb.feign.TaskProduceClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	TaskProduceClient taskProduceClient;
	
	@Test
	public void contextLoads() {
		Task task= new Task();
		task.setMsg("121212");
		for (int i = 0; i < 2; i++) {
			Result result = taskProduceClient.addTask(task);
			System.out.println("-----------"+result);
		}
	}

}
