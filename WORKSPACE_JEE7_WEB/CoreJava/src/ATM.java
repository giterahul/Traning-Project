
public class ATM {
	public static void main(String[] args) {
		float amt=3700;
		float remaining=0;
		float no_of_notes=0;
		int arr[]= {2000,500,200,1000};
		for(int i=0;i<arr.length;i++)
		{
			no_of_notes=amt/arr[i];
			System.out.println(arr[i]+"+"+no_of_notes+"="+(arr[i]*no_of_notes));
			amt=amt%arr[i];
			
			
		}
		
	}

}
