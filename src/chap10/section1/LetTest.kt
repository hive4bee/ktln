package chap10.section1

/**
 * let()함수는 함수를 호출하는 객체 T를 이어지는 block의 인자로 넘기고 block의 결괏값 R을 반환한다.
 *
 */
fun main() {
    val score: Int? = 32
    //var score = null

    //일반적인 null검사
    fun checkScore(){
        if(score != null){
            println("Score: $score")
        }
    }
    fun checkScoreLet(){
        println(score)
        score?.let{println("Score: $score")}//null일 경우 람다식이 수행되지 않음
        val str=score.let{it.toString()}
        println(str)
    }
    checkScore()
    checkScoreLet()
}