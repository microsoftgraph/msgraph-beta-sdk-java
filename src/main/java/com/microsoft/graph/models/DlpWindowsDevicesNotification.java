package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DlpWindowsDevicesNotification extends DlpNotification implements Parsable {
    /** The contentName property */
    private String _contentName;
    /** The lastModfiedBy property */
    private String _lastModfiedBy;
    /**
     * Instantiates a new DlpWindowsDevicesNotification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DlpWindowsDevicesNotification() {
        super();
        this.setOdataType("#microsoft.graph.dlpWindowsDevicesNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DlpWindowsDevicesNotification
     */
    @javax.annotation.Nonnull
    public static DlpWindowsDevicesNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DlpWindowsDevicesNotification();
    }
    /**
     * Gets the contentName property value. The contentName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentName() {
        return this._contentName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DlpWindowsDevicesNotification currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contentName", (n) -> { currentObject.setContentName(n.getStringValue()); });
            this.put("lastModfiedBy", (n) -> { currentObject.setLastModfiedBy(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModfiedBy property value. The lastModfiedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastModfiedBy() {
        return this._lastModfiedBy;
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
        writer.writeStringValue("contentName", this.getContentName());
        writer.writeStringValue("lastModfiedBy", this.getLastModfiedBy());
    }
    /**
     * Sets the contentName property value. The contentName property
     * @param value Value to set for the contentName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentName(@javax.annotation.Nullable final String value) {
        this._contentName = value;
    }
    /**
     * Sets the lastModfiedBy property value. The lastModfiedBy property
     * @param value Value to set for the lastModfiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModfiedBy(@javax.annotation.Nullable final String value) {
        this._lastModfiedBy = value;
    }
}
