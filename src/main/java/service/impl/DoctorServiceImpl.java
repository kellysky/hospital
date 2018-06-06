package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.DoctorDao;
import po.DoctorCustom;
import service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	private DoctorDao doctordao;


	public List<DoctorCustom> queryDoctorList() throws Exception {
		// TODO Auto-generated method stub
		return doctordao.queryDoctorList();
	}

	public DoctorCustom findDoctorById(String doctor_id) throws Exception {
		// TODO Auto-generated method stub
		return doctordao.findDoctorById(doctor_id);
	}

	public void updateDoctorById(String doctor_id, DoctorCustom doctorCustom) throws Exception {
		// TODO Auto-generated method stub
		if(doctor_id!=null) {
			doctorCustom.setDoctor_id(doctor_id);
			doctordao.updateDoctorById(doctorCustom);
		}
		
	}

}
