package chap10.section1

/**
 * apply()함수는 특정 객체를 생성하면서 함께 호출해야 하는 초기화 코드가 있는 경우 사용할 수 있다.
 * apply()함수와 also함수의 다른 점은 T.()와 같은 표현에서 람다식 확장 함수로 처리된다는 것이다.
 */
fun main(){
    data class Person(var name:String, var skills:String)

    var person=Person("Kildong", "Kotlin")
    person.apply{this.skills="Swift"}//여기서 this는 person객체를 가리킴
    println(person)

    val returnObj = person.apply{
        name="Sean"//this는 생략할 수 있음
        skills="JAVA"//this없이 객체의 멤버에 여러 번 접근
    }
    println(person)
    println(returnObj)
}
/**
 * 그러면 also()함수와 무엇이 다른가?
 * 바로 객체를 넘겨받는 방법이 다르다.
 * also()함수에서는 it을 사용해 멤버에 접근한다.
 * person.also{it.skills="JAVA"}//it으로 받고 생략할 수 없음
 * person.apply{skills="Swift"}//this로 받고 생략
 */