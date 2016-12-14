package practice_java.effectivejava.no3;

/**
 * シングルトン挙動確認クラス
 */
public class SingleMain {
  public static void main(String[] args){
    Single1 sg1 = Single1.Instance;
    Single2 sg2 = Single2.getInstance();
    Single3 sg3 = Single3.Instance;

    sg1.echo("sg1");
    sg2.echo("sg2");
    sg3.echo("sg3");
  }
}
