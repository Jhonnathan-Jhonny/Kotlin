package Interfaces

import Classes.Task

interface BasicSteels {
    fun adicionarTarefa(): Task
    fun visualizarTarefaNaoConcluida()
    fun visualizarTarefaConcluida()
    fun concluirTarefa()
    fun editarTarefa()
    fun exluirTarefa()
}