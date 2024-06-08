package state;

public class EtatAuGarage extends State {
    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Transition d'état... Sortir du garage. Préparez-vous pour l'aventure !");
        avion.state = new EtatEnPiste(avion);
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible, déjà au garage. Peut-être que vous avez trop bu de café ?");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller depuis le garage. C'est un avion, pas une fusée !");
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible d'atterrir, déjà au garage. Essayez un autre hangar !");
    }

    @Override
    void doActivity() {
        System.out.println("Activité au garage... On peut se reposer un peu, non ?");
    }
}
