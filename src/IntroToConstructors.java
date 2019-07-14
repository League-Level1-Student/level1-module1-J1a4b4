
public class IntroToConstructors {
	private String name;
	IntroToConstructors(String platypusName) {
	this.name = platypusName;
	}
	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
}
