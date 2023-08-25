package testProject;

public class CompFriend extends Friend{
	private String department;
	
	public CompFriend(String name,String phone,String dm) {
		super(name,phone);
		this.department = dm;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 :" + department);
	}
	
	class UnivFriend extends Friend {
		private String major;
		
		public UnivFriend(String name,String major, String phone) {
			super(name,phone);
			this.major = major;
		}
		
		public void showInfo() {
			super.showInfo();
			System.out.println("전공 : "+ major);
		}
	}
}
