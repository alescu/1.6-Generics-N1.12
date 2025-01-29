/**
 * - Exercici 1
 * Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments del mateix tipus,
 * juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor
 * per a inicialitzar els tres.
 * Comprova que els arguments es poden posar en qualsevol posició
 * en la crida al constructor.
 */
public class NoGenericMethods<T> {

    private String arg1;
    private String arg2;
    private String arg3;

    public void showArguments(){
        System.out.println("arg1 : " + this.arg1);
        System.out.println("arg2 : " + this.arg2);
        System.out.println("arg3 : " + this.arg3);
    }

    public NoGenericMethods(String arg1, String arg2, String arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public String getArg3() {
        return arg3;
    }

    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }
}
