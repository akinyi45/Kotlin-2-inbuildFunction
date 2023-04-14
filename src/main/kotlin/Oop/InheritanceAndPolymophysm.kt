fun main(args: Array<String>) {
    // InheritanceAndPolymorphism
    var std1 = Student("akinyi", "delphine@gmail.com", "delphine123")

    std1.login()
    std1.register()

    var t1 = Teacher("Irene","irene@gmail.com", "irene123" )

    t1.login()
    t1.register()
    t1. suspendStudent()

}
open class  Student(open var name:String,  open var email:String, open var password:String){
    fun register(){
        println("You registered with email $email and password $password ")
    }
    fun login(){
        println("You logged in with email $email and password $password")
    }
}



open class  Teacher(name:String,  email:String, password:String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend student")
    }

}

class Headteacher(name:String,  email:String, password:String):Teacher(name, email, password){
    fun approveFunds(){
        println("Yeah, i can approve funds")

    }
}
