package com.japastudios.setup;

import com.japastudios.items.TestItem;
import com.japastudios.japaadditions.JapaAdditions;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static final ResourceLocation DISTANCE_PROPERTY = new ResourceLocation(JapaAdditions.MODID, "distance");

    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            initTestItemOverrides();
        });
    }

    public static void initTestItemOverrides(){
        TestItem item = Registration.TESTITEM.get();
        ItemProperties.register(item, DISTANCE_PROPERTY,
                (stack, level, entity, damage) -> item.getDistance(stack));
    }
}
