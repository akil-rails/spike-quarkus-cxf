This is to demosnstrate the un-expected behaviour of `quarkus test` when multiple CxfClient's are used, and with complex types.

### _Scenario : Failure when the 2 clients are enabled._
  1. Clone the repo
  2. Make sure the code for the 2 tests is un-commented.
  3. Run `quarkus test`
  4. Neither test will pass; you will see the following error

		`
		2024-04-01 18:25:25,950 INFO  [io.qua.test] (Test runner thread) Running 1/2. Running: com.spliceforms.NoWsdlClient1Test#testSayHello()
		java.lang.IllegalArgumentException: argument type mismatch
			at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:107)
		`

### _Scenario : Success every time when only the primitive types are used._
  1. Clone the repo
  2. Comment out the code in `NoWsdlClient2Test.java`
  3. Keep the coode in `NoWsdlClient1Test.java`
  4. Run `quarkus test` --> this will succeed
  5. Rerun tests as many times --> will always succeed

### _Scenario : Success only one time when only complex types are used._

  1. Clone the repo
  2. Comment out the code in `NoWsdlClient1Test.java`
  3. 3. Keep the coode in `NoWsdlClient12est.java`
  4. Run `quarkus test` --> this will succeed
  5. Rerun tests as many times --> will always fail
  
