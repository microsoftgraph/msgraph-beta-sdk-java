package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ComplianceChange extends Entity implements Parsable {
    /** The date and time when a compliance change was created. */
    private OffsetDateTime createdDateTime;
    /** True indicates that a compliance change is revoked, preventing further application. Revoking a compliance change is a final action. */
    private Boolean isRevoked;
    /** The date and time when the compliance change was revoked. */
    private OffsetDateTime revokedDateTime;
    /** The policy this compliance change is a member of. */
    private UpdatePolicy updatePolicy;
    /**
     * Instantiates a new complianceChange and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ComplianceChange() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a complianceChange
     */
    @javax.annotation.Nonnull
    public static ComplianceChange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRevoked() {
        return this.isRevoked;
    }
    /**
     * Gets the revokedDateTime property value. The date and time when the compliance change was revoked.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRevokedDateTime() {
        return this.revokedDateTime;
    }
    /**
     * Gets the updatePolicy property value. The policy this compliance change is a member of.
     * @return a updatePolicy
     */
    @javax.annotation.Nullable
    public UpdatePolicy getUpdatePolicy() {
        return this.updatePolicy;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isRevoked", this.getIsRevoked());
        writer.writeOffsetDateTimeValue("revokedDateTime", this.getRevokedDateTime());
        writer.writeObjectValue("updatePolicy", this.getUpdatePolicy());
    }
    /**
     * Sets the createdDateTime property value. The date and time when a compliance change was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the isRevoked property value. True indicates that a compliance change is revoked, preventing further application. Revoking a compliance change is a final action.
     * @param value Value to set for the isRevoked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRevoked(@javax.annotation.Nullable final Boolean value) {
        this.isRevoked = value;
    }
    /**
     * Sets the revokedDateTime property value. The date and time when the compliance change was revoked.
     * @param value Value to set for the revokedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRevokedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.revokedDateTime = value;
    }
    /**
     * Sets the updatePolicy property value. The policy this compliance change is a member of.
     * @param value Value to set for the updatePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatePolicy(@javax.annotation.Nullable final UpdatePolicy value) {
        this.updatePolicy = value;
    }
}
