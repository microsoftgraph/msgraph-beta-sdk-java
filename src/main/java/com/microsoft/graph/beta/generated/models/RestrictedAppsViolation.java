package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Violation of restricted apps configuration profile per device per user
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestrictedAppsViolation extends Entity implements Parsable {
    /**
     * Instantiates a new RestrictedAppsViolation and sets the default values.
     */
    public RestrictedAppsViolation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RestrictedAppsViolation
     */
    @jakarta.annotation.Nonnull
    public static RestrictedAppsViolation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestrictedAppsViolation();
    }
    /**
     * Gets the deviceConfigurationId property value. Device configuration profile unique identifier, must be Guid
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceConfigurationId() {
        return this.backingStore.get("deviceConfigurationId");
    }
    /**
     * Gets the deviceConfigurationName property value. Device configuration profile name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceConfigurationName() {
        return this.backingStore.get("deviceConfigurationName");
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceConfigurationId", (n) -> { this.setDeviceConfigurationId(n.getStringValue()); });
        deserializerMap.put("deviceConfigurationName", (n) -> { this.setDeviceConfigurationName(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PolicyPlatformType::forValue)); });
        deserializerMap.put("restrictedApps", (n) -> { this.setRestrictedApps(n.getCollectionOfObjectValues(ManagedDeviceReportedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("restrictedAppsState", (n) -> { this.setRestrictedAppsState(n.getEnumValue(RestrictedAppsState::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceId property value. Managed device unique identifier, must be Guid
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a PolicyPlatformType
     */
    @jakarta.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.backingStore.get("platformType");
    }
    /**
     * Gets the restrictedApps property value. List of violated restricted apps
     * @return a java.util.List<ManagedDeviceReportedApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceReportedApp> getRestrictedApps() {
        return this.backingStore.get("restrictedApps");
    }
    /**
     * Gets the restrictedAppsState property value. Restricted apps state
     * @return a RestrictedAppsState
     */
    @jakarta.annotation.Nullable
    public RestrictedAppsState getRestrictedAppsState() {
        return this.backingStore.get("restrictedAppsState");
    }
    /**
     * Gets the userId property value. User unique identifier, must be Guid
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userName property value. User name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceConfigurationId", this.getDeviceConfigurationId());
        writer.writeStringValue("deviceConfigurationName", this.getDeviceConfigurationName());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeCollectionOfObjectValues("restrictedApps", this.getRestrictedApps());
        writer.writeEnumValue("restrictedAppsState", this.getRestrictedAppsState());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the deviceConfigurationId property value. Device configuration profile unique identifier, must be Guid
     * @param value Value to set for the deviceConfigurationId property.
     */
    public void setDeviceConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceConfigurationId", value);
    }
    /**
     * Sets the deviceConfigurationName property value. Device configuration profile name
     * @param value Value to set for the deviceConfigurationName property.
     */
    public void setDeviceConfigurationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceConfigurationName", value);
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the managedDeviceId property value. Managed device unique identifier, must be Guid
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     */
    public void setPlatformType(@jakarta.annotation.Nullable final PolicyPlatformType value) {
        this.backingStore.set("platformType", value);
    }
    /**
     * Sets the restrictedApps property value. List of violated restricted apps
     * @param value Value to set for the restrictedApps property.
     */
    public void setRestrictedApps(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceReportedApp> value) {
        this.backingStore.set("restrictedApps", value);
    }
    /**
     * Sets the restrictedAppsState property value. Restricted apps state
     * @param value Value to set for the restrictedAppsState property.
     */
    public void setRestrictedAppsState(@jakarta.annotation.Nullable final RestrictedAppsState value) {
        this.backingStore.set("restrictedAppsState", value);
    }
    /**
     * Sets the userId property value. User unique identifier, must be Guid
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userName property value. User name
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
}
