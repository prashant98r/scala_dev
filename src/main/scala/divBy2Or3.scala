object divBy2Or3 {
  def main(args:Array[String]):Unit={
    val a =9
    val b = a%2 ==0 || a%3 ==0
    println(b)
  }
}
