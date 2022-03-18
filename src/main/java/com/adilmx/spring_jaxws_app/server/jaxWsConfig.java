package com.adilmx.spring_jaxws_app.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class jaxWsConfig {
	
	@Bean
	public SimpleJaxWsServiceExporter simpleJaxWsServiceExporter() {
		SimpleJaxWsServiceExporter simpleJaxWsServiceExporter = new SimpleJaxWsServiceExporter();
		simpleJaxWsServiceExporter.setBaseAddress("http://0.0.0.0:8085/");
		return simpleJaxWsServiceExporter;
	}
}
