fun main(){
    //nome sem retorno
    //+-*/
    //raiz e quadrado

    print("Digite seu nome: ")
    val nome = readln()

    println("=========================================================")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    println("5 - Raiz")
    println("6 - Quadrado")
    print("$nome, Digite uma das opções acima para calcular dois números: ")
    var opc = readln().toInt()

    if (opc == 1){
        print("$nome, Digite o primeiro número: ")
        var num1 = readln().toInt()

        println()

        print("$nome, Digite o segundo número: ")
        var num2 = readln().toInt()

        println(soma(num1, num2))
    }else if (opc == 2){

        print("$nome, Digite o primeiro número: ")
        var num1 = readln().toInt()

        println()

        print("$nome, Digite o segundo número: ")
        var num2 = readln().toInt()

        println(subtracao(num1, num2))
    }else if (opc == 3){

        print("$nome, Digite o primeiro número: ")
        var num1 = readln().toInt()

        println()

        print("$nome, Digite o segundo número: ")
        var num2 = readln().toInt()

        println(mult(num1, num2))
    }else if (opc == 4){

        print("$nome, Digite o primeiro número: ")
        var num1 = readln().toInt()

        println()

        print("$nome, Digite o segundo número: ")
        var num2 = readln().toInt()

        println(div(num1, num2))
    }else if (opc == 5){

        print("$nome, Digite o primeiro número: ")
        var num1 = readln().toInt()

        println()
        println(raiz(num1.toDouble()))

    }else if (opc == 6){

        print("$nome, Digite o primeiro número: ")
        var num1 = readln().toInt()

        println()
        println(quadrado(num1.toDouble()))

    }

}


