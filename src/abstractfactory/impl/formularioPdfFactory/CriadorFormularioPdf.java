package abstractfactory.impl.formularioPdfFactory;

import abstractfactory.entidades.FormularioPdf;
import abstractfactory.interfaces.CriadorAnexo;

public class CriadorFormularioPdf implements CriadorAnexo<FormularioPdf> {

    @Override
    public void criar(FormularioPdf formulario) {
        System.out.println("Criando formulário PDF...");
    }
    

    
}
