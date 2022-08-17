fun main(){

    /*
    5- Crie um programa que leia um número do teclado até que encontre um
   número igual a zero. No final, mostre a soma dos números
   digitados.(DO...WHILE)
     */

    var soma = 0


    do {
        print("Digite um número: ")
        var num = readln().toInt()
        soma+=num

    } while ( num !=0 )

    print("Soma $soma")



}
