fun main() {

    val cachorro = Cachorro("jemeremias",5)
    println("O som do Cachorro é:")
    cachorro.emitirSom()
    println("O Nome e a idade do cachorro é:")
    cachorro.exibirDados()
    cachorro.correr()

    println()

    val cavalo = Cavalo("Riquijão", 8)
    println("O som do Cavalo é:")
    cavalo.emitirSom()
    println("O Nome e a idade do cavalo é:")
    cavalo.exibirDados()
    cavalo.correr()

    println()

    val preguica = Preguica("Luana", 22)
    preguica.emitirSom()
    println("O som do Preguiça é:")
    preguica.emitirSom()
    println("O Nome e a idade da preguiça é:")
    preguica.exibirDados()
    preguica.subindoEmArvore()

}





