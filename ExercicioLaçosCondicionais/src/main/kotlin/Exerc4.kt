import kotlin.math.sqrt

fun main(){

    /*Faça um programa em que permita a entrada de um número qualquer e exiba se este
            número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
        ímpar exiba o número elevado ao quadrado.*/


          print("Digite um número para saber se é par ou ímpar:")
          val num = readln().toDouble()

        if (num % 2.0 == 1.0) {
            println("O número é ímpar")
            println("O número elevado ao quadrado é: ${Math.pow(num.toDouble(),2.0)}")

        }else{
                println("O número é par")
                println("A raiz quadrada do número é: ${"%.2f".format(sqrt(num))}" )

        }
}