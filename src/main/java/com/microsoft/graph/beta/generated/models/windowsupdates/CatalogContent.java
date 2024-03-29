package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CatalogContent extends DeployableContent implements Parsable {
    /**
     * Instantiates a new {@link CatalogContent} and sets the default values.
     */
    public CatalogContent() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.catalogContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CatalogContent}
     */
    @jakarta.annotation.Nonnull
    public static CatalogContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CatalogContent();
    }
    /**
     * Gets the catalogEntry property value. The catalogEntry property
     * @return a {@link CatalogEntry}
     */
    @jakarta.annotation.Nullable
    public CatalogEntry getCatalogEntry() {
        return this.backingStore.get("catalogEntry");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalogEntry", (n) -> { this.setCatalogEntry(n.getObjectValue(CatalogEntry::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("catalogEntry", this.getCatalogEntry());
    }
    /**
     * Sets the catalogEntry property value. The catalogEntry property
     * @param value Value to set for the catalogEntry property.
     */
    public void setCatalogEntry(@jakarta.annotation.Nullable final CatalogEntry value) {
        this.backingStore.set("catalogEntry", value);
    }
}
