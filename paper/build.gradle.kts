plugins {
	`java-library`
	id("net.civmc.civgradle.plugin")
	id("io.papermc.paperweight.userdev") version "1.3.1"
	id("com.github.johnrengelman.shadow") version "7.1.0"
}

civGradle {
	paper {
		pluginName = "BanStick"
	}
}

dependencies {
	paperDevBundle("1.19.4-R0.1-SNAPSHOT")

	compileOnly("net.civmc.civmodcore:civmodcore-paper:2.3.5:dev-all")
	compileOnly("net.civmc.namelayer:namelayer-paper:3.0.3:dev")

    implementation("com.github.seancfoley:ipaddress:2.0.2")
    implementation("org.jsoup:jsoup:1.13.1")
}
