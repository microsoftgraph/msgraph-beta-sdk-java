package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.microsoftgraphsecurityexportresult;

import com.microsoft.graph.models.security.AdditionalOptions;
import com.microsoft.graph.models.security.ExportCriteria;
import com.microsoft.graph.models.security.ExportFormat;
import com.microsoft.graph.models.security.ExportLocation;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportResultPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ExportResultPostRequestBody and sets the default values.
     */
    public ExportResultPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExportResultPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ExportResultPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportResultPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the additionalOptions property value. The additionalOptions property
     * @return a EnumSet<AdditionalOptions>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalOptions> getAdditionalOptions() {
        return this.BackingStore.get("additionalOptions");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the exportCriteria property value. The exportCriteria property
     * @return a EnumSet<ExportCriteria>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportCriteria> getExportCriteria() {
        return this.BackingStore.get("exportCriteria");
    }
    /**
     * Gets the exportFormat property value. The exportFormat property
     * @return a ExportFormat
     */
    @jakarta.annotation.Nullable
    public ExportFormat getExportFormat() {
        return this.BackingStore.get("exportFormat");
    }
    /**
     * Gets the exportLocation property value. The exportLocation property
     * @return a EnumSet<ExportLocation>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportLocation> getExportLocation() {
        return this.BackingStore.get("exportLocation");
    }
    /**
     * Gets the exportSingleItems property value. The exportSingleItems property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExportSingleItems() {
        return this.BackingStore.get("exportSingleItems");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("additionalOptions", (n) -> { this.setAdditionalOptions(n.getEnumSetValue(AdditionalOptions.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exportCriteria", (n) -> { this.setExportCriteria(n.getEnumSetValue(ExportCriteria.class)); });
        deserializerMap.put("exportFormat", (n) -> { this.setExportFormat(n.getEnumValue(ExportFormat.class)); });
        deserializerMap.put("exportLocation", (n) -> { this.setExportLocation(n.getEnumSetValue(ExportLocation.class)); });
        deserializerMap.put("exportSingleItems", (n) -> { this.setExportSingleItems(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("additionalOptions", this.getAdditionalOptions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumSetValue("exportCriteria", this.getExportCriteria());
        writer.writeEnumValue("exportFormat", this.getExportFormat());
        writer.writeEnumSetValue("exportLocation", this.getExportLocation());
        writer.writeBooleanValue("exportSingleItems", this.getExportSingleItems());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the additionalOptions property value. The additionalOptions property
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalOptions> value) {
        this.BackingStore.set("additionalOptions", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the exportCriteria property value. The exportCriteria property
     * @param value Value to set for the exportCriteria property.
     */
    public void setExportCriteria(@jakarta.annotation.Nullable final EnumSet<ExportCriteria> value) {
        this.BackingStore.set("exportCriteria", value);
    }
    /**
     * Sets the exportFormat property value. The exportFormat property
     * @param value Value to set for the exportFormat property.
     */
    public void setExportFormat(@jakarta.annotation.Nullable final ExportFormat value) {
        this.BackingStore.set("exportFormat", value);
    }
    /**
     * Sets the exportLocation property value. The exportLocation property
     * @param value Value to set for the exportLocation property.
     */
    public void setExportLocation(@jakarta.annotation.Nullable final EnumSet<ExportLocation> value) {
        this.BackingStore.set("exportLocation", value);
    }
    /**
     * Sets the exportSingleItems property value. The exportSingleItems property
     * @param value Value to set for the exportSingleItems property.
     */
    public void setExportSingleItems(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("exportSingleItems", value);
    }
}
