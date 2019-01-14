package transporter;

public class Transporter {

    public Boolean transport(Integer carType1, Integer carType5, Integer people) {
        if (carType5 == 0) {
            Integer type1 = people;
        }
        Integer type5 = people % (carType5 * 5);
            Integer type1 = people - type5;

        return carType1== type1 && type5== carType5;
    }
}
