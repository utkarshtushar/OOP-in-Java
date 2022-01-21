class Box{
  private int l,b,h;
  public void setDimension(int l,int b,int h){ //instance member function
    this.l=l;
    this.b=b;
    this.h=h;
  }
  public void sendBox(){
    GiftTaker gf = new GiftTaker();
    gf.acceptGift(this);
  }
}
public class Example{
  public static void main(String[] args) {  //static member function
    Box b1 = new Box();
    b1.setDimension(12,10,5);
    b1.sendBox();
  }
}