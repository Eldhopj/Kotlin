import java.io.FileReader

fun main(args:Array<String>) {
reader()
}
fun reader(){
    try {
        var fr = FileReader("test.txt") //open file using FileReader
        var c: Int                              //Initialize an integer var to read char by char
        do {
            c = fr.read()                       //read the file per character
            print(c.toChar())                   //convert ascii into character and print
        } while (c>0)                           //do until the final character
        fr.close()
    }
    catch (ex:Exception){
        println(ex.message)
    }

}