package Classes
abstract class Spice {

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
    val color: String
}

object amarelaSpiceColor : SpiceColor {
    override val color: String = "Amarelo"
}

