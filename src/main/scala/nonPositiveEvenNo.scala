object nonPositiveEvenNo {
  def main(args:Array[String]):Unit={
    val a = -6
    val b = a<0 && a%2==0
    println(b)
  }
}
