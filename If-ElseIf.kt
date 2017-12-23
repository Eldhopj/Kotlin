fun main(args:Array<String>)
{
    var mark:Int?
    print("Enter you mark")
    mark = readLine()!!.toInt()

    if (mark>=80 && mark<100)
        print("Grade A")
    else if(mark>=60 && mark<80)
        print("Grade B")
    else if(mark>=40 && mark <60)
        print("Grade C")
    else
        print("Needs improvement")
}