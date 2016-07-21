//SampleMyPointクラスの作成
public class SampleMyPoint{
  public static void main(String[] args){
    MyPoint p1 = new MyPoint(10, 10);
    MyPoint p2 = new MyPoint(6, 8);
    MyPoint p3 = new MyPoint(-10, 10);
    MyPoint p4 = new MyPoint(-6, -8);

    System.out.println(p1 + "のrは" + p1.getR());
    System.out.println(p1 + "のthetaは" + p1.getTheta());

    System.out.println(p2 + "のrは" + p2.getR());
    System.out.println(p2 + "のthetaは" + p2.getTheta());

    System.out.println(p3 + "のrは" + p3.getR());
    System.out.println(p3 + "のthetaは" + p3.getTheta());

    System.out.println(p4 + "のrは" + p4.getR());
    System.out.println(p4 + "のthetaは" + p4.getTheta());

  }
}
