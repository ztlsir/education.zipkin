package com.ztlsir.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class EducationZipkinApplication {
	public static void main(String[] args) {
		SpringApplication.run(EducationZipkinApplication.class, args);
	}
}