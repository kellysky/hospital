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

	public DoctorCustom findDoctorById(String id) throws Exception {
		// TODO Auto-generated method stub
		return doctordao.findDoctorById(id);
	}

	public void updateDoctorById(String id, DoctorCustom doctorCustom) throws Exception {
		// TODO Auto-generated method stub
		if(id!=null) {
			doctorCustom.setId(id);
			doctordao.updateDoctorById(doctorCustom);
		}
		
	}

}
