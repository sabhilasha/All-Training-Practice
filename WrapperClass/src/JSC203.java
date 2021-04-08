class JSC203 {
  static int m1(byte b) {return b;}   // 1
  static int m2(char c) {return c;}   // 2
  static long m3(long l) {return l;}   // 3
  public static void main(String[] args) {
    byte b = 1; char c = '\u0002'; long l = 4L;
    System.out.print(""+m1(b)+m2(c)+m3(l));
}}
