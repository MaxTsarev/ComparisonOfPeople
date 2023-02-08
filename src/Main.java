import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        int maxValue = 3;


        Comparator<Person> comparator = (o1, o2) -> {
            String[] surName1 = o1.getSurname().split(" |-");
            String[] surName2 = o2.getSurname().split(" |-");
            if (maxValue > surName1.length & maxValue > surName2.length) {
                if (surName1.length < surName2.length) {
                    return -1;
                }
                if (surName1.length > surName2.length) {
                    return 1;
                }
            }
            if (o1.getAge() < o2.getAge()) {
                return -1;
            } else if (o1.getAge() > o2.getAge()) {
                return 1;
            }
            return 0;
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
