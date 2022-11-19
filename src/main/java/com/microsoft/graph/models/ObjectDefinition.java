package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ObjectDefinition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The attributes property */
    private java.util.List<AttributeDefinition> _attributes;
    /** The metadata property */
    private java.util.List<MetadataEntry> _metadata;
    /** The name property */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The supportedApis property */
    private java.util.List<String> _supportedApis;
    /**
     * Instantiates a new objectDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ObjectDefinition() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.objectDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a objectDefinition
     */
    @javax.annotation.Nonnull
    public static ObjectDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectDefinition();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the attributes property value. The attributes property
     * @return a attributeDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<AttributeDefinition> getAttributes() {
        return this._attributes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ObjectDefinition currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("attributes", (n) -> { currentObject.setAttributes(n.getCollectionOfObjectValues(AttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { currentObject.setMetadata(n.getCollectionOfObjectValues(MetadataEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("supportedApis", (n) -> { currentObject.setSupportedApis(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a metadataEntry
     */
    @javax.annotation.Nullable
    public java.util.List<MetadataEntry> getMetadata() {
        return this._metadata;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the supportedApis property value. The supportedApis property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedApis() {
        return this._supportedApis;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attributes", this.getAttributes());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("supportedApis", this.getSupportedApis());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attributes property value. The attributes property
     * @param value Value to set for the attributes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttributes(@javax.annotation.Nullable final java.util.List<AttributeDefinition> value) {
        this._attributes = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final java.util.List<MetadataEntry> value) {
        this._metadata = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the supportedApis property value. The supportedApis property
     * @param value Value to set for the supportedApis property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedApis(@javax.annotation.Nullable final java.util.List<String> value) {
        this._supportedApis = value;
    }
}
