package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcGalleryImage extends Entity implements Parsable {
    /**
     * The official display name of the gallery image. Read-only.
     */
    private String displayName;
    /**
     * The date in which this image is no longer within long-term support. The Cloud PC continues to provide short-term support. Read-only.
     */
    private LocalDate endDate;
    /**
     * The date when the image is no longer available. Read-only.
     */
    private LocalDate expirationDate;
    /**
     * The offer name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     */
    private String offer;
    /**
     * The official display offer name of the gallery image. For example, Windows 10 Enterprise + OS Optimizations. Read-only.
     */
    private String offerDisplayName;
    /**
     * The publisher name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     */
    private String publisher;
    /**
     * Recommended Cloud PC SKU for this gallery image. Read-only.
     */
    private String recommendedSku;
    /**
     * The size of this image in gigabytes. Read-only.
     */
    private Integer sizeInGB;
    /**
     * The SKU name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     */
    private String sku;
    /**
     * The official display stock keeping unit (SKU) name of this gallery image. For example, 2004. Read-only.
     */
    private String skuDisplayName;
    /**
     * The date when the image becomes available. Read-only.
     */
    private LocalDate startDate;
    /**
     * The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. Read-only.
     */
    private CloudPcGalleryImageStatus status;
    /**
     * Instantiates a new cloudPcGalleryImage and sets the default values.
     */
    public CloudPcGalleryImage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcGalleryImage
     */
    @jakarta.annotation.Nonnull
    public static CloudPcGalleryImage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcGalleryImage();
    }
    /**
     * Gets the displayName property value. The official display name of the gallery image. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDate property value. The date in which this image is no longer within long-term support. The Cloud PC continues to provide short-term support. Read-only.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.endDate;
    }
    /**
     * Gets the expirationDate property value. The date when the image is no longer available. Read-only.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getLocalDateValue()); });
        deserializerMap.put("offer", (n) -> { this.setOffer(n.getStringValue()); });
        deserializerMap.put("offerDisplayName", (n) -> { this.setOfferDisplayName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("recommendedSku", (n) -> { this.setRecommendedSku(n.getStringValue()); });
        deserializerMap.put("sizeInGB", (n) -> { this.setSizeInGB(n.getIntegerValue()); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        deserializerMap.put("skuDisplayName", (n) -> { this.setSkuDisplayName(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcGalleryImageStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the offer property value. The offer name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOffer() {
        return this.offer;
    }
    /**
     * Gets the offerDisplayName property value. The official display offer name of the gallery image. For example, Windows 10 Enterprise + OS Optimizations. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOfferDisplayName() {
        return this.offerDisplayName;
    }
    /**
     * Gets the publisher property value. The publisher name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the recommendedSku property value. Recommended Cloud PC SKU for this gallery image. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecommendedSku() {
        return this.recommendedSku;
    }
    /**
     * Gets the sizeInGB property value. The size of this image in gigabytes. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSizeInGB() {
        return this.sizeInGB;
    }
    /**
     * Gets the sku property value. The SKU name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSku() {
        return this.sku;
    }
    /**
     * Gets the skuDisplayName property value. The official display stock keeping unit (SKU) name of this gallery image. For example, 2004. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSkuDisplayName() {
        return this.skuDisplayName;
    }
    /**
     * Gets the startDate property value. The date when the image becomes available. Read-only.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.startDate;
    }
    /**
     * Gets the status property value. The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. Read-only.
     * @return a cloudPcGalleryImageStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcGalleryImageStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDate property value. The date in which this image is no longer within long-term support. The Cloud PC continues to provide short-term support. Read-only.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.endDate = value;
    }
    /**
     * Sets the expirationDate property value. The date when the image is no longer available. Read-only.
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.expirationDate = value;
    }
    /**
     * Sets the offer property value. The offer name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     * @param value Value to set for the offer property.
     */
    public void setOffer(@jakarta.annotation.Nullable final String value) {
        this.offer = value;
    }
    /**
     * Sets the offerDisplayName property value. The official display offer name of the gallery image. For example, Windows 10 Enterprise + OS Optimizations. Read-only.
     * @param value Value to set for the offerDisplayName property.
     */
    public void setOfferDisplayName(@jakarta.annotation.Nullable final String value) {
        this.offerDisplayName = value;
    }
    /**
     * Sets the publisher property value. The publisher name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the recommendedSku property value. Recommended Cloud PC SKU for this gallery image. Read-only.
     * @param value Value to set for the recommendedSku property.
     */
    public void setRecommendedSku(@jakarta.annotation.Nullable final String value) {
        this.recommendedSku = value;
    }
    /**
     * Sets the sizeInGB property value. The size of this image in gigabytes. Read-only.
     * @param value Value to set for the sizeInGB property.
     */
    public void setSizeInGB(@jakarta.annotation.Nullable final Integer value) {
        this.sizeInGB = value;
    }
    /**
     * Sets the sku property value. The SKU name of the gallery image. This value is passed to Azure to get the image resource. Read-only.
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.sku = value;
    }
    /**
     * Sets the skuDisplayName property value. The official display stock keeping unit (SKU) name of this gallery image. For example, 2004. Read-only.
     * @param value Value to set for the skuDisplayName property.
     */
    public void setSkuDisplayName(@jakarta.annotation.Nullable final String value) {
        this.skuDisplayName = value;
    }
    /**
     * Sets the startDate property value. The date when the image becomes available. Read-only.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.startDate = value;
    }
    /**
     * Sets the status property value. The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcGalleryImageStatus value) {
        this.status = value;
    }
}
