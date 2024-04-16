package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutboundProvisioningFlowSet extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OutboundProvisioningFlowSet} and sets the default values.
     */
    public OutboundProvisioningFlowSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutboundProvisioningFlowSet}
     */
    @jakarta.annotation.Nonnull
    public static OutboundProvisioningFlowSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutboundProvisioningFlowSet();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the flowSet was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The display name of the flowSet provided by the caller.
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getObjectValue(Filter::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("provisioningFlows", (n) -> { this.setProvisioningFlows(n.getCollectionOfObjectValues(ProvisioningFlow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. The collection of provisioning filters applicable to all the flows under the given flowSet.
     * @return a {@link Filter}
     */
    @jakarta.annotation.Nullable
    public Filter getFilter() {
        return this.backingStore.get("filter");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the flowSet was most recently changed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the provisioningFlows property value. A flow that provisions relevant records of a given entity type in the Microsoft 365 tenant.
     * @return a {@link java.util.List<ProvisioningFlow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProvisioningFlow> getProvisioningFlows() {
        return this.backingStore.get("provisioningFlows");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("filter", this.getFilter());
        writer.writeCollectionOfObjectValues("provisioningFlows", this.getProvisioningFlows());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the flowSet was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The display name of the flowSet provided by the caller.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the filter property value. The collection of provisioning filters applicable to all the flows under the given flowSet.
     * @param value Value to set for the filter property.
     */
    public void setFilter(@jakarta.annotation.Nullable final Filter value) {
        this.backingStore.set("filter", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the flowSet was most recently changed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the provisioningFlows property value. A flow that provisions relevant records of a given entity type in the Microsoft 365 tenant.
     * @param value Value to set for the provisioningFlows property.
     */
    public void setProvisioningFlows(@jakarta.annotation.Nullable final java.util.List<ProvisioningFlow> value) {
        this.backingStore.set("provisioningFlows", value);
    }
}
