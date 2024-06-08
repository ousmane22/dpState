package state;

// Délégation : on délègue les opérations à la classe State
public abstract class State {
    protected  AvionImpl avion;
    public State(AvionImpl avion){
        this.avion =  avion;
    }
    abstract void executeSortirDuGarage();
    abstract void executeEntrerAuGarage();
    abstract void executeDecoller();
    abstract void executeAtterir();
    abstract void doActivity();
}