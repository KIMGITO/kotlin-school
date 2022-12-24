 //kotlin main function.
//he fun keyword is used to declare a function. A function is a block of code designed to perform a particular task.
 //eg main() function.
 //In Kotlin, code statements do not have to end with a semicolon (;) 

 fun main() {
    //The println() function is used to output values/print text:
    println("hello Kotlin")
    println(40-14)

    //There is also a print() function, which is similar to println() 
    //but does not insert a new line at the end

    print("See this print work. do new line up to here.");
    println("See, now , i should be in a new line but...")
    print("...How did it happen??. Oooh, am in new line coz println came before me\n\n");

    //to print variables with strings  we use ($var)
    var vision = 2030
    println("Kenya's long term goles are set to vision $vision")

                                    /*VARIABLES */
                                // ================
//can use var or val

    var name = "dennis"
    val age  = 22
    val height = 163.2

    print(name)
    println(age)

 /*You can also declare a variable without assigning the value, 
and assign the value later. 
However, this is only possible when you specify the type:*/
//eg
        var fName : String
        fName = "dennis kimanthi"
        print(fName);

 /*  BUT this will generate an ERROR
    var fName
    fName = "dennis kimanthi"
    print(fName) */


                                               /*Kotlin data types */
                                           //=========================
    /*
data types are written with first character as a upper case

val myNum = 5             // Int
val myDoubleNum = 5.99    // Double
val myLetter = 'D'        // Char
val myBoolean = true      // Boolean
val myText = "Hello"      // String

    You don't need to give variable a datatype. Kotlin has mechanizims but if you
    want, 
    var variable :Datatype
    */
    val grade :Char
        grade = 'A'
    println(grade)


    /*
        Byte data type can store whole numbers from -128 to 127 and can be used insted of Int
    */
    var max: Byte = 110
    println(max)

    /*
    This datatypes can store number in between:-
        Int   = -2147483648 to 2147483647:
        Long  = -9223372036854775807 to 9223372036854775807:
        Short = -32768 to 32767:
    */

                /*Kotlin Operators */

/*
    operators are classified in to
        Arithmetic operators
        Assignment operators
        Comparison operators
        Logical operators
*/

//Arithmetic
// +,-,/,8,%,++,--

var boo = 9
    println(boo%4)
    println(++boo)
    println(--boo)


//Assignment 
// ==,+=,-==,*==,%==,/==
    var new: Int = 30;

//Comparison
// >,<,>=,<=,==

//Logical
// &&,||,!
 
                                               /*Strings */
                                             //===========
//array of chars

var homeTown = "Nairobi"
println(homeTown);

//can be accessed as array

println(homeTown[0])//prints the value in the first index
        //String functions

        println("your home town contains only "+ homeTown.length+" characters") // .length 
        println(homeTown.toUpperCase())//.toUpperCase 
        println(homeTown.toLowerCase())//.toLowerCase
    //compare strings
        var str1 = "dennis"
        var str2 = "Adnnis"
        var str3 = "Dennis"
        println(str1.compareTo(str2)) //returns 0 if they are equal
        println(str3.compareTo(str2)) 
                                        /*returns !=0 if they are notequal, that is,
                                        the differe of the ASCII value of the first 
                                        different Char spotted in the string*/
                                        
    //locate a string in a string (indexof)
        var strX = "In this string, we have a word which must be contained"
        println("your word is contained in index "+ strX.indexOf("string"))

    //string Concatenation
    //a + operator is used to add two srings 

    var myFname = "Dennis"
    var mySname = "Kimanthi"
    println("MY name combined is "+myFname+mySname)

    //A plus can alson be used too...

    println("Using plus func. "+myFname.plus(mySname))
    

                                         /*      CONTROL STRUCTURES,RAGE AND LOOPS */
                                         // =============================================

        // if condition in kotlin can be used to assign a value to a variable
        var time = 15;
        var ifStr : String
        ifStr = if(time < 12) "Good morning" else if(time < 14) "Good afternoon" else "Good night"
        (ifStr)

        //when replaces switch statement in kotlin. It must include  a else at the end.
        var day = 5

        var dayName = when(day){
            1 ->"Mon"
            2 ->"Tue"
            3 ->"Wed"
            4 ->"Thur"
            5 ->"Fri"
            6 ->"Sat"
            7 ->"Sun"

            else -> "Invalid day"
        }
        println(dayName)



                                                          /*LOOPS */
                                                      // ===========
    var i:Int = 5
    var j = 5


    println("difference between do while and while loop can be seen in this example.\n variables i and j both have ")
    print("values of five \n var i = 5 \n var j = 5.\n we used the same condition of i or j < 5 to print Kotlin.\n")
     print("Kotlin is printed once by do..while and Zero by while loop\n\n")
    while(i<5){
        print("Kotlin ")
        
    }

    do{
        print("Kotlin ")
    }while(j<5)
    println()


                    /* BREAK AND CONTINUE */
    // break i used to jump out of a loop.
    //continue breaks one itration when a condition is occures
        i = 0
    while(i<10){
        if(i == 8){
            i++
            continue//break
        }
        println(i)
        i++
        
       
    }

                                                      /*KOTLIN ARRAY */
                                                     //=================
    //arrayOf()

    //access
    var ages = arrayOf(10,15,17,20,26,35,12,19)
    println("INdex 5 contains :"+ages[5]+" years")

    //change
    ages[5] = 24
    println("New value of Index 5 is: "+ages[5]+" Years")
    
    //size of array
    println("The size of array ages is: "+ages.size+".")

    //if value exists in array
    println(if(18 in ages)"18 exists in array ages" else "18 is not in array ages")

    //loop through array
    for(x in ages){
        print(x);print(", ")
    }
    println("")

    //for loop

 /*
    Kotlin for loop doesnt work like other languages for loops like
    C,C++,PHP,Java so on...
    * in Kotlin, they are used in arrays and other counterble numbers together with in
 */

    for(k in ages){
        print(" Age: $k")
    }
    println("")
    //rage and (..) 
    // this is similar to for loops in c++,c,js etc.

    for(neg in -10 .. 10){
        print("$neg, ")
    }
    println("")

    for(chars in 'A' .. 'Z'){
        print("$chars,")
    }
    println("")
    

  
}
