package overRideAndOverLoadAssignmens;


public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("No amount was deposited");
		super.deposit();
	}
	
	public static void main(String[] args) {
		
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.fixed();
		bank.savings();

	}
	
	


}
