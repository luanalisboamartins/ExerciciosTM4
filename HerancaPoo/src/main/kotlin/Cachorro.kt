class Cachorro(nome: String, idade: Int) : Animal(nome, idade) {


    override fun emitirSom() {
        println("Auau")


    }

    override fun exibirDados() {
       println("Nome $nome Idade $idade")
    }

    override fun correr(){
        println("E ele está Correndo")

    }
}