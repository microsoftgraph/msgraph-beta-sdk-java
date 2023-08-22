package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Catalog extends Entity implements Parsable {
    /**
     * Lists the content that you can approve for deployment. Read-only.
     */
    private java.util.List<CatalogEntry> entries;
    /**
     * Instantiates a new catalog and sets the default values.
     */
    public Catalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a catalog
     */
    @jakarta.annotation.Nonnull
    public static Catalog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Catalog();
    }
    /**
     * Gets the entries property value. Lists the content that you can approve for deployment. Read-only.
     * @return a catalogEntry
     */
    @jakarta.annotation.Nullable
    public java.util.List<CatalogEntry> getEntries() {
        return this.entries;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("entries", (n) -> { this.setEntries(n.getCollectionOfObjectValues(CatalogEntry::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("entries", this.getEntries());
    }
    /**
     * Sets the entries property value. Lists the content that you can approve for deployment. Read-only.
     * @param value Value to set for the entries property.
     */
    public void setEntries(@jakarta.annotation.Nullable final java.util.List<CatalogEntry> value) {
        this.entries = value;
    }
}
