fun main() {
    val item = Item("BOOK", 10_000)
    println("Item name: ${item.name}, price: ${item.price}")
}

class Item(
    val name: String,
    val price: Int
)