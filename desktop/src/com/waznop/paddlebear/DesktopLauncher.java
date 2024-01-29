package com.waznop.paddlebear;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.waznop.paddlebear.PBGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("PaddleBear");
		config.setWindowSizeLimits(405, 702, 405, 702);
		config.setResizable(false);
		new Lwjgl3Application(new PBGame(), config);
	}
}
