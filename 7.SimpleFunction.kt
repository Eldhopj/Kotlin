fun sum(x:Int,y:Int):Int //function with return type Int
{
    var z=x+y
    return z
}

fun sum2(x:Int=0,y:Int=6):Int // default value of 6 will pass if and only if no value is passed
{
    var z=x+y
    return z
}

fun sum3(x:Int,y:Int)//no return type
{
    println(x+y)
}
fun main(args:Array<String>){
    var a=10
    var b=20
    println(sum(a,b))
    println(sum2(b))
    sum3(a,b)
}
