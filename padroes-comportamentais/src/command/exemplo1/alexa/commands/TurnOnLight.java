package command.exemplo1.alexa.commands;

import command.exemplo1.alexa.lights.GenericLight;

public class TurnOnLight implements Command{

    GenericLight genericLight;

    public TurnOnLight(GenericLight genericLight) {

        this.genericLight = genericLight;
    }

    @Override
    public void execute() {

        genericLight.turnOn();
    }
}
