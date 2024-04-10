package net.kmidnight.randomaddingmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kmidnight.randomaddingmod.RandomAddingMod;
import net.kmidnight.randomaddingmod.entity.custom.HamsterEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HamsterRenderer extends MobRenderer<HamsterEntity, HamsterModel<HamsterEntity>> {
    public HamsterRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HamsterModel<>(pContext.bakeLayer(ModModelLayers.HAMSTER_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(HamsterEntity pEntity) {
        return new ResourceLocation(RandomAddingMod.MOD_ID, "textures/entity/hamster.png");
    }

    @Override
    public void render(HamsterEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
