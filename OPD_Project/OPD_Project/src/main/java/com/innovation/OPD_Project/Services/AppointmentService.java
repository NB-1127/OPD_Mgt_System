package com.innovation.OPD_Project.Services;

import java.util.List;

import com.innovation.OPD_Project.model.Appointment;

public interface AppointmentService {

	Appointment insert(Appointment ap);
	void delete(long aid);
	Appointment update(long aid,Appointment ap);
	Appointment search(long aid);
	List<Appointment> getAll();
}
