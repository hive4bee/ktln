package chap04.section2

fun main(){
    var sum=0
    for(x in 1..10){
        sum+=x
    }
    println("sum: $sum")
    //for(x in 1..5) println(x)
    //이렇게 숫자를 역순으로 작성하는 방법으로는 아무것도 출력되지 않음
    //for(i in 5..1) println(i)
    //for(i in 5 downTo 1) println(i)//downTo키워드를 사용해야 한다.
    //for(i in 1..5 step 2) print(i) //증감 설정은 step키워드를 사용한다.
    //for(i in 5 downTo 1 step 2) print(i)
}