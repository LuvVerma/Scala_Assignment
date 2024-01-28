object Question1 {
  def main(args:Array[String]):Unit={
    kgtoGrams(56)
  }
  def kgtoGrams(kg:Int):Unit={
    var grams = kg*1000
    println(s"The weight in grams is : $grams grams")
  }
}
