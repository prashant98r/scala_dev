object divisibleBy5or9 {
  def main(args:Array[String]):Unit={
    val a = 45
    val b = a%5==0 || a%9==0
    println(b)
  }
}
