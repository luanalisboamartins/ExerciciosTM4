fun main() {
    /* 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
         obtemos resto = 5. (FOR)
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