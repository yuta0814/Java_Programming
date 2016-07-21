//MyPointクラス
public class MyPoint{
  private int x;  //x座標を入れる変数
  private int y;  //y座標を入れる変数

  public MyPoint(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public double getR(){
    double r = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    return r;
  }

  public double getTheta(){
    double theta = Math.atan2(getY(), getX());
    theta = Math.toDegrees(theta);
    return theta;
  }

  public boolean equals(MyPoint aPoint){
    boolean ans;
    ans = (getX() == aPoint.getX() && getY() == aPoint.getY());
    return ans;
  }

  public double distance(MyPoint anotherPoint){
    int diffX = getX() - anotherPoint.getX();
    int diffY = getY() - anotherPoint.getY();

    double distance = Math.sqrt(diffX * diffX + diffY * diffY);
    return distance;
  }
}
