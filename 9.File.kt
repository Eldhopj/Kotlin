import java.io.FileWriter

fun main(args:Array<String>) {
    println("Enter details to write: ")
    var file:String = readLine()!!
    fileWrite(file)
}

fun fileWrite(write:String)
{
    try {
        var fw=FileWriter("test.txt",true) //creates file, "true" denotes appends file, else the new value will overwrite
        fw.write(write+"\n")        //writes into files, "\n" appends with it so every new entries will will write in new line
        fw.close()                      //close the file

    }catch (ex:Exception){
        println(ex.message)
    }
}