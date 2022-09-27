package com.microsoft.graph.models.tenantadmin;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Settings extends Entity implements Parsable {
    /** Collection of trusted domain GUIDs for the OneDrive sync app. */
    private java.util.List<String> _allowedDomainGuidsForSyncApp;
    /** Collection of managed paths available for site creation. Read-only. */
    private java.util.List<String> _availableManagedPathsForSiteCreation;
    /** The number of days for preserving a deleted user's OneDrive. */
    private Integer _deletedUserPersonalSiteRetentionPeriodInDays;
    /** Collection of file extensions not uploaded by the OneDrive sync app. */
    private java.util.List<String> _excludedFileExtensionsForSyncApp;
    /** Specifies the idle session sign-out policies for the tenant. */
    private IdleSessionSignOut _idleSessionSignOut;
    /** Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced. */
    private ImageTaggingChoice _imageTaggingOption;
    /** Indicates whether comments are allowed on modern site pages in SharePoint. */
    private Boolean _isCommentingOnSitePagesEnabled;
    /** Indicates whether push notifications are enabled for OneDrive events. */
    private Boolean _isFileActivityNotificationEnabled;
    /** Indicates whether legacy authentication protocols are enabled for the tenant. */
    private Boolean _isLegacyAuthProtocolsEnabled;
    /** Indicates whetherif Fluid Framework is allowed on SharePoint sites. */
    private Boolean _isLoopEnabled;
    /** Indicates whether files can be synced using the OneDrive sync app for Mac. */
    private Boolean _isMacSyncAppEnabled;
    /** Indicates whether guests must sign in using the same account to which sharing invitations are sent. */
    private Boolean _isRequireAcceptingUserToMatchInvitedUserEnabled;
    /** Indicates whether guests are allowed to reshare files, folders, and sites they don't own. */
    private Boolean _isResharingByExternalUsersEnabled;
    /** Indicates whether mobile push notifications are enabled for SharePoint. */
    private Boolean _isSharePointMobileNotificationEnabled;
    /** Indicates whether the newsfeed is allowed on the modern site pages in SharePoint. */
    private Boolean _isSharePointNewsfeedEnabled;
    /** Indicates whether users are allowed to create sites. */
    private Boolean _isSiteCreationEnabled;
    /** Indicates whether the UI commands for creating sites are shown. */
    private Boolean _isSiteCreationUIEnabled;
    /** Indicates whether creating new modern pages is allowed on SharePoint sites. */
    private Boolean _isSitePagesCreationEnabled;
    /** Indicates whether site storage space is automatically managed or if specific storage limits are set per site. */
    private Boolean _isSitesStorageLimitAutomatic;
    /** Indicates whether the sync button in OneDrive is hidden. */
    private Boolean _isSyncButtonHiddenOnPersonalSite;
    /** Indicates whether users are allowed to sync files only on PCs joined to specific domains. */
    private Boolean _isUnmanagedSyncAppForTenantRestricted;
    /** The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB). */
    private Long _personalSiteDefaultStorageLimitInMB;
    /** Collection of email domains that are allowed for sharing outside the organization. */
    private java.util.List<String> _sharingAllowedDomainList;
    /** Collection of email domains that are blocked for sharing outside the organization. */
    private java.util.List<String> _sharingBlockedDomainList;
    /** Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly. */
    private SharingCapabilities _sharingCapability;
    /** Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList. */
    private SharingDomainRestrictionMode _sharingDomainRestrictionMode;
    /** The value of the team site managed path. This is the path under which new team sites will be created. */
    private String _siteCreationDefaultManagedPath;
    /** The default storage quota for a new site upon creation. Measured in megabytes (MB). */
    private Integer _siteCreationDefaultStorageLimitInMB;
    /** The default timezone of a tenant for newly created sites. */
    private String _tenantDefaultTimezone;
    /**
     * Instantiates a new settings and sets the default values.
     * @return a void
     */
    public Settings() {
        super();
        this.setOdataType("#microsoft.graph.tenantAdmin.settings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a settings
     */
    @javax.annotation.Nonnull
    public static Settings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Settings();
    }
    /**
     * Gets the allowedDomainGuidsForSyncApp property value. Collection of trusted domain GUIDs for the OneDrive sync app.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedDomainGuidsForSyncApp() {
        return this._allowedDomainGuidsForSyncApp;
    }
    /**
     * Gets the availableManagedPathsForSiteCreation property value. Collection of managed paths available for site creation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAvailableManagedPathsForSiteCreation() {
        return this._availableManagedPathsForSiteCreation;
    }
    /**
     * Gets the deletedUserPersonalSiteRetentionPeriodInDays property value. The number of days for preserving a deleted user's OneDrive.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeletedUserPersonalSiteRetentionPeriodInDays() {
        return this._deletedUserPersonalSiteRetentionPeriodInDays;
    }
    /**
     * Gets the excludedFileExtensionsForSyncApp property value. Collection of file extensions not uploaded by the OneDrive sync app.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedFileExtensionsForSyncApp() {
        return this._excludedFileExtensionsForSyncApp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Settings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedDomainGuidsForSyncApp", (n) -> { currentObject.setAllowedDomainGuidsForSyncApp(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("availableManagedPathsForSiteCreation", (n) -> { currentObject.setAvailableManagedPathsForSiteCreation(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("deletedUserPersonalSiteRetentionPeriodInDays", (n) -> { currentObject.setDeletedUserPersonalSiteRetentionPeriodInDays(n.getIntegerValue()); });
            this.put("excludedFileExtensionsForSyncApp", (n) -> { currentObject.setExcludedFileExtensionsForSyncApp(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("idleSessionSignOut", (n) -> { currentObject.setIdleSessionSignOut(n.getObjectValue(IdleSessionSignOut::createFromDiscriminatorValue)); });
            this.put("imageTaggingOption", (n) -> { currentObject.setImageTaggingOption(n.getEnumValue(ImageTaggingChoice.class)); });
            this.put("isCommentingOnSitePagesEnabled", (n) -> { currentObject.setIsCommentingOnSitePagesEnabled(n.getBooleanValue()); });
            this.put("isFileActivityNotificationEnabled", (n) -> { currentObject.setIsFileActivityNotificationEnabled(n.getBooleanValue()); });
            this.put("isLegacyAuthProtocolsEnabled", (n) -> { currentObject.setIsLegacyAuthProtocolsEnabled(n.getBooleanValue()); });
            this.put("isLoopEnabled", (n) -> { currentObject.setIsLoopEnabled(n.getBooleanValue()); });
            this.put("isMacSyncAppEnabled", (n) -> { currentObject.setIsMacSyncAppEnabled(n.getBooleanValue()); });
            this.put("isRequireAcceptingUserToMatchInvitedUserEnabled", (n) -> { currentObject.setIsRequireAcceptingUserToMatchInvitedUserEnabled(n.getBooleanValue()); });
            this.put("isResharingByExternalUsersEnabled", (n) -> { currentObject.setIsResharingByExternalUsersEnabled(n.getBooleanValue()); });
            this.put("isSharePointMobileNotificationEnabled", (n) -> { currentObject.setIsSharePointMobileNotificationEnabled(n.getBooleanValue()); });
            this.put("isSharePointNewsfeedEnabled", (n) -> { currentObject.setIsSharePointNewsfeedEnabled(n.getBooleanValue()); });
            this.put("isSiteCreationEnabled", (n) -> { currentObject.setIsSiteCreationEnabled(n.getBooleanValue()); });
            this.put("isSiteCreationUIEnabled", (n) -> { currentObject.setIsSiteCreationUIEnabled(n.getBooleanValue()); });
            this.put("isSitePagesCreationEnabled", (n) -> { currentObject.setIsSitePagesCreationEnabled(n.getBooleanValue()); });
            this.put("isSitesStorageLimitAutomatic", (n) -> { currentObject.setIsSitesStorageLimitAutomatic(n.getBooleanValue()); });
            this.put("isSyncButtonHiddenOnPersonalSite", (n) -> { currentObject.setIsSyncButtonHiddenOnPersonalSite(n.getBooleanValue()); });
            this.put("isUnmanagedSyncAppForTenantRestricted", (n) -> { currentObject.setIsUnmanagedSyncAppForTenantRestricted(n.getBooleanValue()); });
            this.put("personalSiteDefaultStorageLimitInMB", (n) -> { currentObject.setPersonalSiteDefaultStorageLimitInMB(n.getLongValue()); });
            this.put("sharingAllowedDomainList", (n) -> { currentObject.setSharingAllowedDomainList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sharingBlockedDomainList", (n) -> { currentObject.setSharingBlockedDomainList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sharingCapability", (n) -> { currentObject.setSharingCapability(n.getEnumValue(SharingCapabilities.class)); });
            this.put("sharingDomainRestrictionMode", (n) -> { currentObject.setSharingDomainRestrictionMode(n.getEnumValue(SharingDomainRestrictionMode.class)); });
            this.put("siteCreationDefaultManagedPath", (n) -> { currentObject.setSiteCreationDefaultManagedPath(n.getStringValue()); });
            this.put("siteCreationDefaultStorageLimitInMB", (n) -> { currentObject.setSiteCreationDefaultStorageLimitInMB(n.getIntegerValue()); });
            this.put("tenantDefaultTimezone", (n) -> { currentObject.setTenantDefaultTimezone(n.getStringValue()); });
        }};
    }
    /**
     * Gets the idleSessionSignOut property value. Specifies the idle session sign-out policies for the tenant.
     * @return a idleSessionSignOut
     */
    @javax.annotation.Nullable
    public IdleSessionSignOut getIdleSessionSignOut() {
        return this._idleSessionSignOut;
    }
    /**
     * Gets the imageTaggingOption property value. Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     * @return a imageTaggingChoice
     */
    @javax.annotation.Nullable
    public ImageTaggingChoice getImageTaggingOption() {
        return this._imageTaggingOption;
    }
    /**
     * Gets the isCommentingOnSitePagesEnabled property value. Indicates whether comments are allowed on modern site pages in SharePoint.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCommentingOnSitePagesEnabled() {
        return this._isCommentingOnSitePagesEnabled;
    }
    /**
     * Gets the isFileActivityNotificationEnabled property value. Indicates whether push notifications are enabled for OneDrive events.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFileActivityNotificationEnabled() {
        return this._isFileActivityNotificationEnabled;
    }
    /**
     * Gets the isLegacyAuthProtocolsEnabled property value. Indicates whether legacy authentication protocols are enabled for the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLegacyAuthProtocolsEnabled() {
        return this._isLegacyAuthProtocolsEnabled;
    }
    /**
     * Gets the isLoopEnabled property value. Indicates whetherif Fluid Framework is allowed on SharePoint sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLoopEnabled() {
        return this._isLoopEnabled;
    }
    /**
     * Gets the isMacSyncAppEnabled property value. Indicates whether files can be synced using the OneDrive sync app for Mac.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMacSyncAppEnabled() {
        return this._isMacSyncAppEnabled;
    }
    /**
     * Gets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequireAcceptingUserToMatchInvitedUserEnabled() {
        return this._isRequireAcceptingUserToMatchInvitedUserEnabled;
    }
    /**
     * Gets the isResharingByExternalUsersEnabled property value. Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsResharingByExternalUsersEnabled() {
        return this._isResharingByExternalUsersEnabled;
    }
    /**
     * Gets the isSharePointMobileNotificationEnabled property value. Indicates whether mobile push notifications are enabled for SharePoint.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSharePointMobileNotificationEnabled() {
        return this._isSharePointMobileNotificationEnabled;
    }
    /**
     * Gets the isSharePointNewsfeedEnabled property value. Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSharePointNewsfeedEnabled() {
        return this._isSharePointNewsfeedEnabled;
    }
    /**
     * Gets the isSiteCreationEnabled property value. Indicates whether users are allowed to create sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSiteCreationEnabled() {
        return this._isSiteCreationEnabled;
    }
    /**
     * Gets the isSiteCreationUIEnabled property value. Indicates whether the UI commands for creating sites are shown.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSiteCreationUIEnabled() {
        return this._isSiteCreationUIEnabled;
    }
    /**
     * Gets the isSitePagesCreationEnabled property value. Indicates whether creating new modern pages is allowed on SharePoint sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSitePagesCreationEnabled() {
        return this._isSitePagesCreationEnabled;
    }
    /**
     * Gets the isSitesStorageLimitAutomatic property value. Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSitesStorageLimitAutomatic() {
        return this._isSitesStorageLimitAutomatic;
    }
    /**
     * Gets the isSyncButtonHiddenOnPersonalSite property value. Indicates whether the sync button in OneDrive is hidden.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSyncButtonHiddenOnPersonalSite() {
        return this._isSyncButtonHiddenOnPersonalSite;
    }
    /**
     * Gets the isUnmanagedSyncAppForTenantRestricted property value. Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUnmanagedSyncAppForTenantRestricted() {
        return this._isUnmanagedSyncAppForTenantRestricted;
    }
    /**
     * Gets the personalSiteDefaultStorageLimitInMB property value. The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPersonalSiteDefaultStorageLimitInMB() {
        return this._personalSiteDefaultStorageLimitInMB;
    }
    /**
     * Gets the sharingAllowedDomainList property value. Collection of email domains that are allowed for sharing outside the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSharingAllowedDomainList() {
        return this._sharingAllowedDomainList;
    }
    /**
     * Gets the sharingBlockedDomainList property value. Collection of email domains that are blocked for sharing outside the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSharingBlockedDomainList() {
        return this._sharingBlockedDomainList;
    }
    /**
     * Gets the sharingCapability property value. Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     * @return a sharingCapabilities
     */
    @javax.annotation.Nullable
    public SharingCapabilities getSharingCapability() {
        return this._sharingCapability;
    }
    /**
     * Gets the sharingDomainRestrictionMode property value. Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     * @return a sharingDomainRestrictionMode
     */
    @javax.annotation.Nullable
    public SharingDomainRestrictionMode getSharingDomainRestrictionMode() {
        return this._sharingDomainRestrictionMode;
    }
    /**
     * Gets the siteCreationDefaultManagedPath property value. The value of the team site managed path. This is the path under which new team sites will be created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteCreationDefaultManagedPath() {
        return this._siteCreationDefaultManagedPath;
    }
    /**
     * Gets the siteCreationDefaultStorageLimitInMB property value. The default storage quota for a new site upon creation. Measured in megabytes (MB).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSiteCreationDefaultStorageLimitInMB() {
        return this._siteCreationDefaultStorageLimitInMB;
    }
    /**
     * Gets the tenantDefaultTimezone property value. The default timezone of a tenant for newly created sites.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDefaultTimezone() {
        return this._tenantDefaultTimezone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedDomainGuidsForSyncApp", this.getAllowedDomainGuidsForSyncApp());
        writer.writeCollectionOfPrimitiveValues("availableManagedPathsForSiteCreation", this.getAvailableManagedPathsForSiteCreation());
        writer.writeIntegerValue("deletedUserPersonalSiteRetentionPeriodInDays", this.getDeletedUserPersonalSiteRetentionPeriodInDays());
        writer.writeCollectionOfPrimitiveValues("excludedFileExtensionsForSyncApp", this.getExcludedFileExtensionsForSyncApp());
        writer.writeObjectValue("idleSessionSignOut", this.getIdleSessionSignOut());
        writer.writeEnumValue("imageTaggingOption", this.getImageTaggingOption());
        writer.writeBooleanValue("isCommentingOnSitePagesEnabled", this.getIsCommentingOnSitePagesEnabled());
        writer.writeBooleanValue("isFileActivityNotificationEnabled", this.getIsFileActivityNotificationEnabled());
        writer.writeBooleanValue("isLegacyAuthProtocolsEnabled", this.getIsLegacyAuthProtocolsEnabled());
        writer.writeBooleanValue("isLoopEnabled", this.getIsLoopEnabled());
        writer.writeBooleanValue("isMacSyncAppEnabled", this.getIsMacSyncAppEnabled());
        writer.writeBooleanValue("isRequireAcceptingUserToMatchInvitedUserEnabled", this.getIsRequireAcceptingUserToMatchInvitedUserEnabled());
        writer.writeBooleanValue("isResharingByExternalUsersEnabled", this.getIsResharingByExternalUsersEnabled());
        writer.writeBooleanValue("isSharePointMobileNotificationEnabled", this.getIsSharePointMobileNotificationEnabled());
        writer.writeBooleanValue("isSharePointNewsfeedEnabled", this.getIsSharePointNewsfeedEnabled());
        writer.writeBooleanValue("isSiteCreationEnabled", this.getIsSiteCreationEnabled());
        writer.writeBooleanValue("isSiteCreationUIEnabled", this.getIsSiteCreationUIEnabled());
        writer.writeBooleanValue("isSitePagesCreationEnabled", this.getIsSitePagesCreationEnabled());
        writer.writeBooleanValue("isSitesStorageLimitAutomatic", this.getIsSitesStorageLimitAutomatic());
        writer.writeBooleanValue("isSyncButtonHiddenOnPersonalSite", this.getIsSyncButtonHiddenOnPersonalSite());
        writer.writeBooleanValue("isUnmanagedSyncAppForTenantRestricted", this.getIsUnmanagedSyncAppForTenantRestricted());
        writer.writeLongValue("personalSiteDefaultStorageLimitInMB", this.getPersonalSiteDefaultStorageLimitInMB());
        writer.writeCollectionOfPrimitiveValues("sharingAllowedDomainList", this.getSharingAllowedDomainList());
        writer.writeCollectionOfPrimitiveValues("sharingBlockedDomainList", this.getSharingBlockedDomainList());
        writer.writeEnumValue("sharingCapability", this.getSharingCapability());
        writer.writeEnumValue("sharingDomainRestrictionMode", this.getSharingDomainRestrictionMode());
        writer.writeStringValue("siteCreationDefaultManagedPath", this.getSiteCreationDefaultManagedPath());
        writer.writeIntegerValue("siteCreationDefaultStorageLimitInMB", this.getSiteCreationDefaultStorageLimitInMB());
        writer.writeStringValue("tenantDefaultTimezone", this.getTenantDefaultTimezone());
    }
    /**
     * Sets the allowedDomainGuidsForSyncApp property value. Collection of trusted domain GUIDs for the OneDrive sync app.
     * @param value Value to set for the allowedDomainGuidsForSyncApp property.
     * @return a void
     */
    public void setAllowedDomainGuidsForSyncApp(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedDomainGuidsForSyncApp = value;
    }
    /**
     * Sets the availableManagedPathsForSiteCreation property value. Collection of managed paths available for site creation. Read-only.
     * @param value Value to set for the availableManagedPathsForSiteCreation property.
     * @return a void
     */
    public void setAvailableManagedPathsForSiteCreation(@javax.annotation.Nullable final java.util.List<String> value) {
        this._availableManagedPathsForSiteCreation = value;
    }
    /**
     * Sets the deletedUserPersonalSiteRetentionPeriodInDays property value. The number of days for preserving a deleted user's OneDrive.
     * @param value Value to set for the deletedUserPersonalSiteRetentionPeriodInDays property.
     * @return a void
     */
    public void setDeletedUserPersonalSiteRetentionPeriodInDays(@javax.annotation.Nullable final Integer value) {
        this._deletedUserPersonalSiteRetentionPeriodInDays = value;
    }
    /**
     * Sets the excludedFileExtensionsForSyncApp property value. Collection of file extensions not uploaded by the OneDrive sync app.
     * @param value Value to set for the excludedFileExtensionsForSyncApp property.
     * @return a void
     */
    public void setExcludedFileExtensionsForSyncApp(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludedFileExtensionsForSyncApp = value;
    }
    /**
     * Sets the idleSessionSignOut property value. Specifies the idle session sign-out policies for the tenant.
     * @param value Value to set for the idleSessionSignOut property.
     * @return a void
     */
    public void setIdleSessionSignOut(@javax.annotation.Nullable final IdleSessionSignOut value) {
        this._idleSessionSignOut = value;
    }
    /**
     * Sets the imageTaggingOption property value. Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     * @param value Value to set for the imageTaggingOption property.
     * @return a void
     */
    public void setImageTaggingOption(@javax.annotation.Nullable final ImageTaggingChoice value) {
        this._imageTaggingOption = value;
    }
    /**
     * Sets the isCommentingOnSitePagesEnabled property value. Indicates whether comments are allowed on modern site pages in SharePoint.
     * @param value Value to set for the isCommentingOnSitePagesEnabled property.
     * @return a void
     */
    public void setIsCommentingOnSitePagesEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isCommentingOnSitePagesEnabled = value;
    }
    /**
     * Sets the isFileActivityNotificationEnabled property value. Indicates whether push notifications are enabled for OneDrive events.
     * @param value Value to set for the isFileActivityNotificationEnabled property.
     * @return a void
     */
    public void setIsFileActivityNotificationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isFileActivityNotificationEnabled = value;
    }
    /**
     * Sets the isLegacyAuthProtocolsEnabled property value. Indicates whether legacy authentication protocols are enabled for the tenant.
     * @param value Value to set for the isLegacyAuthProtocolsEnabled property.
     * @return a void
     */
    public void setIsLegacyAuthProtocolsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isLegacyAuthProtocolsEnabled = value;
    }
    /**
     * Sets the isLoopEnabled property value. Indicates whetherif Fluid Framework is allowed on SharePoint sites.
     * @param value Value to set for the isLoopEnabled property.
     * @return a void
     */
    public void setIsLoopEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isLoopEnabled = value;
    }
    /**
     * Sets the isMacSyncAppEnabled property value. Indicates whether files can be synced using the OneDrive sync app for Mac.
     * @param value Value to set for the isMacSyncAppEnabled property.
     * @return a void
     */
    public void setIsMacSyncAppEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isMacSyncAppEnabled = value;
    }
    /**
     * Sets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     * @param value Value to set for the isRequireAcceptingUserToMatchInvitedUserEnabled property.
     * @return a void
     */
    public void setIsRequireAcceptingUserToMatchInvitedUserEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isRequireAcceptingUserToMatchInvitedUserEnabled = value;
    }
    /**
     * Sets the isResharingByExternalUsersEnabled property value. Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     * @param value Value to set for the isResharingByExternalUsersEnabled property.
     * @return a void
     */
    public void setIsResharingByExternalUsersEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isResharingByExternalUsersEnabled = value;
    }
    /**
     * Sets the isSharePointMobileNotificationEnabled property value. Indicates whether mobile push notifications are enabled for SharePoint.
     * @param value Value to set for the isSharePointMobileNotificationEnabled property.
     * @return a void
     */
    public void setIsSharePointMobileNotificationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSharePointMobileNotificationEnabled = value;
    }
    /**
     * Sets the isSharePointNewsfeedEnabled property value. Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     * @param value Value to set for the isSharePointNewsfeedEnabled property.
     * @return a void
     */
    public void setIsSharePointNewsfeedEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSharePointNewsfeedEnabled = value;
    }
    /**
     * Sets the isSiteCreationEnabled property value. Indicates whether users are allowed to create sites.
     * @param value Value to set for the isSiteCreationEnabled property.
     * @return a void
     */
    public void setIsSiteCreationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSiteCreationEnabled = value;
    }
    /**
     * Sets the isSiteCreationUIEnabled property value. Indicates whether the UI commands for creating sites are shown.
     * @param value Value to set for the isSiteCreationUIEnabled property.
     * @return a void
     */
    public void setIsSiteCreationUIEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSiteCreationUIEnabled = value;
    }
    /**
     * Sets the isSitePagesCreationEnabled property value. Indicates whether creating new modern pages is allowed on SharePoint sites.
     * @param value Value to set for the isSitePagesCreationEnabled property.
     * @return a void
     */
    public void setIsSitePagesCreationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSitePagesCreationEnabled = value;
    }
    /**
     * Sets the isSitesStorageLimitAutomatic property value. Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     * @param value Value to set for the isSitesStorageLimitAutomatic property.
     * @return a void
     */
    public void setIsSitesStorageLimitAutomatic(@javax.annotation.Nullable final Boolean value) {
        this._isSitesStorageLimitAutomatic = value;
    }
    /**
     * Sets the isSyncButtonHiddenOnPersonalSite property value. Indicates whether the sync button in OneDrive is hidden.
     * @param value Value to set for the isSyncButtonHiddenOnPersonalSite property.
     * @return a void
     */
    public void setIsSyncButtonHiddenOnPersonalSite(@javax.annotation.Nullable final Boolean value) {
        this._isSyncButtonHiddenOnPersonalSite = value;
    }
    /**
     * Sets the isUnmanagedSyncAppForTenantRestricted property value. Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     * @param value Value to set for the isUnmanagedSyncAppForTenantRestricted property.
     * @return a void
     */
    public void setIsUnmanagedSyncAppForTenantRestricted(@javax.annotation.Nullable final Boolean value) {
        this._isUnmanagedSyncAppForTenantRestricted = value;
    }
    /**
     * Sets the personalSiteDefaultStorageLimitInMB property value. The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     * @param value Value to set for the personalSiteDefaultStorageLimitInMB property.
     * @return a void
     */
    public void setPersonalSiteDefaultStorageLimitInMB(@javax.annotation.Nullable final Long value) {
        this._personalSiteDefaultStorageLimitInMB = value;
    }
    /**
     * Sets the sharingAllowedDomainList property value. Collection of email domains that are allowed for sharing outside the organization.
     * @param value Value to set for the sharingAllowedDomainList property.
     * @return a void
     */
    public void setSharingAllowedDomainList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sharingAllowedDomainList = value;
    }
    /**
     * Sets the sharingBlockedDomainList property value. Collection of email domains that are blocked for sharing outside the organization.
     * @param value Value to set for the sharingBlockedDomainList property.
     * @return a void
     */
    public void setSharingBlockedDomainList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sharingBlockedDomainList = value;
    }
    /**
     * Sets the sharingCapability property value. Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     * @param value Value to set for the sharingCapability property.
     * @return a void
     */
    public void setSharingCapability(@javax.annotation.Nullable final SharingCapabilities value) {
        this._sharingCapability = value;
    }
    /**
     * Sets the sharingDomainRestrictionMode property value. Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     * @param value Value to set for the sharingDomainRestrictionMode property.
     * @return a void
     */
    public void setSharingDomainRestrictionMode(@javax.annotation.Nullable final SharingDomainRestrictionMode value) {
        this._sharingDomainRestrictionMode = value;
    }
    /**
     * Sets the siteCreationDefaultManagedPath property value. The value of the team site managed path. This is the path under which new team sites will be created.
     * @param value Value to set for the siteCreationDefaultManagedPath property.
     * @return a void
     */
    public void setSiteCreationDefaultManagedPath(@javax.annotation.Nullable final String value) {
        this._siteCreationDefaultManagedPath = value;
    }
    /**
     * Sets the siteCreationDefaultStorageLimitInMB property value. The default storage quota for a new site upon creation. Measured in megabytes (MB).
     * @param value Value to set for the siteCreationDefaultStorageLimitInMB property.
     * @return a void
     */
    public void setSiteCreationDefaultStorageLimitInMB(@javax.annotation.Nullable final Integer value) {
        this._siteCreationDefaultStorageLimitInMB = value;
    }
    /**
     * Sets the tenantDefaultTimezone property value. The default timezone of a tenant for newly created sites.
     * @param value Value to set for the tenantDefaultTimezone property.
     * @return a void
     */
    public void setTenantDefaultTimezone(@javax.annotation.Nullable final String value) {
        this._tenantDefaultTimezone = value;
    }
}
