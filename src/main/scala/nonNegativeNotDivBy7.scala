object nonNegativeNotDivBy7 {
  def main(args:Array[String]):Unit={
    val a = 14
    val b = a>0 && a%7 != 0
    println(b)
  }
}
