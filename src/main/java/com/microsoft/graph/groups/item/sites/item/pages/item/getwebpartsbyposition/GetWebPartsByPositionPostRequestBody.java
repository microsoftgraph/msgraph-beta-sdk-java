package com.microsoft.graph.groups.item.sites.item.pages.item.getwebpartsbyposition;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetWebPartsByPositionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The columnId property */
    private Double columnId;
    /** The horizontalSectionId property */
    private Double horizontalSectionId;
    /** The isInVerticalSection property */
    private Boolean isInVerticalSection;
    /** The webPartIndex property */
    private Double webPartIndex;
    /**
     * Instantiates a new getWebPartsByPositionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetWebPartsByPositionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getWebPartsByPositionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetWebPartsByPositionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetWebPartsByPositionPostRequestBody();
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
     * Gets the columnId property value. The columnId property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("columnId", (n) -> { this.setColumnId(n.getDoubleValue()); });
        deserializerMap.put("horizontalSectionId", (n) -> { this.setHorizontalSectionId(n.getDoubleValue()); });
        deserializerMap.put("isInVerticalSection", (n) -> { this.setIsInVerticalSection(n.getBooleanValue()); });
        deserializerMap.put("webPartIndex", (n) -> { this.setWebPartIndex(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the horizontalSectionId property value. The horizontalSectionId property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getHorizontalSectionId() {
        return this.horizontalSectionId;
    }
    /**
     * Gets the isInVerticalSection property value. The isInVerticalSection property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInVerticalSection() {
        return this.isInVerticalSection;
    }
    /**
     * Gets the webPartIndex property value. The webPartIndex property
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
     * Sets the columnId property value. The columnId property
     * @param value Value to set for the columnId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnId(@javax.annotation.Nullable final Double value) {
        this.columnId = value;
    }
    /**
     * Sets the horizontalSectionId property value. The horizontalSectionId property
     * @param value Value to set for the horizontalSectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHorizontalSectionId(@javax.annotation.Nullable final Double value) {
        this.horizontalSectionId = value;
    }
    /**
     * Sets the isInVerticalSection property value. The isInVerticalSection property
     * @param value Value to set for the isInVerticalSection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsInVerticalSection(@javax.annotation.Nullable final Boolean value) {
        this.isInVerticalSection = value;
    }
    /**
     * Sets the webPartIndex property value. The webPartIndex property
     * @param value Value to set for the webPartIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebPartIndex(@javax.annotation.Nullable final Double value) {
        this.webPartIndex = value;
    }
}
