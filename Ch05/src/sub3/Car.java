package sub3;

public class Car {
	// 속성 field
	private String name;
	private String color;
	private int speed;
	public static int count;
	
	// 생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	// Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
	    System.out.println("현재속도 : "+speed);
	    System.out.println("현재차량수 : "+count);
	    
	}
	
	
}