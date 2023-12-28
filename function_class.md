### function & class & interface
- 함수
```kotlin
fun 함수명(매개변수: 타입): 반환 타입 {
    // 본문
    return 반환값
}

fun 함수명(매개변수: 타입): 반환 타입 = 반환값
```

- 클래스
```kotlin
class 클래스명 {
    // 프로퍼티와 메소드
}
```
- 생성자
```kotlin
fun main() {
    val item = Item("BOOK", 10_000)
    println("Item name: ${item.name}, price: ${item.price}")
}

class Item() {
    val name: String,
    val price: Int
}
```
- python, java에서의 생성자
```python
class MyClass:
    def __init__(self, name, age):
        self.name = name
        self.age = age

# 객체 생성 및 생성자 호출
obj = MyClass("John", 25)

```
```java
public class MyClass {
    private String name;
    private int age;

    // 생성자 정의
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 객체 생성 및 생성자 호출
    public static void main(String[] args) {
        MyClass obj = new MyClass("John", 25);
    }
}
```
- 주 생성자 & 보조 생성자
```kotlin
// 주 생성자
class MyClass(val name: String, val age: Int) {
    // 클래스 내에 다른 코드 작성 가능
}

// 보조 생성자
class AnotherClass {
    var property: String = ""

    // 보조 생성자 정의
    constructor(name: String, age: Int) {
        // 초기화 코드 작성 가능
        this.property = "$name, $age"
    }
}

// 객체 생성 및 생성자 호출
fun main() {
    val obj1 = MyClass("John", 25)
    val obj2 = AnotherClass("Jane", 30)
}

```
- enum : 상속값을 열거해둔 클래스
```kotlin
enum class Color() {
    RED,
    GREEN,
    BLUE
}
```
- 상속 & 오버라이딩 & 오버로딩
```kotlin
// 기본적으로 kotlin은 상속이 불가능하다
// 그러나 open 키워드를 사용해서 상속이 가능하도록 허용한다
// open의 반대는 final이다
// override 상속받은 클래스의 함수를 재정의
// overload 동일한 이름의 함수나 생성자를 여러개 정의하여 다른 함수 형태로 호출

// 부모 클래스
open class Animal {
    open fun makeSound() {
        println("Animal makes a sound.")
    }
}

// 자식 클래스, Animal 클래스를 상속받음
class Dog : Animal() {
    // override 키워드를 사용하여 부모 클래스의 메서드를 오버라이딩
    override fun makeSound() {
        println("Dog barks.")
    }
}

// 다른 자식 클래스, Animal 클래스를 상속받음
class Cat : Animal() {
    // override 키워드를 사용하여 부모 클래스의 메서드를 오버라이딩
    override fun makeSound() {
        println("Cat meows.")
    }
}

// 오버로딩된 함수를 가진 클래스
class MathOperations {
    // 두 개의 정수를 받아 합을 반환하는 함수
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // 두 개의 실수를 받아 합을 반환하는 함수
    fun add(a: Double, b: Double): Double {
        return a + b
    }
}
```
- 추상 클래스&메소드&프로퍼티(abstract method&property)
  - 추상 메소드는 구현이 없이 선언만 되어 있는 메서드
  - 추상 프로퍼티는 값을 가지지 않는 프로퍼티
  - 하위 클래스에서 반드시 구현 또는 값을 제공해야함
  - abstract 키워드를 사용
```kotlin
// 추상 클래스
abstract class Shape {
    // 추상 프로퍼티
    abstract val type_name: String
    // 추상 메소드
    abstract fun calculateArea(): Double
}

// 상속받은 하위 클래스에서의 구현
class Circle(type_name: String, radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
```
- interface
  - kotlin에서의 메소드와 프로퍼티는 기본적으로 abstract이다
  - 생성자를 가지지 않는다
```kotlin
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
```