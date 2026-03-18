package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A mobileApp that is based on a referenced branch in a Win32CatalogApp repository
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAutoUpdateCatalogApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new {@link WindowsAutoUpdateCatalogApp} and sets the default values.
     */
    public WindowsAutoUpdateCatalogApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsAutoUpdateCatalogApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsAutoUpdateCatalogApp}
     */
    @jakarta.annotation.Nonnull
    public static WindowsAutoUpdateCatalogApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutoUpdateCatalogApp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mobileAppCatalogPackageBranchId", (n) -> { this.setMobileAppCatalogPackageBranchId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mobileAppCatalogPackageBranchId property value. The identifier of a specific branch in a product, which is a specific subset of product functionality as defined by the publisher . This is run-time resolved to be the latest MobileAppCatalogPackage in the branch. (example:&apos;31a4c766-f23d-8d41-4803-35e155be7389&apos;). Read-Only
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMobileAppCatalogPackageBranchId() {
        return this.backingStore.get("mobileAppCatalogPackageBranchId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("mobileAppCatalogPackageBranchId", this.getMobileAppCatalogPackageBranchId());
    }
    /**
     * Sets the mobileAppCatalogPackageBranchId property value. The identifier of a specific branch in a product, which is a specific subset of product functionality as defined by the publisher . This is run-time resolved to be the latest MobileAppCatalogPackage in the branch. (example:&apos;31a4c766-f23d-8d41-4803-35e155be7389&apos;). Read-Only
     * @param value Value to set for the mobileAppCatalogPackageBranchId property.
     */
    public void setMobileAppCatalogPackageBranchId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mobileAppCatalogPackageBranchId", value);
    }
}
