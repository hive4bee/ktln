package chap03.section5

fun main(){
    val result=add(10,2)
    println(result)
}
//fun(x:Int, y:Int):Int=x+y
val add:(Int, Int)->Int=fun(x,y)=x+y
val add2=fun(x:Int, y:Int)=x+y
val add3={x:Int, y:Int -> x+y}