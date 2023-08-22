package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CredentialUserRegistrationDetails extends Entity implements Parsable {
    /**
     * Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue.
     */
    private java.util.List<RegistrationAuthMethod> authMethods;
    /**
     * Indicates whether the user is ready to perform self-service password reset or MFA.
     */
    private Boolean isCapable;
    /**
     * Indicates whether the user enabled to perform self-service password reset.
     */
    private Boolean isEnabled;
    /**
     * Indicates whether the user is registered for MFA.
     */
    private Boolean isMfaRegistered;
    /**
     * Indicates whether the user has registered any authentication methods for self-service password reset.
     */
    private Boolean isRegistered;
    /**
     * Provides the user name of the corresponding user.
     */
    private String userDisplayName;
    /**
     * Provides the user principal name of the corresponding user.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new credentialUserRegistrationDetails and sets the default values.
     */
    public CredentialUserRegistrationDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a credentialUserRegistrationDetails
     */
    @jakarta.annotation.Nonnull
    public static CredentialUserRegistrationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUserRegistrationDetails();
    }
    /**
     * Gets the authMethods property value. Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue.
     * @return a registrationAuthMethod
     */
    @jakarta.annotation.Nullable
    public java.util.List<RegistrationAuthMethod> getAuthMethods() {
        return this.authMethods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authMethods", (n) -> { this.setAuthMethods(n.getCollectionOfEnumValues(RegistrationAuthMethod.class)); });
        deserializerMap.put("isCapable", (n) -> { this.setIsCapable(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isMfaRegistered", (n) -> { this.setIsMfaRegistered(n.getBooleanValue()); });
        deserializerMap.put("isRegistered", (n) -> { this.setIsRegistered(n.getBooleanValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCapable property value. Indicates whether the user is ready to perform self-service password reset or MFA.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCapable() {
        return this.isCapable;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the user enabled to perform self-service password reset.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the isMfaRegistered property value. Indicates whether the user is registered for MFA.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMfaRegistered() {
        return this.isMfaRegistered;
    }
    /**
     * Gets the isRegistered property value. Indicates whether the user has registered any authentication methods for self-service password reset.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRegistered() {
        return this.isRegistered;
    }
    /**
     * Gets the userDisplayName property value. Provides the user name of the corresponding user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. Provides the user principal name of the corresponding user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("authMethods", this.getAuthMethods());
        writer.writeBooleanValue("isCapable", this.getIsCapable());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isMfaRegistered", this.getIsMfaRegistered());
        writer.writeBooleanValue("isRegistered", this.getIsRegistered());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the authMethods property value. Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue.
     * @param value Value to set for the authMethods property.
     */
    public void setAuthMethods(@jakarta.annotation.Nullable final java.util.List<RegistrationAuthMethod> value) {
        this.authMethods = value;
    }
    /**
     * Sets the isCapable property value. Indicates whether the user is ready to perform self-service password reset or MFA.
     * @param value Value to set for the isCapable property.
     */
    public void setIsCapable(@jakarta.annotation.Nullable final Boolean value) {
        this.isCapable = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the user enabled to perform self-service password reset.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the isMfaRegistered property value. Indicates whether the user is registered for MFA.
     * @param value Value to set for the isMfaRegistered property.
     */
    public void setIsMfaRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.isMfaRegistered = value;
    }
    /**
     * Sets the isRegistered property value. Indicates whether the user has registered any authentication methods for self-service password reset.
     * @param value Value to set for the isRegistered property.
     */
    public void setIsRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.isRegistered = value;
    }
    /**
     * Sets the userDisplayName property value. Provides the user name of the corresponding user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. Provides the user principal name of the corresponding user.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
