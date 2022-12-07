package com.microsoft.graph.models;

import com.microsoft.graph.models.DepEnrollmentBaseProfile;
import com.microsoft.graph.models.DepEnrollmentProfile;
import com.microsoft.graph.models.DepIOSEnrollmentProfile;
import com.microsoft.graph.models.DepMacOSEnrollmentProfile;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The enrollmentProfile resource represents a collection of configurations which must be provided pre-enrollment to enable enrolling certain devices whose identities have been pre-staged. Pre-staged device identities are assigned to this type of profile to apply the profile's configurations at enrollment of the corresponding device. */
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
    @javax.annotation.Nullable
    public EnrollmentProfile() {
        super();
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
                case "#microsoft.graph.depIOSEnrollmentProfile": return new DepIOSEnrollmentProfile();
                case "#microsoft.graph.depMacOSEnrollmentProfile": return new DepMacOSEnrollmentProfile();
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationEndpointUrl", (n) -> { this.setConfigurationEndpointUrl(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enableAuthenticationViaCompanyPortal", (n) -> { this.setEnableAuthenticationViaCompanyPortal(n.getBooleanValue()); });
        deserializerMap.put("requireCompanyPortalOnSetupAssistantEnrolledDevices", (n) -> { this.setRequireCompanyPortalOnSetupAssistantEnrolledDevices(n.getBooleanValue()); });
        deserializerMap.put("requiresUserAuthentication", (n) -> { this.setRequiresUserAuthentication(n.getBooleanValue()); });
        return deserializerMap;
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
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setConfigurationEndpointUrl(@javax.annotation.Nullable final String value) {
        this._configurationEndpointUrl = value;
    }
    /**
     * Sets the description property value. Description of the profile
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Name of the profile
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enableAuthenticationViaCompanyPortal property value. Indicates to authenticate with Apple Setup Assistant instead of Company Portal.
     * @param value Value to set for the enableAuthenticationViaCompanyPortal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableAuthenticationViaCompanyPortal(@javax.annotation.Nullable final Boolean value) {
        this._enableAuthenticationViaCompanyPortal = value;
    }
    /**
     * Sets the requireCompanyPortalOnSetupAssistantEnrolledDevices property value. Indicates that Company Portal is required on setup assistant enrolled devices
     * @param value Value to set for the requireCompanyPortalOnSetupAssistantEnrolledDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireCompanyPortalOnSetupAssistantEnrolledDevices(@javax.annotation.Nullable final Boolean value) {
        this._requireCompanyPortalOnSetupAssistantEnrolledDevices = value;
    }
    /**
     * Sets the requiresUserAuthentication property value. Indicates if the profile requires user authentication
     * @param value Value to set for the requiresUserAuthentication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequiresUserAuthentication(@javax.annotation.Nullable final Boolean value) {
        this._requiresUserAuthentication = value;
    }
}
