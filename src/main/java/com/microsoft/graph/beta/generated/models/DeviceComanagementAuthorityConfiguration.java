package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 10 Co-Management Authority Page Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComanagementAuthorityConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new {@link DeviceComanagementAuthorityConfiguration} and sets the default values.
     */
    public DeviceComanagementAuthorityConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceComanagementAuthorityConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceComanagementAuthorityConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static DeviceComanagementAuthorityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComanagementAuthorityConfiguration();
    }
    /**
     * Gets the configurationManagerAgentCommandLineArgument property value. CoManagement Authority configuration ConfigurationManagerAgentCommandLineArgument
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfigurationManagerAgentCommandLineArgument() {
        return this.backingStore.get("configurationManagerAgentCommandLineArgument");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationManagerAgentCommandLineArgument", (n) -> { this.setConfigurationManagerAgentCommandLineArgument(n.getStringValue()); });
        deserializerMap.put("installConfigurationManagerAgent", (n) -> { this.setInstallConfigurationManagerAgent(n.getBooleanValue()); });
        deserializerMap.put("managedDeviceAuthority", (n) -> { this.setManagedDeviceAuthority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installConfigurationManagerAgent property value. CoManagement Authority configuration InstallConfigurationManagerAgent
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInstallConfigurationManagerAgent() {
        return this.backingStore.get("installConfigurationManagerAgent");
    }
    /**
     * Gets the managedDeviceAuthority property value. CoManagement Authority configuration ManagedDeviceAuthority
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getManagedDeviceAuthority() {
        return this.backingStore.get("managedDeviceAuthority");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("configurationManagerAgentCommandLineArgument", this.getConfigurationManagerAgentCommandLineArgument());
        writer.writeBooleanValue("installConfigurationManagerAgent", this.getInstallConfigurationManagerAgent());
        writer.writeIntegerValue("managedDeviceAuthority", this.getManagedDeviceAuthority());
    }
    /**
     * Sets the configurationManagerAgentCommandLineArgument property value. CoManagement Authority configuration ConfigurationManagerAgentCommandLineArgument
     * @param value Value to set for the configurationManagerAgentCommandLineArgument property.
     */
    public void setConfigurationManagerAgentCommandLineArgument(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationManagerAgentCommandLineArgument", value);
    }
    /**
     * Sets the installConfigurationManagerAgent property value. CoManagement Authority configuration InstallConfigurationManagerAgent
     * @param value Value to set for the installConfigurationManagerAgent property.
     */
    public void setInstallConfigurationManagerAgent(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("installConfigurationManagerAgent", value);
    }
    /**
     * Sets the managedDeviceAuthority property value. CoManagement Authority configuration ManagedDeviceAuthority
     * @param value Value to set for the managedDeviceAuthority property.
     */
    public void setManagedDeviceAuthority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("managedDeviceAuthority", value);
    }
}
