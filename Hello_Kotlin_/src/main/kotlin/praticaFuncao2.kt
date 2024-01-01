fun main(args: Array<String>) {
    val fortune: String = getFortuneCookie(getBirthday())
    println("\nYour fortune is: $fortune")

}

fun getFortuneCookie(birthday: Int?): String {
    val frases: Array<String> = arrayOf("Você terá um ótimo dia!","As coisas vão correr bem para você hoje.","Aproveite um dia maravilhoso de sucesso.","Seja humilde e tudo acabará bem.","Hoje é um bom dia para exercer moderação.")
    val resul: Int? = birthday?.rem(5)
    val comoString = birthday.toString()
    val firstTwoChars = comoString.substring(0, 2)
    val firstTwoNumbers = firstTwoChars.toIntOrNull()
    return when (firstTwoNumbers){
        28 -> "Bom dia"
        31 -> "Olá, você é linda(o)"
        1 -> "Resultado vazio"
        else -> frases[resul!!]
    }
}

fun getBirthday() : Int {
    print("Insira sua data de nascimento: ")
    return readlnOrNull()?.toIntOrNull()?:1
}