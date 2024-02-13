package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link PrivilegedRoleAssignment} and sets the default values.
     */
    public PrivilegedRoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedRoleAssignment}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedRoleAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleAssignment();
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsElevated() {
        return this.backingStore.get("isElevated");
    }
    /**
     * Gets the resultMessage property value. The resultMessage property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResultMessage() {
        return this.backingStore.get("resultMessage");
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.backingStore.get("roleId");
    }
    /**
     * Gets the roleInfo property value. The roleInfo property
     * @return a {@link PrivilegedRole}
     */
    @jakarta.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this.backingStore.get("roleInfo");
    }
    /**
     * Gets the userId property value. The userId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
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
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the isElevated property value. The isElevated property
     * @param value Value to set for the isElevated property.
     */
    public void setIsElevated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isElevated", value);
    }
    /**
     * Sets the resultMessage property value. The resultMessage property
     * @param value Value to set for the resultMessage property.
     */
    public void setResultMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resultMessage", value);
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleId", value);
    }
    /**
     * Sets the roleInfo property value. The roleInfo property
     * @param value Value to set for the roleInfo property.
     */
    public void setRoleInfo(@jakarta.annotation.Nullable final PrivilegedRole value) {
        this.backingStore.set("roleInfo", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
