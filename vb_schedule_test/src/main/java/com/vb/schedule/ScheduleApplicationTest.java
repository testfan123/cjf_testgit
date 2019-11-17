package com.vb.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient //注册中心客户端支持
@EnableFeignClients(basePackages= {"com.vb.feign"})    //开启feign支持
public class ScheduleApplicationTest {
	
	public static void main(String[] args) {
		 SpringApplication.run(ScheduleApplicationTest.class,args);
	}

}
