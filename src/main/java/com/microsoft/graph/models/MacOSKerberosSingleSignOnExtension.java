package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSKerberosSingleSignOnExtension extends MacOSSingleSignOnExtension implements Parsable {
    /** Gets or sets the Active Directory site. */
    private String _activeDirectorySiteCode;
    /** Enables or disables whether the Kerberos extension can automatically determine its site name. */
    private Boolean _blockActiveDirectorySiteAutoDiscovery;
    /** Enables or disables Keychain usage. */
    private Boolean _blockAutomaticLogin;
    /** Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile. */
    private String _cacheName;
    /** Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket. */
    private java.util.List<String> _credentialBundleIdAccessControlList;
    /** When set to True, the credential is requested on the next matching Kerberos challenge or network state change. When the credential is expired or missing, a new credential is created. Available for devices running macOS versions 12 and later. */
    private Boolean _credentialsCacheMonitored;
    /** Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive. */
    private java.util.List<String> _domainRealms;
    /** Gets or sets a list of hosts or domain names for which the app extension performs SSO. */
    private java.util.List<String> _domains;
    /** When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured. */
    private Boolean _isDefaultRealm;
    /** When set to True, the Kerberos extension allows any apps entered with the app bundle ID, managed apps, and standard Kerberos utilities, such as TicketViewer and klist, to access and use the credential. Available for devices running macOS versions 12 and later. */
    private Boolean _kerberosAppsInBundleIdACLIncluded;
    /** When set to True, the Kerberos extension allows managed apps, and any apps entered with the app bundle ID to access the credential. When set to False, the Kerberos extension allows all apps to access the credential. Available for devices running iOS and iPadOS versions 14 and later. */
    private Boolean _managedAppsInBundleIdACLIncluded;
    /** Select how other processes use the Kerberos Extension credential. */
    private String _modeCredentialUsed;
    /** Enables or disables password changes. */
    private Boolean _passwordBlockModification;
    /** Gets or sets the URL that the user will be sent to when they initiate a password change. */
    private String _passwordChangeUrl;
    /** Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS. */
    private Boolean _passwordEnableLocalSync;
    /** Overrides the default password expiration in days. For most domains, this value is calculated automatically. */
    private Integer _passwordExpirationDays;
    /** Gets or sets the number of days until the user is notified that their password will expire (default is 15). */
    private Integer _passwordExpirationNotificationDays;
    /** Gets or sets the minimum number of days until a user can change their password again. */
    private Integer _passwordMinimumAgeDays;
    /** Gets or sets the minimum length of a password. */
    private Integer _passwordMinimumLength;
    /** Gets or sets the number of previous passwords to block. */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Enables or disables whether passwords must meet Active Directory's complexity requirements. */
    private Boolean _passwordRequireActiveDirectoryComplexity;
    /** Gets or sets a description of the password complexity requirements. */
    private String _passwordRequirementsDescription;
    /** Add creates an ordered list of preferred Key Distribution Centers (KDCs) to use for Kerberos traffic. This list is used when the servers are not discoverable using DNS. When the servers are discoverable, the list is used for both connectivity checks, and used first for Kerberos traffic. If the servers dont respond, then the device uses DNS discovery. Delete removes an existing list, and devices use DNS discovery. Available for devices running macOS versions 12 and later. */
    private java.util.List<String> _preferredKDCs;
    /** Gets or sets the case-sensitive realm name for this profile. */
    private String _realm;
    /** Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry. */
    private Boolean _requireUserPresence;
    /** Text displayed to the user at the Kerberos sign in window. Available for devices running iOS and iPadOS versions 14 and later. */
    private String _signInHelpText;
    /** When set to True, LDAP connections are required to use Transport Layer Security (TLS). Available for devices running macOS versions 11 and later. */
    private Boolean _tlsForLDAPRequired;
    /** This label replaces the user name shown in the Kerberos extension. You can enter a name to match the name of your company or organization. Available for devices running macOS versions 11 and later. */
    private String _usernameLabelCustom;
    /** Gets or sets the principle user name to use for this profile. The realm name does not need to be included. */
    private String _userPrincipalName;
    /** When set to True, the user isnt prompted to set up the Kerberos extension until the extension is enabled by the admin, or a Kerberos challenge is received. Available for devices running macOS versions 11 and later. */
    private Boolean _userSetupDelayed;
    /**
     * Instantiates a new MacOSKerberosSingleSignOnExtension and sets the default values.
     * @return a void
     */
    public MacOSKerberosSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.macOSKerberosSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSKerberosSingleSignOnExtension
     */
    @javax.annotation.Nonnull
    public static MacOSKerberosSingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSKerberosSingleSignOnExtension();
    }
    /**
     * Gets the activeDirectorySiteCode property value. Gets or sets the Active Directory site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActiveDirectorySiteCode() {
        return this._activeDirectorySiteCode;
    }
    /**
     * Gets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockActiveDirectorySiteAutoDiscovery() {
        return this._blockActiveDirectorySiteAutoDiscovery;
    }
    /**
     * Gets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockAutomaticLogin() {
        return this._blockAutomaticLogin;
    }
    /**
     * Gets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCacheName() {
        return this._cacheName;
    }
    /**
     * Gets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCredentialBundleIdAccessControlList() {
        return this._credentialBundleIdAccessControlList;
    }
    /**
     * Gets the credentialsCacheMonitored property value. When set to True, the credential is requested on the next matching Kerberos challenge or network state change. When the credential is expired or missing, a new credential is created. Available for devices running macOS versions 12 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCredentialsCacheMonitored() {
        return this._credentialsCacheMonitored;
    }
    /**
     * Gets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomainRealms() {
        return this._domainRealms;
    }
    /**
     * Gets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this._domains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSKerberosSingleSignOnExtension currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeDirectorySiteCode", (n) -> { currentObject.setActiveDirectorySiteCode(n.getStringValue()); });
            this.put("blockActiveDirectorySiteAutoDiscovery", (n) -> { currentObject.setBlockActiveDirectorySiteAutoDiscovery(n.getBooleanValue()); });
            this.put("blockAutomaticLogin", (n) -> { currentObject.setBlockAutomaticLogin(n.getBooleanValue()); });
            this.put("cacheName", (n) -> { currentObject.setCacheName(n.getStringValue()); });
            this.put("credentialBundleIdAccessControlList", (n) -> { currentObject.setCredentialBundleIdAccessControlList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("credentialsCacheMonitored", (n) -> { currentObject.setCredentialsCacheMonitored(n.getBooleanValue()); });
            this.put("domainRealms", (n) -> { currentObject.setDomainRealms(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("domains", (n) -> { currentObject.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isDefaultRealm", (n) -> { currentObject.setIsDefaultRealm(n.getBooleanValue()); });
            this.put("kerberosAppsInBundleIdACLIncluded", (n) -> { currentObject.setKerberosAppsInBundleIdACLIncluded(n.getBooleanValue()); });
            this.put("managedAppsInBundleIdACLIncluded", (n) -> { currentObject.setManagedAppsInBundleIdACLIncluded(n.getBooleanValue()); });
            this.put("modeCredentialUsed", (n) -> { currentObject.setModeCredentialUsed(n.getStringValue()); });
            this.put("passwordBlockModification", (n) -> { currentObject.setPasswordBlockModification(n.getBooleanValue()); });
            this.put("passwordChangeUrl", (n) -> { currentObject.setPasswordChangeUrl(n.getStringValue()); });
            this.put("passwordEnableLocalSync", (n) -> { currentObject.setPasswordEnableLocalSync(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordExpirationNotificationDays", (n) -> { currentObject.setPasswordExpirationNotificationDays(n.getIntegerValue()); });
            this.put("passwordMinimumAgeDays", (n) -> { currentObject.setPasswordMinimumAgeDays(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequireActiveDirectoryComplexity", (n) -> { currentObject.setPasswordRequireActiveDirectoryComplexity(n.getBooleanValue()); });
            this.put("passwordRequirementsDescription", (n) -> { currentObject.setPasswordRequirementsDescription(n.getStringValue()); });
            this.put("preferredKDCs", (n) -> { currentObject.setPreferredKDCs(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("realm", (n) -> { currentObject.setRealm(n.getStringValue()); });
            this.put("requireUserPresence", (n) -> { currentObject.setRequireUserPresence(n.getBooleanValue()); });
            this.put("signInHelpText", (n) -> { currentObject.setSignInHelpText(n.getStringValue()); });
            this.put("tlsForLDAPRequired", (n) -> { currentObject.setTlsForLDAPRequired(n.getBooleanValue()); });
            this.put("usernameLabelCustom", (n) -> { currentObject.setUsernameLabelCustom(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("userSetupDelayed", (n) -> { currentObject.setUserSetupDelayed(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isDefaultRealm property value. When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultRealm() {
        return this._isDefaultRealm;
    }
    /**
     * Gets the kerberosAppsInBundleIdACLIncluded property value. When set to True, the Kerberos extension allows any apps entered with the app bundle ID, managed apps, and standard Kerberos utilities, such as TicketViewer and klist, to access and use the credential. Available for devices running macOS versions 12 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKerberosAppsInBundleIdACLIncluded() {
        return this._kerberosAppsInBundleIdACLIncluded;
    }
    /**
     * Gets the managedAppsInBundleIdACLIncluded property value. When set to True, the Kerberos extension allows managed apps, and any apps entered with the app bundle ID to access the credential. When set to False, the Kerberos extension allows all apps to access the credential. Available for devices running iOS and iPadOS versions 14 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedAppsInBundleIdACLIncluded() {
        return this._managedAppsInBundleIdACLIncluded;
    }
    /**
     * Gets the modeCredentialUsed property value. Select how other processes use the Kerberos Extension credential.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModeCredentialUsed() {
        return this._modeCredentialUsed;
    }
    /**
     * Gets the passwordBlockModification property value. Enables or disables password changes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockModification() {
        return this._passwordBlockModification;
    }
    /**
     * Gets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordChangeUrl() {
        return this._passwordChangeUrl;
    }
    /**
     * Gets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordEnableLocalSync() {
        return this._passwordEnableLocalSync;
    }
    /**
     * Gets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationNotificationDays() {
        return this._passwordExpirationNotificationDays;
    }
    /**
     * Gets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumAgeDays() {
        return this._passwordMinimumAgeDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequireActiveDirectoryComplexity() {
        return this._passwordRequireActiveDirectoryComplexity;
    }
    /**
     * Gets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordRequirementsDescription() {
        return this._passwordRequirementsDescription;
    }
    /**
     * Gets the preferredKDCs property value. Add creates an ordered list of preferred Key Distribution Centers (KDCs) to use for Kerberos traffic. This list is used when the servers are not discoverable using DNS. When the servers are discoverable, the list is used for both connectivity checks, and used first for Kerberos traffic. If the servers dont respond, then the device uses DNS discovery. Delete removes an existing list, and devices use DNS discovery. Available for devices running macOS versions 12 and later.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPreferredKDCs() {
        return this._preferredKDCs;
    }
    /**
     * Gets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealm() {
        return this._realm;
    }
    /**
     * Gets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireUserPresence() {
        return this._requireUserPresence;
    }
    /**
     * Gets the signInHelpText property value. Text displayed to the user at the Kerberos sign in window. Available for devices running iOS and iPadOS versions 14 and later.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInHelpText() {
        return this._signInHelpText;
    }
    /**
     * Gets the tlsForLDAPRequired property value. When set to True, LDAP connections are required to use Transport Layer Security (TLS). Available for devices running macOS versions 11 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTlsForLDAPRequired() {
        return this._tlsForLDAPRequired;
    }
    /**
     * Gets the usernameLabelCustom property value. This label replaces the user name shown in the Kerberos extension. You can enter a name to match the name of your company or organization. Available for devices running macOS versions 11 and later.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsernameLabelCustom() {
        return this._usernameLabelCustom;
    }
    /**
     * Gets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the userSetupDelayed property value. When set to True, the user isnt prompted to set up the Kerberos extension until the extension is enabled by the admin, or a Kerberos challenge is received. Available for devices running macOS versions 11 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserSetupDelayed() {
        return this._userSetupDelayed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activeDirectorySiteCode", this.getActiveDirectorySiteCode());
        writer.writeBooleanValue("blockActiveDirectorySiteAutoDiscovery", this.getBlockActiveDirectorySiteAutoDiscovery());
        writer.writeBooleanValue("blockAutomaticLogin", this.getBlockAutomaticLogin());
        writer.writeStringValue("cacheName", this.getCacheName());
        writer.writeCollectionOfPrimitiveValues("credentialBundleIdAccessControlList", this.getCredentialBundleIdAccessControlList());
        writer.writeBooleanValue("credentialsCacheMonitored", this.getCredentialsCacheMonitored());
        writer.writeCollectionOfPrimitiveValues("domainRealms", this.getDomainRealms());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
        writer.writeBooleanValue("isDefaultRealm", this.getIsDefaultRealm());
        writer.writeBooleanValue("kerberosAppsInBundleIdACLIncluded", this.getKerberosAppsInBundleIdACLIncluded());
        writer.writeBooleanValue("managedAppsInBundleIdACLIncluded", this.getManagedAppsInBundleIdACLIncluded());
        writer.writeStringValue("modeCredentialUsed", this.getModeCredentialUsed());
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
        writer.writeCollectionOfPrimitiveValues("preferredKDCs", this.getPreferredKDCs());
        writer.writeStringValue("realm", this.getRealm());
        writer.writeBooleanValue("requireUserPresence", this.getRequireUserPresence());
        writer.writeStringValue("signInHelpText", this.getSignInHelpText());
        writer.writeBooleanValue("tlsForLDAPRequired", this.getTlsForLDAPRequired());
        writer.writeStringValue("usernameLabelCustom", this.getUsernameLabelCustom());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeBooleanValue("userSetupDelayed", this.getUserSetupDelayed());
    }
    /**
     * Sets the activeDirectorySiteCode property value. Gets or sets the Active Directory site.
     * @param value Value to set for the activeDirectorySiteCode property.
     * @return a void
     */
    public void setActiveDirectorySiteCode(@javax.annotation.Nullable final String value) {
        this._activeDirectorySiteCode = value;
    }
    /**
     * Sets the blockActiveDirectorySiteAutoDiscovery property value. Enables or disables whether the Kerberos extension can automatically determine its site name.
     * @param value Value to set for the blockActiveDirectorySiteAutoDiscovery property.
     * @return a void
     */
    public void setBlockActiveDirectorySiteAutoDiscovery(@javax.annotation.Nullable final Boolean value) {
        this._blockActiveDirectorySiteAutoDiscovery = value;
    }
    /**
     * Sets the blockAutomaticLogin property value. Enables or disables Keychain usage.
     * @param value Value to set for the blockAutomaticLogin property.
     * @return a void
     */
    public void setBlockAutomaticLogin(@javax.annotation.Nullable final Boolean value) {
        this._blockAutomaticLogin = value;
    }
    /**
     * Sets the cacheName property value. Gets or sets the Generic Security Services name of the Kerberos cache to use for this profile.
     * @param value Value to set for the cacheName property.
     * @return a void
     */
    public void setCacheName(@javax.annotation.Nullable final String value) {
        this._cacheName = value;
    }
    /**
     * Sets the credentialBundleIdAccessControlList property value. Gets or sets a list of app Bundle IDs allowed to access the Kerberos Ticket Granting Ticket.
     * @param value Value to set for the credentialBundleIdAccessControlList property.
     * @return a void
     */
    public void setCredentialBundleIdAccessControlList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._credentialBundleIdAccessControlList = value;
    }
    /**
     * Sets the credentialsCacheMonitored property value. When set to True, the credential is requested on the next matching Kerberos challenge or network state change. When the credential is expired or missing, a new credential is created. Available for devices running macOS versions 12 and later.
     * @param value Value to set for the credentialsCacheMonitored property.
     * @return a void
     */
    public void setCredentialsCacheMonitored(@javax.annotation.Nullable final Boolean value) {
        this._credentialsCacheMonitored = value;
    }
    /**
     * Sets the domainRealms property value. Gets or sets a list of realms for custom domain-realm mapping. Realms are case sensitive.
     * @param value Value to set for the domainRealms property.
     * @return a void
     */
    public void setDomainRealms(@javax.annotation.Nullable final java.util.List<String> value) {
        this._domainRealms = value;
    }
    /**
     * Sets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @param value Value to set for the domains property.
     * @return a void
     */
    public void setDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._domains = value;
    }
    /**
     * Sets the isDefaultRealm property value. When true, this profile's realm will be selected as the default. Necessary if multiple Kerberos-type profiles are configured.
     * @param value Value to set for the isDefaultRealm property.
     * @return a void
     */
    public void setIsDefaultRealm(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultRealm = value;
    }
    /**
     * Sets the kerberosAppsInBundleIdACLIncluded property value. When set to True, the Kerberos extension allows any apps entered with the app bundle ID, managed apps, and standard Kerberos utilities, such as TicketViewer and klist, to access and use the credential. Available for devices running macOS versions 12 and later.
     * @param value Value to set for the kerberosAppsInBundleIdACLIncluded property.
     * @return a void
     */
    public void setKerberosAppsInBundleIdACLIncluded(@javax.annotation.Nullable final Boolean value) {
        this._kerberosAppsInBundleIdACLIncluded = value;
    }
    /**
     * Sets the managedAppsInBundleIdACLIncluded property value. When set to True, the Kerberos extension allows managed apps, and any apps entered with the app bundle ID to access the credential. When set to False, the Kerberos extension allows all apps to access the credential. Available for devices running iOS and iPadOS versions 14 and later.
     * @param value Value to set for the managedAppsInBundleIdACLIncluded property.
     * @return a void
     */
    public void setManagedAppsInBundleIdACLIncluded(@javax.annotation.Nullable final Boolean value) {
        this._managedAppsInBundleIdACLIncluded = value;
    }
    /**
     * Sets the modeCredentialUsed property value. Select how other processes use the Kerberos Extension credential.
     * @param value Value to set for the modeCredentialUsed property.
     * @return a void
     */
    public void setModeCredentialUsed(@javax.annotation.Nullable final String value) {
        this._modeCredentialUsed = value;
    }
    /**
     * Sets the passwordBlockModification property value. Enables or disables password changes.
     * @param value Value to set for the passwordBlockModification property.
     * @return a void
     */
    public void setPasswordBlockModification(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockModification = value;
    }
    /**
     * Sets the passwordChangeUrl property value. Gets or sets the URL that the user will be sent to when they initiate a password change.
     * @param value Value to set for the passwordChangeUrl property.
     * @return a void
     */
    public void setPasswordChangeUrl(@javax.annotation.Nullable final String value) {
        this._passwordChangeUrl = value;
    }
    /**
     * Sets the passwordEnableLocalSync property value. Enables or disables password syncing. This won't affect users logged in with a mobile account on macOS.
     * @param value Value to set for the passwordEnableLocalSync property.
     * @return a void
     */
    public void setPasswordEnableLocalSync(@javax.annotation.Nullable final Boolean value) {
        this._passwordEnableLocalSync = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Overrides the default password expiration in days. For most domains, this value is calculated automatically.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordExpirationNotificationDays property value. Gets or sets the number of days until the user is notified that their password will expire (default is 15).
     * @param value Value to set for the passwordExpirationNotificationDays property.
     * @return a void
     */
    public void setPasswordExpirationNotificationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationNotificationDays = value;
    }
    /**
     * Sets the passwordMinimumAgeDays property value. Gets or sets the minimum number of days until a user can change their password again.
     * @param value Value to set for the passwordMinimumAgeDays property.
     * @return a void
     */
    public void setPasswordMinimumAgeDays(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumAgeDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Gets or sets the minimum length of a password.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Gets or sets the number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequireActiveDirectoryComplexity property value. Enables or disables whether passwords must meet Active Directory's complexity requirements.
     * @param value Value to set for the passwordRequireActiveDirectoryComplexity property.
     * @return a void
     */
    public void setPasswordRequireActiveDirectoryComplexity(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequireActiveDirectoryComplexity = value;
    }
    /**
     * Sets the passwordRequirementsDescription property value. Gets or sets a description of the password complexity requirements.
     * @param value Value to set for the passwordRequirementsDescription property.
     * @return a void
     */
    public void setPasswordRequirementsDescription(@javax.annotation.Nullable final String value) {
        this._passwordRequirementsDescription = value;
    }
    /**
     * Sets the preferredKDCs property value. Add creates an ordered list of preferred Key Distribution Centers (KDCs) to use for Kerberos traffic. This list is used when the servers are not discoverable using DNS. When the servers are discoverable, the list is used for both connectivity checks, and used first for Kerberos traffic. If the servers dont respond, then the device uses DNS discovery. Delete removes an existing list, and devices use DNS discovery. Available for devices running macOS versions 12 and later.
     * @param value Value to set for the preferredKDCs property.
     * @return a void
     */
    public void setPreferredKDCs(@javax.annotation.Nullable final java.util.List<String> value) {
        this._preferredKDCs = value;
    }
    /**
     * Sets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @param value Value to set for the realm property.
     * @return a void
     */
    public void setRealm(@javax.annotation.Nullable final String value) {
        this._realm = value;
    }
    /**
     * Sets the requireUserPresence property value. Gets or sets whether to require authentication via Touch ID, Face ID, or a passcode to access the keychain entry.
     * @param value Value to set for the requireUserPresence property.
     * @return a void
     */
    public void setRequireUserPresence(@javax.annotation.Nullable final Boolean value) {
        this._requireUserPresence = value;
    }
    /**
     * Sets the signInHelpText property value. Text displayed to the user at the Kerberos sign in window. Available for devices running iOS and iPadOS versions 14 and later.
     * @param value Value to set for the signInHelpText property.
     * @return a void
     */
    public void setSignInHelpText(@javax.annotation.Nullable final String value) {
        this._signInHelpText = value;
    }
    /**
     * Sets the tlsForLDAPRequired property value. When set to True, LDAP connections are required to use Transport Layer Security (TLS). Available for devices running macOS versions 11 and later.
     * @param value Value to set for the tlsForLDAPRequired property.
     * @return a void
     */
    public void setTlsForLDAPRequired(@javax.annotation.Nullable final Boolean value) {
        this._tlsForLDAPRequired = value;
    }
    /**
     * Sets the usernameLabelCustom property value. This label replaces the user name shown in the Kerberos extension. You can enter a name to match the name of your company or organization. Available for devices running macOS versions 11 and later.
     * @param value Value to set for the usernameLabelCustom property.
     * @return a void
     */
    public void setUsernameLabelCustom(@javax.annotation.Nullable final String value) {
        this._usernameLabelCustom = value;
    }
    /**
     * Sets the userPrincipalName property value. Gets or sets the principle user name to use for this profile. The realm name does not need to be included.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the userSetupDelayed property value. When set to True, the user isnt prompted to set up the Kerberos extension until the extension is enabled by the admin, or a Kerberos challenge is received. Available for devices running macOS versions 11 and later.
     * @param value Value to set for the userSetupDelayed property.
     * @return a void
     */
    public void setUserSetupDelayed(@javax.annotation.Nullable final Boolean value) {
        this._userSetupDelayed = value;
    }
}
