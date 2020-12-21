package mantenimiento.Formularios;
import java.util.Vector;

public class met_sistema {
	 
  public Vector lis_lib =new Vector();
	 	
  public void ingresa(Object x){
      /*
      escriben codigo para insertar libro
      */      
      
  	  	lis_lib.add(x);  	  	 	  	
  	
  }
  public datos buscod(String x){
  	
  	datos na = new datos();
  	na.autor = "No Encontrado";
  	na.codigo = "No Encontrado";
  	na.edicion = "No Encontrado";
  	na.genero = "No Encontrado";
  	na.precio = "No Encontado";
  	
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.codigo.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}
 public datos buscautor(String x){
  	
  	datos na = new datos();
  	na.autor = "No Encontrado";
  	na.codigo = "No Encontrado";
  	na.edicion = "No Encontrado";
  	na.genero = "No Encontrado";
  	na.precio = "No Encontado";
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.autor.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}
 public datos buscedic(String x){
  	
  	datos na = new datos();
  	na.autor = "No Encontrado";
  	na.codigo = "No Encontrado";
  	na.edicion = "No Encontrado";
  	na.genero = "No Encontrado";
  	na.precio = "No Encontado";
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.edicion.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}
 public datos buscgene(String x){
  	
  	datos na = new datos();
  	na.autor = "No Encontrado";
  	na.codigo = "No Encontrado";
  	na.edicion = "No Encontrado";
  	na.genero = "No Encontrado";
  	na.precio = "No Encontado";
  	
  	for(int i=0;i<lis_lib.size();i++){
  	
        datos v = (datos)lis_lib.get(i);  	
  	   
 	if(v.genero.equals(x))  	
 	  return v;  
  	
  	}
  	return na;
}
/*public datos elimina(string x){
	datos na = new datos();
  	na.autor = "No Encontrado";
  	na.codigo = "No Encontrado";
  	na.edicion = "No Encontrado";
  	na.genero = "No Encontrado";
  	for(int i=0;i<lis_lib.size();i++){
  		if(v.codigo.equals(x));
  		return 
  		  	
  	}
}*/
}