package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementTemplateDetailedInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category property
     */
    private ManagementCategory category;
    /**
     * The display name for the management template. Required. Read-only.
     */
    private String displayName;
    /**
     * The unique identifier for the management template. Required. Read-only.
     */
    private String managementTemplateId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The version property
     */
    private Integer version;
    /**
     * Instantiates a new managementTemplateDetailedInfo and sets the default values.
     */
    public ManagementTemplateDetailedInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateDetailedInfo
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplateDetailedInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateDetailedInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the category property value. The category property
     * @return a managementCategory
     */
    @jakarta.annotation.Nullable
    public ManagementCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the displayName property value. The display name for the management template. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ManagementCategory.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("managementTemplateId", (n) -> { this.setManagementTemplateId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managementTemplateId property value. The unique identifier for the management template. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateId() {
        return this.managementTemplateId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the version property value. The version property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final ManagementCategory value) {
        this.category = value;
    }
    /**
     * Sets the displayName property value. The display name for the management template. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the managementTemplateId property value. The unique identifier for the management template. Required. Read-only.
     * @param value Value to set for the managementTemplateId property.
     */
    public void setManagementTemplateId(@jakarta.annotation.Nullable final String value) {
        this.managementTemplateId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
