class SRC122 {
  static String m1(int i) {return "I";}
  static String m1(long i) {return "L";}
  static String m1(float i) {return "F";}
  static String m1(double i) {return "D";}
  public static void main (String[] args) {
    System.out.print(m1(Math.abs(1.0f)) + m1(Math.abs(1.0)));
    System.out.print(m1(Math.round(1.0f)) + m1(Math.round(1.0)));
}}


