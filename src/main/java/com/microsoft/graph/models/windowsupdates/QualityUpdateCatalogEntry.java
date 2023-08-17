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
     * Instantiates a new qualityUpdateCatalogEntry and sets the default values.
     */
    public QualityUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a qualityUpdateCatalogEntry
     */
    @jakarta.annotation.Nonnull
    public static QualityUpdateCatalogEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QualityUpdateCatalogEntry();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public Boolean getIsExpeditable() {
        return this.isExpeditable;
    }
    /**
     * Gets the qualityUpdateClassification property value. The qualityUpdateClassification property
     * @return a qualityUpdateClassification
     */
    @jakarta.annotation.Nullable
    public QualityUpdateClassification getQualityUpdateClassification() {
        return this.qualityUpdateClassification;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isExpeditable", this.getIsExpeditable());
        writer.writeEnumValue("qualityUpdateClassification", this.getQualityUpdateClassification());
    }
    /**
     * Sets the isExpeditable property value. Indicates whether the content can be deployed as an expedited quality update. Read-only.
     * @param value Value to set for the isExpeditable property.
     */
    public void setIsExpeditable(@jakarta.annotation.Nullable final Boolean value) {
        this.isExpeditable = value;
    }
    /**
     * Sets the qualityUpdateClassification property value. The qualityUpdateClassification property
     * @param value Value to set for the qualityUpdateClassification property.
     */
    public void setQualityUpdateClassification(@jakarta.annotation.Nullable final QualityUpdateClassification value) {
        this.qualityUpdateClassification = value;
    }
}
