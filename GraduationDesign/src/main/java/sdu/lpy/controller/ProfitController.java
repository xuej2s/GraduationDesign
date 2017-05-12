package sdu.lpy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.service.ProfitService;

@Controller
@RequestMapping("/admin/")
public class ProfitController {

	@Autowired
	private ProfitService profitService;
}
