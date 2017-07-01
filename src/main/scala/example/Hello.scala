package example
import com.typesafe.scalalogging.StrictLogging

object Hello extends App with StrictLogging {
  val num = 1
  val str = "foo"
  val msg = s"hello $str $num $str"
  logger.info(msg)
  logger.info(s"hello $str $num")      // fails to compile
  logger.info(s"hello $str $num $str") // also fails
}

