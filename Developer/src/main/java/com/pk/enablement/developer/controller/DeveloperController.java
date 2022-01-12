package com.pk.enablement.developer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pk.enablement.developer.RequestData;

@RestController(value="/api/developer")
public class DeveloperController {

	@RequestMapping(value="/getRequests/{userName}", method = RequestMethod.GET, produces = "application/json")
	public RequestData getRequests(@PathVariable String userName) {
		RequestData requestData = new RequestData();
		System.out.println("Hello");
		requestData.setResourceName("Cluster-1");
		requestData.setRegion("us-east-4");
		requestData.setNodes(4);
		requestData.setStatus("Approved");
		return requestData;
	}
}
