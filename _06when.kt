

fun main(){

    print("Digite a nota da aluno: ")
    val nota = readLine()?.toInt()

    when(nota){
        10,9,8 -> println("Parabéns você é um aluno exemplar")
        7,6 -> println("Você não fez mais que a obrigação")
        5,4,3 -> println("Ficou de exame cinderelo")
        2,1,0 -> println("REPROVADO!")
        else -> println("Nota fora dos parametros!")
    }

}