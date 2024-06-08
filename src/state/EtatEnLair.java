package state;

public class EtatEnLair extends State {
    public EtatEnLair(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage, déjà en l'air. Peut-être devriez-vous essayer de sauter ?");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible d'entrer au garage, déjà en l'air. Vous voulez transformer l'avion en sous-marin ?");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, déjà en l'air. Vous êtes déjà en plein vol !");
    }

    @Override
    void executeAtterir() {
        System.out.println("Transition d'état... Atterrir. Attachez vos ceintures, nous descendons !");
        avion.state = new EtatEnPiste(avion);
    }

    @Override
    void doActivity() {
        System.out.println("Activité en l'air... Profitez de la vue !");
    }
}
