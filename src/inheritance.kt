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

fun main() {
    val dog = Dog()
    val cat = Cat()
    dog.makeSound()
    cat.makeSound()
}