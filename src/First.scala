/*
* First App to demonstrate how Scala works
*
* There are two ways to define main() method
*/

object First {

  /*
   def main(args: Array[String]) {
    println("Hello");
  }
   */

  def main(args: Array[String]): Unit = {
    println("Hello")

    println(square(2))
  }

  def square(x: Int): Int = {
    var y = x * x
    dataTypeExample(y,"Hello",0.5f,0.00)
    y
  }

  def dataTypeExample(x:Int, y:String, z:Float, p:Double): Unit ={
    println(x+" ",y+" ",z+" ",p+" ")
  }


}
