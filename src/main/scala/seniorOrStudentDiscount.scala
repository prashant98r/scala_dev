object seniorOrStudentDiscount {
  def main(args:Array[String]):Unit={
    val age = 63
    if(age>60){
      println("You are eligible for senior citizen discount")
    }
    else if(age<25){
      println("You are eligible for student discount")
    }
    else{
      println("No discount")
    }
  }
}
