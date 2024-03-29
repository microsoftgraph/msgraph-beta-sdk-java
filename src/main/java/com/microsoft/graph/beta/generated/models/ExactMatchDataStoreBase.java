package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExactMatchDataStoreBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExactMatchDataStoreBase} and sets the default values.
     */
    public ExactMatchDataStoreBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExactMatchDataStoreBase}
     */
    @jakarta.annotation.Nonnull
    public static ExactMatchDataStoreBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.exactMatchDataStore": return new ExactMatchDataStore();
            }
        }
        return new ExactMatchDataStoreBase();
    }
    /**
     * Gets the columns property value. The columns property
     * @return a {@link java.util.List<ExactDataMatchStoreColumn>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExactDataMatchStoreColumn> getColumns() {
        return this.backingStore.get("columns");
    }
    /**
     * Gets the dataLastUpdatedDateTime property value. The dataLastUpdatedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDataLastUpdatedDateTime() {
        return this.backingStore.get("dataLastUpdatedDateTime");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ExactDataMatchStoreColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("dataLastUpdatedDateTime", (n) -> { this.setDataLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeOffsetDateTimeValue("dataLastUpdatedDateTime", this.getDataLastUpdatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the columns property value. The columns property
     * @param value Value to set for the columns property.
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<ExactDataMatchStoreColumn> value) {
        this.backingStore.set("columns", value);
    }
    /**
     * Sets the dataLastUpdatedDateTime property value. The dataLastUpdatedDateTime property
     * @param value Value to set for the dataLastUpdatedDateTime property.
     */
    public void setDataLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dataLastUpdatedDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
