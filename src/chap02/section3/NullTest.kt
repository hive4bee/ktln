package chap02.section3

fun main(){
    var str1:String?="Hello Kotlin"
    str1=null
    println("str1:$str1")
//    println("str1:$str1 / length: ${str1.length}")
    println("str1:$str1 / length: ${str1?.length}")//null//str1을 세이프 콜로 안전하게 호출
    println("str1:$str1 / length:${str1?.length?:-1}")//세이프 콜과 엘비스 연산자
    val len=if(str1 !=null) str1.length else -1
    println("str1:$str1 / length: $len")
}
