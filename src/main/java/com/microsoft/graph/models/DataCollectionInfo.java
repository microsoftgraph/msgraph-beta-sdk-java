package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataCollectionInfo extends Entity implements Parsable {
    /**
     * Instantiates a new DataCollectionInfo and sets the default values.
     */
    public DataCollectionInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DataCollectionInfo
     */
    @jakarta.annotation.Nonnull
    public static DataCollectionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataCollectionInfo();
    }
    /**
     * Gets the entitlements property value. The entitlements property
     * @return a EntitlementsDataCollectionInfo
     */
    @jakarta.annotation.Nullable
    public EntitlementsDataCollectionInfo getEntitlements() {
        return this.BackingStore.get("entitlements");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("entitlements", (n) -> { this.setEntitlements(n.getObjectValue(EntitlementsDataCollectionInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("entitlements", this.getEntitlements());
    }
    /**
     * Sets the entitlements property value. The entitlements property
     * @param value Value to set for the entitlements property.
     */
    public void setEntitlements(@jakarta.annotation.Nullable final EntitlementsDataCollectionInfo value) {
        this.BackingStore.set("entitlements", value);
    }
}
