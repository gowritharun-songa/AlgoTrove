
public class Code {
  public static void main(String[] args) {
    String s = "1337c0d3";
    int result = myAtio(s);
    System.out.println(result);
  }
  static int myAtio(String s) {
    int sign = 1, idx = 0;
    long res = 0;
    // leading white space
    while(idx < s.length() && s.charAt(idx) == ' ') {
      idx++;
    }
    // determine the sign
    if(s.charAt(idx) == '-') {
      sign = -1;
      idx++;
    } else if(s.charAt(idx) == '+') {
      idx++;
    }
    // reuslt making
    while(idx < s.length() && Character.isDigit(s.charAt(idx))) {
      res = res * 10 + (s.charAt(idx) - '0');
      if(sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
      if(sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
      idx++; 
    }
    return (int) (sign * res);
  }
}