package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemAddress extends ItemFacet implements Parsable {
    /**
     * Instantiates a new {@link ItemAddress} and sets the default values.
     */
    public ItemAddress() {
        super();
        this.setOdataType("#microsoft.graph.itemAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemAddress}
     */
    @jakarta.annotation.Nonnull
    public static ItemAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemAddress();
    }
    /**
     * Gets the detail property value. Details about the address itself.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getDetail() {
        return this.backingStore.get("detail");
    }
    /**
     * Gets the displayName property value. Friendly name the user has assigned to this address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("geoCoordinates", (n) -> { this.setGeoCoordinates(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the geoCoordinates property value. The geocoordinates of the address.
     * @return a {@link GeoCoordinates}
     */
    @jakarta.annotation.Nullable
    public GeoCoordinates getGeoCoordinates() {
        return this.backingStore.get("geoCoordinates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
    }
    /**
     * Sets the detail property value. Details about the address itself.
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("detail", value);
    }
    /**
     * Sets the displayName property value. Friendly name the user has assigned to this address.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the geoCoordinates property value. The geocoordinates of the address.
     * @param value Value to set for the geoCoordinates property.
     */
    public void setGeoCoordinates(@jakarta.annotation.Nullable final GeoCoordinates value) {
        this.backingStore.set("geoCoordinates", value);
    }
}
