fun main(){
    val age:Int=-26
    if (age>=0 && age  <= 13){
    println("$age child")
    }
    else if (age >= 13 && age <= 19){
    println("$age teenager")
    }
    else if (age >= 20 && age <= 35){
    println("$age young adult")
    }
    else if (age >=36 && age <= 55){
    println("$age Adult")
    }
    else if (age > 55){
    println("$age senior")
    }
    else
    println("invalid age")
}
