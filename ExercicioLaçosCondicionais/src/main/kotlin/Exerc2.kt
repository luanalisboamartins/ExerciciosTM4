fun main(){

    print("Digite sua idade para saber em qual categoria se encaixa: ")
    val idade = readln().toInt()

    if(idade in 10..14) {
        println("Você se enquadra na categoria infantil")

    }else if (idade in 15..17) {
        println("Você se enquadra na categoria Juvenil")

    }else if (idade in 18..25) {
        println("Você se enquadra na categoria Adulto")

    }else{
        println("Você se enquadra na categoria Adulto")

    }
}