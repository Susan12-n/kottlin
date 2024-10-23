fun main(){
    val weight:Double=-69.0
    val height:Double=1.70
    val BMI:Double=weight/(height*height)
    println("$BMI")
    if (BMI < 18.5){
    println("underweight")
    }
    else if(BMI >=18.5 && BMI <= 24.9 ){
    println("normal weight")
    }
    else if(BMI >= 25.0 && BMI <= 29.9 ){
    println("overweight weight")
    }
    else if(BMI >= 30.0 ){
    println("obesity")
    }
    else
    println("Invalid BMI")

}