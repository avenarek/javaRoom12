import model.People;
import model.Person;
import service.PeopleService;
import service.PersoneService;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Gevorg", "Petrosyan", 1972, true, 'm', 1);
        Person p2 = new Person("Vazgen", "Aghayan", 1988, true, 'm', 2 );

        PeopleService s = new PeopleService();
        People people1 = s.create();
        People people2 = s.create();
        People people3 = s.create();
        People people4 = s.create();
        People people5 = s.create();

        People[] peoples = {people1, people2, people3, people4, people5};


        PeopleService service = new PeopleService();
        int count1 = service.count1(peoples);
        int count2 = service.count2(peoples);

        if(count1 > count2) {
            System.out.println(p1.getFirstName());
        }else {
            System.out.println(p2.getFirstName());
        }
    }
}
