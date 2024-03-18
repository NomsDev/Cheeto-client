/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  gg.essential.elementa.UIComponent
 *  gg.essential.elementa.UIConstraints
 *  gg.essential.elementa.components.UIText
 *  gg.essential.elementa.constraints.CenterConstraint
 *  gg.essential.elementa.constraints.ColorConstraint
 *  gg.essential.elementa.constraints.HeightConstraint
 *  gg.essential.elementa.constraints.RelativeConstraint
 *  gg.essential.elementa.constraints.SiblingConstraint
 *  gg.essential.elementa.constraints.SuperConstraint
 *  gg.essential.elementa.constraints.WidthConstraint
 *  gg.essential.elementa.constraints.XConstraint
 *  gg.essential.elementa.constraints.YConstraint
 *  gg.essential.elementa.dsl.ComponentsKt
 *  gg.essential.elementa.dsl.ConstraintsKt
 *  gg.essential.elementa.dsl.UtilitiesKt
 *  gg.essential.elementa.font.DefaultFonts
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.PropertyReference1
 *  kotlin.jvm.internal.PropertyReference1Impl
 *  kotlin.jvm.internal.Reflection
 *  kotlin.math.MathKt
 *  kotlin.properties.ReadWriteProperty
 *  kotlin.reflect.KProperty
 *  org.jetbrains.annotations.NotNull
 */
package xyz.apfelmus.cheeto.client.clickgui.settings;

import gg.essential.elementa.UIComponent;
import gg.essential.elementa.UIConstraints;
import gg.essential.elementa.components.UIText;
import gg.essential.elementa.constraints.CenterConstraint;
import gg.essential.elementa.constraints.ColorConstraint;
import gg.essential.elementa.constraints.HeightConstraint;
import gg.essential.elementa.constraints.RelativeConstraint;
import gg.essential.elementa.constraints.SiblingConstraint;
import gg.essential.elementa.constraints.SuperConstraint;
import gg.essential.elementa.constraints.WidthConstraint;
import gg.essential.elementa.constraints.XConstraint;
import gg.essential.elementa.constraints.YConstraint;
import gg.essential.elementa.dsl.ComponentsKt;
import gg.essential.elementa.dsl.ConstraintsKt;
import gg.essential.elementa.dsl.UtilitiesKt;
import gg.essential.elementa.font.DefaultFonts;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import xyz.apfelmus.cheeto.client.clickgui.settings.AbstractSliderComponent;
import xyz.apfelmus.cheeto.client.clickgui.settings.SettingComponent;
import xyz.apfelmus.cheeto.client.clickgui.settings.Slider;
import xyz.apfelmus.cheeto.client.utils.client.ColorUtils;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2={"Lxyz/apfelmus/cheeto/client/clickgui/settings/SliderComponent;", "Lxyz/apfelmus/cheeto/client/clickgui/settings/AbstractSliderComponent;", "initialValue", "", "min", "max", "(III)V", "currentValueText", "Lgg/essential/elementa/components/UIText;", "getCurrentValueText", "()Lgg/essential/elementa/components/UIText;", "currentValueText$delegate", "Lkotlin/properties/ReadWriteProperty;", "slider", "Lxyz/apfelmus/cheeto/client/clickgui/settings/Slider;", "getSlider", "()Lxyz/apfelmus/cheeto/client/clickgui/settings/Slider;", "slider$delegate", "Cheeto"})
public final class SliderComponent
extends AbstractSliderComponent {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty slider$delegate;
    @NotNull
    private final ReadWriteProperty currentValueText$delegate;

    /*
     * WARNING - void declaration
     */
    public SliderComponent(int initialValue, final int min, final int max) {
        void $this$currentValueText_delegate_u24lambda_u2d3;
        void $this$slider_delegate_u24lambda_u2d1;
        UIComponent uIComponent;
        UIComponent $this$constrain$iv = (UIComponent)new UIText(String.valueOf(min), false, null, 6, null);
        boolean $i$f$constrain = false;
        UIComponent $this$constrain_u24lambda_u2d0$iv = uIComponent = $this$constrain$iv;
        boolean bl = false;
        UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        boolean bl2 = false;
        $this$_init__u24lambda_u2d0.setY((YConstraint)new CenterConstraint());
        Color color = ColorUtils.LABEL;
        Intrinsics.checkNotNullExpressionValue((Object)color, (String)"LABEL");
        $this$_init__u24lambda_u2d0.setColor((ColorConstraint)UtilitiesKt.toConstraint((Color)color));
        $this$_init__u24lambda_u2d0.setFontProvider(DefaultFonts.getVANILLA_FONT_RENDERER());
        ComponentsKt.childOf((UIComponent)uIComponent, (UIComponent)((UIComponent)this));
        $this$constrain$iv = (UIComponent)new Slider(((float)initialValue - (float)min) / (float)(max - min));
        $i$f$constrain = false;
        $this$constrain_u24lambda_u2d0$iv = uIComponent = $this$constrain$iv;
        bl = false;
        $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        SliderComponent sliderComponent = this;
        boolean bl3 = false;
        $this$slider_delegate_u24lambda_u2d1.setX((XConstraint)new SiblingConstraint(0.0f, false, 3, null));
        $this$slider_delegate_u24lambda_u2d1.setWidth((WidthConstraint)UtilitiesKt.pixels$default((Number)60, (boolean)false, (boolean)false, (int)3, null));
        $this$slider_delegate_u24lambda_u2d1.setHeight((HeightConstraint)UtilitiesKt.pixels$default((Number)12, (boolean)false, (boolean)false, (int)3, null));
        sliderComponent.slider$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((UIComponent)uIComponent, (UIComponent)((UIComponent)this)), (Object)((Object)this), $$delegatedProperties[0]);
        $this$constrain$iv = (UIComponent)new UIText(String.valueOf(max), false, null, 6, null);
        $i$f$constrain = false;
        $this$constrain_u24lambda_u2d0$iv = uIComponent = $this$constrain$iv;
        bl = false;
        UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        boolean bl4 = false;
        $this$_init__u24lambda_u2d2.setX((XConstraint)new SiblingConstraint(0.0f, false, 3, null));
        $this$_init__u24lambda_u2d2.setY((YConstraint)new CenterConstraint());
        color = ColorUtils.LABEL;
        Intrinsics.checkNotNullExpressionValue((Object)color, (String)"LABEL");
        $this$_init__u24lambda_u2d2.setColor((ColorConstraint)UtilitiesKt.toConstraint((Color)color));
        $this$_init__u24lambda_u2d2.setFontProvider(DefaultFonts.getVANILLA_FONT_RENDERER());
        ComponentsKt.childOf((UIComponent)uIComponent, (UIComponent)((UIComponent)this));
        $this$constrain$iv = (UIComponent)new UIText(String.valueOf(initialValue), false, null, 6, null);
        $i$f$constrain = false;
        $this$constrain_u24lambda_u2d0$iv = uIComponent = $this$constrain$iv;
        bl = false;
        $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        sliderComponent = this;
        boolean bl5 = false;
        $this$currentValueText_delegate_u24lambda_u2d3.setX((XConstraint)ConstraintsKt.boundTo((SuperConstraint)((SuperConstraint)new CenterConstraint()), (UIComponent)((UIComponent)this.getSlider().getGrabBox())));
        $this$currentValueText_delegate_u24lambda_u2d3.setY((YConstraint)new RelativeConstraint(1.5f));
        color = ColorUtils.LABEL;
        Intrinsics.checkNotNullExpressionValue((Object)color, (String)"LABEL");
        $this$currentValueText_delegate_u24lambda_u2d3.setColor((ColorConstraint)UtilitiesKt.toConstraint((Color)color));
        $this$currentValueText_delegate_u24lambda_u2d3.setFontProvider(DefaultFonts.getVANILLA_FONT_RENDERER());
        sliderComponent.currentValueText$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((UIComponent)uIComponent, (UIComponent)((UIComponent)this.getSlider())), (Object)((Object)this), $$delegatedProperties[1]);
        this.getSlider().onValueChange((Function1<? super Float, Unit>)((Function1)new Function1<Float, Unit>(){

            public final void invoke(float newPercentage) {
                int newValue = MathKt.roundToInt((float)((float)min + newPercentage * (float)(max - min)));
                SettingComponent.changeValue$default(this, newValue, false, 2, null);
                this.getCurrentValueText().setText(String.valueOf(newValue));
            }
        }));
        this.sliderInit();
    }

    @Override
    @NotNull
    protected Slider getSlider() {
        return (Slider)((Object)this.slider$delegate.getValue((Object)this, $$delegatedProperties[0]));
    }

    private final UIText getCurrentValueText() {
        return (UIText)this.currentValueText$delegate.getValue((Object)this, $$delegatedProperties[1]);
    }

    static {
        KProperty[] arrkProperty = new KProperty[]{(KProperty)Reflection.property1((PropertyReference1)((PropertyReference1)new PropertyReference1Impl(SliderComponent.class, "slider", "getSlider()Lxyz/apfelmus/cheeto/client/clickgui/settings/Slider;", 0))), (KProperty)Reflection.property1((PropertyReference1)((PropertyReference1)new PropertyReference1Impl(SliderComponent.class, "currentValueText", "getCurrentValueText()Lgg/essential/elementa/components/UIText;", 0)))};
        $$delegatedProperties = arrkProperty;
    }
}

