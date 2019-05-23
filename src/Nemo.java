
public class Nemo {

	public static void main(String args[])
	{
		int sum = 9;
		
		int[] arr = new int[5];
		arr[0] = 7;
		arr[1] = 12;
		arr[2] = 12;
		arr[3] = 12;
		arr[4] = 2;
	
		
		for(int i=0;i<arr.length;i++) 
		{
			
			 
			 for(int j=i+1;j<arr.length;j++)
			 {
				 int total = arr[i]+arr[j];
				 if(total==sum)
				 {
					 System.out.println("Return Index"+i);
					 System.out.println("Return Index"+j);
					 break;
					 
				 }
				
				
			 }
		}
		
		System.out.println("Welcome to Nemo Docker");
	}
	
}
