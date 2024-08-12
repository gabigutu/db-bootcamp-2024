package com.mobile.studentexception;

public class Main {

    public static void main(String[] args) {
        Student adult = new Student("Adult", 40, 3, false);
        Student vasilica = new Student("Vasilica", 24, 5, true);

        alocaBilet(adult);
        alocaBilet(vasilica);

        System.out.println("Altceva din main");
    }

    static void alocaBilet(Student student) {
        try {
            student.alocaBiletTren(); // mai primeste Vasilica bilet de tren?
            System.out.println("(" + student.name + "): Altceva din try");
        } catch (NuEstiLaBugetException e) {
            System.out.println(student.name + " nu e la buget. Am primit: " + e.getMessage());
        } catch (NuAiVarstaPotrivitaException e) {
            System.out.println(student.name + " nu are varsta potrivita. Am primit: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exceptie generala (care nu e NuEstiLaBugetException si nici NuAiVarstaPotrivitaException): " + e.getMessage());
        } finally { // se executa fie ca nu se iese sau ca se iese printr-un catch
            System.out.println("(" + student.name + "): Ceva ce se executa oricum");
        }
    }
}
