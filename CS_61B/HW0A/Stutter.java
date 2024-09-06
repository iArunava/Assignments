public class Stutter {
  public static void main( String[] args) {
      String s="ZELDA";
      System.out.println(stutter(s));
    }

  public static String stutter(String s) {
    int l = s.length();
    String ans = "";
    for (int i=1; i<=l ; i++) {
      ans+=s.charAt(i-1);
      ans+=s.charAt(i-1);
    }
    return ans;
  }
}
