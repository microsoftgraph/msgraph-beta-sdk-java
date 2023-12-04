package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The enrollmentProfile resource represents a collection of configurations which must be provided pre-enrollment to enable enrolling certain devices whose identities have been pre-staged. Pre-staged device identities are assigned to this type of profile to apply the profile's configurations at enrollment of the corresponding device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnrollmentProfile extends Entity implements Parsable {
    /**
     * Instantiates a new EnrollmentProfile and sets the default values.
     */
    public EnrollmentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnrollmentProfile
     */
    @jakarta.annotation.Nonnull
    public static EnrollmentProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConfigurationEndpointUrl() {
        return this.backingStore.get("configurationEndpointUrl");
    }
    /**
     * Gets the description property value. Description of the profile
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the profile
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enableAuthenticationViaCompanyPortal property value. Indicates to authenticate with Apple Setup Assistant instead of Company Portal.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableAuthenticationViaCompanyPortal() {
        return this.backingStore.get("enableAuthenticationViaCompanyPortal");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireCompanyPortalOnSetupAssistantEnrolledDevices() {
        return this.backingStore.get("requireCompanyPortalOnSetupAssistantEnrolledDevices");
    }
    /**
     * Gets the requiresUserAuthentication property value. Indicates if the profile requires user authentication
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiresUserAuthentication() {
        return this.backingStore.get("requiresUserAuthentication");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setConfigurationEndpointUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationEndpointUrl", value);
    }
    /**
     * Sets the description property value. Description of the profile
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the profile
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enableAuthenticationViaCompanyPortal property value. Indicates to authenticate with Apple Setup Assistant instead of Company Portal.
     * @param value Value to set for the enableAuthenticationViaCompanyPortal property.
     */
    public void setEnableAuthenticationViaCompanyPortal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableAuthenticationViaCompanyPortal", value);
    }
    /**
     * Sets the requireCompanyPortalOnSetupAssistantEnrolledDevices property value. Indicates that Company Portal is required on setup assistant enrolled devices
     * @param value Value to set for the requireCompanyPortalOnSetupAssistantEnrolledDevices property.
     */
    public void setRequireCompanyPortalOnSetupAssistantEnrolledDevices(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireCompanyPortalOnSetupAssistantEnrolledDevices", value);
    }
    /**
     * Sets the requiresUserAuthentication property value. Indicates if the profile requires user authentication
     * @param value Value to set for the requiresUserAuthentication property.
     */
    public void setRequiresUserAuthentication(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requiresUserAuthentication", value);
    }
}
