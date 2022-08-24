abstract class Animal(
    var nome: String,
    var idade: Int,

){
    abstract fun emitirSom()
    abstract fun exibirDados()

    open fun correr(){
        println("Correndo")

    fun subindoEmArvores(){
        println("Subindo em Árvores")

    }

    }
}