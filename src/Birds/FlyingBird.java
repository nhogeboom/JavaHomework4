package Birds;


public class FlyingBird extends Bird {
	
	public FlyingBird(boolean layEggs,int feathers) {
		super(layEggs,feathers);
	}
	
	@Override
	public void fly(){
		System.out.println("I can fly!!");
	};
	
}
