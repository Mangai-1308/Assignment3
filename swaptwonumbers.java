public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before Swapping:"+x+" "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.print("Swaped numbers are:"+x+" "+y);
	}
}