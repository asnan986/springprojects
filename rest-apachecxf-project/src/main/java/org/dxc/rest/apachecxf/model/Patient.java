package org.dxc.rest.apachecxf.model;

public class Patient {
	private Long pId;
	private String pName;
	private String disease;

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Patient(Long pId, String pName, String disease) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.disease = disease;
	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

}
