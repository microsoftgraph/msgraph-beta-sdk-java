package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomChoiceOption extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link CustomChoiceOption} and sets the default values.
     */
    public CustomChoiceOption() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomChoiceOption}
     */
    @jakarta.annotation.Nonnull
    public static CustomChoiceOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomChoiceOption();
    }
    /**
     * Gets the displayName property value. Display text of the choice option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the extensions property value. Custom extension field values set on the entity. Supports $select.
     * @return a {@link ExtensionFieldCollection}
     */
    @jakarta.annotation.Nullable
    public ExtensionFieldCollection getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getObjectValue(ExtensionFieldCollection::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("extensions", this.getExtensions());
    }
    /**
     * Sets the displayName property value. Display text of the choice option.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the extensions property value. Custom extension field values set on the entity. Supports $select.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final ExtensionFieldCollection value) {
        this.backingStore.set("extensions", value);
    }
}
