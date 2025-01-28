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
/**
 * The operating system product revisions that are released as part of this quality update.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdateCatalogProductRevision implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsQualityUpdateCatalogProductRevision} and sets the default values.
     */
    public WindowsQualityUpdateCatalogProductRevision() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdateCatalogProductRevision}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdateCatalogProductRevision createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateCatalogProductRevision();
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
     * Gets the displayName property value. The display name of the windows quality update catalog product revision. For example, 'Windows 11, version 22H2, build 22621.4112'. Read-only
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("knowledgeBaseArticle", (n) -> { this.setKnowledgeBaseArticle(n.getObjectValue(WindowsQualityUpdateProductKnowledgeBaseArticle::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osBuild", (n) -> { this.setOsBuild(n.getObjectValue(WindowsQualityUpdateProductBuildVersionDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("versionName", (n) -> { this.setVersionName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the knowledgeBaseArticle property value. Represents a knowledge base (KB) article.
     * @return a {@link WindowsQualityUpdateProductKnowledgeBaseArticle}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdateProductKnowledgeBaseArticle getKnowledgeBaseArticle() {
        return this.backingStore.get("knowledgeBaseArticle");
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
     * Gets the osBuild property value. Represents the build version details of a product revision that is associated with a quality update.
     * @return a {@link WindowsQualityUpdateProductBuildVersionDetail}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdateProductBuildVersionDetail getOsBuild() {
        return this.backingStore.get("osBuild");
    }
    /**
     * Gets the productName property value. The product name of the windows quality update catalog product revision. For example, 'Windows 11'. Read-only
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.backingStore.get("productName");
    }
    /**
     * Gets the releaseDateTime property value. The date and time when the windows quality update catalog product revision was released. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. Read-only
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.backingStore.get("releaseDateTime");
    }
    /**
     * Gets the versionName property value. The version name of the windows quality update catalog product revision. For example, '22H2'. Read-only
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersionName() {
        return this.backingStore.get("versionName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("knowledgeBaseArticle", this.getKnowledgeBaseArticle());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("osBuild", this.getOsBuild());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
        writer.writeStringValue("versionName", this.getVersionName());
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
     * Sets the displayName property value. The display name of the windows quality update catalog product revision. For example, 'Windows 11, version 22H2, build 22621.4112'. Read-only
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the knowledgeBaseArticle property value. Represents a knowledge base (KB) article.
     * @param value Value to set for the knowledgeBaseArticle property.
     */
    public void setKnowledgeBaseArticle(@jakarta.annotation.Nullable final WindowsQualityUpdateProductKnowledgeBaseArticle value) {
        this.backingStore.set("knowledgeBaseArticle", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the osBuild property value. Represents the build version details of a product revision that is associated with a quality update.
     * @param value Value to set for the osBuild property.
     */
    public void setOsBuild(@jakarta.annotation.Nullable final WindowsQualityUpdateProductBuildVersionDetail value) {
        this.backingStore.set("osBuild", value);
    }
    /**
     * Sets the productName property value. The product name of the windows quality update catalog product revision. For example, 'Windows 11'. Read-only
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productName", value);
    }
    /**
     * Sets the releaseDateTime property value. The date and time when the windows quality update catalog product revision was released. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. Read-only
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("releaseDateTime", value);
    }
    /**
     * Sets the versionName property value. The version name of the windows quality update catalog product revision. For example, '22H2'. Read-only
     * @param value Value to set for the versionName property.
     */
    public void setVersionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionName", value);
    }
}
