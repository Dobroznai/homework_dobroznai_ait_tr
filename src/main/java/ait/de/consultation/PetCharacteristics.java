package ait.de.consultation;

public enum PetCharacteristics {

    FRIENDLY ("дружелюбный"),
    INDEPENDENT ("независимый"),
    LOUD ("шумный"),
    QUIET ("спокойный"),
    CRAZY("активный");


    private final  String description;

    PetCharacteristics(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
