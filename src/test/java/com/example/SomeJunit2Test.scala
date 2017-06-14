package src.test.java.com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(classOf[JUnit4])
class SomeJunit2Test {

  @Test
  def passingTest2(): Unit = {
  	println("Scala JUnit Test message")
  }
}