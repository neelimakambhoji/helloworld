package assgnments.assignment2;

public class Ratna {
    public static void main(String[]args){
        Ratna2 ratna = new Ratna2("Neelima", "kambhoji");
        System.out.println(ratna.firstname + " "+ ratna.lastname);
        Ratna2 ratna1 = new Ratna2("neeelima","kambhoji",20);
        System.out.println(ratna1.firstname + " " + ratna1.lastname + " " + ratna1.id);
        Ratna2 ratna2 = new Ratna2("neelima","kambhoji",20,40000);
        System.out.println(ratna2.firstname + " " + ratna2.lastname + " " + ratna2.id + " " + ratna2.salary);
    }
}
