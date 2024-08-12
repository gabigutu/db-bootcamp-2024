package com.mobile;

 public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (String arg : args) {
            System.out.println("Argument: " + arg);
        }

        int primulNr = (int) 43313123232l;
        long numarLung = 4334411444414123232l;

        double altNumar = 4341414444124333.44414422;
        float altreileaNumar;
        altreileaNumar = (float) 4341414444124333.44414422;

        char c = 'r';
        String sir = "jda ";

        boolean adevar = true;
        adevar = false;

        Integer myInteger = Integer.valueOf(primulNr);
        System.out.println("myInteger = " + myInteger);

        int myInt = (int) 3.1f;
        System.out.println("myInt = " + myInt);

        double d = 4; // 4.00000
        System.out.println("d = " + d);

        int x = 3;
        int y = x++;
        System.out.println("x = " + x); // 4
        System.out.println("y = " + y); // 3

        int z = ++x;
        System.out.println("x = " + x); // 5
        System.out.println("z = " + z); // 5s

        int a = -x;

        Masina masina1 = new Masina(); // da-mi spatiu in zona de memorie ca sa tin si eu un obiect
        Masina masina2 = new Masina(); // da-mi spatiu in zona de memorie ca sa tin si eu un obiect
        System.out.println("masina1 = " + masina1); // ?
        System.out.println("masina2 = " + masina2); // ?

        Masina masina3 = masina1; // mai da-mi un alias pentru masina1 (nu imi mai aloca spatiu pentru o alta masina)
        System.out.println("masina3 = " + masina3); // ?

        System.out.println(masina1 == masina2); // false
        System.out.println(masina1 == masina3); // true
        System.out.println(masina2 == masina3); // false

        System.out.println(masina1 == masina3 && x == 5); // true
        System.out.println(masina1 == masina3 || x == 544141); // true

        System.out.println((2 + 2) / 2); // 4

        if (masina1 == masina2) {
            System.out.println("Se refera la aceeasi masina");
        } else {
            System.out.println("Nu se refera la aceeasi masina");
        }

        int rainChance = 2; // [1; 3]
        switch (rainChance) {
            case 1:
                System.out.println("Leave umbrella at home");
                break;
            case 2:
                System.out.println("Take umbrella if you find it easily");
                break;
            case 3:
                System.out.println("Spend 10 minutes to look for umbrella");
                break;
        }

        // so
        // drivere
        // office

        int INSTALL = 1;
        switch (INSTALL) {
            case 1:
                System.out.println("INSTALL SO");
            case 30000:
                System.out.println("INSTALL OFFICE");
            case 2:
                System.out.println("INSTALL DRIVERS");
                break;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(" i = " + i);
        }

        int j; double ceva;
        for (j = 0, ceva = 0;ceva <= 0.95;) {
            ceva = Math.random(); // [0.0; 1.0)
            System.out.println("inca un pas: ceva = " + ceva);
            if (ceva > 0.95) {
                System.out.println("mai mare decat 0.9");
            }
        }

        double numar = 0.5;
        while (numar < 0.5) {
            numar = Math.random();
            System.out.println("(while) mai mic decat 0.5: " + numar);
        }

        numar = 1;
        do {
            numar = Math.random();
            System.out.println("(do while) mai mic decat 0.5: " + numar);
        } while (numar < 0.5);


        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        System.out.println(yes == no || grade > amount); // true
//        System.out.println(amount == 40.0 || 50.0);
        System.out.println(hiVal != loVal || loVal < 0); // true
        System.out.println(true || hello.length() > 0); // true
        System.out.println(hello.isEmpty() && yes); // false
        System.out.println(grade <= 100 && !false); // true
        System.out.println(!yes || no); // false
//        System.out.println(grade > 75 > amount);
        System.out.println(amount <= hiVal && amount >= loVal); // true
        System.out.println(no && !no || yes && !yes); // false

        float a1 = 100.25f;
        long b = (long)a1;
        System.out.println("value of a: "+a1); // 100.25
        System.out.println("value of b:"+b); // 100
        int c1 = (int)b;
        System.out.println("value of c:"+c1); // 100
        byte d1 = (byte)(c1 * 2); // 200
        System.out.println("value of d:"+d1); // -56

        a = 5;
        System.out.println(a + -a - a++ % 10); // -5
        System.out.println(a - a + --a / 10); // 0
        for (int i = 2; i < 5;) { // 3 pasi
            i++;
            a += a;
        }
        System.out.println("a = " + a); // 40

    }
}
