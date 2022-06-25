public class Doctor {
    //Atributos de la clase
    static int id;
    String name;
    String email;
    String speciality;

    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //Comportamientos de la clase
    public void showName(){
        System.out.println(name);

    }
}
