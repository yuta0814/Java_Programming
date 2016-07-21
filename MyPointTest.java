public class MyPointTest{
  public static void main(String[] args){
    MyPoint a, b, c, d;
    a = new MyPoint(6, 8);
    b = new MyPoint(10, 10);
    c = new MyPoint(6, 8);
    d = a;

    System.out.println("aは" + a);
    System.out.println("bは" + b);
    System.out.println("cは" + c);
    System.out.println("dは" + d);

    //objectが同一かどうか
    System.out.println("a equals bは" + a.equals(b));
    System.out.println("a equals cは" + a.equals(c));
    System.out.println("a equals dは" + a.equals(d));

    //objectが等価かどうか
    System.out.println("a == bは" + (a == b));
    System.out.println("a == cは" + (a == c));
    System.out.println("a == dは" + (a == d));

  }
}
