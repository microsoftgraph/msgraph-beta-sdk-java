package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRbacApplicationMultiple extends RbacApplicationMultiple implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRbacApplicationMultiple} and sets the default values.
     */
    public UnifiedRbacApplicationMultiple() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRbacApplicationMultiple");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRbacApplicationMultiple}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRbacApplicationMultiple createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRbacApplicationMultiple();
    }
    /**
     * Gets the customAppScopes property value. Represents the resources that the principal has been granted access.
     * @return a {@link java.util.List<CustomAppScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomAppScope> getCustomAppScopes() {
        return this.backingStore.get("customAppScopes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customAppScopes", (n) -> { this.setCustomAppScopes(n.getCollectionOfObjectValues(CustomAppScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customAppScopes", this.getCustomAppScopes());
    }
    /**
     * Sets the customAppScopes property value. Represents the resources that the principal has been granted access.
     * @param value Value to set for the customAppScopes property.
     */
    public void setCustomAppScopes(@jakarta.annotation.Nullable final java.util.List<CustomAppScope> value) {
        this.backingStore.set("customAppScopes", value);
    }
}
