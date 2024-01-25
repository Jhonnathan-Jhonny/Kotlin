package Interface_Abastrata

import Classes.Task

interface BasicSteels {
    fun adicionarTarefa()
    fun mostrarTarefas()
    fun editarTarefa()
    //Utilizando apenas filtros dentro da função
    fun filterTask(option: Int)
    fun  tasksWithLetters(filtro: (String) -> List<Task?>)
    fun tempoDeVencimento(titulo: String): Triple<Int,Int,Int>
}