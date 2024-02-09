package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkDeviceHealth extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamworkDeviceHealth} and sets the default values.
     */
    public TeamworkDeviceHealth() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkDeviceHealth}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDeviceHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceHealth();
    }
    /**
     * Gets the connection property value. The connection property
     * @return a {@link TeamworkConnection}
     */
    @jakarta.annotation.Nullable
    public TeamworkConnection getConnection() {
        return this.backingStore.get("connection");
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device health document.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device health document was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connection", (n) -> { this.setConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("hardwareHealth", (n) -> { this.setHardwareHealth(n.getObjectValue(TeamworkHardwareHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("loginStatus", (n) -> { this.setLoginStatus(n.getObjectValue(TeamworkLoginStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("peripheralsHealth", (n) -> { this.setPeripheralsHealth(n.getObjectValue(TeamworkPeripheralsHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("softwareUpdateHealth", (n) -> { this.setSoftwareUpdateHealth(n.getObjectValue(TeamworkSoftwareUpdateHealth::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hardwareHealth property value. Health details about the device hardware.
     * @return a {@link TeamworkHardwareHealth}
     */
    @jakarta.annotation.Nullable
    public TeamworkHardwareHealth getHardwareHealth() {
        return this.backingStore.get("hardwareHealth");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device health details.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device health detail was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the loginStatus property value. The login status of Microsoft Teams, Skype for Business, and Exchange.
     * @return a {@link TeamworkLoginStatus}
     */
    @jakarta.annotation.Nullable
    public TeamworkLoginStatus getLoginStatus() {
        return this.backingStore.get("loginStatus");
    }
    /**
     * Gets the peripheralsHealth property value. Health details about all peripherals (for example, speaker and microphone) attached to a device.
     * @return a {@link TeamworkPeripheralsHealth}
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralsHealth getPeripheralsHealth() {
        return this.backingStore.get("peripheralsHealth");
    }
    /**
     * Gets the softwareUpdateHealth property value. Software updates available for the device.
     * @return a {@link TeamworkSoftwareUpdateHealth}
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateHealth getSoftwareUpdateHealth() {
        return this.backingStore.get("softwareUpdateHealth");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connection", this.getConnection());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("hardwareHealth", this.getHardwareHealth());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("loginStatus", this.getLoginStatus());
        writer.writeObjectValue("peripheralsHealth", this.getPeripheralsHealth());
        writer.writeObjectValue("softwareUpdateHealth", this.getSoftwareUpdateHealth());
    }
    /**
     * Sets the connection property value. The connection property
     * @param value Value to set for the connection property.
     */
    public void setConnection(@jakarta.annotation.Nullable final TeamworkConnection value) {
        this.backingStore.set("connection", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device health document.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device health document was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the hardwareHealth property value. Health details about the device hardware.
     * @param value Value to set for the hardwareHealth property.
     */
    public void setHardwareHealth(@jakarta.annotation.Nullable final TeamworkHardwareHealth value) {
        this.backingStore.set("hardwareHealth", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device health details.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device health detail was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the loginStatus property value. The login status of Microsoft Teams, Skype for Business, and Exchange.
     * @param value Value to set for the loginStatus property.
     */
    public void setLoginStatus(@jakarta.annotation.Nullable final TeamworkLoginStatus value) {
        this.backingStore.set("loginStatus", value);
    }
    /**
     * Sets the peripheralsHealth property value. Health details about all peripherals (for example, speaker and microphone) attached to a device.
     * @param value Value to set for the peripheralsHealth property.
     */
    public void setPeripheralsHealth(@jakarta.annotation.Nullable final TeamworkPeripheralsHealth value) {
        this.backingStore.set("peripheralsHealth", value);
    }
    /**
     * Sets the softwareUpdateHealth property value. Software updates available for the device.
     * @param value Value to set for the softwareUpdateHealth property.
     */
    public void setSoftwareUpdateHealth(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateHealth value) {
        this.backingStore.set("softwareUpdateHealth", value);
    }
}
