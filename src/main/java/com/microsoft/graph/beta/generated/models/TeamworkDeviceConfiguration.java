package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkDeviceConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamworkDeviceConfiguration} and sets the default values.
     */
    public TeamworkDeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkDeviceConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceConfiguration();
    }
    /**
     * Gets the cameraConfiguration property value. The camera configuration. Applicable only for Microsoft Teams Rooms-enabled devices.
     * @return a {@link TeamworkCameraConfiguration}
     */
    @jakarta.annotation.Nullable
    public TeamworkCameraConfiguration getCameraConfiguration() {
        return this.backingStore.get("cameraConfiguration");
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device configuration document.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device configuration document was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayConfiguration property value. The display configuration.
     * @return a {@link TeamworkDisplayConfiguration}
     */
    @jakarta.annotation.Nullable
    public TeamworkDisplayConfiguration getDisplayConfiguration() {
        return this.backingStore.get("displayConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cameraConfiguration", (n) -> { this.setCameraConfiguration(n.getObjectValue(TeamworkCameraConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayConfiguration", (n) -> { this.setDisplayConfiguration(n.getObjectValue(TeamworkDisplayConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("hardwareConfiguration", (n) -> { this.setHardwareConfiguration(n.getObjectValue(TeamworkHardwareConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("microphoneConfiguration", (n) -> { this.setMicrophoneConfiguration(n.getObjectValue(TeamworkMicrophoneConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("softwareVersions", (n) -> { this.setSoftwareVersions(n.getObjectValue(TeamworkDeviceSoftwareVersions::createFromDiscriminatorValue)); });
        deserializerMap.put("speakerConfiguration", (n) -> { this.setSpeakerConfiguration(n.getObjectValue(TeamworkSpeakerConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("systemConfiguration", (n) -> { this.setSystemConfiguration(n.getObjectValue(TeamworkSystemConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsClientConfiguration", (n) -> { this.setTeamsClientConfiguration(n.getObjectValue(TeamworkTeamsClientConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hardwareConfiguration property value. The hardware configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a {@link TeamworkHardwareConfiguration}
     */
    @jakarta.annotation.Nullable
    public TeamworkHardwareConfiguration getHardwareConfiguration() {
        return this.backingStore.get("hardwareConfiguration");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device configuration.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device configuration was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the microphoneConfiguration property value. The microphone configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a {@link TeamworkMicrophoneConfiguration}
     */
    @jakarta.annotation.Nullable
    public TeamworkMicrophoneConfiguration getMicrophoneConfiguration() {
        return this.backingStore.get("microphoneConfiguration");
    }
    /**
     * Gets the softwareVersions property value. Information related to software versions for the device, such as firmware, operating system, Teams client, and admin agent.
     * @return a {@link TeamworkDeviceSoftwareVersions}
     */
    @jakarta.annotation.Nullable
    public TeamworkDeviceSoftwareVersions getSoftwareVersions() {
        return this.backingStore.get("softwareVersions");
    }
    /**
     * Gets the speakerConfiguration property value. The speaker configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a {@link TeamworkSpeakerConfiguration}
     */
    @jakarta.annotation.Nullable
    public TeamworkSpeakerConfiguration getSpeakerConfiguration() {
        return this.backingStore.get("speakerConfiguration");
    }
    /**
     * Gets the systemConfiguration property value. The system configuration. Not applicable for Teams Rooms-enabled devices.
     * @return a {@link TeamworkSystemConfiguration}
     */
    @jakarta.annotation.Nullable
    public TeamworkSystemConfiguration getSystemConfiguration() {
        return this.backingStore.get("systemConfiguration");
    }
    /**
     * Gets the teamsClientConfiguration property value. The Teams client configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a {@link TeamworkTeamsClientConfiguration}
     */
    @jakarta.annotation.Nullable
    public TeamworkTeamsClientConfiguration getTeamsClientConfiguration() {
        return this.backingStore.get("teamsClientConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("cameraConfiguration", this.getCameraConfiguration());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("displayConfiguration", this.getDisplayConfiguration());
        writer.writeObjectValue("hardwareConfiguration", this.getHardwareConfiguration());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("microphoneConfiguration", this.getMicrophoneConfiguration());
        writer.writeObjectValue("softwareVersions", this.getSoftwareVersions());
        writer.writeObjectValue("speakerConfiguration", this.getSpeakerConfiguration());
        writer.writeObjectValue("systemConfiguration", this.getSystemConfiguration());
        writer.writeObjectValue("teamsClientConfiguration", this.getTeamsClientConfiguration());
    }
    /**
     * Sets the cameraConfiguration property value. The camera configuration. Applicable only for Microsoft Teams Rooms-enabled devices.
     * @param value Value to set for the cameraConfiguration property.
     */
    public void setCameraConfiguration(@jakarta.annotation.Nullable final TeamworkCameraConfiguration value) {
        this.backingStore.set("cameraConfiguration", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device configuration document.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device configuration document was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayConfiguration property value. The display configuration.
     * @param value Value to set for the displayConfiguration property.
     */
    public void setDisplayConfiguration(@jakarta.annotation.Nullable final TeamworkDisplayConfiguration value) {
        this.backingStore.set("displayConfiguration", value);
    }
    /**
     * Sets the hardwareConfiguration property value. The hardware configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the hardwareConfiguration property.
     */
    public void setHardwareConfiguration(@jakarta.annotation.Nullable final TeamworkHardwareConfiguration value) {
        this.backingStore.set("hardwareConfiguration", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device configuration.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device configuration was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the microphoneConfiguration property value. The microphone configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the microphoneConfiguration property.
     */
    public void setMicrophoneConfiguration(@jakarta.annotation.Nullable final TeamworkMicrophoneConfiguration value) {
        this.backingStore.set("microphoneConfiguration", value);
    }
    /**
     * Sets the softwareVersions property value. Information related to software versions for the device, such as firmware, operating system, Teams client, and admin agent.
     * @param value Value to set for the softwareVersions property.
     */
    public void setSoftwareVersions(@jakarta.annotation.Nullable final TeamworkDeviceSoftwareVersions value) {
        this.backingStore.set("softwareVersions", value);
    }
    /**
     * Sets the speakerConfiguration property value. The speaker configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the speakerConfiguration property.
     */
    public void setSpeakerConfiguration(@jakarta.annotation.Nullable final TeamworkSpeakerConfiguration value) {
        this.backingStore.set("speakerConfiguration", value);
    }
    /**
     * Sets the systemConfiguration property value. The system configuration. Not applicable for Teams Rooms-enabled devices.
     * @param value Value to set for the systemConfiguration property.
     */
    public void setSystemConfiguration(@jakarta.annotation.Nullable final TeamworkSystemConfiguration value) {
        this.backingStore.set("systemConfiguration", value);
    }
    /**
     * Sets the teamsClientConfiguration property value. The Teams client configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the teamsClientConfiguration property.
     */
    public void setTeamsClientConfiguration(@jakarta.annotation.Nullable final TeamworkTeamsClientConfiguration value) {
        this.backingStore.set("teamsClientConfiguration", value);
    }
}
