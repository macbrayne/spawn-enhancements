package de.macbrayne.fabric.spawnprotectiontweaks.utils;

import net.minecraft.world.World;

import java.util.*;

public class ModConfig {
    public boolean enabled = false;
    public boolean alert = true;
    public String alias = "spt";
    public final HashMap<String, DimensionConfig> whitelist = new HashMap<>(Map.of(World.OVERWORLD.getValue().toString(), new DimensionConfig()));

    public static class DimensionConfig {
        public float radius = 15;
    }
}