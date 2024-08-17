object factorial {
  def main(args:Array[String]):Unit={
    var n=11
    var fact=1
    for(i <- 2 to n+1){
      fact=fact*i
      println(fact)
    }
  }
}
