// SPDX-License-Identifier: MPL-2.0
// Copyright (c) 2025-2026 Norevy (Hxtomi).

package net.norevy.optileaves;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.ModList;

public final class RendererCompat {
    private static final boolean SODIUM =
            ModList.get().isLoaded("embeddium") || ModList.get().isLoaded("rubidium");

    private RendererCompat() {}

    public static boolean fancyLeaves() {
        return SODIUM ? SodiumOptions.fancyLeaves() : Minecraft.useFancyGraphics();
    }
}
