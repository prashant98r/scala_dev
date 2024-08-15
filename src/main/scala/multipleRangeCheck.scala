object multipleRangeCheck {
  def main(args:Array[String]):Unit={
    val a =25
    val b = a>=1 && a<=10 || a>=20 && a<=30
    println(b)
  }
}
