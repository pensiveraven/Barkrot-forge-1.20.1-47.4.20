package net.pensiveraven.barkrot.item;

import net.pensiveraven.barkrot.BarkRot;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pensiveraven.barkrot.block.ModBlocks;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BarkRot.MODID);

    public static final RegistryObject<CreativeModeTab> BARKROT_TAB = CREATIVE_MODE_TABS.register("barkrot_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.barkrot_tab"))
            .icon(() -> new ItemStack(ModItems.RESIN.get()))
            .displayItems((params, output) -> {
                output.accept(ModItems.RESIN.get());

                output.accept(ModBlocks.ROTTEN_COMPOST.get());
            })
            .build()
    );
    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
