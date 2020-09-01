
package exab;
import  java.util.Scanner ;

public class ex1 {

	public static void main (String[] args) {
		
		
		Scanner leitor = new Scanner (System.in);
		
		int[] num = new int [10];{
		
		System.out.println("Digite 10 números:");
		
		num[0]= leitor.nextInt();
		num[1]= leitor.nextInt();
		num[2]= leitor.nextInt();
		num[3]= leitor.nextInt();
		num[4]= leitor.nextInt();
		num[5]= leitor.nextInt();
		num[6]= leitor.nextInt();
		num[7]= leitor.nextInt();
		num[8]= leitor.nextInt();
		num[9]= leitor.nextInt();
		
		System.out.println("a média é : " + (num[0] + num[1]+ num[2]+ num[3]+ num[4]+ num[5]+ num[6]+ num[7]+ num[8]+ num[9])/10);
		
		}
		
		
		
	}
	
	
}