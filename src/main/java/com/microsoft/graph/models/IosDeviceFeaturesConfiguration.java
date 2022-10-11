package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements Parsable {
    /** Asset tag information for the device, displayed on the login window and lock screen. */
    private String _assetTagTemplate;
    /** Gets or sets iOS Web Content Filter settings, supervised mode only */
    private IosWebContentFilterBase _contentFilterSettings;
    /** A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosHomeScreenItem> _homeScreenDockIcons;
    /** Gets or sets the number of rows to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridWidth must be configured as well. */
    private Integer _homeScreenGridHeight;
    /** Gets or sets the number of columns to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridHeight must be configured as well. */
    private Integer _homeScreenGridWidth;
    /** A list of pages on the Home Screen. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosHomeScreenPage> _homeScreenPages;
    /** Identity Certificate for the renewal of Kerberos ticket used in single sign-on settings. */
    private IosCertificateProfileBase _identityCertificateForClientAuthentication;
    /** Gets or sets a single sign-on extension profile. */
    private IosSingleSignOnExtension _iosSingleSignOnExtension;
    /** A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later. */
    private String _lockScreenFootnote;
    /** Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements. */
    private java.util.List<IosNotificationSettings> _notificationSettings;
    /** Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead. */
    private SingleSignOnExtension _singleSignOnExtension;
    /** PKINIT Certificate for the authentication with single sign-on extension settings. */
    private IosCertificateProfileBase _singleSignOnExtensionPkinitCertificate;
    /** The Kerberos login settings that enable apps on receiving devices to authenticate smoothly. */
    private IosSingleSignOnSettings _singleSignOnSettings;
    /** An enum type for wallpaper display location specifier. */
    private IosWallpaperDisplayLocation _wallpaperDisplayLocation;
    /** A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version. */
    private MimeContent _wallpaperImage;
    /**
     * Instantiates a new IosDeviceFeaturesConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosDeviceFeaturesConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosDeviceFeaturesConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosDeviceFeaturesConfiguration
     */
    @javax.annotation.Nonnull
    public static IosDeviceFeaturesConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDeviceFeaturesConfiguration();
    }
    /**
     * Gets the assetTagTemplate property value. Asset tag information for the device, displayed on the login window and lock screen.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetTagTemplate() {
        return this._assetTagTemplate;
    }
    /**
     * Gets the contentFilterSettings property value. Gets or sets iOS Web Content Filter settings, supervised mode only
     * @return a iosWebContentFilterBase
     */
    @javax.annotation.Nullable
    public IosWebContentFilterBase getContentFilterSettings() {
        return this._contentFilterSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosDeviceFeaturesConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assetTagTemplate", (n) -> { currentObject.setAssetTagTemplate(n.getStringValue()); });
            this.put("contentFilterSettings", (n) -> { currentObject.setContentFilterSettings(n.getObjectValue(IosWebContentFilterBase::createFromDiscriminatorValue)); });
            this.put("homeScreenDockIcons", (n) -> { currentObject.setHomeScreenDockIcons(n.getCollectionOfObjectValues(IosHomeScreenItem::createFromDiscriminatorValue)); });
            this.put("homeScreenGridHeight", (n) -> { currentObject.setHomeScreenGridHeight(n.getIntegerValue()); });
            this.put("homeScreenGridWidth", (n) -> { currentObject.setHomeScreenGridWidth(n.getIntegerValue()); });
            this.put("homeScreenPages", (n) -> { currentObject.setHomeScreenPages(n.getCollectionOfObjectValues(IosHomeScreenPage::createFromDiscriminatorValue)); });
            this.put("identityCertificateForClientAuthentication", (n) -> { currentObject.setIdentityCertificateForClientAuthentication(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("iosSingleSignOnExtension", (n) -> { currentObject.setIosSingleSignOnExtension(n.getObjectValue(IosSingleSignOnExtension::createFromDiscriminatorValue)); });
            this.put("lockScreenFootnote", (n) -> { currentObject.setLockScreenFootnote(n.getStringValue()); });
            this.put("notificationSettings", (n) -> { currentObject.setNotificationSettings(n.getCollectionOfObjectValues(IosNotificationSettings::createFromDiscriminatorValue)); });
            this.put("singleSignOnExtension", (n) -> { currentObject.setSingleSignOnExtension(n.getObjectValue(SingleSignOnExtension::createFromDiscriminatorValue)); });
            this.put("singleSignOnExtensionPkinitCertificate", (n) -> { currentObject.setSingleSignOnExtensionPkinitCertificate(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("singleSignOnSettings", (n) -> { currentObject.setSingleSignOnSettings(n.getObjectValue(IosSingleSignOnSettings::createFromDiscriminatorValue)); });
            this.put("wallpaperDisplayLocation", (n) -> { currentObject.setWallpaperDisplayLocation(n.getEnumValue(IosWallpaperDisplayLocation.class)); });
            this.put("wallpaperImage", (n) -> { currentObject.setWallpaperImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @return a iosHomeScreenItem
     */
    @javax.annotation.Nullable
    public java.util.List<IosHomeScreenItem> getHomeScreenDockIcons() {
        return this._homeScreenDockIcons;
    }
    /**
     * Gets the homeScreenGridHeight property value. Gets or sets the number of rows to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridWidth must be configured as well.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHomeScreenGridHeight() {
        return this._homeScreenGridHeight;
    }
    /**
     * Gets the homeScreenGridWidth property value. Gets or sets the number of columns to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridHeight must be configured as well.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHomeScreenGridWidth() {
        return this._homeScreenGridWidth;
    }
    /**
     * Gets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @return a iosHomeScreenPage
     */
    @javax.annotation.Nullable
    public java.util.List<IosHomeScreenPage> getHomeScreenPages() {
        return this._homeScreenPages;
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for the renewal of Kerberos ticket used in single sign-on settings.
     * @return a iosCertificateProfileBase
     */
    @javax.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this._identityCertificateForClientAuthentication;
    }
    /**
     * Gets the iosSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @return a iosSingleSignOnExtension
     */
    @javax.annotation.Nullable
    public IosSingleSignOnExtension getIosSingleSignOnExtension() {
        return this._iosSingleSignOnExtension;
    }
    /**
     * Gets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLockScreenFootnote() {
        return this._lockScreenFootnote;
    }
    /**
     * Gets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @return a iosNotificationSettings
     */
    @javax.annotation.Nullable
    public java.util.List<IosNotificationSettings> getNotificationSettings() {
        return this._notificationSettings;
    }
    /**
     * Gets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead.
     * @return a singleSignOnExtension
     */
    @javax.annotation.Nullable
    public SingleSignOnExtension getSingleSignOnExtension() {
        return this._singleSignOnExtension;
    }
    /**
     * Gets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extension settings.
     * @return a iosCertificateProfileBase
     */
    @javax.annotation.Nullable
    public IosCertificateProfileBase getSingleSignOnExtensionPkinitCertificate() {
        return this._singleSignOnExtensionPkinitCertificate;
    }
    /**
     * Gets the singleSignOnSettings property value. The Kerberos login settings that enable apps on receiving devices to authenticate smoothly.
     * @return a iosSingleSignOnSettings
     */
    @javax.annotation.Nullable
    public IosSingleSignOnSettings getSingleSignOnSettings() {
        return this._singleSignOnSettings;
    }
    /**
     * Gets the wallpaperDisplayLocation property value. An enum type for wallpaper display location specifier.
     * @return a iosWallpaperDisplayLocation
     */
    @javax.annotation.Nullable
    public IosWallpaperDisplayLocation getWallpaperDisplayLocation() {
        return this._wallpaperDisplayLocation;
    }
    /**
     * Gets the wallpaperImage property value. A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getWallpaperImage() {
        return this._wallpaperImage;
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
        writer.writeStringValue("assetTagTemplate", this.getAssetTagTemplate());
        writer.writeObjectValue("contentFilterSettings", this.getContentFilterSettings());
        writer.writeCollectionOfObjectValues("homeScreenDockIcons", this.getHomeScreenDockIcons());
        writer.writeIntegerValue("homeScreenGridHeight", this.getHomeScreenGridHeight());
        writer.writeIntegerValue("homeScreenGridWidth", this.getHomeScreenGridWidth());
        writer.writeCollectionOfObjectValues("homeScreenPages", this.getHomeScreenPages());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeObjectValue("iosSingleSignOnExtension", this.getIosSingleSignOnExtension());
        writer.writeStringValue("lockScreenFootnote", this.getLockScreenFootnote());
        writer.writeCollectionOfObjectValues("notificationSettings", this.getNotificationSettings());
        writer.writeObjectValue("singleSignOnExtension", this.getSingleSignOnExtension());
        writer.writeObjectValue("singleSignOnExtensionPkinitCertificate", this.getSingleSignOnExtensionPkinitCertificate());
        writer.writeObjectValue("singleSignOnSettings", this.getSingleSignOnSettings());
        writer.writeEnumValue("wallpaperDisplayLocation", this.getWallpaperDisplayLocation());
        writer.writeObjectValue("wallpaperImage", this.getWallpaperImage());
    }
    /**
     * Sets the assetTagTemplate property value. Asset tag information for the device, displayed on the login window and lock screen.
     * @param value Value to set for the assetTagTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetTagTemplate(@javax.annotation.Nullable final String value) {
        this._assetTagTemplate = value;
    }
    /**
     * Sets the contentFilterSettings property value. Gets or sets iOS Web Content Filter settings, supervised mode only
     * @param value Value to set for the contentFilterSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentFilterSettings(@javax.annotation.Nullable final IosWebContentFilterBase value) {
        this._contentFilterSettings = value;
    }
    /**
     * Sets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenDockIcons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeScreenDockIcons(@javax.annotation.Nullable final java.util.List<IosHomeScreenItem> value) {
        this._homeScreenDockIcons = value;
    }
    /**
     * Sets the homeScreenGridHeight property value. Gets or sets the number of rows to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridWidth must be configured as well.
     * @param value Value to set for the homeScreenGridHeight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeScreenGridHeight(@javax.annotation.Nullable final Integer value) {
        this._homeScreenGridHeight = value;
    }
    /**
     * Sets the homeScreenGridWidth property value. Gets or sets the number of columns to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridHeight must be configured as well.
     * @param value Value to set for the homeScreenGridWidth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeScreenGridWidth(@javax.annotation.Nullable final Integer value) {
        this._homeScreenGridWidth = value;
    }
    /**
     * Sets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenPages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeScreenPages(@javax.annotation.Nullable final java.util.List<IosHomeScreenPage> value) {
        this._homeScreenPages = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for the renewal of Kerberos ticket used in single sign-on settings.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityCertificateForClientAuthentication(@javax.annotation.Nullable final IosCertificateProfileBase value) {
        this._identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the iosSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @param value Value to set for the iosSingleSignOnExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosSingleSignOnExtension(@javax.annotation.Nullable final IosSingleSignOnExtension value) {
        this._iosSingleSignOnExtension = value;
    }
    /**
     * Sets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @param value Value to set for the lockScreenFootnote property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenFootnote(@javax.annotation.Nullable final String value) {
        this._lockScreenFootnote = value;
    }
    /**
     * Sets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the notificationSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationSettings(@javax.annotation.Nullable final java.util.List<IosNotificationSettings> value) {
        this._notificationSettings = value;
    }
    /**
     * Sets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead.
     * @param value Value to set for the singleSignOnExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSignOnExtension(@javax.annotation.Nullable final SingleSignOnExtension value) {
        this._singleSignOnExtension = value;
    }
    /**
     * Sets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extension settings.
     * @param value Value to set for the singleSignOnExtensionPkinitCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSignOnExtensionPkinitCertificate(@javax.annotation.Nullable final IosCertificateProfileBase value) {
        this._singleSignOnExtensionPkinitCertificate = value;
    }
    /**
     * Sets the singleSignOnSettings property value. The Kerberos login settings that enable apps on receiving devices to authenticate smoothly.
     * @param value Value to set for the singleSignOnSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSignOnSettings(@javax.annotation.Nullable final IosSingleSignOnSettings value) {
        this._singleSignOnSettings = value;
    }
    /**
     * Sets the wallpaperDisplayLocation property value. An enum type for wallpaper display location specifier.
     * @param value Value to set for the wallpaperDisplayLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWallpaperDisplayLocation(@javax.annotation.Nullable final IosWallpaperDisplayLocation value) {
        this._wallpaperDisplayLocation = value;
    }
    /**
     * Sets the wallpaperImage property value. A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version.
     * @param value Value to set for the wallpaperImage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWallpaperImage(@javax.annotation.Nullable final MimeContent value) {
        this._wallpaperImage = value;
    }
}
