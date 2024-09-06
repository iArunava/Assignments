public class PrintIndexed {
  public static void main( String[] args) {
      String s="ZELDA";
      printIndexed(s);
    }

  public static void printIndexed(String s) {
    int l = s.length();
    String ans = "";
    for (int i=0; i<l ; i++) {
      ans+=s.charAt(i);
      ans+=String.valueOf(l-i-1);
    }
    System.out.println(ans); 
  }
}
