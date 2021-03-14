package chap10.section1

/**
 * also()함수는 함수를 호출하는 객체 T를 이어지는 block에 전달하고 객체 T 자체를 반환한다.
 */
fun main(){
    data class Person(var name:String, var skills:String)
    var person=Person("Kildong", "Kotlin")
    val a = person.let{
        it.skills="Android"
        "success"//마지막 문장을 결과로 반
    }
    println(person)
    println("a: $a")
    val b=person.also{
        it.skills="JAVA"
        "success"//마지막 문장은 사용되지 않음
    }
    println(person)
    println("b: $b")
}
/**
 * let()함수와 also()함수를 비교해 보면 let()함수는 person객체에서 skills를 변경하고 마지막
 * 표현식인 "success"를 반환해 a에 할당한다. 반면에 also()는 람다식이 본문을 처리하지만 마지막
 * 표현식이 b에 할당되는 것이 아닌 person객체 자신에 할당된다. 따라서 b는 Person의 객체
 * person을 반환하고 새로운 객체 b가 할당되어 만들어진다.
 */