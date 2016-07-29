package Birds;


public class Swallow extends FlyingBird {
	
	public Swallow(boolean layEggs,int feathers) {
		super(layEggs,feathers);
	}
	
	public String toString() {
		return "I'm a swallow." + super.toString();
	}
}
