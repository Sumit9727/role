package com.dalrada.userResource.beans;

import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class ResourceRequest {

	private Long roleId ;
	private String roleName ;
	private Integer status ;
	private Long createdBy;
	private Date createdDate ;

	public ResourceRequest(Long roleId, String roleName, Integer status, Long createdBy, Date createdDate) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}
	public ResourceRequest(){

	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "ResourceRequest{" +
				"roleId=" + roleId +
				", roleName='" + roleName + '\'' +
				", status=" + status +
				", createdBy=" + createdBy +
				", createdDate=" + createdDate +
				'}';
	}
}
