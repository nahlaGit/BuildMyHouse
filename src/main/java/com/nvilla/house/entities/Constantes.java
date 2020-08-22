package com.nvilla.house.entities;

public interface Constantes {
  
	/* variable pour definir la position du nord */ 
	public static String NORD  = "nord";  
	
	
	public static String SUD  = "sud";  
	public static String WEST  = "wes";  
	public static String EST  = "est";  
	public static String MAISON_ONE_PIECE  = "maison type studio";  
	public static String MAISON_Fn  = "maison a plus qu'une piece ";  
	
	public static boolean has_adjacent_room  = true;  
	
	public static boolean no_adjacent_room  =  true ;  
	
	public static String message_alerte_suppression_OK = "vous pouvez supprimer cette piece";  
	public static String message_alerte_suppression_KO  = "malheuresement vous ne pouvez pas detruire cette piece" ;  
	public static String raison_access  = "pas d'access a la piece ";  

	 
}
