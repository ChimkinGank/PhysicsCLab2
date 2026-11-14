public class Sector{
  private Point main;
  private Point v1;
  private Point v2;
  private double angle;

  public Sector( double x0, double y0, double x1, double y1,double x2, double y2, double angle){
    main=new Point(x0,y0,"");
    v1=new Point(x1,y1,"");
    v2=new Point(x2,y2,"");
    this.angle=angle;
  }

  public Sector( Point main,Point v1,Point v2,double angle){
    this.main=Point.copy(main);
    this.v1=Point.copy(v1);
    this.v2=Point.copy(v2);
    this.angle=angle;
  }

  public String toString(){
    return "{"+main.toString()+v1.toString()+v2.toString()+angle+"}";
  }

  public Point com(){
    Point temp = new Point(main);
    Point temp1 = new Point(v1);
    Point temp2 = new Point(v2);
    temp.multiply(-1.0);
    temp1.add(temp);
    double k = temp1.magnitude();
    temp2.add(temp);
    temp1.add(temp2);
    temp1.normalize();
    temp1.multiply(4*k*Math.sin(angle/2.0)/(3*angle));
    temp.multiply(-1.0);
    temp.add(temp1);
    return temp;
  }

  public double area(){
    double a=main.distanceTo(v1);
    return a*a*angle/2;
  }



}
