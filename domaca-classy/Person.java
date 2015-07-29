
public class Person {

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	public boolean setAge(int age){
		if(isValidAge(age)){
		this.age = age;
		return true;
		} else {
			return false;
		}
	}
	
	private boolean isValidAge(int age){
		return(age >0 && age < 150);
	}
	
	public String toString() {
		System.out.println(name +  "(" + age + ")");
		return(this.name +  "(" + age + ")");
	}
}
