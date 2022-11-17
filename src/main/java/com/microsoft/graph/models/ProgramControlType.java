package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProgramControlType extends Entity implements Parsable {
    /** The controlTypeGroupId property */
    private String _controlTypeGroupId;
    /** The name of the program control type */
    private String _displayName;
    /**
     * Instantiates a new ProgramControlType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProgramControlType() {
        super();
        this.setOdataType("#microsoft.graph.programControlType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProgramControlType
     */
    @javax.annotation.Nonnull
    public static ProgramControlType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProgramControlType();
    }
    /**
     * Gets the controlTypeGroupId property value. The controlTypeGroupId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlTypeGroupId() {
        return this._controlTypeGroupId;
    }
    /**
     * Gets the displayName property value. The name of the program control type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProgramControlType currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("controlTypeGroupId", (n) -> { currentObject.setControlTypeGroupId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
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
        writer.writeStringValue("controlTypeGroupId", this.getControlTypeGroupId());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the controlTypeGroupId property value. The controlTypeGroupId property
     * @param value Value to set for the controlTypeGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlTypeGroupId(@javax.annotation.Nullable final String value) {
        this._controlTypeGroupId = value;
    }
    /**
     * Sets the displayName property value. The name of the program control type
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}
