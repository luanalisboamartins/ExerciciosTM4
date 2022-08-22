import Exerc1Cliente.Cliente
import Exerc1Cliente.carCredito
import Exerc1Cliente.limiteCar

fun main() {

   val luana = Cliente(
       "Luana",
   "Rua Blabla",
       "119999-9999",
       "xxx.xxx.xxx-49",
       "Feminino"
   )


    println("Informações do cliente para vincular compra ao CPF ")
    println("Nome: Luana")
    println("Endereço: Rua Blabla ")
    println("Telefone: 119999-9999")
    println("Cpf: xxx.xxx.xxx-49")
    println("Sexo: Feminino ")

    println("Confirma os dados Sim ou Não?")
    var opc = readln()
    if (opc == "sim") {
        println("Compra vinculada com sucesso!")
    } else {
        println("Compra não pode ser vinculada a este CPF")

    }
    carCredito()
    limiteCar(1000.00)

}

