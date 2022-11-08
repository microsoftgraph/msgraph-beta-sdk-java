package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements Parsable {
    /** Whether to show admin host information on the login window. */
    private Boolean _adminShowHostInfo;
    /** Gets or sets a list that maps apps to their associated domains. Application identifiers must be unique. This collection can contain a maximum of 500 elements. */
    private java.util.List<MacOSAssociatedDomainsItem> _appAssociatedDomains;
    /** DEPRECATED: use appAssociatedDomains instead. Gets or sets a list that maps apps to their associated domains. The key should match the app's ID, and the value should be a string in the form of 'service:domain' where domain is a fully qualified hostname (e.g. webcredentials:example.com). This collection can contain a maximum of 500 elements. */
    private java.util.List<KeyValuePair> _associatedDomains;
    /** Whether to show the name and password dialog or a list of users on the login window. */
    private Boolean _authorizedUsersListHidden;
    /** Whether to hide admin users in the authorized users list on the login window. */
    private Boolean _authorizedUsersListHideAdminUsers;
    /** Whether to show only network and system users in the authorized users list on the login window. */
    private Boolean _authorizedUsersListHideLocalUsers;
    /** Whether to hide mobile users in the authorized users list on the login window. */
    private Boolean _authorizedUsersListHideMobileAccounts;
    /** Whether to show network users in the authorized users list on the login window. */
    private Boolean _authorizedUsersListIncludeNetworkUsers;
    /** Whether to show other users in the authorized users list on the login window. */
    private Boolean _authorizedUsersListShowOtherManagedUsers;
    /** List of applications, files, folders, and other items to launch when the user logs in. This collection can contain a maximum of 500 elements. */
    private java.util.List<MacOSLaunchItem> _autoLaunchItems;
    /** Whether the Other user will disregard use of the console special user name. */
    private Boolean _consoleAccessDisabled;
    /** Prevents content caches from purging content to free up disk space for other apps. */
    private Boolean _contentCachingBlockDeletion;
    /** A list of custom IP ranges content caches will use to listen for clients. This collection can contain a maximum of 500 elements. */
    private java.util.List<IpRange> _contentCachingClientListenRanges;
    /** Determines which clients a content cache will serve. */
    private MacOSContentCachingClientPolicy _contentCachingClientPolicy;
    /** The path to the directory used to store cached content. The value must be (or end with) /Library/Application Support/Apple/AssetCache/Data */
    private String _contentCachingDataPath;
    /** Disables internet connection sharing. */
    private Boolean _contentCachingDisableConnectionSharing;
    /** Enables content caching and prevents it from being disabled by the user. */
    private Boolean _contentCachingEnabled;
    /** Forces internet connection sharing. contentCachingDisableConnectionSharing overrides this setting. */
    private Boolean _contentCachingForceConnectionSharing;
    /** Prevent the device from sleeping if content caching is enabled. */
    private Boolean _contentCachingKeepAwake;
    /** Enables logging of IP addresses and ports of clients that request cached content. */
    private Boolean _contentCachingLogClientIdentities;
    /** The maximum number of bytes of disk space that will be used for the content cache. A value of 0 (default) indicates unlimited disk space. */
    private Long _contentCachingMaxSizeBytes;
    /** A list of IP addresses representing parent content caches. */
    private java.util.List<String> _contentCachingParents;
    /** Determines how content caches select a parent cache. */
    private MacOSContentCachingParentSelectionPolicy _contentCachingParentSelectionPolicy;
    /** A list of custom IP ranges content caches will use to query for content from peers caches. This collection can contain a maximum of 500 elements. */
    private java.util.List<IpRange> _contentCachingPeerFilterRanges;
    /** A list of custom IP ranges content caches will use to listen for peer caches. This collection can contain a maximum of 500 elements. */
    private java.util.List<IpRange> _contentCachingPeerListenRanges;
    /** Determines which content caches other content caches will peer with. */
    private MacOSContentCachingPeerPolicy _contentCachingPeerPolicy;
    /** Sets the port used for content caching. If the value is 0, a random available port will be selected. Valid values 0 to 65535 */
    private Integer _contentCachingPort;
    /** A list of custom IP ranges that Apple's content caching service should use to match clients to content caches. This collection can contain a maximum of 500 elements. */
    private java.util.List<IpRange> _contentCachingPublicRanges;
    /** Display content caching alerts as system notifications. */
    private Boolean _contentCachingShowAlerts;
    /** Indicates the type of content allowed to be cached by Apple's content caching service. */
    private MacOSContentCachingType _contentCachingType;
    /** Custom text to be displayed on the login window. */
    private String _loginWindowText;
    /** Whether the Log Out menu item on the login window will be disabled while the user is logged in. */
    private Boolean _logOutDisabledWhileLoggedIn;
    /** Gets or sets a single sign-on extension profile. */
    private MacOSSingleSignOnExtension _macOSSingleSignOnExtension;
    /** Whether the Power Off menu item on the login window will be disabled while the user is logged in. */
    private Boolean _powerOffDisabledWhileLoggedIn;
    /** Whether to hide the Restart button item on the login window. */
    private Boolean _restartDisabled;
    /** Whether the Restart menu item on the login window will be disabled while the user is logged in. */
    private Boolean _restartDisabledWhileLoggedIn;
    /** Whether to disable the immediate screen lock functions. */
    private Boolean _screenLockDisableImmediate;
    /** Whether to hide the Shut Down button item on the login window. */
    private Boolean _shutDownDisabled;
    /** Whether the Shut Down menu item on the login window will be disabled while the user is logged in. */
    private Boolean _shutDownDisabledWhileLoggedIn;
    /** Gets or sets a single sign-on extension profile. Deprecated: use MacOSSingleSignOnExtension instead. */
    private SingleSignOnExtension _singleSignOnExtension;
    /** PKINIT Certificate for the authentication with single sign-on extensions. */
    private MacOSCertificateProfileBase _singleSignOnExtensionPkinitCertificate;
    /** Whether to hide the Sleep menu item on the login window. */
    private Boolean _sleepDisabled;
    /**
     * Instantiates a new MacOSDeviceFeaturesConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSDeviceFeaturesConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSDeviceFeaturesConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSDeviceFeaturesConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSDeviceFeaturesConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSDeviceFeaturesConfiguration();
    }
    /**
     * Gets the adminShowHostInfo property value. Whether to show admin host information on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAdminShowHostInfo() {
        return this._adminShowHostInfo;
    }
    /**
     * Gets the appAssociatedDomains property value. Gets or sets a list that maps apps to their associated domains. Application identifiers must be unique. This collection can contain a maximum of 500 elements.
     * @return a macOSAssociatedDomainsItem
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSAssociatedDomainsItem> getAppAssociatedDomains() {
        return this._appAssociatedDomains;
    }
    /**
     * Gets the associatedDomains property value. DEPRECATED: use appAssociatedDomains instead. Gets or sets a list that maps apps to their associated domains. The key should match the app's ID, and the value should be a string in the form of 'service:domain' where domain is a fully qualified hostname (e.g. webcredentials:example.com). This collection can contain a maximum of 500 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getAssociatedDomains() {
        return this._associatedDomains;
    }
    /**
     * Gets the authorizedUsersListHidden property value. Whether to show the name and password dialog or a list of users on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthorizedUsersListHidden() {
        return this._authorizedUsersListHidden;
    }
    /**
     * Gets the authorizedUsersListHideAdminUsers property value. Whether to hide admin users in the authorized users list on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthorizedUsersListHideAdminUsers() {
        return this._authorizedUsersListHideAdminUsers;
    }
    /**
     * Gets the authorizedUsersListHideLocalUsers property value. Whether to show only network and system users in the authorized users list on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthorizedUsersListHideLocalUsers() {
        return this._authorizedUsersListHideLocalUsers;
    }
    /**
     * Gets the authorizedUsersListHideMobileAccounts property value. Whether to hide mobile users in the authorized users list on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthorizedUsersListHideMobileAccounts() {
        return this._authorizedUsersListHideMobileAccounts;
    }
    /**
     * Gets the authorizedUsersListIncludeNetworkUsers property value. Whether to show network users in the authorized users list on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthorizedUsersListIncludeNetworkUsers() {
        return this._authorizedUsersListIncludeNetworkUsers;
    }
    /**
     * Gets the authorizedUsersListShowOtherManagedUsers property value. Whether to show other users in the authorized users list on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthorizedUsersListShowOtherManagedUsers() {
        return this._authorizedUsersListShowOtherManagedUsers;
    }
    /**
     * Gets the autoLaunchItems property value. List of applications, files, folders, and other items to launch when the user logs in. This collection can contain a maximum of 500 elements.
     * @return a macOSLaunchItem
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSLaunchItem> getAutoLaunchItems() {
        return this._autoLaunchItems;
    }
    /**
     * Gets the consoleAccessDisabled property value. Whether the Other user will disregard use of the console special user name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConsoleAccessDisabled() {
        return this._consoleAccessDisabled;
    }
    /**
     * Gets the contentCachingBlockDeletion property value. Prevents content caches from purging content to free up disk space for other apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingBlockDeletion() {
        return this._contentCachingBlockDeletion;
    }
    /**
     * Gets the contentCachingClientListenRanges property value. A list of custom IP ranges content caches will use to listen for clients. This collection can contain a maximum of 500 elements.
     * @return a ipRange
     */
    @javax.annotation.Nullable
    public java.util.List<IpRange> getContentCachingClientListenRanges() {
        return this._contentCachingClientListenRanges;
    }
    /**
     * Gets the contentCachingClientPolicy property value. Determines which clients a content cache will serve.
     * @return a macOSContentCachingClientPolicy
     */
    @javax.annotation.Nullable
    public MacOSContentCachingClientPolicy getContentCachingClientPolicy() {
        return this._contentCachingClientPolicy;
    }
    /**
     * Gets the contentCachingDataPath property value. The path to the directory used to store cached content. The value must be (or end with) /Library/Application Support/Apple/AssetCache/Data
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentCachingDataPath() {
        return this._contentCachingDataPath;
    }
    /**
     * Gets the contentCachingDisableConnectionSharing property value. Disables internet connection sharing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingDisableConnectionSharing() {
        return this._contentCachingDisableConnectionSharing;
    }
    /**
     * Gets the contentCachingEnabled property value. Enables content caching and prevents it from being disabled by the user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingEnabled() {
        return this._contentCachingEnabled;
    }
    /**
     * Gets the contentCachingForceConnectionSharing property value. Forces internet connection sharing. contentCachingDisableConnectionSharing overrides this setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingForceConnectionSharing() {
        return this._contentCachingForceConnectionSharing;
    }
    /**
     * Gets the contentCachingKeepAwake property value. Prevent the device from sleeping if content caching is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingKeepAwake() {
        return this._contentCachingKeepAwake;
    }
    /**
     * Gets the contentCachingLogClientIdentities property value. Enables logging of IP addresses and ports of clients that request cached content.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingLogClientIdentities() {
        return this._contentCachingLogClientIdentities;
    }
    /**
     * Gets the contentCachingMaxSizeBytes property value. The maximum number of bytes of disk space that will be used for the content cache. A value of 0 (default) indicates unlimited disk space.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getContentCachingMaxSizeBytes() {
        return this._contentCachingMaxSizeBytes;
    }
    /**
     * Gets the contentCachingParents property value. A list of IP addresses representing parent content caches.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getContentCachingParents() {
        return this._contentCachingParents;
    }
    /**
     * Gets the contentCachingParentSelectionPolicy property value. Determines how content caches select a parent cache.
     * @return a macOSContentCachingParentSelectionPolicy
     */
    @javax.annotation.Nullable
    public MacOSContentCachingParentSelectionPolicy getContentCachingParentSelectionPolicy() {
        return this._contentCachingParentSelectionPolicy;
    }
    /**
     * Gets the contentCachingPeerFilterRanges property value. A list of custom IP ranges content caches will use to query for content from peers caches. This collection can contain a maximum of 500 elements.
     * @return a ipRange
     */
    @javax.annotation.Nullable
    public java.util.List<IpRange> getContentCachingPeerFilterRanges() {
        return this._contentCachingPeerFilterRanges;
    }
    /**
     * Gets the contentCachingPeerListenRanges property value. A list of custom IP ranges content caches will use to listen for peer caches. This collection can contain a maximum of 500 elements.
     * @return a ipRange
     */
    @javax.annotation.Nullable
    public java.util.List<IpRange> getContentCachingPeerListenRanges() {
        return this._contentCachingPeerListenRanges;
    }
    /**
     * Gets the contentCachingPeerPolicy property value. Determines which content caches other content caches will peer with.
     * @return a macOSContentCachingPeerPolicy
     */
    @javax.annotation.Nullable
    public MacOSContentCachingPeerPolicy getContentCachingPeerPolicy() {
        return this._contentCachingPeerPolicy;
    }
    /**
     * Gets the contentCachingPort property value. Sets the port used for content caching. If the value is 0, a random available port will be selected. Valid values 0 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getContentCachingPort() {
        return this._contentCachingPort;
    }
    /**
     * Gets the contentCachingPublicRanges property value. A list of custom IP ranges that Apple's content caching service should use to match clients to content caches. This collection can contain a maximum of 500 elements.
     * @return a ipRange
     */
    @javax.annotation.Nullable
    public java.util.List<IpRange> getContentCachingPublicRanges() {
        return this._contentCachingPublicRanges;
    }
    /**
     * Gets the contentCachingShowAlerts property value. Display content caching alerts as system notifications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingShowAlerts() {
        return this._contentCachingShowAlerts;
    }
    /**
     * Gets the contentCachingType property value. Indicates the type of content allowed to be cached by Apple's content caching service.
     * @return a macOSContentCachingType
     */
    @javax.annotation.Nullable
    public MacOSContentCachingType getContentCachingType() {
        return this._contentCachingType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSDeviceFeaturesConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("adminShowHostInfo", (n) -> { currentObject.setAdminShowHostInfo(n.getBooleanValue()); });
            this.put("appAssociatedDomains", (n) -> { currentObject.setAppAssociatedDomains(n.getCollectionOfObjectValues(MacOSAssociatedDomainsItem::createFromDiscriminatorValue)); });
            this.put("associatedDomains", (n) -> { currentObject.setAssociatedDomains(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("authorizedUsersListHidden", (n) -> { currentObject.setAuthorizedUsersListHidden(n.getBooleanValue()); });
            this.put("authorizedUsersListHideAdminUsers", (n) -> { currentObject.setAuthorizedUsersListHideAdminUsers(n.getBooleanValue()); });
            this.put("authorizedUsersListHideLocalUsers", (n) -> { currentObject.setAuthorizedUsersListHideLocalUsers(n.getBooleanValue()); });
            this.put("authorizedUsersListHideMobileAccounts", (n) -> { currentObject.setAuthorizedUsersListHideMobileAccounts(n.getBooleanValue()); });
            this.put("authorizedUsersListIncludeNetworkUsers", (n) -> { currentObject.setAuthorizedUsersListIncludeNetworkUsers(n.getBooleanValue()); });
            this.put("authorizedUsersListShowOtherManagedUsers", (n) -> { currentObject.setAuthorizedUsersListShowOtherManagedUsers(n.getBooleanValue()); });
            this.put("autoLaunchItems", (n) -> { currentObject.setAutoLaunchItems(n.getCollectionOfObjectValues(MacOSLaunchItem::createFromDiscriminatorValue)); });
            this.put("consoleAccessDisabled", (n) -> { currentObject.setConsoleAccessDisabled(n.getBooleanValue()); });
            this.put("contentCachingBlockDeletion", (n) -> { currentObject.setContentCachingBlockDeletion(n.getBooleanValue()); });
            this.put("contentCachingClientListenRanges", (n) -> { currentObject.setContentCachingClientListenRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
            this.put("contentCachingClientPolicy", (n) -> { currentObject.setContentCachingClientPolicy(n.getEnumValue(MacOSContentCachingClientPolicy.class)); });
            this.put("contentCachingDataPath", (n) -> { currentObject.setContentCachingDataPath(n.getStringValue()); });
            this.put("contentCachingDisableConnectionSharing", (n) -> { currentObject.setContentCachingDisableConnectionSharing(n.getBooleanValue()); });
            this.put("contentCachingEnabled", (n) -> { currentObject.setContentCachingEnabled(n.getBooleanValue()); });
            this.put("contentCachingForceConnectionSharing", (n) -> { currentObject.setContentCachingForceConnectionSharing(n.getBooleanValue()); });
            this.put("contentCachingKeepAwake", (n) -> { currentObject.setContentCachingKeepAwake(n.getBooleanValue()); });
            this.put("contentCachingLogClientIdentities", (n) -> { currentObject.setContentCachingLogClientIdentities(n.getBooleanValue()); });
            this.put("contentCachingMaxSizeBytes", (n) -> { currentObject.setContentCachingMaxSizeBytes(n.getLongValue()); });
            this.put("contentCachingParents", (n) -> { currentObject.setContentCachingParents(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("contentCachingParentSelectionPolicy", (n) -> { currentObject.setContentCachingParentSelectionPolicy(n.getEnumValue(MacOSContentCachingParentSelectionPolicy.class)); });
            this.put("contentCachingPeerFilterRanges", (n) -> { currentObject.setContentCachingPeerFilterRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
            this.put("contentCachingPeerListenRanges", (n) -> { currentObject.setContentCachingPeerListenRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
            this.put("contentCachingPeerPolicy", (n) -> { currentObject.setContentCachingPeerPolicy(n.getEnumValue(MacOSContentCachingPeerPolicy.class)); });
            this.put("contentCachingPort", (n) -> { currentObject.setContentCachingPort(n.getIntegerValue()); });
            this.put("contentCachingPublicRanges", (n) -> { currentObject.setContentCachingPublicRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
            this.put("contentCachingShowAlerts", (n) -> { currentObject.setContentCachingShowAlerts(n.getBooleanValue()); });
            this.put("contentCachingType", (n) -> { currentObject.setContentCachingType(n.getEnumValue(MacOSContentCachingType.class)); });
            this.put("loginWindowText", (n) -> { currentObject.setLoginWindowText(n.getStringValue()); });
            this.put("logOutDisabledWhileLoggedIn", (n) -> { currentObject.setLogOutDisabledWhileLoggedIn(n.getBooleanValue()); });
            this.put("macOSSingleSignOnExtension", (n) -> { currentObject.setMacOSSingleSignOnExtension(n.getObjectValue(MacOSSingleSignOnExtension::createFromDiscriminatorValue)); });
            this.put("powerOffDisabledWhileLoggedIn", (n) -> { currentObject.setPowerOffDisabledWhileLoggedIn(n.getBooleanValue()); });
            this.put("restartDisabled", (n) -> { currentObject.setRestartDisabled(n.getBooleanValue()); });
            this.put("restartDisabledWhileLoggedIn", (n) -> { currentObject.setRestartDisabledWhileLoggedIn(n.getBooleanValue()); });
            this.put("screenLockDisableImmediate", (n) -> { currentObject.setScreenLockDisableImmediate(n.getBooleanValue()); });
            this.put("shutDownDisabled", (n) -> { currentObject.setShutDownDisabled(n.getBooleanValue()); });
            this.put("shutDownDisabledWhileLoggedIn", (n) -> { currentObject.setShutDownDisabledWhileLoggedIn(n.getBooleanValue()); });
            this.put("singleSignOnExtension", (n) -> { currentObject.setSingleSignOnExtension(n.getObjectValue(SingleSignOnExtension::createFromDiscriminatorValue)); });
            this.put("singleSignOnExtensionPkinitCertificate", (n) -> { currentObject.setSingleSignOnExtensionPkinitCertificate(n.getObjectValue(MacOSCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("sleepDisabled", (n) -> { currentObject.setSleepDisabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the loginWindowText property value. Custom text to be displayed on the login window.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoginWindowText() {
        return this._loginWindowText;
    }
    /**
     * Gets the logOutDisabledWhileLoggedIn property value. Whether the Log Out menu item on the login window will be disabled while the user is logged in.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLogOutDisabledWhileLoggedIn() {
        return this._logOutDisabledWhileLoggedIn;
    }
    /**
     * Gets the macOSSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @return a macOSSingleSignOnExtension
     */
    @javax.annotation.Nullable
    public MacOSSingleSignOnExtension getMacOSSingleSignOnExtension() {
        return this._macOSSingleSignOnExtension;
    }
    /**
     * Gets the powerOffDisabledWhileLoggedIn property value. Whether the Power Off menu item on the login window will be disabled while the user is logged in.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPowerOffDisabledWhileLoggedIn() {
        return this._powerOffDisabledWhileLoggedIn;
    }
    /**
     * Gets the restartDisabled property value. Whether to hide the Restart button item on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestartDisabled() {
        return this._restartDisabled;
    }
    /**
     * Gets the restartDisabledWhileLoggedIn property value. Whether the Restart menu item on the login window will be disabled while the user is logged in.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestartDisabledWhileLoggedIn() {
        return this._restartDisabledWhileLoggedIn;
    }
    /**
     * Gets the screenLockDisableImmediate property value. Whether to disable the immediate screen lock functions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenLockDisableImmediate() {
        return this._screenLockDisableImmediate;
    }
    /**
     * Gets the shutDownDisabled property value. Whether to hide the Shut Down button item on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShutDownDisabled() {
        return this._shutDownDisabled;
    }
    /**
     * Gets the shutDownDisabledWhileLoggedIn property value. Whether the Shut Down menu item on the login window will be disabled while the user is logged in.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShutDownDisabledWhileLoggedIn() {
        return this._shutDownDisabledWhileLoggedIn;
    }
    /**
     * Gets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use MacOSSingleSignOnExtension instead.
     * @return a singleSignOnExtension
     */
    @javax.annotation.Nullable
    public SingleSignOnExtension getSingleSignOnExtension() {
        return this._singleSignOnExtension;
    }
    /**
     * Gets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extensions.
     * @return a macOSCertificateProfileBase
     */
    @javax.annotation.Nullable
    public MacOSCertificateProfileBase getSingleSignOnExtensionPkinitCertificate() {
        return this._singleSignOnExtensionPkinitCertificate;
    }
    /**
     * Gets the sleepDisabled property value. Whether to hide the Sleep menu item on the login window.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSleepDisabled() {
        return this._sleepDisabled;
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
        writer.writeBooleanValue("adminShowHostInfo", this.getAdminShowHostInfo());
        writer.writeCollectionOfObjectValues("appAssociatedDomains", this.getAppAssociatedDomains());
        writer.writeCollectionOfObjectValues("associatedDomains", this.getAssociatedDomains());
        writer.writeBooleanValue("authorizedUsersListHidden", this.getAuthorizedUsersListHidden());
        writer.writeBooleanValue("authorizedUsersListHideAdminUsers", this.getAuthorizedUsersListHideAdminUsers());
        writer.writeBooleanValue("authorizedUsersListHideLocalUsers", this.getAuthorizedUsersListHideLocalUsers());
        writer.writeBooleanValue("authorizedUsersListHideMobileAccounts", this.getAuthorizedUsersListHideMobileAccounts());
        writer.writeBooleanValue("authorizedUsersListIncludeNetworkUsers", this.getAuthorizedUsersListIncludeNetworkUsers());
        writer.writeBooleanValue("authorizedUsersListShowOtherManagedUsers", this.getAuthorizedUsersListShowOtherManagedUsers());
        writer.writeCollectionOfObjectValues("autoLaunchItems", this.getAutoLaunchItems());
        writer.writeBooleanValue("consoleAccessDisabled", this.getConsoleAccessDisabled());
        writer.writeBooleanValue("contentCachingBlockDeletion", this.getContentCachingBlockDeletion());
        writer.writeCollectionOfObjectValues("contentCachingClientListenRanges", this.getContentCachingClientListenRanges());
        writer.writeEnumValue("contentCachingClientPolicy", this.getContentCachingClientPolicy());
        writer.writeStringValue("contentCachingDataPath", this.getContentCachingDataPath());
        writer.writeBooleanValue("contentCachingDisableConnectionSharing", this.getContentCachingDisableConnectionSharing());
        writer.writeBooleanValue("contentCachingEnabled", this.getContentCachingEnabled());
        writer.writeBooleanValue("contentCachingForceConnectionSharing", this.getContentCachingForceConnectionSharing());
        writer.writeBooleanValue("contentCachingKeepAwake", this.getContentCachingKeepAwake());
        writer.writeBooleanValue("contentCachingLogClientIdentities", this.getContentCachingLogClientIdentities());
        writer.writeLongValue("contentCachingMaxSizeBytes", this.getContentCachingMaxSizeBytes());
        writer.writeCollectionOfPrimitiveValues("contentCachingParents", this.getContentCachingParents());
        writer.writeEnumValue("contentCachingParentSelectionPolicy", this.getContentCachingParentSelectionPolicy());
        writer.writeCollectionOfObjectValues("contentCachingPeerFilterRanges", this.getContentCachingPeerFilterRanges());
        writer.writeCollectionOfObjectValues("contentCachingPeerListenRanges", this.getContentCachingPeerListenRanges());
        writer.writeEnumValue("contentCachingPeerPolicy", this.getContentCachingPeerPolicy());
        writer.writeIntegerValue("contentCachingPort", this.getContentCachingPort());
        writer.writeCollectionOfObjectValues("contentCachingPublicRanges", this.getContentCachingPublicRanges());
        writer.writeBooleanValue("contentCachingShowAlerts", this.getContentCachingShowAlerts());
        writer.writeEnumValue("contentCachingType", this.getContentCachingType());
        writer.writeStringValue("loginWindowText", this.getLoginWindowText());
        writer.writeBooleanValue("logOutDisabledWhileLoggedIn", this.getLogOutDisabledWhileLoggedIn());
        writer.writeObjectValue("macOSSingleSignOnExtension", this.getMacOSSingleSignOnExtension());
        writer.writeBooleanValue("powerOffDisabledWhileLoggedIn", this.getPowerOffDisabledWhileLoggedIn());
        writer.writeBooleanValue("restartDisabled", this.getRestartDisabled());
        writer.writeBooleanValue("restartDisabledWhileLoggedIn", this.getRestartDisabledWhileLoggedIn());
        writer.writeBooleanValue("screenLockDisableImmediate", this.getScreenLockDisableImmediate());
        writer.writeBooleanValue("shutDownDisabled", this.getShutDownDisabled());
        writer.writeBooleanValue("shutDownDisabledWhileLoggedIn", this.getShutDownDisabledWhileLoggedIn());
        writer.writeObjectValue("singleSignOnExtension", this.getSingleSignOnExtension());
        writer.writeObjectValue("singleSignOnExtensionPkinitCertificate", this.getSingleSignOnExtensionPkinitCertificate());
        writer.writeBooleanValue("sleepDisabled", this.getSleepDisabled());
    }
    /**
     * Sets the adminShowHostInfo property value. Whether to show admin host information on the login window.
     * @param value Value to set for the adminShowHostInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminShowHostInfo(@javax.annotation.Nullable final Boolean value) {
        this._adminShowHostInfo = value;
    }
    /**
     * Sets the appAssociatedDomains property value. Gets or sets a list that maps apps to their associated domains. Application identifiers must be unique. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appAssociatedDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppAssociatedDomains(@javax.annotation.Nullable final java.util.List<MacOSAssociatedDomainsItem> value) {
        this._appAssociatedDomains = value;
    }
    /**
     * Sets the associatedDomains property value. DEPRECATED: use appAssociatedDomains instead. Gets or sets a list that maps apps to their associated domains. The key should match the app's ID, and the value should be a string in the form of 'service:domain' where domain is a fully qualified hostname (e.g. webcredentials:example.com). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the associatedDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssociatedDomains(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._associatedDomains = value;
    }
    /**
     * Sets the authorizedUsersListHidden property value. Whether to show the name and password dialog or a list of users on the login window.
     * @param value Value to set for the authorizedUsersListHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizedUsersListHidden(@javax.annotation.Nullable final Boolean value) {
        this._authorizedUsersListHidden = value;
    }
    /**
     * Sets the authorizedUsersListHideAdminUsers property value. Whether to hide admin users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListHideAdminUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizedUsersListHideAdminUsers(@javax.annotation.Nullable final Boolean value) {
        this._authorizedUsersListHideAdminUsers = value;
    }
    /**
     * Sets the authorizedUsersListHideLocalUsers property value. Whether to show only network and system users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListHideLocalUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizedUsersListHideLocalUsers(@javax.annotation.Nullable final Boolean value) {
        this._authorizedUsersListHideLocalUsers = value;
    }
    /**
     * Sets the authorizedUsersListHideMobileAccounts property value. Whether to hide mobile users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListHideMobileAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizedUsersListHideMobileAccounts(@javax.annotation.Nullable final Boolean value) {
        this._authorizedUsersListHideMobileAccounts = value;
    }
    /**
     * Sets the authorizedUsersListIncludeNetworkUsers property value. Whether to show network users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListIncludeNetworkUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizedUsersListIncludeNetworkUsers(@javax.annotation.Nullable final Boolean value) {
        this._authorizedUsersListIncludeNetworkUsers = value;
    }
    /**
     * Sets the authorizedUsersListShowOtherManagedUsers property value. Whether to show other users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListShowOtherManagedUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizedUsersListShowOtherManagedUsers(@javax.annotation.Nullable final Boolean value) {
        this._authorizedUsersListShowOtherManagedUsers = value;
    }
    /**
     * Sets the autoLaunchItems property value. List of applications, files, folders, and other items to launch when the user logs in. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the autoLaunchItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoLaunchItems(@javax.annotation.Nullable final java.util.List<MacOSLaunchItem> value) {
        this._autoLaunchItems = value;
    }
    /**
     * Sets the consoleAccessDisabled property value. Whether the Other user will disregard use of the console special user name.
     * @param value Value to set for the consoleAccessDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsoleAccessDisabled(@javax.annotation.Nullable final Boolean value) {
        this._consoleAccessDisabled = value;
    }
    /**
     * Sets the contentCachingBlockDeletion property value. Prevents content caches from purging content to free up disk space for other apps.
     * @param value Value to set for the contentCachingBlockDeletion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingBlockDeletion(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingBlockDeletion = value;
    }
    /**
     * Sets the contentCachingClientListenRanges property value. A list of custom IP ranges content caches will use to listen for clients. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingClientListenRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingClientListenRanges(@javax.annotation.Nullable final java.util.List<IpRange> value) {
        this._contentCachingClientListenRanges = value;
    }
    /**
     * Sets the contentCachingClientPolicy property value. Determines which clients a content cache will serve.
     * @param value Value to set for the contentCachingClientPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingClientPolicy(@javax.annotation.Nullable final MacOSContentCachingClientPolicy value) {
        this._contentCachingClientPolicy = value;
    }
    /**
     * Sets the contentCachingDataPath property value. The path to the directory used to store cached content. The value must be (or end with) /Library/Application Support/Apple/AssetCache/Data
     * @param value Value to set for the contentCachingDataPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingDataPath(@javax.annotation.Nullable final String value) {
        this._contentCachingDataPath = value;
    }
    /**
     * Sets the contentCachingDisableConnectionSharing property value. Disables internet connection sharing.
     * @param value Value to set for the contentCachingDisableConnectionSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingDisableConnectionSharing(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingDisableConnectionSharing = value;
    }
    /**
     * Sets the contentCachingEnabled property value. Enables content caching and prevents it from being disabled by the user.
     * @param value Value to set for the contentCachingEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingEnabled(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingEnabled = value;
    }
    /**
     * Sets the contentCachingForceConnectionSharing property value. Forces internet connection sharing. contentCachingDisableConnectionSharing overrides this setting.
     * @param value Value to set for the contentCachingForceConnectionSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingForceConnectionSharing(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingForceConnectionSharing = value;
    }
    /**
     * Sets the contentCachingKeepAwake property value. Prevent the device from sleeping if content caching is enabled.
     * @param value Value to set for the contentCachingKeepAwake property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingKeepAwake(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingKeepAwake = value;
    }
    /**
     * Sets the contentCachingLogClientIdentities property value. Enables logging of IP addresses and ports of clients that request cached content.
     * @param value Value to set for the contentCachingLogClientIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingLogClientIdentities(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingLogClientIdentities = value;
    }
    /**
     * Sets the contentCachingMaxSizeBytes property value. The maximum number of bytes of disk space that will be used for the content cache. A value of 0 (default) indicates unlimited disk space.
     * @param value Value to set for the contentCachingMaxSizeBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingMaxSizeBytes(@javax.annotation.Nullable final Long value) {
        this._contentCachingMaxSizeBytes = value;
    }
    /**
     * Sets the contentCachingParents property value. A list of IP addresses representing parent content caches.
     * @param value Value to set for the contentCachingParents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingParents(@javax.annotation.Nullable final java.util.List<String> value) {
        this._contentCachingParents = value;
    }
    /**
     * Sets the contentCachingParentSelectionPolicy property value. Determines how content caches select a parent cache.
     * @param value Value to set for the contentCachingParentSelectionPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingParentSelectionPolicy(@javax.annotation.Nullable final MacOSContentCachingParentSelectionPolicy value) {
        this._contentCachingParentSelectionPolicy = value;
    }
    /**
     * Sets the contentCachingPeerFilterRanges property value. A list of custom IP ranges content caches will use to query for content from peers caches. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingPeerFilterRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingPeerFilterRanges(@javax.annotation.Nullable final java.util.List<IpRange> value) {
        this._contentCachingPeerFilterRanges = value;
    }
    /**
     * Sets the contentCachingPeerListenRanges property value. A list of custom IP ranges content caches will use to listen for peer caches. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingPeerListenRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingPeerListenRanges(@javax.annotation.Nullable final java.util.List<IpRange> value) {
        this._contentCachingPeerListenRanges = value;
    }
    /**
     * Sets the contentCachingPeerPolicy property value. Determines which content caches other content caches will peer with.
     * @param value Value to set for the contentCachingPeerPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingPeerPolicy(@javax.annotation.Nullable final MacOSContentCachingPeerPolicy value) {
        this._contentCachingPeerPolicy = value;
    }
    /**
     * Sets the contentCachingPort property value. Sets the port used for content caching. If the value is 0, a random available port will be selected. Valid values 0 to 65535
     * @param value Value to set for the contentCachingPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingPort(@javax.annotation.Nullable final Integer value) {
        this._contentCachingPort = value;
    }
    /**
     * Sets the contentCachingPublicRanges property value. A list of custom IP ranges that Apple's content caching service should use to match clients to content caches. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingPublicRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingPublicRanges(@javax.annotation.Nullable final java.util.List<IpRange> value) {
        this._contentCachingPublicRanges = value;
    }
    /**
     * Sets the contentCachingShowAlerts property value. Display content caching alerts as system notifications.
     * @param value Value to set for the contentCachingShowAlerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingShowAlerts(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingShowAlerts = value;
    }
    /**
     * Sets the contentCachingType property value. Indicates the type of content allowed to be cached by Apple's content caching service.
     * @param value Value to set for the contentCachingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingType(@javax.annotation.Nullable final MacOSContentCachingType value) {
        this._contentCachingType = value;
    }
    /**
     * Sets the loginWindowText property value. Custom text to be displayed on the login window.
     * @param value Value to set for the loginWindowText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginWindowText(@javax.annotation.Nullable final String value) {
        this._loginWindowText = value;
    }
    /**
     * Sets the logOutDisabledWhileLoggedIn property value. Whether the Log Out menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the logOutDisabledWhileLoggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogOutDisabledWhileLoggedIn(@javax.annotation.Nullable final Boolean value) {
        this._logOutDisabledWhileLoggedIn = value;
    }
    /**
     * Sets the macOSSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @param value Value to set for the macOSSingleSignOnExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOSSingleSignOnExtension(@javax.annotation.Nullable final MacOSSingleSignOnExtension value) {
        this._macOSSingleSignOnExtension = value;
    }
    /**
     * Sets the powerOffDisabledWhileLoggedIn property value. Whether the Power Off menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the powerOffDisabledWhileLoggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerOffDisabledWhileLoggedIn(@javax.annotation.Nullable final Boolean value) {
        this._powerOffDisabledWhileLoggedIn = value;
    }
    /**
     * Sets the restartDisabled property value. Whether to hide the Restart button item on the login window.
     * @param value Value to set for the restartDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartDisabled(@javax.annotation.Nullable final Boolean value) {
        this._restartDisabled = value;
    }
    /**
     * Sets the restartDisabledWhileLoggedIn property value. Whether the Restart menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the restartDisabledWhileLoggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartDisabledWhileLoggedIn(@javax.annotation.Nullable final Boolean value) {
        this._restartDisabledWhileLoggedIn = value;
    }
    /**
     * Sets the screenLockDisableImmediate property value. Whether to disable the immediate screen lock functions.
     * @param value Value to set for the screenLockDisableImmediate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenLockDisableImmediate(@javax.annotation.Nullable final Boolean value) {
        this._screenLockDisableImmediate = value;
    }
    /**
     * Sets the shutDownDisabled property value. Whether to hide the Shut Down button item on the login window.
     * @param value Value to set for the shutDownDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShutDownDisabled(@javax.annotation.Nullable final Boolean value) {
        this._shutDownDisabled = value;
    }
    /**
     * Sets the shutDownDisabledWhileLoggedIn property value. Whether the Shut Down menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the shutDownDisabledWhileLoggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShutDownDisabledWhileLoggedIn(@javax.annotation.Nullable final Boolean value) {
        this._shutDownDisabledWhileLoggedIn = value;
    }
    /**
     * Sets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use MacOSSingleSignOnExtension instead.
     * @param value Value to set for the singleSignOnExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSignOnExtension(@javax.annotation.Nullable final SingleSignOnExtension value) {
        this._singleSignOnExtension = value;
    }
    /**
     * Sets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extensions.
     * @param value Value to set for the singleSignOnExtensionPkinitCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSignOnExtensionPkinitCertificate(@javax.annotation.Nullable final MacOSCertificateProfileBase value) {
        this._singleSignOnExtensionPkinitCertificate = value;
    }
    /**
     * Sets the sleepDisabled property value. Whether to hide the Sleep menu item on the login window.
     * @param value Value to set for the sleepDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSleepDisabled(@javax.annotation.Nullable final Boolean value) {
        this._sleepDisabled = value;
    }
}
