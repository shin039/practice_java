package practice_java.InstantTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import practice_java.Instant.HelloWorld;

/**
 * HelloWorld.javaのテストクラス
 * @author Shin
 *
 */
public class HelloWorld_Test {

  /**
   * テストクラスのstaticイニシャライザ後に呼ばれる。
   */
  @BeforeClass
  public static void BeforeClass(){

  }

  /**
   * テストクラスのコンストラクタ後
   */
  @Before
  public void before(){

  }

  /**
   * テストメソッド
   */
  @Test
  public void Test(){

    String expect_rtn = "Hello World!";
    String chk_target = HelloWorld.helloworld();

    assertEquals(expect_rtn, chk_target);
  }

  /**
   * テストメソッド実行後
   */
  @After
  public void After(){

  }


  /**
   * テストクラスの実行後
   */
  @AfterClass
  public static void AfterClass(){

  }
}
