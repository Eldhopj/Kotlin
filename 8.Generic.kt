class Id2 <T,E>{                //T,E are Templates
    fun print(id:T,id2:E){
        println("The ID is: $id$id2")
    }
}

fun <F,M> display(a:F,b:M)      // templates in function
{
    println("The ID is: $a$b")
}

fun main(args:Array<String>)
{
    var id= Id2 <String,Int>() //defines the type of templates
    println(id.print("Eld",25))

    display("Mar",41)    // No need to define the template types, it will be based on what data entered
}