fun main() {
    /* 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
        */


    var contP = 0
    var contI = 0


    for (n in 1..10) {
        print("Digite o ${n}º número: ")

        var num = readln().toInt()

        if (num % 2 == 0) {
            contP++
        } else {
            contI++

        }
    }

    print("A quantidade de números pares é: $contP")
    print("A quantidade de números pares é: $contI")


}