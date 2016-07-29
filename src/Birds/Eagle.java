package Birds;


public class Eagle extends FlyingBird {

	public Eagle(boolean layEggs,int feathers) {
		super(layEggs,feathers);
	}
	
	@Override
	public String toString() {
		return "I'm an eagle." + super.toString();
	}
}
