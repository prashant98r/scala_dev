object rangeCheckWithOr {
  def main(args:Array[String]):Unit={
    val a: Int = -5
    val c: Boolean = a< -10 || a>10
      println(c)
  }
}
