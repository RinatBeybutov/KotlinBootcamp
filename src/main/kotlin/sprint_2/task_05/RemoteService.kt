package org.example.sprint_2.task_05

class RemoteService {

    fun call(param: String) :String {
        throw RuntimeException("Oops!")
    }
}