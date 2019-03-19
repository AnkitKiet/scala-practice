class Third(val xc: Int, val yc: Int) {
  var x = xc
  var y = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("X,Y is moved to " + x, y)
  }

}

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Third(xc, yc) {
  var z = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz
    println("X,Y,Z is now moved to " + x, y, z)
  }
}

object DemoThird {
  def main(args: Array[String]): Unit = {
    val loc = new Location(10, 20, 30)
    loc.move(1, 1, 1)
  }
}
