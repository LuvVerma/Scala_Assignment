object For_Loop_Question11 {
  def main(args:Array[String]):Unit={
    var List = Array(1,2,3,4,5)
    for(i<- List.length-1 to 0 by -1){
      println(List(i))
    }
  }
}
