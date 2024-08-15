object divBy4Or6 {
  def main(args:Array[String]):Unit={
    val a = 24
    val b = a%4==0 || a%6==0
    println(b)
  }
}
