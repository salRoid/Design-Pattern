import java.io.*;

public interface Observer {
	
    public void update(float temp, float humidity, float pressure);
}
