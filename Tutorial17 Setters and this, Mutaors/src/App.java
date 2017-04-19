
class Frog{
	// private enforces encapsulation
	private String name;
	private int age;
	private String location;
	// setter
	public void setName(String name){
		// this means the instanced variable
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

	public String getLocation(){
		return location;
	}
	
	public void setInfo(String name,int age){
		setName(name);
		setAge(age);
	}
	
	
	
}


class Dog{
	String name;
	int age;
	String race;
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getRace(){
		return race;	
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setRace(String race){
		this.race = race;
	}
	
	public void setAll(String name,int age,String race){
		this.name = name;
		this.age = age;
		this.race = race;
	}
	
}



public class App {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		//frog1.name= "Bertie";
		//frog1.age = 1;
		
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
		
		Frog frog2 = new Frog();
		frog2.setLocation("Russia");
		
		Dog dog1 = new Dog();
		dog1.setAll("Roofus",3,"Dalamtian");
		
		 

	}

}
