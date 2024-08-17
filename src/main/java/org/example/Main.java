package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom=new Bedroom("Yatak odasi",new Wall("kuzey"),new Wall("güney"),
                new Wall("dogu"),new Wall("bati"),new Ceiling(1, PaintColor.GREEN),
                new Bed("cift",2,2,2,2),new Lamp(LampType.JAVA,true,4),
                new Wardrobe(2,3,2),new Carpet(2,2,PaintColor.WHITE));
        System.out.println(bedroom.toString());
    }
}