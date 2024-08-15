object divisibleBy2or5 {
  def main(args:Array[String]):Unit={
    val a = 25
    val b = a%2==0 || a%5==0
    println(b)
  }
}
