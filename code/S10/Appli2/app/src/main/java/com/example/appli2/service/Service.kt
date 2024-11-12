package com.example.appli2.service

import com.example.appli2.model.Epreuve
import com.example.appli2.model.Etudiant

interface Service {

     fun creerEtudiant(etudiant: Etudiant)

     fun creerEpreuve(epreuve: Epreuve)

     fun ajouterNote(etudiant: Etudiant,epreuve: Epreuve,note:Int)

     fun afficherDetail(etudiant: Etudiant)

     var listeEtudiant:List<Etudiant>

     var listeEpreuve:List<Epreuve>
}