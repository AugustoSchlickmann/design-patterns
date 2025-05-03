package decorator;

public class ExecuteDecorator {

    public static void main(String[] args) {
        Request request = new Request();

        DecoratorImpl decoratorImpl = new DecoratorImpl(request);

        Elemento elemento = decoratorImpl.create();

        decoratorImpl.read(elemento);

        decoratorImpl.update(elemento);

        decoratorImpl.delete(elemento);
    }


}
