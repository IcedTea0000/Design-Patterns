package bridge_pattern;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("drawing green circle with radius="+radius+" at x,y="+x+","+y);
	}
}
