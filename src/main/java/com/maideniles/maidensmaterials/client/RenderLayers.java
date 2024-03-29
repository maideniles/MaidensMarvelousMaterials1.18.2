package com.maideniles.maidensmaterials.client;


import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RenderLayers {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORNAMENTAL_MUSHROOM.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_ORNAMENTAL_MUSHROOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FAIRY_GLOW_CUP.get(), RenderType.cutoutMipped());

        //vines
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WALK_FLOWERS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_VINE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_VINE.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_LEAVES.get(), RenderType.cutoutMipped());
       // ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_LEAVES.get(), RenderType.cutoutMipped());
     //   ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_LEAVES.get(), RenderType.cutoutMipped());
    //    ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
    //    ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_LEAVES.get(), RenderType.cutoutMipped());
   //     ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_LEAVES.get(), RenderType.cutoutMipped());
   //     ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_LEAVES.get(), RenderType.cutoutMipped());
   //     ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_LEAVES.get(), RenderType.cutoutMipped());
    //    ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_LEAVES.get(), RenderType.cutoutMipped());
   //     ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_FLOWERING_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_LEAVES.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_SAPLING.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_SAPLING.get(), RenderType.cutoutMipped());

    //VASES//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_RED.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_ORANGE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_YELLOW.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_LIME.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_GREEN.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_CYAN.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_LIGHT_BLUE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_BLUE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_PURPLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_MAGENTA.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_PINK.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_WHITE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_LIGHT_GRAY.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_GRAY.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_BLACK.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VASE_BROWN.get(), RenderType.cutoutMipped());
        //doors//

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_1.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_2.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_3.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_4.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_5.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_DOOR_6.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_DOOR_1.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_DOOR_2.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_DOOR_3.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_DOOR_4.get(), RenderType.cutoutMipped());




        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_DOOR_5.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_DOOR_6.get(), RenderType.cutoutMipped());



        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_1.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_1.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_2.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_2.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_3.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_3.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRABAPPLE_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINCIANA_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LABURNUM_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JADE_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PAULOWNIA_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISTERIA_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DOGWOOD_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVERBELL_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEDAR_TRAPDOOR_4.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_DOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_DOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_DOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_DOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_DOOR_5.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_DOOR_6.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_TRAPDOOR_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_TRAPDOOR_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_TRAPDOOR_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_TRAPDOOR_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_TRAPDOOR_4.get(), RenderType.cutoutMipped());

    }

    public static void safeRunClient() {
        final IEventBus eventHandler = FMLJavaModLoadingContext.get().getModEventBus();
        eventHandler.register(RenderLayers.class);
    }
}

