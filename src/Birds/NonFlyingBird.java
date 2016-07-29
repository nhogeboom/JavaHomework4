package Birds;


public class NonFlyingBird extends Bird {

	public NonFlyingBird(boolean layEggs,int feathers) {
		super(layEggs,feathers);
	}
	
	@Override
	public void fly(){
		System.out.println("I can't fly :(");
	};
}
