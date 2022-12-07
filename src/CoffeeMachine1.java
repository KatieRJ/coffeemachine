
public class CoffeeMachine1 {

	public static void main(String[] args) {
		
		System.out.println("The best coffee machine!");
		
		CoffeeMachine machine1 = new CoffeeMachine();  // creating an object
		machine1.start();
		machine1.strong();
		machine1.printData();
		
		CoffeeMachine machine2 = new CoffeeMachine();   //creating another object
		machine2.changeData(false, "weak");
		machine2.printData();
		
		CoffeeMachine machine3 = new CoffeeMachine(false, "strong");   //creating the third object
		machine3.printData();
		

	}

}


class CoffeeMachine {
	
	public boolean isOn;   //attribute
	
	public String strength;   //attribute
	
	public CoffeeMachine() {     //default constructor
		
		isOn = false;
		strength = "";
	}
	
	public CoffeeMachine(boolean isMachineOn, String strenghtSetting) {    //Parameterised constructor
		
		isOn = isMachineOn;
		strength = strenghtSetting;
		
	}
	
	
	public void start() {
		
		isOn = true;           //explaining what the start method is. Saying what start means
	}
	
	public void shutDown() {
		
		isOn = false;
	}
	
	public void weak() {
		
		strength = "weak"; 
	}
	
	public void strong() {
		
		strength = "strong";
	}
	
	public void printData() {                                 //Method for printing data
		
		System.out.println(" Strengt setting is : " + strength );
		
		if (isOn == true) {
			
			System.out.println(" The coffee machine is on");
		}
		
		else 
			System.out.println(" The coffee machine is off");
	}
	
	public void changeData(boolean isMachineOn, String strenghtSetting) {  //method for changing data
		
		isOn = isMachineOn;
		strength = strenghtSetting;
	}
	
	
}
