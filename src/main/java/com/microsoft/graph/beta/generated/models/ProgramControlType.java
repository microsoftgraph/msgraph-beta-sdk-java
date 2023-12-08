package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProgramControlType extends Entity implements Parsable {
    /**
     * Instantiates a new ProgramControlType and sets the default values.
     */
    public ProgramControlType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProgramControlType
     */
    @jakarta.annotation.Nonnull
    public static ProgramControlType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProgramControlType();
    }
    /**
     * Gets the controlTypeGroupId property value. The controlTypeGroupId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getControlTypeGroupId() {
        return this.backingStore.get("controlTypeGroupId");
    }
    /**
     * Gets the displayName property value. The name of the program control type
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("controlTypeGroupId", (n) -> { this.setControlTypeGroupId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("controlTypeGroupId", this.getControlTypeGroupId());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the controlTypeGroupId property value. The controlTypeGroupId property
     * @param value Value to set for the controlTypeGroupId property.
     */
    public void setControlTypeGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("controlTypeGroupId", value);
    }
    /**
     * Sets the displayName property value. The name of the program control type
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
