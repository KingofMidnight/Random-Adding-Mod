package net.kmidnight.randomaddingmod.entity.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ModAnimationDefinitions {
    public static final AnimationDefinition HAMSTER_IDLE = AnimationDefinition.Builder.withLength(2f).looping()
        .addAnimation("hamster",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1f, KeyframeAnimations.posVec(0f, 1f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition HAMSTER_WALK = AnimationDefinition.Builder.withLength(2f).looping()
        .addAnimation("left_back_leg",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
                new Keyframe(0.9167666f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.25f, KeyframeAnimations.posVec(0f, -1f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.6766667f, KeyframeAnimations.posVec(0f, -1f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("left_back_leg",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
                new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.25f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.6766667f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("right_back_leg",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.375f, KeyframeAnimations.posVec(0f, -1f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.7083434f, KeyframeAnimations.posVec(0f, -1.25f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.125f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("right_back_leg",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.375f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.7083434f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.125f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("right_front_leg",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
                new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.2916767f, KeyframeAnimations.posVec(0f, -1f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.625f, KeyframeAnimations.posVec(0f, -1f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("right_front_leg",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
                new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.2916767f, KeyframeAnimations.degreeVec(-7.5f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1.625f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("left_front_leg",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -1f, -1f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.6766666f, KeyframeAnimations.posVec(0f, -1f, 1f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("left_front_leg",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.25f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR),
                new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                    AnimationChannel.Interpolations.LINEAR))).build();
}
