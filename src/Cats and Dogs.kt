import kotlin.random.Random
fun main() {

    abstract class Animal(name: String, age: Int) { //abstract class Animal! // attributes name and age!
        abstract fun talk() //abstract function talk!
    }

    class Dogs(val name: String, val age: Int) : Animal(name, age) { // class Dog that inherits Animal
        override fun talk() {
            println("$name: Woof")
        }
    }

    class Cats(val name: String, val age: Int) : Animal(name, age) { // class cats that inherits Animal
        override fun talk() {
            println("$name: Meow")
        }
    }
val ages = listOf(11, 7, 6, 9, 12, 6, 2, 5, 3)

    val cats = listOf<Cats>(
    Cats("Meep", Random.nextInt(10)),
    Cats("Lilii", Random.nextInt(10)),
    Cats("Patchy", Random.nextInt(10)), // five cats
    Cats("Furball", Random.nextInt(10)),
    Cats("Snowball", Random.nextInt(10)),

    )
    val dogs = listOf<Dogs>(

        Dogs("Rufus", Random.nextInt(10)),
        Dogs("Fred", Random.nextInt(10)), // five Dogs
        Dogs("Spot", Random.nextInt(10)),
        Dogs("dogName1", Random.nextInt(10)),
        Dogs("dogName2", Random.nextInt(10)),

        )
                                         //dog that barks is older than the cat that is meowing.
                                                /// Dogs 1 and 2 are 3 years  quiet
                                              // dogs 3, 4, and 5 .. cat so they bark !!
    for (c in cats){
        print("${c.name}, ${c.age} | ")
    }                                          // Cat 2 is 5 years old and meows

    println()
    for (d in dogs){
        print("${d.name}, ${d.age} | ")
    }
    println()

    for (c in cats){
        c.talk()
        for (d in dogs)
            if(d.age > c.age)
                d.talk()
    }

}













