package com.japastudios.datagen;

import com.japastudios.japaadditions.JapaAdditions;
import com.japastudios.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {


    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, JapaAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        singleTexture(Registration.TESTITEM.get().getRegistryName().getPath(),
//        new ResourceLocation("item/handheld"),
//        "layer0",
//        new ResourceLocation(JapaAdditions.MODID, "item/firstitem"));
    }
}
