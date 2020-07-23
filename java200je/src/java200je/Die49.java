package java200je;

public class Die49 {

	public static void main(String[] args) {

		Die.printAddDie();
		Die.printMultiDie();
		//non-static
		Die die = new Die();
		die.printnAddDie();
		die.printnMultiDie();
	}

}
