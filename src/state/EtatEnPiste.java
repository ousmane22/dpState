package state;

public class EtatEnPiste extends State {

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage, déjà en piste. Vous avez pris un raccourci ?");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Transition d'état... Entrer au garage. Il est temps de faire une pause !");
        avion.state = new EtatAuGarage(avion);
    }

    @Override
    void executeDecoller() {
        System.out.println("Transition d'état... Décoller. Attachez vos ceintures, préparez-vous pour le décollage !");
        avion.state = new EtatEnLair(avion);
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible, déjà en piste. Vous ne pouvez pas atterrir si vous n'êtes pas en l'air !");
    }

    @Override
    void doActivity() {
        System.out.println("Activité en piste... Préparez-vous pour le décollage !");
    }
}
