object multipleOf3and7 {
  def main(args:Array[String]):Unit={
    val a = 21
    val b = a%3==0 && a%7==0
    println(b)
  }
}
