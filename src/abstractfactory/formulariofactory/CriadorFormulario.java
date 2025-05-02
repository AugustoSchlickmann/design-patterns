package abstractfactory.formulariofactory;

import abstractfactory.interfaces.CriadorAnexo;

public class CriadorFormulario implements CriadorAnexo {

    @Override
    public void criar() {
        System.out.println("Criando formulário...");
    }
    

    
}
