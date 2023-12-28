//class User(
//    val name: String,
//    val age: Int
//) {
//    fun greet() {
//        println("Hello I'm $name, my age $age")
//    }
//}
//
//fun main() {
//    val user = User("Ryu", 33)
//    user.greet()
//}


// 주 생성자
class MyClass(val name: String, val age: Int) {
    // 클래스 내에 다른 코드 작성 가능
    fun greet() {
        println("Hello I'm $name, my age $age")
    }
}

// 보조 생성자
class AnotherClass {
    var name: String
    var age: Int

    // 보조 생성자 정의
    constructor(name: String, age: Int) {
        // 초기화 코드 작성 가능
        this.name = name
        this.age = age
    }

    fun greet() {
        println("Hello I'm ${this.name}name, my age ${this.age}")
    }
}

// 객체 생성 및 생성자 호출
fun main() {
    val obj1 = MyClass("John", 25)
    val obj2 = AnotherClass("Jane", 30)
    obj1.greet()
    obj2.greet()
}