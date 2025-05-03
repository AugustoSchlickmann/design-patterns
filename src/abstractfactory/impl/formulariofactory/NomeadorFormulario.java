package abstractfactory.impl.formulariofactory;

import abstractfactory.entidades.Formulario;
import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorFormulario implements NomeadorAnexo<Formulario> {

    @Override
    public void nomear(Formulario formulario) {
        System.out.println("Nomeando formulário...");
    }
    
}
