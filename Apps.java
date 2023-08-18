public class Apps {
    public static void main(String[] args) {
        
        Predio predio = new Predio("Solarium", "Av. Ipiranga, 1000");

        predio.getApartamentos()[0] = new Apartamento();
        predio.getApartamentos()[1] = new Apartamento();

        predio.getApartamentos()[0].setNro_id(203);
        predio.getApartamentos()[0].setNome_prop("Joao");
        predio.getApartamentos()[0].setNro_criancas(2);
        predio.getApartamentos()[0].setNro_adultos(2);

        predio.getApartamentos()[1].setNro_id(204);
        predio.getApartamentos()[1].setNome_prop("Ana");
        predio.getApartamentos()[1].setNro_criancas(0);
        predio.getApartamentos()[1].setNro_adultos(0);

        System.out.println("apartamentos disponiveis: "+ predio.consultarAptosLivres());
        System.out.println("proprietario apto: "+ predio.getApartamentos()[0].getNome_prop());
        System.out.println("numero id: "+ predio.consultaNroId("Ana"));
        System.out.println("adultos no prédio: "+ predio.consultaAdultos());
        System.out.println("crianças no prédio: "+ predio.consultaCriancas());
        System.out.println("apartamentos desocupados: "+ predio.consultarPercentual()+ "%");
    }
}
