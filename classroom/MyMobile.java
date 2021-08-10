package week1.day2.classroom;

public class MyMobile {
	public void makeCall()
	{
		System.out.println("making call");
	}
	public void sendMsg()
	{
		System.out.println("Sending Message");
	}
	private void payBills()
	{
		System.out.println("Paying Bill");
	}
	
	public static void main(String[] args) {
		MyMobile obj= new MyMobile();
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();

	}

}
