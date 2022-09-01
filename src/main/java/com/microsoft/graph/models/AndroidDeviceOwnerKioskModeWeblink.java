package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerKioskModeWeblink extends AndroidDeviceOwnerKioskModeFolderItem implements Parsable {
    /** Display name for weblink */
    private String _label;
    /** Link for weblink */
    private String _link;
    /**
     * Instantiates a new AndroidDeviceOwnerKioskModeWeblink and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerKioskModeWeblink() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerKioskModeWeblink");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerKioskModeWeblink
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeWeblink createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeWeblink();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerKioskModeWeblink currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
            this.put("link", (n) -> { currentObject.setLink(n.getStringValue()); });
        }};
    }
    /**
     * Gets the label property value. Display name for weblink
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
    }
    /**
     * Gets the link property value. Link for weblink
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLink() {
        return this._link;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
    }
    /**
     * Sets the link property value. Link for weblink
     * @param value Value to set for the link property.
     * @return a void
     */
    public void setLink(@javax.annotation.Nullable final String value) {
        this._link = value;
    }
}
