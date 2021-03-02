package chap03.section3

fun main(){
    noParam({"Hello World!"})
    noParam({"Hello World!"})
    oneParam({a->"Hello World"})
    moreParam({a,b->"Hello World! $a $b"})
}
//매개변수가 없는 람다식이 noParam함수의 매개변수 out으로 지정됨
fun noParam(out:()->String)=println(out())
fun oneParam(out:(String)->String){
    println(out("OneParam"))
}
fun moreParam(out:(String, String)->String){
    println(out("OneParam", "TwoParam"))
}