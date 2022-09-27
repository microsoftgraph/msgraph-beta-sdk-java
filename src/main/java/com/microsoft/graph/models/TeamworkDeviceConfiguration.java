package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDeviceConfiguration extends Entity implements Parsable {
    /** The camera configuration. Applicable only for Microsoft Teams Rooms-enabled devices. */
    private TeamworkCameraConfiguration _cameraConfiguration;
    /** Identity of the user who created the device configuration document. */
    private IdentitySet _createdBy;
    /** The UTC date and time when the device configuration document was created. */
    private OffsetDateTime _createdDateTime;
    /** The display configuration. */
    private TeamworkDisplayConfiguration _displayConfiguration;
    /** The hardware configuration. Applicable only for Teams Rooms-enabled devices. */
    private TeamworkHardwareConfiguration _hardwareConfiguration;
    /** Identity of the user who last modified the device configuration. */
    private IdentitySet _lastModifiedBy;
    /** The UTC date and time when the device configuration was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The microphone configuration. Applicable only for Teams Rooms-enabled devices. */
    private TeamworkMicrophoneConfiguration _microphoneConfiguration;
    /** Information related to software versions for the device, such as firmware, operating system, Teams client, and admin agent. */
    private TeamworkDeviceSoftwareVersions _softwareVersions;
    /** The speaker configuration. Applicable only for Teams Rooms-enabled devices. */
    private TeamworkSpeakerConfiguration _speakerConfiguration;
    /** The system configuration. Not applicable for Teams Rooms-enabled devices. */
    private TeamworkSystemConfiguration _systemConfiguration;
    /** The Teams client configuration. Applicable only for Teams Rooms-enabled devices. */
    private TeamworkTeamsClientConfiguration _teamsClientConfiguration;
    /**
     * Instantiates a new teamworkDeviceConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.teamworkDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceConfiguration();
    }
    /**
     * Gets the cameraConfiguration property value. The camera configuration. Applicable only for Microsoft Teams Rooms-enabled devices.
     * @return a teamworkCameraConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkCameraConfiguration getCameraConfiguration() {
        return this._cameraConfiguration;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device configuration document.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device configuration document was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayConfiguration property value. The display configuration.
     * @return a teamworkDisplayConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkDisplayConfiguration getDisplayConfiguration() {
        return this._displayConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDeviceConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("cameraConfiguration", (n) -> { currentObject.setCameraConfiguration(n.getObjectValue(TeamworkCameraConfiguration::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayConfiguration", (n) -> { currentObject.setDisplayConfiguration(n.getObjectValue(TeamworkDisplayConfiguration::createFromDiscriminatorValue)); });
            this.put("hardwareConfiguration", (n) -> { currentObject.setHardwareConfiguration(n.getObjectValue(TeamworkHardwareConfiguration::createFromDiscriminatorValue)); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("microphoneConfiguration", (n) -> { currentObject.setMicrophoneConfiguration(n.getObjectValue(TeamworkMicrophoneConfiguration::createFromDiscriminatorValue)); });
            this.put("softwareVersions", (n) -> { currentObject.setSoftwareVersions(n.getObjectValue(TeamworkDeviceSoftwareVersions::createFromDiscriminatorValue)); });
            this.put("speakerConfiguration", (n) -> { currentObject.setSpeakerConfiguration(n.getObjectValue(TeamworkSpeakerConfiguration::createFromDiscriminatorValue)); });
            this.put("systemConfiguration", (n) -> { currentObject.setSystemConfiguration(n.getObjectValue(TeamworkSystemConfiguration::createFromDiscriminatorValue)); });
            this.put("teamsClientConfiguration", (n) -> { currentObject.setTeamsClientConfiguration(n.getObjectValue(TeamworkTeamsClientConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hardwareConfiguration property value. The hardware configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a teamworkHardwareConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkHardwareConfiguration getHardwareConfiguration() {
        return this._hardwareConfiguration;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device configuration.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device configuration was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the microphoneConfiguration property value. The microphone configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a teamworkMicrophoneConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkMicrophoneConfiguration getMicrophoneConfiguration() {
        return this._microphoneConfiguration;
    }
    /**
     * Gets the softwareVersions property value. Information related to software versions for the device, such as firmware, operating system, Teams client, and admin agent.
     * @return a teamworkDeviceSoftwareVersions
     */
    @javax.annotation.Nullable
    public TeamworkDeviceSoftwareVersions getSoftwareVersions() {
        return this._softwareVersions;
    }
    /**
     * Gets the speakerConfiguration property value. The speaker configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a teamworkSpeakerConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkSpeakerConfiguration getSpeakerConfiguration() {
        return this._speakerConfiguration;
    }
    /**
     * Gets the systemConfiguration property value. The system configuration. Not applicable for Teams Rooms-enabled devices.
     * @return a teamworkSystemConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkSystemConfiguration getSystemConfiguration() {
        return this._systemConfiguration;
    }
    /**
     * Gets the teamsClientConfiguration property value. The Teams client configuration. Applicable only for Teams Rooms-enabled devices.
     * @return a teamworkTeamsClientConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkTeamsClientConfiguration getTeamsClientConfiguration() {
        return this._teamsClientConfiguration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setCameraConfiguration(@javax.annotation.Nullable final TeamworkCameraConfiguration value) {
        this._cameraConfiguration = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device configuration document.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device configuration document was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayConfiguration property value. The display configuration.
     * @param value Value to set for the displayConfiguration property.
     * @return a void
     */
    public void setDisplayConfiguration(@javax.annotation.Nullable final TeamworkDisplayConfiguration value) {
        this._displayConfiguration = value;
    }
    /**
     * Sets the hardwareConfiguration property value. The hardware configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the hardwareConfiguration property.
     * @return a void
     */
    public void setHardwareConfiguration(@javax.annotation.Nullable final TeamworkHardwareConfiguration value) {
        this._hardwareConfiguration = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device configuration.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device configuration was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the microphoneConfiguration property value. The microphone configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the microphoneConfiguration property.
     * @return a void
     */
    public void setMicrophoneConfiguration(@javax.annotation.Nullable final TeamworkMicrophoneConfiguration value) {
        this._microphoneConfiguration = value;
    }
    /**
     * Sets the softwareVersions property value. Information related to software versions for the device, such as firmware, operating system, Teams client, and admin agent.
     * @param value Value to set for the softwareVersions property.
     * @return a void
     */
    public void setSoftwareVersions(@javax.annotation.Nullable final TeamworkDeviceSoftwareVersions value) {
        this._softwareVersions = value;
    }
    /**
     * Sets the speakerConfiguration property value. The speaker configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the speakerConfiguration property.
     * @return a void
     */
    public void setSpeakerConfiguration(@javax.annotation.Nullable final TeamworkSpeakerConfiguration value) {
        this._speakerConfiguration = value;
    }
    /**
     * Sets the systemConfiguration property value. The system configuration. Not applicable for Teams Rooms-enabled devices.
     * @param value Value to set for the systemConfiguration property.
     * @return a void
     */
    public void setSystemConfiguration(@javax.annotation.Nullable final TeamworkSystemConfiguration value) {
        this._systemConfiguration = value;
    }
    /**
     * Sets the teamsClientConfiguration property value. The Teams client configuration. Applicable only for Teams Rooms-enabled devices.
     * @param value Value to set for the teamsClientConfiguration property.
     * @return a void
     */
    public void setTeamsClientConfiguration(@javax.annotation.Nullable final TeamworkTeamsClientConfiguration value) {
        this._teamsClientConfiguration = value;
    }
}
