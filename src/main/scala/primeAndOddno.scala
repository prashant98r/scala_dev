object primeAndOddno {
  def main(args:Array[String]):Unit={
    val a = 17
    val b = a>1 && a%3==0 && a%2 != 0
    println(b)
  }
}
