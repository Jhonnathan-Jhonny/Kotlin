package Classes.Herança
import Classes.TaskManager

class TaskSchool(var nota: Double, title: String, description: String, duaDate: Triple<Int, Int, Int>, status: Boolean,) : TaskManager(title, description, duaDate, status){
    override fun adicionarTarefa() {
        println("Nota: ")
        val nota = readln().toDouble()
        taskList.add(TaskSchool(nota,title,description,duaDate,status))
        super.adicionarTarefa()
    }
}