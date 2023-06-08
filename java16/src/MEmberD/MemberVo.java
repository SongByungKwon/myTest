package MEmberD;

public class MemberVo {
	private String empno;
	private String ename;
	private int sal;
	private int comm;
	private int sac;
	
	public MemberVo() {
		
	}
	public MemberVo(String empno, String ename, int sal,int comm,int sac) {
		this.empno =empno;
		this.ename =ename;
		this.sal=sal;
		this.comm=comm;
		this.sac=sac;
	}
	
	public String getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public int getSal() {
		return sal;
	}
	public int getComm() {
		return comm;
	}
	
	public int getSac() {
		return sac;
	}

}
