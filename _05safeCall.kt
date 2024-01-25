

fun main(){
    var num = 5

    println(podeRetornarNulo(num))

    var nulo: Int?
    nulo = podeRetornarNulo(num)

    println(nulo)
}

fun podeRetornarNulo(a: Int): Int? {
    if (a < 5) return 10 else return null
}