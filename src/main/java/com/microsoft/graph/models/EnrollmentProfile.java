package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnrollmentProfile extends Entity implements Parsable {
    /** Configuration endpoint url to use for Enrollment */
    private String _configurationEndpointUrl;
    /** Description of the profile */
    private String _description;
    /** Name of the profile */
    private String _displayName;
    /** Indicates to authenticate with Apple Setup Assistant instead of Company Portal. */
    private Boolean _enableAuthenticationViaCompanyPortal;
    /** Indicates that Company Portal is required on setup assistant enrolled devices */
    private Boolean _requireCompanyPortalOnSetupAssistantEnrolledDevices;
    /** Indicates if the profile requires user authentication */
    private Boolean _requiresUserAuthentication;
    /**
     * Instantiates a new enrollmentProfile and sets the default values.
     * @return a void
     */
    public EnrollmentProfile() {
        super();
        this.setOdatatype("#microsoft.graph.enrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a enrollmentProfile
     */
    @javax.annotation.Nonnull
    public static EnrollmentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.depEnrollmentBaseProfile": return new DepEnrollmentBaseProfile();
                case "#microsoft.graph.depEnrollmentProfile": return new DepEnrollmentProfile();
            }
        }
        return new EnrollmentProfile();
    }
    /**
     * Gets the configurationEndpointUrl property value. Configuration endpoint url to use for Enrollment
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigurationEndpointUrl() {
        return this._configurationEndpointUrl;
    }
    /**
     * Gets the description property value. Description of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Name of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enableAuthenticationViaCompanyPortal property value. Indicates to authenticate with Apple Setup Assistant instead of Company Portal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAuthenticationViaCompanyPortal() {
        return this._enableAuthenticationViaCompanyPortal;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EnrollmentProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("configurationEndpointUrl", (n) -> { currentObject.setConfigurationEndpointUrl(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enableAuthenticationViaCompanyPortal", (n) -> { currentObject.setEnableAuthenticationViaCompanyPortal(n.getBooleanValue()); });
            this.put("requireCompanyPortalOnSetupAssistantEnrolledDevices", (n) -> { currentObject.setRequireCompanyPortalOnSetupAssistantEnrolledDevices(n.getBooleanValue()); });
            this.put("requiresUserAuthentication", (n) -> { currentObject.setRequiresUserAuthentication(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the requireCompanyPortalOnSetupAssistantEnrolledDevices property value. Indicates that Company Portal is required on setup assistant enrolled devices
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireCompanyPortalOnSetupAssistantEnrolledDevices() {
        return this._requireCompanyPortalOnSetupAssistantEnrolledDevices;
    }
    /**
     * Gets the requiresUserAuthentication property value. Indicates if the profile requires user authentication
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequiresUserAuthentication() {
        return this._requiresUserAuthentication;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("configurationEndpointUrl", this.getConfigurationEndpointUrl());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enableAuthenticationViaCompanyPortal", this.getEnableAuthenticationViaCompanyPortal());
        writer.writeBooleanValue("requireCompanyPortalOnSetupAssistantEnrolledDevices", this.getRequireCompanyPortalOnSetupAssistantEnrolledDevices());
        writer.writeBooleanValue("requiresUserAuthentication", this.getRequiresUserAuthentication());
    }
    /**
     * Sets the configurationEndpointUrl property value. Configuration endpoint url to use for Enrollment
     * @param value Value to set for the configurationEndpointUrl property.
     * @return a void
     */
    public void setConfigurationEndpointUrl(@javax.annotation.Nullable final String value) {
        this._configurationEndpointUrl = value;
    }
    /**
     * Sets the description property value. Description of the profile
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Name of the profile
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enableAuthenticationViaCompanyPortal property value. Indicates to authenticate with Apple Setup Assistant instead of Company Portal.
     * @param value Value to set for the enableAuthenticationViaCompanyPortal property.
     * @return a void
     */
    public void setEnableAuthenticationViaCompanyPortal(@javax.annotation.Nullable final Boolean value) {
        this._enableAuthenticationViaCompanyPortal = value;
    }
    /**
     * Sets the requireCompanyPortalOnSetupAssistantEnrolledDevices property value. Indicates that Company Portal is required on setup assistant enrolled devices
     * @param value Value to set for the requireCompanyPortalOnSetupAssistantEnrolledDevices property.
     * @return a void
     */
    public void setRequireCompanyPortalOnSetupAssistantEnrolledDevices(@javax.annotation.Nullable final Boolean value) {
        this._requireCompanyPortalOnSetupAssistantEnrolledDevices = value;
    }
    /**
     * Sets the requiresUserAuthentication property value. Indicates if the profile requires user authentication
     * @param value Value to set for the requiresUserAuthentication property.
     * @return a void
     */
    public void setRequiresUserAuthentication(@javax.annotation.Nullable final Boolean value) {
        this._requiresUserAuthentication = value;
    }
}
