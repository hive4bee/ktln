package chap03.section3

fun main(){
    twoLambda({a,b->"First $a $b"}, {"Second $it"})//매개변수가 1개 일때 $it사용가능
    twoLambda({a,b->"First $a $b"}){"Second $it"}//위와 동일
}
fun twoLambda(first:(String, String)->String, second:(String)->String){
    println(first("oneParam", "twoParam"))
    println(second("oneParam"))
}