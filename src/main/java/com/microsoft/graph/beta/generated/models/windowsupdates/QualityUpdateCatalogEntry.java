package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QualityUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /**
     * Instantiates a new {@link QualityUpdateCatalogEntry} and sets the default values.
     */
    public QualityUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QualityUpdateCatalogEntry}
     */
    @jakarta.annotation.Nonnull
    public static QualityUpdateCatalogEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QualityUpdateCatalogEntry();
    }
    /**
     * Gets the catalogName property value. The catalog name of the content. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogName() {
        return this.backingStore.get("catalogName");
    }
    /**
     * Gets the cveSeverityInformation property value. Severity information of the Common Vulnerabilities and Exposures associated with the content.
     * @return a {@link QualityUpdateCveSeverityInformation}
     */
    @jakarta.annotation.Nullable
    public QualityUpdateCveSeverityInformation getCveSeverityInformation() {
        return this.backingStore.get("cveSeverityInformation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalogName", (n) -> { this.setCatalogName(n.getStringValue()); });
        deserializerMap.put("cveSeverityInformation", (n) -> { this.setCveSeverityInformation(n.getObjectValue(QualityUpdateCveSeverityInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("isExpeditable", (n) -> { this.setIsExpeditable(n.getBooleanValue()); });
        deserializerMap.put("productRevisions", (n) -> { this.setProductRevisions(n.getCollectionOfObjectValues(ProductRevision::createFromDiscriminatorValue)); });
        deserializerMap.put("qualityUpdateCadence", (n) -> { this.setQualityUpdateCadence(n.getEnumValue(QualityUpdateCadence::forValue)); });
        deserializerMap.put("qualityUpdateClassification", (n) -> { this.setQualityUpdateClassification(n.getEnumValue(QualityUpdateClassification::forValue)); });
        deserializerMap.put("shortName", (n) -> { this.setShortName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExpeditable property value. Indicates whether the content can be deployed as an expedited quality update. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExpeditable() {
        return this.backingStore.get("isExpeditable");
    }
    /**
     * Gets the productRevisions property value. The operating system product revisions that are released as part of this quality update.
     * @return a {@link java.util.List<ProductRevision>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProductRevision> getProductRevisions() {
        return this.backingStore.get("productRevisions");
    }
    /**
     * Gets the qualityUpdateCadence property value. The publishing cadence of the quality update. Possible values are: monthly, outOfBand, unknownFutureValue. Read-only.
     * @return a {@link QualityUpdateCadence}
     */
    @jakarta.annotation.Nullable
    public QualityUpdateCadence getQualityUpdateCadence() {
        return this.backingStore.get("qualityUpdateCadence");
    }
    /**
     * Gets the qualityUpdateClassification property value. The qualityUpdateClassification property
     * @return a {@link QualityUpdateClassification}
     */
    @jakarta.annotation.Nullable
    public QualityUpdateClassification getQualityUpdateClassification() {
        return this.backingStore.get("qualityUpdateClassification");
    }
    /**
     * Gets the shortName property value. The short name of the content. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShortName() {
        return this.backingStore.get("shortName");
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
     * Sets the catalogName property value. The catalog name of the content. Read-only.
     * @param value Value to set for the catalogName property.
     */
    public void setCatalogName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogName", value);
    }
    /**
     * Sets the cveSeverityInformation property value. Severity information of the Common Vulnerabilities and Exposures associated with the content.
     * @param value Value to set for the cveSeverityInformation property.
     */
    public void setCveSeverityInformation(@jakarta.annotation.Nullable final QualityUpdateCveSeverityInformation value) {
        this.backingStore.set("cveSeverityInformation", value);
    }
    /**
     * Sets the isExpeditable property value. Indicates whether the content can be deployed as an expedited quality update. Read-only.
     * @param value Value to set for the isExpeditable property.
     */
    public void setIsExpeditable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExpeditable", value);
    }
    /**
     * Sets the productRevisions property value. The operating system product revisions that are released as part of this quality update.
     * @param value Value to set for the productRevisions property.
     */
    public void setProductRevisions(@jakarta.annotation.Nullable final java.util.List<ProductRevision> value) {
        this.backingStore.set("productRevisions", value);
    }
    /**
     * Sets the qualityUpdateCadence property value. The publishing cadence of the quality update. Possible values are: monthly, outOfBand, unknownFutureValue. Read-only.
     * @param value Value to set for the qualityUpdateCadence property.
     */
    public void setQualityUpdateCadence(@jakarta.annotation.Nullable final QualityUpdateCadence value) {
        this.backingStore.set("qualityUpdateCadence", value);
    }
    /**
     * Sets the qualityUpdateClassification property value. The qualityUpdateClassification property
     * @param value Value to set for the qualityUpdateClassification property.
     */
    public void setQualityUpdateClassification(@jakarta.annotation.Nullable final QualityUpdateClassification value) {
        this.backingStore.set("qualityUpdateClassification", value);
    }
    /**
     * Sets the shortName property value. The short name of the content. Read-only.
     * @param value Value to set for the shortName property.
     */
    public void setShortName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("shortName", value);
    }
}
