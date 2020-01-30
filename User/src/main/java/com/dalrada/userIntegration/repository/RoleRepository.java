package com.dalrada.userIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalrada.userIntegration.entity.RoleEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long>{

	@Query(value = "UPDATE Role_Management role SET role.name = :name WHERE role.id =:id")
    public void editRole(
            @Param("name") String name, @Param("id") Long id
    );
}
