package kadai_015;

public class car_Chapter15 {

	private int gear = 1;
	private int speed = 10;
		
	public car_Chapter15(int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}

	public void gearChange(int afterGear) {
		int beforeGear = this.gear;
	    this.gear = afterGear;
	    switch (afterGear) {
				case 1 -> this.speed = 10;
				case 2 -> this.speed = 20;
				case 3 -> this.speed = 30;
				case 4 -> this.speed = 40;
				case 5 -> this.speed = 50;
				default -> this.speed = 10;
			}
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	}
	public void run(){
			
	System.out.println("速度は時速" + speed +"です");	
	}
}