import java.io.*;

public interface FlyBehavior {
	public void fly();
}

class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I can Fly");
	}
}

class FlyNoWay implements FlyBehavior {
	public void fly () {
		System.out.println("I can't Fly");
	}
}

class FlyRocket implements FlyBehavior {
	public void fly () {
		System.out.println("I can Fly like Rocket");
	}
}