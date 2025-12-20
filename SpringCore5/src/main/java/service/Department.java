package service;

public class Department {
	private Integer dpNo;
	private Integer dpName;
	
	
	public Department(Integer dpNo, Integer dpName) {
		super();
		System.out.println("Dept bean is created");
		this.dpNo = dpNo;
		this.dpName = dpName;
	}

	public void setDpNo(Integer dpNo) {
		this.dpNo = dpNo;
	}

	public void setDpName(Integer dpName) {
		this.dpName = dpName;
	}

	@Override
	public String toString() {
		return "Department [dpNo=" + dpNo + ", dpName=" + dpName + "]";
	}
	
	
}
