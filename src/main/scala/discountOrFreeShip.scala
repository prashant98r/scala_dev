object discountOrFreeShip {
  def main(args:Array[String]):Unit={
    val amount = 120
    if(amount>150){
      println("You are eligible for discount")
    }
    else if(amount>100){
      println("You are eligible for free shipping")
    }
    else{
      println("Nothing you get")
    }
  }
}
