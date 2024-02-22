object String_Question4 {
  def main(args:Array[String]):Unit= {
    var str = "Betty bought a bit of butter"
    var arr = str.split(" ")
    var longest_word = arr(0)
    for(i<- 0 until arr.length){
      if(arr(i).length()>longest_word.length()){
        longest_word = arr(i)
      }
    }
    println("Longest word is - "+longest_word)
    println("Length of the word is "+longest_word.length())
  }
}
