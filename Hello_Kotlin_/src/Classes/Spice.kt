package Classes
sealed class Spice {

}
class Curry(cor: SpiceColor = amarelaSpiceColor): SpiceColor by cor {

}

interface Picancia {
    fun picancia()
}

interface Moedor{
    fun moer()
}

interface SpiceColor{
    val color: Cor
}

enum class Cor (var cor: Int) {
    YELLOW(0xFFFF00);
}

object amarelaSpiceColor : SpiceColor {
    override val color: Cor = Cor.YELLOW
}

