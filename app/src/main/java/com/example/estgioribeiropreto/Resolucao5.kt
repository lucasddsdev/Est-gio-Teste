package com.example.estgioribeiropreto

/*5) Escreva um programa que inverta os caracteres de uma string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite utilizar funções prontas, como, por exemplo, reverter; NÃO SE ESQUEÇA DE INSERIR O LINK DO SEU REPOSITÓRIO NO GITHUB COM O CÓDIGO FONTE QUE VOCÊ DESENVOLVEU .*/


fun main() {
    val name = "Lavinia"
    val rString = reverseString(name)
    println("String: $name")
    println("String reversed: $rString")

}


fun reverseString(name: String): String {
    val charArray = name.toCharArray()
    var left = 0
    var right = charArray.size - 1

    while (left < right) {
        val temp = charArray[left]
        charArray[left] = charArray[right]
        charArray[right] = temp
        left++
        right--
    }

    return String(charArray)


}







