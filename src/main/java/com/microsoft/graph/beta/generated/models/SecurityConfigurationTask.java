package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A security configuration task.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityConfigurationTask extends DeviceAppManagementTask implements Parsable {
    /**
     * Instantiates a new {@link SecurityConfigurationTask} and sets the default values.
     */
    public SecurityConfigurationTask() {
        super();
        this.setOdataType("#microsoft.graph.securityConfigurationTask");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityConfigurationTask}
     */
    @jakarta.annotation.Nonnull
    public static SecurityConfigurationTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityConfigurationTask();
    }
    /**
     * Gets the applicablePlatform property value. The endpoint security configuration applicable platform.
     * @return a {@link EndpointSecurityConfigurationApplicablePlatform}
     */
    @jakarta.annotation.Nullable
    public EndpointSecurityConfigurationApplicablePlatform getApplicablePlatform() {
        return this.backingStore.get("applicablePlatform");
    }
    /**
     * Gets the endpointSecurityPolicy property value. The endpoint security policy type.
     * @return a {@link EndpointSecurityConfigurationType}
     */
    @jakarta.annotation.Nullable
    public EndpointSecurityConfigurationType getEndpointSecurityPolicy() {
        return this.backingStore.get("endpointSecurityPolicy");
    }
    /**
     * Gets the endpointSecurityPolicyProfile property value. The endpoint security policy profile type.
     * @return a {@link EndpointSecurityConfigurationProfileType}
     */
    @jakarta.annotation.Nullable
    public EndpointSecurityConfigurationProfileType getEndpointSecurityPolicyProfile() {
        return this.backingStore.get("endpointSecurityPolicyProfile");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicablePlatform", (n) -> { this.setApplicablePlatform(n.getEnumValue(EndpointSecurityConfigurationApplicablePlatform::forValue)); });
        deserializerMap.put("endpointSecurityPolicy", (n) -> { this.setEndpointSecurityPolicy(n.getEnumValue(EndpointSecurityConfigurationType::forValue)); });
        deserializerMap.put("endpointSecurityPolicyProfile", (n) -> { this.setEndpointSecurityPolicyProfile(n.getEnumValue(EndpointSecurityConfigurationProfileType::forValue)); });
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getStringValue()); });
        deserializerMap.put("intendedSettings", (n) -> { this.setIntendedSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCount", (n) -> { this.setManagedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(VulnerableManagedDevice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insights property value. Information about the mitigation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInsights() {
        return this.backingStore.get("insights");
    }
    /**
     * Gets the intendedSettings property value. The intended settings and their values.
     * @return a {@link java.util.List<KeyValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getIntendedSettings() {
        return this.backingStore.get("intendedSettings");
    }
    /**
     * Gets the managedDeviceCount property value. The number of vulnerable devices. Valid values 0 to 65536
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getManagedDeviceCount() {
        return this.backingStore.get("managedDeviceCount");
    }
    /**
     * Gets the managedDevices property value. The vulnerable managed devices.
     * @return a {@link java.util.List<VulnerableManagedDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VulnerableManagedDevice> getManagedDevices() {
        return this.backingStore.get("managedDevices");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setApplicablePlatform(@jakarta.annotation.Nullable final EndpointSecurityConfigurationApplicablePlatform value) {
        this.backingStore.set("applicablePlatform", value);
    }
    /**
     * Sets the endpointSecurityPolicy property value. The endpoint security policy type.
     * @param value Value to set for the endpointSecurityPolicy property.
     */
    public void setEndpointSecurityPolicy(@jakarta.annotation.Nullable final EndpointSecurityConfigurationType value) {
        this.backingStore.set("endpointSecurityPolicy", value);
    }
    /**
     * Sets the endpointSecurityPolicyProfile property value. The endpoint security policy profile type.
     * @param value Value to set for the endpointSecurityPolicyProfile property.
     */
    public void setEndpointSecurityPolicyProfile(@jakarta.annotation.Nullable final EndpointSecurityConfigurationProfileType value) {
        this.backingStore.set("endpointSecurityPolicyProfile", value);
    }
    /**
     * Sets the insights property value. Information about the mitigation.
     * @param value Value to set for the insights property.
     */
    public void setInsights(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("insights", value);
    }
    /**
     * Sets the intendedSettings property value. The intended settings and their values.
     * @param value Value to set for the intendedSettings property.
     */
    public void setIntendedSettings(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("intendedSettings", value);
    }
    /**
     * Sets the managedDeviceCount property value. The number of vulnerable devices. Valid values 0 to 65536
     * @param value Value to set for the managedDeviceCount property.
     */
    public void setManagedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("managedDeviceCount", value);
    }
    /**
     * Sets the managedDevices property value. The vulnerable managed devices.
     * @param value Value to set for the managedDevices property.
     */
    public void setManagedDevices(@jakarta.annotation.Nullable final java.util.List<VulnerableManagedDevice> value) {
        this.backingStore.set("managedDevices", value);
    }
}
