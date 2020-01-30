package com.dalrada.userResource.responseBuilder;

import org.springframework.stereotype.Component;
import com.dalrada.userProcess.beans.ProcessResponse;
import com.dalrada.userResource.beans.ResourceResponse;

@Component
public class UserResourceResponseBuilder {

	public ResourceResponse buildResponse(ProcessResponse processResponse) {
		// TODO Auto-generated method stub
		ResourceResponse resourceResponse = new ResourceResponse();
		return resourceResponse;
	}

	
}
