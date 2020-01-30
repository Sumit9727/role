package com.dalrada.userProcess.requestBuilder;

import org.springframework.stereotype.Component;

import com.dalrada.userIntegration.beans.IntgRequest;
import com.dalrada.userProcess.beans.ProcessRequest;

@Component
public class ProcessRequestBuilder {

	public IntgRequest buildRequest(ProcessRequest processRequest) {
		IntgRequest intgRequest  = new IntgRequest();
		intgRequest.setRoleName(processRequest.getRoleName());
		intgRequest.setStatus(processRequest.getStatus());
		intgRequest.setCreatedBy(processRequest.getCreatedBy());
		return intgRequest;
	}

}
