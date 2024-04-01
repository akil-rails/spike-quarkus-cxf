This is to demosnstrate the un-expected behaviour of `quarkus test` when multiple CxfClient's are used, and with complex types.

Steps
1. Failure when the 2 clients are enabled.
  1. Close the repo
  2. Run `quarkus test`

This will fail with the following error:
`
2024-04-01 18:25:25,950 INFO  [io.qua.test] (Test runner thread) Running 1/2. Running: com.spliceforms.NoWsdlClient1Test#testSayHello()
java.lang.IllegalArgumentException: argument type mismatch
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:107)
`

1. Success every time when only the primitive types are used
  1. stop quarkus
  2. Comment out the code in `NoWsdlClient2Test.java`
  3. Run `quarkus test` --> this will succeed
  4. Rerun tests as many times --> will always succeed

1. Success only one time when only complex types are used  
  1. stop quarkus
  2. Comment out the code in `NoWsdlClient1Test.java` 
  2. Un-comment `NowWsdlClient2Test.java`
  3. Run `quarkus test` --> this will succeed
  4. Rerun tests as many times --> will always fail
  5. stop quarkus --> you will see the pattern repeat.
