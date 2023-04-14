fun main(args: Array<String>) {
    var names = arrayListOf("Phoebe", "Joseph", "Antony")
    println(names[1])
    // You can print asing a for in loop
    for (i in 0  until (names.size - 1)){
        println(names[i])

    }
    // You can use a foreach loop as well
    names.forEach{
        println(it)
    }
}


