package objects;

import java.util.ArrayList;

public class Polygon extends ViewportObject {
	
	private static int polygonCount = 1;

	// Linha poligonal é uma sucessão de segmentos consecutivos e
	// não-colineares, dois a dois
	ArrayList<Line> segments;
	
	public Polygon() {
		super("polygon" + polygonCount, ObjectType.POLYGON);

		this.segments = new ArrayList<Line>();
		
		polygonCount++;
	}
	
	public void addSegment(Line segment) {
		segments.add(segment);
	}

}
