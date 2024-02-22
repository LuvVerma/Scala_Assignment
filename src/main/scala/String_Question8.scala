object String_Question8 {
  def main(args:Array[String]):Unit= {
    var str = "Betty bought a bit of butter"
    var arr = str.split(" ")
    var str2 = ""
    for(i<- arr.length-1 to 0 by -1){
      str2 = str2+arr(i)
      if(i!=0){
        str2 = str2+" "
      }
    }
    println(str2)
    //println(str.length())
    //println(str2.length())
  }
}
