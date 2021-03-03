package com.brokencube.civilizations.civilization;

import java.util.List;

import org.bukkit.Location;

import com.brokencube.civilizations.api.Ownership;
import com.brokencube.civilizations.world.CivilizationsWorldChunk;

public class Civilization extends Ownership {

	public String name;
	public String motd;
	public String tag;
	
	public String owner;
	public List<String> deputies;
	public List<String> citizens;
	
	public PrivacyStatus pStatus;
	public List<String> invites;
	
	public int bank;
	
	public int tax;
	public int plotTax;
	public int shopTax;
	public int embassyTax;
	
	public int plotPrice;
	public int shopPrice;
	public int embassyPrice;
	
	public int landLimit;
	public int bonusPlots;
	
	public Location spawn;
	public CivilizationsWorldChunk home;
	public List<CivilizationsWorldChunk> plots;
	public List<CivilizationsWorldChunk> outposts;
	
}
