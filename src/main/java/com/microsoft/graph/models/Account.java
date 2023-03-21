package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Account extends Entity implements Parsable {
    /** The blocked property */
    private Boolean blocked;
    /** The category property */
    private String category;
    /** The displayName property */
    private String displayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The number property */
    private String number;
    /** The subCategory property */
    private String subCategory;
    /**
     * Instantiates a new Account and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Account() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Account
     */
    @javax.annotation.Nonnull
    public static Account createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Account();
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlocked() {
        return this.blocked;
    }
    /**
     * Gets the category property value. The category property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blocked", (n) -> { this.setBlocked(n.getBooleanValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("subCategory", (n) -> { this.setSubCategory(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the number property value. The number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the subCategory property value. The subCategory property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubCategory() {
        return this.subCategory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("blocked", this.getBlocked());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("subCategory", this.getSubCategory());
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlocked(@javax.annotation.Nullable final Boolean value) {
        this.blocked = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the subCategory property value. The subCategory property
     * @param value Value to set for the subCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubCategory(@javax.annotation.Nullable final String value) {
        this.subCategory = value;
    }
}
