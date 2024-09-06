public class Quadrant {
  public static void main( String[] args) {
       System.out.println(quadrant(3, 20));
    }

  public static int quadrant(double x, double y) {
    int q=-1;
    if (x==0 || y==0) q=0;
    else if (x>0 && y>0) q=1;
    else if (x>0 && y<0) q=4;
    else if (x<0 && y>0) q=2;
    else if (x<0 && y<0) q=3;
    return q;
  }
}
