//INFIX FUNCTION
/* Writing an infix function is a simple case of following three rules:

The function is either defined on a class or is an extension method for a class
The function takes exactly one parameter
The function is defined using the infix keyword */

class Structure() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}

fun main()
{
    val p = Structure()
   p createPyramid 9
    // p.createPyramid(4)
}
