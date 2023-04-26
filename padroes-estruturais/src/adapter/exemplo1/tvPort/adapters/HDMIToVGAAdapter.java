package adapter.exemplo1.tvPort.adapters;

import adapter.exemplo1.tvPort.intefaces.HDMI;
import adapter.exemplo1.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {

        this.vga = vga;
    }

    @Override
    public void setImage(String image) {

        System.out.println("Adaptating image HDMI to VGA...");
    }

    @Override
    public void setSound(String sound) {

        System.out.println("No sound...");
    }
}
