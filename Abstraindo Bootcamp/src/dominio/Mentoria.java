package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria [\ntitulo: " + getTitulo() + "\ndescricao: " + getDescricao() + "\ndata: " + data + "]";
    }

    @Override
    public double calculaXp() {
        return XP_PADRAO + 20d;
    }

    
    
}
