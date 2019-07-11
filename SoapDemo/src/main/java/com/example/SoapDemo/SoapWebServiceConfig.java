package com.example.SoapDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs //Enable SOAP Web Service features in this Spring Boot application	
@Configuration //Spring configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter{
	
	@Bean
	// We would want to create message dispatcher servlet to act as a front controller
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context)
	{
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/soapWS/*");//Configure the URL to the web services.
	}
	
	@Bean
	public XsdSchema salesTerritorySchema()
	{
		return new SimpleXsdSchema(new ClassPathResource("SalesTerritory.xsd")); //creating schema from xsd for WSDL
	}
	
	@Bean(name = "territory")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema salesTerritorySchema) {
//		salesTerritorySchema=salesTerritorySchema();
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setSchema(salesTerritorySchema);
		definition.setLocationUri("/soapWS"); // The url where we want to expose the wsdl at.
		definition.setPortTypeName("SalesTerritoryPort");
		definition.setTargetNamespace("http://soapdemo.com/demo"); //default namespace
		return definition;
		//URL of the WSDL - http://localhost:8080/soapWS/territory.wsdl
	}
}
