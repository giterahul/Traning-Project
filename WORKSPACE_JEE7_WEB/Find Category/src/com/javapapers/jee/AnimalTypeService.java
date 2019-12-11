 package com.javapapers.jee;

public class AnimalTypeService {
	
	public String animalType( String animalName)
	{
		String animalType="";
		if("Lion".equalsIgnoreCase(animalName))
		{
			animalType="wild";
		}
		else if("dog".equalsIgnoreCase(animalName))
		{
			animalType="domestic";
			
		}else
		{
			animalType="i dont know";
		}
		return animalType;
	}

}
