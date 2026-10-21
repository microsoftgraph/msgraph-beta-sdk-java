package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessDriftSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessDriftSummary} and sets the default values.
     */
    public AccessDriftSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessDriftSummary}
     */
    @jakarta.annotation.Nonnull
    public static AccessDriftSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessDriftSummary();
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
     * Gets the details property value. The details property
     * @return a {@link java.util.List<AccessDriftDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessDriftDetail> getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * Gets the driftCounts property value. The driftCounts property
     * @return a {@link DriftCounts}
     */
    @jakarta.annotation.Nullable
    public DriftCounts getDriftCounts() {
        return this.backingStore.get("driftCounts");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(AccessDriftDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("driftCounts", (n) -> { this.setDriftCounts(n.getObjectValue(DriftCounts::createFromDiscriminatorValue)); });
        deserializerMap.put("driftSource", (n) -> { this.setDriftSource(n.getEnumValue(AccessDriftSource::forValue)); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(DriftResourceInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeObjectValue("driftCounts", this.getDriftCounts());
        writer.writeEnumValue("driftSource", this.getDriftSource());
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
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<AccessDriftDetail> value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the driftCounts property value. The driftCounts property
     * @param value Value to set for the driftCounts property.
     */
    public void setDriftCounts(@jakarta.annotation.Nullable final DriftCounts value) {
        this.backingStore.set("driftCounts", value);
    }
    /**
     * Sets the driftSource property value. The driftSource property
     * @param value Value to set for the driftSource property.
     */
    public void setDriftSource(@jakarta.annotation.Nullable final AccessDriftSource value) {
        this.backingStore.set("driftSource", value);
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final DriftResourceInfo value) {
        this.backingStore.set("resource", value);
    }
}
