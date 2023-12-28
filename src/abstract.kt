// 추상 클래스
abstract class Shape {
    // 추상 프로퍼티
    abstract val type_name: String
    // 추상 메소드
    abstract fun calculateArea(): Double
}

// 상속받은 하위 클래스에서의 구현
class Circle(override val type_name: String, val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    val obj_c = Circle("circle", 3.0)
    println(obj_c.calculateArea())
}