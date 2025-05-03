package abstractfactory;

import abstractfactory.entidades.Anexo;
import abstractfactory.interfaces.AnexoFactory;

import java.util.HashMap;
import java.util.Map;

public class FactoryRegistry {

    // Construtor privado para impedir instâncias externas
    private FactoryRegistry() {System.out.println("CRIANDO O REGISTRY SINGLETON");}

    private static final FactoryRegistry INSTANCE = new FactoryRegistry();

    private final Map<Class<? extends Anexo>, AnexoFactory<? extends Anexo>> registry = new HashMap<>();

    // Método para obter a instância única
    public static FactoryRegistry getInstance() {
        return INSTANCE;
    }

    public <T extends Anexo> void registerFactory(Class<? extends Anexo> anexo, AnexoFactory<T> factory) {
        registry.put(anexo, factory);
    }

    @SuppressWarnings("unchecked")
    public <T extends Anexo> AnexoFactory<T> getFactory(Class<T> anexoClass) {
        
        AnexoFactory<T> factory = (AnexoFactory<T>) registry.get(anexoClass);

        if (factory == null) {
            throw new IllegalArgumentException("Anexo não possui uma fábrica: " + anexoClass.getName());
        }

        return factory;
    }
}