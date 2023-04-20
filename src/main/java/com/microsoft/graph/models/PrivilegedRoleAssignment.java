package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedRoleAssignment extends Entity implements Parsable {
    /** The UTC DateTime when the temporary privileged role assignment will be expired. For permanent role assignment, the value is null. */
    private OffsetDateTime expirationDateTime;
    /** true if the role assignment is activated. false if the role assignment is deactivated. */
    private Boolean isElevated;
    /** Result message set by the service. */
    private String resultMessage;
    /** Role identifier. In GUID string format. */
    private String roleId;
    /** Read-only. Nullable. The associated role information. */
    private PrivilegedRole roleInfo;
    /** User identifier. In GUID string format. */
    private String userId;
    /**
     * Instantiates a new privilegedRoleAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedRoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRoleAssignment
     */
    @javax.annotation.Nonnull
    public static PrivilegedRoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleAssignment();
    }
    /**
     * Gets the expirationDateTime property value. The UTC DateTime when the temporary privileged role assignment will be expired. For permanent role assignment, the value is null.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isElevated", (n) -> { this.setIsElevated(n.getBooleanValue()); });
        deserializerMap.put("resultMessage", (n) -> { this.setResultMessage(n.getStringValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleInfo", (n) -> { this.setRoleInfo(n.getObjectValue(PrivilegedRole::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isElevated property value. true if the role assignment is activated. false if the role assignment is deactivated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsElevated() {
        return this.isElevated;
    }
    /**
     * Gets the resultMessage property value. Result message set by the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResultMessage() {
        return this.resultMessage;
    }
    /**
     * Gets the roleId property value. Role identifier. In GUID string format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleInfo property value. Read-only. Nullable. The associated role information.
     * @return a privilegedRole
     */
    @javax.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this.roleInfo;
    }
    /**
     * Gets the userId property value. User identifier. In GUID string format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeBooleanValue("isElevated", this.getIsElevated());
        writer.writeStringValue("resultMessage", this.getResultMessage());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeObjectValue("roleInfo", this.getRoleInfo());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the expirationDateTime property value. The UTC DateTime when the temporary privileged role assignment will be expired. For permanent role assignment, the value is null.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the isElevated property value. true if the role assignment is activated. false if the role assignment is deactivated.
     * @param value Value to set for the isElevated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsElevated(@javax.annotation.Nullable final Boolean value) {
        this.isElevated = value;
    }
    /**
     * Sets the resultMessage property value. Result message set by the service.
     * @param value Value to set for the resultMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultMessage(@javax.annotation.Nullable final String value) {
        this.resultMessage = value;
    }
    /**
     * Sets the roleId property value. Role identifier. In GUID string format.
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleInfo property value. Read-only. Nullable. The associated role information.
     * @param value Value to set for the roleInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleInfo(@javax.annotation.Nullable final PrivilegedRole value) {
        this.roleInfo = value;
    }
    /**
     * Sets the userId property value. User identifier. In GUID string format.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
