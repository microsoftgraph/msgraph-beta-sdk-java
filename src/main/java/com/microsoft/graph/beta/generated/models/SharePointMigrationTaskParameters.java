package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationTaskParameters implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SharePointMigrationTaskParameters} and sets the default values.
     */
    public SharePointMigrationTaskParameters() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationTaskParameters}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationTaskParameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.sharePointGroupMigrationTaskParameters": return new SharePointGroupMigrationTaskParameters();
                case "#microsoft.graph.sharePointSiteMigrationTaskParameters": return new SharePointSiteMigrationTaskParameters();
                case "#microsoft.graph.sharePointUserMigrationTaskParameters": return new SharePointUserMigrationTaskParameters();
            }
        }
        return new SharePointMigrationTaskParameters();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("preferredLatestStartDateTime", (n) -> { this.setPreferredLatestStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("preferredStartDateTime", (n) -> { this.setPreferredStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceSiteUrl", (n) -> { this.setSourceSiteUrl(n.getStringValue()); });
        deserializerMap.put("targetDataLocationCode", (n) -> { this.setTargetDataLocationCode(n.getStringValue()); });
        deserializerMap.put("targetOrganizationHost", (n) -> { this.setTargetOrganizationHost(n.getStringValue()); });
        deserializerMap.put("targetOrganizationId", (n) -> { this.setTargetOrganizationId(n.getUUIDValue()); });
        deserializerMap.put("targetSiteUrl", (n) -> { this.setTargetSiteUrl(n.getStringValue()); });
        deserializerMap.put("validateOnly", (n) -> { this.setValidateOnly(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the preferredLatestStartDateTime property value. The preferred latest start date and time. The system cancels the sharePointMigrationTask if it doesn&apos;t start by this time. The value must be greater than the preferredStartDateTime, if present. Optional. Only on OneDrive and SharePoint.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPreferredLatestStartDateTime() {
        return this.backingStore.get("preferredLatestStartDateTime");
    }
    /**
     * Gets the preferredStartDateTime property value. The preferred start date and time that allows the sharePointMigrationTask to start at a future time instead of as soon as possible (default). Optional. Only on OneDrive and SharePoint.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPreferredStartDateTime() {
        return this.backingStore.get("preferredStartDateTime");
    }
    /**
     * Gets the sourceSiteUrl property value. The SharePoint URL of the source site. Optional. Exactly one of sourceSiteId or sourceUrl must be specified. If both or neither are specified, it&apos;s an error. Only on OneDrive and SharePoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceSiteUrl() {
        return this.backingStore.get("sourceSiteUrl");
    }
    /**
     * Gets the targetDataLocationCode property value. In Microsoft Entra, this value represents the geographic location (for example, JPN, NAM) of the target organization where the resource must be migrated to ensure data residency and compliance. This property isn&apos;t required for single-geo target organizations or when the migration is to the default GEO of a multi-geo target organization. Optional. Only on OneDrive and SharePoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetDataLocationCode() {
        return this.backingStore.get("targetDataLocationCode");
    }
    /**
     * Gets the targetOrganizationHost property value. The root, admin, or my site host of the specific multi-geo instance of the target organization where the resource must be migrated to ensure data residency and compliance. This property isn&apos;t required for single-geo target organizations or when the migration is to the default GEO of a multi-geo target organization. Optional. Only on OneDrive and SharePoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetOrganizationHost() {
        return this.backingStore.get("targetOrganizationHost");
    }
    /**
     * Gets the targetOrganizationId property value. The unique Microsoft Entra company ID of the target organization to which the source resource must be migrated. Only on OneDrive and SharePoint.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getTargetOrganizationId() {
        return this.backingStore.get("targetOrganizationId");
    }
    /**
     * Gets the targetSiteUrl property value. The SharePoint URL of the target site. Only on OneDrive and SharePoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetSiteUrl() {
        return this.backingStore.get("targetSiteUrl");
    }
    /**
     * Gets the validateOnly property value. Indicates whether this task is an actual migration or only a validation. If the parameter is missing, the system treats it as false. The default behavior is a real migration. Optional. Only on OneDrive and SharePoint.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getValidateOnly() {
        return this.backingStore.get("validateOnly");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("preferredLatestStartDateTime", this.getPreferredLatestStartDateTime());
        writer.writeOffsetDateTimeValue("preferredStartDateTime", this.getPreferredStartDateTime());
        writer.writeStringValue("sourceSiteUrl", this.getSourceSiteUrl());
        writer.writeStringValue("targetDataLocationCode", this.getTargetDataLocationCode());
        writer.writeStringValue("targetOrganizationHost", this.getTargetOrganizationHost());
        writer.writeUUIDValue("targetOrganizationId", this.getTargetOrganizationId());
        writer.writeStringValue("targetSiteUrl", this.getTargetSiteUrl());
        writer.writeBooleanValue("validateOnly", this.getValidateOnly());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the preferredLatestStartDateTime property value. The preferred latest start date and time. The system cancels the sharePointMigrationTask if it doesn&apos;t start by this time. The value must be greater than the preferredStartDateTime, if present. Optional. Only on OneDrive and SharePoint.
     * @param value Value to set for the preferredLatestStartDateTime property.
     */
    public void setPreferredLatestStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("preferredLatestStartDateTime", value);
    }
    /**
     * Sets the preferredStartDateTime property value. The preferred start date and time that allows the sharePointMigrationTask to start at a future time instead of as soon as possible (default). Optional. Only on OneDrive and SharePoint.
     * @param value Value to set for the preferredStartDateTime property.
     */
    public void setPreferredStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("preferredStartDateTime", value);
    }
    /**
     * Sets the sourceSiteUrl property value. The SharePoint URL of the source site. Optional. Exactly one of sourceSiteId or sourceUrl must be specified. If both or neither are specified, it&apos;s an error. Only on OneDrive and SharePoint.
     * @param value Value to set for the sourceSiteUrl property.
     */
    public void setSourceSiteUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceSiteUrl", value);
    }
    /**
     * Sets the targetDataLocationCode property value. In Microsoft Entra, this value represents the geographic location (for example, JPN, NAM) of the target organization where the resource must be migrated to ensure data residency and compliance. This property isn&apos;t required for single-geo target organizations or when the migration is to the default GEO of a multi-geo target organization. Optional. Only on OneDrive and SharePoint.
     * @param value Value to set for the targetDataLocationCode property.
     */
    public void setTargetDataLocationCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetDataLocationCode", value);
    }
    /**
     * Sets the targetOrganizationHost property value. The root, admin, or my site host of the specific multi-geo instance of the target organization where the resource must be migrated to ensure data residency and compliance. This property isn&apos;t required for single-geo target organizations or when the migration is to the default GEO of a multi-geo target organization. Optional. Only on OneDrive and SharePoint.
     * @param value Value to set for the targetOrganizationHost property.
     */
    public void setTargetOrganizationHost(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetOrganizationHost", value);
    }
    /**
     * Sets the targetOrganizationId property value. The unique Microsoft Entra company ID of the target organization to which the source resource must be migrated. Only on OneDrive and SharePoint.
     * @param value Value to set for the targetOrganizationId property.
     */
    public void setTargetOrganizationId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("targetOrganizationId", value);
    }
    /**
     * Sets the targetSiteUrl property value. The SharePoint URL of the target site. Only on OneDrive and SharePoint.
     * @param value Value to set for the targetSiteUrl property.
     */
    public void setTargetSiteUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetSiteUrl", value);
    }
    /**
     * Sets the validateOnly property value. Indicates whether this task is an actual migration or only a validation. If the parameter is missing, the system treats it as false. The default behavior is a real migration. Optional. Only on OneDrive and SharePoint.
     * @param value Value to set for the validateOnly property.
     */
    public void setValidateOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("validateOnly", value);
    }
}
