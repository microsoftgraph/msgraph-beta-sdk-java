package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS Device Features Configuration Profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements Parsable {
    /**
     * Instantiates a new IosDeviceFeaturesConfiguration and sets the default values.
     */
    public IosDeviceFeaturesConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosDeviceFeaturesConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosDeviceFeaturesConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosDeviceFeaturesConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDeviceFeaturesConfiguration();
    }
    /**
     * Gets the assetTagTemplate property value. Asset tag information for the device, displayed on the login window and lock screen.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssetTagTemplate() {
        return this.backingStore.get("assetTagTemplate");
    }
    /**
     * Gets the contentFilterSettings property value. Gets or sets iOS Web Content Filter settings, supervised mode only
     * @return a IosWebContentFilterBase
     */
    @jakarta.annotation.Nullable
    public IosWebContentFilterBase getContentFilterSettings() {
        return this.backingStore.get("contentFilterSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assetTagTemplate", (n) -> { this.setAssetTagTemplate(n.getStringValue()); });
        deserializerMap.put("contentFilterSettings", (n) -> { this.setContentFilterSettings(n.getObjectValue(IosWebContentFilterBase::createFromDiscriminatorValue)); });
        deserializerMap.put("homeScreenDockIcons", (n) -> { this.setHomeScreenDockIcons(n.getCollectionOfObjectValues(IosHomeScreenItem::createFromDiscriminatorValue)); });
        deserializerMap.put("homeScreenGridHeight", (n) -> { this.setHomeScreenGridHeight(n.getIntegerValue()); });
        deserializerMap.put("homeScreenGridWidth", (n) -> { this.setHomeScreenGridWidth(n.getIntegerValue()); });
        deserializerMap.put("homeScreenPages", (n) -> { this.setHomeScreenPages(n.getCollectionOfObjectValues(IosHomeScreenPage::createFromDiscriminatorValue)); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("iosSingleSignOnExtension", (n) -> { this.setIosSingleSignOnExtension(n.getObjectValue(IosSingleSignOnExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("lockScreenFootnote", (n) -> { this.setLockScreenFootnote(n.getStringValue()); });
        deserializerMap.put("notificationSettings", (n) -> { this.setNotificationSettings(n.getCollectionOfObjectValues(IosNotificationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("singleSignOnExtension", (n) -> { this.setSingleSignOnExtension(n.getObjectValue(SingleSignOnExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("singleSignOnExtensionPkinitCertificate", (n) -> { this.setSingleSignOnExtensionPkinitCertificate(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("singleSignOnSettings", (n) -> { this.setSingleSignOnSettings(n.getObjectValue(IosSingleSignOnSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("wallpaperDisplayLocation", (n) -> { this.setWallpaperDisplayLocation(n.getEnumValue(IosWallpaperDisplayLocation.class)); });
        deserializerMap.put("wallpaperImage", (n) -> { this.setWallpaperImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IosHomeScreenItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosHomeScreenItem> getHomeScreenDockIcons() {
        return this.backingStore.get("homeScreenDockIcons");
    }
    /**
     * Gets the homeScreenGridHeight property value. Gets or sets the number of rows to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridWidth must be configured as well.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getHomeScreenGridHeight() {
        return this.backingStore.get("homeScreenGridHeight");
    }
    /**
     * Gets the homeScreenGridWidth property value. Gets or sets the number of columns to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridHeight must be configured as well.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getHomeScreenGridWidth() {
        return this.backingStore.get("homeScreenGridWidth");
    }
    /**
     * Gets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IosHomeScreenPage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosHomeScreenPage> getHomeScreenPages() {
        return this.backingStore.get("homeScreenPages");
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for the renewal of Kerberos ticket used in single sign-on settings.
     * @return a IosCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.backingStore.get("identityCertificateForClientAuthentication");
    }
    /**
     * Gets the iosSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @return a IosSingleSignOnExtension
     */
    @jakarta.annotation.Nullable
    public IosSingleSignOnExtension getIosSingleSignOnExtension() {
        return this.backingStore.get("iosSingleSignOnExtension");
    }
    /**
     * Gets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLockScreenFootnote() {
        return this.backingStore.get("lockScreenFootnote");
    }
    /**
     * Gets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IosNotificationSettings>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosNotificationSettings> getNotificationSettings() {
        return this.backingStore.get("notificationSettings");
    }
    /**
     * Gets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead.
     * @return a SingleSignOnExtension
     */
    @jakarta.annotation.Nullable
    public SingleSignOnExtension getSingleSignOnExtension() {
        return this.backingStore.get("singleSignOnExtension");
    }
    /**
     * Gets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extension settings.
     * @return a IosCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfileBase getSingleSignOnExtensionPkinitCertificate() {
        return this.backingStore.get("singleSignOnExtensionPkinitCertificate");
    }
    /**
     * Gets the singleSignOnSettings property value. The Kerberos login settings that enable apps on receiving devices to authenticate smoothly.
     * @return a IosSingleSignOnSettings
     */
    @jakarta.annotation.Nullable
    public IosSingleSignOnSettings getSingleSignOnSettings() {
        return this.backingStore.get("singleSignOnSettings");
    }
    /**
     * Gets the wallpaperDisplayLocation property value. An enum type for wallpaper display location specifier.
     * @return a IosWallpaperDisplayLocation
     */
    @jakarta.annotation.Nullable
    public IosWallpaperDisplayLocation getWallpaperDisplayLocation() {
        return this.backingStore.get("wallpaperDisplayLocation");
    }
    /**
     * Gets the wallpaperImage property value. A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version.
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getWallpaperImage() {
        return this.backingStore.get("wallpaperImage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssetTagTemplate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assetTagTemplate", value);
    }
    /**
     * Sets the contentFilterSettings property value. Gets or sets iOS Web Content Filter settings, supervised mode only
     * @param value Value to set for the contentFilterSettings property.
     */
    public void setContentFilterSettings(@jakarta.annotation.Nullable final IosWebContentFilterBase value) {
        this.backingStore.set("contentFilterSettings", value);
    }
    /**
     * Sets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenDockIcons property.
     */
    public void setHomeScreenDockIcons(@jakarta.annotation.Nullable final java.util.List<IosHomeScreenItem> value) {
        this.backingStore.set("homeScreenDockIcons", value);
    }
    /**
     * Sets the homeScreenGridHeight property value. Gets or sets the number of rows to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridWidth must be configured as well.
     * @param value Value to set for the homeScreenGridHeight property.
     */
    public void setHomeScreenGridHeight(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("homeScreenGridHeight", value);
    }
    /**
     * Sets the homeScreenGridWidth property value. Gets or sets the number of columns to render when configuring iOS home screen layout settings. If this value is configured, homeScreenGridHeight must be configured as well.
     * @param value Value to set for the homeScreenGridWidth property.
     */
    public void setHomeScreenGridWidth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("homeScreenGridWidth", value);
    }
    /**
     * Sets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenPages property.
     */
    public void setHomeScreenPages(@jakarta.annotation.Nullable final java.util.List<IosHomeScreenPage> value) {
        this.backingStore.set("homeScreenPages", value);
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for the renewal of Kerberos ticket used in single sign-on settings.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     */
    public void setIdentityCertificateForClientAuthentication(@jakarta.annotation.Nullable final IosCertificateProfileBase value) {
        this.backingStore.set("identityCertificateForClientAuthentication", value);
    }
    /**
     * Sets the iosSingleSignOnExtension property value. Gets or sets a single sign-on extension profile.
     * @param value Value to set for the iosSingleSignOnExtension property.
     */
    public void setIosSingleSignOnExtension(@jakarta.annotation.Nullable final IosSingleSignOnExtension value) {
        this.backingStore.set("iosSingleSignOnExtension", value);
    }
    /**
     * Sets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @param value Value to set for the lockScreenFootnote property.
     */
    public void setLockScreenFootnote(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lockScreenFootnote", value);
    }
    /**
     * Sets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the notificationSettings property.
     */
    public void setNotificationSettings(@jakarta.annotation.Nullable final java.util.List<IosNotificationSettings> value) {
        this.backingStore.set("notificationSettings", value);
    }
    /**
     * Sets the singleSignOnExtension property value. Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead.
     * @param value Value to set for the singleSignOnExtension property.
     */
    public void setSingleSignOnExtension(@jakarta.annotation.Nullable final SingleSignOnExtension value) {
        this.backingStore.set("singleSignOnExtension", value);
    }
    /**
     * Sets the singleSignOnExtensionPkinitCertificate property value. PKINIT Certificate for the authentication with single sign-on extension settings.
     * @param value Value to set for the singleSignOnExtensionPkinitCertificate property.
     */
    public void setSingleSignOnExtensionPkinitCertificate(@jakarta.annotation.Nullable final IosCertificateProfileBase value) {
        this.backingStore.set("singleSignOnExtensionPkinitCertificate", value);
    }
    /**
     * Sets the singleSignOnSettings property value. The Kerberos login settings that enable apps on receiving devices to authenticate smoothly.
     * @param value Value to set for the singleSignOnSettings property.
     */
    public void setSingleSignOnSettings(@jakarta.annotation.Nullable final IosSingleSignOnSettings value) {
        this.backingStore.set("singleSignOnSettings", value);
    }
    /**
     * Sets the wallpaperDisplayLocation property value. An enum type for wallpaper display location specifier.
     * @param value Value to set for the wallpaperDisplayLocation property.
     */
    public void setWallpaperDisplayLocation(@jakarta.annotation.Nullable final IosWallpaperDisplayLocation value) {
        this.backingStore.set("wallpaperDisplayLocation", value);
    }
    /**
     * Sets the wallpaperImage property value. A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version.
     * @param value Value to set for the wallpaperImage property.
     */
    public void setWallpaperImage(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("wallpaperImage", value);
    }
}
