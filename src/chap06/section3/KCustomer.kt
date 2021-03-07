package chap06.section3

class KCustomer {
    companion object{
        const val LEVEL = "INTERMEDIATE"//const는 컴파일 시간의 상수이다.
        @JvmStatic fun login()=println("login....")//애노테이션 표기 사용
        @JvmField val JOB=KJob()//특정 자료형을 사용하기 위한 애노테이션
    }
}
class KJob{
    var title:String="Pogrammer"
}
/**
 * 컴파일 시간의 상수란 val과 다르게 컴파일 시간에 이미 값이 할당되는 것으로
 * 자바에서 접근하기 위해서 필요하다. val은 실행 시간에 할당한다.
 * const는 Int형, Double형과 같은 기본형으로 사용할 자료형과 Stirng형에만 적용가능함
 * JvmStatic애노테이션은 자바 소스에서 코드를 해석할 때 Companion을 생할 수 있게 해줌
 */