
fun main(){

    val ano = 2022

    print("Você já fez aniversário esse ano? (s/n)")
    val resp = readln()

    var nasc: Int

    print ("Digite sua idade: ")
    val idade = readln().toInt()

    if(resp == "s") {
        nasc = ano - idade
    }else{
        nasc = ano - (idade+1)
    }

    println("O seu ano de nascimento é: $nasc")


}