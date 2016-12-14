package practice_java.effectivejava.no3;

/**
 * シングルトン3
 */
public enum Single3 implements SingleIF{
    Instance;

  public void echo(String arg){System.out.println(arg);}
}
