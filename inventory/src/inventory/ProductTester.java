package inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		//create a Scanner object for keyboard input
		Scanner in = new Scanner(System.in);	
		int maxSize, menuChoice;
		
		maxSize = getNumProducts(in);
		if(maxSize ==0) {
			//Display a no products message if zero is entered
			System.out.println("No products required!");
		}else {
			Product[] products = new Product[maxSize];
			addToInventory(products, in);
			do {
				menuChoice = getMenuOption(in);
				executeMenuChoice(menuChoice, products, in);
			}while(menuChoice!=0);
		}//endif
		
	}//end method main
	
	static void executeMenuChoice(int choice, Product[] products, Scanner in) {
		switch(choice) {
		case 1: System.out.println("View Product List");
				displayInventory(products);
			break;
		case 2: System.out.println("Add Stock");
				addInventory(products, in);
			break;
		case 3: System.out.println("Deduct Stock");
				deductInventory(products, in); 
			break;
		case 4: System.out.println("Discontinue Stock");
				discontinueInventory(products, in); 
			break;
		}//end switch
		
	}//end method executeMenuChoice
		
	static void discontinueInventory(Product[] products, Scanner in) {
		int productChoice;

		productChoice=getProductNumber(products, in);
        products[productChoice].setActive(false);
        
	}//end method deductInventory
	
	
	static void deductInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue= -1;
		productChoice=getProductNumber(products, in);
		do {
			try {
		        System.out.print("How many products do you want to deduct? ");
		        updateValue = in.nextInt();
		        if(updateValue <0)
		        	System.out.println("Please only enter positive values to deduct stock");
		        //endif
		        if(updateValue > products[productChoice].getQtyInStock())
		        	System.out.println("THere is not enough stock to remove that amount, only " 
		                                + products[productChoice].getQtyInStock() + " left!");
			}catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}catch(Exception e) {
				System.out.println(e);
				in.nextLine();
			}
		}while(updateValue <0 ||updateValue > products[productChoice].getQtyInStock());

        products[productChoice].deductFromInventory(updateValue);
	}//end method deductInventory
	
	static void addInventory(Product[] products, Scanner in) {
		int productChoice;
		int updateValue=-1;
		productChoice=getProductNumber(products, in);
		do {
			try {
		        System.out.print("How many products do you want to add? ");
		        updateValue = in.nextInt();
		        if(updateValue <0)
		        	System.out.println("Please only enter positive values to add stock");
		        //endif
			}catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}catch(Exception e) {
				System.out.println(e);
				in.nextLine();
			}
		}while(updateValue <0);
		
        products[productChoice].addToInventory(updateValue);
	}//end method addInventory
	
	static int getProductNumber(Product[] products, Scanner in) {
		int productChoice=-1;
		//display the contents of the products array
        for(int i = 0; i< products.length; i++)
        	System.out.println(i + " : " + products[i].getName());
        //endor
		do {
			try {
	        System.out.print("Please enter the item number of the product you want to update: ");
	        productChoice = in.nextInt();
	        if(productChoice <0 || productChoice > products.length-1)
	        	System.out.println("Please only enter values between 0 and " 
	                                + (products.length-1));
	        //endif
			}catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}catch(Exception e) {
				System.out.println(e);
				in.nextLine();
			}
		}while(productChoice<0 || productChoice > products.length-1);

		return productChoice;
	}//end method getProductNumber
	
	static int getMenuOption(Scanner in) {
		int menuOption=-1;
		
		//display the menu until a valid input is provided
		do {
			try {
				System.out.println("\n\n1. View Inventory\n2. Add Stock\n3. Deduct Stock\n"
				+ "4. Discontinue Product\n0. Exit");
				System.out.print("Please enter a menu option: ");
				menuOption = in.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Incorrect data type entered!");
			in.nextLine();
		}catch(Exception e) {
			System.out.println(e);
			in.nextLine();
		}
		}while(menuOption <0 || menuOption >4);
		
		//return the valid input from the user
		return menuOption;
	}//end method getMenuOption
	
	static int getNumProducts(Scanner in) {
		int maxSize=-1;
		
		//prompt the user until they enter a number >= zero
		do {
			try{
				//display prompt to user		
				System.out.println("Enter the number of products you would like to add.");
				System.out.print("Enter 0 (zero) if you do not wish to add products: ");
				//assume that the user enters a valid 
				maxSize = in.nextInt();	
				if(maxSize<0)
					System.out.println("Incorrect Value entered");
				//endif
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}catch(Exception e){
				System.out.println(e);
				in.nextLine();
			}
		}while(maxSize<0);
		
		//returns the valid value entered by the user
		return maxSize;
		
	}//end method getNUmProducts
	
	static void addToInventory(Product[] products, Scanner in) {
		//create local variables
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		
		for(int i = 0; i<products.length; i++) {
	        	in.nextLine();
	        	//ask the user to enter the product information
	    		System.out.print("\n\nPlease enter the product name: ");
	    		tempName = in.nextLine();
	    		System.out.print("Please enter the quantity of stock for this product: ");
	    		tempQty = in.nextInt();
	    		System.out.print("Please enter the price for this product: ");
	    		tempPrice = in.nextDouble();
	    		System.out.print("Please enter the item number: ");
	    		tempNumber = in.nextInt();
	    		//create a product object and store it in the products array
	    		products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
	    }//endfor
	}//end method addToInventory
		
	static void displayInventory(Product[] products) {
        //display the contents of the products array
        for(Product product: products)
        	System.out.println(product);
        //endor
	}//end method displayInventory
		
}//end class ProductTaster
