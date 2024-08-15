object divisibilityBy4or6 {
  def main(args:Array[String]):Unit={
    val a = 18
    val b = a%4==0 || a%6==0
    println(b)
  }
}
