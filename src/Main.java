public class Main {
    public static void main(String[] args) {
        System.out.println("HW-10");

        System.out.println();
        System.out.println("  Задача №1.");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();
        System.out.println("  Задача №2.");
        System.out.println(fullName.toUpperCase());

        System.out.println();
        System.out.println("  Задача №3.");
        String fullNameRu = "Иванов Семён Семёнович";
         fullNameRu= fullNameRu.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — "+fullNameRu);





    }
}