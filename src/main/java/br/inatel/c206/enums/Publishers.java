package br.inatel.c206.enums;

public enum Publishers {
    ACTIVISION("Activision"),
    ATARI("Atari"),
    BETHESDA("Bethesda Softworks"),
    ELETRONIC("Electronic Arts"),
    MICROSOFT("Microsoft Game Studios"),
    NITENDO("Nintendo"),
    SEGA("Sega"),
    SONY("Sony Computer Entertainment"),
    SQUARE("SquareSoft"),
    TAKE("Take-Two Interactive"),
    UBISOFT("Ubisoft");

    private String descricao;

    Publishers(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
