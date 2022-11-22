import java.util.*;
public class RunAnimal {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input1;
		
		System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
			input1 = sc.nextLine();
			if(input1.equalsIgnoreCase("B")){
				Bird bd = new Bird();
				bd.eat();
				bd.sleep();
				bd.makeSound();
			}
			else if(input1.equalsIgnoreCase("C")){
				Cat c = new Cat();
				c.eat();
				c.sleep();
				c.makeSound();
			}
			else if(input1.equalsIgnoreCase("D")){
				Dog d = new Dog();
				d.eat();
				d.sleep();
				d.makeSound();
			}
			else{
				System.out.println("Invalid input.");
			}
			sc.close();
			
	}
    
    
}