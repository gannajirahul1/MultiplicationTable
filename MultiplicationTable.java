package PractiseJavaProg;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// creating Mutiplication table
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Multiplication Table number");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			sum=i*num;
			//choosing the number
			switch(num)
			{
			case 1:System.out.println("1*"+i+"="+sum);
			break;
			case 2:System.out.println("2*"+i+"="+sum);
			break;
			case 3:System.out.println("3*"+i+"="+sum);
			break;
			case 4:System.out.println("4*"+i+"="+sum);
			break;
			case 5:System.out.println("5*"+i+"="+sum);
			break;
			case 6:System.out.println("6*"+i+"="+sum);
			break;
			case 7:System.out.println("7*"+i+"="+sum);
			break;
			case 8:System.out.println("8*"+i+"="+sum);
			break;
			case 9:System.out.println("9*"+i+"="+sum);
			break;
			case 10:System.out.println("10*"+i+"="+sum);
			break;
			case 11:System.out.println("11*"+i+"="+sum);
			break;
			case 12:System.out.println("12*"+i+"="+sum);
			break;
			case 13:System.out.println("13*"+i+"="+sum);
			break;
			case 14:System.out.println("14*"+i+"="+sum);
			break;
			case 15:System.out.println("15*"+i+"="+sum);
			break;
			case 16:System.out.println("16*"+i+"="+sum);
			break;
			case 17:System.out.println("17*"+i+"="+sum);
			break;
			case 18:System.out.println("18*"+i+"="+sum);
			break;
			case 19:System.out.println("19*"+i+"="+sum);
			break;
			case 20:System.out.println("20*"+i+"="+sum);
			break;
			}
		}
		
	}

}
