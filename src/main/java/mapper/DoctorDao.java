package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import po.DoctorCustom;


public interface DoctorDao {
	
public List<DoctorCustom> queryDoctorList()throws Exception;
	
public DoctorCustom findDoctorById(@Param("doctor_id")String doctor_id)throws Exception;

public void updateDoctorById(DoctorCustom doctorCustom)throws Exception;

}
