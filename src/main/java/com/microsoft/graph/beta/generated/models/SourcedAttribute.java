package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourcedAttribute extends CustomClaimAttributeBase implements Parsable {
    /**
     * Instantiates a new {@link SourcedAttribute} and sets the default values.
     */
    public SourcedAttribute() {
        super();
        this.setOdataType("#microsoft.graph.sourcedAttribute");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SourcedAttribute}
     */
    @jakarta.annotation.Nonnull
    public static SourcedAttribute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourcedAttribute();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isExtensionAttribute", (n) -> { this.setIsExtensionAttribute(n.getBooleanValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The identifier of the attribute on the specified source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the isExtensionAttribute property value. A flag that indicates if the name specified is that of an extension attribute.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExtensionAttribute() {
        return this.backingStore.get("isExtensionAttribute");
    }
    /**
     * Gets the source property value. The source where the claim is going to retrieve its value. Valid sources include user, application, resource, audience and company.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isExtensionAttribute", this.getIsExtensionAttribute());
        writer.writeStringValue("source", this.getSource());
    }
    /**
     * Sets the id property value. The identifier of the attribute on the specified source.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the isExtensionAttribute property value. A flag that indicates if the name specified is that of an extension attribute.
     * @param value Value to set for the isExtensionAttribute property.
     */
    public void setIsExtensionAttribute(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExtensionAttribute", value);
    }
    /**
     * Sets the source property value. The source where the claim is going to retrieve its value. Valid sources include user, application, resource, audience and company.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("source", value);
    }
}
