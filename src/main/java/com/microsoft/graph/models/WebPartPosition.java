package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebPartPosition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Indicates the identifier of the column where the web part is located. */
    private Double columnId;
    /** Indicates the horizontal section where the web part is located. */
    private Double horizontalSectionId;
    /** Indicates whether the web part is located in the vertical section. */
    private Boolean isInVerticalSection;
    /** The OdataType property */
    private String odataType;
    /** Index of the current web part. Represents the order of the web part in this column or section. */
    private Double webPartIndex;
    /**
     * Instantiates a new webPartPosition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebPartPosition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a webPartPosition
     */
    @javax.annotation.Nonnull
    public static WebPartPosition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebPartPosition();
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
     * Gets the columnId property value. Indicates the identifier of the column where the web part is located.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getColumnId() {
        return this.columnId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("columnId", (n) -> { this.setColumnId(n.getDoubleValue()); });
        deserializerMap.put("horizontalSectionId", (n) -> { this.setHorizontalSectionId(n.getDoubleValue()); });
        deserializerMap.put("isInVerticalSection", (n) -> { this.setIsInVerticalSection(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("webPartIndex", (n) -> { this.setWebPartIndex(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the horizontalSectionId property value. Indicates the horizontal section where the web part is located.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getHorizontalSectionId() {
        return this.horizontalSectionId;
    }
    /**
     * Gets the isInVerticalSection property value. Indicates whether the web part is located in the vertical section.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInVerticalSection() {
        return this.isInVerticalSection;
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
     * Gets the webPartIndex property value. Index of the current web part. Represents the order of the web part in this column or section.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWebPartIndex() {
        return this.webPartIndex;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("columnId", this.getColumnId());
        writer.writeDoubleValue("horizontalSectionId", this.getHorizontalSectionId());
        writer.writeBooleanValue("isInVerticalSection", this.getIsInVerticalSection());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("webPartIndex", this.getWebPartIndex());
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
     * Sets the columnId property value. Indicates the identifier of the column where the web part is located.
     * @param value Value to set for the columnId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnId(@javax.annotation.Nullable final Double value) {
        this.columnId = value;
    }
    /**
     * Sets the horizontalSectionId property value. Indicates the horizontal section where the web part is located.
     * @param value Value to set for the horizontalSectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHorizontalSectionId(@javax.annotation.Nullable final Double value) {
        this.horizontalSectionId = value;
    }
    /**
     * Sets the isInVerticalSection property value. Indicates whether the web part is located in the vertical section.
     * @param value Value to set for the isInVerticalSection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsInVerticalSection(@javax.annotation.Nullable final Boolean value) {
        this.isInVerticalSection = value;
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
     * Sets the webPartIndex property value. Index of the current web part. Represents the order of the web part in this column or section.
     * @param value Value to set for the webPartIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebPartIndex(@javax.annotation.Nullable final Double value) {
        this.webPartIndex = value;
    }
}
