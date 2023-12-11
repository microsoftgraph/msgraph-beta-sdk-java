package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkAction extends Entity implements Parsable {
    /**
     * Instantiates a new CloudPcBulkAction and sets the default values.
     */
    public CloudPcBulkAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcBulkAction
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.cloudPcBulkPowerOff": return new CloudPcBulkPowerOff();
                case "#microsoft.graph.cloudPcBulkPowerOn": return new CloudPcBulkPowerOn();
                case "#microsoft.graph.cloudPcBulkReprovision": return new CloudPcBulkReprovision();
                case "#microsoft.graph.cloudPcBulkResize": return new CloudPcBulkResize();
                case "#microsoft.graph.cloudPcBulkRestart": return new CloudPcBulkRestart();
                case "#microsoft.graph.cloudPcBulkRestore": return new CloudPcBulkRestore();
                case "#microsoft.graph.cloudPcBulkTroubleshoot": return new CloudPcBulkTroubleshoot();
            }
        }
        return new CloudPcBulkAction();
    }
    /**
     * Gets the actionSummary property value. The actionSummary property
     * @return a CloudPcBulkActionSummary
     */
    @jakarta.annotation.Nullable
    public CloudPcBulkActionSummary getActionSummary() {
        return this.backingStore.get("actionSummary");
    }
    /**
     * Gets the cloudPcIds property value. The cloudPcIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCloudPcIds() {
        return this.backingStore.get("cloudPcIds");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionSummary", (n) -> { this.setActionSummary(n.getObjectValue(CloudPcBulkActionSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcIds", (n) -> { this.setCloudPcIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actionSummary", this.getActionSummary());
        writer.writeCollectionOfPrimitiveValues("cloudPcIds", this.getCloudPcIds());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the actionSummary property value. The actionSummary property
     * @param value Value to set for the actionSummary property.
     */
    public void setActionSummary(@jakarta.annotation.Nullable final CloudPcBulkActionSummary value) {
        this.backingStore.set("actionSummary", value);
    }
    /**
     * Sets the cloudPcIds property value. The cloudPcIds property
     * @param value Value to set for the cloudPcIds property.
     */
    public void setCloudPcIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("cloudPcIds", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
