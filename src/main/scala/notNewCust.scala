object notNewCust {
  def main(args:Array[String]):Unit={
    val age = 70
    val newCustomer: Boolean = false
    if(age>65 && newCustomer != true){
      println("You are eligible for senior citizen discount")
    }
  }
}
