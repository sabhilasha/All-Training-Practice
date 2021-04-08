class JSC204 {
  static int m1(short s)  {return s;}   // 1
  static int m2(float f) {return f;}    // 2
  public static void main(String[] args) {
    short s = 3; float f = 5.0f;
    System.out.print(""+m1(s)+m2(f));
}}
