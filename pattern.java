import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int m=1;
		for(int i=9;i>=0;i--){
		    for(int space =1;space<m;space++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(i);
		    }
		    m++;
		    System.out.println();
		}
	}
}