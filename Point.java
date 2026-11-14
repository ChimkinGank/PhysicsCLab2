public class Point{
  private double x,y;
  private String name;

  public String toString(){
    return name+": ("+x+","+y+")";
  }

  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
  }

  public double distanceTo(Point other){
    return Math.sqrt(Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
  }

  public static Point copy(Point p){
    return new Point(p.x,p.y,p.name);
  }


  public Point(double X, double Y, String name){
    x=X;
    y=Y;
    this.name=name;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
    name = p.name;
  }
  public void add(Point other){
    x=x+other.x;
      y=other.y;
  }
  public void multiply(double c){
    x=c*x;
    y=c*y;
  }
  public void normalize(){
    double a=Math.sqrt(x*x+y*y);
    multiply(1.0/a);
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
}
