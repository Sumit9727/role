package com.dalrada.userResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dalrada.userIntegration.exception.BussinessException;
import com.dalrada.userProcess.Process;
import com.dalrada.userProcess.beans.ProcessRequest;
import com.dalrada.userProcess.beans.ProcessResponse;
import com.dalrada.userResource.beans.ResourceRequest;
import com.dalrada.userResource.beans.ResourceResponse;
import com.dalrada.userResource.requestBuilder.ResourceRequestBuilder;

import com.dalrada.userResource.responseBuilder.UserResourceResponseBuilder;


@RestController
@RequestMapping(path = "/dalrada")
public class Resource {
	
	@Autowired
	ResourceRequestBuilder requestBuilder;
	@Autowired
	Process process;
	@Autowired
	UserResourceResponseBuilder responsebuilder;
	
	
	@PostMapping("create/role")
	public ResourceResponse createUser(@RequestBody ResourceRequest resourceRequest) throws BussinessException {
		ProcessRequest processRequest = requestBuilder.buildRequest(resourceRequest);
		ProcessResponse processResponse = process.createRole(processRequest);
		ResourceResponse resourceResponse = responsebuilder.buildResponse(processResponse);
		return resourceResponse;	
	}

	@GetMapping("role/{id}")
	public ResourceResponse fetchRoleById(@PathVariable Long id) throws BussinessException{
			ProcessResponse processResponse = process.fetchRoleById(id);
			ResourceResponse resourceResponse = responsebuilder.buildResponse(processResponse);
			return resourceResponse;
	}

	/*@PostMapping(path = "/create/role")
	public ResourceResponse roleRequest(@RequestBody ResourceRequest request) throws BussinessException{
		ProcessRequest processRequest = requestBuilder.buildRequest(request);
	}*/

	@GetMapping("edit/role/{id}/{name}")
	public ResourceResponse editRole(@RequestBody ResourceRequest request) throws BussinessException {
		ProcessRequest processRequest = requestBuilder.buildRequest(request);
		ProcessResponse processResponse = process.editRole(processRequest);
		ResourceResponse resourceResponse = responsebuilder.buildResponse(processResponse);
		return resourceResponse;
	}

	@GetMapping("role/status/{id}/{status}")
	public ResourceResponse changeStatus(@PathVariable Long id, @PathVariable Integer status) throws BussinessException {
		ProcessResponse processResponse = process.changeStatus(id,status);
		ResourceResponse resourceResponse = responsebuilder.buildResponse(processResponse);
		return resourceResponse;
	}

	@GetMapping("role/list")
	public ResourceResponse roleList() throws BussinessException {
		ProcessResponse processResponse = process.roleList();
	}
	
	@GetMapping("healthStatus")
	public String getHealth() {
		return "Service is up and running";
	}

}

