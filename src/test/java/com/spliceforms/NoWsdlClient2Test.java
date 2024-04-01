package com.spliceforms;

import org.junit.jupiter.api.Test;

import com.spliceforms.model.NoWsdlClient2Request;

import io.quarkiverse.cxf.annotation.CXFClient;
import io.quarkus.logging.Log;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class NoWsdlClient2Test {
  @Inject
  @CXFClient
  NoWsdlClient2 client2;

  @Test
  public void testSayHello() {
    NoWsdlClient2Request request = new NoWsdlClient2Request();
    request.name = "quarkiverse";
    var result = client2.sayHello(request);
    Log.info(result);
  }
}
