package service;

public class Employee {
	private Integer eid;
	private String ename;
	private Double esalary;
	private String ecity;
	
	private Department dept;

	
	public Employee(Integer eid, String ename, Double esalary, String ecity, Department dept) {
		super();
		System.out.println("Employee bean created");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.ecity = ecity;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", ecity=" + ecity + ", dept="
				+ dept + "]";
	}



	public String employeeTask() {
		return "Every Employee Acts Porductive but in Reality they are less Productive";
	}

}
