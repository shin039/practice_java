package practice_java.effectivejava.no4;

public class ConstantList {
  
  /**
   * privateのコンストラクタでインスタンス化を防ぐ。
   */
  private ConstantList(){}
  
  public static final int CONST1 = 1;
  public static final int CONST2 = 2;
  public static final int CONST3 = 3;
  public static final int CONST4 = 4;
  public static final int CONST5 = 5;
  public static final int CONST6 = 6;
  public static final int CONST7 = 7;
  
  public static void main(String[] args){
    System.out.println(ConstantList.CONST1);
  }
  
}
