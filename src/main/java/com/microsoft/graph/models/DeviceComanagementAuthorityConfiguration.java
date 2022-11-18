package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComanagementAuthorityConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /** CoManagement Authority configuration ConfigurationManagerAgentCommandLineArgument */
    private String _configurationManagerAgentCommandLineArgument;
    /** CoManagement Authority configuration InstallConfigurationManagerAgent */
    private Boolean _installConfigurationManagerAgent;
    /** CoManagement Authority configuration ManagedDeviceAuthority */
    private Integer _managedDeviceAuthority;
    /**
     * Instantiates a new DeviceComanagementAuthorityConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComanagementAuthorityConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceComanagementAuthorityConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComanagementAuthorityConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceComanagementAuthorityConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComanagementAuthorityConfiguration();
    }
    /**
     * Gets the configurationManagerAgentCommandLineArgument property value. CoManagement Authority configuration ConfigurationManagerAgentCommandLineArgument
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigurationManagerAgentCommandLineArgument() {
        return this._configurationManagerAgentCommandLineArgument;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComanagementAuthorityConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("configurationManagerAgentCommandLineArgument", (n) -> { currentObject.setConfigurationManagerAgentCommandLineArgument(n.getStringValue()); });
            this.put("installConfigurationManagerAgent", (n) -> { currentObject.setInstallConfigurationManagerAgent(n.getBooleanValue()); });
            this.put("managedDeviceAuthority", (n) -> { currentObject.setManagedDeviceAuthority(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the installConfigurationManagerAgent property value. CoManagement Authority configuration InstallConfigurationManagerAgent
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInstallConfigurationManagerAgent() {
        return this._installConfigurationManagerAgent;
    }
    /**
     * Gets the managedDeviceAuthority property value. CoManagement Authority configuration ManagedDeviceAuthority
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getManagedDeviceAuthority() {
        return this._managedDeviceAuthority;
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
        writer.writeStringValue("configurationManagerAgentCommandLineArgument", this.getConfigurationManagerAgentCommandLineArgument());
        writer.writeBooleanValue("installConfigurationManagerAgent", this.getInstallConfigurationManagerAgent());
        writer.writeIntegerValue("managedDeviceAuthority", this.getManagedDeviceAuthority());
    }
    /**
     * Sets the configurationManagerAgentCommandLineArgument property value. CoManagement Authority configuration ConfigurationManagerAgentCommandLineArgument
     * @param value Value to set for the configurationManagerAgentCommandLineArgument property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerAgentCommandLineArgument(@javax.annotation.Nullable final String value) {
        this._configurationManagerAgentCommandLineArgument = value;
    }
    /**
     * Sets the installConfigurationManagerAgent property value. CoManagement Authority configuration InstallConfigurationManagerAgent
     * @param value Value to set for the installConfigurationManagerAgent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallConfigurationManagerAgent(@javax.annotation.Nullable final Boolean value) {
        this._installConfigurationManagerAgent = value;
    }
    /**
     * Sets the managedDeviceAuthority property value. CoManagement Authority configuration ManagedDeviceAuthority
     * @param value Value to set for the managedDeviceAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceAuthority(@javax.annotation.Nullable final Integer value) {
        this._managedDeviceAuthority = value;
    }
}
