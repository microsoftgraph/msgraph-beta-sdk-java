package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CredentialUserRegistrationDetails extends Entity implements Parsable {
    /** Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue. */
    private java.util.List<String> _authMethods;
    /** Indicates whether the user is ready to perform self-service password reset or MFA. */
    private Boolean _isCapable;
    /** Indicates whether the user enabled to perform self-service password reset. */
    private Boolean _isEnabled;
    /** Indicates whether the user is registered for MFA. */
    private Boolean _isMfaRegistered;
    /** Indicates whether the user has registered any authentication methods for self-service password reset. */
    private Boolean _isRegistered;
    /** Provides the user name of the corresponding user. */
    private String _userDisplayName;
    /** Provides the user principal name of the corresponding user. */
    private String _userPrincipalName;
    /**
     * Instantiates a new CredentialUserRegistrationDetails and sets the default values.
     * @return a void
     */
    public CredentialUserRegistrationDetails() {
        super();
        this.setOdataType("#microsoft.graph.credentialUserRegistrationDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CredentialUserRegistrationDetails
     */
    @javax.annotation.Nonnull
    public static CredentialUserRegistrationDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUserRegistrationDetails();
    }
    /**
     * Gets the authMethods property value. Represents the authentication method that the user has registered. Possible values are: email, mobilePhone, officePhone,  securityQuestion (only used for self-service password reset), appNotification,  appCode, alternateMobilePhone (supported only in registration),  fido,  appPassword,  unknownFutureValue.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAuthMethods() {
        return this._authMethods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CredentialUserRegistrationDetails currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authMethods", (n) -> { currentObject.setAuthMethods(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isCapable", (n) -> { currentObject.setIsCapable(n.getBooleanValue()); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("isMfaRegistered", (n) -> { currentObject.setIsMfaRegistered(n.getBooleanValue()); });
            this.put("isRegistered", (n) -> { currentObject.setIsRegistered(n.getBooleanValue()); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isCapable property value. Indicates whether the user is ready to perform self-service password reset or MFA.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCapable() {
        return this._isCapable;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the user enabled to perform self-service password reset.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the isMfaRegistered property value. Indicates whether the user is registered for MFA.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaRegistered() {
        return this._isMfaRegistered;
    }
    /**
     * Gets the isRegistered property value. Indicates whether the user has registered any authentication methods for self-service password reset.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRegistered() {
        return this._isRegistered;
    }
    /**
     * Gets the userDisplayName property value. Provides the user name of the corresponding user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. Provides the user principal name of the corresponding user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("authMethods", this.getAuthMethods());
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
    public void setAuthMethods(@javax.annotation.Nullable final java.util.List<String> value) {
        this._authMethods = value;
    }
    /**
     * Sets the isCapable property value. Indicates whether the user is ready to perform self-service password reset or MFA.
     * @param value Value to set for the isCapable property.
     * @return a void
     */
    public void setIsCapable(@javax.annotation.Nullable final Boolean value) {
        this._isCapable = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the user enabled to perform self-service password reset.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the isMfaRegistered property value. Indicates whether the user is registered for MFA.
     * @param value Value to set for the isMfaRegistered property.
     * @return a void
     */
    public void setIsMfaRegistered(@javax.annotation.Nullable final Boolean value) {
        this._isMfaRegistered = value;
    }
    /**
     * Sets the isRegistered property value. Indicates whether the user has registered any authentication methods for self-service password reset.
     * @param value Value to set for the isRegistered property.
     * @return a void
     */
    public void setIsRegistered(@javax.annotation.Nullable final Boolean value) {
        this._isRegistered = value;
    }
    /**
     * Sets the userDisplayName property value. Provides the user name of the corresponding user.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. Provides the user principal name of the corresponding user.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
