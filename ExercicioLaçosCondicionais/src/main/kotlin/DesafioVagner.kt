fun main(){

    print("Entre com sua idade em anos : ")
    val a = readln().toInt()

    print("Entre com sua idade em meses ")
    val m = readln().toInt()

    print("Entre com sua idade em dias: ")
    var Dias = readln().toInt()

    Dias = (a * 365 + m * 30 + Dias )

    print("A sua idade em dias é $Dias")





}



