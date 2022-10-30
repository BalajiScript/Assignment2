package startedLearningJava;

import java.util.Scanner;

public class ScannerAssign {
	
	String name;
	String email;
	int phoneNum;
	String address;
	String Status;
//I'm not able to solve this assignment, can you pls give me to correct code for this assignment pls.
//send me in email if possible	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//int arr[] =new int[3];
		String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
        	
        	
            System.out.println("Please enter name");
           
   		arr[i] = sc.next();
        // String a1=sc.next(); 
   	
   		for(int j : i) {
           		System.out.println("Please enter email");
            
            		arr[j] = sc.next();

		}
   		}
  		
		System.out.println("Please enter which student details are you looking for");
		int a5 = sc.nextInt();
   		System.out.println(a5);

		
	
		System.out.println(arr[a5]);
		System.out.println(arr[a5]);

	}

}
