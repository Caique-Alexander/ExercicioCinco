fun main(args: Array<String>) {
    var media = 0
    var contador = 0
    var menor: Int = 0
    var maior: Int = 0
    var soma: Int = 0

    do{
        println("Informe um numero ")
        var numero = readLine()!!.toInt()
        if(contador==0){
            menor=numero
            maior=numero
        }

        if(menor>numero && menor != 0){
            menor=numero
        }

        if(maior<numero){
            maior=numero
        }
        println("O maior número é $maior")
        println("O menor número é $menor")
        soma += numero
        contador++

    }while (numero != 0)
    contador=contador-1
    media=soma/contador
    println("A soma dos números é igual $soma\n" +
            "A quantidade de números foi $contador\n" +
            "A média é igual a $media\n" +
            "Menor número inserido foi $menor\n" +
            "Maior número inserido foi $maior")
}
