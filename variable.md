### 변수
- var / val
  - var는 읽기, 쓰기 가능
  - val는 읽기만 가능
```kotlin
fun main() {
  var i: Int = 10
  val j: Int = 19

  i = 20
  j = 20    // val은 변경 불가

  println(i)
  println(j)
}
```

- Int / Int?
  - 기본적으로 kotlin의 Int는 null을 허용하지 않음
  - null을 허용 하려면 타입에 ? 붙여서 선언
```kotlin
fun main() {
  var i: Int = 10
  var j: Int? = 19
  
//  i = null  // Kotlin: Null can not be a value of a non-null type Int
  j = null

  println(i)
  println(j)
}
```

- String / String?
  - 기본적으로 kotlin의 Int는 null을 허용하지 않음
  - null을 허용 하려면 타입에 ? 붙여서 선언
```kotlin
fun main() {
  var i: String = "ABC"
  var j: String? = "ABC"
  
//  i = null  // Kotlin: Null can not be a value of a non-null type String
  j = null

  println(i)
  println(j)
}
```

- 타입 추론
  - kotlin은 타입추론으로 변수에 들어오는 값을 보고 타입을 알아서 지정해줌
```kotlin
fun main() {
    
    val s = "ABC"
    val i = 1
    val l = 1L
    val d = 1.0
    val f = 1.0f
  
    println("s = " + s::class)
    println("i = " + i::class)
    println("l = " + l::class)
    println("d = " + d::class)
    println("f = " + f::class)
    //  s = class java.lang.String (Kotlin reflection is not available)
    //  i = int (Kotlin reflection is not available)
    //  l = long (Kotlin reflection is not available)
    //  d = double (Kotlin reflection is not available)
    //  f = float (Kotlin reflection is not available)
}
```