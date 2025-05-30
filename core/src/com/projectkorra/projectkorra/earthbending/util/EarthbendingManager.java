package com.projectkorra.projectkorra.earthbending.util;

import org.bukkit.Bukkit;

import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.earthbending.Shockwave;
import com.projectkorra.projectkorra.earthbending.Tremorsense;
import com.projectkorra.projectkorra.util.RevertChecker;

@Deprecated
public class EarthbendingManager implements Runnable {
	public ProjectKorra plugin;

	public EarthbendingManager(final ProjectKorra plugin) {
		this.plugin = plugin;
	}

	@Override
	public void run() {
		RevertChecker.revertEarthBlocks(); //Folia safe now
		Shockwave.progressAll(); //Nothing
		Tremorsense.manage(Bukkit.getServer()); //Folia safe now
	}
}
