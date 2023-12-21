package Aquarium

open class Aquarium (var width: Int = 20,var heigth: Int = 40, var length: Int = 100) {
    var volume : Int
        get() = width * heigth * length / 1000
        //No set pega um volume(value) e calcula a nova altura do tanque
        set(value) {heigth = (value*1000)/(width*length)}
    //Pegou o "value" em litros, transformou para cm^3 e atribuiu a altura

    open var water = volume * 0.9 //Quantidade de água permitida
    //Construtor secundário (Muito pouco utilizado)
    constructor(numberOfFish: Int): this(width = 11){
        //Calculos expecificos do construtor
        //Estamos estabelecendo 1cm de peixe a cada 2L de água
        val water: Int = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        heigth = (tank/(length*width)).toInt()
    }
}

//Herança
class towerTank(): Aquarium(){
    override var water = volume * 0.8
}