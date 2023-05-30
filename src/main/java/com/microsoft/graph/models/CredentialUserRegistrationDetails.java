package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CredentialUserRegistrationDetails extends Entity implements Parsable {
    /** Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue. */
    private java.util.List<RegistrationAuthMethod> authMethods;
    /** Indicates whether the user is ready to perform self-service password reset or MFA. */
    private Boolean isCapable;
    /** Indicates whether the user enabled to perform self-service password reset. */
    private Boolean isEnabled;
    /** Indicates whether the user is registered for MFA. */
    private Boolean isMfaRegistered;
    /** Indicates whether the user has registered any authentication methods for self-service password reset. */
    private Boolean isRegistered;
    /** Provides the user name of the corresponding user. */
    private String userDisplayName;
    /** Provides the user principal name of the corresponding user. */
    private String userPrincipalName;
    /**
     * Instantiates a new credentialUserRegistrationDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CredentialUserRegistrationDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a credentialUserRegistrationDetails
     */
    @javax.annotation.Nonnull
    public static CredentialUserRegistrationDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUserRegistrationDetails();
    }
    /**
     * Gets the authMethods property value. Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue.
     * @return a registrationAuthMethod
     */
    @javax.annotation.Nullable
    public java.util.List<RegistrationAuthMethod> getAuthMethods() {
        return this.authMethods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public Boolean getIsCapable() {
        return this.isCapable;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the user enabled to perform self-service password reset.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the isMfaRegistered property value. Indicates whether the user is registered for MFA.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaRegistered() {
        return this.isMfaRegistered;
    }
    /**
     * Gets the isRegistered property value. Indicates whether the user has registered any authentication methods for self-service password reset.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRegistered() {
        return this.isRegistered;
    }
    /**
     * Gets the userDisplayName property value. Provides the user name of the corresponding user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. Provides the user principal name of the corresponding user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthMethods(@javax.annotation.Nullable final java.util.List<RegistrationAuthMethod> value) {
        this.authMethods = value;
    }
    /**
     * Sets the isCapable property value. Indicates whether the user is ready to perform self-service password reset or MFA.
     * @param value Value to set for the isCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCapable(@javax.annotation.Nullable final Boolean value) {
        this.isCapable = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the user enabled to perform self-service password reset.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the isMfaRegistered property value. Indicates whether the user is registered for MFA.
     * @param value Value to set for the isMfaRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaRegistered(@javax.annotation.Nullable final Boolean value) {
        this.isMfaRegistered = value;
    }
    /**
     * Sets the isRegistered property value. Indicates whether the user has registered any authentication methods for self-service password reset.
     * @param value Value to set for the isRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRegistered(@javax.annotation.Nullable final Boolean value) {
        this.isRegistered = value;
    }
    /**
     * Sets the userDisplayName property value. Provides the user name of the corresponding user.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. Provides the user principal name of the corresponding user.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
