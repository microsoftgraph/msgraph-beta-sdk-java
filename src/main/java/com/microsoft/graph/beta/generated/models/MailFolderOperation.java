package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailFolderOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MailFolderOperation} and sets the default values.
     */
    public MailFolderOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailFolderOperation}
     */
    @jakarta.annotation.Nonnull
    public static MailFolderOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.updateAllMessagesReadStateOperation": return new UpdateAllMessagesReadStateOperation();
            }
        }
        return new MailFolderOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MailFolderOperationStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceLocation property value. The location of the long-running operation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceLocation() {
        return this.backingStore.get("resourceLocation");
    }
    /**
     * Gets the status property value. The status of the long-running operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
     * @return a {@link MailFolderOperationStatus}
     */
    @jakarta.annotation.Nullable
    public MailFolderOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the resourceLocation property value. The location of the long-running operation.
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceLocation", value);
    }
    /**
     * Sets the status property value. The status of the long-running operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final MailFolderOperationStatus value) {
        this.backingStore.set("status", value);
    }
}
