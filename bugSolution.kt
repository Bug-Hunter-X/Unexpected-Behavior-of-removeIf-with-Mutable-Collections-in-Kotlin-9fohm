```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.toMutableList() // Create a copy
    newList.removeIf { it % 2 == 0 }
    println(newList) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.toMutableMap() // Create a copy
    newMap.entries.removeIf { it.value % 2 == 0 }
    println(newMap) // Output: {a=1, c=3}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.toMutableSet() // Create a copy
    newSet.removeIf { it % 2 == 0 }
    println(newSet) // Output: [1, 3, 5]
}
```