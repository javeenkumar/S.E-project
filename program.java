import java.util.*;
class Array{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 10 num");
		int num[]=new int[10];
		for(int i=0; i<10; i++){
			num[i]=ob.nextInt();
		}
		for(int j=0; j<10; j++)
		System.out.println(num[j]);
	}
}