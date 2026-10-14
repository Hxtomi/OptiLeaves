# OptiLeaves

[![CurseForge downloads](.github/badges/curseforge.svg)](https://www.curseforge.com/minecraft/mc-mods/optileaves)
[![Modrinth downloads](.github/badges/modrinth.svg)](https://modrinth.com/mod/optileaves)
[![Created on CurseForge](.github/badges/created.svg)](https://www.curseforge.com/minecraft/mc-mods/optileaves)
[![Modpack Friendly](.github/badges/modpack-friendly.svg)](LICENSE)

**Downloads:** [CurseForge](https://www.curseforge.com/minecraft/mc-mods/optileaves) · Modrinth: [Forge / NeoForge](https://modrinth.com/mod/optileaves) · [Fabric](https://modrinth.com/mod/optileaves%28fabric%29)

OptiLeaves is a rendering optimization mod for MC. It reduces leaf geometry in dense foliage, with adjustable culling depth to balance performance and visual detail.

## Benchmarks

In a dense forest test, OptiLeaves 2.0.1 delivered **35% higher average FPS** than Forge alone. Results were close to Cull Less Leaves Reforged and Cull Leaves, with pixel-identical screenshots across all three leaf optimizers in the tested scenes.

![OptiLeaves performance comparison with Forge, Cull Less Leaves Reforged and Cull Leaves](docs/assets/optileaves-benchmark.png)

Tested on 14 October 2026 with MC 1.20.1 / Forge 47.4.10, a Ryzen 7 5800H and RTX 3050 Laptop, at 1080p with Fancy leaves and view distance 8. Each optimizer ran separately, without shaders or extra renderer optimizers. FPS and frame-time figures are medians of three independent runs.

This was a constructed forest stress test. Results will vary with hardware and modpacks, and small differences between optimizers may be measurement noise. The compilation and allocation rows are separate single-run controls; they measure summed task time and temporary Java allocations, rather than chunk-loading time or total memory use. See [the test setup and full results](docs/BENCHMARKS.md) for details.

## Source code

Current source version: **v2.0.1**. Public source code starts with **v2.0**; source code and release files from earlier versions are not included here. Download counts cover the whole project, including earlier releases. The Modrinth counter combines both project listings. Download counters update daily.

| MC version | Source code |
| --- | --- |
| 1.20.1 | [Forge](Forge/1.20.1) · [Fabric](Fabric/1.20.1) |
| 1.21.1 | [NeoForge](NeoForge/1.21.1) · [Fabric](Fabric/1.21.1) |
| 1.21.11 | [NeoForge](NeoForge/1.21.11) · [Fabric](Fabric/1.21.11) |
| 26.2 | [NeoForge](NeoForge/26.2) · [Fabric](Fabric/26.2) |
| 26.3 | [NeoForge](NeoForge/26.3) · [Fabric](Fabric/26.3) |

See [BUILDING.md](BUILDING.md) for build instructions.

## Other projects

[Weather Refined](https://github.com/Hxtomi/WeatherRefind-source) is another Minecraft mod maintained by Norevy (Hxtomi). It replaces vanilla rain and snow with configurable particle effects. Downloads: [CurseForge](https://www.curseforge.com/minecraft/mc-mods/weather-refined) · [Modrinth](https://modrinth.com/mod/weatherrefind).

## License

Licensed under [MPL-2.0](LICENSE). Modpack inclusion is welcome. Distributed modifications to MPL-covered source files must remain available under MPL-2.0.

Copyright (c) 2025-2026 Norevy (Hxtomi).

