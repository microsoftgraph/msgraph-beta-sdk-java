package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for iOS web apps.
 */
public class IosiPadOSWebClip extends MobileApp implements Parsable {
    /**
     * Indicates iOS/iPadOS web clip app URL. Example: 'https://www.contoso.com'
     */
    private String appUrl;
    /**
     * Whether or not to open the web clip as a full-screen web app. Defaults to false. If TRUE, opens the web clip as a full-screen web app. If FALSE, the web clip opens inside of another app, such as Safari or the app specified with targetApplicationBundleIdentifier.
     */
    private Boolean fullScreenEnabled;
    /**
     * Whether or not a full screen web clip can navigate to an external web site without showing the Safari UI. Defaults to false. If FALSE, the Safari UI appears when navigating away. If TRUE, the Safari UI will not be shown.
     */
    private Boolean ignoreManifestScope;
    /**
     * Whether or not the icon for the app is precomosed. Defaults to false. If TRUE, prevents SpringBoard from adding 'shine' to the icon. If FALSE, SpringBoard can add 'shine'.
     */
    private Boolean preComposedIconEnabled;
    /**
     * Specifies the application bundle identifier which opens the URL. Available in iOS 14 and later.
     */
    private String targetApplicationBundleIdentifier;
    /**
     * Whether or not to use managed browser. When TRUE, the app will be required to be opened in Microsoft Edge. When FALSE, the app will not be required to be opened in Microsoft Edge. By default, this property is set to FALSE.
     */
    private Boolean useManagedBrowser;
    /**
     * Instantiates a new iosiPadOSWebClip and sets the default values.
     */
    public IosiPadOSWebClip() {
        super();
        this.setOdataType("#microsoft.graph.iosiPadOSWebClip");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosiPadOSWebClip
     */
    @jakarta.annotation.Nonnull
    public static IosiPadOSWebClip createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosiPadOSWebClip();
    }
    /**
     * Gets the appUrl property value. Indicates iOS/iPadOS web clip app URL. Example: 'https://www.contoso.com'
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppUrl() {
        return this.appUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUrl", (n) -> { this.setAppUrl(n.getStringValue()); });
        deserializerMap.put("fullScreenEnabled", (n) -> { this.setFullScreenEnabled(n.getBooleanValue()); });
        deserializerMap.put("ignoreManifestScope", (n) -> { this.setIgnoreManifestScope(n.getBooleanValue()); });
        deserializerMap.put("preComposedIconEnabled", (n) -> { this.setPreComposedIconEnabled(n.getBooleanValue()); });
        deserializerMap.put("targetApplicationBundleIdentifier", (n) -> { this.setTargetApplicationBundleIdentifier(n.getStringValue()); });
        deserializerMap.put("useManagedBrowser", (n) -> { this.setUseManagedBrowser(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullScreenEnabled property value. Whether or not to open the web clip as a full-screen web app. Defaults to false. If TRUE, opens the web clip as a full-screen web app. If FALSE, the web clip opens inside of another app, such as Safari or the app specified with targetApplicationBundleIdentifier.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFullScreenEnabled() {
        return this.fullScreenEnabled;
    }
    /**
     * Gets the ignoreManifestScope property value. Whether or not a full screen web clip can navigate to an external web site without showing the Safari UI. Defaults to false. If FALSE, the Safari UI appears when navigating away. If TRUE, the Safari UI will not be shown.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreManifestScope() {
        return this.ignoreManifestScope;
    }
    /**
     * Gets the preComposedIconEnabled property value. Whether or not the icon for the app is precomosed. Defaults to false. If TRUE, prevents SpringBoard from adding 'shine' to the icon. If FALSE, SpringBoard can add 'shine'.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPreComposedIconEnabled() {
        return this.preComposedIconEnabled;
    }
    /**
     * Gets the targetApplicationBundleIdentifier property value. Specifies the application bundle identifier which opens the URL. Available in iOS 14 and later.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetApplicationBundleIdentifier() {
        return this.targetApplicationBundleIdentifier;
    }
    /**
     * Gets the useManagedBrowser property value. Whether or not to use managed browser. When TRUE, the app will be required to be opened in Microsoft Edge. When FALSE, the app will not be required to be opened in Microsoft Edge. By default, this property is set to FALSE.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseManagedBrowser() {
        return this.useManagedBrowser;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appUrl", this.getAppUrl());
        writer.writeBooleanValue("fullScreenEnabled", this.getFullScreenEnabled());
        writer.writeBooleanValue("ignoreManifestScope", this.getIgnoreManifestScope());
        writer.writeBooleanValue("preComposedIconEnabled", this.getPreComposedIconEnabled());
        writer.writeStringValue("targetApplicationBundleIdentifier", this.getTargetApplicationBundleIdentifier());
        writer.writeBooleanValue("useManagedBrowser", this.getUseManagedBrowser());
    }
    /**
     * Sets the appUrl property value. Indicates iOS/iPadOS web clip app URL. Example: 'https://www.contoso.com'
     * @param value Value to set for the appUrl property.
     */
    public void setAppUrl(@jakarta.annotation.Nullable final String value) {
        this.appUrl = value;
    }
    /**
     * Sets the fullScreenEnabled property value. Whether or not to open the web clip as a full-screen web app. Defaults to false. If TRUE, opens the web clip as a full-screen web app. If FALSE, the web clip opens inside of another app, such as Safari or the app specified with targetApplicationBundleIdentifier.
     * @param value Value to set for the fullScreenEnabled property.
     */
    public void setFullScreenEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.fullScreenEnabled = value;
    }
    /**
     * Sets the ignoreManifestScope property value. Whether or not a full screen web clip can navigate to an external web site without showing the Safari UI. Defaults to false. If FALSE, the Safari UI appears when navigating away. If TRUE, the Safari UI will not be shown.
     * @param value Value to set for the ignoreManifestScope property.
     */
    public void setIgnoreManifestScope(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreManifestScope = value;
    }
    /**
     * Sets the preComposedIconEnabled property value. Whether or not the icon for the app is precomosed. Defaults to false. If TRUE, prevents SpringBoard from adding 'shine' to the icon. If FALSE, SpringBoard can add 'shine'.
     * @param value Value to set for the preComposedIconEnabled property.
     */
    public void setPreComposedIconEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.preComposedIconEnabled = value;
    }
    /**
     * Sets the targetApplicationBundleIdentifier property value. Specifies the application bundle identifier which opens the URL. Available in iOS 14 and later.
     * @param value Value to set for the targetApplicationBundleIdentifier property.
     */
    public void setTargetApplicationBundleIdentifier(@jakarta.annotation.Nullable final String value) {
        this.targetApplicationBundleIdentifier = value;
    }
    /**
     * Sets the useManagedBrowser property value. Whether or not to use managed browser. When TRUE, the app will be required to be opened in Microsoft Edge. When FALSE, the app will not be required to be opened in Microsoft Edge. By default, this property is set to FALSE.
     * @param value Value to set for the useManagedBrowser property.
     */
    public void setUseManagedBrowser(@jakarta.annotation.Nullable final Boolean value) {
        this.useManagedBrowser = value;
    }
}
