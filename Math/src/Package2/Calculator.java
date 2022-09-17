package Package2;
import Package1.DataType;
public class Calculator {
	public static void main(String[] args) {
		DataType d=new DataType(15,0);
		d.setAdditon();
		d.setDivision();
		d.setSubtraction();
		d.setMultiplication();
		
		System.out.println("Addition is "+d.getAdditon());
		System.out.println("Subtraction is "+d.getSubtraction());
		System.out.println("Multiplicaton is "+d.getMultiplication());
		System.out.println("Division is "+d.getDivision());
		
	}
}
