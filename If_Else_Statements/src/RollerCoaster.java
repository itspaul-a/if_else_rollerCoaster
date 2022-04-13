//   Paul Aguiar
//   Assignment 3 
//   1/2/22



import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
	
		
	// Make a scanner	
		Scanner in  = new Scanner(System.in);
        int age = 0;
        int weight = 0;
        
        
    //Welcome text
        System.out.println("Welcome to pauls roller coaster");
        System.out.println("Before you can ride please enter your age followed by your weight");
        
        
        
     //Find out if age is valid   
        
        System.out.print("Please enter age: ");
        if(in.hasNextInt()) {
            age = in.nextInt();
            System.out.println("Valid age");

        }
        else {
            System.out.println("Not a valid age");
            
        }
            
            
    //Find out if weight is valid
        
        System.out.print("Please enter a weight: ");
            if(in.hasNextInt()) {
                weight = in.nextInt();
                System.out.println("Valid weight");

            }
            else {
                System.out.println("Not a valid weight");  
                
   // THis is a test for the roller coasters (it works)
                
            }
            	
              // calculate Black roller Coaster	
            	if (age <= 10 & weight <= 80) {
            		System.out.println("This person needs to ride the black roller coaster.");
            		
            	}

             // calculate Green roller Coaster	
            	else if (age <= 10 & weight >= 80 & weight <= 200) {
            		System.out.println("This person needs to ride the green roller coaster.");
            		
            	}
            	
            // calculate Yellow roller Coaster
            	else if (age <= 10 & weight >200) {
            		System.out.println("This person needs to ride the yellow roller coaster.");
            	}
            	
            // calculate Silver roller Coaster
            	else if (age <= 20 & age >= 10 & weight < 80) {
            		System.out.println("This person needs to ride the silver roller coaster.");
            	}
            	
            // calculate Red roller Coaster
            	else if (age <= 20 & age >=10 & weight >= 80 & weight <= 200) {
            		System.out.println("This person needs to ride the red roller coaster.");
            	}
            	
            // calculate Purple roller coaster
            	else if (age <= 20 & age > 10 & weight > 200) {
            		System.out.println("This person needs to ride the purple roller coaster.");
            	}
            	
            // trying different ways of error catching 
            	
            	
            // Everyone else rides the Pink roller coaster	
            	else {
            		
            		System.out.println("This person needs to ride the pink roller coaster.");
                
                

        }

	}
}

