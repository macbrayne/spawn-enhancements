package de.macbrayne.fabric.spawnenhancements.mixin;

import de.macbrayne.fabric.spawnenhancements.Reference;
import de.macbrayne.fabric.spawnenhancements.server.SpawnProtection;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.dedicated.MinecraftDedicatedServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftDedicatedServer.class)
public class MinecraftDedicatedServerMixin {
    @Inject(method = "isSpawnProtected", at = @At(value = "HEAD"), cancellable = true)
    public void isSpawnProtected(ServerWorld world, BlockPos pos, PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        SpawnProtection.isSpawnProtected(world, pos, player, cir);
    }
}