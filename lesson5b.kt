
class Fish{
    val type:String="tilapia"
    val color:String="silver"
    val size:Int=2
    val weight:Double=5.6
    val area:String="mud"
    val session:String="rainy"

    fun swim(){
        println("it swim fast")
    }
    fun taste(){
        println("it is delicious")
    }
    fun price(){
        println("the price is affordable")
    }
    fun market(){
        println("its is available in all fish stores")
    }
    fun eat(){
        println("everyone can eat fish")
    }

}

fun main(){
 val myobject= Fish()
  println(myobject.type)
  println(myobject.color)
  println(myobject.size)
  println(myobject.area)
  println(myobject.session)



  println(myobject.swim())
  println(myobject.taste())
  println(myobject.price())
  println(myobject.eat())

   

}






