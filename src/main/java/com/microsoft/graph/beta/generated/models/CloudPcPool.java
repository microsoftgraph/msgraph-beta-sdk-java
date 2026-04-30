package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcPool extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcPool} and sets the default values.
     */
    public CloudPcPool() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcPool}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcPool createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.cloudPcAgentPool": return new CloudPcAgentPool();
            }
        }
        return new CloudPcPool();
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a {@link java.util.List<CloudPcPoolAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcPoolAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the capabilities property value. The capabilities property
     * @return a {@link CloudPcPoolCapabilityConfiguration}
     */
    @jakarta.annotation.Nullable
    public CloudPcPoolCapabilityConfiguration getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * Gets the cloudPcConfiguration property value. The cloudPcConfiguration property
     * @return a {@link CloudPcConfiguration}
     */
    @jakarta.annotation.Nullable
    public CloudPcConfiguration getCloudPcConfiguration() {
        return this.backingStore.get("cloudPcConfiguration");
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
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
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
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(CloudPcPoolAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(CloudPcPoolCapabilityConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcConfiguration", (n) -> { this.setCloudPcConfiguration(n.getObjectValue(CloudPcConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("networkConfiguration", (n) -> { this.setNetworkConfiguration(n.getObjectValue(CloudPcNetworkConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the networkConfiguration property value. The networkConfiguration property
     * @return a {@link CloudPcNetworkConfiguration}
     */
    @jakarta.annotation.Nullable
    public CloudPcNetworkConfiguration getNetworkConfiguration() {
        return this.backingStore.get("networkConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeObjectValue("capabilities", this.getCapabilities());
        writer.writeObjectValue("cloudPcConfiguration", this.getCloudPcConfiguration());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("networkConfiguration", this.getNetworkConfiguration());
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<CloudPcPoolAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final CloudPcPoolCapabilityConfiguration value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the cloudPcConfiguration property value. The cloudPcConfiguration property
     * @param value Value to set for the cloudPcConfiguration property.
     */
    public void setCloudPcConfiguration(@jakarta.annotation.Nullable final CloudPcConfiguration value) {
        this.backingStore.set("cloudPcConfiguration", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the networkConfiguration property value. The networkConfiguration property
     * @param value Value to set for the networkConfiguration property.
     */
    public void setNetworkConfiguration(@jakarta.annotation.Nullable final CloudPcNetworkConfiguration value) {
        this.backingStore.set("networkConfiguration", value);
    }
}
