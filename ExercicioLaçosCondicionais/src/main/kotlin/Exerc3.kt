fun main() {

    print("Digite o primeiro número: ")
    val a = readln().toInt()

    print("Digite o segundo número: ")
    val b = readln().toInt()

    print("Digite o terceiro número: ")
    val c = readln().toInt()

    if (a < b && a < c) {
        if (b < c)
            print("A ordem Crescente dos número é: $a $b e $c")
        else
            print("A ordem Crescente dos número é: $a $c e $b")
    }
    if (b < a && a < c){
        if (a < c)
            print("A ordem Crescente dos número é: $b $a e $c")
        else
            print("A ordem Crescente dos número é: $b $a e $c")
    }
    if (c < a && c < b){
        if (c < a)
            print("A ordem Crescente dos número é: $c $b e $a")
        else
            print("A ordem Crescente dos número é: $c $a e $b")
    }







}


