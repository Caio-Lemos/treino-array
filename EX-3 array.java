
package exab;
import  java.util.Scanner ;

public class ex1 {

	public static void main (String[] args) {
		
		
		Scanner leitor = new Scanner (System.in);
		
		double[] num = new double [10];{
		
		System.out.println("Digite 10 Salários:");
		
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
		
int max = 0;
		
		for (int j = 1; j < num.length; j++) {
			
			if(num[j]> num[max]) {
				
				max=j;
		}
		
			
	}
		System.out.println(" O maior salário é o número "+max+".");
			
	
		}}}
