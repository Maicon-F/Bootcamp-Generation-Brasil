package POO;

public class heranca1 {
	
	private String nome;
	private String idade;
	private boolean emitirSom = false;
	
	
	public heranca1 (String nome, String idade) 
	{
		
		this.nome = nome;
		this.idade = idade;
	}
	
		
		
    public void Som (int c) 
   {
        	             	        	
      	switch (c) 
       	{
       		case 1:
       		this.emitirSom = true;
       		break;
       		case 2:
       		this.emitirSom = false;
       		break;
       	}
        	
  }
    
    
    
     
        
        
	
	
	

}
