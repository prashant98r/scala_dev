object oddAndNotDivBy4 {
  def main(args:Array[String]):Unit={
    val a = 15
    val b = a%2 !=0 && a%4 != 0
    println(b)
  }
}
