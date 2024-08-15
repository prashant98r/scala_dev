object ageGroupClassify {
  def main(args:Array[String]):Unit={
    val age = 15
    if (age < 13) {
      println("Child")
    } else if (age >= 13 && age <= 19) {
      println("Teenager")
    } else {
      println("Adult")
    }
  }
}

