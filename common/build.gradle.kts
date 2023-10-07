plugins {
    id("dev.architectury.loom")
    id("architectury-plugin")
}


architectury {
    common("forge")
}

loom {
    silentMojangMappingsLicense()
}

dependencies {
    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    // The following line declares the mojmap mappings, you may use other mappings as well
    mappings(loom.officialMojangMappings())
    implementation("net.kyori:adventure-text-minimessage:${property("minimessage_version")}")
    implementation("net.kyori:adventure-text-serializer-gson:${property("minimessage_version")}")
    // Remove the next line if you don't want to depend on the API
    modApi("dev.architectury:architectury:${property("architectury_version")}") { isTransitive = false }
    modImplementation("com.cobblemon:mod:1.3.1+1.19.2-SNAPSHOT") { isTransitive = false }
}
