
public class Person {
	private String name;
	private String superpower;
	
	String getName() {
		return name;
	}
	
	String getSuperpower() {
		return superpower;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	
	String toString(String name, String superpower) {
		return name + " has mad " + superpower + " skills.";
	}
}
