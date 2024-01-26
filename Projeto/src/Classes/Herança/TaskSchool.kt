package Classes.Herança
import Classes.Enum.StatusTask
import Classes.TaskManager

class TaskSchool(
    var nota: Double,
    title: String,
    description: String,
    duaDate: Triple<Int, Int, Int>,
    status: StatusTask,) :
    TaskManager(title, description, duaDate, status){
    override fun adicionarTarefa() {
        println("Nota: ")
        val nota = readln().toDouble()
        listaTarefa().add(TaskSchool(nota,title,description,duaDate,status))
        super.adicionarTarefa()
    }
}