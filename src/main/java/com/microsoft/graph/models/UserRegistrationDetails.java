package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserRegistrationDetails extends Entity implements Parsable {
    /** The method the user or admin selected as default for performing multi-factor authentication for the user. The possible values are: none, mobilePhone, alternateMobilePhone, officePhone, microsoftAuthenticatorPush, softwareOneTimePasscode, unknownFutureValue. */
    private DefaultMfaMethodType defaultMfaMethod;
    /** Whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of. */
    private Boolean isAdmin;
    /** Whether the user has registered a strong authentication method for multi-factor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq). */
    private Boolean isMfaCapable;
    /** Whether the user has registered a strong authentication method for multi-factor authentication. The method may not necessarily be allowed by the authentication methods policy.  Supports $filter (eq). */
    private Boolean isMfaRegistered;
    /** Whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq). */
    private Boolean isPasswordlessCapable;
    /** Whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq). */
    private Boolean isSsprCapable;
    /** Whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq). */
    private Boolean isSsprEnabled;
    /** Whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq). */
    private Boolean isSsprRegistered;
    /** The lastUpdatedDateTime property */
    private OffsetDateTime lastUpdatedDateTime;
    /** Collection of authentication methods registered, such as mobilePhone, email, fido2. Supports $filter (any with eq). */
    private java.util.List<String> methodsRegistered;
    /** The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderBy. */
    private String userDisplayName;
    /** The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderBy. */
    private String userPrincipalName;
    /** Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue. */
    private SignInUserType userType;
    /**
     * Instantiates a new userRegistrationDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserRegistrationDetails() {
        super();
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
        return this.defaultMfaMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultMfaMethod", (n) -> { this.setDefaultMfaMethod(n.getEnumValue(DefaultMfaMethodType.class)); });
        deserializerMap.put("isAdmin", (n) -> { this.setIsAdmin(n.getBooleanValue()); });
        deserializerMap.put("isMfaCapable", (n) -> { this.setIsMfaCapable(n.getBooleanValue()); });
        deserializerMap.put("isMfaRegistered", (n) -> { this.setIsMfaRegistered(n.getBooleanValue()); });
        deserializerMap.put("isPasswordlessCapable", (n) -> { this.setIsPasswordlessCapable(n.getBooleanValue()); });
        deserializerMap.put("isSsprCapable", (n) -> { this.setIsSsprCapable(n.getBooleanValue()); });
        deserializerMap.put("isSsprEnabled", (n) -> { this.setIsSsprEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSsprRegistered", (n) -> { this.setIsSsprRegistered(n.getBooleanValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("methodsRegistered", (n) -> { this.setMethodsRegistered(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(SignInUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAdmin property value. Whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }
    /**
     * Gets the isMfaCapable property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaCapable() {
        return this.isMfaCapable;
    }
    /**
     * Gets the isMfaRegistered property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method may not necessarily be allowed by the authentication methods policy.  Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaRegistered() {
        return this.isMfaRegistered;
    }
    /**
     * Gets the isPasswordlessCapable property value. Whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPasswordlessCapable() {
        return this.isPasswordlessCapable;
    }
    /**
     * Gets the isSsprCapable property value. Whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprCapable() {
        return this.isSsprCapable;
    }
    /**
     * Gets the isSsprEnabled property value. Whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprEnabled() {
        return this.isSsprEnabled;
    }
    /**
     * Gets the isSsprRegistered property value. Whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprRegistered() {
        return this.isSsprRegistered;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the methodsRegistered property value. Collection of authentication methods registered, such as mobilePhone, email, fido2. Supports $filter (any with eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMethodsRegistered() {
        return this.methodsRegistered;
    }
    /**
     * Gets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the userType property value. Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue.
     * @return a signInUserType
     */
    @javax.annotation.Nullable
    public SignInUserType getUserType() {
        return this.userType;
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
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
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
        this.defaultMfaMethod = value;
    }
    /**
     * Sets the isAdmin property value. Whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of.
     * @param value Value to set for the isAdmin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAdmin(@javax.annotation.Nullable final Boolean value) {
        this.isAdmin = value;
    }
    /**
     * Sets the isMfaCapable property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq).
     * @param value Value to set for the isMfaCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaCapable(@javax.annotation.Nullable final Boolean value) {
        this.isMfaCapable = value;
    }
    /**
     * Sets the isMfaRegistered property value. Whether the user has registered a strong authentication method for multi-factor authentication. The method may not necessarily be allowed by the authentication methods policy.  Supports $filter (eq).
     * @param value Value to set for the isMfaRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaRegistered(@javax.annotation.Nullable final Boolean value) {
        this.isMfaRegistered = value;
    }
    /**
     * Sets the isPasswordlessCapable property value. Whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq).
     * @param value Value to set for the isPasswordlessCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPasswordlessCapable(@javax.annotation.Nullable final Boolean value) {
        this.isPasswordlessCapable = value;
    }
    /**
     * Sets the isSsprCapable property value. Whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @param value Value to set for the isSsprCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprCapable(@javax.annotation.Nullable final Boolean value) {
        this.isSsprCapable = value;
    }
    /**
     * Sets the isSsprEnabled property value. Whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq).
     * @param value Value to set for the isSsprEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSsprEnabled = value;
    }
    /**
     * Sets the isSsprRegistered property value. Whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @param value Value to set for the isSsprRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprRegistered(@javax.annotation.Nullable final Boolean value) {
        this.isSsprRegistered = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the methodsRegistered property value. Collection of authentication methods registered, such as mobilePhone, email, fido2. Supports $filter (any with eq).
     * @param value Value to set for the methodsRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethodsRegistered(@javax.annotation.Nullable final java.util.List<String> value) {
        this.methodsRegistered = value;
    }
    /**
     * Sets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderBy.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderBy.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the userType property value. Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue.
     * @param value Value to set for the userType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserType(@javax.annotation.Nullable final SignInUserType value) {
        this.userType = value;
    }
}
