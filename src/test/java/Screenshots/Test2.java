package Screenshots;

public class Test2 {
	
	public static void main(String[] args) {
		
		//upCasting
		Employees emp=new Manager();
		emp.work();
		emp.attendMeeting();
		
		//DownCast 
		Manager mgr=(Manager)emp;
		mgr.approveLeaves();
		 
	}
	
}
