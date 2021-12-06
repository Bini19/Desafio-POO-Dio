import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Guilherme:" + devGuilherme.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Guilherme:" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP:" + devGuilherme.calcularTotalXp());

        System.out.println("-------");

        Dev devBini = new Dev();
        devBini.setNome("Bini");
        devBini.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bini:" + devBini.getConteudosInscritos());
        devBini.progredir();
        devBini.progredir();
        devBini.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bini:" + devBini.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bini:" + devBini.getConteudosConcluidos());
        System.out.println("XP:" + devBini.calcularTotalXp());

    }

}
