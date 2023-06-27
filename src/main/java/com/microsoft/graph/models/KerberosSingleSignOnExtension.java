package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KerberosSingleSignOnExtension extends SingleSignOnExtension implements Parsable {
    /**
     * Gets or sets the Active Directory site.
     */
    private String activeDirectorySiteCode;
    /**
     * Enables or disables whether the Kerberos extension can automatically determine its site name.
     */
    private Boolean blockActiveDirectorySiteAutoDiscovery;
    /**
     * Enables or disables Keychain usage.
     */
    private Boolean blockAutomaticLogin;
    /**
     * Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     */
    private String cacheName;
    /**
     * Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     */
    private java.util.List<String> credentialBundleIdAccessControlList;
    /**
     * Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     */
    private java.util.List<String> domainRealms;
    /**
     * Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     */
    private java.util.List<String> domains;
    /**
     * When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     */
    private Boolean isDefaultRealm;
    /**
     * Enables or disables password changes.
     */
    private Boolean passwordBlockModification;
    /**
     * Gets or sets the URL that the user will be sent to when they initiate a password change.
     */
    private String passwordChangeUrl;
    /**
     * Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     */
    private Boolean passwordEnableLocalSync;
    /**
     * Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     */
    private Integer passwordExpirationDays;
    /**
     * Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     */
    private Integer passwordExpirationNotificationDays;
    /**
     * Gets or sets the minimum number of days until a user can change their password again.
     */
    private Integer passwordMinimumAgeDays;
    /**
     * Gets or sets the minimum length of a password.
     */
    private Integer passwordMinimumLength;
    /**
     * Gets or sets the number of previous passwords to block.
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Enables or disables whether passwords must meet Active Directory's complexity requirements.
     */
    private Boolean passwordRequireActiveDirectoryComplexity;
    /**
     * Gets or sets a description of the password complexity requirements.
     */
    private String passwordRequirementsDescription;
    /**
     * Gets or sets the case-sensitive realm name for this profile.
     */
    private String realm;
    /**
     * Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     */
    private Boolean requireUserPresence;
    /**
     * Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new KerberosSingleSignOnExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KerberosSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.kerberosSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KerberosSingleSignOnExtension
     */
    @javax.annotation.Nonnull
    public static KerberosSingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KerberosSingleSignOnExtension();
    }
    /**
     * Gets the activeDirectorySiteCode property value. Gets or sets the Active Directory site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActiveDirectorySiteCode() {
        return this.activeDirectorySiteCode;
    }
    /**
     * Gets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockActiveDirectorySiteAutoDiscovery() {
        return this.blockActiveDirectorySiteAutoDiscovery;
    }
    /**
     * Gets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockAutomaticLogin() {
        return this.blockAutomaticLogin;
    }
    /**
     * Gets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCacheName() {
        return this.cacheName;
    }
    /**
     * Gets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCredentialBundleIdAccessControlList() {
        return this.credentialBundleIdAccessControlList;
    }
    /**
     * Gets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomainRealms() {
        return this.domainRealms;
    }
    /**
     * Gets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.domains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDirectorySiteCode", (n) -> { this.setActiveDirectorySiteCode(n.getStringValue()); });
        deserializerMap.put("blockActiveDirectorySiteAutoDiscovery", (n) -> { this.setBlockActiveDirectorySiteAutoDiscovery(n.getBooleanValue()); });
        deserializerMap.put("blockAutomaticLogin", (n) -> { this.setBlockAutomaticLogin(n.getBooleanValue()); });
        deserializerMap.put("cacheName", (n) -> { this.setCacheName(n.getStringValue()); });
        deserializerMap.put("credentialBundleIdAccessControlList", (n) -> { this.setCredentialBundleIdAccessControlList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("domainRealms", (n) -> { this.setDomainRealms(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isDefaultRealm", (n) -> { this.setIsDefaultRealm(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockModification", (n) -> { this.setPasswordBlockModification(n.getBooleanValue()); });
        deserializerMap.put("passwordChangeUrl", (n) -> { this.setPasswordChangeUrl(n.getStringValue()); });
        deserializerMap.put("passwordEnableLocalSync", (n) -> { this.setPasswordEnableLocalSync(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordExpirationNotificationDays", (n) -> { this.setPasswordExpirationNotificationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumAgeDays", (n) -> { this.setPasswordMinimumAgeDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequireActiveDirectoryComplexity", (n) -> { this.setPasswordRequireActiveDirectoryComplexity(n.getBooleanValue()); });
        deserializerMap.put("passwordRequirementsDescription", (n) -> { this.setPasswordRequirementsDescription(n.getStringValue()); });
        deserializerMap.put("realm", (n) -> { this.setRealm(n.getStringValue()); });
        deserializerMap.put("requireUserPresence", (n) -> { this.setRequireUserPresence(n.getBooleanValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultRealm property value. When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultRealm() {
        return this.isDefaultRealm;
    }
    /**
     * Gets the passwordBlockModification property value. Enables or disables password changes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockModification() {
        return this.passwordBlockModification;
    }
    /**
     * Gets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordChangeUrl() {
        return this.passwordChangeUrl;
    }
    /**
     * Gets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordEnableLocalSync() {
        return this.passwordEnableLocalSync;
    }
    /**
     * Gets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationNotificationDays() {
        return this.passwordExpirationNotificationDays;
    }
    /**
     * Gets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumAgeDays() {
        return this.passwordMinimumAgeDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequireActiveDirectoryComplexity() {
        return this.passwordRequireActiveDirectoryComplexity;
    }
    /**
     * Gets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordRequirementsDescription() {
        return this.passwordRequirementsDescription;
    }
    /**
     * Gets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealm() {
        return this.realm;
    }
    /**
     * Gets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireUserPresence() {
        return this.requireUserPresence;
    }
    /**
     * Gets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
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
        writer.writeStringValue("activeDirectorySiteCode", this.getActiveDirectorySiteCode());
        writer.writeBooleanValue("blockActiveDirectorySiteAutoDiscovery", this.getBlockActiveDirectorySiteAutoDiscovery());
        writer.writeBooleanValue("blockAutomaticLogin", this.getBlockAutomaticLogin());
        writer.writeStringValue("cacheName", this.getCacheName());
        writer.writeCollectionOfPrimitiveValues("credentialBundleIdAccessControlList", this.getCredentialBundleIdAccessControlList());
        writer.writeCollectionOfPrimitiveValues("domainRealms", this.getDomainRealms());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
        writer.writeBooleanValue("isDefaultRealm", this.getIsDefaultRealm());
        writer.writeBooleanValue("passwordBlockModification", this.getPasswordBlockModification());
        writer.writeStringValue("passwordChangeUrl", this.getPasswordChangeUrl());
        writer.writeBooleanValue("passwordEnableLocalSync", this.getPasswordEnableLocalSync());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordExpirationNotificationDays", this.getPasswordExpirationNotificationDays());
        writer.writeIntegerValue("passwordMinimumAgeDays", this.getPasswordMinimumAgeDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequireActiveDirectoryComplexity", this.getPasswordRequireActiveDirectoryComplexity());
        writer.writeStringValue("passwordRequirementsDescription", this.getPasswordRequirementsDescription());
        writer.writeStringValue("realm", this.getRealm());
        writer.writeBooleanValue("requireUserPresence", this.getRequireUserPresence());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the activeDirectorySiteCode property value. Gets or sets the Active Directory site.
     * @param value Value to set for the activeDirectorySiteCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDirectorySiteCode(@javax.annotation.Nullable final String value) {
        this.activeDirectorySiteCode = value;
    }
    /**
     * Sets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @param value Value to set for the blockActiveDirectorySiteAutoDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockActiveDirectorySiteAutoDiscovery(@javax.annotation.Nullable final Boolean value) {
        this.blockActiveDirectorySiteAutoDiscovery = value;
    }
    /**
     * Sets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @param value Value to set for the blockAutomaticLogin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockAutomaticLogin(@javax.annotation.Nullable final Boolean value) {
        this.blockAutomaticLogin = value;
    }
    /**
     * Sets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @param value Value to set for the cacheName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCacheName(@javax.annotation.Nullable final String value) {
        this.cacheName = value;
    }
    /**
     * Sets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @param value Value to set for the credentialBundleIdAccessControlList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCredentialBundleIdAccessControlList(@javax.annotation.Nullable final java.util.List<String> value) {
        this.credentialBundleIdAccessControlList = value;
    }
    /**
     * Sets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @param value Value to set for the domainRealms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainRealms(@javax.annotation.Nullable final java.util.List<String> value) {
        this.domainRealms = value;
    }
    /**
     * Sets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @param value Value to set for the domains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this.domains = value;
    }
    /**
     * Sets the isDefaultRealm property value. When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     * @param value Value to set for the isDefaultRealm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultRealm(@javax.annotation.Nullable final Boolean value) {
        this.isDefaultRealm = value;
    }
    /**
     * Sets the passwordBlockModification property value. Enables or disables password changes.
     * @param value Value to set for the passwordBlockModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockModification(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockModification = value;
    }
    /**
     * Sets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @param value Value to set for the passwordChangeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordChangeUrl(@javax.annotation.Nullable final String value) {
        this.passwordChangeUrl = value;
    }
    /**
     * Sets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @param value Value to set for the passwordEnableLocalSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordEnableLocalSync(@javax.annotation.Nullable final Boolean value) {
        this.passwordEnableLocalSync = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @param value Value to set for the passwordExpirationNotificationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationNotificationDays(@javax.annotation.Nullable final Integer value) {
        this.passwordExpirationNotificationDays = value;
    }
    /**
     * Sets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @param value Value to set for the passwordMinimumAgeDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumAgeDays(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumAgeDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @param value Value to set for the passwordRequireActiveDirectoryComplexity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequireActiveDirectoryComplexity(@javax.annotation.Nullable final Boolean value) {
        this.passwordRequireActiveDirectoryComplexity = value;
    }
    /**
     * Sets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @param value Value to set for the passwordRequirementsDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequirementsDescription(@javax.annotation.Nullable final String value) {
        this.passwordRequirementsDescription = value;
    }
    /**
     * Sets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @param value Value to set for the realm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealm(@javax.annotation.Nullable final String value) {
        this.realm = value;
    }
    /**
     * Sets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @param value Value to set for the requireUserPresence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireUserPresence(@javax.annotation.Nullable final Boolean value) {
        this.requireUserPresence = value;
    }
    /**
     * Sets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
