// objects and classes are essential building blocks for object orinted programming (OOP) 
// a class is a blueprint for creating objects  
// A class defines theb properties and functions (behaviours )that the object created will have 
// An object is an instance of a class  meaning an object is a specific object created with that class blueprint

class Person{
    // properties 
    val name:String="susan"
    val age:Int=26
    val weight:Double=69.6
    val gender:String="Female"
    val skincolor:String="brown"
    val tribe:String="Luo"
    val height:Double=1.7
    val nationality:String="Kenyan"
    val religion:String="Christian"
    val status:String="Single"

// functions /behaviours of a Person 

  fun speak(){
    println("I am talking")
  }

  fun eat(){
    println("I am eating")
  }
  fun talk(){
    println("i like talking")
  }
  fun sleep(){
    println("I sleep everyday")
  }
  fun run(){
    println("i am running")
  }
  fun sit(){
    println("I am sitting")
  }
  fun learn(){
    println("i am a student")
  }
  fun pray(){
    println("i am a prayer warrior")
  }
  fun play(){
    println("i play cundy crash")
  }
  fun sing(){
    println("i love singing")
  }



}


fun main(){
    // create an object using person class and store the value in a variable 

  val myobject = Person()
  println(myobject.name)
  println(myobject.gender)
  println(myobject.weight)
  

  println(myobject.speak())
  println(myobject.sing())
  println(myobject.pray())
  println(myobject.play())
 
  
}