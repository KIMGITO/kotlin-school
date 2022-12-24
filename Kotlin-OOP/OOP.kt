/*
*OOP is faster and easier to execute
*OOP provides a clear structure for the programs
*OOP helps to keep the Kotlin code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
*OOP makes it possible to create full reusable applications with less code and shorter development time
    * Classes are temprates for objects and objects are Instances of a class
    * classes are constructors or blue prints of objects
    * class names must start with a captial letter
*/

class Animal{
    var name  = ""
    var cardNo = ""
    var age= 0
}

//constructors in kotlin hep create classes in a faster way
class School(var name:String,var age:Short,var students:Short,var teachers:Short, fun teach())

fun main(){
    var dog = Animal()

    dog.name = "bella"
    dog.cardNo = "BL0034"
    dog.age = 4

    // println("name : "+ dog.name )
    // println("cardNo : "+dog.cardNo)
    // println("age : "+dog.age)

    var mySchool = School("Karatina University",10,8000,300)

    println("my school name is ${mySchool.name}, it was started in the year ${2023 - mySchool.age}, it has ${mySchool.students} students and ${mySchool.teachers} lecturers")
}






