package POO;

public abstract class Animal {

	protected String nome;
	protected String idade;
	protected String tipo;
	protected boolean emitirSom = false;
	
	
	public Animal (String _nome, String _idade, String tipo)
	{
		
		this.nome = _nome;
		this.idade = _idade;
		this.tipo = tipo;
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
    
    
   abstract public void Acao(int c); 
   
   abstract public void ImprimirInfo(); 
  
    	
    
    
    
    	
	
}
