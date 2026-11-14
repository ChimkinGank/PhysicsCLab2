import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    try{
    File file = new File("Points.txt");
    Scanner scan = new Scanner(file);
    ArrayList<Point> points = new ArrayList<Point>();
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Triangle> triangles = new ArrayList<Triangle>();
    while (scan.hasNext()) {
    scan.next();
    String name = scan.next();
    scan.next();

    String coords = scan.next();
    double x = Double.parseDouble(coords.substring(1, coords.indexOf(',')));
    double y = Double.parseDouble(coords.substring(coords.indexOf(',') + 1, coords.length() - 2));
    points.add(new Point(x,y,name));
    names.add(name);
  }

    File file2 = new File("Segments.txt");
    Scanner scan2 = new Scanner(file2);

while (scan2.hasNextLine()) {
    String line = scan2.nextLine();
    int dash = line.indexOf("--");
    int comma = line.indexOf(",");

    String p1 = line.substring(5, dash);
    String p2 = line.substring(dash + 2, comma);
    int c1 = names.indexOf(p1);
    int c2 = names.indexOf(p2);
    points.get(c1).adjAdd(points.get(c2));
    points.get(c2).adjAdd(points.get(c1));


}

  for (int i = 0; i<points.size(); i++){
    Point c = points.get(i);
    ArrayList<Point> adjl = c.adjl;
    for (int j = 0; j<adjl.size(); j++){
      for (int k = 0; k<adjl.size(); k++){
        Point d = adjl.get(j);
        Point e = adjl.get(k);
        if (d.adj(e)){
          triangles.add(new Triangle(c,d,e));
        }
      }
    }
  }

  double mass = 0;
  for (Triangle t : triangles) {
    mass+=t.area();
}
Point centroid = new Point(0.0,0.0,"");
for (Triangle t : triangles) {
  Point temp = t.com();
  temp.multiply(t.area()/mass);
  centroid.add(temp);
}

System.out.println(centroid);

  } catch(FileNotFoundException e){

  }
  }


}
