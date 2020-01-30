package com.dalrada.userIntegration.responseBuilder;

import org.springframework.stereotype.Component;

import com.dalrada.userIntegration.beans.IntgResponse;
import com.dalrada.userIntegration.entity.RoleEntity;

@Component
public class IntgResponseBuilder {

	public IntgResponse buildResponse(RoleEntity roleEntity) {
		IntgResponse response = new IntgResponse();

		response.setResponseCode("200");
		response.setResponseMsg("successful");
		response.setRespBody(roleEntity);
		return response;		
	}

	public IntgResponse buildResponse() {
		IntgResponse response = new IntgResponse();

		response.setResponseCode("200");
		response.setResponseMsg("successful");
		return response;		
	}

	public IntgResponse buildResponse(String responseCode, String respMsg) {
		IntgResponse response = new IntgResponse();

		response.setResponseCode("200");
		response.setResponseMsg("successful");
		return response;	

	}

}
