object negativeAndOddNo {
  def main(args:Array[String]):Unit={
    val a = -7
    val b = a<0 && a%2 != 0
    println(b)
  }
}
