package com.dalrada.userIntegration.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Role_Management")
public class RoleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Role_Id")
	private Long roleId ;
	@Column(name = "Role_Name")
	private String roleName ;
	@Column(name = "Status")
	private Integer status ;
	@Column(name = "Created_Date")
	@Temporal(TemporalType.DATE)
	private Date createdDate ;
	@Column(name = "Created_By")
	private Long createdBy ;

	public RoleEntity() {
	}

	public RoleEntity(Long roleId, String roleName, Integer status, Date createdDate, Long createdBy) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.status = status;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "RoleEntity{" +
				"roleId=" + roleId +
				", roleName='" + roleName + '\'' +
				", status=" + status +
				", createdDate=" + createdDate +
				", createdBy='" + createdBy + '\'' +
				'}';
	}
}
