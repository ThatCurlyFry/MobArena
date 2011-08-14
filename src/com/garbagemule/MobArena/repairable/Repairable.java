package com.garbagemule.MobArena.repairable;

//import java.io.Serializable;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.BlockState;

public interface Repairable// extends Serializable
{
    public void repair();

    public BlockState getState();
    public World getWorld();
    public Material getType();
    public int getId();
    public byte getData();
    public int getX();
    public int getY();
    public int getZ();
}
