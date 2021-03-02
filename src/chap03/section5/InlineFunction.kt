package chap03.section5

fun main(){
    //인라인 함수 shortFunc()의 내용이 복사되어 shortFunc으로 들어감
    shortFunc(3){println("First call: $it")}
    shortFunc(5){println("Second call: $it")}
}

inline fun shortFunc(a:Int, out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}
/**
 * 인라인 함수는 이 함수가 호출되는 곳에 함수 본문의 내용을 모두 복사해 넣어 함수의
 * 분기 없이 처리되기 때문에 코드의 성능을 높일 수 있다.
 */