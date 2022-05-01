package processor;

import connector.Request;
import connector.Response;

import java.io.IOException;
/**
 * @author BaoZiming
 * @create 2021-07-09 11:25
 */
public class StaticProcessor {

  public void process(Request request, Response response) {
    try {
      response.sendStaticResource();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}