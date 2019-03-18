class Second(val x: Int) {
  var xLocal: Int = x

  def move(): Unit = {
    xLocal = xLocal + 1
    println("Moved to " + xLocal)
  }
}

object Demo {

  def main(args: Array[String]): Unit = {
    val point = new Second(5)
    point.move()
  }

}
