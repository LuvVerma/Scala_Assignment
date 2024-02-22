object String_Question6 {
  def main(args:Array[String]):Unit= {
    var str = "madam"
    var rev = ""
    for(i<- str.length()-1 to 0 by -1){
      rev = rev + str(i)
    }
    println(rev)
    if(str==rev){
      println("String \""+str+"\" is a pallindrome !")
    }
    else{
      println("String \""+str+"\" is a not pallindrome !")
    }
  }
}
