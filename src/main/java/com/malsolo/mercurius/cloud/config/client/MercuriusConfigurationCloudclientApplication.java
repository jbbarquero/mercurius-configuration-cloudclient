package com.malsolo.mercurius.cloud.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MercuriusConfigurationCloudclientApplication {

	@Autowired
	void setEnvironment(Environment e) {
		System.out.println(e.getProperty("configuration.projectName"));
	}

	public static void main(String[] args) {
        SpringApplication.run(MercuriusConfigurationCloudclientApplication.class, args);
    }
}
