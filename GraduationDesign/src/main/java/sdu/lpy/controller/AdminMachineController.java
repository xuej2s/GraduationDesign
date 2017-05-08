package sdu.lpy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.MachineBuyConfig;
import sdu.lpy.entity.MachineConfig;
import sdu.lpy.entity.MachineFee;
import sdu.lpy.service.AdminMachineService;

@Controller
@RequestMapping("/admin/")
public class AdminMachineController {

	@Autowired
	private AdminMachineService adminMachineService;
	//跳转到器械购置页面
	@RequestMapping("machinebuy.do")
	public String machinebuy(Model model){
		List<MachineBuyConfig> list = adminMachineService.getAllMachine();
		model.addAttribute("machineList", list);
		return "machinePage";
	}
	
	//跳转到器械购置界面
	@RequestMapping("addmachine.do")
	public String addmachine(){
		return "addMachine";
	}
	
	//购置器械
	@RequestMapping("addMachine.do")
	public String addMachine(MachineConfig machineConfig,MachineFee machineFee){
		adminMachineService.addMachine(machineConfig, machineFee);
		return "redirect:machinebuy.do";
	}
	
	//删除购置器械
	@RequestMapping("deletemachine.do")
	public String deletemachine(String machineType){
		adminMachineService.deleteMachine(machineType);
		return "redirect:machinebuy.do";
	}
	
}
