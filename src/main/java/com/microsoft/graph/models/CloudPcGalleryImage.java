package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcGalleryImage extends Entity implements Parsable {
    /** The official display name of the gallery image. Read-only. */
    private String _displayName;
    /** The date in which this image is no longer within long-term support. The Cloud PC will continue to provide short-term support. Read-only. */
    private LocalDate _endDate;
    /** The date when the image is no longer available. Read-only. */
    private LocalDate _expirationDate;
    /** The offer name of the gallery image. This value will be passed to Azure to get the image resource. Read-only. */
    private String _offer;
    /** The official display offer name of the gallery image. For example, Windows 10 Enterprise + OS Optimizations. Read-only. */
    private String _offerDisplayName;
    /** The publisher name of the gallery image. This value will be passed to Azure to get the image resource. Read-only. */
    private String _publisher;
    /** Recommended Cloud PC SKU for this gallery image. Read-only. */
    private String _recommendedSku;
    /** The size of this image in gigabytes. Read-only. */
    private Integer _sizeInGB;
    /** The SKU name of the gallery image. This value will be passed to Azure to get the image resource. Read-only. */
    private String _sku;
    /** The official display stock keeping unit (SKU) name of this gallery image. For example, 2004. Read-only. */
    private String _skuDisplayName;
    /** The date when the image becomes available. Read-only. */
    private LocalDate _startDate;
    /** The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. Read-only. */
    private CloudPcGalleryImageStatus _status;
    /**
     * Instantiates a new CloudPcGalleryImage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcGalleryImage() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcGalleryImage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcGalleryImage
     */
    @javax.annotation.Nonnull
    public static CloudPcGalleryImage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcGalleryImage();
    }
    /**
     * Gets the displayName property value. The official display name of the gallery image. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endDate property value. The date in which this image is no longer within long-term support. The Cloud PC will continue to provide short-term support. Read-only.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndDate() {
        return this._endDate;
    }
    /**
     * Gets the expirationDate property value. The date when the image is no longer available. Read-only.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this._expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcGalleryImage currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { currentObject.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("expirationDate", (n) -> { currentObject.setExpirationDate(n.getLocalDateValue()); });
        deserializerMap.put("offer", (n) -> { currentObject.setOffer(n.getStringValue()); });
        deserializerMap.put("offerDisplayName", (n) -> { currentObject.setOfferDisplayName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
        deserializerMap.put("recommendedSku", (n) -> { currentObject.setRecommendedSku(n.getStringValue()); });
        deserializerMap.put("sizeInGB", (n) -> { currentObject.setSizeInGB(n.getIntegerValue()); });
        deserializerMap.put("sku", (n) -> { currentObject.setSku(n.getStringValue()); });
        deserializerMap.put("skuDisplayName", (n) -> { currentObject.setSkuDisplayName(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { currentObject.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CloudPcGalleryImageStatus.class)); });
        return deserializerMap
    }
    /**
     * Gets the offer property value. The offer name of the gallery image. This value will be passed to Azure to get the image resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOffer() {
        return this._offer;
    }
    /**
     * Gets the offerDisplayName property value. The official display offer name of the gallery image. For example, Windows 10 Enterprise + OS Optimizations. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOfferDisplayName() {
        return this._offerDisplayName;
    }
    /**
     * Gets the publisher property value. The publisher name of the gallery image. This value will be passed to Azure to get the image resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the recommendedSku property value. Recommended Cloud PC SKU for this gallery image. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendedSku() {
        return this._recommendedSku;
    }
    /**
     * Gets the sizeInGB property value. The size of this image in gigabytes. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSizeInGB() {
        return this._sizeInGB;
    }
    /**
     * Gets the sku property value. The SKU name of the gallery image. This value will be passed to Azure to get the image resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSku() {
        return this._sku;
    }
    /**
     * Gets the skuDisplayName property value. The official display stock keeping unit (SKU) name of this gallery image. For example, 2004. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuDisplayName() {
        return this._skuDisplayName;
    }
    /**
     * Gets the startDate property value. The date when the image becomes available. Read-only.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartDate() {
        return this._startDate;
    }
    /**
     * Gets the status property value. The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. Read-only.
     * @return a cloudPcGalleryImageStatus
     */
    @javax.annotation.Nullable
    public CloudPcGalleryImageStatus getStatus() {
        return this._status;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeLocalDateValue("expirationDate", this.getExpirationDate());
        writer.writeStringValue("offer", this.getOffer());
        writer.writeStringValue("offerDisplayName", this.getOfferDisplayName());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeStringValue("recommendedSku", this.getRecommendedSku());
        writer.writeIntegerValue("sizeInGB", this.getSizeInGB());
        writer.writeStringValue("sku", this.getSku());
        writer.writeStringValue("skuDisplayName", this.getSkuDisplayName());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the displayName property value. The official display name of the gallery image. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endDate property value. The date in which this image is no longer within long-term support. The Cloud PC will continue to provide short-term support. Read-only.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDate(@javax.annotation.Nullable final LocalDate value) {
        this._endDate = value;
    }
    /**
     * Sets the expirationDate property value. The date when the image is no longer available. Read-only.
     * @param value Value to set for the expirationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDate(@javax.annotation.Nullable final LocalDate value) {
        this._expirationDate = value;
    }
    /**
     * Sets the offer property value. The offer name of the gallery image. This value will be passed to Azure to get the image resource. Read-only.
     * @param value Value to set for the offer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffer(@javax.annotation.Nullable final String value) {
        this._offer = value;
    }
    /**
     * Sets the offerDisplayName property value. The official display offer name of the gallery image. For example, Windows 10 Enterprise + OS Optimizations. Read-only.
     * @param value Value to set for the offerDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfferDisplayName(@javax.annotation.Nullable final String value) {
        this._offerDisplayName = value;
    }
    /**
     * Sets the publisher property value. The publisher name of the gallery image. This value will be passed to Azure to get the image resource. Read-only.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the recommendedSku property value. Recommended Cloud PC SKU for this gallery image. Read-only.
     * @param value Value to set for the recommendedSku property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendedSku(@javax.annotation.Nullable final String value) {
        this._recommendedSku = value;
    }
    /**
     * Sets the sizeInGB property value. The size of this image in gigabytes. Read-only.
     * @param value Value to set for the sizeInGB property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSizeInGB(@javax.annotation.Nullable final Integer value) {
        this._sizeInGB = value;
    }
    /**
     * Sets the sku property value. The SKU name of the gallery image. This value will be passed to Azure to get the image resource. Read-only.
     * @param value Value to set for the sku property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSku(@javax.annotation.Nullable final String value) {
        this._sku = value;
    }
    /**
     * Sets the skuDisplayName property value. The official display stock keeping unit (SKU) name of this gallery image. For example, 2004. Read-only.
     * @param value Value to set for the skuDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuDisplayName(@javax.annotation.Nullable final String value) {
        this._skuDisplayName = value;
    }
    /**
     * Sets the startDate property value. The date when the image becomes available. Read-only.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._startDate = value;
    }
    /**
     * Sets the status property value. The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final CloudPcGalleryImageStatus value) {
        this._status = value;
    }
}
