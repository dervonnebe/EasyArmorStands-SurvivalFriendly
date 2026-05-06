package me.m56738.easyarmorstands.config;

import org.spongepowered.configurate.objectmapping.ConfigSerializable;

@ConfigSerializable
public class SurvivalFriendlyConfig {
    public boolean enabled = true;
    public boolean allowCloneArmorStands = true;
    public boolean allowDebug = false;
    public boolean allowDescriptions = false;
    public boolean allowMarker = false;
    public boolean allowRegister = false;
    public boolean allowTags = false;
    public boolean allowCanTick = false;
    public boolean allowInteractionEntities = false;
    public boolean allowMannequins = false;
    public boolean showActionBarHelp = true;
    public boolean copyEquipment = false;
}