package Classes.Object

import Classes.Enum.StatusTask
import Classes.Task
import Classes.deDados.DadosTask

class TaskObject {
    var taskList: MutableList<Task?> = mutableListOf()

    fun adicionarTarefa() {
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
        val status = StatusTask.PENDENTE
        taskList.add(Task(title,description,dueDate,status))
        println()
        print("Tempo de conclução: ")
        tempoDeVencimento(title)
        println()
    }



    fun mostrarTarefas() {
        for (i in taskList){
            println(DadosTask(i!!.title,i.description,i.duaDate,i.status))
        }
    }

    fun informarLista():MutableList<Task?>{
        return taskList
    }

    fun tempoDeVencimento(titulo: String): Triple<Int, Int, Int> {
        for (objeto in taskList) {
            if (objeto!!.title == titulo) {
                var dataInicio: Triple<Int, Int, Int> =
                    Triple(objeto.dataInicio.dayOfMonth, objeto.dataInicio.monthValue, objeto.dataInicio.year)
                var (diaI, mesI, anoI) = dataInicio
                var (diaF, mesF, anoF) = objeto.duaDate
                var diasParaVencimento: Triple<Int, Int, Int> = Triple(diaI - diaF, mesI - mesF, anoI - anoF)
                println(
                    "${kotlin.math.abs(diasParaVencimento.first)} dia(s),${kotlin.math.abs(diasParaVencimento.second)} messes, e ${
                        kotlin.math.abs(
                            diasParaVencimento.third
                        )
                    } ano(s)"
                )
                return diasParaVencimento
            }
        }
        return Triple(0, 0, 0)
    }
}

