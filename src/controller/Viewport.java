package controller;

import java.awt.EventQueue;
import java.awt.Point;
import java.util.ArrayList;

import objects.Dot;
import objects.Line;
import view.IGraphicController;
import view.Layout;

public class Viewport implements IGraphicController {

	ArrayList<Object> objects = new ArrayList<Object>();

	public Viewport() {
		Layout gui = new Layout();
		gui.addListenerController(this);
	}
	
	@Override
	public String createDot(Point point) {
		System.out.println("Dot at: (" + point.x + "," + point.y + ")");
		
		Dot dot = new Dot(point);
		objects.add(dot);
		
		return dot.getName();
	}
	
	@Override
	public String createLine(Point a, Point b) {
		System.out.println("Line at: (" + a.x + "," + a.y +
				") -> (" + b.x + "," + b.y + ")");
		
		Line line = new Line(a, b);
		objects.add(line);
		
		return line.getName();
	}

	@Override
	public String createPolygon() {
		System.out.println("Polygon");
		
		// TODO Auto-generated method stub
		
		return null;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Viewport();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
