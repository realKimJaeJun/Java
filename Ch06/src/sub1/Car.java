package sub1;

public abstract class Car {

	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) { // 초기화
		this.name = name;
		this.color = color;
		this.speed= speed;
	}
	
	
	public abstract void speedUp(int speed); // 추상 메서드, 상속받은 클래스에서 상세하게 다룰 예정이라 와꾸만 파놓음.
	public abstract void speedDown(int speed); 
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
	}
	
}
