/**
 * - Exercici 1
 * Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments del mateix tipus,
 * juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor
 * per a inicialitzar els tres.
 * Comprova que els arguments es poden posar en qualsevol posició
 * en la crida al constructor.
 */
public class GenericMethods<T> {

    private T arg1;
    private T arg2;
    private T arg3;

    public void showArgumentsTypes(){
        System.out.println("arg1 : " + this.arg1+" class= " + this.arg1.getClass());
        System.out.println("arg2 : " + this.arg2+" class= " + this.arg2.getClass());
        System.out.println("arg3 : " + this.arg3+" class= " + this.arg3.getClass());
    }

    public GenericMethods(T  arg1, T  arg2, T  arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public T  getArg1() {
        return arg1;
    }

    public void setArg1(T  arg1) {
        this.arg1 = arg1;
    }

    public T  getArg2() {
        return arg2;
    }

    public void setArg2(T  arg2) {
        this.arg2 = arg2;
    }

    public T  getArg3() {
        return arg3;
    }

    public void setArg3(T  arg3) {
        this.arg3 = arg3;
    }
}
