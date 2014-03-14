package com.sales.wb.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.wb.common.constrains.UIResp;
import com.sales.wb.common.constrains.WebConstrains;
import com.sales.wb.form.AreaForm;
import com.sales.wb.service.MasterDataService;



@Controller
public class AreaController {
	private static final Logger log = Logger.getLogger(AreaController.class);
	@Autowired
	private MasterDataService service;
	
	@RequestMapping(value = "/createarea", method = RequestMethod.POST)
	public String addArea(@ModelAttribute("areaForm")	AreaForm areaform, BindingResult result) {
		log.info("======== Inside Add Area ======");
//		UIResp resp=service.addArea(areaform);
//		if(resp.getRespCode().toString().equalsIgnoreCase(WebConstrains.SUCCESS)){
//			log.info("Resp : "+ resp.getRespMsg());
//		}else{
//			log.info("Resp : "+ resp.getRespMsg());
//		}
		return "redirect:/index";
	}
}
