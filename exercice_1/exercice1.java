public class FactureManager {

    /**
     * Calcule le total d'une facture en appliquant des reductions basee
     * sur le type de produit et le montant total.
     * @param typeProduit Le type du produit (Alimentaire, Electronique, Luxe)
     * @param quantite    La quantite de produits achetes
     * @param prixUnitaire Le prix unitaire du produit
     * @return Le montant total apres application des reductions
     */

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        
        // Appliquer la reduction en fonction du type de produit
        total -= total*obtenirReductionProduit(typeProduit);

        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }


    /**
     * Obtient le pourcentage de reduction en fonction du type de produit.
     *
     * @param typeProduit Le type du produit
     * @return Le pourcentage de restatuduction (par exemple 0.05 pour 5%)
     */

    public double obtenirReductionProduit(String typeProduit){
        switch(typeProduit){
            case "Alimentaire" :
                return 0.05;  // Réduction de 5%
            case "Electronique" :
                return 0.10;  // Réduction de 10%
            case "Luxe" :
                return 0.15;  // Réduction de 15%
        }
    }


}

