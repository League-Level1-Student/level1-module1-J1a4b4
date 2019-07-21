package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		Microwave eddie = new Microwave();
		String flavor = JOptionPane.showInputDialog(null, "What flavor of popcorn would you like?");
		Popcorn bag = new Popcorn(flavor);
		eddie.putInMicrowave(bag);
		String cookTime = JOptionPane.showInputDialog(null, "How long would you like your popcorn cooked?");
		int time = Integer.parseInt(cookTime);
		eddie.setTime(time);
		eddie.startMicrowave();
		bag.eat();
	}

}
