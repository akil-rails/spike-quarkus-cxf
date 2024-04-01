package com.spliceforms;

import com.spliceforms.model.NoWsdlClient2Request;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace = NoWsdlClient2.TARGET_NS)
public interface NoWsdlClient2 {
  public static final String TARGET_NS = "http://com.spliceforms/NoWsdlClient2";

  @WebMethod
  String sayHello(NoWsdlClient2Request name);
}

