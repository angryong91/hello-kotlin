//// 간단한 계절 열거형
//enum class Season {
//    SPRING, SUMMER, AUTUMN, WINTER
//}
//
//// 열거형 값 사용
//fun main() {
//    val currentSeason = Season.SUMMER
//    println("현재 계절: $currentSeason")
//}
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun printRgb() {
        println("RGB value: $rgb")
    }
}

fun main() {
    // 열거형 상수 사용
    val selectedColor = Color.GREEN
    println("Selected color: $selectedColor")

    // 열거형 프로퍼티 사용
    val rgbValue = selectedColor.rgb
    println("RGB value: $rgbValue")

    // 열거형 메서드 호출
    selectedColor.printRgb()
}
