// SPDX-License-Identifier: MPL-2.0
// Copyright (c) 2025-2026 Norevy (Hxtomi).

package net.norevy.optileaves.core;
import net.minecraft.client.Minecraft;
/** Vanilla and Sodium now share the cutout-leaves option. */
public final class RenderBridge {
    private RenderBridge() {}
    public static boolean fancyLeavesActive() { return Minecraft.getInstance().options.cutoutLeaves().get(); }
}
