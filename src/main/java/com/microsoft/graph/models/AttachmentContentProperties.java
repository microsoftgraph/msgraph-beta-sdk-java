package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttachmentContentProperties extends ContentProperties implements Parsable {
    /** The currentLabel property */
    private CurrentLabel _currentLabel;
    /**
     * Instantiates a new AttachmentContentProperties and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttachmentContentProperties() {
        super();
        this.setOdataType("#microsoft.graph.attachmentContentProperties");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttachmentContentProperties
     */
    @javax.annotation.Nonnull
    public static AttachmentContentProperties createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentContentProperties();
    }
    /**
     * Gets the currentLabel property value. The currentLabel property
     * @return a currentLabel
     */
    @javax.annotation.Nullable
    public CurrentLabel getCurrentLabel() {
        return this._currentLabel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttachmentContentProperties currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("currentLabel", (n) -> { currentObject.setCurrentLabel(n.getObjectValue(CurrentLabel::createFromDiscriminatorValue)); });
        }};
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
        writer.writeObjectValue("currentLabel", this.getCurrentLabel());
    }
    /**
     * Sets the currentLabel property value. The currentLabel property
     * @param value Value to set for the currentLabel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentLabel(@javax.annotation.Nullable final CurrentLabel value) {
        this._currentLabel = value;
    }
}
