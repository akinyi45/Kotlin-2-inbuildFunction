fun main(args: Array<String>) {
    // IF STATEMENTS
    var age = 20
    if (age < 18){
        println("You are underage")

    }else{
        println("Welcome to the party")
    }
    var  weight = 100
    var  height = 100
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <= 29){
        println("Normarl weight")
    }else if (bmi <= 34)
        println("Overweight"){
        }else{
            println("Obesed")
    }
    var english = 80
    var kiswahili = 80
    var biology = 80
    var history = 80
    var mean = (english + kiswahili + biology + history) / 4
    if ( mean <= 20){
        println("D")
    }else if (mean <= 40){
        println("C")
    }else if (mean <=60){
        println("B")
    }else{
        println("A")




    // WHEN STATEMENT
        var bettingNumber = 3
        when(bettingNumber){
            1 ->{
                println("You lost")
            }
            2 ->{
                println("You lost")
            }
            3 ->{
                println("You lost")
            }
            4 ->{
                println("You lost")
            }
            else ->{
                println("Enter a number from 1-4 to bet")

            }            }

        }
}