package com.innovation.OPD_Project.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.OPD_Project.model.Admin;

@Repository
@Qualifier("admRepo")
public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByEmailAndPassword(String email,String password);
}