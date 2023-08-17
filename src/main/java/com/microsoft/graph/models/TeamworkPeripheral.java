package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkPeripheral extends Entity implements Parsable {
    /**
     * Display name for the peripheral.
     */
    private String displayName;
    /**
     * The product ID of the device. Each product from a vendor has its own ID.
     */
    private String productId;
    /**
     * The unique identifier for the vendor of the device. Each vendor has a unique ID.
     */
    private String vendorId;
    /**
     * Instantiates a new teamworkPeripheral and sets the default values.
     */
    public TeamworkPeripheral() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkPeripheral
     */
    @jakarta.annotation.Nonnull
    public static TeamworkPeripheral createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkPeripheral();
    }
    /**
     * Gets the displayName property value. Display name for the peripheral.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("productId", (n) -> { this.setProductId(n.getStringValue()); });
        deserializerMap.put("vendorId", (n) -> { this.setVendorId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the productId property value. The product ID of the device. Each product from a vendor has its own ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProductId() {
        return this.productId;
    }
    /**
     * Gets the vendorId property value. The unique identifier for the vendor of the device. Each vendor has a unique ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVendorId() {
        return this.vendorId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("productId", this.getProductId());
        writer.writeStringValue("vendorId", this.getVendorId());
    }
    /**
     * Sets the displayName property value. Display name for the peripheral.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the productId property value. The product ID of the device. Each product from a vendor has its own ID.
     * @param value Value to set for the productId property.
     */
    public void setProductId(@jakarta.annotation.Nullable final String value) {
        this.productId = value;
    }
    /**
     * Sets the vendorId property value. The unique identifier for the vendor of the device. Each vendor has a unique ID.
     * @param value Value to set for the vendorId property.
     */
    public void setVendorId(@jakarta.annotation.Nullable final String value) {
        this.vendorId = value;
    }
}
