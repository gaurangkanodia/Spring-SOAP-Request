package com.example.SoapDemo;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import com.soapdemo.demo.SalesTerritoryList;

@Endpoint //Web Service endpoint
public class SalesTerritorySoap 
{
	@PayloadRoot(namespace = "http://www.soapdemo.com/demo", localPart = "SalesTerritoryList") // Defines the details of the request that this method would handle. We will handle method with the given name space.
	//localPart is telling us what the head tag for the xml object will be.
//	@ResponsePayload   // This method will return a response which would need to be converted to a response xml.
	public void triggerChanges(@RequestPayload SalesTerritoryList sales_territory)
	{
		System.out.println("Id: "+sales_territory.getStl().size());
//		System.out.println("Name: "+sales_territory.getName());
		
	}
}
