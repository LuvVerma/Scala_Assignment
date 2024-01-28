object second {
  def main(args:Array[String]):Unit={
//Question1
    //    var sum = 0
//    var i = 1
//    while(i<=10){
//      sum = sum + i
//      i+=1
//    }
//    println(sum)

//    //Question2
//    for(i<-1 to 20 ){
//      if(i%2==0){
//        println(i)
//      }
//    }

    //Question3
    var a = 0
    for(i<-1 to 20 ){
      if(i%2==0){
        if(a==0){
          println(i)
          a=1
        }
        else {
          a=0
        }
      }
    }
  }
}
