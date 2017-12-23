fun main(args:Array<String>){
    print("Enter the range")
    var x:Int= readLine()!!.toInt()
    when(x)
    {
        1-> //for the variable
            println("you chosen 1")
        2,3->                               //for group of variables
            println("In the range of 2 or 3")
        in 3..10->                          //for range of variables
            println("In the range of 3..10")
        !in 20..50 ->                       //for not in range of variables
            println("Not in range of 20..50")

    }


}