package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes a supersedence relationship between two mobile apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppSupersedence extends MobileAppRelationship implements Parsable {
    /**
     * Instantiates a new {@link MobileAppSupersedence} and sets the default values.
     */
    public MobileAppSupersedence() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppSupersedence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppSupersedence}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppSupersedence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppSupersedence();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("supersededAppCount", (n) -> { this.setSupersededAppCount(n.getIntegerValue()); });
        deserializerMap.put("supersedenceType", (n) -> { this.setSupersedenceType(n.getEnumValue(MobileAppSupersedenceType::forValue)); });
        deserializerMap.put("supersedingAppCount", (n) -> { this.setSupersedingAppCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the supersededAppCount property value. The total number of apps directly or indirectly superseded by the child app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSupersededAppCount() {
        return this.backingStore.get("supersededAppCount");
    }
    /**
     * Gets the supersedenceType property value. Indicates the supersedence type associated with a relationship between two mobile apps.
     * @return a {@link MobileAppSupersedenceType}
     */
    @jakarta.annotation.Nullable
    public MobileAppSupersedenceType getSupersedenceType() {
        return this.backingStore.get("supersedenceType");
    }
    /**
     * Gets the supersedingAppCount property value. The total number of apps directly or indirectly superseding the parent app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSupersedingAppCount() {
        return this.backingStore.get("supersedingAppCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("supersededAppCount", this.getSupersededAppCount());
        writer.writeEnumValue("supersedenceType", this.getSupersedenceType());
        writer.writeIntegerValue("supersedingAppCount", this.getSupersedingAppCount());
    }
    /**
     * Sets the supersededAppCount property value. The total number of apps directly or indirectly superseded by the child app.
     * @param value Value to set for the supersededAppCount property.
     */
    public void setSupersededAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("supersededAppCount", value);
    }
    /**
     * Sets the supersedenceType property value. Indicates the supersedence type associated with a relationship between two mobile apps.
     * @param value Value to set for the supersedenceType property.
     */
    public void setSupersedenceType(@jakarta.annotation.Nullable final MobileAppSupersedenceType value) {
        this.backingStore.set("supersedenceType", value);
    }
    /**
     * Sets the supersedingAppCount property value. The total number of apps directly or indirectly superseding the parent app.
     * @param value Value to set for the supersedingAppCount property.
     */
    public void setSupersedingAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("supersedingAppCount", value);
    }
}
