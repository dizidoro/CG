package objects;

import java.awt.Point;


public class Line extends ViewportObject {
	
	private static int lineCount = 1;

	// Uma reta no plano pode ser caracterizada por:
	// dois pontos (a, b) distintos do plano;
	private Point a;
	private Point b;
	
	public Line(Point a, Point b) {
		super("line" + lineCount, ObjectType.LINE);
		
		this.a = a;
		this.b = b;
		
		lineCount++;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}
}
