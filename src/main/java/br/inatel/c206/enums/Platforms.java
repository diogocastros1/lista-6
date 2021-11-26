package br.inatel.c206.enums;

public enum Platforms {
    X360("X360"),
    PS4("PS4"),
    PS3("PS3"),
    P2600("2600"),
    PC("PC"),
    XB("XB"),
    Wii("Wii"),
    NES("NES"),
    GB("GB"),
    DS("DS"),
    SNES("SNES"),
    GBA("GBA"),
    P3DS("3DS"),
    N64("N64"),
    PS2("PS2"),
    PS("PS"),
    PSP("PSP");

    private String descricao;

    Platforms(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
