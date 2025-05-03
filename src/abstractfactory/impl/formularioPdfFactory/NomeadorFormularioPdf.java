package abstractfactory.impl.formularioPdfFactory;

import abstractfactory.entidades.FormularioPdf;
import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorFormularioPdf implements NomeadorAnexo<FormularioPdf> {

    @Override
    public void nomear(FormularioPdf formulario) {
        System.out.println("Nomeando formulário...");
    }
    
}
