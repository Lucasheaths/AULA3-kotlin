
fun main(){

    for (i in 1 .. 10){
        if (i == 5)
            continue
        else if(i == 7)
            break
        println("Atual $i")
    }

}