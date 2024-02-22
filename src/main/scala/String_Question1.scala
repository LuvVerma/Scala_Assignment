object String_Question1 {
  def main(args:Array[String]):Unit={
    var str = "Betty bought a bit of butter"
    var ch = 'f'
    var count = 0
    for(i<- 0 until str.length()){
      if(ch==str.charAt(i)){
         count+=1
      }
    }
    println(count)
  }
}
