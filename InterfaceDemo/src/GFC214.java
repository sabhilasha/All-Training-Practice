class GFC214 {
  static void m1(boolean b1) {System.out.print("boolean ");}
  static void m1(byte b1) {System.out.print("byte ");}
  static void m1(short s1) {System.out.print("short ");}
  static void m1(char c1) {System.out.print("char ");}
  static void m1(int i1) {System.out.print("int ");}
  public static void main(String[] args) {
    byte b1; m1(b1 = 1); m1(b1); m1(b1 == 1);
}}
