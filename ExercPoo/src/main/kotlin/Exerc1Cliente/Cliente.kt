package Exerc1Cliente

class Cliente(

    val nome: String,
    val endereço: String,
    val telefone: String,
    val cpf: String,
    val sexo: String,


) {
    //Construtores secundários

    var carCredito = false
    var limiteCar = 0.0

    constructor(
        nome: String,
        endereço: String,
        telefone: String,
        cpf: String,
        sexo: String,
        carCredito: Boolean,
        limiteCar: Double
    ): this (nome,endereço, telefone, cpf, sexo){
        this.carCredito = carCredito
        this.limiteCar = limiteCar

    }


}
fun carCredito() {
    println("Você tem um cartão de Crédito disponivel gostaria de ativo-lo: ")
    var opc = readln()
    if (opc == "sim") {
        println("Parabéns você adquiriu um novo cartão de crédito")
    } else {
        println("Oferta de cartão recusada com sucesso ")

    }

}
fun limiteCar(Valor: Double) {
    println("Valor disponivel de 1000,00")

}