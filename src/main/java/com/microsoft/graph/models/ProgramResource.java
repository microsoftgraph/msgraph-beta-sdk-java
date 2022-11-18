package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProgramResource extends Identity implements Parsable {
    /** Type of the resource, indicating whether it is a group or an app. */
    private String _type;
    /**
     * Instantiates a new ProgramResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProgramResource() {
        super();
        this.setOdataType("#microsoft.graph.programResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProgramResource
     */
    @javax.annotation.Nonnull
    public static ProgramResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProgramResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProgramResource currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the type property value. Type of the resource, indicating whether it is a group or an app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
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
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the type property value. Type of the resource, indicating whether it is a group or an app.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
