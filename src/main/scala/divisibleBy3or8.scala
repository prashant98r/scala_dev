object divisibleBy3or8 {
  def main(args:Array[String]):Unit={
    val a = 24
    val b = a%3==0 || a%8==0
    println(b)
  }
}
