package chap10.section1

/**
 * takeIf()함수와 takeUnless()함수의 활용
 * takeIf()함수는 람다식이 true이면 결과를 반환하고, takeUnless()함수는 람다식이 false이면 결과를 반환
 * //기존코드
 * if(someObject != null && someObject.status){
 *  doThis()
 * }
 * //개선코드
 * if(someObject?.status ==true){
 *  doThis()
 * }
 * //takeIf()함수를 사용해 개선한 코드
 * someObject?.takeIf{it.status}?.apply{doThis()}
 */
fun main(){
    val input="Kotlin"
    val keyword="in"
    //입력문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf()함수를 사용하여 구현
    input.indexOf(keyword).takeIf{it>=0}?: error("Keyword not found")
    //takeUnless()함수를 사용하여 구현
    input.indexOf(keyword).takeUnless{it<0}?:error("keyword not found")
}