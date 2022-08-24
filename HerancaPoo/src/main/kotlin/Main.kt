fun main() {

    val cachorro = Cachorro(
        "jemeremias",
        5)
    println("O som do Cachorro é:")
    cachorro.emitirSom()
    cachorro.correr()

    println()

    val cavalo = Cavalo(
        "Riquijão",
        8)
    println("O som do Cavalo é:")
    cavalo.emitirSom()
    cavalo.correr()

    println()

    val preguica = Preguica(
        "Luana",
        22)
    println("O som do Preguiça é:")
    preguica.emitirSom()
    preguica.subindoEmArvore()

}





