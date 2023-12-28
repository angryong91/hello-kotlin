interface Shape2 {
    fun calculateArea(): Double   // 추상 메서드
    val color: String             // 추상 프로퍼티
    fun displayShapeInfo() {      // 일반 메서드 (기본적으로 open)
        println("This is a shape.")
    }
}

class Circle2(override val color: String, val radius: Double): Shape2 {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    val circle = Circle2("Red", 5.0)
    println("Color: ${circle.color}")
    println("Area: ${circle.calculateArea()}")
    circle.displayShapeInfo()
}
