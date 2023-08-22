package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomAppScope extends AppScope implements Parsable {
    /**
     * The customAttributes property
     */
    private CustomAppScopeAttributesDictionary customAttributes;
    /**
     * Instantiates a new customAppScope and sets the default values.
     */
    public CustomAppScope() {
        super();
        this.setOdataType("#microsoft.graph.customAppScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customAppScope
     */
    @jakarta.annotation.Nonnull
    public static CustomAppScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomAppScope();
    }
    /**
     * Gets the customAttributes property value. The customAttributes property
     * @return a customAppScopeAttributesDictionary
     */
    @jakarta.annotation.Nullable
    public CustomAppScopeAttributesDictionary getCustomAttributes() {
        return this.customAttributes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customAttributes", (n) -> { this.setCustomAttributes(n.getObjectValue(CustomAppScopeAttributesDictionary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("customAttributes", this.getCustomAttributes());
    }
    /**
     * Sets the customAttributes property value. The customAttributes property
     * @param value Value to set for the customAttributes property.
     */
    public void setCustomAttributes(@jakarta.annotation.Nullable final CustomAppScopeAttributesDictionary value) {
        this.customAttributes = value;
    }
}
