package com.ascending.games.engine.edit.action

interface ITimedAction {
    val canExecute : Boolean
    fun execute(delta : Float) : Boolean
}