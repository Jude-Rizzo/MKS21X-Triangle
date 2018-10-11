public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point p, Point q, Point r){
     v1 = new Point(p);
     v2 = new Point(q);
     v3 = new Point(r);
  }

  public Triangle(double a, double b, double c, double d, double e, double f){
    v1 = new Point(a,b);
    v2 = new Point(c,d);
    v3 = new Point(e,f);
  }

  public double getPerimeter(){
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1));
  }

  public Point getVertex(int index){
    if (index == 0)
      return v1;
    if (index == 1)
      return v2;
    return v3;
  }

  public String toString(){
    return "Triangle  A" + v1.toString() + " B" + v2.toString() + "C " + v3.toString();
    }

  public void setIndex(int index, Point p){
    if (index == 0)
      v1 = new Point(p);
    if (index == 1)
      v2 = new Point(p);
    if (index == 2)
      v3 = new Point (p);
  }
}
