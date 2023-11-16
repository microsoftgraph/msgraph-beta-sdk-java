package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a Kerberos-type Single Sign-On extension profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KerberosSingleSignOnExtension extends SingleSignOnExtension implements Parsable {
    /**
     * Instantiates a new KerberosSingleSignOnExtension and sets the default values.
     */
    public KerberosSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.kerberosSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KerberosSingleSignOnExtension
     */
    @jakarta.annotation.Nonnull
    public static KerberosSingleSignOnExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KerberosSingleSignOnExtension();
    }
    /**
     * Gets the activeDirectorySiteCode property value. Gets or sets the Active Directory site.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActiveDirectorySiteCode() {
        return this.BackingStore.get("activeDirectorySiteCode");
    }
    /**
     * Gets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockActiveDirectorySiteAutoDiscovery() {
        return this.BackingStore.get("blockActiveDirectorySiteAutoDiscovery");
    }
    /**
     * Gets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockAutomaticLogin() {
        return this.BackingStore.get("blockAutomaticLogin");
    }
    /**
     * Gets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCacheName() {
        return this.BackingStore.get("cacheName");
    }
    /**
     * Gets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCredentialBundleIdAccessControlList() {
        return this.BackingStore.get("credentialBundleIdAccessControlList");
    }
    /**
     * Gets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomainRealms() {
        return this.BackingStore.get("domainRealms");
    }
    /**
     * Gets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.BackingStore.get("domains");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultRealm() {
        return this.BackingStore.get("isDefaultRealm");
    }
    /**
     * Gets the passwordBlockModification property value. Enables or disables password changes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockModification() {
        return this.BackingStore.get("passwordBlockModification");
    }
    /**
     * Gets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPasswordChangeUrl() {
        return this.BackingStore.get("passwordChangeUrl");
    }
    /**
     * Gets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordEnableLocalSync() {
        return this.BackingStore.get("passwordEnableLocalSync");
    }
    /**
     * Gets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.BackingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationNotificationDays() {
        return this.BackingStore.get("passwordExpirationNotificationDays");
    }
    /**
     * Gets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumAgeDays() {
        return this.BackingStore.get("passwordMinimumAgeDays");
    }
    /**
     * Gets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.BackingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.BackingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequireActiveDirectoryComplexity() {
        return this.BackingStore.get("passwordRequireActiveDirectoryComplexity");
    }
    /**
     * Gets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPasswordRequirementsDescription() {
        return this.BackingStore.get("passwordRequirementsDescription");
    }
    /**
     * Gets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealm() {
        return this.BackingStore.get("realm");
    }
    /**
     * Gets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireUserPresence() {
        return this.BackingStore.get("requireUserPresence");
    }
    /**
     * Gets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.BackingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActiveDirectorySiteCode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("activeDirectorySiteCode", value);
    }
    /**
     * Sets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @param value Value to set for the blockActiveDirectorySiteAutoDiscovery property.
     */
    public void setBlockActiveDirectorySiteAutoDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("blockActiveDirectorySiteAutoDiscovery", value);
    }
    /**
     * Sets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @param value Value to set for the blockAutomaticLogin property.
     */
    public void setBlockAutomaticLogin(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("blockAutomaticLogin", value);
    }
    /**
     * Sets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @param value Value to set for the cacheName property.
     */
    public void setCacheName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("cacheName", value);
    }
    /**
     * Sets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @param value Value to set for the credentialBundleIdAccessControlList property.
     */
    public void setCredentialBundleIdAccessControlList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("credentialBundleIdAccessControlList", value);
    }
    /**
     * Sets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @param value Value to set for the domainRealms property.
     */
    public void setDomainRealms(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("domainRealms", value);
    }
    /**
     * Sets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @param value Value to set for the domains property.
     */
    public void setDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("domains", value);
    }
    /**
     * Sets the isDefaultRealm property value. When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     * @param value Value to set for the isDefaultRealm property.
     */
    public void setIsDefaultRealm(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isDefaultRealm", value);
    }
    /**
     * Sets the passwordBlockModification property value. Enables or disables password changes.
     * @param value Value to set for the passwordBlockModification property.
     */
    public void setPasswordBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordBlockModification", value);
    }
    /**
     * Sets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @param value Value to set for the passwordChangeUrl property.
     */
    public void setPasswordChangeUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("passwordChangeUrl", value);
    }
    /**
     * Sets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @param value Value to set for the passwordEnableLocalSync property.
     */
    public void setPasswordEnableLocalSync(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordEnableLocalSync", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @param value Value to set for the passwordExpirationNotificationDays property.
     */
    public void setPasswordExpirationNotificationDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordExpirationNotificationDays", value);
    }
    /**
     * Sets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @param value Value to set for the passwordMinimumAgeDays property.
     */
    public void setPasswordMinimumAgeDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordMinimumAgeDays", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @param value Value to set for the passwordRequireActiveDirectoryComplexity property.
     */
    public void setPasswordRequireActiveDirectoryComplexity(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordRequireActiveDirectoryComplexity", value);
    }
    /**
     * Sets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @param value Value to set for the passwordRequirementsDescription property.
     */
    public void setPasswordRequirementsDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("passwordRequirementsDescription", value);
    }
    /**
     * Sets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @param value Value to set for the realm property.
     */
    public void setRealm(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("realm", value);
    }
    /**
     * Sets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @param value Value to set for the requireUserPresence property.
     */
    public void setRequireUserPresence(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("requireUserPresence", value);
    }
    /**
     * Sets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userPrincipalName", value);
    }
}
