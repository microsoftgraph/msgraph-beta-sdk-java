package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecurityConfigurationTask extends DeviceAppManagementTask implements Parsable {
    /** The endpoint security configuration applicable platform. */
    private EndpointSecurityConfigurationApplicablePlatform _applicablePlatform;
    /** The endpoint security policy type. */
    private EndpointSecurityConfigurationType _endpointSecurityPolicy;
    /** The endpoint security policy profile type. */
    private EndpointSecurityConfigurationProfileType _endpointSecurityPolicyProfile;
    /** Information about the mitigation. */
    private String _insights;
    /** The intended settings and their values. */
    private java.util.List<KeyValuePair> _intendedSettings;
    /** The number of vulnerable devices. */
    private Integer _managedDeviceCount;
    /** The vulnerable managed devices. */
    private java.util.List<VulnerableManagedDevice> _managedDevices;
    /**
     * Instantiates a new SecurityConfigurationTask and sets the default values.
     * @return a void
     */
    public SecurityConfigurationTask() {
        super();
        this.setOdataType("#microsoft.graph.securityConfigurationTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityConfigurationTask
     */
    @javax.annotation.Nonnull
    public static SecurityConfigurationTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityConfigurationTask();
    }
    /**
     * Gets the applicablePlatform property value. The endpoint security configuration applicable platform.
     * @return a endpointSecurityConfigurationApplicablePlatform
     */
    @javax.annotation.Nullable
    public EndpointSecurityConfigurationApplicablePlatform getApplicablePlatform() {
        return this._applicablePlatform;
    }
    /**
     * Gets the endpointSecurityPolicy property value. The endpoint security policy type.
     * @return a endpointSecurityConfigurationType
     */
    @javax.annotation.Nullable
    public EndpointSecurityConfigurationType getEndpointSecurityPolicy() {
        return this._endpointSecurityPolicy;
    }
    /**
     * Gets the endpointSecurityPolicyProfile property value. The endpoint security policy profile type.
     * @return a endpointSecurityConfigurationProfileType
     */
    @javax.annotation.Nullable
    public EndpointSecurityConfigurationProfileType getEndpointSecurityPolicyProfile() {
        return this._endpointSecurityPolicyProfile;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityConfigurationTask currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicablePlatform", (n) -> { currentObject.setApplicablePlatform(n.getEnumValue(EndpointSecurityConfigurationApplicablePlatform.class)); });
            this.put("endpointSecurityPolicy", (n) -> { currentObject.setEndpointSecurityPolicy(n.getEnumValue(EndpointSecurityConfigurationType.class)); });
            this.put("endpointSecurityPolicyProfile", (n) -> { currentObject.setEndpointSecurityPolicyProfile(n.getEnumValue(EndpointSecurityConfigurationProfileType.class)); });
            this.put("insights", (n) -> { currentObject.setInsights(n.getStringValue()); });
            this.put("intendedSettings", (n) -> { currentObject.setIntendedSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("managedDeviceCount", (n) -> { currentObject.setManagedDeviceCount(n.getIntegerValue()); });
            this.put("managedDevices", (n) -> { currentObject.setManagedDevices(n.getCollectionOfObjectValues(VulnerableManagedDevice::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the insights property value. Information about the mitigation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInsights() {
        return this._insights;
    }
    /**
     * Gets the intendedSettings property value. The intended settings and their values.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getIntendedSettings() {
        return this._intendedSettings;
    }
    /**
     * Gets the managedDeviceCount property value. The number of vulnerable devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getManagedDeviceCount() {
        return this._managedDeviceCount;
    }
    /**
     * Gets the managedDevices property value. The vulnerable managed devices.
     * @return a vulnerableManagedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<VulnerableManagedDevice> getManagedDevices() {
        return this._managedDevices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("applicablePlatform", this.getApplicablePlatform());
        writer.writeEnumValue("endpointSecurityPolicy", this.getEndpointSecurityPolicy());
        writer.writeEnumValue("endpointSecurityPolicyProfile", this.getEndpointSecurityPolicyProfile());
        writer.writeStringValue("insights", this.getInsights());
        writer.writeCollectionOfObjectValues("intendedSettings", this.getIntendedSettings());
        writer.writeIntegerValue("managedDeviceCount", this.getManagedDeviceCount());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
    }
    /**
     * Sets the applicablePlatform property value. The endpoint security configuration applicable platform.
     * @param value Value to set for the applicablePlatform property.
     * @return a void
     */
    public void setApplicablePlatform(@javax.annotation.Nullable final EndpointSecurityConfigurationApplicablePlatform value) {
        this._applicablePlatform = value;
    }
    /**
     * Sets the endpointSecurityPolicy property value. The endpoint security policy type.
     * @param value Value to set for the endpointSecurityPolicy property.
     * @return a void
     */
    public void setEndpointSecurityPolicy(@javax.annotation.Nullable final EndpointSecurityConfigurationType value) {
        this._endpointSecurityPolicy = value;
    }
    /**
     * Sets the endpointSecurityPolicyProfile property value. The endpoint security policy profile type.
     * @param value Value to set for the endpointSecurityPolicyProfile property.
     * @return a void
     */
    public void setEndpointSecurityPolicyProfile(@javax.annotation.Nullable final EndpointSecurityConfigurationProfileType value) {
        this._endpointSecurityPolicyProfile = value;
    }
    /**
     * Sets the insights property value. Information about the mitigation.
     * @param value Value to set for the insights property.
     * @return a void
     */
    public void setInsights(@javax.annotation.Nullable final String value) {
        this._insights = value;
    }
    /**
     * Sets the intendedSettings property value. The intended settings and their values.
     * @param value Value to set for the intendedSettings property.
     * @return a void
     */
    public void setIntendedSettings(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._intendedSettings = value;
    }
    /**
     * Sets the managedDeviceCount property value. The number of vulnerable devices.
     * @param value Value to set for the managedDeviceCount property.
     * @return a void
     */
    public void setManagedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._managedDeviceCount = value;
    }
    /**
     * Sets the managedDevices property value. The vulnerable managed devices.
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<VulnerableManagedDevice> value) {
        this._managedDevices = value;
    }
}
