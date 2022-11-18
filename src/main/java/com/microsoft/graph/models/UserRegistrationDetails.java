package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class UserRegistrationDetails extends Entity implements Parsable {
    /** The method the user or admin selected as default for performing multi-factor authentication for the user. The possible values are: none, mobilePhone, alternateMobilePhone, officePhone, microsoftAuthenticatorPush, softwareOneTimePasscode, unknownFutureValue. */
    private DefaultMfaMethodType _defaultMfaMethod;
    /** Whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of. */
    private Boolean _isAdmin;
    /** Whether the user has registered a strong authentication method for multi-factor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq). */
    private Boolean _isMfaCapable;
    /** Whether the user has registered a strong authentication method for multi-factor authentication. The method may not necessarily be allowed by the authentication methods policy.  Supports $filter (eq). */
    private Boolean _isMfaRegistered;
    /** Whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq). */
    private Boolean _isPasswordlessCapable;
    /** Whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq). */
    private Boolean _isSsprCapable;
    /** Whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq). */
    private Boolean _isSsprEnabled;
    /** Whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq). */
    private Boolean _isSsprRegistered;
    /** Collection of authentication methods registered, such as mobilePhone, email, fido2. Supports $filter (any with eq). */
    private java.util.List<String> _methodsRegistered;
    /** The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderBy. */
    private String _userDisplayName;
    /** The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderBy. */
    private String _userPrincipalName;
    /** Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue. */
    private SignInUserType _userType;
    /**
     * Instantiates a new userRegistrationDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserRegistrationDetails() {
        super();
        this.setOdataType("#microsoft.graph.userRegistrationDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userRegistrationDetails
     */
    @javax.annotation.Nonnull
    public static UserRegistrationDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationDetails();
    }
    /**
     * Gets the defaultMfaMethod property value. The method the user or admin selected as default for performing multi-factor authentication for the user. The possible values are: none, mobilePhone, alternateMobilePhone, officePhone, microsoftAuthenticatorPush, softwareOneTimePasscode, unknownFutureValue.
     * @return a defaultMfaMethodType
     */
    @javax.annotation.Nullable
    public DefaultMfaMethodType getDefaultMfaMethod() {
        return this._defaultMfaMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserRegistrationDetails currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("defaultMfaMethod", (n) -> { currentObject.setDefaultMfaMethod(n.getEnumValue(DefaultMfaMethodType.class)); });
            this.put("isAdmin", (n) -> { currentObject.setIsAdmin(n.getBooleanValue()); });
            this.put("isMfaCapable", (n) -> { currentObject.setIsMfaCapable(n.getBooleanValue()); });
            this.put("isMfaRegistered", (n) -> { currentObject.setIsMfaRegistered(n.getBooleanValue()); });
            this.put("isPasswordlessCapable", (n) -> { currentObject.setIsPasswordlessCapable(n.getBooleanValue()); });
            this.put("isSsprCapable", (n) -> { currentObject.setIsSsprCapable(n.getBooleanValue()); });
            this.put("isSsprEnabled", (n) -> { currentObject.setIsSsprEnabled(n.getBooleanValue()); });
            this.put("isSsprRegistered", (n) -> { currentObject.setIsSsprRegistered(n.getBooleanValue()); });
            this.put("methodsRegistered", (n) -> { currentObject.setMethodsRegistered(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("userType", (n) -> { currentObject.setUserType(n.getEnumValue(SignInUserType.class)); });
        }};
    }
    /**
     * Gets the isAdmin property value. Whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAdmin() {
        return this._isAdmin;
    }
    /**
     * Gets the isMfaCapable property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaCapable() {
        return this._isMfaCapable;
    }
    /**
     * Gets the isMfaRegistered property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method may not necessarily be allowed by the authentication methods policy.  Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaRegistered() {
        return this._isMfaRegistered;
    }
    /**
     * Gets the isPasswordlessCapable property value. Whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPasswordlessCapable() {
        return this._isPasswordlessCapable;
    }
    /**
     * Gets the isSsprCapable property value. Whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprCapable() {
        return this._isSsprCapable;
    }
    /**
     * Gets the isSsprEnabled property value. Whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprEnabled() {
        return this._isSsprEnabled;
    }
    /**
     * Gets the isSsprRegistered property value. Whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprRegistered() {
        return this._isSsprRegistered;
    }
    /**
     * Gets the methodsRegistered property value. Collection of authentication methods registered, such as mobilePhone, email, fido2. Supports $filter (any with eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMethodsRegistered() {
        return this._methodsRegistered;
    }
    /**
     * Gets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the userType property value. Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue.
     * @return a signInUserType
     */
    @javax.annotation.Nullable
    public SignInUserType getUserType() {
        return this._userType;
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
        writer.writeEnumValue("defaultMfaMethod", this.getDefaultMfaMethod());
        writer.writeBooleanValue("isAdmin", this.getIsAdmin());
        writer.writeBooleanValue("isMfaCapable", this.getIsMfaCapable());
        writer.writeBooleanValue("isMfaRegistered", this.getIsMfaRegistered());
        writer.writeBooleanValue("isPasswordlessCapable", this.getIsPasswordlessCapable());
        writer.writeBooleanValue("isSsprCapable", this.getIsSsprCapable());
        writer.writeBooleanValue("isSsprEnabled", this.getIsSsprEnabled());
        writer.writeBooleanValue("isSsprRegistered", this.getIsSsprRegistered());
        writer.writeCollectionOfPrimitiveValues("methodsRegistered", this.getMethodsRegistered());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the defaultMfaMethod property value. The method the user or admin selected as default for performing multi-factor authentication for the user. The possible values are: none, mobilePhone, alternateMobilePhone, officePhone, microsoftAuthenticatorPush, softwareOneTimePasscode, unknownFutureValue.
     * @param value Value to set for the defaultMfaMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultMfaMethod(@javax.annotation.Nullable final DefaultMfaMethodType value) {
        this._defaultMfaMethod = value;
    }
    /**
     * Sets the isAdmin property value. Whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of.
     * @param value Value to set for the isAdmin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAdmin(@javax.annotation.Nullable final Boolean value) {
        this._isAdmin = value;
    }
    /**
     * Sets the isMfaCapable property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq).
     * @param value Value to set for the isMfaCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaCapable(@javax.annotation.Nullable final Boolean value) {
        this._isMfaCapable = value;
    }
    /**
     * Sets the isMfaRegistered property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method may not necessarily be allowed by the authentication methods policy.  Supports $filter (eq).
     * @param value Value to set for the isMfaRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaRegistered(@javax.annotation.Nullable final Boolean value) {
        this._isMfaRegistered = value;
    }
    /**
     * Sets the isPasswordlessCapable property value. Whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq).
     * @param value Value to set for the isPasswordlessCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPasswordlessCapable(@javax.annotation.Nullable final Boolean value) {
        this._isPasswordlessCapable = value;
    }
    /**
     * Sets the isSsprCapable property value. Whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @param value Value to set for the isSsprCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprCapable(@javax.annotation.Nullable final Boolean value) {
        this._isSsprCapable = value;
    }
    /**
     * Sets the isSsprEnabled property value. Whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq).
     * @param value Value to set for the isSsprEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSsprEnabled = value;
    }
    /**
     * Sets the isSsprRegistered property value. Whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @param value Value to set for the isSsprRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprRegistered(@javax.annotation.Nullable final Boolean value) {
        this._isSsprRegistered = value;
    }
    /**
     * Sets the methodsRegistered property value. Collection of authentication methods registered, such as mobilePhone, email, fido2. Supports $filter (any with eq).
     * @param value Value to set for the methodsRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethodsRegistered(@javax.annotation.Nullable final java.util.List<String> value) {
        this._methodsRegistered = value;
    }
    /**
     * Sets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderBy.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderBy.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the userType property value. Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue.
     * @param value Value to set for the userType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserType(@javax.annotation.Nullable final SignInUserType value) {
        this._userType = value;
    }
}
