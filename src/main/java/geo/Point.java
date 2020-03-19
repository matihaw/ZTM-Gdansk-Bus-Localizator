package geo;

import lombok.Data;

@Data
public class Point {
	
	private double x;
	private double y;
	private String line;
	
	public Point(double x, double y, String line) {
		this.x = x;
		this.y = y;
		this.line = line;
	}
}
