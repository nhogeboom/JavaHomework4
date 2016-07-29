package Birds;


public class Chicken extends NonFlyingBird {

	public Chicken(boolean layEggs,int feathers) {
		super(layEggs,feathers);
	}
	
	@Override
	public void fly(){
		System.out.println("I'm a chicken. Of course I can fly!!");
	};
	
	@Override
	public String toString() {
		return "I'm a chicken (squawk!!)." + super.toString();
	}
}
