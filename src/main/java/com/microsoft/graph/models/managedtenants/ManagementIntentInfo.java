package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementIntentInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The display name for the management intent. Optional. Read-only.
     */
    private String managementIntentDisplayName;
    /**
     * The identifier for the management intent. Required. Read-only.
     */
    private String managementIntentId;
    /**
     * The collection of management template information associated with the management intent. Optional. Read-only.
     */
    private java.util.List<ManagementTemplateDetailedInfo> managementTemplates;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new managementIntentInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementIntentInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementIntentInfo
     */
    @javax.annotation.Nonnull
    public static ManagementIntentInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementIntentInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("managementIntentDisplayName", (n) -> { this.setManagementIntentDisplayName(n.getStringValue()); });
        deserializerMap.put("managementIntentId", (n) -> { this.setManagementIntentId(n.getStringValue()); });
        deserializerMap.put("managementTemplates", (n) -> { this.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplateDetailedInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managementIntentDisplayName property value. The display name for the management intent. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementIntentDisplayName() {
        return this.managementIntentDisplayName;
    }
    /**
     * Gets the managementIntentId property value. The identifier for the management intent. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementIntentId() {
        return this.managementIntentId;
    }
    /**
     * Gets the managementTemplates property value. The collection of management template information associated with the management intent. Optional. Read-only.
     * @return a managementTemplateDetailedInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateDetailedInfo> getManagementTemplates() {
        return this.managementTemplates;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("managementIntentDisplayName", this.getManagementIntentDisplayName());
        writer.writeStringValue("managementIntentId", this.getManagementIntentId());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the managementIntentDisplayName property value. The display name for the management intent. Optional. Read-only.
     * @param value Value to set for the managementIntentDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementIntentDisplayName(@javax.annotation.Nullable final String value) {
        this.managementIntentDisplayName = value;
    }
    /**
     * Sets the managementIntentId property value. The identifier for the management intent. Required. Read-only.
     * @param value Value to set for the managementIntentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementIntentId(@javax.annotation.Nullable final String value) {
        this.managementIntentId = value;
    }
    /**
     * Sets the managementTemplates property value. The collection of management template information associated with the management intent. Optional. Read-only.
     * @param value Value to set for the managementTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplates(@javax.annotation.Nullable final java.util.List<ManagementTemplateDetailedInfo> value) {
        this.managementTemplates = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
