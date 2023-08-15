package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for macOS web apps.
 */
public class MacOSWebClip extends MobileApp implements Parsable {
    /**
     * The web app URL starting with http:// or https://, such as https://learn.microsoft.com/en-us/mem/.
     */
    private String appUrl;
    /**
     * Whether or not to open the web clip as a full-screen web app. Defaults to false. If TRUE, opens the web clip as a full-screen web app. If FALSE, the web clip opens inside of another app.
     */
    private Boolean fullScreenEnabled;
    /**
     * Whether or not the icon for the app is precomosed. Defaults to false. If TRUE, prevents SpringBoard from adding "shine" to the icon. If FALSE, SpringBoard can add "shine".
     */
    private Boolean preComposedIconEnabled;
    /**
     * Instantiates a new macOSWebClip and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSWebClip() {
        super();
        this.setOdataType("#microsoft.graph.macOSWebClip");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSWebClip
     */
    @javax.annotation.Nonnull
    public static MacOSWebClip createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSWebClip();
    }
    /**
     * Gets the appUrl property value. The web app URL starting with http:// or https://, such as https://learn.microsoft.com/en-us/mem/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppUrl() {
        return this.appUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUrl", (n) -> { this.setAppUrl(n.getStringValue()); });
        deserializerMap.put("fullScreenEnabled", (n) -> { this.setFullScreenEnabled(n.getBooleanValue()); });
        deserializerMap.put("preComposedIconEnabled", (n) -> { this.setPreComposedIconEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullScreenEnabled property value. Whether or not to open the web clip as a full-screen web app. Defaults to false. If TRUE, opens the web clip as a full-screen web app. If FALSE, the web clip opens inside of another app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScreenEnabled() {
        return this.fullScreenEnabled;
    }
    /**
     * Gets the preComposedIconEnabled property value. Whether or not the icon for the app is precomosed. Defaults to false. If TRUE, prevents SpringBoard from adding "shine" to the icon. If FALSE, SpringBoard can add "shine".
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreComposedIconEnabled() {
        return this.preComposedIconEnabled;
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
        writer.writeStringValue("appUrl", this.getAppUrl());
        writer.writeBooleanValue("fullScreenEnabled", this.getFullScreenEnabled());
        writer.writeBooleanValue("preComposedIconEnabled", this.getPreComposedIconEnabled());
    }
    /**
     * Sets the appUrl property value. The web app URL starting with http:// or https://, such as https://learn.microsoft.com/en-us/mem/.
     * @param value Value to set for the appUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppUrl(@javax.annotation.Nullable final String value) {
        this.appUrl = value;
    }
    /**
     * Sets the fullScreenEnabled property value. Whether or not to open the web clip as a full-screen web app. Defaults to false. If TRUE, opens the web clip as a full-screen web app. If FALSE, the web clip opens inside of another app.
     * @param value Value to set for the fullScreenEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFullScreenEnabled(@javax.annotation.Nullable final Boolean value) {
        this.fullScreenEnabled = value;
    }
    /**
     * Sets the preComposedIconEnabled property value. Whether or not the icon for the app is precomosed. Defaults to false. If TRUE, prevents SpringBoard from adding "shine" to the icon. If FALSE, SpringBoard can add "shine".
     * @param value Value to set for the preComposedIconEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreComposedIconEnabled(@javax.annotation.Nullable final Boolean value) {
        this.preComposedIconEnabled = value;
    }
}
