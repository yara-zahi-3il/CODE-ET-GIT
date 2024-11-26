public class GestionnaireNotes {


/** Afficher les notes et la moyenne en meme temps
 * 
 * @param nomEtudiant qui est le nom de l'etudiant
 * @param notes cest un tableau des notes des etudiants
 */
    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
       
       //Affichage de la note
       afficherNotes(nomEtudiant,notes);

       //Affichage de la moyenne
       double Myn = calculMoyenne(notes);
       System.out.printf("Moyenne de "+nomEtudiant+"est : "+notes);

    }
/**Affcihe les notes des etudiants
 * 
 * @param nomEtudiant qui est le nom de l'etudiant
 * @param notes cest un tableau des notes des etudiants
 */
    //Affiche les notes
    public void afficherNotes(String nomEtudiants , int[] notes){
        System.out.println("Ntes de "+nomEtudiant+ ":");
        for(int note : notes){
            System.out.println("* "+note);
        }
    }


/**Calcule la moyenne des etudiants
 * 
 * @param notes cest un tableau des notes des etudiants
 * @return la moyenne des notes
 */
    //Calcule la moyenne mais retourne la moyenne aussi 
    public void calculMoyenne(int[] notes){
        int somme = 0;
        for(int note : notes){
            somme += note ;
        }
        return (double) somme /notes.length ;
    }
}
