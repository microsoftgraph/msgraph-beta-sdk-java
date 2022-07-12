package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Violation of restricted apps configuration profile per device per user */
public class RestrictedAppsViolation extends Entity implements Parsable {
    /** Device configuration profile unique identifier, must be Guid */
    private String _deviceConfigurationId;
    /** Device configuration profile name */
    private String _deviceConfigurationName;
    /** Device name */
    private String _deviceName;
    /** Managed device unique identifier, must be Guid */
    private String _managedDeviceId;
    /** Supported platform types for policies. */
    private PolicyPlatformType _platformType;
    /** List of violated restricted apps */
    private java.util.List<ManagedDeviceReportedApp> _restrictedApps;
    /** Restricted apps state */
    private RestrictedAppsState _restrictedAppsState;
    /** User unique identifier, must be Guid */
    private String _userId;
    /** User name */
    private String _userName;
    /**
     * Instantiates a new restrictedAppsViolation and sets the default values.
     * @return a void
     */
    public RestrictedAppsViolation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a restrictedAppsViolation
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
        return this._deviceConfigurationId;
    }
    /**
     * Gets the deviceConfigurationName property value. Device configuration profile name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceConfigurationName() {
        return this._deviceConfigurationName;
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RestrictedAppsViolation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceConfigurationId", (n) -> { currentObject.setDeviceConfigurationId(n.getStringValue()); });
            this.put("deviceConfigurationName", (n) -> { currentObject.setDeviceConfigurationName(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("platformType", (n) -> { currentObject.setPlatformType(n.getEnumValue(PolicyPlatformType.class)); });
            this.put("restrictedApps", (n) -> { currentObject.setRestrictedApps(n.getCollectionOfObjectValues(ManagedDeviceReportedApp::createFromDiscriminatorValue)); });
            this.put("restrictedAppsState", (n) -> { currentObject.setRestrictedAppsState(n.getEnumValue(RestrictedAppsState.class)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDeviceId property value. Managed device unique identifier, must be Guid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a policyPlatformType
     */
    @javax.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this._platformType;
    }
    /**
     * Gets the restrictedApps property value. List of violated restricted apps
     * @return a managedDeviceReportedApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceReportedApp> getRestrictedApps() {
        return this._restrictedApps;
    }
    /**
     * Gets the restrictedAppsState property value. Restricted apps state
     * @return a restrictedAppsState
     */
    @javax.annotation.Nullable
    public RestrictedAppsState getRestrictedAppsState() {
        return this._restrictedAppsState;
    }
    /**
     * Gets the userId property value. User unique identifier, must be Guid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userName property value. User name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDeviceConfigurationId(@javax.annotation.Nullable final String value) {
        this._deviceConfigurationId = value;
    }
    /**
     * Sets the deviceConfigurationName property value. Device configuration profile name
     * @param value Value to set for the deviceConfigurationName property.
     * @return a void
     */
    public void setDeviceConfigurationName(@javax.annotation.Nullable final String value) {
        this._deviceConfigurationName = value;
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the managedDeviceId property value. Managed device unique identifier, must be Guid
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    public void setPlatformType(@javax.annotation.Nullable final PolicyPlatformType value) {
        this._platformType = value;
    }
    /**
     * Sets the restrictedApps property value. List of violated restricted apps
     * @param value Value to set for the restrictedApps property.
     * @return a void
     */
    public void setRestrictedApps(@javax.annotation.Nullable final java.util.List<ManagedDeviceReportedApp> value) {
        this._restrictedApps = value;
    }
    /**
     * Sets the restrictedAppsState property value. Restricted apps state
     * @param value Value to set for the restrictedAppsState property.
     * @return a void
     */
    public void setRestrictedAppsState(@javax.annotation.Nullable final RestrictedAppsState value) {
        this._restrictedAppsState = value;
    }
    /**
     * Sets the userId property value. User unique identifier, must be Guid
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userName property value. User name
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
}
