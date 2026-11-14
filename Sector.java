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
    return "{"+main.toString()+v1.toString()+angle+"}";
  }

  public double area(){
    double a=main.distanceTo(v1);
    return a*a*angle;
  }



}
