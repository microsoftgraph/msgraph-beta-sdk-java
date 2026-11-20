package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An addressable reference to an external resource or keyword, contained only by an investigation session and shared as session context across its agent runs. It does not identify the exact input consumed by an individual run. The referenced resource remains external. Inherited id is server-owned, stable and unique within the containing session. New input ids are persisted GUIDs. Historical immutable input records retain deterministic parent-and-slot GUIDs without rewriting stored business identifiers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvestigationInput extends Entity implements Parsable {
    /**
     * Instantiates a new {@link InvestigationInput} and sets the default values.
     */
    public InvestigationInput() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InvestigationInput}
     */
    @jakarta.annotation.Nonnull
    public static InvestigationInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvestigationInput();
    }
    /**
     * Gets the displayName property value. The display name populated by the service when available. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getEnumValue(InvestigationInputType::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kind property value. Kind of external resource identifier or keyword supplied to a playbook.
     * @return a {@link InvestigationInputType}
     */
    @jakarta.annotation.Nullable
    public InvestigationInputType getKind() {
        return this.backingStore.get("kind");
    }
    /**
     * Gets the value property value. The type-specific resource identifier or keyword text. Required when creating a session and immutable afterward.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("kind", this.getKind());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the displayName property value. The display name populated by the service when available. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the kind property value. Kind of external resource identifier or keyword supplied to a playbook.
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final InvestigationInputType value) {
        this.backingStore.set("kind", value);
    }
    /**
     * Sets the value property value. The type-specific resource identifier or keyword text. Required when creating a session and immutable afterward.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
