package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A security configuration task.
 */
public class SecurityConfigurationTask extends DeviceAppManagementTask implements Parsable {
    /**
     * The endpoint security configuration applicable platform.
     */
    private EndpointSecurityConfigurationApplicablePlatform applicablePlatform;
    /**
     * The endpoint security policy type.
     */
    private EndpointSecurityConfigurationType endpointSecurityPolicy;
    /**
     * The endpoint security policy profile type.
     */
    private EndpointSecurityConfigurationProfileType endpointSecurityPolicyProfile;
    /**
     * Information about the mitigation.
     */
    private String insights;
    /**
     * The intended settings and their values.
     */
    private java.util.List<KeyValuePair> intendedSettings;
    /**
     * The number of vulnerable devices. Valid values 0 to 65536
     */
    private Integer managedDeviceCount;
    /**
     * The vulnerable managed devices.
     */
    private java.util.List<VulnerableManagedDevice> managedDevices;
    /**
     * Instantiates a new securityConfigurationTask and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SecurityConfigurationTask() {
        super();
        this.setOdataType("#microsoft.graph.securityConfigurationTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityConfigurationTask
     */
    @jakarta.annotation.Nonnull
    public static SecurityConfigurationTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityConfigurationTask();
    }
    /**
     * Gets the applicablePlatform property value. The endpoint security configuration applicable platform.
     * @return a endpointSecurityConfigurationApplicablePlatform
     */
    @jakarta.annotation.Nullable
    public EndpointSecurityConfigurationApplicablePlatform getApplicablePlatform() {
        return this.applicablePlatform;
    }
    /**
     * Gets the endpointSecurityPolicy property value. The endpoint security policy type.
     * @return a endpointSecurityConfigurationType
     */
    @jakarta.annotation.Nullable
    public EndpointSecurityConfigurationType getEndpointSecurityPolicy() {
        return this.endpointSecurityPolicy;
    }
    /**
     * Gets the endpointSecurityPolicyProfile property value. The endpoint security policy profile type.
     * @return a endpointSecurityConfigurationProfileType
     */
    @jakarta.annotation.Nullable
    public EndpointSecurityConfigurationProfileType getEndpointSecurityPolicyProfile() {
        return this.endpointSecurityPolicyProfile;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicablePlatform", (n) -> { this.setApplicablePlatform(n.getEnumValue(EndpointSecurityConfigurationApplicablePlatform.class)); });
        deserializerMap.put("endpointSecurityPolicy", (n) -> { this.setEndpointSecurityPolicy(n.getEnumValue(EndpointSecurityConfigurationType.class)); });
        deserializerMap.put("endpointSecurityPolicyProfile", (n) -> { this.setEndpointSecurityPolicyProfile(n.getEnumValue(EndpointSecurityConfigurationProfileType.class)); });
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getStringValue()); });
        deserializerMap.put("intendedSettings", (n) -> { this.setIntendedSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCount", (n) -> { this.setManagedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(VulnerableManagedDevice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insights property value. Information about the mitigation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInsights() {
        return this.insights;
    }
    /**
     * Gets the intendedSettings property value. The intended settings and their values.
     * @return a keyValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getIntendedSettings() {
        return this.intendedSettings;
    }
    /**
     * Gets the managedDeviceCount property value. The number of vulnerable devices. Valid values 0 to 65536
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getManagedDeviceCount() {
        return this.managedDeviceCount;
    }
    /**
     * Gets the managedDevices property value. The vulnerable managed devices.
     * @return a vulnerableManagedDevice
     */
    @jakarta.annotation.Nullable
    public java.util.List<VulnerableManagedDevice> getManagedDevices() {
        return this.managedDevices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setApplicablePlatform(@jakarta.annotation.Nullable final EndpointSecurityConfigurationApplicablePlatform value) {
        this.applicablePlatform = value;
    }
    /**
     * Sets the endpointSecurityPolicy property value. The endpoint security policy type.
     * @param value Value to set for the endpointSecurityPolicy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEndpointSecurityPolicy(@jakarta.annotation.Nullable final EndpointSecurityConfigurationType value) {
        this.endpointSecurityPolicy = value;
    }
    /**
     * Sets the endpointSecurityPolicyProfile property value. The endpoint security policy profile type.
     * @param value Value to set for the endpointSecurityPolicyProfile property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEndpointSecurityPolicyProfile(@jakarta.annotation.Nullable final EndpointSecurityConfigurationProfileType value) {
        this.endpointSecurityPolicyProfile = value;
    }
    /**
     * Sets the insights property value. Information about the mitigation.
     * @param value Value to set for the insights property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInsights(@jakarta.annotation.Nullable final String value) {
        this.insights = value;
    }
    /**
     * Sets the intendedSettings property value. The intended settings and their values.
     * @param value Value to set for the intendedSettings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIntendedSettings(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.intendedSettings = value;
    }
    /**
     * Sets the managedDeviceCount property value. The number of vulnerable devices. Valid values 0 to 65536
     * @param value Value to set for the managedDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.managedDeviceCount = value;
    }
    /**
     * Sets the managedDevices property value. The vulnerable managed devices.
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDevices(@jakarta.annotation.Nullable final java.util.List<VulnerableManagedDevice> value) {
        this.managedDevices = value;
    }
}
