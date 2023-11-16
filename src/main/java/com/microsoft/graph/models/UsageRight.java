package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageRight extends Entity implements Parsable {
    /**
     * Instantiates a new UsageRight and sets the default values.
     */
    public UsageRight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UsageRight
     */
    @jakarta.annotation.Nonnull
    public static UsageRight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageRight();
    }
    /**
     * Gets the catalogId property value. Product id corresponding to the usage right.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCatalogId() {
        return this.backingStore.get("catalogId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalogId", (n) -> { this.setCatalogId(n.getStringValue()); });
        deserializerMap.put("serviceIdentifier", (n) -> { this.setServiceIdentifier(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(UsageRightState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the serviceIdentifier property value. Identifier of the service corresponding to the usage right.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceIdentifier() {
        return this.backingStore.get("serviceIdentifier");
    }
    /**
     * Gets the state property value. The state property
     * @return a UsageRightState
     */
    @jakarta.annotation.Nullable
    public UsageRightState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("catalogId", this.getCatalogId());
        writer.writeStringValue("serviceIdentifier", this.getServiceIdentifier());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the catalogId property value. Product id corresponding to the usage right.
     * @param value Value to set for the catalogId property.
     */
    public void setCatalogId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogId", value);
    }
    /**
     * Sets the serviceIdentifier property value. Identifier of the service corresponding to the usage right.
     * @param value Value to set for the serviceIdentifier property.
     */
    public void setServiceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceIdentifier", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final UsageRightState value) {
        this.backingStore.set("state", value);
    }
}
