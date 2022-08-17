fun main(){

    /*
    Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
     idade for =-99. (WHILE)
     */

    var cont21 = 0
    var cont50 = 0
    var idade = 0


    while (idade<=98){
        print("Informe sua Idade: ")
        var idade = readln().toInt()


        if (idade<21){ cont21=cont21+1 }
        if (idade>50){ cont50=cont50+1}
        if (idade == -99 ){ break
        }

    }
    println("Idade maior que 21 $cont21")
    println("Idade maior que 50 $cont50")

}






