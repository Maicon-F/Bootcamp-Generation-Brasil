package POO;

public class Animal {

	protected String nome;
	private String idade;
	private boolean emitirSom = false;
	
	
	public Animal (String _nome, String _idade)
	{
		
		this.nome = _nome;
		this.idade = _idade;
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
