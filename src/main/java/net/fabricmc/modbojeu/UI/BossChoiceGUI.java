package net.fabricmc.modbojeu.UI;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.fabricmc.modbojeu.ModBojeu;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BossChoiceGUI extends LightweightGuiDescription {
    public BossChoiceGUI(){
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300,200);
        WLabel label = new WLabel("Chose your boss");
        root.add(label,6,0);
        WButton amalaric = new WButton(Text.of("AMALAKIN"));
        WSprite amaric_icon = new WSprite(new Identifier("modbojeu","widget/amalakin_icon.png"));
        root.add(amalaric,0,10,5,2);
        root.add(amaric_icon,0,2,5,8);
        amalaric.setOnClick(() -> {

        });
        System.out.println(root.getHeight());
    }

}
