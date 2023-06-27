package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDeviceHealth extends Entity implements Parsable {
    /**
     * The connection property
     */
    private TeamworkConnection connection;
    /**
     * Identity of the user who created the device health document.
     */
    private IdentitySet createdBy;
    /**
     * The UTC date and time when the device health document was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Health details about the device hardware.
     */
    private TeamworkHardwareHealth hardwareHealth;
    /**
     * Identity of the user who last modified the device health details.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The UTC date and time when the device health detail was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The login status of Microsoft Teams, Skype for Business, and Exchange.
     */
    private TeamworkLoginStatus loginStatus;
    /**
     * Health details about all peripherals (for example, speaker and microphone) attached to a device.
     */
    private TeamworkPeripheralsHealth peripheralsHealth;
    /**
     * Software updates available for the device.
     */
    private TeamworkSoftwareUpdateHealth softwareUpdateHealth;
    /**
     * Instantiates a new TeamworkDeviceHealth and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkDeviceHealth() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkDeviceHealth
     */
    @javax.annotation.Nonnull
    public static TeamworkDeviceHealth createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceHealth();
    }
    /**
     * Gets the connection property value. The connection property
     * @return a TeamworkConnection
     */
    @javax.annotation.Nullable
    public TeamworkConnection getConnection() {
        return this.connection;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device health document.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device health document was created.
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
     * @return a teamworkHardwareHealth
     */
    @javax.annotation.Nullable
    public TeamworkHardwareHealth getHardwareHealth() {
        return this.hardwareHealth;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device health details.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device health detail was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the loginStatus property value. The login status of Microsoft Teams, Skype for Business, and Exchange.
     * @return a teamworkLoginStatus
     */
    @javax.annotation.Nullable
    public TeamworkLoginStatus getLoginStatus() {
        return this.loginStatus;
    }
    /**
     * Gets the peripheralsHealth property value. Health details about all peripherals (for example, speaker and microphone) attached to a device.
     * @return a teamworkPeripheralsHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralsHealth getPeripheralsHealth() {
        return this.peripheralsHealth;
    }
    /**
     * Gets the softwareUpdateHealth property value. Software updates available for the device.
     * @return a teamworkSoftwareUpdateHealth
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateHealth getSoftwareUpdateHealth() {
        return this.softwareUpdateHealth;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnection(@javax.annotation.Nullable final TeamworkConnection value) {
        this.connection = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device health document.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device health document was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the hardwareHealth property value. Health details about the device hardware.
     * @param value Value to set for the hardwareHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHardwareHealth(@javax.annotation.Nullable final TeamworkHardwareHealth value) {
        this.hardwareHealth = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device health details.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device health detail was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the loginStatus property value. The login status of Microsoft Teams, Skype for Business, and Exchange.
     * @param value Value to set for the loginStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginStatus(@javax.annotation.Nullable final TeamworkLoginStatus value) {
        this.loginStatus = value;
    }
    /**
     * Sets the peripheralsHealth property value. Health details about all peripherals (for example, speaker and microphone) attached to a device.
     * @param value Value to set for the peripheralsHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeripheralsHealth(@javax.annotation.Nullable final TeamworkPeripheralsHealth value) {
        this.peripheralsHealth = value;
    }
    /**
     * Sets the softwareUpdateHealth property value. Software updates available for the device.
     * @param value Value to set for the softwareUpdateHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateHealth(@javax.annotation.Nullable final TeamworkSoftwareUpdateHealth value) {
        this.softwareUpdateHealth = value;
    }
}
