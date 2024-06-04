package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllPreApprovedPermissionsOnResourceApp extends PreApprovedPermissions implements Parsable {
    /**
     * Instantiates a new {@link AllPreApprovedPermissionsOnResourceApp} and sets the default values.
     */
    public AllPreApprovedPermissionsOnResourceApp() {
        super();
        this.setOdataType("#microsoft.graph.allPreApprovedPermissionsOnResourceApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AllPreApprovedPermissionsOnResourceApp}
     */
    @jakarta.annotation.Nonnull
    public static AllPreApprovedPermissionsOnResourceApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllPreApprovedPermissionsOnResourceApp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceApplicationId", (n) -> { this.setResourceApplicationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceApplicationId property value. The appId of the resource application (the API). Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceApplicationId() {
        return this.backingStore.get("resourceApplicationId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("resourceApplicationId", this.getResourceApplicationId());
    }
    /**
     * Sets the resourceApplicationId property value. The appId of the resource application (the API). Required.
     * @param value Value to set for the resourceApplicationId property.
     */
    public void setResourceApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceApplicationId", value);
    }
}
