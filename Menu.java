package model;
import model.*;
import java.util.*;

public class Menu {

  Scanner in = new Scanner(System.in);
  Scanner st = new Scanner(System.in);
  private final static int LOAD_DANGEROUS = 390000;
  private final static int LOAD_PERISHABLE = 250000;
  private final static int LOAD_NOTPERISHABLE = 80000;
  
  public static void information(){
	  
  System.out.println("Enter the name of the boat");
  nameBoat = in.nextLine();
  System.out.println("Enter the name of the captain");
  nameCaptain = in.nextLine();
   
	  
  }
  public static int loadsInfo() {
	  System.out.println("Enter the type of the load:\n (1)Dangerous.\n(2)Perishable.\n(3)Not perishable.");
	  typeLoad1 = st.nextLine();
	  if (typeLoad1==1) {
		  typeLoad1 = LOAD_DANGEROUS;
	 }
	  if (typeLoad1==2) {
		  typeLoad1 = LOAD_PERISHABLE;
		
	  }
	  if (typeLoad1==3) {
		  typeLoad1 = LOAD_NOTPERISHABLE;
		  }		  
	  
	System.out.println("Enter the type of the load:\n (1)Dangerous.\n(2)Perishable.\n(3)Not perishable./n(4) There is no more load");
		  typeLoad2 = st.nextLine();
		  if (typeLoad2==1) {
			  typeLoad2 = LOAD_DANGEROUS;
		 }
		  if (typeLoad2==2) {
			  typeLoad2 = LOAD_PERISHABLE;
			
		  }
		  if (typeLoad2==3) {
			  typeLoad2 = LOAD_NOTPERISHABLE;
			
		  }if (typeLoad2==4) {
			  typeLoad2 = 0;
		
	  }
	  if (typeLoad1 != typeLoad2){
		  if (typeload1 == LOAD_DANGEROUS && typeLoad2 == LOAD_PERISHABLE){
			  System.out.printl("ERROR-Loads cannot be carried together ");
		  }
		  if (typeload2 == LOAD_DANGEROUS && typeLoad1 == LOAD_PERISHABLE){
			  System.out.printl("ERROR-Loads cannot be carried together ");
		  }
	  else 
		  typeLoad1 + typeLoad2 = totalValue;
		
            }
		  }
	  }
  public static void menu() {
	  
	  Client info = new Client();
      //ejecutar los metodo de la clase.
      info.mensaje();
      
 
		while(true) {
			
			System.out.println("----WELCOME TO THE MORGAN APP----");
			System.out.println("\nMenu Lab1:\n(1.) Load the boat.\n(2.) Unload ship.\n(3.) Total weight of load.\n(4.) Set sail.\n(5.) Update customer category.\n(6.) Exit");
			int selection1 = in.nextInt();
				if (selection1==1) {
				 	loadsInfo();
				}
				else if (selection2==2)

				
				
					
			}
    	}
	}
	 public static void main(String[] args) {
	 }
  }
}