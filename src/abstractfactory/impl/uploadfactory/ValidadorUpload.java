package abstractfactory.impl.uploadfactory;

import abstractfactory.entidades.Upload;
import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorUpload implements ValidadorAnexo<Upload> {

    @Override
    public void validar(Upload upload) {
        System.out.println("Validando " + upload.getNome() + "...");
    }

}
