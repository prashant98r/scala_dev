object discAndFreeShip {
  def main(args:Array[String]):Unit={
    val amount = 120
    if(amount>150 && amount >100){
      println("You are eligible for discount and free shipping")
    }
    else if(amount>100 && amount<150){
      println("You are eligible for free shipping only")
    }
    else{
      println("No discount and no free shipping")
    }
  }
}
