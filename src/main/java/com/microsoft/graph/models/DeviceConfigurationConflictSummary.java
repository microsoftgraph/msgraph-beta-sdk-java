package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Conflict summary for a set of device configuration policies.
 */
public class DeviceConfigurationConflictSummary extends Entity implements Parsable {
    /**
     * The set of policies in conflict with the given setting
     */
    private java.util.List<SettingSource> conflictingDeviceConfigurations;
    /**
     * The set of settings in conflict with the given policies
     */
    private java.util.List<String> contributingSettings;
    /**
     * The count of checkins impacted by the conflicting policies and settings
     */
    private Integer deviceCheckinsImpacted;
    /**
     * Instantiates a new deviceConfigurationConflictSummary and sets the default values.
     */
    public DeviceConfigurationConflictSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationConflictSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfigurationConflictSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationConflictSummary();
    }
    /**
     * Gets the conflictingDeviceConfigurations property value. The set of policies in conflict with the given setting
     * @return a settingSource
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingSource> getConflictingDeviceConfigurations() {
        return this.conflictingDeviceConfigurations;
    }
    /**
     * Gets the contributingSettings property value. The set of settings in conflict with the given policies
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContributingSettings() {
        return this.contributingSettings;
    }
    /**
     * Gets the deviceCheckinsImpacted property value. The count of checkins impacted by the conflicting policies and settings
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCheckinsImpacted() {
        return this.deviceCheckinsImpacted;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conflictingDeviceConfigurations", (n) -> { this.setConflictingDeviceConfigurations(n.getCollectionOfObjectValues(SettingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("contributingSettings", (n) -> { this.setContributingSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deviceCheckinsImpacted", (n) -> { this.setDeviceCheckinsImpacted(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("conflictingDeviceConfigurations", this.getConflictingDeviceConfigurations());
        writer.writeCollectionOfPrimitiveValues("contributingSettings", this.getContributingSettings());
        writer.writeIntegerValue("deviceCheckinsImpacted", this.getDeviceCheckinsImpacted());
    }
    /**
     * Sets the conflictingDeviceConfigurations property value. The set of policies in conflict with the given setting
     * @param value Value to set for the conflictingDeviceConfigurations property.
     */
    public void setConflictingDeviceConfigurations(@jakarta.annotation.Nullable final java.util.List<SettingSource> value) {
        this.conflictingDeviceConfigurations = value;
    }
    /**
     * Sets the contributingSettings property value. The set of settings in conflict with the given policies
     * @param value Value to set for the contributingSettings property.
     */
    public void setContributingSettings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.contributingSettings = value;
    }
    /**
     * Sets the deviceCheckinsImpacted property value. The count of checkins impacted by the conflicting policies and settings
     * @param value Value to set for the deviceCheckinsImpacted property.
     */
    public void setDeviceCheckinsImpacted(@jakarta.annotation.Nullable final Integer value) {
        this.deviceCheckinsImpacted = value;
    }
}
