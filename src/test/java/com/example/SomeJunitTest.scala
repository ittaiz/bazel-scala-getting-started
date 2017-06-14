package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(classOf[JUnit4])
class SomeJunitTest {

  @Test
  def passingTest(): Unit = {
  	println("Scala JUnit Test message")
  }
}