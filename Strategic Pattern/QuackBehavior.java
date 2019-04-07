import java.io.*;

public interface QuackBehavior {
	public void quack();
}

class Quack implements QuackBehavior {
	public void quack () {
		System.out.println("Quack Quack ..");
	}
}