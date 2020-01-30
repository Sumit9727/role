package com.dalrada.userIntegration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dalrada.userIntegration.beans.IntgRequest;
import com.dalrada.userIntegration.beans.IntgResponse;
import com.dalrada.userIntegration.entity.RoleEntity;
import com.dalrada.userIntegration.exception.BussinessException;
import com.dalrada.userIntegration.repository.RoleRepository;
import com.dalrada.userIntegration.requestBuilder.IntgRequestBuilder;
import com.dalrada.userIntegration.responseBuilder.IntgResponseBuilder;

@Component
public class Integration {


	@Autowired
	IntgRequestBuilder requestBuilder ;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	IntgResponseBuilder responseBuilder ;

	public IntgResponse createRole(IntgRequest intgRequest) throws BussinessException {

		RoleEntity role = requestBuilder.buildRequest(intgRequest);
		RoleEntity roleEntity = roleRepository.save(role);
		if(roleEntity != null) {
			IntgResponse intgResponse = responseBuilder.buildResponse(role);
			return intgResponse;
		}
		else
			throw new BussinessException("505","data not saved");

	}

	public IntgResponse fetchRoleById(Long roleId) throws BussinessException {


		RoleEntity role = roleRepository.findById(Long.valueOf(roleId)).get();
		if(role != null) {
			IntgResponse intgResponse = responseBuilder.buildResponse(role);
			return intgResponse;
		}
		else
			throw new BussinessException("505","data not persent");

	}

	public List<IntgResponse> roleList() throws BussinessException {
		List<RoleEntity> roleList = roleRepository.findAll();
		List<IntgResponse> responseList = new ArrayList<IntgResponse>();
		if(roleList != null) {
			roleList.forEach(role ->{
				IntgResponse intgResponse = responseBuilder.buildResponse(role);
				responseList.add(intgResponse);
			});
			return responseList;
		}
		else
			throw new BussinessException("505","data not persent");

	}

	public IntgResponse editRole(IntgRequest intgRequest) throws BussinessException {
		RoleEntity role = requestBuilder.buildRequest(intgRequest);
		/// use update method in repository ..........create custom Update Query
		RoleEntity roleEntity = roleRepository.save(role);
		if(roleEntity != null) {
			IntgResponse intgResponse = responseBuilder.buildResponse(role);
			return intgResponse;
		}
		else
			throw new BussinessException("505","data not edited");
	}

	public IntgResponse changeStatus(Long id, Integer status) throws BussinessException{
		RoleEntity role = requestBuilder.changeStatus(id,status);
		RoleEntity roleEntity = roleRepository.save(role);
		if(roleEntity != null) {
			IntgResponse intgResponse = responseBuilder.buildResponse(role);
			return intgResponse;
		}
		else
			throw new BussinessException("505","data not edited");
	}
}
