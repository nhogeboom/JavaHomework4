
import Birds.*;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird[] birdArray = new Bird[4];
		
		birdArray[0] = new Eagle(true,192);
		birdArray[1] = new Swallow(true,253);
		birdArray[2] = new Penguin(true,0);
		birdArray[3] = new Chicken(false,9);
		
		for (int i=0; i< birdArray.length;i++) {
			System.out.println(birdArray[i].toString());
			System.out.println("Can you fly though?");
			birdArray[i].fly();
		}
	}

}
