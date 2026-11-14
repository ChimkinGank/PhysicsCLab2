public class Sector{
  private Point main;
  private Point v1;
  private double angle;

  public Triangle( double x0, double y0, double x1, double y1, angle){
    main=new Point(x0,y0);
    v1=new Point(x1,y1);
    this.angle=angle
  }

  public Triangle( Point main,Point v1,this.angle){
    this.main=Point.copy(main);
    this.v1=Point.copy(v1);
    this.angle=angle
  }
  
  public String toString(){
    return "{"+main.toString()+v1.toString()+angle+"}";
  }

  public double area(){
    double a=main.distanceTo(v1);
    return a*a*angle();
  }



}
