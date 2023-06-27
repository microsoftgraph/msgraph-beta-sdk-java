package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class QualityUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /**
     * Indicates whether the content can be deployed as an expedited quality update. Read-only.
     */
    private Boolean isExpeditable;
    /**
     * The qualityUpdateClassification property
     */
    private QualityUpdateClassification qualityUpdateClassification;
    /**
     * Instantiates a new QualityUpdateCatalogEntry and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public QualityUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a QualityUpdateCatalogEntry
     */
    @javax.annotation.Nonnull
    public static QualityUpdateCatalogEntry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QualityUpdateCatalogEntry();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isExpeditable", (n) -> { this.setIsExpeditable(n.getBooleanValue()); });
        deserializerMap.put("qualityUpdateClassification", (n) -> { this.setQualityUpdateClassification(n.getEnumValue(QualityUpdateClassification.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isExpeditable property value. Indicates whether the content can be deployed as an expedited quality update. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExpeditable() {
        return this.isExpeditable;
    }
    /**
     * Gets the qualityUpdateClassification property value. The qualityUpdateClassification property
     * @return a QualityUpdateClassification
     */
    @javax.annotation.Nullable
    public QualityUpdateClassification getQualityUpdateClassification() {
        return this.qualityUpdateClassification;
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
        writer.writeBooleanValue("isExpeditable", this.getIsExpeditable());
        writer.writeEnumValue("qualityUpdateClassification", this.getQualityUpdateClassification());
    }
    /**
     * Sets the isExpeditable property value. Indicates whether the content can be deployed as an expedited quality update. Read-only.
     * @param value Value to set for the isExpeditable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExpeditable(@javax.annotation.Nullable final Boolean value) {
        this.isExpeditable = value;
    }
    /**
     * Sets the qualityUpdateClassification property value. The qualityUpdateClassification property
     * @param value Value to set for the qualityUpdateClassification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQualityUpdateClassification(@javax.annotation.Nullable final QualityUpdateClassification value) {
        this.qualityUpdateClassification = value;
    }
}
