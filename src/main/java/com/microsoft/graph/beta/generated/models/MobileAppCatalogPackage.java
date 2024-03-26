package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * mobileAppCatalogPackage is an abstract type that application catalog package entities derive from. A mobileAppCatalogPackage entity contains information about an application catalog package that can be deployed to Intune-managed devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppCatalogPackage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MobileAppCatalogPackage} and sets the default values.
     */
    public MobileAppCatalogPackage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppCatalogPackage}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppCatalogPackage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.win32MobileAppCatalogPackage": return new Win32MobileAppCatalogPackage();
            }
        }
        return new MobileAppCatalogPackage();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("productDisplayName", (n) -> { this.setProductDisplayName(n.getStringValue()); });
        deserializerMap.put("productId", (n) -> { this.setProductId(n.getStringValue()); });
        deserializerMap.put("publisherDisplayName", (n) -> { this.setPublisherDisplayName(n.getStringValue()); });
        deserializerMap.put("versionDisplayName", (n) -> { this.setVersionDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the productDisplayName property value. The name of the product (example: "Fabrikam for Business"). Returned by default. Read-only. Supports: $filter, $search, $select. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductDisplayName() {
        return this.backingStore.get("productDisplayName");
    }
    /**
     * Gets the productId property value. The identifier of a specific product irrespective of version, or other attributes. Read-only. Returned by default. Supports: $filter, $select. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductId() {
        return this.backingStore.get("productId");
    }
    /**
     * Gets the publisherDisplayName property value. The name of the application catalog package publisher (example: "Fabrikam"). Returned by default. Read-only. Supports $filter, $search, $select. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisherDisplayName() {
        return this.backingStore.get("publisherDisplayName");
    }
    /**
     * Gets the versionDisplayName property value. The name of the product version (example: "1.2203.156"). Returned by default. Read-only. Supports: $filter, $search, $select. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersionDisplayName() {
        return this.backingStore.get("versionDisplayName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the productDisplayName property value. The name of the product (example: "Fabrikam for Business"). Returned by default. Read-only. Supports: $filter, $search, $select. This property is read-only.
     * @param value Value to set for the productDisplayName property.
     */
    public void setProductDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productDisplayName", value);
    }
    /**
     * Sets the productId property value. The identifier of a specific product irrespective of version, or other attributes. Read-only. Returned by default. Supports: $filter, $select. This property is read-only.
     * @param value Value to set for the productId property.
     */
    public void setProductId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productId", value);
    }
    /**
     * Sets the publisherDisplayName property value. The name of the application catalog package publisher (example: "Fabrikam"). Returned by default. Read-only. Supports $filter, $search, $select. This property is read-only.
     * @param value Value to set for the publisherDisplayName property.
     */
    public void setPublisherDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisherDisplayName", value);
    }
    /**
     * Sets the versionDisplayName property value. The name of the product version (example: "1.2203.156"). Returned by default. Read-only. Supports: $filter, $search, $select. This property is read-only.
     * @param value Value to set for the versionDisplayName property.
     */
    public void setVersionDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionDisplayName", value);
    }
}
