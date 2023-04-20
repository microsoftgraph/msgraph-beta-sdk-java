package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RestrictedAppsViolation extends Entity implements Parsable {
    /** Device configuration profile unique identifier, must be Guid */
    private String deviceConfigurationId;
    /** Device configuration profile name */
    private String deviceConfigurationName;
    /** Device name */
    private String deviceName;
    /** Managed device unique identifier, must be Guid */
    private String managedDeviceId;
    /** Supported platform types for policies. */
    private PolicyPlatformType platformType;
    /** List of violated restricted apps */
    private java.util.List<ManagedDeviceReportedApp> restrictedApps;
    /** Restricted apps state */
    private RestrictedAppsState restrictedAppsState;
    /** User unique identifier, must be Guid */
    private String userId;
    /** User name */
    private String userName;
    /**
     * Instantiates a new RestrictedAppsViolation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RestrictedAppsViolation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RestrictedAppsViolation
     */
    @javax.annotation.Nonnull
    public static RestrictedAppsViolation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestrictedAppsViolation();
    }
    /**
     * Gets the deviceConfigurationId property value. Device configuration profile unique identifier, must be Guid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceConfigurationId() {
        return this.deviceConfigurationId;
    }
    /**
     * Gets the deviceConfigurationName property value. Device configuration profile name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceConfigurationName() {
        return this.deviceConfigurationName;
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceConfigurationId", (n) -> { this.setDeviceConfigurationId(n.getStringValue()); });
        deserializerMap.put("deviceConfigurationName", (n) -> { this.setDeviceConfigurationName(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PolicyPlatformType.class)); });
        deserializerMap.put("restrictedApps", (n) -> { this.setRestrictedApps(n.getCollectionOfObjectValues(ManagedDeviceReportedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("restrictedAppsState", (n) -> { this.setRestrictedAppsState(n.getEnumValue(RestrictedAppsState.class)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceId property value. Managed device unique identifier, must be Guid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a policyPlatformType
     */
    @javax.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.platformType;
    }
    /**
     * Gets the restrictedApps property value. List of violated restricted apps
     * @return a managedDeviceReportedApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceReportedApp> getRestrictedApps() {
        return this.restrictedApps;
    }
    /**
     * Gets the restrictedAppsState property value. Restricted apps state
     * @return a restrictedAppsState
     */
    @javax.annotation.Nullable
    public RestrictedAppsState getRestrictedAppsState() {
        return this.restrictedAppsState;
    }
    /**
     * Gets the userId property value. User unique identifier, must be Guid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userName property value. User name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationId(@javax.annotation.Nullable final String value) {
        this.deviceConfigurationId = value;
    }
    /**
     * Sets the deviceConfigurationName property value. Device configuration profile name
     * @param value Value to set for the deviceConfigurationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationName(@javax.annotation.Nullable final String value) {
        this.deviceConfigurationName = value;
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the managedDeviceId property value. Managed device unique identifier, must be Guid
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformType(@javax.annotation.Nullable final PolicyPlatformType value) {
        this.platformType = value;
    }
    /**
     * Sets the restrictedApps property value. List of violated restricted apps
     * @param value Value to set for the restrictedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestrictedApps(@javax.annotation.Nullable final java.util.List<ManagedDeviceReportedApp> value) {
        this.restrictedApps = value;
    }
    /**
     * Sets the restrictedAppsState property value. Restricted apps state
     * @param value Value to set for the restrictedAppsState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestrictedAppsState(@javax.annotation.Nullable final RestrictedAppsState value) {
        this.restrictedAppsState = value;
    }
    /**
     * Sets the userId property value. User unique identifier, must be Guid
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userName property value. User name
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
}
