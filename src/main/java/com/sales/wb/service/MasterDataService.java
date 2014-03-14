package com.sales.wb.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.wb.common.constrains.UIResp;
import com.sales.wb.common.constrains.UIRespCode;
import com.sales.wb.form.AreaForm;
import com.sales.wb.service.imp.MasterService;

@Service
public class MasterDataService {
	
@Autowired
private MasterService masterService;
private static final Logger log = Logger.getLogger(MasterDataService.class);
	public UIResp addArea(AreaForm areaform) {
		log.info("==== Inside addArea =====");
		log.info(areaform.getAreaCode());
		log.info(areaform.getAreaName());
		AreaVO vo = new AreaVO();
		vo.setAreaCode(areaform.getAreaCode());
		vo.setAreaName(areaform.getAreaName());
		Resp resp=masterService.createArea(vo);		
		return new UIResp(UIRespCode.valueOf(resp.getRespCode().toString()) , resp.getRespMsg());
	}
}
