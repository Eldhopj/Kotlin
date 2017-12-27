fun main (args:Array<String>){
    println("Enter a two numbers for division")
    var a= readLine()!!.toInt()
    var b= readLine()!!.toInt()

    try {                   //The code which have chane to have exception is written in try block
        var div=a/b
        println("Result: $div")
    }
    catch (ex:ArithmeticException){ //if exception caught the catch block will handles the exception
        println(ex.message)
    }
}