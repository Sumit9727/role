package com.dalrada.userProcess.responseBuilder;

import com.dalrada.userIntegration.beans.IntgResponse;
import org.springframework.stereotype.Component;

import com.dalrada.userIntegration.beans.IntgRequest;
import com.dalrada.userProcess.beans.ProcessResponse;


@Component
public class ProcessResponseBuilder {

	public ProcessResponse buildResponse(IntgResponse intgResponse) {
		// TODO Auto-generated method stub
		ProcessResponse processResponse = new ProcessResponse();
		processResponse.setResponseCode(intgResponse.getResponseCode());
		processResponse.setResponseMsg(intgResponse.getResponseMsg());
		processResponse.setRespBody(intgResponse.getRespBody());
		return processResponse;
	}
}
