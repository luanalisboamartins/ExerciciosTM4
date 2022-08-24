class Preguica(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        println("Som de preguiça ")


    }

    override fun exibirDados() {
        println("Nome $nome Idade $idade")
    }

    fun subindoEmArvore(){
        println("Subindo em Árvore")
    }
}