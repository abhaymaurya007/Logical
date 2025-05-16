package Problem3;

class Employee {

	int eid;
	String ename;
	double esal;

	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public String toString() {
		return "Empid = " + eid + " Empname = " + ename + " EmpSal = " + esal;

	}
}
