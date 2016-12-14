package practice_java.effectivejava.no3;

/**
 * シングルトンクラス２
 */
public class Single2 implements SingleIF {
  private static final Single2 Instance = new Single2();
  private Single2(){}

  public static Single2 getInstance(){return Instance;}

  public void echo(String arg){System.out.println(arg);}
}
