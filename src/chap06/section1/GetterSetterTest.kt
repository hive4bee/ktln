package chap06.section1

class User(_id:Int, _name:String, _age:Int) {
    val id:Int=_id
    var name:String=_name
    var age:Int=_age
}

fun main(){
    val user=User(1,"Sean", 30)
    val name=user.name//게터에 의한 값 획득정
    user.age=41//세터에 의한 값 지
    println("name: $name, ${user.age}")
}

