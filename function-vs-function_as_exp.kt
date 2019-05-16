 //Funtion in Kotlin
/*
 fun main()
{
    println("Enter the two numbers ")
     var x = Integer.valueOf(readLine())
    var y = Integer.valueOf(readLine())
    println("The greater is ${max(x,y)}")


}
fun max (a: Int, b : Int):Int
   {
        if (a>b)
        {
            println("Finding greater ...")
            return a

        }
        else
        {
            println("Finding greater ...")
            return b

        }
    }

*/

//We can also write the above Function as Expression :--
//This helps in code optimization



// /*

fun main()

{
    println("Enter the two numbers ")
    var x = Integer.valueOf(readLine())
    var y = Integer.valueOf(readLine())

    println(" The greater number is ${max(x,y)}")
}
//the entire function is written as an expression

fun max (a: Int, b : Int):Int =            // NOTE : here we have used the equal to sign
        if (a>b)
        {
            println("finding greater...")
            a                              // a will be returned
        }
        else {
            println("finding greater...")
            b                              // b will be returned 
        }
// always the last element of the block is returned and as in above example its a  &  b . 
// */
