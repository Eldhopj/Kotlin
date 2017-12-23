//Even numbers

fun main(args:Array<String>){
    print("enter the limit")
    var n:Int= readLine()!!.toInt()

    for (count in 2..n step 2)// for loop
        println("count $count")
}