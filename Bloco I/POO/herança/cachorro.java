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
         	             	        	
    	System.out.println("O nome do animal é "+nome+", e ele está correndo agora? "+correr+". Ele está emitindo algum som agora? "+emitirSom);
        
    }
    
	
	

        
        
        
		
	
}
