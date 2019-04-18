package prototype_pattern;

public class Circle extends Shape {

	public Circle(){
		type="circle";
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle draw method");
	}

}
