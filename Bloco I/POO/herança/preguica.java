package POO;

public class preguica extends Animal {
	
	private boolean emitirSom = false;
	private boolean subir = false;
	
	
    
        
       
	
	public preguica (String _nome, String _idade)
	{
		super(_nome,_idade);
		
				
	}

    
    public void SubirArvores(int c) 
    {
    	             	        	
    	switch (c) 
    	{
    	case 1:
    		this.subir = true;
    		break;
    	case 2:
    		this.subir = false;
    		break;
    	}
    	
    }
    
    

    public void ImprimirInfo() 
    {
         	             	        	
    	System.out.println("O nome do animal � "+nome+", e ele est� correndo agora? "+subir+". Ele est� emitindo algum som agora? "+emitirSom);
        
    }
    
	
	
        

}
