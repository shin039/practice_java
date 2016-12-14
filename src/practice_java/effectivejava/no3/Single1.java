package practice_java.effectivejava.no3;

/**
 * シングルトンクラス１
 */
public class Single1 implements SingleIF{
  public static final Single1 Instance = new Single1();
  private Single1(){}

  public void echo(String arg){System.out.println(arg);}
}
