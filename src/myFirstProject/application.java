package myFirstProject;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costofmilk = 3.50;
		int thirstlevel= 4;
		if (costofmilk <2.50 || thirstlevel> 6 ) {
			System.out.println("Milk Please");
		}else {
			System.out.println("No Thanks");
		}
		 int numberofCookies = 20;
		 int numberofChildren = 2;
		 if (numberofCookies % numberofChildren >=5) {
		 	System.out.println("Jackpot");
	     } else if (numberofCookies % numberofChildren >=2) {
	        System.out.println("Whojo");
         } else if (numberofCookies % numberofChildren > 0) {
        	 System.out.println("Yes");
         } else {
        	 System.out.println("sad face");
         }
		 
		 String loyaltyMemberStatus = "Gold";
		 double loyaltyMemberDiscount = 0.0;
		 
		 switch(loyaltyMemberStatus){
			 case "Gold":
				 loyaltyMemberDiscount=0.15;
			 	break;
			 case "Silver":
				 loyaltyMemberDiscount=0.10;
			 	break;
			 case ("Platinum"):
				 loyaltyMemberDiscount=(0.25);
			 	break;
		 }
		 System.out.println(loyaltyMemberDiscount);
		 
		 double billTotal =440.50;
		 double adjustedTotal = (billTotal - loyaltyMemberDiscount*billTotal);
		 System.out.println(adjustedTotal);
		 
		 if (adjustedTotal > 500) {
			 if(loyaltyMemberStatus == "Silver"){
				 loyaltyMemberStatus = "gold";
			 }else if (loyaltyMemberStatus == "Gold"){
				 loyaltyMemberStatus="Platinum";
			 }
		 }
		 System.out.println(loyaltyMemberStatus);
		 
		 String username = "Tommy123";
		 String password = "12345";
		 if (username.equals("Tommy123") && password.equals("12345")) {
			 System.out.println("login successful");
		 } else {	
			 System.out.println("access denied");
			 
		 } 
		 	
		 
		 for (int i = 0;i<10; i++) {
			 System.out.println(i);
		 }
		 
		 for (int i = 10; i>=0; i--) {
			 System.out.println(i);
		 }
		 
		 for (int i = 0; i<=100; i ++) {
			 if(i%2 ==0)
			 System.out.println(i);
		 }
		 
		 for (int i=0; i<=100;i++) {
			 if (i %2 == 0) {
			 	System.out.println(i + "Even");
			 } else { 
				 System.out.println(i + "Odd");
		 }
		 
		  int h = 100;
		  while(h>0) {
			  System.out.println(h + " " +h%3);
			  h--;
		  }
		 
				
	     	
		 
				 
		
		
		 }
		 }
}


