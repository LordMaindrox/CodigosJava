public class Paciente {
    static int id = 0;
    String name;
    String email;
    String adress;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;

    Paciente(String name, String email){
        id++;
        this.name = name;
        this.email = email;
    }
}
