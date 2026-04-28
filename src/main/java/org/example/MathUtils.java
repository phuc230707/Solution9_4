package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class MathUtils {

  private static final Logger LOGGER = LoggerFactory.getLogger(MathUtils.class);

  /**
   * Tính tổng hai số nguyên.
   *
   * @param a số hạng thứ nhất.
   * @param b số hạng thứ hai.
   * @return tổng của a và b.
   */
  public static int tinhTong(final int a, final int b) {
    return a + b;
  }

  public void createMyFile()  {
    // LỖI: Dấu '\' chỉ chạy trên Windows. Linux sẽ coi đây là một phần của tên file.
    // LỖI: Linux không có ổ đĩa 'C:', nó bắt đầu bằng '/' (root).
    String path = "C:\\data\\projects\\output.txt";

    File file = new File(path);
    try {
      if (file.createNewFile()) {
        System.out.println("File created!");
      }
    } catch (IOException e) {
      System.out.println("File doesn't exist");
    }
  }
  /**
   * Thực hiện phép chia hai số thực.
   *
   * @param a số bị chia.
   * @param b số chia.
   * @return thương của phép chia.
   */
  public static int divide(final int a, final int b) {
    if (b == 0){
      LOGGER.error("b không thể là số 0");
      throw new IllegalArgumentException();
    }
    return a / b;
  }
}

