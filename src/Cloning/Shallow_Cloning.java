package Cloning;

public class Shallow_Cloning {
    public static void main(String [] args) {

    }
}
class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }
}

class Patient {
    String age;
    Doctor doctor;

    public Patient(String age, Doctor doctor) {
        this.age = age;
        this.doctor = doctor;

    }

}