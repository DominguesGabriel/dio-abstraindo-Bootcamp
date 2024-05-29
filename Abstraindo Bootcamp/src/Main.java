import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Primeiro Emprego");
        curso1.setDescricao("Em busca do primeiro emprego como desenvolvedor");
        curso1.setCargaHoraria(81);
        Curso curso2 = new Curso();
        curso2.setTitulo("Gabriel Domingues");
        curso2.setDescricao("Futuro engenheiro de software");
        curso2.setCargaHoraria(365*4);

        Mentoria mentoria1 =new Mentoria();
        Mentoria mentoria2 = new Mentoria();
        mentoria1.setTitulo("POO na prática");
        mentoria1.setDescricao("Aprenda o paradigma da progamação orientada a objetos");
        mentoria1.setData(LocalDate.now());
        mentoria2.setTitulo("Js");
        mentoria2.setDescricao("Aprenda Js");
        mentoria2.setData(LocalDate.now());
        //System.out.println(mentoria1);
        //System.out.println(mentoria2);
        //System.out.println(curso1.calculaXp());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Java");
        bootcamp.setDescricao("Aprendendo Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev gabrielDomingues = new Dev();
        Dev julhana = new Dev();

        gabrielDomingues.setNome("Gabriel Domingues");
        gabrielDomingues.inscreverBootcamp(bootcamp);
        julhana.setNome("Julhana");
        julhana.inscreverBootcamp(bootcamp);
        gabrielDomingues.progredir();
        gabrielDomingues.progredir();
        julhana.progredir();

        System.out.println("O dev "+ gabrielDomingues.getNome()+ " está inscrito nos seguintes conteudos "+ gabrielDomingues.getConteudosInscritos());
        System.out.println("O dev "+ julhana.getNome()+ " está inscrito nos seguintes conteudos "+ julhana.getConteudosInscritos());
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("O dev "+ gabrielDomingues.getNome()+ " concluiu os seguintes conteudos "+ gabrielDomingues.getConteudosConcluidos());
        System.out.println("O dev "+ julhana.getNome()+ " concluiu os seguintes conteudos "+ julhana.getConteudosConcluidos());
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("O dev "+ gabrielDomingues.getNome()+ " possui o seguiinte XP "+ gabrielDomingues.calculaTotalXp());
        System.out.println("O dev "+ julhana.getNome()+ " possui o seguiinte XP "+ julhana.calculaTotalXp());
    }
}
