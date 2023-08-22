package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedRoleAssignment extends Entity implements Parsable {
    /**
     * The expirationDateTime property
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The isElevated property
     */
    private Boolean isElevated;
    /**
     * The resultMessage property
     */
    private String resultMessage;
    /**
     * The roleId property
     */
    private String roleId;
    /**
     * The roleInfo property
     */
    private PrivilegedRole roleInfo;
    /**
     * The userId property
     */
    private String userId;
    /**
     * Instantiates a new privilegedRoleAssignment and sets the default values.
     */
    public PrivilegedRoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRoleAssignment
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedRoleAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleAssignment();
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the isElevated property value. The isElevated property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsElevated() {
        return this.isElevated;
    }
    /**
     * Gets the resultMessage property value. The resultMessage property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResultMessage() {
        return this.resultMessage;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleInfo property value. The roleInfo property
     * @return a privilegedRole
     */
    @jakarta.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this.roleInfo;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the isElevated property value. The isElevated property
     * @param value Value to set for the isElevated property.
     */
    public void setIsElevated(@jakarta.annotation.Nullable final Boolean value) {
        this.isElevated = value;
    }
    /**
     * Sets the resultMessage property value. The resultMessage property
     * @param value Value to set for the resultMessage property.
     */
    public void setResultMessage(@jakarta.annotation.Nullable final String value) {
        this.resultMessage = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleInfo property value. The roleInfo property
     * @param value Value to set for the roleInfo property.
     */
    public void setRoleInfo(@jakarta.annotation.Nullable final PrivilegedRole value) {
        this.roleInfo = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
