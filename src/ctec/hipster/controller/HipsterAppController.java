package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;

public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster selfHipster;
	private String [] myAlbums;
	
	
	public HipsterAppController()
	{
		selfHipster = new Hipster("Eric", 17);
		buildAlbumArray();
		baseFrame = new HipsterFrame(this);
	}

	public void start()
	{
		selfHipster.setHipsterAlbums(myAlbums);
		
	}
	
	private void buildAlbumArray()
	{
		String [] myAlbums = new String[4];
		myAlbums[0] = "Iron and Wine: some hipsterness";
		myAlbums[1] = "Modest Mouse: used to be hipster";
		myAlbums[2] = "adlkjasjofsd";
		myAlbums[3] = "sads asdij eoij flij akljsldrij";
		
		String [] otherAlbums = {"stuff", "other", "way for", "hipster array"};
		
		String [] weirdAlbums;
		
		weirdAlbums = new String [] {"weird", "sad", "sda", "slkaj",};
	}
}
