import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargahoraria(4);

        // polimorfismo
        // (tudo que tem em conteúdo, tem em curso, mas nem tudo que tem em curso, tem em conteúdo)
        // Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRita = new Dev();
        devRita.setNome("Rita");
        devRita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: "+ devRita.getConteudosInscritos());
        devRita.progredir();
        devRita.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: "+ devRita.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ devRita.getConteudosConcluidos());
        System.out.println("Xp: " + devRita.calcularTotalXp());

        System.out.println("-----");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ devJoao.getConteudosConcluidos());
        System.out.println("Xp: " + devJoao.calcularTotalXp());




    }
}
