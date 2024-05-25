import java.util.Scanner;

public class Jerarquia implements Grupos{

    @Override
    public void ResponderCEO() {
        System.out.println("Departamento principal respondiendo ante CEO...");
    }

    @Override
    public void ResponderPrincipales() {
        System.out.println("Departamento secundario respondiendo ante departamento principal...");
    }

    @Override
    public void empleado(int i) {
        if (i == 1){
            System.out.println("Respondiendo ante CEO...");
        } else if (i == 2){
            System.out.println("Respondiendo ante el departamento principal...");
        } else if (i == 3) {
            System.out.println("Respondiendo ante el departamento secundario...");
        } else {
            System.out.println("No responde");
        }
    }

    public static void main(String[] args){
        Grupos gp = new Jerarquia();
        Scanner sc = new Scanner(System.in);
        int selection;
        System.out.println("Quien va a responder?");
        System.out.println("1)Dep. Principal 2)Dep. Secundario 3)Empleado");
        selection = sc.nextInt();
        switch (selection){
            case 1:
                gp.ResponderCEO();
            break;

            case 2:
                gp.ResponderPrincipales();
            break;

            case 3:
                System.out.println("A quien se ira a responder?");
                System.out.println("1)CEO 2)Dep. Principal 3)Dep. Secundario");
                int i = sc.nextInt();
                gp.empleado(i);
            break;

            default:
                System.out.println("Ingrese una opcion valida");
            break;
        }
    }


}
