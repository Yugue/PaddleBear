package com.pllanet.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.pllanet.gameworld.GameRenderer;
import com.pllanet.gameworld.GameWorld;
import com.pllanet.paddlebeargame.Constants;
import com.pllanet.paddlebeargame.InputHandler;

/**
 * Created by Waznop on 2016-08-17.
 */
public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;
    private float runTime;
    private OrthographicCamera cam;

    public GameScreen() {
        cam = new OrthographicCamera();
        cam.setToOrtho(true, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        world = new GameWorld();
        renderer = new GameRenderer(world, cam);
        runTime = 0;

        Gdx.input.setInputProcessor(new InputHandler(world, cam));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        if (delta > .15f) {
            delta = .15f;
        }
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
