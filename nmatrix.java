import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print((int)(Math.random()*2)+" ");
		    }
		    System.out.println();
		}
	}
}