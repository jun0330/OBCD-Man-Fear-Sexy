package com.etc.entity;

public class User {
	
	private int USERID;
	private String USERACCOUNT;
	private String USERPWD;
	private String USERNICKNAME;
	private String USERSEX;
	private String IDCARD;
	private String EMALL;
	private String ADDRESS;
	private String DATE;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uSERACCOUNT, String uSERPWD, String uSERNICKNAME, String uSERSEX, String iDCARD, String eMALL,
			String aDDRESS, String dATE) {
		super();
		USERACCOUNT = uSERACCOUNT;
		USERPWD = uSERPWD;
		USERNICKNAME = uSERNICKNAME;
		USERSEX = uSERSEX;
		IDCARD = iDCARD;
		EMALL = eMALL;
		ADDRESS = aDDRESS;
		DATE = dATE;
	}
	public User(int uSERID, String uSERACCOUNT, String uSERPWD, String uSERNICKNAME, String uSERSEX, String iDCARD,
			String eMALL, String aDDRESS, String dATE) {
		super();
		USERID = uSERID;
		USERACCOUNT = uSERACCOUNT;
		USERPWD = uSERPWD;
		USERNICKNAME = uSERNICKNAME;
		USERSEX = uSERSEX;
		IDCARD = iDCARD;
		EMALL = eMALL;
		ADDRESS = aDDRESS;
		DATE = dATE;
	}
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getUSERACCOUNT() {
		return USERACCOUNT;
	}
	public void setUSERACCOUNT(String uSERACCOUNT) {
		USERACCOUNT = uSERACCOUNT;
	}
	public String getUSERPWD() {
		return USERPWD;
	}
	public void setUSERPWD(String uSERPWD) {
		USERPWD = uSERPWD;
	}
	public String getUSERNICKNAME() {
		return USERNICKNAME;
	}
	public void setUSERNICKNAME(String uSERNICKNAME) {
		USERNICKNAME = uSERNICKNAME;
	}
	public String getUSERSEX() {
		return USERSEX;
	}
	public void setUSERSEX(String uSERSEX) {
		USERSEX = uSERSEX;
	}
	public String getIDCARD() {
		return IDCARD;
	}
	public void setIDCARD(String iDCARD) {
		IDCARD = iDCARD;
	}
	public String getEMALL() {
		return EMALL;
	}
	public void setEMALL(String eMALL) {
		EMALL = eMALL;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getDATE() {
		return DATE;
	}
	public void setDATE(String dATE) {
		DATE = dATE;
	}
	@Override
	public String toString() {
		return "User [USERID=" + USERID + ", USERACCOUNT=" + USERACCOUNT + ", USERPWD=" + USERPWD + ", USERNICKNAME="
				+ USERNICKNAME + ", USERSEX=" + USERSEX + ", IDCARD=" + IDCARD + ", EMALL=" + EMALL + ", ADDRESS="
				+ ADDRESS + ", DATE=" + DATE + "]";
	}
	
	

}
