package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Building extends Place implements Parsable {
    /**
     * Instantiates a new {@link Building} and sets the default values.
     */
    public Building() {
        super();
        this.setOdataType("#microsoft.graph.building");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Building}
     */
    @jakarta.annotation.Nonnull
    public static Building createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Building();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("hasWiFi", (n) -> { this.setHasWiFi(n.getBooleanValue()); });
        deserializerMap.put("map", (n) -> { this.setMap(n.getObjectValue(BuildingMap::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceLinks", (n) -> { this.setResourceLinks(n.getCollectionOfObjectValues(ResourceLink::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasWiFi property value. Indicates whether the building has a wireless network.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasWiFi() {
        return this.backingStore.get("hasWiFi");
    }
    /**
     * Gets the map property value. Map file associated with a building in Places. This object is the IMDF-format representation of building.geojson.
     * @return a {@link BuildingMap}
     */
    @jakarta.annotation.Nullable
    public BuildingMap getMap() {
        return this.backingStore.get("map");
    }
    /**
     * Gets the resourceLinks property value. A set of links to external resources that are associated with the building. Inherited from place.
     * @return a {@link java.util.List<ResourceLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceLink> getResourceLinks() {
        return this.backingStore.get("resourceLinks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("hasWiFi", this.getHasWiFi());
        writer.writeObjectValue("map", this.getMap());
        writer.writeCollectionOfObjectValues("resourceLinks", this.getResourceLinks());
    }
    /**
     * Sets the hasWiFi property value. Indicates whether the building has a wireless network.
     * @param value Value to set for the hasWiFi property.
     */
    public void setHasWiFi(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasWiFi", value);
    }
    /**
     * Sets the map property value. Map file associated with a building in Places. This object is the IMDF-format representation of building.geojson.
     * @param value Value to set for the map property.
     */
    public void setMap(@jakarta.annotation.Nullable final BuildingMap value) {
        this.backingStore.set("map", value);
    }
    /**
     * Sets the resourceLinks property value. A set of links to external resources that are associated with the building. Inherited from place.
     * @param value Value to set for the resourceLinks property.
     */
    public void setResourceLinks(@jakarta.annotation.Nullable final java.util.List<ResourceLink> value) {
        this.backingStore.set("resourceLinks", value);
    }
}
