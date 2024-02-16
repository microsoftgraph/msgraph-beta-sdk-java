package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an icon for an app on the Home Screen
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosHomeScreenApp extends IosHomeScreenItem implements Parsable {
    /**
     * Instantiates a new {@link IosHomeScreenApp} and sets the default values.
     */
    public IosHomeScreenApp() {
        super();
        this.setOdataType("#microsoft.graph.iosHomeScreenApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosHomeScreenApp}
     */
    @jakarta.annotation.Nonnull
    public static IosHomeScreenApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosHomeScreenApp();
    }
    /**
     * Gets the bundleID property value. BundleID of the app if isWebClip is false or the URL of a web clip if isWebClip is true.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBundleID() {
        return this.backingStore.get("bundleID");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundleID", (n) -> { this.setBundleID(n.getStringValue()); });
        deserializerMap.put("isWebClip", (n) -> { this.setIsWebClip(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isWebClip property value. When true, the bundle ID will be handled as a URL for a web clip.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWebClip() {
        return this.backingStore.get("isWebClip");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("bundleID", this.getBundleID());
        writer.writeBooleanValue("isWebClip", this.getIsWebClip());
    }
    /**
     * Sets the bundleID property value. BundleID of the app if isWebClip is false or the URL of a web clip if isWebClip is true.
     * @param value Value to set for the bundleID property.
     */
    public void setBundleID(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bundleID", value);
    }
    /**
     * Sets the isWebClip property value. When true, the bundle ID will be handled as a URL for a web clip.
     * @param value Value to set for the isWebClip property.
     */
    public void setIsWebClip(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isWebClip", value);
    }
}
