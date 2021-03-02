package chap04.section3

fun main(){
    retFunc()
}
inline fun inlineLambda(a:Int, b:Int, out:(Int, Int)->Unit){
    out(a,b)
}

fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3){a, b->
        val result=a+b
        if(result>10) return//lambda
        println("result: $result")
    }
    println("end of retFunc")
}
/*
   인라인으로 선언되지 않은 람다식에서는 return을 그냥 사용할 수 없다.
   return@label과 같이 라벨 표기와 함께 사용해야 한다.
   라벨이란 코드에서 특정한 위치를 임의로 표시한 것으로, @기호와 이름을 붙여서 사용한다.
   인라인으로 선언된 함수에서 람다식을 매개변수로 사용하면 람다식에서
   return을 사용할 수 있다.
 */