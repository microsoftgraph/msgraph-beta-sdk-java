package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS device features configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements Parsable {
    /**
     * Instantiates a new MacOSDeviceFeaturesConfiguration and sets the default values.
     */
    public MacOSDeviceFeaturesConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSDeviceFeaturesConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSDeviceFeaturesConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSDeviceFeaturesConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSDeviceFeaturesConfiguration();
    }
    /**
     * Gets the adminShowHostInfo property value. Whether to show admin host information on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAdminShowHostInfo() {
        return this.BackingStore.get("adminShowHostInfo");
    }
    /**
     * Gets the appAssociatedDomains property value. Gets or sets a list that maps apps to their associated domains. Application identifiers must be unique. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<MacOSAssociatedDomainsItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSAssociatedDomainsItem> getAppAssociatedDomains() {
        return this.BackingStore.get("appAssociatedDomains");
    }
    /**
     * Gets the associatedDomains property value. DEPRECATED: use appAssociatedDomains instead. Gets or sets a list that maps apps to their associated domains. The key should match the app's ID, and the value should be a string in the form of 'service:domain' where domain is a fully qualified hostname (e.g. webcredentials:example.com). This collection can contain a maximum of 500 elements.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getAssociatedDomains() {
        return this.BackingStore.get("associatedDomains");
    }
    /**
     * Gets the authorizedUsersListHidden property value. Whether to show the name and password dialog or a list of users on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedUsersListHidden() {
        return this.BackingStore.get("authorizedUsersListHidden");
    }
    /**
     * Gets the authorizedUsersListHideAdminUsers property value. Whether to hide admin users in the authorized users list on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedUsersListHideAdminUsers() {
        return this.BackingStore.get("authorizedUsersListHideAdminUsers");
    }
    /**
     * Gets the authorizedUsersListHideLocalUsers property value. Whether to show only network and system users in the authorized users list on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedUsersListHideLocalUsers() {
        return this.BackingStore.get("authorizedUsersListHideLocalUsers");
    }
    /**
     * Gets the authorizedUsersListHideMobileAccounts property value. Whether to hide mobile users in the authorized users list on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedUsersListHideMobileAccounts() {
        return this.BackingStore.get("authorizedUsersListHideMobileAccounts");
    }
    /**
     * Gets the authorizedUsersListIncludeNetworkUsers property value. Whether to show network users in the authorized users list on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedUsersListIncludeNetworkUsers() {
        return this.BackingStore.get("authorizedUsersListIncludeNetworkUsers");
    }
    /**
     * Gets the authorizedUsersListShowOtherManagedUsers property value. Whether to show other users in the authorized users list on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedUsersListShowOtherManagedUsers() {
        return this.BackingStore.get("authorizedUsersListShowOtherManagedUsers");
    }
    /**
     * Gets the autoLaunchItems property value. List of applications, files, folders, and other items to launch when the user logs in. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<MacOSLaunchItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSLaunchItem> getAutoLaunchItems() {
        return this.BackingStore.get("autoLaunchItems");
    }
    /**
     * Gets the consoleAccessDisabled property value. Whether the Other user will disregard use of the console special user name.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConsoleAccessDisabled() {
        return this.BackingStore.get("consoleAccessDisabled");
    }
    /**
     * Gets the contentCachingBlockDeletion property value. Prevents content caches from purging content to free up disk space for other apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingBlockDeletion() {
        return this.BackingStore.get("contentCachingBlockDeletion");
    }
    /**
     * Gets the contentCachingClientListenRanges property value. A list of custom IP ranges content caches will use to listen for clients. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IpRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpRange> getContentCachingClientListenRanges() {
        return this.BackingStore.get("contentCachingClientListenRanges");
    }
    /**
     * Gets the contentCachingClientPolicy property value. Determines which clients a content cache will serve.
     * @return a MacOSContentCachingClientPolicy
     */
    @jakarta.annotation.Nullable
    public MacOSContentCachingClientPolicy getContentCachingClientPolicy() {
        return this.BackingStore.get("contentCachingClientPolicy");
    }
    /**
     * Gets the contentCachingDataPath property value. The path to the directory used to store cached content. The value must be (or end with) /Library/Application Support/Apple/AssetCache/Data
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentCachingDataPath() {
        return this.BackingStore.get("contentCachingDataPath");
    }
    /**
     * Gets the contentCachingDisableConnectionSharing property value. Disables internet connection sharing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingDisableConnectionSharing() {
        return this.BackingStore.get("contentCachingDisableConnectionSharing");
    }
    /**
     * Gets the contentCachingEnabled property value. Enables content caching and prevents it from being disabled by the user.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingEnabled() {
        return this.BackingStore.get("contentCachingEnabled");
    }
    /**
     * Gets the contentCachingForceConnectionSharing property value. Forces internet connection sharing. contentCachingDisableConnectionSharing overrides this setting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingForceConnectionSharing() {
        return this.BackingStore.get("contentCachingForceConnectionSharing");
    }
    /**
     * Gets the contentCachingKeepAwake property value. Prevent the device from sleeping if content caching is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingKeepAwake() {
        return this.BackingStore.get("contentCachingKeepAwake");
    }
    /**
     * Gets the contentCachingLogClientIdentities property value. Enables logging of IP addresses and ports of clients that request cached content.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingLogClientIdentities() {
        return this.BackingStore.get("contentCachingLogClientIdentities");
    }
    /**
     * Gets the contentCachingMaxSizeBytes property value. The maximum number of bytes of disk space that will be used for the content cache. A value of 0 (default) indicates unlimited disk space.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getContentCachingMaxSizeBytes() {
        return this.BackingStore.get("contentCachingMaxSizeBytes");
    }
    /**
     * Gets the contentCachingParents property value. A list of IP addresses representing parent content caches.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContentCachingParents() {
        return this.BackingStore.get("contentCachingParents");
    }
    /**
     * Gets the contentCachingParentSelectionPolicy property value. Determines how content caches select a parent cache.
     * @return a MacOSContentCachingParentSelectionPolicy
     */
    @jakarta.annotation.Nullable
    public MacOSContentCachingParentSelectionPolicy getContentCachingParentSelectionPolicy() {
        return this.BackingStore.get("contentCachingParentSelectionPolicy");
    }
    /**
     * Gets the contentCachingPeerFilterRanges property value. A list of custom IP ranges content caches will use to query for content from peers caches. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IpRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpRange> getContentCachingPeerFilterRanges() {
        return this.BackingStore.get("contentCachingPeerFilterRanges");
    }
    /**
     * Gets the contentCachingPeerListenRanges property value. A list of custom IP ranges content caches will use to listen for peer caches. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IpRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpRange> getContentCachingPeerListenRanges() {
        return this.BackingStore.get("contentCachingPeerListenRanges");
    }
    /**
     * Gets the contentCachingPeerPolicy property value. Determines which content caches other content caches will peer with.
     * @return a MacOSContentCachingPeerPolicy
     */
    @jakarta.annotation.Nullable
    public MacOSContentCachingPeerPolicy getContentCachingPeerPolicy() {
        return this.BackingStore.get("contentCachingPeerPolicy");
    }
    /**
     * Gets the contentCachingPort property value. Sets the port used for content caching. If the value is 0, a random available port will be selected. Valid values 0 to 65535
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getContentCachingPort() {
        return this.BackingStore.get("contentCachingPort");
    }
    /**
     * Gets the contentCachingPublicRanges property value. A list of custom IP ranges that Apple's content caching service should use to match clients to content caches. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IpRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpRange> getContentCachingPublicRanges() {
        return this.BackingStore.get("contentCachingPublicRanges");
    }
    /**
     * Gets the contentCachingShowAlerts property value. Display content caching alerts as system notifications.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingShowAlerts() {
        return this.BackingStore.get("contentCachingShowAlerts");
    }
    /**
     * Gets the contentCachingType property value. Indicates the type of content allowed to be cached by Apple's content caching service.
     * @return a MacOSContentCachingType
     */
    @jakarta.annotation.Nullable
    public MacOSContentCachingType getContentCachingType() {
        return this.BackingStore.get("contentCachingType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adminShowHostInfo", (n) -> { this.setAdminShowHostInfo(n.getBooleanValue()); });
        deserializerMap.put("appAssociatedDomains", (n) -> { this.setAppAssociatedDomains(n.getCollectionOfObjectValues(MacOSAssociatedDomainsItem::createFromDiscriminatorValue)); });
        deserializerMap.put("associatedDomains", (n) -> { this.setAssociatedDomains(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("authorizedUsersListHidden", (n) -> { this.setAuthorizedUsersListHidden(n.getBooleanValue()); });
        deserializerMap.put("authorizedUsersListHideAdminUsers", (n) -> { this.setAuthorizedUsersListHideAdminUsers(n.getBooleanValue()); });
        deserializerMap.put("authorizedUsersListHideLocalUsers", (n) -> { this.setAuthorizedUsersListHideLocalUsers(n.getBooleanValue()); });
        deserializerMap.put("authorizedUsersListHideMobileAccounts", (n) -> { this.setAuthorizedUsersListHideMobileAccounts(n.getBooleanValue()); });
        deserializerMap.put("authorizedUsersListIncludeNetworkUsers", (n) -> { this.setAuthorizedUsersListIncludeNetworkUsers(n.getBooleanValue()); });
        deserializerMap.put("authorizedUsersListShowOtherManagedUsers", (n) -> { this.setAuthorizedUsersListShowOtherManagedUsers(n.getBooleanValue()); });
        deserializerMap.put("autoLaunchItems", (n) -> { this.setAutoLaunchItems(n.getCollectionOfObjectValues(MacOSLaunchItem::createFromDiscriminatorValue)); });
        deserializerMap.put("consoleAccessDisabled", (n) -> { this.setConsoleAccessDisabled(n.getBooleanValue()); });
        deserializerMap.put("contentCachingBlockDeletion", (n) -> { this.setContentCachingBlockDeletion(n.getBooleanValue()); });
        deserializerMap.put("contentCachingClientListenRanges", (n) -> { this.setContentCachingClientListenRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCachingClientPolicy", (n) -> { this.setContentCachingClientPolicy(n.getEnumValue(MacOSContentCachingClientPolicy.class)); });
        deserializerMap.put("contentCachingDataPath", (n) -> { this.setContentCachingDataPath(n.getStringValue()); });
        deserializerMap.put("contentCachingDisableConnectionSharing", (n) -> { this.setContentCachingDisableConnectionSharing(n.getBooleanValue()); });
        deserializerMap.put("contentCachingEnabled", (n) -> { this.setContentCachingEnabled(n.getBooleanValue()); });
        deserializerMap.put("contentCachingForceConnectionSharing", (n) -> { this.setContentCachingForceConnectionSharing(n.getBooleanValue()); });
        deserializerMap.put("contentCachingKeepAwake", (n) -> { this.setContentCachingKeepAwake(n.getBooleanValue()); });
        deserializerMap.put("contentCachingLogClientIdentities", (n) -> { this.setContentCachingLogClientIdentities(n.getBooleanValue()); });
        deserializerMap.put("contentCachingMaxSizeBytes", (n) -> { this.setContentCachingMaxSizeBytes(n.getLongValue()); });
        deserializerMap.put("contentCachingParents", (n) -> { this.setContentCachingParents(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contentCachingParentSelectionPolicy", (n) -> { this.setContentCachingParentSelectionPolicy(n.getEnumValue(MacOSContentCachingParentSelectionPolicy.class)); });
        deserializerMap.put("contentCachingPeerFilterRanges", (n) -> { this.setContentCachingPeerFilterRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCachingPeerListenRanges", (n) -> { this.setContentCachingPeerListenRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCachingPeerPolicy", (n) -> { this.setContentCachingPeerPolicy(n.getEnumValue(MacOSContentCachingPeerPolicy.class)); });
        deserializerMap.put("contentCachingPort", (n) -> { this.setContentCachingPort(n.getIntegerValue()); });
        deserializerMap.put("contentCachingPublicRanges", (n) -> { this.setContentCachingPublicRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCachingShowAlerts", (n) -> { this.setContentCachingShowAlerts(n.getBooleanValue()); });
        deserializerMap.put("contentCachingType", (n) -> { this.setContentCachingType(n.getEnumValue(MacOSContentCachingType.class)); });
        deserializerMap.put("loginWindowText", (n) -> { this.setLoginWindowText(n.getStringValue()); });
        deserializerMap.put("logOutDisabledWhileLoggedIn", (n) -> { this.setLogOutDisabledWhileLoggedIn(n.getBooleanValue()); });
        deserializerMap.put("macOSSingleSignOnExtension", (n) -> { this.setMacOSSingleSignOnExtension(n.getObjectValue(MacOSSingleSignOnExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("powerOffDisabledWhileLoggedIn", (n) -> { this.setPowerOffDisabledWhileLoggedIn(n.getBooleanValue()); });
        deserializerMap.put("restartDisabled", (n) -> { this.setRestartDisabled(n.getBooleanValue()); });
        deserializerMap.put("restartDisabledWhileLoggedIn", (n) -> { this.setRestartDisabledWhileLoggedIn(n.getBooleanValue()); });
        deserializerMap.put("screenLockDisableImmediate", (n) -> { this.setScreenLockDisableImmediate(n.getBooleanValue()); });
        deserializerMap.put("shutDownDisabled", (n) -> { this.setShutDownDisabled(n.getBooleanValue()); });
        deserializerMap.put("shutDownDisabledWhileLoggedIn", (n) -> { this.setShutDownDisabledWhileLoggedIn(n.getBooleanValue()); });
        deserializerMap.put("singleSignOnExtension", (n) -> { this.setSingleSignOnExtension(n.getObjectValue(SingleSignOnExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("singleSignOnExtensionPkinitCertificate", (n) -> { this.setSingleSignOnExtensionPkinitCertificate(n.getObjectValue(MacOSCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("sleepDisabled", (n) -> { this.setSleepDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the loginWindowText property value. Custom text to be displayed on the login window.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLoginWindowText() {
        return this.BackingStore.get("loginWindowText");
    }
    /**
     * Gets the logOutDisabledWhileLoggedIn property value. Whether the Log Out menu item on the login window will be disabled while the user is logged in.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLogOutDisabledWhileLoggedIn() {
        return this.BackingStore.get("logOutDisabledWhileLoggedIn");
    }
    /**
     * Gets the macOSSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @return a MacOSSingleSignOnExtension
     */
    @jakarta.annotation.Nullable
    public MacOSSingleSignOnExtension getMacOSSingleSignOnExtension() {
        return this.BackingStore.get("macOSSingleSignOnExtension");
    }
    /**
     * Gets the powerOffDisabledWhileLoggedIn property value. Whether the Power Off menu item on the login window will be disabled while the user is logged in.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPowerOffDisabledWhileLoggedIn() {
        return this.BackingStore.get("powerOffDisabledWhileLoggedIn");
    }
    /**
     * Gets the restartDisabled property value. Whether to hide the Restart button item on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestartDisabled() {
        return this.BackingStore.get("restartDisabled");
    }
    /**
     * Gets the restartDisabledWhileLoggedIn property value. Whether the Restart menu item on the login window will be disabled while the user is logged in.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestartDisabledWhileLoggedIn() {
        return this.BackingStore.get("restartDisabledWhileLoggedIn");
    }
    /**
     * Gets the screenLockDisableImmediate property value. Whether to disable the immediate screen lock functions.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenLockDisableImmediate() {
        return this.BackingStore.get("screenLockDisableImmediate");
    }
    /**
     * Gets the shutDownDisabled property value. Whether to hide the Shut Down button item on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShutDownDisabled() {
        return this.BackingStore.get("shutDownDisabled");
    }
    /**
     * Gets the shutDownDisabledWhileLoggedIn property value. Whether the Shut Down menu item on the login window will be disabled while the user is logged in.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShutDownDisabledWhileLoggedIn() {
        return this.BackingStore.get("shutDownDisabledWhileLoggedIn");
    }
    /**
     * Gets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use MacOSSingleSignOnExtension instead.
     * @return a SingleSignOnExtension
     */
    @jakarta.annotation.Nullable
    public SingleSignOnExtension getSingleSignOnExtension() {
        return this.BackingStore.get("singleSignOnExtension");
    }
    /**
     * Gets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extensions.
     * @return a MacOSCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public MacOSCertificateProfileBase getSingleSignOnExtensionPkinitCertificate() {
        return this.BackingStore.get("singleSignOnExtensionPkinitCertificate");
    }
    /**
     * Gets the sleepDisabled property value. Whether to hide the Sleep menu item on the login window.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSleepDisabled() {
        return this.BackingStore.get("sleepDisabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAdminShowHostInfo(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("adminShowHostInfo", value);
    }
    /**
     * Sets the appAssociatedDomains property value. Gets or sets a list that maps apps to their associated domains. Application identifiers must be unique. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appAssociatedDomains property.
     */
    public void setAppAssociatedDomains(@jakarta.annotation.Nullable final java.util.List<MacOSAssociatedDomainsItem> value) {
        this.BackingStore.set("appAssociatedDomains", value);
    }
    /**
     * Sets the associatedDomains property value. DEPRECATED: use appAssociatedDomains instead. Gets or sets a list that maps apps to their associated domains. The key should match the app's ID, and the value should be a string in the form of 'service:domain' where domain is a fully qualified hostname (e.g. webcredentials:example.com). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the associatedDomains property.
     */
    public void setAssociatedDomains(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.BackingStore.set("associatedDomains", value);
    }
    /**
     * Sets the authorizedUsersListHidden property value. Whether to show the name and password dialog or a list of users on the login window.
     * @param value Value to set for the authorizedUsersListHidden property.
     */
    public void setAuthorizedUsersListHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("authorizedUsersListHidden", value);
    }
    /**
     * Sets the authorizedUsersListHideAdminUsers property value. Whether to hide admin users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListHideAdminUsers property.
     */
    public void setAuthorizedUsersListHideAdminUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("authorizedUsersListHideAdminUsers", value);
    }
    /**
     * Sets the authorizedUsersListHideLocalUsers property value. Whether to show only network and system users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListHideLocalUsers property.
     */
    public void setAuthorizedUsersListHideLocalUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("authorizedUsersListHideLocalUsers", value);
    }
    /**
     * Sets the authorizedUsersListHideMobileAccounts property value. Whether to hide mobile users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListHideMobileAccounts property.
     */
    public void setAuthorizedUsersListHideMobileAccounts(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("authorizedUsersListHideMobileAccounts", value);
    }
    /**
     * Sets the authorizedUsersListIncludeNetworkUsers property value. Whether to show network users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListIncludeNetworkUsers property.
     */
    public void setAuthorizedUsersListIncludeNetworkUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("authorizedUsersListIncludeNetworkUsers", value);
    }
    /**
     * Sets the authorizedUsersListShowOtherManagedUsers property value. Whether to show other users in the authorized users list on the login window.
     * @param value Value to set for the authorizedUsersListShowOtherManagedUsers property.
     */
    public void setAuthorizedUsersListShowOtherManagedUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("authorizedUsersListShowOtherManagedUsers", value);
    }
    /**
     * Sets the autoLaunchItems property value. List of applications, files, folders, and other items to launch when the user logs in. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the autoLaunchItems property.
     */
    public void setAutoLaunchItems(@jakarta.annotation.Nullable final java.util.List<MacOSLaunchItem> value) {
        this.BackingStore.set("autoLaunchItems", value);
    }
    /**
     * Sets the consoleAccessDisabled property value. Whether the Other user will disregard use of the console special user name.
     * @param value Value to set for the consoleAccessDisabled property.
     */
    public void setConsoleAccessDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("consoleAccessDisabled", value);
    }
    /**
     * Sets the contentCachingBlockDeletion property value. Prevents content caches from purging content to free up disk space for other apps.
     * @param value Value to set for the contentCachingBlockDeletion property.
     */
    public void setContentCachingBlockDeletion(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contentCachingBlockDeletion", value);
    }
    /**
     * Sets the contentCachingClientListenRanges property value. A list of custom IP ranges content caches will use to listen for clients. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingClientListenRanges property.
     */
    public void setContentCachingClientListenRanges(@jakarta.annotation.Nullable final java.util.List<IpRange> value) {
        this.BackingStore.set("contentCachingClientListenRanges", value);
    }
    /**
     * Sets the contentCachingClientPolicy property value. Determines which clients a content cache will serve.
     * @param value Value to set for the contentCachingClientPolicy property.
     */
    public void setContentCachingClientPolicy(@jakarta.annotation.Nullable final MacOSContentCachingClientPolicy value) {
        this.BackingStore.set("contentCachingClientPolicy", value);
    }
    /**
     * Sets the contentCachingDataPath property value. The path to the directory used to store cached content. The value must be (or end with) /Library/Application Support/Apple/AssetCache/Data
     * @param value Value to set for the contentCachingDataPath property.
     */
    public void setContentCachingDataPath(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contentCachingDataPath", value);
    }
    /**
     * Sets the contentCachingDisableConnectionSharing property value. Disables internet connection sharing.
     * @param value Value to set for the contentCachingDisableConnectionSharing property.
     */
    public void setContentCachingDisableConnectionSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contentCachingDisableConnectionSharing", value);
    }
    /**
     * Sets the contentCachingEnabled property value. Enables content caching and prevents it from being disabled by the user.
     * @param value Value to set for the contentCachingEnabled property.
     */
    public void setContentCachingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contentCachingEnabled", value);
    }
    /**
     * Sets the contentCachingForceConnectionSharing property value. Forces internet connection sharing. contentCachingDisableConnectionSharing overrides this setting.
     * @param value Value to set for the contentCachingForceConnectionSharing property.
     */
    public void setContentCachingForceConnectionSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contentCachingForceConnectionSharing", value);
    }
    /**
     * Sets the contentCachingKeepAwake property value. Prevent the device from sleeping if content caching is enabled.
     * @param value Value to set for the contentCachingKeepAwake property.
     */
    public void setContentCachingKeepAwake(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contentCachingKeepAwake", value);
    }
    /**
     * Sets the contentCachingLogClientIdentities property value. Enables logging of IP addresses and ports of clients that request cached content.
     * @param value Value to set for the contentCachingLogClientIdentities property.
     */
    public void setContentCachingLogClientIdentities(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contentCachingLogClientIdentities", value);
    }
    /**
     * Sets the contentCachingMaxSizeBytes property value. The maximum number of bytes of disk space that will be used for the content cache. A value of 0 (default) indicates unlimited disk space.
     * @param value Value to set for the contentCachingMaxSizeBytes property.
     */
    public void setContentCachingMaxSizeBytes(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("contentCachingMaxSizeBytes", value);
    }
    /**
     * Sets the contentCachingParents property value. A list of IP addresses representing parent content caches.
     * @param value Value to set for the contentCachingParents property.
     */
    public void setContentCachingParents(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("contentCachingParents", value);
    }
    /**
     * Sets the contentCachingParentSelectionPolicy property value. Determines how content caches select a parent cache.
     * @param value Value to set for the contentCachingParentSelectionPolicy property.
     */
    public void setContentCachingParentSelectionPolicy(@jakarta.annotation.Nullable final MacOSContentCachingParentSelectionPolicy value) {
        this.BackingStore.set("contentCachingParentSelectionPolicy", value);
    }
    /**
     * Sets the contentCachingPeerFilterRanges property value. A list of custom IP ranges content caches will use to query for content from peers caches. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingPeerFilterRanges property.
     */
    public void setContentCachingPeerFilterRanges(@jakarta.annotation.Nullable final java.util.List<IpRange> value) {
        this.BackingStore.set("contentCachingPeerFilterRanges", value);
    }
    /**
     * Sets the contentCachingPeerListenRanges property value. A list of custom IP ranges content caches will use to listen for peer caches. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingPeerListenRanges property.
     */
    public void setContentCachingPeerListenRanges(@jakarta.annotation.Nullable final java.util.List<IpRange> value) {
        this.BackingStore.set("contentCachingPeerListenRanges", value);
    }
    /**
     * Sets the contentCachingPeerPolicy property value. Determines which content caches other content caches will peer with.
     * @param value Value to set for the contentCachingPeerPolicy property.
     */
    public void setContentCachingPeerPolicy(@jakarta.annotation.Nullable final MacOSContentCachingPeerPolicy value) {
        this.BackingStore.set("contentCachingPeerPolicy", value);
    }
    /**
     * Sets the contentCachingPort property value. Sets the port used for content caching. If the value is 0, a random available port will be selected. Valid values 0 to 65535
     * @param value Value to set for the contentCachingPort property.
     */
    public void setContentCachingPort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("contentCachingPort", value);
    }
    /**
     * Sets the contentCachingPublicRanges property value. A list of custom IP ranges that Apple's content caching service should use to match clients to content caches. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the contentCachingPublicRanges property.
     */
    public void setContentCachingPublicRanges(@jakarta.annotation.Nullable final java.util.List<IpRange> value) {
        this.BackingStore.set("contentCachingPublicRanges", value);
    }
    /**
     * Sets the contentCachingShowAlerts property value. Display content caching alerts as system notifications.
     * @param value Value to set for the contentCachingShowAlerts property.
     */
    public void setContentCachingShowAlerts(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contentCachingShowAlerts", value);
    }
    /**
     * Sets the contentCachingType property value. Indicates the type of content allowed to be cached by Apple's content caching service.
     * @param value Value to set for the contentCachingType property.
     */
    public void setContentCachingType(@jakarta.annotation.Nullable final MacOSContentCachingType value) {
        this.BackingStore.set("contentCachingType", value);
    }
    /**
     * Sets the loginWindowText property value. Custom text to be displayed on the login window.
     * @param value Value to set for the loginWindowText property.
     */
    public void setLoginWindowText(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("loginWindowText", value);
    }
    /**
     * Sets the logOutDisabledWhileLoggedIn property value. Whether the Log Out menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the logOutDisabledWhileLoggedIn property.
     */
    public void setLogOutDisabledWhileLoggedIn(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("logOutDisabledWhileLoggedIn", value);
    }
    /**
     * Sets the macOSSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @param value Value to set for the macOSSingleSignOnExtension property.
     */
    public void setMacOSSingleSignOnExtension(@jakarta.annotation.Nullable final MacOSSingleSignOnExtension value) {
        this.BackingStore.set("macOSSingleSignOnExtension", value);
    }
    /**
     * Sets the powerOffDisabledWhileLoggedIn property value. Whether the Power Off menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the powerOffDisabledWhileLoggedIn property.
     */
    public void setPowerOffDisabledWhileLoggedIn(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("powerOffDisabledWhileLoggedIn", value);
    }
    /**
     * Sets the restartDisabled property value. Whether to hide the Restart button item on the login window.
     * @param value Value to set for the restartDisabled property.
     */
    public void setRestartDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("restartDisabled", value);
    }
    /**
     * Sets the restartDisabledWhileLoggedIn property value. Whether the Restart menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the restartDisabledWhileLoggedIn property.
     */
    public void setRestartDisabledWhileLoggedIn(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("restartDisabledWhileLoggedIn", value);
    }
    /**
     * Sets the screenLockDisableImmediate property value. Whether to disable the immediate screen lock functions.
     * @param value Value to set for the screenLockDisableImmediate property.
     */
    public void setScreenLockDisableImmediate(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("screenLockDisableImmediate", value);
    }
    /**
     * Sets the shutDownDisabled property value. Whether to hide the Shut Down button item on the login window.
     * @param value Value to set for the shutDownDisabled property.
     */
    public void setShutDownDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("shutDownDisabled", value);
    }
    /**
     * Sets the shutDownDisabledWhileLoggedIn property value. Whether the Shut Down menu item on the login window will be disabled while the user is logged in.
     * @param value Value to set for the shutDownDisabledWhileLoggedIn property.
     */
    public void setShutDownDisabledWhileLoggedIn(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("shutDownDisabledWhileLoggedIn", value);
    }
    /**
     * Sets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use MacOSSingleSignOnExtension instead.
     * @param value Value to set for the singleSignOnExtension property.
     */
    public void setSingleSignOnExtension(@jakarta.annotation.Nullable final SingleSignOnExtension value) {
        this.BackingStore.set("singleSignOnExtension", value);
    }
    /**
     * Sets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extensions.
     * @param value Value to set for the singleSignOnExtensionPkinitCertificate property.
     */
    public void setSingleSignOnExtensionPkinitCertificate(@jakarta.annotation.Nullable final MacOSCertificateProfileBase value) {
        this.BackingStore.set("singleSignOnExtensionPkinitCertificate", value);
    }
    /**
     * Sets the sleepDisabled property value. Whether to hide the Sleep menu item on the login window.
     * @param value Value to set for the sleepDisabled property.
     */
    public void setSleepDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("sleepDisabled", value);
    }
}
