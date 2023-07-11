package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcBulkAction extends Entity implements Parsable {
    /**
     * The actionSummary property
     */
    private CloudPcBulkActionSummary actionSummary;
    /**
     * The cloudPcIds property
     */
    private java.util.List<String> cloudPcIds;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * Instantiates a new cloudPcBulkAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcBulkAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcBulkAction
     */
    @javax.annotation.Nonnull
    public static CloudPcBulkAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.cloudPcBulkPowerOff": return new CloudPcBulkPowerOff();
                case "#microsoft.graph.cloudPcBulkPowerOn": return new CloudPcBulkPowerOn();
            }
        }
        return new CloudPcBulkAction();
    }
    /**
     * Gets the actionSummary property value. The actionSummary property
     * @return a cloudPcBulkActionSummary
     */
    @javax.annotation.Nullable
    public CloudPcBulkActionSummary getActionSummary() {
        return this.actionSummary;
    }
    /**
     * Gets the cloudPcIds property value. The cloudPcIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCloudPcIds() {
        return this.cloudPcIds;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionSummary(@javax.annotation.Nullable final CloudPcBulkActionSummary value) {
        this.actionSummary = value;
    }
    /**
     * Sets the cloudPcIds property value. The cloudPcIds property
     * @param value Value to set for the cloudPcIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPcIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.cloudPcIds = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
