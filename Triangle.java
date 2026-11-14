public class Triangle{
  private Point v0;
  private Point v1;
  private Point v2;

  public Triangle( double x0, double y0, double x1, double y1, double x2, double y2){
    v0=new Point(x0,y0,"");
    v1=new Point(x1,y1,"");
    v2=new Point(x2,y2,"");
  }

  public Triangle( Point v0,Point v1,Point v2){
    this.v0=Point.copy(v0);
    this.v1=Point.copy(v1);
    this.v2=Point.copy(v2);
  }

  public Point getVertex(int v){
      if (v==0){
        return v0;
      }
      if (v==1){
        return v1;
      }
      else{
        return v2;
      }
  }

  public String toString(){
    return "{"+v0.toString()+v1.toString()+v2.toString()+"}";
  }

  public double getPerimeter(){
    return v0.distanceTo(v1)+v1.distanceTo(v2)+v2.distanceTo(v0);
  }

  public double area(){
    double a=v0.distanceTo(v1);
    double b=v1.distanceTo(v2);
    double c=v2.distanceTo(v0);
    double s=(a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c))/6.0;
  }

  public Point com(){
    Point co = new Point(0,0,"");
    co.add(v0);
    co.add(v1);
    co.add(v2);
    co.multiply(1.0/3);
    return co;
  }

  public void setVertex(int v, Point p){
    if (v==0){
      v0=p;
    }
    if (v==1){
      v1=p;
    }
    else{
      v2=p;
    }
  }

}
