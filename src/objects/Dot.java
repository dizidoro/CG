package objects;

import java.awt.Point;

public class Dot extends ViewportObject {

	private static int dotCount = 1;
	
	// Coordenadas de um ponto: x, y
	// XXX: Nesse caso não precisa ser uma lista
	private Point point;
	
	public Dot(Point point) {
		super("dot" + dotCount, ObjectType.DOT);
		this.point = point;
		
		dotCount++;
	}

	public Point getPoint() {
		return point;
	}
	
}

