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

	compileOnly("net.civmc.civmodcore:paper:2.0.0-SNAPSHOT:dev-all")
	compileOnly("net.civmc.namelayer:paper:3.0.0-SNAPSHOT:dev")

	implementation("com.github.seancfoley:ipaddress:2.0.2")
	implementation("org.jsoup:jsoup:1.13.1")
}
