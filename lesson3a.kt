fun main(){
    // for loops 
    // a for loop is a control flow statement that allows you to execute a block of code repeatedly 
    // it can be used as follows 
    // 1.loop through a range  
    for(i in 1..10)
    println(i)
    // loop from 30 to 50 
    for(i in 30..50)
    println(i)

    // 2.loop through the same range in steps
    //  loop from 1 to 10 in step 2
    for (i in 1..10 step 2)
    println(i)
    // 3.loop through a range in downsteps
    // loop from 100 to 0 in downsteps of 5
    for(i in 100 downTo 0 step 5)
    println(i)
    // 4.loop through a list 
    val students =arrayOf("susan","kenache","teddy","mary","prisilar","banana","nzioka,")
    for (i in students){
        println(i)
    }
    val counties =arrayOf("kiambu","lamu","kajiado","nyeri","kisumu","siaya","homabay","nandi","marakwet","vihiga")
    for (i in counties){
        println(i)
    }
    val animals=arrayOf("monkey","cheetar","lion","hyena","zebra","elephant")
    for (i in animals){
       println(i)
    }   
    val shoppingcart=arrayOf("bread","shoes","clothes","lesos","belts")
    for (i in shoppingcart){
       println(i)
    }   
   val months=arrayOf("january","february","match","april","may","june","july","august","september","october","november","december")
    for (i in months){
       println(i)
    }   
     val books=arrayOf("jungle","utengano","mstahiki","the river","betrayal","moyo")
    for (i in books){
       println(i)
    }   
     val movies=arrayOf("passion of revenge","Double kara","doice amor","bang bang","inspecta mwala","zora")
    for (i in movies){
       println(i)
    }
     val movieratings=arrayOf("10","20","30","40","50","60")
    for (i in movieratings){
       println(i)
    }      
}