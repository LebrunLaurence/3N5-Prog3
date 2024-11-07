package org.example

class ValeurPasDansList: Exception() {
    override val message: String?
        get() = "La valeur choisi n'est pas dans la liste fournie"
}