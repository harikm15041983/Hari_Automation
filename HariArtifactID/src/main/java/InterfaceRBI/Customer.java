package InterfaceRBI;

public class Customer {

	public static void main(String[] args) {
		
		AxisToCallInterface aci = new AxisToCallInterface();
		aci.adharMandatory();
		boolean b = aci.panMandatory();
		System.out.println(b);
		aci.freeLoan();
		
		System.out.println(aci.UPILimit);

	}

}
