import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Сергей", "Иванов", 20));
        people.add(new Person("Руслан", "Петров Сидоров", 23));
        people.add(new Person("Василий", "Аксенов Васечкин", 25));
        people.add(new Person("Игорь", "Деточкин Самойлов Римский", 12));
        people.add(new Person("Денис", "Макеев", 50));
        people.add(new Person("Алексей", "Хабиров-Греческий-Корсаков", 80));
        people.add(new Person("Тимур", "Котов Шитов Рогов Лосев", 52));

        Collections.sort(people, new NobilityPrincipleComparator(3));
        System.out.println(people);
    }
}
