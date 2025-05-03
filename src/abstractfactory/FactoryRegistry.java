package abstractfactory;

import java.util.HashMap;
import java.util.Map;

import abstractfactory.entidades.Imprimivel;
import abstractfactory.interfaces.AnexoFactory;

public class FactoryRegistry {

    // Construtor privado para impedir instâncias externas
    private FactoryRegistry() {System.out.println("CRIANDO O REGISTRY SINGLETON");}

    private static final FactoryRegistry INSTANCE = new FactoryRegistry();

    private final Map<Class<? extends Imprimivel>, AnexoFactory<? extends Imprimivel>> registry = new HashMap<>();

    // Método para obter a instância única
    public static FactoryRegistry getInstance() {
        return INSTANCE;
    }

    public <T extends Imprimivel> void registerFactory(Class<? extends Imprimivel> anexo, AnexoFactory<T> factory) {
        registry.put(anexo, factory);
    }

    @SuppressWarnings("unchecked")
    public <T extends Imprimivel> AnexoFactory<T> getFactory(Class<T> anexoClass) {
        
        AnexoFactory<T> factory = (AnexoFactory<T>) registry.get(anexoClass);

        if (factory == null) {
            throw new IllegalArgumentException("Anexo não possui uma fábrica: " + anexoClass.getName());
        }

        return factory;
    }
}