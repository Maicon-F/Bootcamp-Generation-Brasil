package POO;

public class cachorro extends Animal{
	

	private String race;
	private boolean correr;
	
	
	
	public cachorro (String _nome, String _idade, String tipo, String race)
	{
		super(_nome,_idade,tipo);
		this.race = race;
	}
	
	
	@Override
	public void Acao(int c) 
	{
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
         	             	        	
    	System.out.println("O nome do animal é "+nome+". Ele é"+tipo+" da raça "+race+", e tem "+idade+" anos de idade. Ele está fazendo alguma ação agora? "+correr+". E está emitindo algum som? "+emitirSom);
        
    }

	

        
        
        
		
	
}
