
// zakir hussain
// roll num:120

//Create a restaurant manu in switch case where if we select any option the program should the price of that food item....



import java.util.*;
class Question6{
	public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println(" Welcom to qalandari hotel...");
	System.out.println(" ");
	System.out.println("This is manu: \n \n1)potato chips.\n2)Zinger Burger.\n3)green tea.\n4)chicken korma.\n5)beaf biryani.\n6)chart.\n7)kawa chai.\n8)Cold Drinks.");
System.out.println("\nPlease order! Would you wanna know prize about items\n" +
 " Enter the number of item.. ");
     int z=ob.nextInt();
	switch(z){
		case 1:
	 	System.out.println("potato chips. \f Rs.50.0"); 
		break;
		case 2:
		 System.out.println("zinger burgur. \f Rs.400.0"); 
		 break;
		 	case 3:
	 	System.out.println("green tea.\f Rs.100.0"); 
	 	break;
	 		case 4:
	 	System.out.println("Chicken korma\f Rs.120.0"); 
	 	break;
	 		case 5:
	 	System.out.println("beaf biryani.\f Rs.100.0"); 
	 	break;
	 		case 6:
	 	System.out.println("chart.\f Rs.40.0"); 
	 	break;
	 		case 7:	
	 	System.out.println("kawwa chai one cup.\f Rs.120"); 
	 	break;
	 		case 8:
	 	System.out.println("250ml Cold Drinks.\fRs.80"); 
		default:
		System.out.println("Sorry, This item is not available. please select among above items..");
	}
	                                                                                                                                     	                		
	}
}
