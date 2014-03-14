package com.sales.wb.common.constrains;

/**
*
* @author Kruti Jani
*/

public class UIResp {
	private UIRespCode respCode;
	private String respMsg;	
	
	public UIResp() {
		super();
	}

	public UIResp(UIRespCode respCode, String respMsg) {
	
		this.respCode = respCode;
		this.respMsg = respMsg;
	}
	
	public UIRespCode getRespCode() {
		return respCode;
	}
	public void setRespCode(UIRespCode respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	
	

}
