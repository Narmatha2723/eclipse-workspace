package trainingAssignments;

public class Person {
	private String name,country;
	private int age;

   public void setDetails(String Name,int Age,String Country) {
		this.name = Name;
		this.age = Age;
		this.country = Country;
	}
	public void getDetails() {
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Country:" +country);
	}
	public static void main(String args[]) { 
		Person p = new Person();
		p.setDetails("Narmatha",23,"India");
		p.getDetails();
		
	}

}
