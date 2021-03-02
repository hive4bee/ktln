package chap04.section1

fun main(){
    //1
//    val x=3
//    when(x){
//        1->println("x==1")
//        2->println("x==2")
//        3,4->println("x==3 or x==4")
//        else->{
//            println("x는 1, 2가 아닙니다.")
//        }
//    }
    //2
//    val x=13
//    when(x){
//        in 1..10->print("x는 1 이상 10 이하입니다.")
//        !in 10..20->print("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
//        else->print("x는 어떤 범위에도 없습니다.")
//    }
    //3
    val str:Any="안녕하세요"
    val result=when(str){
        is String -> "문자열입니다."
        is Long->"Long"
        else -> false
    }
    println("result: $result")

    print("Enter the score: ")
    val score=readLine()!!.toDouble()
    var grade:Char='F'
    when(score){
        in 90.0..100.0->grade='A'
        in 80.0..89.9->grade='B'
        in 70.0..79.9->grade='C'
        !in 70.0..100.0->grade='F'
    }
    println("Score: $score, Grade: $grade")
}