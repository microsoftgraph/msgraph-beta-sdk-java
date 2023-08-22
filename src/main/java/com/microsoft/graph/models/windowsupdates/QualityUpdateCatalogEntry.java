package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QualityUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /**
     * The catalogName property
     */
    private String catalogName;
    /**
     * The cveSeverityInformation property
     */
    private QualityUpdateCveSeverityInformation cveSeverityInformation;
    /**
     * Indicates whether the content can be deployed as an expedited quality update. Read-only.
     */
    private Boolean isExpeditable;
    /**
     * The productRevisions property
     */
    private java.util.List<ProductRevision> productRevisions;
    /**
     * The qualityUpdateCadence property
     */
    private QualityUpdateCadence qualityUpdateCadence;
    /**
     * The qualityUpdateClassification property
     */
    private QualityUpdateClassification qualityUpdateClassification;
    /**
     * The shortName property
     */
    private String shortName;
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
     * Gets the catalogName property value. The catalogName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCatalogName() {
        return this.catalogName;
    }
    /**
     * Gets the cveSeverityInformation property value. The cveSeverityInformation property
     * @return a qualityUpdateCveSeverityInformation
     */
    @jakarta.annotation.Nullable
    public QualityUpdateCveSeverityInformation getCveSeverityInformation() {
        return this.cveSeverityInformation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalogName", (n) -> { this.setCatalogName(n.getStringValue()); });
        deserializerMap.put("cveSeverityInformation", (n) -> { this.setCveSeverityInformation(n.getObjectValue(QualityUpdateCveSeverityInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("isExpeditable", (n) -> { this.setIsExpeditable(n.getBooleanValue()); });
        deserializerMap.put("productRevisions", (n) -> { this.setProductRevisions(n.getCollectionOfObjectValues(ProductRevision::createFromDiscriminatorValue)); });
        deserializerMap.put("qualityUpdateCadence", (n) -> { this.setQualityUpdateCadence(n.getEnumValue(QualityUpdateCadence.class)); });
        deserializerMap.put("qualityUpdateClassification", (n) -> { this.setQualityUpdateClassification(n.getEnumValue(QualityUpdateClassification.class)); });
        deserializerMap.put("shortName", (n) -> { this.setShortName(n.getStringValue()); });
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
     * Gets the productRevisions property value. The productRevisions property
     * @return a productRevision
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProductRevision> getProductRevisions() {
        return this.productRevisions;
    }
    /**
     * Gets the qualityUpdateCadence property value. The qualityUpdateCadence property
     * @return a qualityUpdateCadence
     */
    @jakarta.annotation.Nullable
    public QualityUpdateCadence getQualityUpdateCadence() {
        return this.qualityUpdateCadence;
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
     * Gets the shortName property value. The shortName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getShortName() {
        return this.shortName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("catalogName", this.getCatalogName());
        writer.writeObjectValue("cveSeverityInformation", this.getCveSeverityInformation());
        writer.writeBooleanValue("isExpeditable", this.getIsExpeditable());
        writer.writeCollectionOfObjectValues("productRevisions", this.getProductRevisions());
        writer.writeEnumValue("qualityUpdateCadence", this.getQualityUpdateCadence());
        writer.writeEnumValue("qualityUpdateClassification", this.getQualityUpdateClassification());
        writer.writeStringValue("shortName", this.getShortName());
    }
    /**
     * Sets the catalogName property value. The catalogName property
     * @param value Value to set for the catalogName property.
     */
    public void setCatalogName(@jakarta.annotation.Nullable final String value) {
        this.catalogName = value;
    }
    /**
     * Sets the cveSeverityInformation property value. The cveSeverityInformation property
     * @param value Value to set for the cveSeverityInformation property.
     */
    public void setCveSeverityInformation(@jakarta.annotation.Nullable final QualityUpdateCveSeverityInformation value) {
        this.cveSeverityInformation = value;
    }
    /**
     * Sets the isExpeditable property value. Indicates whether the content can be deployed as an expedited quality update. Read-only.
     * @param value Value to set for the isExpeditable property.
     */
    public void setIsExpeditable(@jakarta.annotation.Nullable final Boolean value) {
        this.isExpeditable = value;
    }
    /**
     * Sets the productRevisions property value. The productRevisions property
     * @param value Value to set for the productRevisions property.
     */
    public void setProductRevisions(@jakarta.annotation.Nullable final java.util.List<ProductRevision> value) {
        this.productRevisions = value;
    }
    /**
     * Sets the qualityUpdateCadence property value. The qualityUpdateCadence property
     * @param value Value to set for the qualityUpdateCadence property.
     */
    public void setQualityUpdateCadence(@jakarta.annotation.Nullable final QualityUpdateCadence value) {
        this.qualityUpdateCadence = value;
    }
    /**
     * Sets the qualityUpdateClassification property value. The qualityUpdateClassification property
     * @param value Value to set for the qualityUpdateClassification property.
     */
    public void setQualityUpdateClassification(@jakarta.annotation.Nullable final QualityUpdateClassification value) {
        this.qualityUpdateClassification = value;
    }
    /**
     * Sets the shortName property value. The shortName property
     * @param value Value to set for the shortName property.
     */
    public void setShortName(@jakarta.annotation.Nullable final String value) {
        this.shortName = value;
    }
}
