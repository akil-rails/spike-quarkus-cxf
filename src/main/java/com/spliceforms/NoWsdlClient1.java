package com.spliceforms;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace = NoWsdlClient1.TARGET_NS)
public interface NoWsdlClient1 {
  public static final String TARGET_NS = "http://com.spliceforms/NoWsdlClient1";

  @WebMethod
  String sayHello(String name);
}

