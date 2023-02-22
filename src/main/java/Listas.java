import java.util.*;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[]args){
        List<String> ciudades=new ArrayList<>();
        ciudades.add("Valencia");
        ciudades.addAll(List.of("barcelona","Malaga","Londres"));
        System.out.println(ciudades);

        System.out.println(ciudades.stream().sorted().collect(Collectors.toList()));

      //  ciudades.sort(ALFABETICO);
        List<Persona> personas= new LinkedList<>();

        personas.add(new Persona("1","Uno"));
        personas.add(new Persona("2","dos"));
        personas.add(new Persona("3","tres"));
        personas.add(new Persona("4","cuatro"));
        personas.add(new Persona("5","cinco"));
        personas.add(new Persona("6","seis"));
        personas.add(new Persona("7","siete"));
        personas.add(new Persona("8","ocho"));

        Iterator<Persona> iterator = personas.iterator();
        Persona p;
        while(iterator.hasNext()){
            p = iterator.next();
            System.out.println(p);
        }

        Set<Persona> conjuntoPersonas = new HashSet<>();
        for(Persona p1 : personas ){
            conjuntoPersonas.add(p1);
        }

        for(Persona p1 : conjuntoPersonas) {
            System.out.println(p1);
        }

        Set<Persona> conjuntoOrdenado = new TreeSet<>(conjuntoPersonas);
        for(Persona p1 : conjuntoOrdenado) {
            System.out.println(p1);
        }

    }
}
