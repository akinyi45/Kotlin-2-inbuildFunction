package Oop

import java.awt.Color

fun main(args: Array<String>) {
    // These are object
    var f1 = Fruit("Mango", "yellow", "200g", 30.0)
    var f2 = Fruit("Apple", "pink", "250g", 50.0)
    println(f1.name)
    println(f2.name)

    var c1 =Car("Toyota", "KDB 987J", "2000000.00")
    var c2 =Car("Mercedes", "KCD 867K", "4000000.00")

}
    // This is a class
class Fruit(name:String, color: String, size:String, price:Double){
   // Declare the properties to be initialised
   var name:String
   var color:String
   var size:String
   var price:Double
   // Initialize the properties
   init{
       this.name = name
       this.color = color
       this.size = size
       this.price = price
   }
}
class Car(model:String, reg_no:String, price: Double){
    var model: String
    var reg_no: String
    var price: Double

    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These are class function
    fun accelerate(){
        println("Yeah, I can accelerate")
    }
    fun brake(){
        println("I am a $model and i can brake")
    }

}

