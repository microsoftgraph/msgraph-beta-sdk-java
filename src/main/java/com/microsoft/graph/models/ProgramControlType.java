package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProgramControlType extends Entity implements Parsable {
    /** The controlTypeGroupId property */
    private String controlTypeGroupId;
    /** The name of the program control type */
    private String displayName;
    /**
     * Instantiates a new programControlType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProgramControlType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a programControlType
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
        return this.controlTypeGroupId;
    }
    /**
     * Gets the displayName property value. The name of the program control type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("controlTypeGroupId", (n) -> { this.setControlTypeGroupId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
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
        this.controlTypeGroupId = value;
    }
    /**
     * Sets the displayName property value. The name of the program control type
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
