package com.spliceforms;

import org.junit.jupiter.api.Test;

import io.quarkiverse.cxf.annotation.CXFClient;
import io.quarkus.logging.Log;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class NoWsdlClient1Test {
  @Inject
  @CXFClient("NoWsdlClient1")
  NoWsdlClient1 client1;

  @Test
  public void testSayHello() {
    var result = client1.sayHello("quarkiverse");
    Log.info(result);
  }
}
