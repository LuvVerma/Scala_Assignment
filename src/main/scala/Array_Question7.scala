object Array_Question7 {
  def main(args:Array[String]):Unit={
    var arr = Array("Rohit","Mukesh","Ramesh","Suresh","Luv")
    var str = "Luv"
    var str_present = false
    for(i<- 0 until arr.length){
      if(arr(i)==str){
        println("Yes! \""+str+"\" is present in the given array at index \""+i+"\"")
        str_present=true
      }
    }
    if(str_present==false){
      println("Sorry! The given string is not present in the given array!")
    }

  }
}
