package ctec.hipster.model;

/**
 * Hipster object for the Hipster Project 2014.
 * @author erob7388 
 * @version 1.1 11/13/14
 */
public class Hipster
{
	private String name;
	private int age;
	private String [] hipsterAlbums;
	
	public Hipster()
	{
		name = "";
		age = -99;
		hipsterAlbums = null;
	}
	
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = null;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}
}
