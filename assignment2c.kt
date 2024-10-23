fun main(){
    val temprature:Int=20
    if(temprature <=0){
        println("$temprature freezing")
    }
    else if(temprature <=0 && temprature < 16){
        println("$temprature cold")
    }
    else if(temprature > 15 && temprature <= 25){
        println("$temprature moderate")
     }
    else if(temprature >=26 && temprature <= 35){
        println("$temprature warm")
    }
    else if(temprature >35){
        println("$temprature hot")
    }
    else{
    println("invalid tempreture")}
    
}
