package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcGalleryImage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcGalleryImage} and sets the default values.
     */
    public CloudPcGalleryImage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcGalleryImage}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcGalleryImage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcGalleryImage();
    }
    /**
     * Gets the displayName property value. The display name of this gallery image. For example, Windows 11 Enterprise + Microsoft 365 Apps 22H2. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the endDate property value. The date when the status of image becomes supportedWithWarning. Users can still provision new Cloud PCs if the current time is later than endDate and earlier than expirationDate. For example, assume the endDate of a gallery image is 2023-9-14 and expirationDate is 2024-3-14, users are able to provision new Cloud PCs if today is 2023-10-01. Read-only.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.backingStore.get("endDate");
    }
    /**
     * Gets the expirationDate property value. The date when the image is no longer available. Users are unable to provision new Cloud PCs if the current time is later than expirationDate. The value is usually endDate plus six months. For example, if the startDate is 2025-10-14, the expirationDate is usually 2026-04-14. Read-only.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this.backingStore.get("expirationDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getLocalDateValue()); });
        deserializerMap.put("offer", (n) -> { this.setOffer(n.getStringValue()); });
        deserializerMap.put("offerDisplayName", (n) -> { this.setOfferDisplayName(n.getStringValue()); });
        deserializerMap.put("offerName", (n) -> { this.setOfferName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        deserializerMap.put("recommendedSku", (n) -> { this.setRecommendedSku(n.getStringValue()); });
        deserializerMap.put("sizeInGB", (n) -> { this.setSizeInGB(n.getIntegerValue()); });
        deserializerMap.put("sku", (n) -> { this.setSku(n.getStringValue()); });
        deserializerMap.put("skuDisplayName", (n) -> { this.setSkuDisplayName(n.getStringValue()); });
        deserializerMap.put("skuName", (n) -> { this.setSkuName(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcGalleryImageStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the offer property value. The offer name of this gallery image that is passed to ARM to retrieve the image resource. Read-only. The offer property is deprecated and will stop returning data on January 31, 2024. Going forward, use the offerName property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOffer() {
        return this.backingStore.get("offer");
    }
    /**
     * Gets the offerDisplayName property value. The official display offer name of this gallery image. For example, Windows 10 Enterprise + OS Optimizations. The offerDisplayName property is deprecated and will stop returning data on January 31, 2024.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferDisplayName() {
        return this.backingStore.get("offerDisplayName");
    }
    /**
     * Gets the offerName property value. The offer name of this gallery image that is passed to ARM to retrieve the image resource. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferName() {
        return this.backingStore.get("offerName");
    }
    /**
     * Gets the publisher property value. The publisher name of this gallery image that is passed to ARM to retrieve the image resource. Read-only. The publisher property is deprecated and will stop returning data on January 31, 2024. Going forward, use the publisherName property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the publisherName property value. The publisher name of this gallery image that is passed to ARM to retrieve the image resource. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.backingStore.get("publisherName");
    }
    /**
     * Gets the recommendedSku property value. The recommended Cloud PC SKU for this gallery image. Read-only. The recommendedSku property is deprecated and will stop returning data on January 31, 2024.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecommendedSku() {
        return this.backingStore.get("recommendedSku");
    }
    /**
     * Gets the sizeInGB property value. Indicates the size of this image in gigabytes. For example, 64. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSizeInGB() {
        return this.backingStore.get("sizeInGB");
    }
    /**
     * Gets the sku property value. The SKU name of this image that is passed to ARM to retrieve the image resource. Read-only. The sku property is deprecated and will stop returning data on January 31, 2024. Going forward, use the skuName property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSku() {
        return this.backingStore.get("sku");
    }
    /**
     * Gets the skuDisplayName property value. The official display SKU name of this gallery image. For example, 2004. Read-only. The skuDisplayName property is deprecated and will stop returning data on January 31, 2024.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkuDisplayName() {
        return this.backingStore.get("skuDisplayName");
    }
    /**
     * Gets the skuName property value. The SKU name of this image that is passed to ARM to retrieve the image resource. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkuName() {
        return this.backingStore.get("skuName");
    }
    /**
     * Gets the startDate property value. The date when the Cloud PC image is available for provisioning new Cloud PCs. For example, 2022-09-20. Read-only.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.backingStore.get("startDate");
    }
    /**
     * Gets the status property value. The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. The default value is supported. Read-only.
     * @return a {@link CloudPcGalleryImageStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcGalleryImageStatus getStatus() {
        return this.backingStore.get("status");
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
        writer.writeStringValue("offerName", this.getOfferName());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeStringValue("recommendedSku", this.getRecommendedSku());
        writer.writeIntegerValue("sizeInGB", this.getSizeInGB());
        writer.writeStringValue("sku", this.getSku());
        writer.writeStringValue("skuDisplayName", this.getSkuDisplayName());
        writer.writeStringValue("skuName", this.getSkuName());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the displayName property value. The display name of this gallery image. For example, Windows 11 Enterprise + Microsoft 365 Apps 22H2. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the endDate property value. The date when the status of image becomes supportedWithWarning. Users can still provision new Cloud PCs if the current time is later than endDate and earlier than expirationDate. For example, assume the endDate of a gallery image is 2023-9-14 and expirationDate is 2024-3-14, users are able to provision new Cloud PCs if today is 2023-10-01. Read-only.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("endDate", value);
    }
    /**
     * Sets the expirationDate property value. The date when the image is no longer available. Users are unable to provision new Cloud PCs if the current time is later than expirationDate. The value is usually endDate plus six months. For example, if the startDate is 2025-10-14, the expirationDate is usually 2026-04-14. Read-only.
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("expirationDate", value);
    }
    /**
     * Sets the offer property value. The offer name of this gallery image that is passed to ARM to retrieve the image resource. Read-only. The offer property is deprecated and will stop returning data on January 31, 2024. Going forward, use the offerName property.
     * @param value Value to set for the offer property.
     */
    public void setOffer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("offer", value);
    }
    /**
     * Sets the offerDisplayName property value. The official display offer name of this gallery image. For example, Windows 10 Enterprise + OS Optimizations. The offerDisplayName property is deprecated and will stop returning data on January 31, 2024.
     * @param value Value to set for the offerDisplayName property.
     */
    public void setOfferDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("offerDisplayName", value);
    }
    /**
     * Sets the offerName property value. The offer name of this gallery image that is passed to ARM to retrieve the image resource. Read-only.
     * @param value Value to set for the offerName property.
     */
    public void setOfferName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("offerName", value);
    }
    /**
     * Sets the publisher property value. The publisher name of this gallery image that is passed to ARM to retrieve the image resource. Read-only. The publisher property is deprecated and will stop returning data on January 31, 2024. Going forward, use the publisherName property.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the publisherName property value. The publisher name of this gallery image that is passed to ARM to retrieve the image resource. Read-only.
     * @param value Value to set for the publisherName property.
     */
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisherName", value);
    }
    /**
     * Sets the recommendedSku property value. The recommended Cloud PC SKU for this gallery image. Read-only. The recommendedSku property is deprecated and will stop returning data on January 31, 2024.
     * @param value Value to set for the recommendedSku property.
     */
    public void setRecommendedSku(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendedSku", value);
    }
    /**
     * Sets the sizeInGB property value. Indicates the size of this image in gigabytes. For example, 64. Read-only.
     * @param value Value to set for the sizeInGB property.
     */
    public void setSizeInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sizeInGB", value);
    }
    /**
     * Sets the sku property value. The SKU name of this image that is passed to ARM to retrieve the image resource. Read-only. The sku property is deprecated and will stop returning data on January 31, 2024. Going forward, use the skuName property.
     * @param value Value to set for the sku property.
     */
    public void setSku(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sku", value);
    }
    /**
     * Sets the skuDisplayName property value. The official display SKU name of this gallery image. For example, 2004. Read-only. The skuDisplayName property is deprecated and will stop returning data on January 31, 2024.
     * @param value Value to set for the skuDisplayName property.
     */
    public void setSkuDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skuDisplayName", value);
    }
    /**
     * Sets the skuName property value. The SKU name of this image that is passed to ARM to retrieve the image resource. Read-only.
     * @param value Value to set for the skuName property.
     */
    public void setSkuName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skuName", value);
    }
    /**
     * Sets the startDate property value. The date when the Cloud PC image is available for provisioning new Cloud PCs. For example, 2022-09-20. Read-only.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("startDate", value);
    }
    /**
     * Sets the status property value. The status of the gallery image on the Cloud PC. Possible values are: supported, supportedWithWarning, notSupported, unknownFutureValue. The default value is supported. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcGalleryImageStatus value) {
        this.backingStore.set("status", value);
    }
}
