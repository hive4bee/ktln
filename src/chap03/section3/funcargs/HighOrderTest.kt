package chap03.section3.funcargs

fun main(){
    var result:Int
    val multi:(Int,Int)->Int={x:Int, y:Int -> x*y}//생략되지 않은 전체 표현
    val multi2={x:Int, y:Int -> x*y}//선언 자료형 생략
    val multi3:(Int, Int)->Int={x,y->x*y}//람다식 매개변수 자료형의 생략
    //선언 자료형과 람다식 매개변수 자료형 둘 다 생략하면 오류가 발생한다.
    result=multi(10,20)
    println(result)

    val greet:()->Unit={println("Hello World")}//매개변수와 반환값이 없음, 화살표 생략 가능
    val square:(Int)->Int={x->x*x}
}
