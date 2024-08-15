object oddNoCheckWithAnd {
  def main(args:Array[String]):Unit={
    val a = 27
    val b = a%2==1 && a%3==0
    println(b)
  }
}
