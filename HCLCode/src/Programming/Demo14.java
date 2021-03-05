package Programming;

enum Mobiles{
	a,b,c
}
public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobiles [] a =  Mobiles.values();
		for(Mobiles b : a){
			System.out.println(b);//a b c
		}
	}

}
