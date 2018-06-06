package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import po.DoctorCustom;


public interface DoctorDao {
	
public List<DoctorCustom> queryDoctorList()throws Exception;
	
public DoctorCustom findDoctorById(@Param("id")String id)throws Exception;

public void updateDoctorById(DoctorCustom doctorCustom)throws Exception;

}
