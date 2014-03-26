package view;

import java.awt.Point;

public interface IGraphicController {
	
	public String createDot(Point point);
	
	public String createLine(Point a, Point b);
	
	public String createPolygon();
	
}
