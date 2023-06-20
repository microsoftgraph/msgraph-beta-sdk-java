package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Property implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The aliases property */
    private java.util.List<String> aliases;
    /** The isQueryable property */
    private Boolean isQueryable;
    /** The isRefinable property */
    private Boolean isRefinable;
    /** The isRetrievable property */
    private Boolean isRetrievable;
    /** The isSearchable property */
    private Boolean isSearchable;
    /** The labels property */
    private java.util.List<Label> labels;
    /** The name property */
    private String name;
    /** The OdataType property */
    private String odataType;
    /** The type property */
    private PropertyType type;
    /**
     * Instantiates a new Property and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Property() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Property
     */
    @javax.annotation.Nonnull
    public static Property createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Property();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the aliases property value. The aliases property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAliases() {
        return this.aliases;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("aliases", (n) -> { this.setAliases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isQueryable", (n) -> { this.setIsQueryable(n.getBooleanValue()); });
        deserializerMap.put("isRefinable", (n) -> { this.setIsRefinable(n.getBooleanValue()); });
        deserializerMap.put("isRetrievable", (n) -> { this.setIsRetrievable(n.getBooleanValue()); });
        deserializerMap.put("isSearchable", (n) -> { this.setIsSearchable(n.getBooleanValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfEnumValues(Label.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PropertyType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isQueryable property value. The isQueryable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsQueryable() {
        return this.isQueryable;
    }
    /**
     * Gets the isRefinable property value. The isRefinable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRefinable() {
        return this.isRefinable;
    }
    /**
     * Gets the isRetrievable property value. The isRetrievable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRetrievable() {
        return this.isRetrievable;
    }
    /**
     * Gets the isSearchable property value. The isSearchable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a label
     */
    @javax.annotation.Nullable
    public java.util.List<Label> getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. The type property
     * @return a PropertyType
     */
    @javax.annotation.Nullable
    public PropertyType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("aliases", this.getAliases());
        writer.writeBooleanValue("isQueryable", this.getIsQueryable());
        writer.writeBooleanValue("isRefinable", this.getIsRefinable());
        writer.writeBooleanValue("isRetrievable", this.getIsRetrievable());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeCollectionOfEnumValues("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the aliases property value. The aliases property
     * @param value Value to set for the aliases property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAliases(@javax.annotation.Nullable final java.util.List<String> value) {
        this.aliases = value;
    }
    /**
     * Sets the isQueryable property value. The isQueryable property
     * @param value Value to set for the isQueryable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsQueryable(@javax.annotation.Nullable final Boolean value) {
        this.isQueryable = value;
    }
    /**
     * Sets the isRefinable property value. The isRefinable property
     * @param value Value to set for the isRefinable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRefinable(@javax.annotation.Nullable final Boolean value) {
        this.isRefinable = value;
    }
    /**
     * Sets the isRetrievable property value. The isRetrievable property
     * @param value Value to set for the isRetrievable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRetrievable(@javax.annotation.Nullable final Boolean value) {
        this.isRetrievable = value;
    }
    /**
     * Sets the isSearchable property value. The isSearchable property
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSearchable(@javax.annotation.Nullable final Boolean value) {
        this.isSearchable = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabels(@javax.annotation.Nullable final java.util.List<Label> value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final PropertyType value) {
        this.type = value;
    }
}
