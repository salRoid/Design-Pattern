import java.io.*;

public class MiniDuckSimulator {
	public static void main (String [] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocket());
		model.performFly();
	}
}