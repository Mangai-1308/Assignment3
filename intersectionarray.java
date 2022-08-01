import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit of two array:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		for(int i=0;i<m;i++){
		    arr1[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++){
		    arr2[j] = sc.nextInt();
		}
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        if(arr1[i]==arr2[j]){
		            System.out.print(arr1[i]+" ");
		        }
		    }
		}
		
	}
}