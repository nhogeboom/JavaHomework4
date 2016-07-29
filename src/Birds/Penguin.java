package Birds;


public class Penguin extends NonFlyingBird {

	public Penguin(boolean layEggs,int feathers) {
		super(layEggs,feathers);
	}
	
	public String toString() {
		return "I'm a penguin that is happy not to be a chicken. " + super.toString();
	}
}
