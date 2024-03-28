package me.ht9.antiminecartdupe.listeners;

import com.legacyminecraft.poseidon.event.PlayerReceivePacketEvent;
import com.legacyminecraft.poseidon.event.PlayerSendPacketEvent;
import com.legacyminecraft.poseidon.event.PoseidonCustomListener;
import me.ht9.antiminecartdupe.AntiMinecartDupe;
import net.minecraft.server.Packet100OpenWindow;
import net.minecraft.server.Packet101CloseWindow;
import net.minecraft.server.Packet7UseEntity;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.entity.CraftStorageMinecart;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;

public class PacketEventListener
{
}
