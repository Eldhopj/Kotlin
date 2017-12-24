

fun main(args:Array<String>){

    var array = IntArray(5)// declaring int array of size 5
    for (item in 0..4)     // using for loop writing into 0..4
    {
        array[item] = readLine()!!.toInt()
    }
    for (element in array) // printing using element object
    {
       println(element)
    }


    // String <special case>
     var stringArray = Array<String>(4){""} //Array<T>(size)
    for (i in 0..3)
    {
        stringArray[i]= readLine()!!
    }
    for (index in 0..3)    //printing using for loop
    {
        println(stringArray[index])
    }
}
