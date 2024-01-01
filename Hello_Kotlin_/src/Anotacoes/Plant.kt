package Anotacoes

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

annotation class ImAPlant
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImAPlant class Plant {
    @get: OnGet
    var crescendo  = true
    @set: OnSet
    var comer = false

    fun aparar(){}
    fun fertilizar(){}
}

// ::class -> Serve para obter todas as informações de uma classe em tempo de execução
fun testeAnotacao() {
    val obj1 = Plant::class
    for (i in obj1.declaredMemberFunctions) {
        println(i.name)
    }

    println()
    for (i in obj1.annotations) {
        println(i.annotationClass.simpleName)
    }
    println()
    val myAnnotationObject = obj1.findAnnotation<ImAPlant>()
    println(myAnnotationObject)
}

fun main(args: Array<String>){
    testeAnotacao()
}