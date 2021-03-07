package net.fabricmc.modbojeu.items;

import net.fabricmc.modbojeu.UI.BossChoiceGUI;
import net.fabricmc.modbojeu.UI.BossChoiceScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class BoJeuItem extends Item{

    public BoJeuItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
            playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0f,1.0f);
        MinecraftClient.getInstance().openScreen(new BossChoiceScreen(new BossChoiceGUI()));
            return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

}
