package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a Kerberos-type Single Sign-On extension profile for iOS devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosKerberosSingleSignOnExtension extends IosSingleSignOnExtension implements Parsable {
    /**
     * Instantiates a new {@link IosKerberosSingleSignOnExtension} and sets the default values.
     */
    public IosKerberosSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.iosKerberosSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosKerberosSingleSignOnExtension}
     */
    @jakarta.annotation.Nonnull
    public static IosKerberosSingleSignOnExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosKerberosSingleSignOnExtension();
    }
    /**
     * Gets the activeDirectorySiteCode property value. Gets or sets the Active Directory site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActiveDirectorySiteCode() {
        return this.backingStore.get("activeDirectorySiteCode");
    }
    /**
     * Gets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockActiveDirectorySiteAutoDiscovery() {
        return this.backingStore.get("blockActiveDirectorySiteAutoDiscovery");
    }
    /**
     * Gets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockAutomaticLogin() {
        return this.backingStore.get("blockAutomaticLogin");
    }
    /**
     * Gets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCacheName() {
        return this.backingStore.get("cacheName");
    }
    /**
     * Gets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCredentialBundleIdAccessControlList() {
        return this.backingStore.get("credentialBundleIdAccessControlList");
    }
    /**
     * Gets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomainRealms() {
        return this.backingStore.get("domainRealms");
    }
    /**
     * Gets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.backingStore.get("domains");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
        deserializerMap.put("managedAppsInBundleIdACLIncluded", (n) -> { this.setManagedAppsInBundleIdACLIncluded(n.getBooleanValue()); });
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
        deserializerMap.put("signInHelpText", (n) -> { this.setSignInHelpText(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultRealm property value. When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultRealm() {
        return this.backingStore.get("isDefaultRealm");
    }
    /**
     * Gets the managedAppsInBundleIdACLIncluded property value. When set to True, the Kerberos extension allows managed apps, and any apps entered with the app bundle ID to access the credential. When set to False, the Kerberos extension allows all apps to access the credential. Available for devices running iOS and iPadOS versions 14 and later.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getManagedAppsInBundleIdACLIncluded() {
        return this.backingStore.get("managedAppsInBundleIdACLIncluded");
    }
    /**
     * Gets the passwordBlockModification property value. Enables or disables password changes.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockModification() {
        return this.backingStore.get("passwordBlockModification");
    }
    /**
     * Gets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPasswordChangeUrl() {
        return this.backingStore.get("passwordChangeUrl");
    }
    /**
     * Gets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordEnableLocalSync() {
        return this.backingStore.get("passwordEnableLocalSync");
    }
    /**
     * Gets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationNotificationDays() {
        return this.backingStore.get("passwordExpirationNotificationDays");
    }
    /**
     * Gets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumAgeDays() {
        return this.backingStore.get("passwordMinimumAgeDays");
    }
    /**
     * Gets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequireActiveDirectoryComplexity() {
        return this.backingStore.get("passwordRequireActiveDirectoryComplexity");
    }
    /**
     * Gets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPasswordRequirementsDescription() {
        return this.backingStore.get("passwordRequirementsDescription");
    }
    /**
     * Gets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRealm() {
        return this.backingStore.get("realm");
    }
    /**
     * Gets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireUserPresence() {
        return this.backingStore.get("requireUserPresence");
    }
    /**
     * Gets the signInHelpText property value. Text displayed to the user at the Kerberos sign in window. Available for devices running iOS and iPadOS versions 14 and later.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignInHelpText() {
        return this.backingStore.get("signInHelpText");
    }
    /**
     * Gets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
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
        writer.writeBooleanValue("managedAppsInBundleIdACLIncluded", this.getManagedAppsInBundleIdACLIncluded());
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
        writer.writeStringValue("signInHelpText", this.getSignInHelpText());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the activeDirectorySiteCode property value. Gets or sets the Active Directory site.
     * @param value Value to set for the activeDirectorySiteCode property.
     */
    public void setActiveDirectorySiteCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activeDirectorySiteCode", value);
    }
    /**
     * Sets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @param value Value to set for the blockActiveDirectorySiteAutoDiscovery property.
     */
    public void setBlockActiveDirectorySiteAutoDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockActiveDirectorySiteAutoDiscovery", value);
    }
    /**
     * Sets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @param value Value to set for the blockAutomaticLogin property.
     */
    public void setBlockAutomaticLogin(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockAutomaticLogin", value);
    }
    /**
     * Sets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @param value Value to set for the cacheName property.
     */
    public void setCacheName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cacheName", value);
    }
    /**
     * Sets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @param value Value to set for the credentialBundleIdAccessControlList property.
     */
    public void setCredentialBundleIdAccessControlList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("credentialBundleIdAccessControlList", value);
    }
    /**
     * Sets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @param value Value to set for the domainRealms property.
     */
    public void setDomainRealms(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domainRealms", value);
    }
    /**
     * Sets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @param value Value to set for the domains property.
     */
    public void setDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domains", value);
    }
    /**
     * Sets the isDefaultRealm property value. When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     * @param value Value to set for the isDefaultRealm property.
     */
    public void setIsDefaultRealm(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultRealm", value);
    }
    /**
     * Sets the managedAppsInBundleIdACLIncluded property value. When set to True, the Kerberos extension allows managed apps, and any apps entered with the app bundle ID to access the credential. When set to False, the Kerberos extension allows all apps to access the credential. Available for devices running iOS and iPadOS versions 14 and later.
     * @param value Value to set for the managedAppsInBundleIdACLIncluded property.
     */
    public void setManagedAppsInBundleIdACLIncluded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("managedAppsInBundleIdACLIncluded", value);
    }
    /**
     * Sets the passwordBlockModification property value. Enables or disables password changes.
     * @param value Value to set for the passwordBlockModification property.
     */
    public void setPasswordBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockModification", value);
    }
    /**
     * Sets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @param value Value to set for the passwordChangeUrl property.
     */
    public void setPasswordChangeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passwordChangeUrl", value);
    }
    /**
     * Sets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @param value Value to set for the passwordEnableLocalSync property.
     */
    public void setPasswordEnableLocalSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordEnableLocalSync", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @param value Value to set for the passwordExpirationNotificationDays property.
     */
    public void setPasswordExpirationNotificationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationNotificationDays", value);
    }
    /**
     * Sets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @param value Value to set for the passwordMinimumAgeDays property.
     */
    public void setPasswordMinimumAgeDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumAgeDays", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @param value Value to set for the passwordRequireActiveDirectoryComplexity property.
     */
    public void setPasswordRequireActiveDirectoryComplexity(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequireActiveDirectoryComplexity", value);
    }
    /**
     * Sets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @param value Value to set for the passwordRequirementsDescription property.
     */
    public void setPasswordRequirementsDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passwordRequirementsDescription", value);
    }
    /**
     * Sets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @param value Value to set for the realm property.
     */
    public void setRealm(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("realm", value);
    }
    /**
     * Sets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @param value Value to set for the requireUserPresence property.
     */
    public void setRequireUserPresence(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireUserPresence", value);
    }
    /**
     * Sets the signInHelpText property value. Text displayed to the user at the Kerberos sign in window. Available for devices running iOS and iPadOS versions 14 and later.
     * @param value Value to set for the signInHelpText property.
     */
    public void setSignInHelpText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signInHelpText", value);
    }
    /**
     * Sets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
