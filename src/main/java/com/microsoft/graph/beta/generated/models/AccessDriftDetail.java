package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessDriftDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessDriftDetail} and sets the default values.
     */
    public AccessDriftDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessDriftDetail}
     */
    @jakarta.annotation.Nonnull
    public static AccessDriftDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.entraAccessDriftDetail": return new EntraAccessDriftDetail();
            }
        }
        return new AccessDriftDetail();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the driftSource property value. The driftSource property
     * @return a {@link AccessDriftSource}
     */
    @jakarta.annotation.Nullable
    public AccessDriftSource getDriftSource() {
        return this.backingStore.get("driftSource");
    }
    /**
     * Gets the driftType property value. The driftType property
     * @return a {@link AccessDriftType}
     */
    @jakarta.annotation.Nullable
    public AccessDriftType getDriftType() {
        return this.backingStore.get("driftType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("driftSource", (n) -> { this.setDriftSource(n.getEnumValue(AccessDriftSource::forValue)); });
        deserializerMap.put("driftType", (n) -> { this.setDriftType(n.getEnumValue(AccessDriftType::forValue)); });
        deserializerMap.put("identities", (n) -> { this.setIdentities(n.getCollectionOfObjectValues(DriftIdentityInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(DriftResourceInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identities property value. The identities property
     * @return a {@link java.util.List<DriftIdentityInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriftIdentityInfo> getIdentities() {
        return this.backingStore.get("identities");
    }
    /**
     * Gets the resource property value. The resource property
     * @return a {@link DriftResourceInfo}
     */
    @jakarta.annotation.Nullable
    public DriftResourceInfo getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("driftSource", this.getDriftSource());
        writer.writeEnumValue("driftType", this.getDriftType());
        writer.writeCollectionOfObjectValues("identities", this.getIdentities());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the driftSource property value. The driftSource property
     * @param value Value to set for the driftSource property.
     */
    public void setDriftSource(@jakarta.annotation.Nullable final AccessDriftSource value) {
        this.backingStore.set("driftSource", value);
    }
    /**
     * Sets the driftType property value. The driftType property
     * @param value Value to set for the driftType property.
     */
    public void setDriftType(@jakarta.annotation.Nullable final AccessDriftType value) {
        this.backingStore.set("driftType", value);
    }
    /**
     * Sets the identities property value. The identities property
     * @param value Value to set for the identities property.
     */
    public void setIdentities(@jakarta.annotation.Nullable final java.util.List<DriftIdentityInfo> value) {
        this.backingStore.set("identities", value);
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final DriftResourceInfo value) {
        this.backingStore.set("resource", value);
    }
}
