package Classes

import Interfaces.BasicSteels
open class TaskManager(title: String, description: String, duaDate: Triple<Int, Int, Int>,status: Boolean) : Task(title, description, duaDate, status),BasicSteels {
    var taskList: MutableList<Task?> = mutableListOf()
    // Para evitar a criação de um construtur secundário utiliza-se o "init"
    // portanto, é executado antes de todo o codigo
    init {
        println("Usuário criado !!!")
    }
    override fun adicionarTarefa() {
        print("Título: ")
        val title = readln()
        print("Descrição: ")
        val description = readln()
        print("Data de vencimento(DIA/MES/ANO): ")
        val dueDate: Triple<Int, Int, Int> = Triple(
            readLine()?.padStart(2, '0')?.toIntOrNull() ?: 0,
            readLine()?.padStart(2, '0')?.toIntOrNull() ?: 0,
            readLine()?.padStart(4, '0')?.toIntOrNull() ?: 0
        )
        println("Status: ")
        val status = readln().toBoolean()
        taskList.add(Task(title,description,dueDate,status))
        println()
        print("Tempo de conclução: ")
        tempoDeVencimento(title)
        println()
    }

    override fun concluirTarefa() {
        TODO("Not yet implemented")
    }

    override fun mostrarTarefas() {
        taskList.forEach { println(it!!.title) }
    }

    override fun editarTarefa() {
        TODO("Not yet implemented")
    }


    //Utilizando filtro de Kotlin
    override fun filterTask(option: Int) {
        if(option == 1) {
            // Filtro ansioso
            for (objeto in taskList.filter { it!!.status }) {
                print("${objeto!!.title} - ")
            }
            println()
        }
        else {
            //Filtro preguiçoso "asSequence()"
            for (objeto in taskList.asSequence().filter { !it!!.status }){
                println("${objeto!!.title} - ")
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
        for (objeto in taskList){
            if (objeto!!.title == titulo){
                var dataInicio: Triple<Int,Int,Int> = Triple(objeto.dataInicio.dayOfMonth,objeto.dataInicio.monthValue,objeto.dataInicio.year)
                var (diaI,mesI,anoI) = dataInicio
                var (diaF,mesF,anoF) = objeto.duaDate
                var diasParaVencimento: Triple<Int,Int,Int> = Triple(diaI - diaF,mesI - mesF, anoI- anoF)
                println("${kotlin.math.abs(diasParaVencimento.first)} dia(s),${kotlin.math.abs(diasParaVencimento.second)} messes, e ${kotlin.math.abs(diasParaVencimento.third)} ano(s)")
                return diasParaVencimento
            }
        }
        return Triple(0,0,0)
    }

}