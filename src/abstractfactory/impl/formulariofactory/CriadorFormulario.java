package abstractfactory.impl.formulariofactory;

import abstractfactory.entidades.Formulario;
import abstractfactory.interfaces.CriadorAnexo;

public class CriadorFormulario implements CriadorAnexo<Formulario> {

    @Override
    public void criar(Formulario formulario) {
        System.out.println("Criando formulário...");
    }
    

    
}
