package Cap5;

public class SimuladorDeCaixaDeBanco {

	 private int numeroDoCliente;
	    private int numeroDoCaixa;
	    
	    public SimuladorDeCaixaDeBanco(int n){
	        numeroDoCaixa = n;
	        numeroDoCliente = 0;
	        System.out.println("Caixa "+numeroDoCaixa+" iniciou operação.");
	    }
	    
	    public void proximoAtendimento(){
	        numeroDoCliente = numeroDoCliente+1;
	        System.out.println("Cliente com a senha numero: "+numeroDoCliente+" ");
	        System.out.println("do caixa " +numeroDoCaixa+ ", favor dirigir-se ao caixa.");
	    }
	    
	    public static void main(String[]args){
	        SimuladorDeCaixaDeBanco  um = new SimuladorDeCaixaDeBanco(1);
	        SimuladorDeCaixaDeBanco dois = new SimuladorDeCaixaDeBanco(2);
	        SimuladorDeCaixaDeBanco tres = new SimuladorDeCaixaDeBanco(3);
	        SimuladorDeCaixaDeBanco quatro = new SimuladorDeCaixaDeBanco(4);
	        
	        um.proximoAtendimento();
	        dois.proximoAtendimento();
	        tres.proximoAtendimento();
	        quatro.proximoAtendimento();
	        um.proximoAtendimento();
	        dois.proximoAtendimento();
	        tres.proximoAtendimento();
	        quatro.proximoAtendimento();
	        um.proximoAtendimento();



	    }

}
