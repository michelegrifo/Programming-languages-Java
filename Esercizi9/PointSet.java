import java.util.*;

public class PointSet{
	static void printFirstQuadrant(Set<Point> p){
		Iterator<Point> i = p.iterator();

		while (i.hasNext()){
			Point ob = i.next();
			if(ob.getX() > 0 && ob.getY() > 0)
				System.out.println(ob);
		}
	}

	public static void main(String[] args){
		Set<Point> points = new HashSet<Point>();
		points.add(new Point(2, 6));
		points.add(new Point(0.1, -2));
		points.add(new Point(1.5, 3));
		points.add(new Point(-1, 6));
		printFirstQuadrant(points);
	}

}