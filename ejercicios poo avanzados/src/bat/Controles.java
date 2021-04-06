package bat;

import javax.swing.JOptionPane;

public class Controles {

	public static void main(String[] args) {
		int num1 = 8 , num2 =0 ;
		
		try {
			
			System.out.println(num1/num2);
		
		}catch(ArithmeticException e){
			
			System.out.println("Estas dividiendo entre 0");
		}
		
		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog(null,"numero")) ;
		}catch(NumberFormatException e) {
			System.out.println("eres inutil has introducido una letra");
		}
		
		//for each ;
		
		int nums[] = {1,2,3,4,5,6,7,8,9} ;
		
		int sums = 0 ;
		for(int x:nums) {
			sums += x ;
		}
		
		System.out.println(sums);
	}

}
