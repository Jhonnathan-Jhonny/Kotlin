package SAM

fun main(args: Array<String>){
    // ambos fazem a mesma coisa
    runExample()
    exampleRun()
}

object JavaRun {
    fun runNow(runnable: Runnable) {
        runnable.run()
    }
}

// código mais complexo e menos enxuto
fun runExample() {
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }
    JavaRun.runNow(runnable)
}

// Código resumido
fun exampleRun(){
    JavaRun.runNow{
        println("Last parameter is a lambda as a Runnable")
    }
}