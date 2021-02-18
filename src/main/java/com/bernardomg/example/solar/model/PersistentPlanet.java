
package com.bernardomg.example.solar.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import com.google.common.base.MoreObjects;

@Node("Planet")
public class PersistentPlanet implements Planet {

    @Id
    private String               name;

    private Long                 position;

    @Relationship(type = "SATELLITE", direction = Direction.OUTGOING)
    private List<PersistentMoon> satellites = new ArrayList<>();

    public PersistentPlanet() {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getPosition() {
        return position;
    }

    @Override
    public List<PersistentMoon> getSatellites() {
        return satellites;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPosition(final Long position) {
        this.position = position;
    }

    public void setSatellites(final List<PersistentMoon> satellites) {
        this.satellites = satellites;
    }

    @Override
    public final String toString() {
        return MoreObjects.toStringHelper(this).add("name", name)
                .add("satellites", satellites).toString();
    }

}
