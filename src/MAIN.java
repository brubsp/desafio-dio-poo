import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
     mentoria.setTitulo("mentoria de Java");
     mentoria.setDescricao("descrição mentoria Java");
     mentoria.setData(LocalDate.now());

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.increverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
       devCamila.progredir();
       devCamila.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
       System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
       System.out.println("XP: " + devCamila.calcularTotalXp());


       System.out.println("------------------");
       Dev devBruna = new Dev();
       devBruna.setNome("Bruna");
       devBruna.increverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Bruna: " + devBruna.getConteudosInscritos());
       devBruna.progredir();
       devBruna.progredir();
       devBruna.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Bruna: " + devBruna.getConteudosInscritos());
       System.out.println("Conteúdos Concluídos Bruna: " + devBruna.getConteudosConcluidos());
       System.out.println("XP: " + devBruna.calcularTotalXp());









    }
}