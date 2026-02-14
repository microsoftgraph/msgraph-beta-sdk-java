package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecoveryUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /**
     * Instantiates a new {@link RecoveryUpdateCatalogEntry} and sets the default values.
     */
    public RecoveryUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.recoveryUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecoveryUpdateCatalogEntry}
     */
    @jakarta.annotation.Nonnull
    public static RecoveryUpdateCatalogEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecoveryUpdateCatalogEntry();
    }
    /**
     * Gets the catalogName property value. The catalog name. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogName() {
        return this.backingStore.get("catalogName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalogName", (n) -> { this.setCatalogName(n.getStringValue()); });
        deserializerMap.put("productRevisions", (n) -> { this.setProductRevisions(n.getCollectionOfObjectValues(ProductRevision::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the productRevisions property value. A collection of product revisions associated with the update.
     * @return a {@link java.util.List<ProductRevision>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProductRevision> getProductRevisions() {
        return this.backingStore.get("productRevisions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("catalogName", this.getCatalogName());
        writer.writeCollectionOfObjectValues("productRevisions", this.getProductRevisions());
    }
    /**
     * Sets the catalogName property value. The catalog name. Read-only.
     * @param value Value to set for the catalogName property.
     */
    public void setCatalogName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogName", value);
    }
    /**
     * Sets the productRevisions property value. A collection of product revisions associated with the update.
     * @param value Value to set for the productRevisions property.
     */
    public void setProductRevisions(@jakarta.annotation.Nullable final java.util.List<ProductRevision> value) {
        this.backingStore.set("productRevisions", value);
    }
}
