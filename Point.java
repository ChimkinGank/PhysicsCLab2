public class Point{
  private double x,y;

  public String toString(){
    return "("+x+","+y+")";
  }

  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
  }

  public double distanceTo(Point other){
    return Math.sqrt(Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
  }

  public static Point copy(Point p){
    return new Point(p.x,p.y);
  }


  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
}
