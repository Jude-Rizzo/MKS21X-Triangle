public class Point{
  public double x;
  public double y;

  public Point(double x, double y){
    x = this.x;
    y = this.y;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public void makeX(double n){
    x = n;
  }

  public void makeY(double n){
    y = n;
  }
  public double distanceTo(Point p){
    return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
  }

  public String toString(){
    return "(" + x + "," + y + ")";
  }

}
