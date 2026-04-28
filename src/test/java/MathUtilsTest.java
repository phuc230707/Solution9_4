import org.example.MathUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {
  private MathUtils mathUtils;
  @BeforeEach
  void setUp(){
    mathUtils = new MathUtils();
  }
  @Test
  void sumTest(){
    assertEquals(5 , mathUtils.tinhTong(2 , 3));
  }
  @Test
  void divideTest(){
    assertEquals(2 , mathUtils.divide(10 , 5));
  }
  @Test
  void divideExceptionTest(){
    assertThrows(IllegalArgumentException.class , () -> {
      mathUtils.divide(10 , 0);
    });
  }
  @Test
  void testduongdanfile(){
    mathUtils.createMyFile();
  }
}
