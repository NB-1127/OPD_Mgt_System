package com.innovation.OPD_Project.Services;

import java.util.List;

import com.innovation.OPD_Project.model.Prescription;

public interface PrescriptionService {
	Prescription insert(Prescription ps);
	
	Prescription update(long pid,Prescription ps);
	Prescription search(long pid);
	List<Prescription> getAll();
	List<Prescription> getAllByApp(long aid);
}
