package command.exemplo1.alexa.commands;

import command.exemplo1.alexa.lights.GenericLight;

public class TurnOffLight implements Command{

    private GenericLight genericLight;

    public TurnOffLight(GenericLight genericLight) {

        this.genericLight = genericLight;
    }

    @Override
    public void execute() {

        genericLight.turnOff();
    }
}
