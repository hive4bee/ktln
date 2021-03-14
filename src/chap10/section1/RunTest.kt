package chap10.section1

/**
 * run()함수는 인자가 없는 익명 함수처럼 동작하는 형태와 객체에서 호출하는 형태 2가지로 사용할 수 있다.
 */

fun main(){
    data class Person(var name:String, var skills:String)
    var person=Person("Kildong", "Kotlin")
    val returnObj = person.apply{
        this.name="Sean"
        this.skills="JAVA"
        "success"//사용되지 않음
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2=person.run{
        this.name="Dooly"
        this.skills="C#"
        "success"
    }
    println(person)
    println("returnObj2: $returnObj2")
}
