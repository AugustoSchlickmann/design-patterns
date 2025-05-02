package abstractfactory.formulariofactory;

import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorFormulario implements NomeadorAnexo {

    @Override
    public void nomear() {
        System.out.println("Nomeando formulário...");
    }
    
}
