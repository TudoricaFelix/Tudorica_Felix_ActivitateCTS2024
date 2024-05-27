package Problema9.Composite;

public abstract class ANod {
    //nod frunza
    public abstract String getDenumire();

    public String getInfo(){
        return this.getDenumire();
    }

    public void adaugaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public ANod getNod (int i){
        throw new UnsupportedOperationException();
    }
}
