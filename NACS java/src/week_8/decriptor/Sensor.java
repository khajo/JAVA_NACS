package week_8.decriptor;

import week_8.decriptor.Decriptores;
import week_8.decriptor.Descriptor;

import java.util.List;
import java.util.Optional;

public class Sensor {


    public Optional getDecripted(String line) {
        List<Descriptor> decriptores = Decriptores.getDecriptor();
        for (Descriptor decriptore : decriptores) {
            if (decriptore.isThere(line)) {
                String decriptor = decriptore.decriptor(line);
                return Optional.of(decriptor);

            }
        }
        return Optional.empty();
    }


}
