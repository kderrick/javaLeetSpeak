import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    App leetApp = new App();
    assertEquals("happy", leetApp.leetTranslator("happy"));
  }

  @Test
  public void leetspeak_returnsAStringWithTheEsReplacedWithThrees() {
  App leetApp = new App();
  assertEquals("h3ll", leetApp.leetTranslator("hell"));
  }

  @Test
  public void leetspeak_osReplacedWithZeroes() {
  App leetApp = new App();
  assertEquals("M00n", leetApp.leetTranslator("Moon"));
  }

  @Test
  public void leetspeak_CapitalIsReplacedWithOnes() {
  App leetApp = new App();
  assertEquals("1t3m", leetApp.leetTranslator("Item"));
  }

  @Test
  public void leetspeak_SIsReplacedWithZ() {
  App leetApp = new App();
  assertEquals("Eazy", leetApp.leetTranslator("Easy"));
  }


}
