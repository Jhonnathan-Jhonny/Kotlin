package Interfaces

import Classes.Task

interface BasicSteels {
    fun adicionarTarefa()
    fun concluirTarefa()
    fun editarTarefa()
    fun exluirTarefa()
    //Utilizando apenas filtros dentro da função
    fun filterTask(option: Int)
    fun tasksWithLetters(filtro: (String) -> List<Task?>)
}