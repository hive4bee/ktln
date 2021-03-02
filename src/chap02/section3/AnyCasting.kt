package chap02.section3

fun main(){
    var x:Any
    x="Hello"
    if(x is String){
        println(x.length)//x는 자동적으로 String으로 스마트 캐스트
    }

    val xx:String =x as String//as에 의한 스마트 캐스트
    val xxx:String?=x as? String//null 예외발생 방지


}