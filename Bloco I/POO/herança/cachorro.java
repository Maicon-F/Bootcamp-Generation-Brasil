package POO;

public class cachorro extends Animal{
	
	private boolean emitirSom = false;
	private boolean correr = false;
	
	
	
	
	public cachorro (String _nome, String _idade)
	{
		super(_nome,_idade);
		
				
	}

    
    public void Correr(int c) 
    {
    	             	        	
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
         	             	        	
    	System.out.println("O nome do animal � "+nome+", e ele est� correndo agora? "+correr+". Ele est� emitindo algum som agora? "+emitirSom);
        
    }
    
	
	

        
        
        
		
	
}
