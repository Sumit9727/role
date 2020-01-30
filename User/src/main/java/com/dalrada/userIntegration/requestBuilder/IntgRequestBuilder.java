package com.dalrada.userIntegration.requestBuilder;

import org.springframework.stereotype.Component;

import com.dalrada.userIntegration.beans.IntgRequest;
import com.dalrada.userIntegration.entity.RoleEntity;

@Component
public class IntgRequestBuilder {

	public RoleEntity buildRequest(IntgRequest intgRequest) {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleName(intgRequest.getRoleName());
		roleEntity.setStatus(intgRequest.getStatus());
		roleEntity.setCreatedBy(intgRequest.getCreatedBy());
		return roleEntity;
	}

    public RoleEntity editRole(Long id, String name) {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleId(id);
		roleEntity.setRoleName(name);
		return roleEntity;
    }


	public RoleEntity changeStatus(Long id, Integer status) {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleId(id);
		roleEntity.setStatus(status);
		return roleEntity;
	}
}
