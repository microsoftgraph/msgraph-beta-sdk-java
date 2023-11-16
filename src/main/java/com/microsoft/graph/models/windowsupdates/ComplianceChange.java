package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplianceChange extends Entity implements Parsable {
    /**
     * Instantiates a new ComplianceChange and sets the default values.
     */
    public ComplianceChange() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ComplianceChange
     */
    @jakarta.annotation.Nonnull
    public static ComplianceChange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.contentApproval": return new ContentApproval();
            }
        }
        return new ComplianceChange();
    }
    /**
     * Gets the createdDateTime property value. The date and time when a compliance change was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isRevoked", (n) -> { this.setIsRevoked(n.getBooleanValue()); });
        deserializerMap.put("revokedDateTime", (n) -> { this.setRevokedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("updatePolicy", (n) -> { this.setUpdatePolicy(n.getObjectValue(UpdatePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isRevoked property value. True indicates that a compliance change is revoked, preventing further application. Revoking a compliance change is a final action.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRevoked() {
        return this.backingStore.get("isRevoked");
    }
    /**
     * Gets the revokedDateTime property value. The date and time when the compliance change was revoked.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRevokedDateTime() {
        return this.backingStore.get("revokedDateTime");
    }
    /**
     * Gets the updatePolicy property value. The policy this compliance change is a member of.
     * @return a UpdatePolicy
     */
    @jakarta.annotation.Nullable
    public UpdatePolicy getUpdatePolicy() {
        return this.backingStore.get("updatePolicy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isRevoked", this.getIsRevoked());
        writer.writeOffsetDateTimeValue("revokedDateTime", this.getRevokedDateTime());
        writer.writeObjectValue("updatePolicy", this.getUpdatePolicy());
    }
    /**
     * Sets the createdDateTime property value. The date and time when a compliance change was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the isRevoked property value. True indicates that a compliance change is revoked, preventing further application. Revoking a compliance change is a final action.
     * @param value Value to set for the isRevoked property.
     */
    public void setIsRevoked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRevoked", value);
    }
    /**
     * Sets the revokedDateTime property value. The date and time when the compliance change was revoked.
     * @param value Value to set for the revokedDateTime property.
     */
    public void setRevokedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("revokedDateTime", value);
    }
    /**
     * Sets the updatePolicy property value. The policy this compliance change is a member of.
     * @param value Value to set for the updatePolicy property.
     */
    public void setUpdatePolicy(@jakarta.annotation.Nullable final UpdatePolicy value) {
        this.backingStore.set("updatePolicy", value);
    }
}
