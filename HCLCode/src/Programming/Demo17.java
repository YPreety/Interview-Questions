package Programming;

public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double meal_cost  = 10.25 ;
		int tip_percent= 17;
		int tax_percent = 5;
		double tip = (meal_cost * tip_percent)/100;
		System.out.println(tip);
	     double tax = ( meal_cost * tax_percent) / 100;
	     System.out.println(tax);
	     double total_cost = meal_cost + tax + tip;
	     System.out.println(total_cost);
	}

}
