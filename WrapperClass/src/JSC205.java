class JSC205 {
  static int m1(int i) {return i;}     // 1
  static void m2(int i) {return i;}    // 2
  static int m3(int i) {return;}       // 3
  public static void main(String[] args) {
    System.out.print(""+m1(1)+m2(2)+m3(3)); // 4
}}
