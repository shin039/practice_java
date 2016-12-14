package practice_java.Instant;

/**
 * Enum動作確認用
 */
public enum EnumChk {
   GUITAR("play the guitar")
  ,BASS  ("play the bass")
  ,VOCAL ("sing a song")
  ,DRUM  ("Drumming");

  // メンバ
  private final String style;

  /**
   * コンストラクタ
   */
  EnumChk(String play_style){ style = play_style; }

  /**
   * メソッド
   */
  public void play(){ System.out.println(style); }

  /**
   * 確認用Mainメソッド
   */
  public static void main(String[] args){
    EnumChk guitar = EnumChk.GUITAR;
    EnumChk bass   = EnumChk.BASS;
    EnumChk vocal  = EnumChk.VOCAL;
    EnumChk drum   = EnumChk.DRUM;

    guitar.play();
    bass.play();
    vocal.play();
    drum.play();

    EnumChk.BASS.play();
  }
}
