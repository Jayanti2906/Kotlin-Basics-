// Inheritence in Kotlin


// Not to forget the "open" key word to be used with the super class
// NOTE: For the abstract classes , we do not need to use the "open" keyword 

open class SuperClass     // As the name suggests, it's a super class
{
    var variable1: String= "I am super "
}
open class SubClass : SuperClass()   // As the name suggests, it's a subclass which inherits the super class
{
    var variable2: String=" I am a sub class"
}
open class SubclassSecond(var variable3: String = " I am the second subclass"): SubClass()
{
    //empty body
}
class Subclassthree: SubclassSecond()
{
  var variable4: String ="Hey I inherited the SubclassSecond "
}

fun main()
{
    var l1= SubClass()     // here the l1 is the object of the subclass
    println(l1.variable1)   // we accessed the super class member with the sub class
    println(l1.variable2)   // ofcourse we can access the subclass member with it's object l1 as well
    println("------------------------------------------------------------------")
    // multiple inheritence ....

    var l2= SubclassSecond()  // object of SubclassSecond
    println(l2.variable1)   // variable1  is  a member of super class which was inherited by SubClass and SubClass is inherited by Subclasstwo
                            // l2 is the object of Subclasstwo which which we are accessing the member of SuperClass
    println(l2.variable2)
    println(l2.variable3)

    println("------------------------------------------------------------------")

    var l3 = Subclassthree()
    println(l3.variable3)



}
