class Cavalo(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        println("iiirrrrí, rilinchin")

    }

    override fun exibirDados() {
        println("Nome $nome Idade $idade")
    }

    override fun correr(){
        println("Correndo")
    }
}