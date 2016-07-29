package Birds;

public abstract class Bird {
	private boolean layEggs;
	private int feathers;

	public Bird(boolean layEggs,int feathers){
		this.layEggs = layEggs;
		this.feathers = feathers;
	};
	
	public void setLayEggs(boolean layEggs){
		this.layEggs = layEggs;
	}
	
	public void setFeathers(int feathers){
		this.feathers = feathers;
	}
	
	public boolean getLayEggs(){
		return this.layEggs;
	}
	
	public int setFeathers(){
		return this.feathers;
	}
	
	public abstract void fly();
	
	public String toString() {
		String birdDesc = "I have "+ Integer.toString(this.feathers)+ " feathers and I can ";
		if (!this.layEggs) {
			birdDesc += "NOT ";
		}
		birdDesc += "lay eggs.";
		return birdDesc;
	}
}
