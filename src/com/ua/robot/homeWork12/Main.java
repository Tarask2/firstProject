package com.ua.robot.homeWork12;

public class Main {
    public static void main(String[] args) {
        DiscribeAbstract student1 = new Student("Vasyl", 20, "Java");
        DiscribeAbstract student2 = new Student("Petro", 21, "Python");
        DiscribeAbstract student3 = new Student("Anna", 19, "C#");
        DiscribeAbstract student4 = new Student("Inna", 20, "C++");


        DiscribeAbstract teacher1 = new Teacher("Vasyl", "Petrovych", 40, "C++");
        DiscribeAbstract teacher2 = new Teacher("Ivan", "Romanovych", 35, "Java");
        DiscribeAbstract teacher3 = new Teacher("Stepan", "Volodymyrovych", 31, "Python");
        DiscribeAbstract teacher4 = new Teacher("Roman", "Vasyliovych", 37, "C#");


        student1.present();
        student2.present();
        student3.present();
        student4.present();
        teacher1.present();
        teacher2.present();
        teacher3.present();
        teacher4.present();

    }
}
