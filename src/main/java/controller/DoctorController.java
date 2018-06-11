package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import po.DoctorCustom;
import service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	public DoctorService doctorService;
	
	//账户查询
	@RequestMapping("/queryDoctor.action")
	public ModelAndView queryDoctor() throws Exception {
		
		List<DoctorCustom> doctorList = doctorService.queryDoctorList();
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("doctorList",doctorList);
		
		modelandview.setViewName("index");
		
		return modelandview;
	}
	
	@RequestMapping("/editDoctor.action")
	public ModelAndView editDoctor(@RequestParam("id")String id) throws Exception{
		DoctorCustom doctorCustom = doctorService.findDoctorById(id);
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("doctorCustom",doctorCustom);
		
		modelandview.setViewName("doctor/editDoctor");
		
		return modelandview;
		
		
	}
	@RequestMapping("/editDoctorSubmit.action")
	public String editDoctorSubmit(HttpServletRequest request,String id,DoctorCustom doctorCustom) throws Exception{
		
		doctorService.updateDoctorById(id, doctorCustom);
			
		return "forward:queryDoctor.action";
		
		
	}
}
