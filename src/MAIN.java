import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class MAIN {
    public static void main(String[] args) {
     Curso curso1 = new Curso();
     curso1.setTitulo("curso Java");
     curso1.setDescricao("descrição curso Java");
     curso1.setCargaHoraria(8);

     Curso curso2 = new Curso();
        curso1.setTitulo("curso Js");
        curso1.setDescricao("descrição curso Js");
        curso1.setCargaHoraria(8);

     Mentoria mentoria = new Mentoria();
     mentoria.setTitulo("mentoria de Java");
     mentoria.setDescricao("descrição mentoria Java");
     mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}