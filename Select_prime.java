import java .util.*;
public class Select_prime {

	public static void main(String[] args) {
            
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter the limit for finding the prime number :");
		 int n = s.nextInt();
		 int count =0;
		 for(int i = 1; i<=n;i++)
		 {
			 count = 0;
			 for(int j = 1;j<=n;j++)
			 {
				 if(i%j==0)
					 count++;
			 }
		
		 if(count==2)
			 System.out.println(i+" ");
	 }
		 }

}
