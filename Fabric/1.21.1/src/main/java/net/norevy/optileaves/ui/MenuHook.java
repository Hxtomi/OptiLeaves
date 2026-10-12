// SPDX-License-Identifier: MPL-2.0
// Copyright (c) 2025-2026 Norevy (Hxtomi).

package net.norevy.optileaves.ui;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public final class MenuHook implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() { return OptiLeavesScreen::new; }
}
