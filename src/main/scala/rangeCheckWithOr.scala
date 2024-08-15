object rangeCheckWithOr {
  def main(args:Array[String]):Unit={
    var a: Int = -5
    var c: Boolean = ( a< -10 || a>10 )
      println(c)
  }
}
