package Classes

class Plecostomus(fishColor: FishColor = GoldColor, actionFish: FishAction = NadarAction) :
    FishColor by fishColor,
    FishAction by actionFish{

}

interface FishAction {
    fun eat()
}
interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "Gold"
}
object NadarAction : FishAction {
    override fun eat() {
        println("Nadar")
    }
}
