package state;

public class AvionImpl implements Avion {
    protected State state;
    // État initial de l'objet
    public AvionImpl(){
        state =  new EtatEnPiste(this);
    }
    @Override
    public void SortirDuGarage() {
        state.executeSortirDuGarage();
    }

    @Override
    public void EntrerAuGarage() {
        state.executeEntrerAuGarage();
    }

    @Override
    public void decoller() {
        state.executeDecoller();
    }

    @Override
    public void atterir() {
        state.executeAtterir();
    }

    @Override
    public void doActivity() {
        state.doActivity();
    }
}
