object pattern2 {
  def main(args:Array[String]):Unit={
    var num=1
    for(i<-1 to 4){
    for(j<-1 to i ){
        print(num)
      }
      num=num+1
      println(" ")
    }
  }
}
