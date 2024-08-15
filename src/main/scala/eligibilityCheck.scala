object eligibilityCheck {
  def main(args:Array[String]):Unit={
    val age = 15
    if(age>=16 && age>=18){
      println("Eligible to vote and Drive both")
    }
    else if (age>=16){
      println("Eligible to Drive")
    }
    else if(age>=18){
      println("Eligible to vote")
    }
    else{
      println("You are not Eligible to vote or Drive")
    }
  }
}
