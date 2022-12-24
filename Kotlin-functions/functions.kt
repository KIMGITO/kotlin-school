/*
*A function is a block of code which only runs when it is *called.
*You can pass data, known as *parameters, into a function.
*Functions are used to perform certain actions, and they are also known as methods.
*/

//below is the main function (entry to kotlin program)

fun main(){
    //a predefined function
    println("This is a inbuilt predefined function: println()")

    //o call a function in Kotlin, write the name of the function followed by two parantheses ().
    var i: Int = 10
    var l: Int = 30
    add()
    call_me("Dennis")
    call_me("Kimanthi")
    myNameAndAge("Dennis","Kimanthi",23)
    var j = squreNum(i)
    println("Squre of $i is $j")// OR use  println("Squre of $i is ${squreNum(i)}")
    //calling a shorter return func.
    println("Sum of $i and $l from a shorter return functioin is ${shortAdd(i,l)}")
}

//to create your own , kework fun is used
fun add(){
    var x = 10
    var y = 3
    println("When this function is called, it adds\n$x + $y = ${x+y}")
}

//data can be passed as parameters in functions
fun call_me(name: String){
    println("This function calls my name.\n\tHello $name,")
}

//multiple parameters can be added
fun myNameAndAge(fName: String,lName: String, age: Short){
    println("Hello $fName $lName, i know you are $age years old")
}

//function return value
fun squreNum(num :Int): Int{
    return num * num
}

//a shorter reaturn function can be

fun shortAdd(num1:Int ,num2:Int) = num1 + num2


