fun main(){
    //  if else if  statements 
    val amount:Int=20000
    if (amount < 0)
    println("the amount is negative")
    else if(amount >0 && amount< 200)
    println("the charges is free")
    else if(amount >200 && amount < 2500)
    println("the charges is 34")
    else if(amount >2501 && amount < 5000)
    println("the charges is 67")
    else if(amount> 5001 && amount < 10000)
    println("the charges is $ 112")
    else if(amount >10000 && amount < 20000)
    println("the charges is $ 197")
    else
    println("Any amount over 20000 you pay 250")


}