fun main(){


    val pi = 3.14

    print("Digite o diâmentro do circulo: ")
    val diam = readln().toDouble()

    val raio = diam / 2

    val area = pi * (raio * raio)
    val perim = 2 * pi * raio

    println("A área do circulo é: $area")
    println("O perímetro do circulo é: $perim")


}