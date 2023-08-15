package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchDataStoreBase extends Entity implements Parsable {
    /**
     * The columns property
     */
    private java.util.List<ExactDataMatchStoreColumn> columns;
    /**
     * The dataLastUpdatedDateTime property
     */
    private OffsetDateTime dataLastUpdatedDateTime;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * Instantiates a new exactMatchDataStoreBase and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ExactMatchDataStoreBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactMatchDataStoreBase
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
     * @return a exactDataMatchStoreColumn
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExactDataMatchStoreColumn> getColumns() {
        return this.columns;
    }
    /**
     * Gets the dataLastUpdatedDateTime property value. The dataLastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDataLastUpdatedDateTime() {
        return this.dataLastUpdatedDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ExactDataMatchStoreColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("dataLastUpdatedDateTime", (n) -> { this.setDataLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<ExactDataMatchStoreColumn> value) {
        this.columns = value;
    }
    /**
     * Sets the dataLastUpdatedDateTime property value. The dataLastUpdatedDateTime property
     * @param value Value to set for the dataLastUpdatedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDataLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dataLastUpdatedDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
