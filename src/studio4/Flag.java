package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(0,255,0);
		StdDraw.filledRectangle(22,16, 22, 16);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledCircle(3, 3, 3);
		StdDraw.filledCircle(11, 8, 3);
		StdDraw.filledCircle(19, 13, 3);
	}
}