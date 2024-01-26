package Classes

import Classes.Enum.StatusTask
import Classes.Object.TaskObject
import Interface_Abastrata.BasicSteels


open class TaskManager(title: String, description: String, duaDate: Triple<Int, Int, Int>, status: StatusTask) :
    Task(title, description, duaDate, status),
    BasicSteels
{
    // Para evitar a criação de um construtur secundário utiliza-se o "init"
    // portanto, é executado antes de todo o codigo
    init {
        println("Usuário criado !!!")
    }

    private val obj = TaskObject()

    override fun adicionarTarefa() {
        obj.adicionarTarefa()
    }

    override fun mostrarTarefas() {
        obj.mostrarTarefas()
    }

    fun listaTarefa(): MutableList<Task?>{
        return obj.informarLista()
    }

    override fun editarTarefa() {
        TODO("Not yet implemented")
    }


    //Utilizando filtro de Kotlin
    override fun filterTask(option: Int) {
        if(option == 1) {
            // Filtro ansioso
            for (objeto in obj.taskList.filter { it!!.status == StatusTask.PENDENTE }) {
                println("${objeto!!.title} - ${objeto.status} - ${objeto.description} -${objeto.duaDate} ")
            }
            println()
        }
        else {
            //Filtro preguiçoso "asSequence()"
            for (objeto in obj.taskList.asSequence().filter { it!!.status == StatusTask.CONCLUIDA}){
                println("${objeto!!.title} - ${objeto.status} - ${objeto.description} -${objeto.duaDate} ")
            }
        }
    }

    // Filtrando as tarefas que tenham aquela letra, e passando o filtro como um lambda
    override fun tasksWithLetters(filtro: (String) -> List<Task?>) {
        var escolha= readln()
        for (objeto in filtro(escolha)){
            println("${objeto!!.title} - ")
        }
    }

    override fun tempoDeVencimento(titulo: String): Triple<Int, Int, Int> {
        return obj.tempoDeVencimento(titulo)
    }

    override fun concluir() {
        println("Qual tarefa deseja concluir?")
        mostrarTarefas()
        val tarefaNome = readln()
        for (i in obj.taskList){
            if (i!!.title == tarefaNome){
                if(i.status == StatusTask.PENDENTE){
                    i.status = StatusTask.CONCLUIDA
                    println("Tarefa marcada como concluía.")
                }
                else{
                    println("Tarefa já foi concluía.")
                }
            }
        }
        println("Tarefa não encontrada!")
    }
}