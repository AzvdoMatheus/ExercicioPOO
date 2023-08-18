public class Predio {
    private String nome_predio;
    private String endereco;
    private Apartamento[] apartamentos;

    public Predio(String nome_predio, String endereco) {
        this.nome_predio = nome_predio;
        this.endereco = endereco;
        this.apartamentos = new Apartamento[2];
    }

    public String getNome_predio() {
        return nome_predio;
    }

    public void setNome_predio(String nome_predio) {
        this.nome_predio = nome_predio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    public int consultarAptosLivres() {
        int aptosDisp = 0;
        for (Apartamento apartamento : apartamentos) {
            if (apartamento.aptosDesocupado() == 0) {
                aptosDisp++;
            }
        }
        return aptosDisp;
    }

    public int consultaAdultos() {
        int totalAdultos = 0;
        for (Apartamento apartamento : apartamentos) {
            totalAdultos += apartamento.getNro_adultos();
        }
        return totalAdultos;
    }

    public int consultaCriancas() {
        int totalCriancas = 0;
        for (Apartamento apartamento : apartamentos) {
            totalCriancas += apartamento.getNro_criancas();
        }
        return totalCriancas;
    }

    public double consultarPercentual() {
        int totalAptos = apartamentos.length;
        int aptosDesocupados = consultarAptosLivres();
        return ((double) aptosDesocupados / totalAptos) * 100.0;
    }

    public int consultaNroId(String nome_prop) {
        for (Apartamento apartamentos : apartamentos) {
            if (apartamentos.getNome_prop().equals(nome_prop)) {
                return apartamentos.getNro_id();
            }
        }
        return 0;
    }
}
