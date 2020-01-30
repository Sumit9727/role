package com.dalrada.userProcess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dalrada.userIntegration.Integration;
import com.dalrada.userIntegration.beans.IntgRequest;
import com.dalrada.userIntegration.beans.IntgResponse;
import com.dalrada.userIntegration.exception.BussinessException;
import com.dalrada.userProcess.beans.ProcessRequest;
import com.dalrada.userProcess.beans.ProcessResponse;
import com.dalrada.userProcess.requestBuilder.ProcessRequestBuilder;
import com.dalrada.userProcess.responseBuilder.ProcessResponseBuilder;

import java.util.ArrayList;
import java.util.List;

@Component
public class Process {

	@Autowired
	ProcessRequestBuilder requestBuilder;
	@Autowired
	Integration intg;
	@Autowired
	ProcessResponseBuilder responseBuilder;
	
	public ProcessResponse createRole(ProcessRequest processRequest) throws BussinessException {

		IntgRequest intgRequest = requestBuilder.buildRequest(processRequest);
		IntgResponse intgResponse = intg.createRole(intgRequest);
		if(intgResponse != null) {
			ProcessResponse processResponse = responseBuilder.buildResponse(intgRequest);
			return processResponse;
		}
		else
			throw new BussinessException("505","data not saved");

	}

	public ProcessResponse editRole(ProcessRequest processRequest) throws BussinessException {
		IntgRequest intgRequest = requestBuilder.buildRequest(processRequest);
		IntgResponse intgResponse = intg.editRole(intgRequest);
		if(intgResponse != null) {
			ProcessResponse processResponse = responseBuilder.buildResponse(intgResponse);
			return processResponse;
		}
		else
			throw new BussinessException("505","data not saved");
	}

	public ProcessResponse fetchRoleById(Long id) throws BussinessException {
		IntgResponse intgResponse = intg.fetchRoleById(id);
		if(intgResponse != null) {
			ProcessResponse processResponse = responseBuilder.buildResponse(intgRequest);
			return processResponse;
		}
		else
			throw new BussinessException("505","data not saved");
	}

	public ProcessResponse changeStatus(Long id, Integer status) throws BussinessException {
		IntgResponse intgResponse =intg.changeStatus(id,status);
		if(intgResponse != null) {
			ProcessResponse processResponse = responseBuilder.buildResponse(intgRequest);
			return processResponse;
		}
		else
			throw new BussinessException("505","data not saved");
	}

	public List<ProcessResponse> roleList() throws BussinessException{
		List<IntgResponse> intgResponseList = intg.roleList();
		List<ProcessResponse> processResponseList = new ArrayList<ProcessResponse>();
		intgResponseList.forEach(response ->{
			ProcessResponse processResponse = responseBuilder.buildResponse(response);
			processResponseList.add(processResponse);
		});
		return processResponseList;
	}
}
