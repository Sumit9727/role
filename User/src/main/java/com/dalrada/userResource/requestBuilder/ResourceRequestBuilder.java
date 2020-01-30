package com.dalrada.userResource.requestBuilder;

import org.springframework.stereotype.Component;

import com.dalrada.userProcess.beans.ProcessRequest;
import com.dalrada.userResource.beans.ResourceRequest;

@Component
public class ResourceRequestBuilder {

	public ProcessRequest buildRequest(ResourceRequest resourceRequest) {
		// TODO Auto-generated method stub
		ProcessRequest processRequest  = new ProcessRequest();
		processRequest.setRoleName(resourceRequest.getRoleName());
		processRequest.setStatus(resourceRequest.getStatus());
		processRequest.setCreatedBy(resourceRequest.getCreatedBy());

		return processRequest;
	}

}
