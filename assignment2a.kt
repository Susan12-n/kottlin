fun main(){
    val grade:Int=70
    if (grade<=50)
    println("$grade  fail")
    else if (grade>50 && grade < 59){
    println("$grade  pass")
    }
    else if (grade >60 && grade < 69){
    println("$grade  credit")
    }
    else  if (grade >70 && grade < 89){
    println("$grade  distinction")
    }
    else if (grade >90 && grade < 100){
    println("$grade  High Distiction")
    }
    else
    println("Invalid grade")

}