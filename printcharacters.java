import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n=20;
		char char1 = '(';
		char char2 = 'z';
		for(int ctr = 1;char1<=char2;ctr++,char1++){
		    System.out.print(char1+" ");
		    if(ctr%n==0)
		        System.out.print("\n");
		}
		System.out.print("\n");
		
	}
}