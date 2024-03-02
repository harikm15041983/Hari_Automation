package InterfaceRBI;

public class AxisToCallInterface implements LearnInterface{
	
	public void freeLoan() { //self method
		System.out.println("Slef Method");
	}

	@Override
	public void adharMandatory() {
		System.out.println("Aadhar Mandatory");
		
	}

	@Override
	public boolean panMandatory() {
		System.out.println("PAN Mandatory");
		return false;
		
	}

	@Override
	public void RBILimit() {
		// TODO Auto-generated method stub
		
	}

}
