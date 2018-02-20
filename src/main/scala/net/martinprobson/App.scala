package net.martinprobson

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import grizzled.slf4j.Logging


/**
 * @author ${user.name}
 */
object App extends Logging {
  
  def main(args : Array[String]) {

	 
    info("Starting")
    
    info("Stop")

    val r = Rational(1,2)
    println(r * Rational(1,4))
    val l = List(Rational(1,2),Rational(1,2))
    val l2 = List(Rational(1,2),Rational(1,2))
    l == l2
   
  }

}
