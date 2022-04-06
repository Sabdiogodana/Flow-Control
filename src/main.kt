fun main(){
oddNumbers()
    println(names(arrayOf("Sabdiyo","Mary","Wangaree","Tanyasis","Lona")))
    serveDrinks(5)
    serveDrinks(13)
    serveDrinks(23)
    div()

}
fun oddNumbers(){
    for(nums in 1 .. 100 ){
        if(nums % 2 !==0){
          println(nums)
        }
    }

}
fun names(name:Array<String>):Int{
    var num=0
    name.forEach { n ->
        if(n.length >5){
            num++
        }
    }
    return num
}
fun serveDrinks(drink:Int){
    if (drink < 6) {
        println(" milk.")
    }
    else if (drink <= 15 && drink >= 6) {
        println("fanta orange.")
    }
    else{
        println(" cocacola.")
    }
}
//Write a function t
fun div(){
    for (x in 1..100){
        if (x%3==0) {
            println("Fizz")
        }else if (x%5==0){
            println("Buzz")
        }
        if (x%3==0 && x%5==0){
            println("FizzBuzz")
        }
    }
}



