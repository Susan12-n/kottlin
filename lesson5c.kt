// inheritance in OOP is a concept where a child class can inherit the properties and behaviours from a super class/parent class 
// NB:to inherit from parent class it MUST be opened 
open class Animal{
    
//    functions 
    fun walk(){
        println("the animal can walk")
    }
    fun eat(){
        println("the animal can eat")
    }

}
class cow : Animal(){
    // functions 
    fun  sleep(){
        println("a cow can sleep")
    }
}

fun main(){
    val mycow=cow()
    println(mycow.sleep())
    println(mycow.walk())
    println(mycow.eat())


}