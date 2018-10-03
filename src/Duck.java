
public class Duck {
	private int numberOfFriends;
	private String favoriteFood;

	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	
	void quack() {
		System.out.println("quack");
	}
	
	void waddle() {
		System.out.println("waddling!");
	}
}
