public class Main {
    /**
     * - Exercici 1
     *     Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments del mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
     *
     * - Exercici 2
     *     Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres
     *     Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
     *  D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.
     *
     * @param args
     */
    public static void main (String[] args){

        // Exercici 1
        System.out.println("\nExercici 1.............................");
        NoGenericMethods nogenMet = new NoGenericMethods("arg2","arg3","arg1");
        nogenMet.showArguments();
        System.out.println("\nExercici 2.............................");
        // Exercici 2
        Persona persona = new Persona("AAAA","BBBB",3);
        GenericMethods genMet = new GenericMethods(1,"EEEE", persona);
        genMet.showArgumentsTypes();
        System.out.println("\n");
        GenericMethods genMet2 = new GenericMethods(persona, 1,"EEEE");
        genMet2.showArgumentsTypes();

    }
}
