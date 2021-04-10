package POO;

public class cavalo extends Animal {
	
	
	private String categoria;
	private boolean correr;
	
	
	
	public cavalo (String _nome, String _idade, String tipo, String categoria)
	{
		super(_nome,_idade,tipo);
		this.categoria = categoria;
	}
	
	
	@Override
	public void Acao(int c) {
		// TODO Auto-generated method stub
		
    	switch (c) 
    	{
    	case 1:
    		this.correr = true;
    		break;
    	case 2:
    		this.correr = false;
    		break;             	        	

		    	}
		    	
		    }
		

    
    public void ImprimirInfo() 
    {
         	             	        	
    	System.out.println("O nome do animal é "+nome+". Ele é um "+tipo+" da categoria de "+categoria+", e tem "+idade+" anos de idade. Ele está fazendo alguma ação agora? "+correr+". E está emitindo algum som? "+emitirSom);
        
    }









	
    
	
	
        

}
