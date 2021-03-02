package chap03.section5
//인라인함수에서 사용한 람다식을 빠져나오려면 return을 사용한다.
fun main(){
    shortFunc3(3){
        println("First call: $it")
        return
    }
}
inline fun shortFunc3(a:Int, out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")//람다식의 return때문에 실행되지 않음
    //이러한 반환을 비지역 반환(Non-local Return)이라고 부른다.
    //만일 shortFunc3()가 inline키워드로 선언되지 않으면 return문은
    //람다식 본문에 사용할 수 없으므로 return 문을 허용할 수 없다는 오류가 발생한다.
    //그 밖에 out()을 직접 호출해 사용하지 않고 또 다른 함수에 중첩하면 실행 문맥이 달라지므로
    //return을 사용할 수 없다. 이때 비지역 반환을 금지하는 방법이 있다.
}