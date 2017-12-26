class Outer{
    var name ="Eldho"

   inner class Inner { // this is a nested class, "inner" keyword give access to the data's of main class
        fun display(){
            println("name $name")
        }
    }
}

fun main(args:Array<String>){
    var out=Outer()
    /*var inn =Outer.Inner()*/        // if there is no "inner" keyword usage
    var inn=out.Inner()    // if there is "inner" keyword usage
    inn.display()
}