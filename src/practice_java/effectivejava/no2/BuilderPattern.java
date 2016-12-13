package practice_java.effectivejava.no2;

/**
 * Effective Java 項目2
 * 数多くのコンストラクタパラメータに直面したときはビルダーを検討する。
 */
@SuppressWarnings("unused")
public class BuilderPattern {

  // 必須パラメータ
  private final int require1;
  private final int require2;
  // オプションパラメータ
  private final int opt1;
  private final int opt2;
  private final int opt3;

  /**
   * No2_Builderのコンストラクタ
   */
  private BuilderPattern(Builder builder){
    require1 = builder.require1;
    require2 = builder.require2;
    opt1     = builder.opt1;
    opt2     = builder.opt2;
    opt3     = builder.opt3;
  }

  /**
   * InnerClass Builder
   */
  public static class Builder{
    private int require1;
    private int require2;
    private int opt1 = 0;
    private int opt2 = 0;
    private int opt3 = 0;

    /**
     * コンストラクタ
     */
    public Builder(int require1, int require2){
      this.require1 = require1;
      this.require2 = require2;
    }

    /** オプション1設定 */
    public Builder opt1(int val){this.opt1 =val; return this;}
    /** オプション2設定 */
    public Builder opt2(int val){this.opt2 =val; return this;}
    /** オプション3設定 */
    public Builder opt3(int val){this.opt3 =val; return this;}

    /** Buildメソッド */
    public BuilderPattern build(){return new BuilderPattern(this);}
  }

  /**
   * メインクラス
   * @param args
   */
  public static void main (String[] args){
    BuilderPattern builder = new BuilderPattern.Builder(100, 200).opt1(10).opt2(20).opt3(30).build();
  }
}
