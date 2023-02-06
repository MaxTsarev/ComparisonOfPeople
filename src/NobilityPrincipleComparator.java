import java.util.Comparator;

public class NobilityPrincipleComparator implements Comparator<Person> {

    private int maxValue;

    public NobilityPrincipleComparator(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surName1 = o1.getSurname().split(" ");
        String[] surName2 = o2.getSurname().split(" ");
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
    }

}
