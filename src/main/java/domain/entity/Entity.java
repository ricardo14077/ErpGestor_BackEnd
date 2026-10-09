package domain.entity;


import java.util.UUID;

public abstract class Entity {

    private UUID id;

    protected Entity() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}