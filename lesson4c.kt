fun main(){
    // functions with parameters 
    // function with parameters are function that takes arguments when being called 
    fun goingToNarok(packege:String){
    println("i am going to buy that $packege")
    }
    goingToNarok("cow")

    // addition 
    fun addTwo(num1:Int,num2:Int){
        val sum=num1+num2
        println("the sum is $sum")
    }
    addTwo(5,7   )

    //subtraction
    fun subTwo(num1:Int,num2:Int){
        val results=num1-num2
        println("the result is $results")
    }
    subTwo(50,25)
    //division
    fun divNum(num1:Int,num2:Int){
        val results=num1/num2
        println("the result is $results")
    }
    divNum(100,25)
    //multiplication
    fun productNum(num1:Int,num2:Int){
        val product=num1*num2
        println("the product is $product")
    }
    productNum(500,25)
}