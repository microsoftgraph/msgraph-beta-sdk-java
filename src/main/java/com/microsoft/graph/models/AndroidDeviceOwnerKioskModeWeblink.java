package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A weblink on the Android Device Owner Managed Home Screen
 */
public class AndroidDeviceOwnerKioskModeWeblink extends AndroidDeviceOwnerKioskModeFolderItem implements Parsable {
    /**
     * Display name for weblink
     */
    private String label;
    /**
     * Link for weblink
     */
    private String link;
    /**
     * Instantiates a new androidDeviceOwnerKioskModeWeblink and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskModeWeblink() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerKioskModeWeblink");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerKioskModeWeblink
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeWeblink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeWeblink();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("link", (n) -> { this.setLink(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Display name for weblink
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the link property value. Link for weblink
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLink() {
        return this.link;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("link", this.getLink());
    }
    /**
     * Sets the label property value. Display name for weblink
     * @param value Value to set for the label property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the link property value. Link for weblink
     * @param value Value to set for the link property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLink(@jakarta.annotation.Nullable final String value) {
        this.link = value;
    }
}
