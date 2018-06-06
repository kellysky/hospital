package service;

import java.util.List;

import po.DoctorCustom;

public interface DoctorService {
	
	public List<DoctorCustom> queryDoctorList()throws Exception;

	public DoctorCustom findDoctorById(String doctor_id)throws Exception;
	
	public void updateDoctorById(String doctor_id, DoctorCustom doctorCustom)throws Exception;

	

}
