package chap08.section2

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Phone", 870.00),
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 3333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99)
    )
    products.sortBy{a -> a.price}
    products.forEach{a->println(a)}
    products.sortWith(compareBy({it.name}, {it.price}))

    val arr=arrayOf(1,-2,3,4,-5,0)
    arr.filter{e->e>0}.forEach{e->print("$e")}

    val fruits=arrayOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter{it.startsWith("a")}
        .sortedBy{it}
        .map{it.toUpperCase()}
        .forEach{println(it)}
}