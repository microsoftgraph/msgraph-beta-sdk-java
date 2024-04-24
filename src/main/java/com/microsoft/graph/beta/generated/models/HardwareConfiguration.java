package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BIOS configuration and other settings provides customers the ability to configure hardware/bios settings on the enrolled Windows 10/11 Entra ID joined devices by uploading a configuration file generated with their OEM tool (e.g. Dell Command tool). A BIOS configuration policy can be assigned to multiple devices, allowing admins to remotely control a device's hardware properties (e.g. enable Secure Boot) from the Intune Portal.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwareConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HardwareConfiguration} and sets the default values.
     */
    public HardwareConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HardwareConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static HardwareConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareConfiguration();
    }
    /**
     * Gets the assignments property value. A list of the Entra user group ids that hardware configuration will be applied to. Only security groups and Office 365 Groups are supported. Optional.
     * @return a {@link java.util.List<HardwareConfigurationAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HardwareConfigurationAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the configurationFileContent property value. The file content contains custom hardware settings that will be applied to the assigned devices' BIOS. Max allowed file size is 5KB. Represented as bytes. Required.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getConfigurationFileContent() {
        return this.backingStore.get("configurationFileContent");
    }
    /**
     * Gets the createdDateTime property value. The date and time  of when the BIOS configuration profile was created. The value cannot be modified and is automatically populated when the device is enrolled. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-Only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description of the hardware configuration. Use this to provide context, purpose, applications, etc of the BIOS configuration profile for your organization's admins. Max length is 1000 characters. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceRunStates property value. List of run states for the hardware configuration across all devices. Read-Only.
     * @return a {@link java.util.List<HardwareConfigurationDeviceState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HardwareConfigurationDeviceState> getDeviceRunStates() {
        return this.backingStore.get("deviceRunStates");
    }
    /**
     * Gets the displayName property value. The name of the hardware BIOS configuration profile. It serves as user-friendly name to identify hardware BIOS configuration profiles. Max length is 150 characters. Required. Read-Only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(HardwareConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationFileContent", (n) -> { this.setConfigurationFileContent(n.getByteArrayValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceRunStates", (n) -> { this.setDeviceRunStates(n.getCollectionOfObjectValues(HardwareConfigurationDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("hardwareConfigurationFormat", (n) -> { this.setHardwareConfigurationFormat(n.getEnumValue(HardwareConfigurationFormat::forValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("perDevicePasswordDisabled", (n) -> { this.setPerDevicePasswordDisabled(n.getBooleanValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("runSummary", (n) -> { this.setRunSummary(n.getObjectValue(HardwareConfigurationRunSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("userRunStates", (n) -> { this.setUserRunStates(n.getCollectionOfObjectValues(HardwareConfigurationUserState::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The file name for the BIOS configuration profile's ConfigurationFileContent. Max length is 150 characters. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the hardwareConfigurationFormat property value. Indicates the supported oems of hardware configuration
     * @return a {@link HardwareConfigurationFormat}
     */
    @jakarta.annotation.Nullable
    public HardwareConfigurationFormat getHardwareConfigurationFormat() {
        return this.backingStore.get("hardwareConfigurationFormat");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time  of when the BIOS configuration profile was last modified. The value cannot be modified and is automatically populated when the device is enrolled. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-Only. Read-Only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the perDevicePasswordDisabled property value. When TRUE, indicates whether the policy-assigned devices' passwords are disabled. When FALSE, indicates they are enabled. Default is FALSE. Required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPerDevicePasswordDisabled() {
        return this.backingStore.get("perDevicePasswordDisabled");
    }
    /**
     * Gets the roleScopeTagIds property value. A list of unique Scope Tag IDs associated with the hardware configuration. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the runSummary property value. A summary of the results from an attempt to configure hardware settings. Read-Only.
     * @return a {@link HardwareConfigurationRunSummary}
     */
    @jakarta.annotation.Nullable
    public HardwareConfigurationRunSummary getRunSummary() {
        return this.backingStore.get("runSummary");
    }
    /**
     * Gets the userRunStates property value. List of run states for the hardware configuration across all users. Read-Only.
     * @return a {@link java.util.List<HardwareConfigurationUserState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HardwareConfigurationUserState> getUserRunStates() {
        return this.backingStore.get("userRunStates");
    }
    /**
     * Gets the version property value. The version of the hardware configuration (E.g. 1, 2, 3 ...). This is incremented after a change to the BIOS configuration profile's settings file name (FileName property), settings file content (ConfigurationFileContent property), or the PerDevicePasswordDisabled property. Read-Only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeByteArrayValue("configurationFileContent", this.getConfigurationFileContent());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceRunStates", this.getDeviceRunStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeEnumValue("hardwareConfigurationFormat", this.getHardwareConfigurationFormat());
        writer.writeBooleanValue("perDevicePasswordDisabled", this.getPerDevicePasswordDisabled());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeObjectValue("runSummary", this.getRunSummary());
        writer.writeCollectionOfObjectValues("userRunStates", this.getUserRunStates());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. A list of the Entra user group ids that hardware configuration will be applied to. Only security groups and Office 365 Groups are supported. Optional.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<HardwareConfigurationAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the configurationFileContent property value. The file content contains custom hardware settings that will be applied to the assigned devices' BIOS. Max allowed file size is 5KB. Represented as bytes. Required.
     * @param value Value to set for the configurationFileContent property.
     */
    public void setConfigurationFileContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("configurationFileContent", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time  of when the BIOS configuration profile was created. The value cannot be modified and is automatically populated when the device is enrolled. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-Only. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description of the hardware configuration. Use this to provide context, purpose, applications, etc of the BIOS configuration profile for your organization's admins. Max length is 1000 characters. Optional.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceRunStates property value. List of run states for the hardware configuration across all devices. Read-Only.
     * @param value Value to set for the deviceRunStates property.
     */
    public void setDeviceRunStates(@jakarta.annotation.Nullable final java.util.List<HardwareConfigurationDeviceState> value) {
        this.backingStore.set("deviceRunStates", value);
    }
    /**
     * Sets the displayName property value. The name of the hardware BIOS configuration profile. It serves as user-friendly name to identify hardware BIOS configuration profiles. Max length is 150 characters. Required. Read-Only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the fileName property value. The file name for the BIOS configuration profile's ConfigurationFileContent. Max length is 150 characters. Required.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the hardwareConfigurationFormat property value. Indicates the supported oems of hardware configuration
     * @param value Value to set for the hardwareConfigurationFormat property.
     */
    public void setHardwareConfigurationFormat(@jakarta.annotation.Nullable final HardwareConfigurationFormat value) {
        this.backingStore.set("hardwareConfigurationFormat", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time  of when the BIOS configuration profile was last modified. The value cannot be modified and is automatically populated when the device is enrolled. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-Only. Read-Only. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the perDevicePasswordDisabled property value. When TRUE, indicates whether the policy-assigned devices' passwords are disabled. When FALSE, indicates they are enabled. Default is FALSE. Required.
     * @param value Value to set for the perDevicePasswordDisabled property.
     */
    public void setPerDevicePasswordDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("perDevicePasswordDisabled", value);
    }
    /**
     * Sets the roleScopeTagIds property value. A list of unique Scope Tag IDs associated with the hardware configuration. Optional.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the runSummary property value. A summary of the results from an attempt to configure hardware settings. Read-Only.
     * @param value Value to set for the runSummary property.
     */
    public void setRunSummary(@jakarta.annotation.Nullable final HardwareConfigurationRunSummary value) {
        this.backingStore.set("runSummary", value);
    }
    /**
     * Sets the userRunStates property value. List of run states for the hardware configuration across all users. Read-Only.
     * @param value Value to set for the userRunStates property.
     */
    public void setUserRunStates(@jakarta.annotation.Nullable final java.util.List<HardwareConfigurationUserState> value) {
        this.backingStore.set("userRunStates", value);
    }
    /**
     * Sets the version property value. The version of the hardware configuration (E.g. 1, 2, 3 ...). This is incremented after a change to the BIOS configuration profile's settings file name (FileName property), settings file content (ConfigurationFileContent property), or the PerDevicePasswordDisabled property. Read-Only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}
