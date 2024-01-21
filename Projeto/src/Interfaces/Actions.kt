package Interfaces

import Classes.Task

interface BasicSteels {
    fun adicionarTarefa()
    fun visualizarTarefaNaoConcluida()
    fun visualizarTarefaConcluida()
    fun concluirTarefa()
    fun editarTarefa()
    fun exluirTarefa()
    fun filterTask(option: Int)
}