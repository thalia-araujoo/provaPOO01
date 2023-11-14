class AgendaMedica {
    private String data = data;
    private MarcacaoHorario[8];
    private String MarcacaoDisponiveis[];


    public void AgendaMedica(String data){
        this.data = data;
        this.MarcacaoDisponiveis[] = new MarcacaoHorario[8];

}

    public void Agendar(String nome, String horario){
            for(int i = 0; i < MarcacaoDisponiveis.length; i++){
                if (MarcacaoDisponiveis[i] == null){
                    MarcacaoDisponiveis[i] = new MarcacaoHorario(String nome, String horario);
                    System.out.preintln("Seu agendamento foi feito com sucesso!");
                    return;
                }else{
                    System.out.preintln("O horario solicitado já está oculpado!");

            }

        }
         
    }

    public void verificarHorario(String horario) {
        for (MarcacaoHorario : horariosDisponiveis) {
            if (MarcacaoHorario != null && MarcacaoHorario.Retornar_horario().equals(horario)) {
                System.out.println("Paciente agendado para esse horário: " + MarcacaoHorario.Retornar_NomePac());
                return;
            }
        }
        System.out.println("Horário está livre.");
    }

    







