fun main(args:Array<String>){
     label@ for (i in 1..5) {
        println("outerloop count $i")
        for(m in 0..3) {
            if (m == 1)
                continue@label // skip 1 in inner loop but using"label"its skips one of outer loop because the control goes to outer loop
            println("inner loop $m")
        }
        if (i==4) {
            break // breaks outer loop
        }
    }

}