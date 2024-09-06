public class StarTriangle {
  public static void main( String[] args) {
    int n=5;
    String s = "";
    for (int i=1; i<=n; i++) {
      s="";
      for (int j=1; j<=i; j++) {
        s+="*";
      }
      System.out.println(s); 
    }
  }
}
