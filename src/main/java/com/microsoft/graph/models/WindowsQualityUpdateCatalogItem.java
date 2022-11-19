package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsQualityUpdateCatalogItem extends WindowsUpdateCatalogItem implements Parsable {
    /** Windows quality update classification */
    private WindowsQualityUpdateClassification _classification;
    /** Flag indicating if update qualifies for expedite */
    private Boolean _isExpeditable;
    /** Knowledge base article id */
    private String _kbArticleId;
    /**
     * Instantiates a new WindowsQualityUpdateCatalogItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsQualityUpdateCatalogItem() {
        super();
        this.setOdataType("#microsoft.graph.windowsQualityUpdateCatalogItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsQualityUpdateCatalogItem
     */
    @javax.annotation.Nonnull
    public static WindowsQualityUpdateCatalogItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateCatalogItem();
    }
    /**
     * Gets the classification property value. Windows quality update classification
     * @return a windowsQualityUpdateClassification
     */
    @javax.annotation.Nullable
    public WindowsQualityUpdateClassification getClassification() {
        return this._classification;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsQualityUpdateCatalogItem currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classification", (n) -> { currentObject.setClassification(n.getEnumValue(WindowsQualityUpdateClassification.class)); });
        deserializerMap.put("isExpeditable", (n) -> { currentObject.setIsExpeditable(n.getBooleanValue()); });
        deserializerMap.put("kbArticleId", (n) -> { currentObject.setKbArticleId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExpeditable property value. Flag indicating if update qualifies for expedite
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExpeditable() {
        return this._isExpeditable;
    }
    /**
     * Gets the kbArticleId property value. Knowledge base article id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKbArticleId() {
        return this._kbArticleId;
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
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeBooleanValue("isExpeditable", this.getIsExpeditable());
        writer.writeStringValue("kbArticleId", this.getKbArticleId());
    }
    /**
     * Sets the classification property value. Windows quality update classification
     * @param value Value to set for the classification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassification(@javax.annotation.Nullable final WindowsQualityUpdateClassification value) {
        this._classification = value;
    }
    /**
     * Sets the isExpeditable property value. Flag indicating if update qualifies for expedite
     * @param value Value to set for the isExpeditable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExpeditable(@javax.annotation.Nullable final Boolean value) {
        this._isExpeditable = value;
    }
    /**
     * Sets the kbArticleId property value. Knowledge base article id
     * @param value Value to set for the kbArticleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKbArticleId(@javax.annotation.Nullable final String value) {
        this._kbArticleId = value;
    }
}
